package X;

import android.os.Build;
import android.view.Window;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.setting.performance.videoquality.HDRCameraConfig;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import ge.i;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.Intrinsics;
import mn3.e0;

/* JADX INFO: renamed from: X.0t1V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649390t1V extends i<InterfaceC1649220t1E, C1649340t1Q, C1649360t1S, C1649430t1Z> implements InterfaceC1649220t1E, InterfaceC379610EuV {
    public static final C1649420t1Y LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final h0<Boolean> LLJJIJIIJIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0t1Y] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1649390t1V.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1649390t1V.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C2217381BqS(C1649390t1V.class, "frontFlashApi", "getFrontFlashApi()Lcom/ss/android/ugc/gamora/recorder/frontflash/FrontFlashApiComponent;", 0)};
        LLJJIJIL = new Object() { // from class: X.0t1Y
        };
    }

    public InterfaceC1649220t1E H4() {
        return this;
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLJILLL.getValue(this, LLJJJ[0]);
    }

    public final InterfaceC1650620t3U O4() {
        return (InterfaceC1650620t3U) this.LLJJI.getValue(this, LLJJJ[2]);
    }

    @Override // X.InterfaceC1649220t1E
    public void ev1() {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("afterCameraModeSwitch: needRestartPreview: ");
        sbLIZ.append(this.LLJJIII);
        sbLIZ.append(' ');
        C201955140j.LIZLLL(c201967140v, "HDRCameraComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJIII) {
            this.LLJJIII = false;
            getCameraApiComponent().St2().R4();
        }
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLJJ.getValue(this, LLJJJ[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1649360t1S> o2() {
        return AFwS214S0000000_25.get$arr$(139);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1649430t1Z> w2() {
        return AFwS214S0000000_25.get$arr$(140);
    }

    private final boolean T4() {
        return Intrinsics.LJFF(getCameraApiComponent().ci0().getValue(), Boolean.TRUE);
    }

    public final void No1() {
        int flashMode = getCameraApiComponent().getFlashMode();
        if (flashMode != 0) {
            getCameraApiComponent().qh(flashMode);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (T4() && this.LLJJIJI) {
            getCameraApiComponent().QN2(false);
            this.LLJJIJI = false;
            k5(true);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        Window window;
        super.onStop();
        if (Build.VERSION.SDK_INT >= 26 && (window = getActivity().getWindow()) != null) {
            window.setColorMode(0);
        }
        this.LLJJIJI = true;
    }

    @Override // X.InterfaceC1649220t1E
    public boolean x21() {
        return C0CHQ.LIZ().LJJIIZI().LJIIL();
    }

    public h0<Boolean> K4() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1649220t1E
    public /* bridge */ /* synthetic */ C385670FAf Kg() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        H4();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    private final boolean P4(String str) {
        if (x21() && ((HDRCameraConfig) C2256211DSp.LJIILLIIL.getValue()).includeTab.contains(str)) {
            return true;
        }
        return false;
    }

    private final void k5(boolean z) {
        if (z == T4()) {
            C201955140j.LIZLLL(C201967140v.LIZIZ, "HDRCameraComponent", "hrd status has not changed");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSettingsAndReopenCamera: enableHDR: ");
        sbLIZ.append(z);
        C201955140j.LIZLLL(c201967140v, "HDRCameraComponent", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1649400t1W(this, z, jCurrentTimeMillis, null), 3);
    }

    public final void F4(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (z) {
                Window window = getActivity().getWindow();
                if (window != null) {
                    window.setColorMode(2);
                }
            } else {
                Window window2 = getActivity().getWindow();
                if (window2 != null) {
                    window2.setColorMode(0);
                }
            }
        }
        getCameraApiComponent().St2().getMediaController().a5(new AwS37S0010000_25(z, 4));
    }

    @Override // X.InterfaceC1649220t1E
    public void nQ1(boolean z) {
        k5(z);
        getCameraApiComponent().QN2(z);
        C0CHQ.LIZ().LJJIIZI().LJJJJLL(z);
    }

    @Override // X.InterfaceC1649220t1E
    public void rH1(String str) {
        if (str == null) {
            str = "";
        }
        boolean zP4 = P4(str);
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchCameraMode: isHdrEnable: ");
        sbLIZ.append(zP4);
        C201955140j.LIZLLL(c201967140v, "HDRCameraComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (zP4) {
            k5(true);
            getCameraApiComponent().QN2(true);
        } else {
            k5(false);
            getCameraApiComponent().QN2(false);
        }
    }

    public C1649390t1V(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1650620t3U.class, null);
        this.LLJJIJIIJIL = new h0<>(null);
    }

    public final Function1<VECameraSettings.Builder, Unit> Z4(float f, boolean z) {
        return new C1661530tL5(f, z);
    }

    @Override // X.InterfaceC1649220t1E
    public Pair<Function1<VECameraSettings.Builder, Unit>, VEVideoEncodeSettings> bF0(String str, VEVideoEncodeSettings vEVideoEncodeSettings) {
        if (str == null) {
            str = "";
        }
        boolean zP4 = P4(str);
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateAndGetHdrVESettings: enableHDR ");
        sbLIZ.append(zP4);
        C201955140j.LIZLLL(c201967140v, "HDRCameraComponent", C2188811AlT.LIZIZ(sbLIZ));
        getCameraApiComponent().QN2(zP4);
        this.LLJJIII = true;
        F4(zP4);
        C1780100wQK c1780100wQK = new C1780100wQK(vEVideoEncodeSettings);
        if (zP4) {
            c1780100wQK.LIZIZ.enableHdr10BitEncode = true;
            c1780100wQK.LJI(VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1);
        } else {
            c1780100wQK.LIZIZ.enableHdr10BitEncode = false;
            c1780100wQK.LJI(VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264);
        }
        return new Pair<>(Z4(getCameraApiComponent().St2().getCameraController().B4(), zP4), c1780100wQK.LIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d5(X.EnumC1448590nnd r9, X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1646380swe
            if (r0 == 0) goto La4
            r5 = r10
            X.0swe r5 = (X.C1646380swe) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La4
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r3 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r7 = 0
            r2 = 2
            r4 = 1
            if (r0 == 0) goto L2b
            if (r0 == r4) goto L47
            if (r0 != r2) goto Lab
            X.C155000ia.LIZIZ(r3)
        L26:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L2b:
            X.C155000ia.LIZIZ(r3)
            X.140v r3 = X.C201967140v.LIZIZ
            java.lang.String r1 = "HDRCameraComponent"
            java.lang.String r0 = "start show cover"
            X.C201955140j.LIZLLL(r3, r1, r0)
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0swc r0 = new X.0swc
            r0.<init>(r9, r8, r7)
            r5.LLILZ = r4
            java.lang.Object r3 = X.C23250099c.LJI(r5, r1, r0)
            if (r3 != r6) goto L4a
            return r6
        L47:
            X.C155000ia.LIZIZ(r3)
        L4a:
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r0 = r3.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5e
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L5e:
            r8.show()
            com.bytedance.als.h0<java.lang.Boolean> r1 = r8.LLJJIJIIJIL
            boolean r0 = r1 instanceof com.bytedance.als.h0
            if (r0 == 0) goto L70
            if (r1 == 0) goto L70
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.LJII(r0)
        L70:
            java.lang.Object r3 = r3.getSecond()
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 != 0) goto L7d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L7d:
            r5.LL = r3
            r5.LLILZ = r2
            X.099m r2 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r5)
            r2.<init>(r0)
            kotlin.jvm.internal.AwS391S0200000_25 r1 = new kotlin.jvm.internal.AwS391S0200000_25
            r0 = 57
            r1.<init>(r3, r2, r0)
            r8.i3(r1)
            java.lang.Object r1 = r2.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto La1
            X.C099Q.LIZJ(r5)
        La1:
            if (r1 != r6) goto L26
            return r6
        La4:
            X.0swe r5 = new X.0swe
            r5.<init>(r8, r10)
            goto L12
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1649390t1V.d5(X.0nnd, X.05Vn):java.lang.Object");
    }
}
