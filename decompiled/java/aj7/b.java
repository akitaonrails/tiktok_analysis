package aj7;

import X.C01GW;
import X.C0CNO;
import X.C118H;
import X.C12JH;
import X.C1404320meE;
import X.C1404360meI;
import X.C1404370meJ;
import X.C1413440msw;
import X.C1448420nnM;
import X.C1625110sOL;
import X.C1684890twl;
import X.C1AM5;
import X.C1DKV;
import X.C1DM1;
import X.C1DM7;
import X.C1DM8;
import X.C1DM9;
import X.C1DMH;
import X.C1DMM;
import X.C1DMP;
import X.C1DMS;
import X.C2177801ALa;
import X.C2177891ALj;
import X.C2178051ALz;
import X.C2188811AlT;
import X.C2254311DLh;
import X.C2254321DLi;
import X.C2254331DLj;
import X.C2484209oO;
import X.C452501pT;
import X.EnumC1687420u0q;
import X.EnumC2254471DLx;
import X.EnumC2254481DLy;
import X.InterfaceC1622650sKN;
import X.InterfaceC1623210sLH;
import X.InterfaceC1645720sva;
import X.InterfaceC1684900twm;
import X.InterfaceC2173471A4j;
import X.InterfaceC2177981ALs;
import X.InterfaceC2177991ALt;
import X.InterfaceC2178021ALw;
import X.InterfaceC2183551Acz;
import android.graphics.Rect;
import android.util.Pair;
import com.bef.effectsdk.EffectWrapper;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VETouchPointer;
import com.ss.android.vesdk.faceinfo.VEFaceAttribute;
import com.ss.android.vesdk.faceinfo.VEFaceAttributeInfo;
import com.ss.android.vesdk.faceinfo.VEFaceDetectInfo;
import com.ss.android.vesdk.faceinfo.VESkeleton;
import com.ss.android.vesdk.faceinfo.VESkeletonInfo;
import com.ss.android.vesdk.filterparam.VEBeautyFilterParam;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEMakeUpFilterParam;
import com.ss.android.vesdk.filterparam.VEReshapeFilterParam;
import com.ss.android.vesdk.k;
import com.ss.android.vesdk.model.VEPrePlayParams;
import gro.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS579S0100000_35;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public final class b implements InterfaceC1645720sva {
    public final VERecorder LIZ;
    public final Function0<Boolean> LIZIZ;
    public final C1DKV LIZJ;
    public volatile boolean LJFF;
    public final C01GW LJIIJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 8));
    public final List<InterfaceC1684900twm> LJ = new ArrayList();
    public final List<MessageCenter.Listener> LJII = new ArrayList();
    public final C118H LJIIIIZZ = new MessageCenter.Listener() { // from class: X.118H
        @Override // com.bef.effectsdk.message.MessageCenter.Listener
        public final void onMessageReceived(int i, int i2, int i3, String str) {
            if (this.LL.LIZIZ.invoke().booleanValue() || ((ArrayList) this.LL.LJII).isEmpty()) {
                return;
            }
            for (MessageCenter.Listener listener : new ArrayList(this.LL.LJII)) {
                if (listener != null) {
                    listener.onMessageReceived(i, i2, i3, str);
                }
            }
        }
    };
    public final C1684890twl LJIIIZ = new InterfaceC2177991ALt() { // from class: X.0twl
        @Override // X.InterfaceC2177991ALt
        public final void LIZ(VEFaceAttributeInfo vEFaceAttributeInfo, VEFaceDetectInfo vEFaceDetectInfo) {
            ASSimpleFaceInfo[] aSSimpleFaceInfoArr;
            if (this.LIZ.LIZIZ.invoke().booleanValue()) {
                return;
            }
            for (InterfaceC1684900twm interfaceC1684900twm : C13LP.LLIIII(this.LIZ.LJ)) {
                if (vEFaceAttributeInfo != null) {
                    ArrayList arrayList = new ArrayList();
                    for (VEFaceAttribute vEFaceAttribute : vEFaceAttributeInfo.getInfo()) {
                        arrayList.add(new ASSimpleFaceInfo(vEFaceAttribute.getBoyProb()));
                    }
                    aSSimpleFaceInfoArr = (ASSimpleFaceInfo[]) arrayList.toArray(new ASSimpleFaceInfo[0]);
                } else {
                    aSSimpleFaceInfoArr = null;
                }
                if (vEFaceDetectInfo != null) {
                    ArrayList arrayList2 = new ArrayList();
                    C1684910twn[] info = vEFaceDetectInfo.getInfo();
                    if (info != null) {
                        for (C1684910twn c1684910twn : info) {
                            arrayList2.add(c1684910twn.LIZ);
                        }
                    }
                    arrayList2.toArray(new Rect[0]);
                }
                interfaceC1684900twm.LIZ(aSSimpleFaceInfoArr);
            }
        }
    };
    public volatile boolean LJI = false;

    @Override // X.InterfaceC1645720sva
    public final void ao() {
        this.LJFF = false;
    }

    public final C1404360meI LIZ() {
        return (C1404360meI) this.LJIIJ.getValue();
    }

    public final C2254311DLh LIZIZ() {
        return (C2254311DLh) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC1645720sva
    public final void LJLIIIL() {
        this.LIZ.LJIJ();
    }

    @Override // X.InterfaceC1645720sva
    public final C1413440msw eo() {
        C1413440msw c1413440msw;
        k kVar = this.LIZ.LIZIZ;
        kVar.getClass();
        if (VEConfigCenter.getInstance().getValue("veabtest_enable_remove_effect_deprecatingAPI", false).booleanValue()) {
            C1413440msw c1413440msw2 = new C1413440msw();
            c1413440msw2.LIZ = 0.0f;
            c1413440msw2.LIZLLL = 0.0f;
            c1413440msw2.LIZIZ = 0.0f;
            c1413440msw2.LIZJ = 0.0f;
            return c1413440msw2;
        }
        a aVar = kVar.LJJIZ;
        aVar.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 55);
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        if (aVar.LL.callEffectInterfaceWithResult(tEBundleObtain, tEBundleObtain2) == 0) {
            c1413440msw = new C1413440msw();
            c1413440msw.LIZ = tEBundleObtain2.getFloat("processTextureTime");
            c1413440msw.LIZIZ = tEBundleObtain2.getFloat("pureRenderTime");
            c1413440msw.LIZJ = tEBundleObtain2.getFloat("waitAlgorithmTime");
            c1413440msw.LIZLLL = tEBundleObtain2.getFloat("pureAlgorithmTime");
            String str = C2254311DLh.LLJIJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getFrameCostStatistics processTextureTime = ");
            sbLIZ.append(c1413440msw.LIZ);
            sbLIZ.append(", pureRenderTime = ");
            sbLIZ.append(c1413440msw.LIZIZ);
            sbLIZ.append(", waitAlgorithmTime = ");
            sbLIZ.append(c1413440msw.LIZJ);
            sbLIZ.append(", pureAlgorithmTime = ");
            sbLIZ.append(c1413440msw.LIZLLL);
            C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        } else {
            c1413440msw = null;
        }
        tEBundleObtain2.recycle();
        return c1413440msw;
    }

    @Override // X.InterfaceC1645720sva
    public final List<VEEffectFilterParam> getPreparedEffectList() {
        return this.LIZ.LIZIZ.LJJIZ.getPreparedEffectList();
    }

    @Override // X.InterfaceC1645720sva
    public final String ok() {
        return this.LIZ.LJIIJ(128);
    }

    @Override // X.InterfaceC1645720sva
    public final void po() {
        if (this.LJI) {
            return;
        }
        LIZIZ().LJIILJJIL(this.LJIIIZ);
        this.LJI = true;
    }

    @Override // X.InterfaceC1645720sva
    public final InterfaceC1622650sKN wo() {
        k kVar = this.LIZ.LIZIZ;
        synchronized (kVar.LJL) {
            try {
                C1DMH c1dmh = kVar.LJJZZIII;
                if (c1dmh == null || !(c1dmh instanceof InterfaceC1622650sKN)) {
                    return new InterfaceC1622650sKN() { // from class: X.1DMc
                        @Override // X.InterfaceC1622650sKN
                        public final void LIZ(boolean z) {
                        }

                        @Override // X.InterfaceC1622650sKN
                        public final void LJFF(C1622630sKL c1622630sKL) {
                        }

                        @Override // X.InterfaceC1622650sKN
                        public final void pause() {
                        }

                        @Override // X.InterfaceC1622650sKN
                        public final void start() {
                        }
                    };
                }
                final InterfaceC1622650sKN interfaceC1622650sKN = (InterfaceC1622650sKN) c1dmh;
                return new InterfaceC1622650sKN(interfaceC1622650sKN) { // from class: X.0sKO
                    public final InterfaceC1622650sKN LIZ;

                    @Override // X.InterfaceC1622650sKN
                    public final void pause() {
                        this.LIZ.pause();
                    }

                    @Override // X.InterfaceC1622650sKN
                    public final void start() {
                        this.LIZ.start();
                    }

                    {
                        this.LIZ = interfaceC1622650sKN;
                    }

                    @Override // X.InterfaceC1622650sKN
                    public final void LIZ(boolean z) {
                        this.LIZ.LIZ(z);
                    }

                    @Override // X.InterfaceC1622650sKN
                    public final void LJFF(C1622630sKL c1622630sKL) {
                        this.LIZ.LJFF(c1622630sKL);
                    }
                };
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1645720sva
    public final C1448420nnM zo() {
        C1448420nnM c1448420nnM;
        a aVar = this.LIZ.LIZIZ.LJJIZ;
        aVar.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 56);
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        if (aVar.LL.callEffectInterfaceWithResult(tEBundleObtain, tEBundleObtain2) == 0) {
            c1448420nnM = new C1448420nnM();
            int[] intArray = tEBundleObtain2.getIntArray("stickerLagInfo");
            String str = C2254311DLh.LLJIJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getStickerLagInfo, bundle handle = ");
            sbLIZ.append(tEBundleObtain2.getHandle());
            C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
            if (intArray.length == 3) {
                c1448420nnM.LIZ = intArray[0];
                c1448420nnM.LIZIZ = intArray[1];
                c1448420nnM.LIZJ = intArray[2];
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getStickerLagInfo lagCount = ");
                sbLIZ2.append(c1448420nnM.LIZ);
                sbLIZ2.append(", lagTotalDuration = ");
                sbLIZ2.append(c1448420nnM.LIZIZ);
                sbLIZ2.append(", stickerDuration = ");
                sbLIZ2.append(c1448420nnM.LIZJ);
                C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else {
            c1448420nnM = null;
        }
        tEBundleObtain2.recycle();
        return c1448420nnM;
    }

    @Override // X.InterfaceC1661400tKs
    public final void LJJLIIIJJI() {
        LIZ().LJJLIIIJJI();
    }

    @Override // X.InterfaceC1645720sva
    public final void LJLJJI() {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 101);
        tEBundleObtain.setBool("isFinished", true);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC1645720sva
    public final void LJLJLJ() {
        LIZIZ().getClass();
        C2484209oO.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.InterfaceC1661400tKs
    public final void M4() {
        LIZ().M4();
    }

    @Override // X.InterfaceC1661400tKs
    public final C1404370meJ N4() {
        C1404360meI c1404360meILIZ = LIZ();
        c1404360meILIZ.getClass();
        return new C1404370meJ(c1404360meILIZ);
    }

    @Override // X.InterfaceC1645720sva
    public final void R7() {
        LIZIZ().getClass();
        C2484209oO.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.InterfaceC1645720sva
    public final void Wn() {
        LIZIZ().getClass();
        C2484209oO.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.InterfaceC1645720sva
    public final String go() {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 21);
        tEBundleObtain.setInt("effectEngineType", 0);
        TEBundle tEBundleObtain2 = TEBundle.obtain();
        if (c2254311DLhLIZIZ.LL.callEffectInterfaceWithResult(tEBundleObtain, tEBundleObtain2) != 0) {
            return "";
        }
        String string = tEBundleObtain2.getString("Result");
        tEBundleObtain2.recycle();
        return string;
    }

    @Override // X.InterfaceC1645720sva
    public final void ho() {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 23);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setInt("ForceAlgorithmExecuteCount", 3);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC1645720sva
    public final void lk() {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 23);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setBool("LargeMattingModelEnable", false);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC1645720sva
    public final void oo() {
        LIZIZ().getClass();
        C2484209oO.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.InterfaceC1645720sva
    public final void so() {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 10);
        tEBundleObtain.setInt("FlagType", 9);
        tEBundleObtain.setInt("flag", 0);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
        c2254311DLhLIZIZ.LL.setSkeletonDetectCallback(null);
    }

    @Override // X.InterfaceC1645720sva
    public final void ko() {
    }

    @Override // X.InterfaceC1645720sva
    public final void Bo(InterfaceC1684900twm interfaceC1684900twm) {
        ((ArrayList) this.LJ).add(interfaceC1684900twm);
    }

    @Override // X.InterfaceC1645720sva
    public final void Co(InterfaceC1684900twm interfaceC1684900twm) {
        ((ArrayList) this.LJ).remove(interfaceC1684900twm);
    }

    @Override // X.InterfaceC1661400tKs
    public final void LJJLIIIJILLIZJL(List<ComposerInfo> list) {
        LIZ().LJJLIIIJILLIZJL(list);
    }

    @Override // X.InterfaceC1645720sva
    public final void LJJZZI(boolean z) {
        LIZIZ().getClass();
        C2484209oO.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.InterfaceC1645720sva
    public final void LJL(String str) {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 102);
        tEBundleObtain.setString("Language", str);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC1645720sva
    public final float LJLILLLLZI(String str) {
        return LIZIZ().LJIIIZ(str);
    }

    @Override // X.InterfaceC1645720sva
    public final int On(VEEffectFilterParam vEEffectFilterParam) {
        return this.LIZ.LJJJJJL(vEEffectFilterParam);
    }

    @Override // X.InterfaceC1645720sva
    public final void Qa(boolean z) {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.getClass();
        String str = C2254311DLh.LLJIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEffectBgmEnable... enable: ");
        sbLIZ.append(z);
        C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 28);
        tEBundleObtain.setBool("enable", z);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC1645720sva
    public final void Ra(boolean z) {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 41);
        tEBundleObtain.setBool("setBgmMute", z);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC1645720sva
    public final void Sa(C1AM5 c1am5) {
        LIZIZ().LJIIZILJ(c1am5);
    }

    @Override // X.InterfaceC1645720sva
    public final void Tn(MessageCenter.Listener listener) {
        synchronized (this.LJII) {
            try {
                ((ArrayList) this.LJII).remove(listener);
                if (this.LJFF && ((ArrayList) this.LJII).isEmpty()) {
                    LIZIZ().LLILLJJLI = null;
                    C2484209oO.LIZ("VEEffect", "Not supported yet.");
                    this.LJFF = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1645720sva
    public final void Un(String str) {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 40);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setString("Path", str);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC1645720sva
    public final void Vn(final C12JH c12jh) {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.LL.setSkeletonDetectCallback(new InterfaceC2178021ALw() { // from class: X.1ANp
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC2178021ALw
            public final void LIZ(VESkeletonInfo vESkeletonInfo) {
                VESkeleton[] info;
                C2178481ANq[] c2178481ANqArr = 0;
                c2178481ANqArr = 0;
                c2178481ANqArr = 0;
                if (vESkeletonInfo != null && (info = vESkeletonInfo.getInfo()) != null) {
                    if (info.length != 0) {
                        int length = info.length;
                        c2178481ANqArr = new C2178481ANq[length];
                        for (int i = 0; i < length; i++) {
                            info[i].getID();
                            c2178481ANqArr[i] = new Object() { // from class: X.1ANq
                            };
                        }
                    }
                }
                c12jh.LIZ(c2178481ANqArr);
            }
        });
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 10);
        tEBundleObtain.setInt("FlagType", 9);
        tEBundleObtain.setInt("flag", 1);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC1645720sva
    public final void Xn(C2177801ALa c2177801ALa) {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.LL.setFaceDetectListener(new C2178051ALz(c2177801ALa));
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 10);
        tEBundleObtain.setInt("FlagType", 2);
        tEBundleObtain.setInt("flag", 1);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC1645720sva
    public final void Yn(double d) {
        k kVar = this.LIZ.LIZIZ;
        synchronized (kVar.LJL) {
            try {
                C1DMH c1dmh = kVar.LJJZZIII;
                if (c1dmh != null && (c1dmh instanceof C2254331DLj)) {
                    ((C2254331DLj) c1dmh).LJIILLIIL((float) d);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1645720sva
    public final void Zn(C1AM5 c1am5) {
        LIZIZ().LIZIZ(c1am5);
    }

    @Override // X.InterfaceC1645720sva
    public final void enableEffect(boolean z) {
        LIZIZ().LJI(z);
    }

    @Override // X.InterfaceC1645720sva
    public final VEFrame jo(String str) {
        C1DMS c1dms = new C1DMS();
        c1dms.LIZIZ = str;
        c1dms.LIZ = 1;
        k kVar = this.LIZ.LIZIZ;
        kVar.getClass();
        if (c1dms.LIZ == 1) {
            a aVar = kVar.LJJIZ;
            String str2 = c1dms.LIZIZ;
            aVar.getClass();
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("effectInterfaceName", 25);
            tEBundleObtain.setInt("effectEngineType", 0);
            tEBundleObtain.setString("FrameKey", str2);
            return (VEFrame) aVar.LL.callEffectInterfaceWithResult(tEBundleObtain);
        }
        return null;
    }

    @Override // X.InterfaceC1645720sva
    public final void kk(float f) {
        this.LIZ.LJIJJ(f, 9);
    }

    @Override // X.InterfaceC1645720sva
    public final void lo(List<? extends VEEffectFilterParam> list) {
        this.LIZ.LIZIZ.LJJIZ.releasePreparedEffects(list);
    }

    @Override // X.InterfaceC1645720sva
    public final void mk(final InterfaceC1623210sLH interfaceC1623210sLH) {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.LL.setARTextParagraphContentCallback(new InterfaceC2177981ALs() { // from class: X.1DME
            @Override // X.InterfaceC2177981ALs
            public final void LIZ(int i) {
            }

            @Override // X.InterfaceC2177981ALs
            public final void LIZIZ(String[] strArr) {
                interfaceC1623210sLH.onResult(strArr);
            }
        });
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 10);
        tEBundleObtain.setInt("FlagType", 5);
        C2254311DLh.LJIIJ();
        tEBundleObtain.setInt("flag", 1);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC1645720sva
    public final void pauseEffectAudio(boolean z) {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 27);
        tEBundleObtain.setBool("effectaudio", z);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC1645720sva
    public final void setDetectInterval(int i) {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        Pair pair = (Pair) ((HashMap) c2254311DLhLIZIZ.LLILZLL).get(0);
        if (pair != null) {
            int iIntValue = ((Integer) pair.second).intValue();
            C1DMM c1dmm = (C1DMM) pair.first;
            c1dmm.setForInit(false);
            c1dmm.LIZ = i;
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("effectInterfaceName", 9);
            tEBundleObtain.setInt("AlgorithmIndex", iIntValue);
            TEBundle tEBundleLJI = C2254321DLi.LJI(c1dmm);
            if (tEBundleLJI != null) {
                tEBundleObtain.setHandle("AlgorithmParam", tEBundleLJI.getHandle());
            }
            c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
            if (tEBundleLJI != null) {
                tEBundleLJI.recycle();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    @Override // X.InterfaceC1645720sva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setFilter(java.lang.String r14) {
        /*
            r13 = this;
            com.ss.android.vesdk.VERecorder r6 = r13.LIZ
            r6.getClass()
            X.0meE r3 = new X.0meE
            r3.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r2 = 1
            java.lang.String r8 = ""
            if (r0 != 0) goto L87
            java.lang.String r0 = java.io.File.separator
            java.lang.String[] r1 = r14.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L87
            int r0 = r1.length
            int r0 = r0 - r2
            r5 = r1[r0]
        L20:
            r0 = 0
            float r1 = java.lang.Math.max(r0, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r0, r1)
            java.lang.String r0 = "iesve_verecorder_set_filter_click_idfilter_id"
            r3.LIZJ(r0, r5)
            java.lang.String r0 = "old"
            r3.LIZIZ(r2, r0)
            com.ss.android.vesdk.k r6 = r6.LIZIZ
            java.util.Map<java.lang.Integer, android.util.Pair<com.ss.android.vesdk.filterparam.VEBaseFilterParam, java.lang.Integer>> r1 = r6.LJJLIIIJLLLLLLLZ
            r0 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r7 = r1.get(r3)
            android.util.Pair r7 = (android.util.Pair) r7
            if (r7 == 0) goto L80
            java.lang.Object r10 = r7.first
            com.ss.android.vesdk.filterparam.VEColorFilterParam r10 = (com.ss.android.vesdk.filterparam.VEColorFilterParam) r10
            java.lang.Object r0 = r7.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
        L54:
            if (r14 != 0) goto L57
            r14 = r8
        L57:
            r10.leftFilterPath = r14
            r10.intensity = r4
            r10.useFilterResIntensity = r2
            if (r1 < 0) goto L6c
            gro.a r0 = r6.LJJIZ
            r0.updateTrackFilterParam(r1, r10)
        L64:
            java.util.Map<java.lang.Integer, android.util.Pair<com.ss.android.vesdk.filterparam.VEBaseFilterParam, java.lang.Integer>> r0 = r6.LJJLIIIJLLLLLLLZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r3, r7)
            goto L89
        L6c:
            gro.a r7 = r6.LJJIZ
            r8 = 0
            r11 = -1
            r9 = r8
            r12 = r11
            int r0 = r7.addTrackFilter(r8, r9, r10, r11, r12)
            android.util.Pair r7 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.<init>(r10, r0)
            goto L64
        L80:
            com.ss.android.vesdk.filterparam.VEColorFilterParam r10 = new com.ss.android.vesdk.filterparam.VEColorFilterParam
            r10.<init>()
            r1 = -1
            goto L54
        L87:
            r5 = r8
            goto L20
        L89:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb3
            r3.<init>()     // Catch: org.json.JSONException -> Lb3
            java.lang.String r0 = "filterId"
            r3.put(r0, r5)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r1 = "intensity"
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch: org.json.JSONException -> Lb3
            r3.put(r1, r0)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r1 = "tag"
            java.lang.String r0 = "setFilter"
            r3.put(r1, r0)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r1 = "resultCode"
            r0 = 0
            r3.put(r1, r0)     // Catch: org.json.JSONException -> Lb3
            java.lang.String r1 = "vesdk_event_recorder_single_filter"
            java.lang.String r0 = "business"
            ud7.b.LIZIZ(r1, r0, r3, r2)     // Catch: org.json.JSONException -> Lb3
            return
        Lb3:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aj7.b.setFilter(java.lang.String):void");
    }

    @Override // X.InterfaceC1645720sva
    public final void setHandDetectLowpower(boolean z) {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.getClass();
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 23);
        tEBundleObtain.setInt("effectEngineType", 0);
        tEBundleObtain.setBool("HandDetectLowpowerEnable", z);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC1645720sva
    public final void setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback) {
        int i;
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.LL.setStickerRequestCallback(iStickerRequestCallback);
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("effectInterfaceName", 10);
        tEBundleObtain.setInt("FlagType", 7);
        if (C2254311DLh.LJIIJ() && iStickerRequestCallback == null) {
            i = 0;
        } else {
            i = 1;
        }
        tEBundleObtain.setInt("flag", i);
        c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
    }

    @Override // X.InterfaceC1645720sva
    public final void to(MessageCenter.Listener listener) {
        synchronized (this.LJII) {
            try {
                if (!((ArrayList) this.LJII).contains(listener)) {
                    ((ArrayList) this.LJII).add(listener);
                }
                if (!this.LJFF && (!((ArrayList) this.LJII).isEmpty())) {
                    this.LJFF = true;
                    LIZIZ().LLILLJJLI = this.LJIIIIZZ;
                    C2484209oO.LIZ("VEEffect", "Not supported yet.");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1645720sva
    public final void uo(List<? extends VEEffectFilterParam> list) {
        this.LIZ.LIZIZ.LJJIZ.prepareEffects(list);
    }

    @Override // X.InterfaceC1645720sva
    public final void xo(final C1625110sOL c1625110sOL) {
        LIZIZ().LJJIII(new InterfaceC2177981ALs() { // from class: X.1DMG
            @Override // X.InterfaceC2177981ALs
            public final void LIZIZ(String[] strArr) {
            }

            @Override // X.InterfaceC2177981ALs
            public final void LIZ(int i) {
                c1625110sOL.onResult(i);
            }
        });
    }

    @Override // X.InterfaceC1645720sva
    public final void yo(float f) {
        this.LIZ.LJIJJ(f, 1);
    }

    @Override // X.InterfaceC1645720sva
    public final void Ao(float f, float f2) {
        k kVar = this.LIZ.LIZIZ;
        kVar.getClass();
        C1DM1 c1dm1 = new C1DM1();
        c1dm1.LIZ = new C1DM7(f, f2);
        kVar.LJJIZ.LJIIL(c1dm1);
    }

    @Override // X.InterfaceC1645720sva
    public final void Bh(String str, Map<Integer, Float> map) {
        VEReshapeFilterParam vEReshapeFilterParam;
        int iAddTrackFilter;
        k kVar = this.LIZ.LIZIZ;
        Pair pair = (Pair) ((HashMap) kVar.LJJLIIIJLLLLLLLZ).get(13);
        if (pair != null) {
            vEReshapeFilterParam = (VEReshapeFilterParam) pair.first;
            iAddTrackFilter = ((Integer) pair.second).intValue();
        } else {
            vEReshapeFilterParam = new VEReshapeFilterParam();
            iAddTrackFilter = -1;
        }
        if (str == null) {
            str = "";
        }
        vEReshapeFilterParam.resPath = str;
        for (Map.Entry<Integer, Float> entry : map.entrySet()) {
            if (entry.getKey().intValue() == 4) {
                vEReshapeFilterParam.eyeIntensity = entry.getValue().floatValue();
            } else if (entry.getKey().intValue() == 5) {
                vEReshapeFilterParam.cheekIntensity = entry.getValue().floatValue();
            }
        }
        if (iAddTrackFilter >= 0) {
            kVar.LJJIZ.updateTrackFilterParam(iAddTrackFilter, vEReshapeFilterParam);
        } else {
            iAddTrackFilter = kVar.LJJIZ.addTrackFilter(0, 0, vEReshapeFilterParam, -1, -1);
        }
        if (pair == null) {
            pair = new Pair(vEReshapeFilterParam, Integer.valueOf(iAddTrackFilter));
        }
        ((HashMap) kVar.LJJLIIIJLLLLLLLZ).put(13, pair);
    }

    @Override // X.InterfaceC1645720sva
    public final boolean Ch(VETouchPointer vETouchPointer, int i) {
        return LIZIZ().LJIILIIL(vETouchPointer, i);
    }

    @Override // X.InterfaceC1645720sva
    public final void Do(float f, float f2) {
        k kVar = this.LIZ.LIZIZ;
        kVar.getClass();
        kVar.LJJIZ.LJIIL(C1DM1.LIZ(f, f2));
    }

    @Override // X.InterfaceC1661400tKs
    public final void L4(List<ComposerInfo> list, int i) {
        LIZ().L4(list, i);
    }

    @Override // X.InterfaceC1645720sva
    public final int[] LJJLL(String str, String str2) {
        return LIZIZ().LJFF(str, str2);
    }

    @Override // X.InterfaceC1645720sva
    public final int LJJZ(String str, String str2) {
        return LIZIZ().LIZJ(str, str2);
    }

    @Override // X.InterfaceC1645720sva
    public final void LJLI(double d, double[] dArr) {
        LIZIZ().LJJIIZI(d, dArr);
    }

    @Override // X.InterfaceC1645720sva
    public final void Nn(int i, String str) {
        VEBeautyFilterParam vEBeautyFilterParam;
        int iAddTrackFilter;
        String str2;
        VERecorder vERecorder = this.LIZ;
        vERecorder.getClass();
        C1404320meE c1404320meE = new C1404320meE();
        c1404320meE.LIZIZ(i, "iesve_verecorder_set_beauty_algorithm");
        c1404320meE.LIZIZ(1, "old");
        k kVar = vERecorder.LIZIZ;
        Pair pair = (Pair) ((HashMap) kVar.LJJLIIIJLLLLLLLZ).get(12);
        if (pair != null) {
            vEBeautyFilterParam = (VEBeautyFilterParam) pair.first;
            iAddTrackFilter = ((Integer) pair.second).intValue();
        } else {
            vEBeautyFilterParam = new VEBeautyFilterParam();
            iAddTrackFilter = -1;
        }
        if (i == 0 && iAddTrackFilter >= 0) {
            ((HashMap) kVar.LJJLIIIJLLLLLLLZ).remove(12);
            kVar.LJJIZ.removeTrackFilter(iAddTrackFilter);
        } else {
            vEBeautyFilterParam.beautyType = i;
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            vEBeautyFilterParam.beautyName = str2;
            if (iAddTrackFilter >= 0) {
                kVar.LJJIZ.updateTrackFilterParam(iAddTrackFilter, vEBeautyFilterParam);
            } else {
                iAddTrackFilter = kVar.LJJIZ.addTrackFilter(0, 0, vEBeautyFilterParam, -1, -1);
            }
            if (pair == null) {
                pair = new Pair(vEBeautyFilterParam, Integer.valueOf(iAddTrackFilter));
            }
            ((HashMap) kVar.LJJLIIIJLLLLLLLZ).put(12, pair);
        }
        if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("beautyFaceType", String.valueOf(i));
                jSONObject.put("strBeautyFaceRes", str);
                jSONObject.put("resultCode", 0);
                ud7.b.LIZIZ("vesdk_event_recorder_beauty_face", "business", jSONObject, true);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    @Override // X.InterfaceC1645720sva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Pa(float r6, float r7) {
        /*
            r5 = this;
            com.ss.android.vesdk.VERecorder r2 = r5.LIZ
            r2.getClass()
            X.0meE r1 = new X.0meE
            r1.<init>()
            java.lang.String r0 = "iesve_verecorder_set_beauty_level"
            r1.LIZ(r6, r0)
            r3 = 1
            java.lang.String r0 = "old"
            r1.LIZIZ(r3, r0)
            com.ss.android.vesdk.k r4 = r2.LIZIZ
            java.util.Map<java.lang.Integer, android.util.Pair<com.ss.android.vesdk.filterparam.VEBaseFilterParam, java.lang.Integer>> r1 = r4.LJJLIIIJLLLLLLLZ
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L54
            java.lang.Object r2 = r0.first
            com.ss.android.vesdk.filterparam.VEBeautyFilterParam r2 = (com.ss.android.vesdk.filterparam.VEBeautyFilterParam) r2
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            if (r1 < 0) goto L54
            r2.smoothIntensity = r6
            r2.brightenIntensity = r7
            gro.a r0 = r4.LJJIZ
            int r4 = r0.updateTrackFilterParam(r1, r2)
        L41:
            com.ss.android.vesdk.VEConfigCenter r2 = com.ss.android.vesdk.VEConfigCenter.getInstance()
            java.lang.String r1 = "ve_enable_applog_app_and_frequency_control"
            r0 = 0
            java.lang.Boolean r0 = r2.getValue(r1, r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L80
            goto L57
        L54:
            r4 = -105(0xffffffffffffff97, float:NaN)
            goto L41
        L57:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7c
            r2.<init>()     // Catch: org.json.JSONException -> L7c
            java.lang.String r1 = "fSmoothIntensity"
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch: org.json.JSONException -> L7c
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L7c
            java.lang.String r1 = "fBrightenIntensity"
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch: org.json.JSONException -> L7c
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L7c
            java.lang.String r0 = "resultCode"
            r2.put(r0, r4)     // Catch: org.json.JSONException -> L7c
            java.lang.String r1 = "vesdk_event_recorder_beauty_face_intensity"
            java.lang.String r0 = "business"
            ud7.b.LIZIZ(r1, r0, r2, r3)     // Catch: org.json.JSONException -> L7c
            return
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aj7.b.Pa(float, float):void");
    }

    @Override // X.InterfaceC1645720sva
    public final void Q7(String str, float f) {
        this.LIZ.LJJIFFI(str, f, f);
    }

    @Override // X.InterfaceC1661400tKs
    public final void R1(List<ComposerInfo> list, int i) {
        LIZ().R1(list, i);
    }

    @Override // X.InterfaceC1645720sva
    public final void Rn(String str, String str2) {
        this.LIZ.LJIL(str, str2);
    }

    @Override // X.InterfaceC1645720sva
    public final int Sn(List<String> list, List<? extends VEFrame> list2) {
        return LIZIZ().LIZLLL(list, list2);
    }

    @Override // X.InterfaceC1645720sva
    public final void co(float f, float f2) {
        k kVar = this.LIZ.LIZIZ;
        kVar.getClass();
        EnumC2254481DLy enumC2254481DLy = EnumC2254481DLy.DB_CLICK;
        EnumC2254471DLx enumC2254471DLx = EnumC2254471DLx.TAP;
        C1DM1 c1dm1 = new C1DM1();
        c1dm1.LIZ = new C1DM9(enumC2254481DLy, enumC2254471DLx, f, f2);
        kVar.LJJIZ.LJIIL(c1dm1);
    }

    @Override // X.InterfaceC1645720sva
    /* JADX INFO: renamed from: do */
    public final void mo59do(float f, float f2) {
        k kVar = this.LIZ.LIZIZ;
        kVar.getClass();
        C1DM1 c1dm1 = new C1DM1();
        c1dm1.LIZ = new C1DM8(f, f2);
        kVar.LJJIZ.LJIIL(c1dm1);
    }

    @Override // X.InterfaceC1661400tKs
    public final void h(List<ComposerInfo> list, int i) {
        LIZ().h(list, i);
    }

    @Override // X.InterfaceC1645720sva
    public final int io(int i, String[] strArr) {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.getClass();
        if (i > 0 && strArr != null && strArr.length == i) {
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("effectInterfaceName", 17);
            tEBundleObtain.setInt("effectEngineType", 0);
            tEBundleObtain.setStringArray("node paths", strArr);
            return c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
        }
        return -100;
    }

    @Override // X.InterfaceC1645720sva
    public final int mo(int i, String[] strArr) {
        return LIZIZ().LJIILL(i, strArr);
    }

    @Override // X.InterfaceC1661400tKs
    public final void n0(List<ComposerInfo> list, int i) {
        LIZ().n0(list, i);
    }

    @Override // X.InterfaceC1645720sva
    public final void processTouchEvent(float f, float f2) {
        LIZIZ().LJIIL(C1DM1.LIZ(f, f2));
    }

    @Override // X.InterfaceC1645720sva
    public final int qo(List<String> list, List<? extends VEFrame> list2) {
        return LIZIZ().LIZLLL(list, list2);
    }

    @Override // X.InterfaceC1645720sva
    public final void setFilter(String str, float f) {
        this.LIZ.LJJII(f, str);
    }

    @Override // X.InterfaceC1645720sva
    public final void setRenderCacheString(String str, String str2) {
        LIZIZ().LJJ(str, str2);
    }

    @Override // X.InterfaceC1645720sva
    public final int vo(String str, float f) {
        return LIZIZ().LJJIJIIJI(str, "Filter_intensity", f);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.118H] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0twl] */
    public b(C1DKV c1dkv, VERecorder vERecorder, Function0 function0) {
        this.LIZ = vERecorder;
        this.LIZIZ = function0;
        this.LIZJ = c1dkv;
        if (!c1dkv.LJJIIJ().invoke().booleanValue()) {
            po();
        }
        this.LJIIJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 7));
    }

    @Override // X.InterfaceC1645720sva
    public final void LJLJL(int i, int i2, InterfaceC2173471A4j interfaceC2173471A4j) {
        this.LIZ.LJJIJIIJI(i, i2, false, true, interfaceC2173471A4j, false);
    }

    @Override // X.InterfaceC1645720sva
    public final void Pn(boolean z, boolean z2, boolean z3) {
        boolean z4;
        VERecorder vERecorder = this.LIZ;
        if (!z && !z2 && !z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        vERecorder.LJJJJL(z, z4, z2, z3);
        if (z) {
            VERecorder vERecorder2 = this.LIZ;
            VEPrePlayParams vEPrePlayParams = new VEPrePlayParams(-1, true, 0);
            vERecorder2.getClass();
            C2484209oO.LJI("VERecorder", "startPrePlay");
            vERecorder2.LIZIZ.LJJIZ(vEPrePlayParams);
            return;
        }
        this.LIZ.LJJJJI(new InterfaceC2183551Acz() { // from class: X.1DMQ
            @Override // X.InterfaceC2183551Acz
            public final void onDone(int i) {
            }
        });
    }

    @Override // X.InterfaceC1645720sva
    public final void Qn(String str, String str2, String str3) {
        this.LIZ.LJJ(str, str2, str3);
    }

    @Override // X.InterfaceC1645720sva
    public final void bo(int i, int i2, C2177891ALj c2177891ALj) {
        this.LIZ.LJJIJ(i, i2, c2177891ALj, false, null);
    }

    @Override // X.InterfaceC1661400tKs
    public final void i2(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        LIZ().i2(list, list2, i);
    }

    @Override // X.InterfaceC1645720sva
    public final void nk(String[] strArr, double[] dArr, boolean[] zArr) {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        new VECherEffectParam(strArr, dArr, zArr);
        c2254311DLhLIZIZ.getClass();
        C2484209oO.LIZ("VEEffect", "Not supported yet.");
    }

    @Override // X.InterfaceC1645720sva
    public final void pg(String str, float f, float f2) {
        VEMakeUpFilterParam vEMakeUpFilterParam;
        int iAddTrackFilter;
        String str2;
        VERecorder vERecorder = this.LIZ;
        vERecorder.getClass();
        C1404320meE c1404320meE = new C1404320meE();
        c1404320meE.LIZ(f, "iesve_verecorder_set_lipstick_and_blusher_level");
        c1404320meE.LIZIZ(1, "old");
        k kVar = vERecorder.LIZIZ;
        Pair pair = (Pair) ((HashMap) kVar.LJJLIIIJLLLLLLLZ).get(26);
        if (pair != null) {
            vEMakeUpFilterParam = (VEMakeUpFilterParam) pair.first;
            iAddTrackFilter = ((Integer) pair.second).intValue();
        } else {
            vEMakeUpFilterParam = new VEMakeUpFilterParam();
            iAddTrackFilter = -1;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        vEMakeUpFilterParam.resPath = str2;
        vEMakeUpFilterParam.lipIntensity = f;
        vEMakeUpFilterParam.blusherIntensity = f2;
        if (iAddTrackFilter >= 0) {
            kVar.LJJIZ.updateTrackFilterParam(iAddTrackFilter, vEMakeUpFilterParam);
        } else {
            iAddTrackFilter = kVar.LJJIZ.addTrackFilter(0, 0, vEMakeUpFilterParam, -1, -1);
        }
        if (pair == null) {
            pair = new Pair(vEMakeUpFilterParam, Integer.valueOf(iAddTrackFilter));
        }
        ((HashMap) kVar.LJJLIIIJLLLLLLLZ).put(26, pair);
        if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("strResPath", str);
                jSONObject.put("fLipstickIntensity", String.valueOf(f));
                jSONObject.put("fBlusherIntensity", String.valueOf(f));
                jSONObject.put("resultCode", 0);
                ud7.b.LIZIZ("vesdk_event_recorder_face_make_up_intensity", "business", jSONObject, true);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC1645720sva
    public final void ya(String str, float f, float f2) {
        this.LIZ.LJJIFFI(str, f, f2);
    }

    @Override // X.InterfaceC1645720sva
    public final void LJJZZIII(double d, double d2, double d3, double d4) {
        LIZIZ().LJJIIJZLJL(d, d2, d3, d4);
    }

    @Override // X.InterfaceC1645720sva
    public final void LJLIIL(double d, double d2, double d3, double d4) {
        LIZIZ().LJJIIZ(d, d2, d3, d4);
    }

    @Override // X.InterfaceC1645720sva
    public final void LJLIL(boolean z, boolean z2, boolean z3, boolean z4) {
        LIZIZ().LJJII(z, z2, z3, z4);
    }

    @Override // X.InterfaceC1645720sva
    public final void LJLJI(double d, double d2, double d3, double d4) {
        LIZIZ().LJJIIJ(d, d2, d3, d4);
    }

    @Override // X.InterfaceC1645720sva
    public final void LJLJJL(int i, int i2, String str, String str2) {
        LIZIZ().LJJIJ(i, i2, str, str2);
    }

    @Override // X.InterfaceC1645720sva
    public final int Y9(String[] strArr, int i, String[] strArr2, int i2) {
        C2254311DLh c2254311DLhLIZIZ = LIZIZ();
        c2254311DLhLIZIZ.getClass();
        if (i2 > 0 && i == strArr.length && i2 == strArr2.length) {
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("effectInterfaceName", 19);
            tEBundleObtain.setInt("effectEngineType", 0);
            tEBundleObtain.setStringArray("node paths old", strArr);
            tEBundleObtain.setStringArray("node paths new", strArr2);
            return c2254311DLhLIZIZ.LL.callEffectInterface(tEBundleObtain);
        }
        return -100;
    }

    @Override // X.InterfaceC1645720sva
    public final void no(float f, float f2, int i, int i2) {
        this.LIZ.LJJIJL(f, f2, i, i2);
    }

    @Override // X.InterfaceC1645720sva
    public final void sendEffectMsg(int i, long j, long j2, String str) {
        if (!this.LIZJ.LJIIZILJ().LJII()) {
            C0CNO.LIZLLL(0L, new C1DMP(this, i, j, j2, str));
        } else {
            LIZJ(this, i, j, j2, str);
        }
    }

    public static void LIZJ(b bVar, final int i, final long j, final long j2, final String str) {
        EnumC1687420u0q enumC1687420u0q = EnumC1687420u0q.Async_GLThread;
        C2254311DLh c2254311DLhLIZIZ = bVar.LIZIZ();
        c2254311DLhLIZIZ.LL.callEffectAPI(new VERecorder.IVECallEffectAPIRunnable() { // from class: X.0jaq
            @Override // com.ss.android.vesdk.VERecorder.IVECallEffectAPIRunnable
            public final void run(long j3) {
                if (j3 >= 0) {
                    EffectWrapper.nativeSendMessage(j3, i, j, j2, str);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("client call callEffectAPI directly with handle: ");
                    sbLIZ.append(j3);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }, enumC1687420u0q, "client call callEffectAPI directly");
    }

    @Override // X.InterfaceC1645720sva
    public final void fo(float f, float f2, float f3, float f4, float f5) {
        this.LIZ.LJJIJIL(f, f2, f3, f4, f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    @Override // X.InterfaceC1645720sva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ro(java.lang.String r11, java.lang.String r12, float r13, float r14, float r15) {
        /*
            r10 = this;
            com.ss.android.vesdk.VERecorder r3 = r10.LIZ
            r3.getClass()
            X.0meE r2 = new X.0meE
            r2.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r6 = 1
            java.lang.String r8 = ""
            if (r0 != 0) goto Lba
            java.lang.String r0 = java.io.File.separator
            java.lang.String[] r1 = r11.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto Lba
            int r0 = r1.length
            int r0 = r0 - r6
            r7 = r1[r0]
        L20:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto Lb7
            java.lang.String r0 = java.io.File.separator
            java.lang.String[] r1 = r12.split(r0)
            int r0 = r1.length
            if (r0 <= 0) goto Lb7
            int r0 = r1.length
            int r0 = r0 - r6
            r4 = r1[r0]
        L33:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 <= 0) goto L3b
            r14 = 1065353216(0x3f800000, float:1.0)
        L3b:
            int r0 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r0 > 0) goto L40
            r5 = r15
        L40:
            r1 = 0
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L47
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
        L47:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4d
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L4d:
            java.lang.String r0 = "iesve_verecorder_set_filter_slide_left_id"
            r2.LIZJ(r0, r7)
            java.lang.String r0 = "iesve_verecorder_set_filter_slide_right_id"
            r2.LIZJ(r0, r4)
            java.lang.String r0 = "old"
            r2.LIZIZ(r6, r0)
            com.ss.android.vesdk.k r3 = r3.LIZIZ
            java.util.Map<java.lang.Integer, android.util.Pair<com.ss.android.vesdk.filterparam.VEBaseFilterParam, java.lang.Integer>> r1 = r3.LJJLIIIJLLLLLLLZ
            r0 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r4 = r1.get(r2)
            android.util.Pair r4 = (android.util.Pair) r4
            if (r4 == 0) goto Lb0
            java.lang.Object r7 = r4.first
            com.ss.android.vesdk.filterparam.VEColorFilterParam r7 = (com.ss.android.vesdk.filterparam.VEColorFilterParam) r7
            java.lang.Object r0 = r4.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
        L7b:
            if (r11 != 0) goto L7e
            r11 = r8
        L7e:
            r7.leftFilterPath = r11
            if (r12 != 0) goto L83
            r12 = r8
        L83:
            r7.rightFilterPath = r12
            r7.position = r13
            r7.intensity = r14
            r7.rightIntensity = r5
            r7.useFilterV3 = r6
            if (r1 < 0) goto L9c
            gro.a r0 = r3.LJJIZ
            r0.updateTrackFilterParam(r1, r7)
        L94:
            java.util.Map<java.lang.Integer, android.util.Pair<com.ss.android.vesdk.filterparam.VEBaseFilterParam, java.lang.Integer>> r0 = r3.LJJLIIIJLLLLLLLZ
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r2, r4)
            return
        L9c:
            gro.a r4 = r3.LJJIZ
            r5 = 0
            r8 = -1
            r6 = r5
            r9 = r8
            int r0 = r4.addTrackFilter(r5, r6, r7, r8, r9)
            android.util.Pair r4 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.<init>(r7, r0)
            goto L94
        Lb0:
            com.ss.android.vesdk.filterparam.VEColorFilterParam r7 = new com.ss.android.vesdk.filterparam.VEColorFilterParam
            r7.<init>()
            r1 = -1
            goto L7b
        Lb7:
            r4 = r8
            goto L33
        Lba:
            r7 = r8
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: aj7.b.ro(java.lang.String, java.lang.String, float, float, float):void");
    }
}
