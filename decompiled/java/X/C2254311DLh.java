package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ttve.nativePort.TEImageFactory;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VEARCoreParam;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEEffectParams;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.VETouchPointer;
import com.ss.android.vesdk.algorithm.VEBaseAlgorithmParam;
import com.ss.android.vesdk.effect.IEffect;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.runtime.VERuntime;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: renamed from: X.1DLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2254311DLh implements IEffect, MessageCenter.Listener {
    public static final String LLJIJIL = C2254311DLh.class.getSimpleName();
    public static final Map<String, Class> LLJILJIL;
    public final InterfaceC2254431DLt LL;
    public MessageCenter.Listener LLILLJJLI;
    public List<InterfaceC2177991ALt> LLILLL;
    public final Map<Integer, Integer[]> LLILZ;
    public final Set<Integer> LLILZIL;
    public final Map<Integer, Pair<VEBaseAlgorithmParam, Integer>> LLILZLL;
    public Map<Integer, Pair<VEBaseFilterParam, Integer>> LLIZ;
    public int[] LLIZLLLIL;
    public List<C1AM5> LLJ;
    public int LLJI;

    @Override // com.ss.android.vesdk.effect.IEffect
    public final void setARCoreParam(VEARCoreParam vEARCoreParam) {
    }

    static {
        HashMap map = new HashMap();
        LLJILJIL = map;
        map.put("filter in time offset", Integer.class);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final void unregBachAlgorithmCallback() {
        this.LL.unregBachAlgorithmCallback();
    }

    public static boolean LJIIJ() {
        return VEConfigCenter.getInstance().getValue("ve_enable_recorder_simply_project", false).booleanValue();
    }

    public final void LJII() {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 30);
        tEBundleObtain.setBool("useAmazing", true);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final long LJIIIIZZ() {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 35);
        tEBundleObtain.setInt("effectEngineType", 0);
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        this.LL.callEffectInterfaceWithResult(tEBundleObtain, tEBundleObtain2);
        long j = tEBundleObtain2.getLong("EffectHandler");
        tEBundleObtain2.recycle();
        return j;
    }

    public final int LJIJJ() {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 11);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setInt("Mode", 1);
        tEBundleObtain.setInt("OrderType", 0);
        return this.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final List<VEEffectFilterParam> getPreparedEffectList() {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 63);
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        if (this.LL.callEffectInterfaceWithResult(tEBundleObtain, tEBundleObtain2) != 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int[] intArray = tEBundleObtain2.getIntArray("stickerIdList");
        String[] stringArray = tEBundleObtain2.getStringArray("pathList");
        for (int i = 0; i < tEBundleObtain2.getLong("effectNum"); i++) {
            VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
            vEEffectFilterParam.stickerId = intArray[i];
            vEEffectFilterParam.effectPath = stringArray[i];
            arrayList.add(vEEffectFilterParam);
        }
        return arrayList;
    }

    public C2254311DLh(InterfaceC2254431DLt interfaceC2254431DLt) {
        HashMap map = new HashMap();
        this.LLILZ = map;
        this.LLILZIL = new HashSet();
        this.LLILZLL = new HashMap();
        this.LLJI = 0;
        this.LL = interfaceC2254431DLt;
        map.put(0, new Integer[]{0, 1, 2});
        map.put(1, new Integer[]{0, 3});
        this.LLIZLLLIL = new int[32];
        int i = 0;
        do {
            this.LLIZLLLIL[i] = 0;
            i++;
        } while (i < 32);
        MessageCenter.addListener(this);
    }

    public final void LIZIZ(C1AM5 c1am5) {
        if (this.LLJ == null) {
            this.LLJ = new CopyOnWriteArrayList();
        }
        if (this.LLJ.size() <= 0) {
            this.LL.setLandMarkDetectCallback(new C1AM5() { // from class: X.1AM7
                @Override // X.C1AM5
                public final void LIZ(boolean z) {
                    Iterator it2 = ((CopyOnWriteArrayList) this.LIZ.LLJ).iterator();
                    while (it2.hasNext()) {
                        ((C1AM5) it2.next()).LIZ(z);
                    }
                }
            });
        }
        this.LLJ.add(c1am5);
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 10);
        tEBundleObtain.setInt("FlagType", 6);
        tEBundleObtain.setInt("flag", 1);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJI(boolean z) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 23);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setBool("enableEffect", z);
        tEBundleObtain.setBool("needPassToPostProcess", true);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final float LJIIIZ(String str) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 5);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setString("filterPath", str);
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        this.LL.callEffectInterfaceWithResult(tEBundleObtain, tEBundleObtain2);
        float f = tEBundleObtain2.getFloat("filterIntensity");
        tEBundleObtain2.recycle();
        return f;
    }

    public final int LJIIL(C1DM1 c1dm1) {
        C1DMN c1dmn = c1dm1.LIZ;
        if (c1dmn != null) {
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("processGestureEventType", c1dmn.LIZ.ordinal());
            switch (C2254491DLz.LIZ[c1dmn.LIZ.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    C1DM6 c1dm6 = (C1DM6) c1dmn;
                    tEBundleObtain.setFloat("x", c1dm6.LIZIZ);
                    tEBundleObtain.setFloat("y", c1dm6.LIZJ);
                    break;
                case 4:
                case 5:
                    C1DM9 c1dm9 = (C1DM9) c1dmn;
                    tEBundleObtain.setFloat("x", c1dm9.LIZIZ);
                    tEBundleObtain.setFloat("y", c1dm9.LIZJ);
                    tEBundleObtain.setInt("gestureType", c1dm9.LIZLLL.ordinal());
                    break;
                case 6:
                    C1DM5 c1dm5 = (C1DM5) c1dmn;
                    tEBundleObtain.setFloat("x", c1dm5.LIZIZ);
                    tEBundleObtain.setFloat("y", c1dm5.LIZJ);
                    tEBundleObtain.setFloat("dx", c1dm5.LIZLLL);
                    tEBundleObtain.setFloat("dy", c1dm5.LJ);
                    tEBundleObtain.setFloat("factor", c1dm5.LJFF);
                    break;
                case 7:
                    C1DM8 c1dm8 = (C1DM8) c1dmn;
                    tEBundleObtain.setFloat("scale", c1dm8.LIZIZ);
                    tEBundleObtain.setFloat("factor", c1dm8.LIZJ);
                    break;
                case 8:
                    C1DM7 c1dm7 = (C1DM7) c1dmn;
                    tEBundleObtain.setFloat("rotation", c1dm7.LIZIZ);
                    tEBundleObtain.setFloat("factor", c1dm7.LIZJ);
                    break;
                default:
                    return -100;
            }
            tEBundleObtain.setInt("effectInterfaceName", 23);
            return this.LL.callEffectInterface(tEBundleObtain);
        }
        return -100;
    }

    public final void LJIILJJIL(InterfaceC2177991ALt interfaceC2177991ALt) {
        VEBaseAlgorithmParam c1dmm;
        VEBaseAlgorithmParam vEBaseAlgorithmParam;
        VEBaseAlgorithmParam vEBaseAlgorithmParam2;
        if (this.LLILLL == null) {
            this.LLILLL = new CopyOnWriteArrayList();
        }
        ((CopyOnWriteArrayList) this.LLILLL).add(interfaceC2177991ALt);
        this.LL.setFaceInfoCallback(new C2178041ALy(this));
        if (((HashSet) this.LLILZIL).contains(0)) {
            return;
        }
        ((HashSet) this.LLILZIL).add(0);
        Pair pair = (Pair) ((HashMap) this.LLILZLL).get(0);
        Pair pair2 = (Pair) ((HashMap) this.LLILZLL).get(1);
        Pair pair3 = (Pair) ((HashMap) this.LLILZLL).get(2);
        if (pair != null) {
            c1dmm = (VEBaseAlgorithmParam) pair.first;
        } else {
            c1dmm = new C1DMM(false);
        }
        if (pair2 != null) {
            vEBaseAlgorithmParam = (VEBaseAlgorithmParam) pair2.first;
        } else {
            vEBaseAlgorithmParam = new VEBaseAlgorithmParam(1, "ExpressBaseDetect", false);
        }
        if (pair3 != null) {
            vEBaseAlgorithmParam2 = (VEBaseAlgorithmParam) pair3.first;
        } else {
            vEBaseAlgorithmParam2 = new VEBaseAlgorithmParam(2, "GenderDetect", false);
        }
        if (pair == null) {
            LIZ(c1dmm, -1, -1, 0);
        } else if (c1dmm.getForInit()) {
            c1dmm.setForInit(false);
            updateTrackAlgorithmParam(((Integer) pair.second).intValue(), c1dmm);
        }
        if (pair2 == null) {
            LIZ(vEBaseAlgorithmParam, -1, -1, 1);
        }
        if (pair3 == null) {
            LIZ(vEBaseAlgorithmParam2, -1, -1, 2);
        }
        for (Integer num : (Integer[]) ((HashMap) this.LLILZ).get(0)) {
            int[] iArr = this.LLIZLLLIL;
            int iIntValue = num.intValue();
            iArr[iIntValue] = iArr[iIntValue] + 1;
        }
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 10);
        tEBundleObtain.setInt("FlagType", 0);
        tEBundleObtain.setInt("flag", 1);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJIILLIIL(InterfaceC2177991ALt interfaceC2177991ALt) {
        List<InterfaceC2177991ALt> list = this.LLILLL;
        if (list != null) {
            for (Object obj : (CopyOnWriteArrayList) list) {
                if (obj.equals(interfaceC2177991ALt)) {
                    ((CopyOnWriteArrayList) this.LLILLL).remove(obj);
                }
            }
            if (((CopyOnWriteArrayList) this.LLILLL).isEmpty()) {
                ((CopyOnWriteArrayList) this.LLILLL).clear();
                ((HashSet) this.LLILZIL).remove(0);
                Integer[] numArr = (Integer[]) ((HashMap) this.LLILZ).get(0);
                for (int i = 0; i < numArr.length; i++) {
                    int[] iArr = this.LLIZLLLIL;
                    int iIntValue = numArr[i].intValue();
                    int i2 = iArr[iIntValue] - 1;
                    iArr[iIntValue] = i2;
                    if (i2 == 0) {
                        Pair pair = (Pair) ((HashMap) this.LLILZLL).get(numArr[i]);
                        String str = LLJIJIL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("remove track algorithm = ");
                        sbLIZ.append(((VEBaseAlgorithmParam) pair.first).getAlgorithmName());
                        C2484209oO.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                        removeTrackAlgorithm(((Integer) pair.second).intValue());
                        ((HashMap) this.LLILZLL).remove(numArr[i]);
                    }
                }
                TEBundle tEBundleObtain = TEBundle.obtain();
                tEBundleObtain.setInt("effectInterfaceName", 10);
                tEBundleObtain.setInt("FlagType", 0);
                tEBundleObtain.setInt("flag", 0);
                this.LL.callEffectInterface(tEBundleObtain);
                this.LL.setFaceInfoCallback(null);
            }
        }
    }

    public final void LJIIZILJ(C1AM5 c1am5) {
        List<C1AM5> list = this.LLJ;
        if (list == null) {
            return;
        }
        ((CopyOnWriteArrayList) list).remove(c1am5);
        if (((CopyOnWriteArrayList) this.LLJ).isEmpty()) {
            if (LJIIJ()) {
                TEBundle tEBundleObtain = TEBundle.obtain();
                tEBundleObtain.setInt("effectInterfaceName", 10);
                tEBundleObtain.setInt("FlagType", 6);
                tEBundleObtain.setInt("flag", 0);
                this.LL.callEffectInterface(tEBundleObtain);
            }
            this.LL.setLandMarkDetectCallback(null);
        }
    }

    public final void LJIJI(boolean z) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 23);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setBool("camera_first_frame_opt", z);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final int LJJIFFI(VEEffectParams vEEffectParams) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 12);
        tEBundleObtain.setInt("effectEngineType", 0);
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        tEBundleObtain2.setInt("effect type", vEEffectParams.TYPE);
        tEBundleObtain2.setInt("int value one", vEEffectParams.intValueOne);
        tEBundleObtain2.setInt("int value two", vEEffectParams.intValueTwo);
        tEBundleObtain2.setInt("int value three", vEEffectParams.intValueThree);
        tEBundleObtain2.setFloat("float value one", vEEffectParams.floatValueOne);
        tEBundleObtain2.setFloat("float value two", vEEffectParams.floatValueTwo);
        tEBundleObtain2.setFloat("float value three", vEEffectParams.floatValueThree);
        tEBundleObtain2.setBool("bool value one", vEEffectParams.boolValueOne);
        tEBundleObtain2.setBool("bool value two", vEEffectParams.boolValueTwo);
        tEBundleObtain2.setBool("bool value three", vEEffectParams.boolValueThree);
        tEBundleObtain2.setString("string value one", vEEffectParams.stringValueOne);
        tEBundleObtain2.setString("string value two", vEEffectParams.stringValueTwo);
        tEBundleObtain2.setString("string value three", vEEffectParams.stringValueThree);
        ArrayList<Integer> arrayList = vEEffectParams.intArrayValue;
        if (arrayList != null && !arrayList.isEmpty()) {
            int[] iArr = new int[vEEffectParams.intArrayValue.size()];
            for (int i = 0; i < vEEffectParams.intArrayValue.size(); i++) {
                iArr[i] = ((Integer) ListProtector.get(vEEffectParams.intArrayValue, i)).intValue();
            }
            tEBundleObtain2.setIntArray("int array one", iArr);
        }
        ArrayList<Float> arrayList2 = vEEffectParams.floatArrayValue;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            float[] fArr = new float[vEEffectParams.floatArrayValue.size()];
            for (int i2 = 0; i2 < vEEffectParams.floatArrayValue.size(); i2++) {
                fArr[i2] = ((Float) ListProtector.get(vEEffectParams.floatArrayValue, i2)).floatValue();
            }
            tEBundleObtain2.setFloatArray("float array one", fArr);
        }
        ArrayList<Boolean> arrayList3 = vEEffectParams.boolArrayValue;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int[] iArr2 = new int[vEEffectParams.boolArrayValue.size()];
            for (int i3 = 0; i3 < vEEffectParams.boolArrayValue.size(); i3++) {
                iArr2[i3] = ((Boolean) ListProtector.get(vEEffectParams.boolArrayValue, i3)).booleanValue() ? 1 : 0;
            }
            tEBundleObtain2.setIntArray("bool array one", iArr2);
        }
        tEBundleObtain2.setStringArray("string array one", (String[]) vEEffectParams.stringArrayOne.toArray(new String[0]));
        tEBundleObtain2.setStringArray("string array two", (String[]) vEEffectParams.stringArrayTwo.toArray(new String[0]));
        tEBundleObtain2.setStringArray("string array three", (String[]) vEEffectParams.stringArrayThree.toArray(new String[0]));
        tEBundleObtain.setHandle("ComposerParams", tEBundleObtain2.getHandle());
        int iCallEffectInterface = this.LL.callEffectInterface(tEBundleObtain);
        tEBundleObtain2.recycle();
        return iCallEffectInterface;
    }

    public final void LJJIII(InterfaceC2177981ALs interfaceC2177981ALs) {
        this.LL.setARTextLimitCountCallback(interfaceC2177981ALs);
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 10);
        tEBundleObtain.setInt("FlagType", 10);
        LJIIJ();
        tEBundleObtain.setInt("flag", 1);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJJIJIL(float f) {
        int i = (int) f;
        if (i < 0) {
            C2484209oO.LJIIIIZZ(LLJIJIL, "updateRotation failed, rotation < 0.");
            return;
        }
        if (i > 360) {
            i %= 360;
        }
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 22);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setInt("effect orientation", i);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.vesdk.effect.IEffect
    public final C2254631DMn getEffectFilterTime(long j) {
        C2254631DMn c2254631DMn;
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 59);
        tEBundleObtain.setLong("sticker_id", j);
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        if (this.LL.callEffectInterfaceWithResult(tEBundleObtain, tEBundleObtain2) == 0) {
            Object obj = new Object() { // from class: X.1DMn
            };
            tEBundleObtain2.getLong("beforeUpdateFilterTime");
            tEBundleObtain2.getLong("updateFilterTime");
            tEBundleObtain2.getLong("beforeEffectProcessTime");
            tEBundleObtain2.getLong("effectProcessTime");
            tEBundleObtain2.getLong("recorderDrawTime");
            tEBundleObtain2.getLong("switchEffectTime");
            c2254631DMn = obj;
        } else {
            c2254631DMn = 0;
        }
        tEBundleObtain2.recycle();
        return c2254631DMn;
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int prepareEffects(List<VEEffectFilterParam> list) {
        int i = 0;
        if (VERuntime.shouldEnableCameraGraph()) {
            ArrayList<TEBundle> arrayList = new ArrayList();
            TEBundle tEBundleObtain = TEBundle.obtain();
            while (i < list.size()) {
                TEBundle tEBundleLJII = C2254321DLi.LJII((VEBaseFilterParam) ListProtector.get(list, i));
                if (tEBundleLJII != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("preloadParam");
                    sbLIZ.append(i);
                    tEBundleObtain.setHandle(C2188811AlT.LIZIZ(sbLIZ), tEBundleLJII.getHandle());
                }
                arrayList.add(tEBundleLJII);
                i++;
            }
            tEBundleObtain.setInt("preloadNum", list.size());
            tEBundleObtain.setInt("effectInterfaceName", 61);
            int iCallEffectInterface = this.LL.callEffectInterface(tEBundleObtain);
            for (TEBundle tEBundle : arrayList) {
                if (tEBundle != null) {
                    tEBundle.recycle();
                }
            }
            return iCallEffectInterface;
        }
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        while (i < list.size()) {
            TEBundle tEBundleLJII2 = C2254321DLi.LJII((VEBaseFilterParam) ListProtector.get(list, i));
            if (tEBundleLJII2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("preloadParam");
                sbLIZ2.append(i);
                tEBundleObtain2.setHandle(C2188811AlT.LIZIZ(sbLIZ2), tEBundleLJII2.getHandle());
            }
            i++;
        }
        tEBundleObtain2.setInt("preloadNum", list.size());
        tEBundleObtain2.setInt("effectInterfaceName", 61);
        return this.LL.callEffectInterface(tEBundleObtain2);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final void regBachAlgorithmCallback(List<C2178031ALx> list) {
        this.LL.regBachAlgorithmCallback(list);
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 49);
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = ((C2178031ALx) ListProtector.get(list, i)).LIZ.ordinal();
        }
        tEBundleObtain.setIntArray("CallbackTypes", iArr);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int releasePreparedEffects(List<VEEffectFilterParam> list) {
        int i = 0;
        if (VERuntime.shouldEnableCameraGraph()) {
            ArrayList<TEBundle> arrayList = new ArrayList();
            TEBundle tEBundleObtain = TEBundle.obtain();
            while (i < list.size()) {
                TEBundle tEBundleLJII = C2254321DLi.LJII((VEBaseFilterParam) ListProtector.get(list, i));
                if (tEBundleLJII != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("preloadParam");
                    sbLIZ.append(i);
                    tEBundleObtain.setHandle(C2188811AlT.LIZIZ(sbLIZ), tEBundleLJII.getHandle());
                }
                arrayList.add(tEBundleLJII);
                i++;
            }
            tEBundleObtain.setInt("preloadNum", list.size());
            tEBundleObtain.setInt("effectInterfaceName", 62);
            int iCallEffectInterface = this.LL.callEffectInterface(tEBundleObtain);
            for (TEBundle tEBundle : arrayList) {
                if (tEBundle != null) {
                    tEBundle.recycle();
                }
            }
            return iCallEffectInterface;
        }
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        while (i < list.size()) {
            TEBundle tEBundleLJII2 = C2254321DLi.LJII((VEBaseFilterParam) ListProtector.get(list, i));
            if (tEBundleLJII2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("preloadParam");
                sbLIZ2.append(i);
                tEBundleObtain2.setHandle(C2188811AlT.LIZIZ(sbLIZ2), tEBundleLJII2.getHandle());
            }
            i++;
        }
        tEBundleObtain2.setInt("preloadNum", list.size());
        tEBundleObtain2.setInt("effectInterfaceName", 62);
        return this.LL.callEffectInterface(tEBundleObtain2);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int removeTrackAlgorithm(int i) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 8);
        tEBundleObtain.setInt("AlgorithmIndex", i);
        this.LL.callEffectInterface(tEBundleObtain);
        return 0;
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int removeTrackFilter(int i) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 2);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setInt("FilterIndex", i);
        return this.LL.callEffectInterface(tEBundleObtain);
    }

    public final int LIZJ(String str, String str2) {
        VEFrame vEFrameCreateByteBufferFrame;
        if (VERuntime.shouldEnableCameraGraph()) {
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("effectInterfaceName", 34);
            if (!TextUtils.isEmpty(str2)) {
                tEBundleObtain.setString("key", str);
                tEBundleObtain.setString("imagePath", str2);
                tEBundleObtain.setBool("forceSwitchGLThread", false);
                return this.LL.callEffectInterface(tEBundleObtain);
            }
            tEBundleObtain.setString("key", str);
            tEBundleObtain.setBool("forceSwitchGLThread", false);
            return this.LL.callEffectInterface(tEBundleObtain);
        }
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        tEBundleObtain2.setInt("effectInterfaceName", 34);
        if (!TextUtils.isEmpty(str2)) {
            Context context = VERuntime.getInstance().getContext();
            if (context == null) {
                return -108;
            }
            TEImageFactory.ImageInfo imageInfoDecodeFile = TEImageFactory.decodeFile(context.getContentResolver(), str2);
            if (imageInfoDecodeFile == null || (vEFrameCreateByteBufferFrame = VEFrame.createByteBufferFrame(imageInfoDecodeFile.getBitmap(), 0L)) == null) {
                return -100;
            }
            tEBundleObtain2.setByteBuffer("data", ((VEFrame.ByteBufferFrame) vEFrameCreateByteBufferFrame.getFrame()).getByteBuffer());
            tEBundleObtain2.setInt("width", vEFrameCreateByteBufferFrame.getWidth());
            tEBundleObtain2.setInt("height", vEFrameCreateByteBufferFrame.getHeight());
        }
        tEBundleObtain2.setString("key", str);
        tEBundleObtain2.setBool("forceSwitchGLThread", false);
        return this.LL.callEffectInterface(tEBundleObtain2);
    }

    public final int LIZLLL(List list, List list2) {
        boolean z;
        int iCallEffectInterface;
        boolean zShouldEnableCameraGraph = VERuntime.shouldEnableCameraGraph();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            String[] strArr = new String[size];
            list.toArray(strArr);
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            TEBundle tEBundleObtain = TEBundle.obtain();
            Object[] objArr = new Object[size];
            if (list2 != null && !list2.isEmpty()) {
                int size2 = list2.size();
                z = false;
                for (int i = 0; i < size && i < size2; i++) {
                    VEFrame vEFrame = (VEFrame) ListProtector.get(list2, i);
                    String str = LLJIJIL;
                    if (vEFrame == null) {
                        C2484209oO.LJIIIIZZ(str, "frame nullptr");
                    } else if (!(vEFrame.getFrame() instanceof VEFrame.ByteBufferFrame) && !(vEFrame.getFrame() instanceof VEFrame.BitmapFrame)) {
                        C2484209oO.LJIIIIZZ(str, "Only support ByteBufferFrame and BitmapFrame");
                    } else {
                        iArr[i] = vEFrame.getWidth();
                        iArr2[i] = vEFrame.getHeight();
                        if (vEFrame.getFrame() instanceof VEFrame.ByteBufferFrame) {
                            ByteBuffer byteBuffer = ((VEFrame.ByteBufferFrame) vEFrame.getFrame()).getByteBuffer();
                            if (byteBuffer == null) {
                                C2484209oO.LJIIIIZZ(str, "buffer nullptr");
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("data");
                                sbLIZ.append(i);
                                tEBundleObtain.setByteBuffer(C2188811AlT.LIZIZ(sbLIZ), byteBuffer);
                                if (zShouldEnableCameraGraph) {
                                    objArr[i] = byteBuffer;
                                }
                            }
                        } else if (vEFrame.getFrame() instanceof VEFrame.BitmapFrame) {
                            Bitmap bitmap = ((VEFrame.BitmapFrame) vEFrame.getFrame()).bitmap;
                            if (bitmap == null) {
                                C2484209oO.LJIIIIZZ(str, "bitmap nullptr");
                            } else {
                                objArr[i] = bitmap;
                                z = true;
                            }
                        }
                    }
                }
            } else {
                z = false;
            }
            tEBundleObtain.setInt("effectInterfaceName", 34);
            tEBundleObtain.setStringArray("keys", strArr);
            tEBundleObtain.setIntArray("widths", iArr);
            tEBundleObtain.setIntArray("heights", iArr2);
            tEBundleObtain.setBool("forceSwitchGLThread", false);
            if (z) {
                iCallEffectInterface = this.LL.callEffectInterfaceWithObjectParams(tEBundleObtain, objArr);
            } else {
                iCallEffectInterface = this.LL.callEffectInterface(tEBundleObtain);
            }
            if (list2 != null && !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    VEFrame vEFrame2 = (VEFrame) it2.next();
                    if (vEFrame2 != null) {
                        vEFrame2.recycle();
                    }
                }
            }
            return iCallEffectInterface;
        }
        return -100;
    }

    public final int[] LJFF(String str, String str2) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 26);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setString("newNodePath", str);
        tEBundleObtain.setString("nodeKey", str2);
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        this.LL.callEffectInterfaceWithResult(tEBundleObtain, tEBundleObtain2);
        int[] intArray = tEBundleObtain2.getIntArray("checkComposerNodeExclusionRet");
        tEBundleObtain2.recycle();
        return intArray;
    }

    public final boolean LJIILIIL(VETouchPointer vETouchPointer, int i) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("ProcessTouchEventType", vETouchPointer.getEvent().ordinal());
        tEBundleObtain.setInt("PointerID", vETouchPointer.getPointerId());
        tEBundleObtain.setFloat("x", vETouchPointer.getX());
        tEBundleObtain.setFloat("y", vETouchPointer.getY());
        tEBundleObtain.setFloat("force", vETouchPointer.getForce());
        tEBundleObtain.setFloat("majorRadius", vETouchPointer.getMajorRadius());
        tEBundleObtain.setInt("pointerCount", i);
        tEBundleObtain.setInt("EffectRotation", this.LLJI);
        tEBundleObtain.setInt("effectInterfaceName", 37);
        tEBundleObtain.setInt("effectEngineType", 0);
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        this.LL.callEffectInterfaceWithResult(tEBundleObtain, tEBundleObtain2);
        boolean bool = tEBundleObtain2.getBool("processTouchEventResult");
        tEBundleObtain2.recycle();
        return bool;
    }

    public final int LJIILL(int i, String[] strArr) {
        if (i > 0 && strArr != null && strArr.length == i) {
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("effectInterfaceName", 18);
            tEBundleObtain.setInt("effectEngineType", 0);
            tEBundleObtain.setStringArray("node paths", strArr);
            return this.LL.callEffectInterface(tEBundleObtain);
        }
        return -100;
    }

    public final void LJIL(float[] fArr, double d) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 23);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setFloatArray("deviceRotation", fArr);
        tEBundleObtain.setDouble("timeStampNano", d);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJJ(String str, String str2) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 29);
        tEBundleObtain.setString("key", str);
        tEBundleObtain.setString("value", str2);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJJI(int i, VESafeAreaParams[] vESafeAreaParamsArr) {
        int length = 0;
        if (VERuntime.shouldEnableCameraGraph()) {
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("SafeType", i);
            if (vESafeAreaParamsArr == null) {
                tEBundleObtain.setInt("SafeAreaSize", 0);
                tEBundleObtain.setInt("effectInterfaceName", 45);
                this.LL.callEffectInterface(tEBundleObtain);
                return;
            }
            int length2 = vESafeAreaParamsArr.length;
            TEBundle[] tEBundleArr = new TEBundle[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                VESafeAreaParams vESafeAreaParams = vESafeAreaParamsArr[i2];
                TEBundle tEBundleLJ = C2254321DLi.LJ(vESafeAreaParams);
                tEBundleLJ.setInt("safetype", vESafeAreaParams.safeType);
                tEBundleLJ.setFloat("left", vESafeAreaParams.left);
                tEBundleLJ.setFloat("top", vESafeAreaParams.top);
                tEBundleLJ.setFloat("right", vESafeAreaParams.right);
                tEBundleLJ.setFloat("bottom", vESafeAreaParams.bottom);
                tEBundleObtain.setHandle(String.valueOf(i2), tEBundleLJ.getHandle());
                tEBundleArr[i2] = tEBundleLJ;
            }
            tEBundleObtain.setInt("SafeAreaSize", length2);
            tEBundleObtain.setInt("effectInterfaceName", 45);
            this.LL.callEffectInterface(tEBundleObtain);
            for (int i3 = 0; i3 < length2; i3++) {
                tEBundleArr[i3].recycle();
            }
            return;
        }
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        tEBundleObtain2.setInt("SafeType", i);
        if (vESafeAreaParamsArr != null) {
            length = vESafeAreaParamsArr.length;
            TEBundle[] tEBundleArr2 = new TEBundle[length];
            for (int i4 = 0; i4 < length; i4++) {
                VESafeAreaParams vESafeAreaParams2 = vESafeAreaParamsArr[i4];
                TEBundle tEBundleLJ2 = C2254321DLi.LJ(vESafeAreaParams2);
                tEBundleLJ2.setInt("safetype", vESafeAreaParams2.safeType);
                tEBundleLJ2.setFloat("left", vESafeAreaParams2.left);
                tEBundleLJ2.setFloat("top", vESafeAreaParams2.top);
                tEBundleLJ2.setFloat("right", vESafeAreaParams2.right);
                tEBundleLJ2.setFloat("bottom", vESafeAreaParams2.bottom);
                tEBundleObtain2.setHandle(String.valueOf(i4), tEBundleLJ2.getHandle());
                tEBundleArr2[i4] = tEBundleLJ2;
            }
            for (int i5 = 0; i5 < length; i5++) {
                tEBundleArr2[i5].recycle();
            }
        }
        tEBundleObtain2.setInt("SafeAreaSize", length);
        tEBundleObtain2.setInt("effectInterfaceName", 45);
        this.LL.callEffectInterface(tEBundleObtain2);
    }

    public final void LJJIIZI(double d, double[] dArr) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 23);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setBool("slamProcessIngestOri", true);
        tEBundleObtain.setDoubleArray("wRbs", dArr);
        tEBundleObtain.setDouble("timestamp", d);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final void enableEffectWithCameraFacing(boolean z, int i) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 23);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setBool("enableEffectWithCameraFacing", z);
        tEBundleObtain.setInt("cameraFacing", i);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int updateTrackAlgorithmParam(int i, VEBaseAlgorithmParam vEBaseAlgorithmParam) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 9);
        tEBundleObtain.setInt("AlgorithmIndex", i);
        TEBundle tEBundleLJI = C2254321DLi.LJI(vEBaseAlgorithmParam);
        if (tEBundleLJI != null) {
            tEBundleObtain.setHandle("AlgorithmParam", tEBundleLJI.getHandle());
        }
        this.LL.callEffectInterface(tEBundleObtain);
        if (tEBundleLJI != null) {
            tEBundleLJI.recycle();
            return 0;
        }
        return 0;
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int updateTrackFilterParam(int i, VEBaseFilterParam vEBaseFilterParam) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 4);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setInt("FilterIndex", i);
        TEBundle tEBundleLJII = C2254321DLi.LJII(vEBaseFilterParam);
        if (tEBundleLJII != null) {
            tEBundleObtain.setHandle("FitlerParam", tEBundleLJII.getHandle());
        }
        int iCallEffectInterface = this.LL.callEffectInterface(tEBundleObtain);
        if (tEBundleLJII != null) {
            tEBundleLJII.recycle();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("filterType", vEBaseFilterParam.filterType);
            jSONObject.put("filterIndex", iCallEffectInterface);
            jSONObject.put("resultCode", iCallEffectInterface);
            b.LIZ("vesdk_event_recorder_switch_effect", "behavior", jSONObject);
            return iCallEffectInterface;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return iCallEffectInterface;
        }
    }

    public final void LJ(int i, String[] strArr, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_APPEND_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        String str = LLJIJIL;
        C2484209oO.LJIIIIZZ(str, "appendComposerNodes...");
        if (vEEffectParams.stringArrayOne.size() == i && vEEffectParams.stringArrayTwo.size() == i) {
            LJJIFFI(vEEffectParams);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Nodes size=");
        sbLIZ.append(vEEffectParams.stringArrayOne.size());
        sbLIZ.append(", tags size=");
        sbLIZ.append(vEEffectParams.stringArrayTwo.size());
        sbLIZ.append(", but nodeNum=");
        sbLIZ.append(i);
        C2484209oO.LIZJ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIJJLI(int i, String[] strArr, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_SET_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        String str = LLJIJIL;
        C2484209oO.LJI(str, "setComposerNodesWithTag...");
        if (vEEffectParams.stringArrayOne.size() == i && vEEffectParams.stringArrayTwo.size() == i) {
            LJJIFFI(vEEffectParams);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Nodes size=");
        sbLIZ.append(vEEffectParams.stringArrayOne.size());
        sbLIZ.append(", tags size=");
        sbLIZ.append(vEEffectParams.stringArrayTwo.size());
        sbLIZ.append(", but nodeNum=");
        sbLIZ.append(i);
        C2484209oO.LIZJ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final int LJJIJIIJI(String str, String str2, float f) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 14);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setString("node path", str);
        tEBundleObtain.setString("node tag", str2);
        tEBundleObtain.setFloat("node value", f);
        return this.LL.callEffectInterface(tEBundleObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.vesdk.effect.IEffect
    public final <T> int setFilterParam(int i, String str, T t) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("FilterIndex", i);
        tEBundleObtain.setInt("effectInterfaceName", 6);
        tEBundleObtain.setInt("effectEngineType", 0);
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        if ("filter in time offset".equals(str)) {
            tEBundleObtain2.setInt(str, ((Integer) t).intValue() * LSPassThroughRecordSizeConfig.DEFAULT);
        }
        tEBundleObtain.setHandle("FitlerParam", tEBundleObtain2.getHandle());
        int iCallEffectInterface = this.LL.callEffectInterface(tEBundleObtain);
        tEBundleObtain2.recycle();
        return iCallEffectInterface;
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int updateTrackFilterTime(int i, int i2, int i3) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 3);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setInt("FilterIndex", i);
        tEBundleObtain.setInt("SequenceIn", i2);
        tEBundleObtain.setInt("SequenceOut", i3);
        return this.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LIZ(VEBaseAlgorithmParam vEBaseAlgorithmParam, int i, int i2, int i3) {
        Pair pair = new Pair(vEBaseAlgorithmParam, Integer.valueOf(addTrackAlgorithm(0, 0, vEBaseAlgorithmParam, i, i2)));
        ((HashMap) this.LLILZLL).put(Integer.valueOf(i3), pair);
        String str = LLJIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add algorithm: ");
        sbLIZ.append(vEBaseAlgorithmParam.getAlgorithmName());
        C2484209oO.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIJJI(int i, int i2, int i3, String str) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 32);
        tEBundleObtain.setInt("messageType", i);
        tEBundleObtain.setInt("arg1", i2);
        tEBundleObtain.setInt("arg2", i3);
        tEBundleObtain.setString("arg3", str);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJJII(boolean z, boolean z2, boolean z3, boolean z4) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 23);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setBool("slamDeviceConfig", true);
        tEBundleObtain.setBool("hasAcc", z);
        tEBundleObtain.setBool("hasGyr", z2);
        tEBundleObtain.setBool("hasGravity", z3);
        tEBundleObtain.setBool("hasOrientation", z4);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJJIIJ(double d, double d2, double d3, double d4) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 23);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setBool("slamProcessIngestAcc", true);
        tEBundleObtain.setDouble("ax", d);
        tEBundleObtain.setDouble("ay", d2);
        tEBundleObtain.setDouble("az", d3);
        tEBundleObtain.setDouble("timestamp", d4);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJJIIJZLJL(double d, double d2, double d3, double d4) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 23);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setBool("slamProcessIngestGra", true);
        tEBundleObtain.setDouble("gax", d);
        tEBundleObtain.setDouble("gay", d2);
        tEBundleObtain.setDouble("gaz", d3);
        tEBundleObtain.setDouble("timestamp", d4);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJJIIZ(double d, double d2, double d3, double d4) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 23);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setBool("slamProcessIngestGyr", true);
        tEBundleObtain.setDouble("grx", d);
        tEBundleObtain.setDouble("gry", d2);
        tEBundleObtain.setDouble("grz", d3);
        tEBundleObtain.setDouble("timestamp", d4);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJJIJ(int i, int i2, String str, String str2) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 100);
        tEBundleObtain.setString("InputText", str);
        tEBundleObtain.setInt("Arg1", i);
        tEBundleObtain.setInt("Arg2", i2);
        tEBundleObtain.setString("Arg3", str2);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJJIJIIJIL(int i, String[] strArr, String[] strArr2, float[] fArr) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 36);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setInt("node num", i);
        tEBundleObtain.setStringArray("node paths", strArr);
        tEBundleObtain.setStringArray("node keys", strArr2);
        tEBundleObtain.setFloatArray("values", fArr);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 17 || i == 23) {
            LJIIJJI(i, i2, i3, str);
        }
        MessageCenter.Listener listener = this.LLILLJJLI;
        if (listener != null) {
            listener.onMessageReceived(i, i2, i3, str);
        }
        if (i == 58 || i == 72) {
            LJIIJJI(i, i2, i3, str);
        }
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final void sendEffectMsg(int i, long j, long j2, byte[] bArr) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 50);
        tEBundleObtain.setInt("MsgID", i);
        tEBundleObtain.setLong("ARG1", j);
        tEBundleObtain.setLong("ARG2", j2);
        tEBundleObtain.setLong("BufSize", bArr.length);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        tEBundleObtain.setByteBuffer("ARG3", byteBufferAllocateDirect);
        this.LL.callEffectInterface(tEBundleObtain);
    }

    public final void LJIJ(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_REPLACE_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i;
        vEEffectParams.intValueTwo = i2;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        vEEffectParams.stringArrayThree = new ArrayList<>(Arrays.asList(strArr3));
        C2484209oO.LJIIIIZZ(LLJIJIL, "replaceComposerNodes...");
        LJJIFFI(vEEffectParams);
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int addTrackAlgorithm(int i, int i2, VEBaseAlgorithmParam vEBaseAlgorithmParam, int i3, int i4) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 7);
        tEBundleObtain.setInt("TrackType", i);
        tEBundleObtain.setInt("TrackIndex", i2);
        tEBundleObtain.setInt("SequenceIn", i3);
        tEBundleObtain.setInt("SequenceOut", i4);
        tEBundleObtain.setString("AlgorithmName", vEBaseAlgorithmParam.getAlgorithmName());
        tEBundleObtain.setInt("AlgorithmType", vEBaseAlgorithmParam.getAlgorithmType());
        tEBundleObtain.setBool("ForInit", vEBaseAlgorithmParam.getForInit());
        TEBundle tEBundleLJI = C2254321DLi.LJI(vEBaseAlgorithmParam);
        if (tEBundleLJI != null) {
            tEBundleObtain.setHandle("AlgorithmParam", tEBundleLJI.getHandle());
        }
        int iCallEffectInterface = this.LL.callEffectInterface(tEBundleObtain);
        if (tEBundleLJI != null) {
            tEBundleLJI.recycle();
        }
        return iCallEffectInterface;
    }

    @Override // com.ss.android.vesdk.effect.IEffect
    public final int addTrackFilter(int i, int i2, VEBaseFilterParam vEBaseFilterParam, int i3, int i4) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 1);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setInt("TrackIndex", i2);
        tEBundleObtain.setInt("TrackType", i);
        tEBundleObtain.setString("FilterName", vEBaseFilterParam.filterName);
        tEBundleObtain.setInt("SequenceIn", i3);
        tEBundleObtain.setInt("SequenceOut", i4);
        tEBundleObtain.setInt("FilterType", vEBaseFilterParam.filterType);
        tEBundleObtain.setInt("FilterDurType", vEBaseFilterParam.filterDurationType);
        TEBundle tEBundleLJII = C2254321DLi.LJII(vEBaseFilterParam);
        if (tEBundleLJII != null) {
            tEBundleObtain.setHandle("FitlerParam", tEBundleLJII.getHandle());
        }
        Pair pair = new Pair(vEBaseFilterParam, -1);
        Map<Integer, Pair<VEBaseFilterParam, Integer>> map = this.LLIZ;
        if (map != null) {
            ((HashMap) map).put(Integer.valueOf(vEBaseFilterParam.filterType), pair);
        }
        int iCallEffectInterface = this.LL.callEffectInterface(tEBundleObtain);
        if (tEBundleLJII != null) {
            tEBundleLJII.recycle();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("filterType", vEBaseFilterParam.filterType);
            jSONObject.put("filterIndex", iCallEffectInterface);
            jSONObject.put("seqIn", i3);
            jSONObject.put("seqOut", i4);
            jSONObject.put("resultCode", iCallEffectInterface);
            b.LIZ("vesdk_event_recorder_switch_effect", "behavior", jSONObject);
            return iCallEffectInterface;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return iCallEffectInterface;
        }
    }
}
