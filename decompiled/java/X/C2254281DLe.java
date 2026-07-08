package X;

import com.bef.effectsdk.EffectWrapper;
import com.bef.effectsdk.message.MessageCenter;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ugc.aweme.camera.core.api.effect.IMComposerInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VETouchPointer;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.model.VEPrePlayParams;
import gro.a;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS15S0000001_35;
import kotlin.jvm.internal.AwS20S0002000_35;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1DLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254281DLe implements InterfaceC1625060sOG {
    public final C1DK1 LIZ;
    public final InterfaceC1404330meF LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(281));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3838));
    public VEEffectFilterParam LJ;
    public boolean LJFF;
    public final C2252321DDq LJI;

    @Override // X.InterfaceC1625060sOG
    public final boolean LJFF() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.InterfaceC1625060sOG
    public final float LJIIIIZZ() {
        return this.LIZ.LIZIZ().LIZIZ.LJJJ.LJII("previewAvgRenderFps");
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJIJ() {
        this.LIZIZ.LJ(C13BV.INSTANCE, EnumC1404340meG.FILTER);
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJLIIIL() {
        this.LIZ.LIZIZ().LJIJ();
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJLJJI() {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            a aVarLJIIL = c1dk1.LIZIZ().LJIIL();
            aVarLJIIL.getClass();
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("effectInterfaceName", 101);
            tEBundleObtain.setBool("isFinished", true);
            aVarLJIIL.LL.callEffectInterface(tEBundleObtain);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final int LJLJLJ() {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().getClass();
            C2484209oO.LIZ("VEEffect", "Not supported yet.");
        }
        return -200;
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJLL() {
        this.LIZ.LJFF(AFwS283S0000000_35.get$arr$(120));
    }

    @Override // X.InterfaceC1625060sOG
    public final VEDisplaySettings s1() {
        VEDisplaySettings vEDisplaySettingsLJIIIZ;
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            vEDisplaySettingsLJIIIZ = c1dk1.LIZIZ().LJIIIZ();
        }
        return vEDisplaySettingsLJIIIZ;
    }

    @Override // X.InterfaceC1625060sOG
    public final C05YD<Boolean> LIZIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1625060sOG
    public final InterfaceC1404330meF LJIIL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1625060sOG
    public final VEEffectFilterParam LLILIL() {
        return this.LJ;
    }

    @Override // X.InterfaceC1625060sOG
    public final void D4(VEDisplaySettings vEDisplaySettings) {
        Integer numValueOf;
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJJI(vEDisplaySettings);
            VESize renderSize = vEDisplaySettings.getRenderSize();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestedRender=");
            Integer numValueOf2 = null;
            if (renderSize == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(renderSize.width);
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append('x');
            if (renderSize != null) {
                numValueOf2 = Integer.valueOf(renderSize.height);
            }
            sbLIZ.append(numValueOf2);
            c1dk1.LJ("set_display_settings", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void L3(final AwS613S0100000_34 awS613S0100000_34) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            C1DIC c1dic = c1dk1.LJI;
            if (c1dic != null) {
                c1dic.LJIIIZ(new InterfaceC2186211AhH() { // from class: X.1DId
                    @Override // X.InterfaceC2186211AhH
                    public final /* synthetic */ void LIZ(float[] fArr) {
                        awS613S0100000_34.invoke(fArr);
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJI(float f) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LJI(new AwS15S0000001_35(f, 2));
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJIIJ(InterfaceC1631630sYr<? super Long, ? super Long, ? super Long, ? super String, Unit> interfaceC1631630sYr) {
        ((List) this.LIZJ.getValue()).remove(interfaceC1631630sYr);
        if (((List) this.LIZJ.getValue()).isEmpty() && this.LJFF) {
            this.LJFF = false;
            MessageCenter.removeListener((MessageCenter.Listener) this.LIZLLL.getValue());
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJIIJJI(InterfaceC1631630sYr<? super Long, ? super Long, ? super Long, ? super String, Unit> interfaceC1631630sYr) {
        if (!this.LJFF) {
            this.LJFF = true;
            MessageCenter.setListener((MessageCenter.Listener) this.LIZLLL.getValue());
        }
        ((List) this.LIZJ.getValue()).add(interfaceC1631630sYr);
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJIILIIL(final InterfaceC2254621DMm interfaceC2254621DMm) {
        C1DK1 c1dk1 = this.LIZ;
        InterfaceC2177981ALs interfaceC2177981ALs = new InterfaceC2177981ALs() { // from class: X.1DMF
            @Override // X.InterfaceC2177981ALs
            public final void LIZIZ(String[] strArr) {
            }

            @Override // X.InterfaceC2177981ALs
            public final void LIZ(int i) {
                interfaceC2254621DMm.onResult(i);
            }
        };
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJJIII(interfaceC2177981ALs);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJIILJJIL(C1621980sJI c1621980sJI) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LIZIZ(c1621980sJI);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJIILL(VEPrePlayParams vEPrePlayParams) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            VERecorder vERecorderLIZIZ = c1dk1.LIZIZ();
            vERecorderLIZIZ.getClass();
            C2484209oO.LJI("VERecorder", "startPrePlay");
            vERecorderLIZIZ.LIZIZ.LJJIZ(vEPrePlayParams);
            c1dk1.LJIILIIL = true;
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJIIZILJ(Effect effect) {
        String unzipPath;
        VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
        if (effect != null) {
            unzipPath = effect.getUnzipPath();
        } else {
            unzipPath = null;
        }
        vEEffectFilterParam.effectPath = unzipPath;
        On(vEEffectFilterParam);
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJJZZI(boolean z) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().getClass();
            C2484209oO.LIZ("VEEffect", "Not supported yet.");
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJL(String str) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            a aVarLJIIL = c1dk1.LIZIZ().LJIIL();
            aVarLJIIL.getClass();
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("effectInterfaceName", 102);
            tEBundleObtain.setString("Language", str);
            aVarLJIIL.LL.callEffectInterface(tEBundleObtain);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final float LJLILLLLZI(String str) {
        return this.LIZ.LIZIZ().LJIIL().LJIIIZ(str);
    }

    @Override // X.InterfaceC1625060sOG
    public final void O2(float f) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJJIJIL(f);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final int On(VEEffectFilterParam vEEffectFilterParam) {
        int iLJJJJJL;
        this.LJ = vEEffectFilterParam;
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            iLJJJJJL = c1dk1.LIZIZ().LJJJJJL(vEEffectFilterParam);
        }
        return iLJJJJJL;
    }

    @Override // X.InterfaceC1625060sOG
    public final void Sa(C1AM5 c1am5) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJIIZILJ(c1am5);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void setLanguage(String str) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            a aVarLJIIL = c1dk1.LIZIZ().LJIIL();
            aVarLJIIL.getClass();
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("effectInterfaceName", 60);
            tEBundleObtain.setString("EffectConfigKey", "languageCode");
            tEBundleObtain.setString("EffectConfigValue", str);
            aVarLJIIL.LL.callEffectInterface(tEBundleObtain);
        }
    }

    public C2254281DLe(C1DK1 c1dk1, C1404350meH c1404350meH) {
        this.LIZ = c1dk1;
        this.LIZIZ = c1404350meH;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJI(true);
        }
        this.LJI = c1dk1.LJIIIZ;
    }

    @Override // X.InterfaceC1625060sOG
    public final void Ch(VETouchPointer vETouchPointer, int i) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJIILIIL(vETouchPointer, i);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJ(Float f, String str) {
        float fFloatValue;
        C1DK1 c1dk1 = this.LIZ;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.8f;
        }
        c1dk1.LIZIZ().LJJII(fFloatValue, str);
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJLI(double d, double[] dArr) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJJIIZI(d, dArr);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void P3(float[] fArr, double d) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJIL(fArr, d);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void Q4(int i, int i2) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LJI(new AwS20S0002000_35(i, i2, 4));
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final int processTouchEvent(float f, float f2) {
        int iLJIIL;
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            iLJIIL = c1dk1.LIZIZ().LJIIL().LJIIL(C1DM1.LIZ(f, f2));
        }
        return iLJIIL;
    }

    @Override // X.InterfaceC1625060sOG
    public final void setRenderCacheString(String str, String str2) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJJ(str, str2);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LIZJ(float f, String str, String str2) {
        this.LIZIZ.LJFF(Collections.singletonList(new IMComposerInfo(str, str2, null, 12)), EnumC1404340meG.FILTER);
    }

    @Override // X.InterfaceC1625060sOG
    public final int LJIIIZ(float f, float f2, int i) {
        int iLJJIJL;
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            iLJJIJL = c1dk1.LIZIZ().LJJIJL(f, f2, i, 0);
        }
        return iLJJIJL;
    }

    @Override // X.InterfaceC1625060sOG
    public final void LIZ(boolean z, boolean z2, boolean z3, boolean z4) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJJJJL(z, z2, z3, z4);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJII(boolean z, boolean z2, int i, long j) {
        int i2;
        if (z2) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        C1DK1 c1dk1 = this.LIZ;
        int i3 = (int) 0;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJJIIZI(i3, -1, i2, -1, "");
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final int LJIILLIIL(float f, float f2, float f3, float f4) {
        int iLJJIJIL;
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            iLJJIJIL = c1dk1.LIZIZ().LJJIJIL(f, f2, f3, f4, 1.0f);
        }
        return iLJJIJIL;
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJJZZIII(double d, double d2, double d3, double d4) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJJIIJZLJL(d, d2, d3, d4);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJLIIL(double d, double d2, double d3, double d4) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJJIIZ(d, d2, d3, d4);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJLIL(boolean z, boolean z2, boolean z3, boolean z4) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJJII(z, z2, z3, z4);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJLJI(double d, double d2, double d3, double d4) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJJIIJ(d, d2, d3, d4);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LJLJJL(int i, int i2, String str, String str2) {
        C1DK1 c1dk1 = this.LIZ;
        synchronized (c1dk1) {
            c1dk1.LIZIZ().LJIIL().LJJIJ(i, i2, str, str2);
        }
    }

    @Override // X.InterfaceC1625060sOG
    public final void LIZLLL(final long j, final long j2, final long j3, final String str, EnumC1687420u0q enumC1687420u0q) {
        C1DK1 c1dk1 = this.LIZ;
        c1dk1.LIZIZ().LJIIL().LL.callEffectAPI(new VERecorder.IVECallEffectAPIRunnable() { // from class: X.1DMK
            @Override // com.ss.android.vesdk.VERecorder.IVECallEffectAPIRunnable
            public final void run(long j4) {
                EffectWrapper.nativeSendMessage(j4, j, j2, j3, str);
            }
        }, enumC1687420u0q, "IM Call Effect API directly");
    }
}
