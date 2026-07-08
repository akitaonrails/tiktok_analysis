package X;

import Y.AAListenerS335S0100000_25;
import Y.AObserverS227S0100000_25;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.asve.context.PreviewSize;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.record.k2;
import com.ss.android.ugc.aweme.shortvideo.record.o2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import ge.i;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS11S0000001_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0t19, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1649170t19 extends i<InterfaceC1646220swO, C1649320t1O, C1649230t1F, C1649270t1J> implements InterfaceC1646220swO, InterfaceC379610EuV {
    public static final C1649330t1P LLJZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public final C1DRG LLJILJILJ;
    public final Function0<C1649230t1F> LLJILLL;
    public final Function0<C1649270t1J> LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public C09AE LLJJJJJIL;
    public final Map<Integer, VEVideoEncodeSettings> LLJJJJLIIL;
    public VESize LLJJL;
    public final PreviewSize LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public Pair<String, String> LLJLIL;
    public final InterfaceC1649550t1l LLJLILLLLZIIL;
    public final C560530Lyd<C1646150swH> LLJLL;
    public int LLJLLIL;
    public final h0<AbstractC588150N4z> LLJLLL;

    @InterfaceC1294060jmO
    public static /* synthetic */ void T4() {
    }

    public boolean C5(String str, String str2) {
        return false;
    }

    public boolean D5(String str) {
        return false;
    }

    public boolean F4(String str, String str2) {
        return false;
    }

    public boolean K6(String str) {
        return false;
    }

    public float M5(View view, C1649150t17 c1649150t17) {
        return 0.0f;
    }

    public float N5(View view, C1649150t17 c1649150t17) {
        return 0.0f;
    }

    public Object U5(String str, EnumC1448590nnd enumC1448590nnd, boolean z, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return m6(this, str, enumC1448590nnd, z, interfaceC1364105Vn);
    }

    public String t5(String str) {
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0t1P] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1649170t19.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1649170t19.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C2217381BqS(C1649170t19.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1649170t19.class, "surfaceSizeAdapter", "getSurfaceSizeAdapter()Lcom/ss/android/ugc/aweme/utils/SurfaceSizeAdapter;", 0), new C2217381BqS(C1649170t19.class, "cameraBusinessAbility", "getCameraBusinessAbility()Lcom/ss/android/ugc/aweme/shortvideo/camera/CameraBusinessAbility;", 0), new C2217381BqS(C1649170t19.class, "recordUIConductorApi", "getRecordUIConductorApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/RecordUIConductorApi;", 0), new C2217381BqS(C1649170t19.class, "hdrCameraApiComponent", "getHdrCameraApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/hdr/HDRCameraApiComponent;", 0), new C2217381BqS(C1649170t19.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};
        LLJZ = new Object() { // from class: X.0t1P
        };
    }

    private final InterfaceC1622160sJa K4() {
        return (InterfaceC1622160sJa) this.LLJJIJIL.getValue(this, LLJZIJLIL[4]);
    }

    private final q getStickerApiComponent() {
        return (q) this.LLJJJJ.getValue(this, LLJZIJLIL[7]);
    }

    private final InterfaceC1649090t11 n5() {
        return (InterfaceC1649090t11) this.LLJJIJIIJIL.getValue(this, LLJZIJLIL[3]);
    }

    public final InterfaceC1649220t1E Z4() {
        return (InterfaceC1649220t1E) this.LLJJJIL.getValue(this, LLJZIJLIL[6]);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLJJI.getValue(this, LLJZIJLIL[0]);
    }

    public final e0 getCameraApiComponent() {
        return (e0) this.LLJJIII.getValue(this, LLJZIJLIL[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJJIJI.getValue(this, LLJZIJLIL[2]);
    }

    public final InterfaceC1647890sz5 k5() {
        return (InterfaceC1647890sz5) this.LLJJJ.getValue(this, LLJZIJLIL[5]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0t1A] */
    private final void S5() {
        getStickerApiComponent().C0().LJII().LIZ().observe(this, new AObserverS227S0100000_25(this, 10));
        getCameraApiComponent().St2().getCameraController().g4(new InterfaceC2183541Acy() { // from class: X.0t1A
            /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x013a A[PHI: r12
              0x013a: PHI (r12v3 int) = (r12v2 int), (r12v5 int) binds: [B:55:0x0136, B:48:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
            @Override // X.InterfaceC2183541Acy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.ss.android.vesdk.VESize LIZ(java.util.List<com.ss.android.vesdk.VESize> r18) {
                /*
                    Method dump skipped, instruction units count: 385
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1649180t1A.LIZ(java.util.List):com.ss.android.vesdk.VESize");
            }
        });
    }

    private final boolean x5() {
        Effect effectLIZIZ = C1624010sMZ.LIZIZ(getStickerApiComponent());
        return effectLIZIZ != null && C1449600npG.LIZLLL(effectLIZIZ);
    }

    @Override // X.InterfaceC1646220swO
    public C385670FAf<EnumC1448590nnd> dk() {
        return getCameraApiComponent().dk();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        this.LLJLLL.LJII(new AbstractC588150N4z() { // from class: X.0N50
        });
    }

    public final EnumC1448590nnd kR1() {
        return getCameraApiComponent().kR1();
    }

    @Override // X.InterfaceC1646220swO
    public Pair<Boolean, EnumC1448590nnd> l52() {
        EnumC1448590nnd enumC1448590nndKR1 = kR1();
        C09AE c09ae = this.LLJJJJJIL;
        if (c09ae != null && c09ae.isActive()) {
            return new Pair<>(Boolean.FALSE, enumC1448590nndKR1);
        }
        EnumC1448590nnd enumC1448590nnd = EnumC1448590nnd.RATIO_9_16;
        if (enumC1448590nndKR1 == enumC1448590nnd) {
            enumC1448590nnd = EnumC1448590nnd.RATIO_3_4;
        }
        if (enumC1448590nnd != EnumC1448590nnd.RATIO_3_4 || !x5()) {
            int iZA2 = zA2();
            yO2(C1660530tJT.LJFF(C1660530tJT.LIZJ(iZA2), enumC1448590nnd, C1660530tJT.LIZ(iZA2)), EnumC2008807tu.RATIO_SWITCH);
            return new Pair<>(Boolean.TRUE, enumC1448590nnd);
        }
        C19EG activity = getActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131849051);
        creativeToastBuilder.isTuxToast(true);
        C1390380mHk.LIZ(activity, 2054, creativeToastBuilder);
        return new Pair<>(Boolean.FALSE, enumC1448590nndKR1);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        S5();
    }

    public final int zA2() {
        return getCameraApiComponent().zA2();
    }

    @Override // X.InterfaceC1646220swO
    public /* bridge */ /* synthetic */ C385670FAf Kg() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC1646220swO
    public /* bridge */ /* synthetic */ LiveEvent Mr1() {
        return this.LLJLL;
    }

    public C560530Lyd<C1646150swH> O4() {
        return this.LLJLL;
    }

    public h0<AbstractC588150N4z> P4() {
        return this.LLJLLL;
    }

    public final int d5() {
        return this.LLJL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1649230t1F> o2() {
        return this.LLJILLL;
    }

    public final Pair<String, String> v5() {
        return this.LLJLIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1649270t1J> w2() {
        return this.LLJJ;
    }

    public AnimatorSet H5(C1649150t17 c1649150t17) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new InterpolatorC1088790eRJ(0.25d, 0.1d, 0.1d, 1.0d));
        animatorSet.addListener(new AAListenerS335S0100000_25(c1649150t17, 0));
        return animatorSet;
    }

    public final void J6(Pair<String, String> pair) {
        this.LLJLIL = pair;
    }

    public void R5(C1649150t17 c1649150t17) {
        c1649150t17.LJFF.invoke();
    }

    public final void u6(int i) {
        this.LLJL = i;
    }

    public C1649170t19(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = AFwS214S0000000_25.get$arr$(133);
        this.LLJJ = new AwS569S0100000_25(this, 245);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1649090t11.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1622160sJa.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647890sz5.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1649220t1E.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
        this.LLJJJJLIIL = new LinkedHashMap();
        this.LLJJL = new VESize(960, 720);
        InterfaceC1442420ndg.LJFF.getClass();
        PreviewSize previewSizeLIZIZ = C1442310ndV.LIZIZ();
        this.LLJJLIIIJLLLLLLLZ = previewSizeLIZIZ == null ? new PreviewSize(960, 720) : previewSizeLIZIZ;
        this.LLJL = 10;
        this.LLJLILLLLZIIL = new InterfaceC1649550t1l() { // from class: X.0t1D
            @Override // X.InterfaceC1649550t1l
            public final boolean LIZ(MotionEvent motionEvent) {
                return true;
            }
        };
        this.LLJLL = new C560530Lyd<>();
        this.LLJLLIL = -1;
        this.LLJLLL = new h0<>(new AbstractC588150N4z() { // from class: X.0N51
        });
    }

    @Override // X.InterfaceC1646220swO
    public boolean yO2(int i, EnumC2008807tu enumC2008807tu) {
        String second;
        Pair<String, String> pair = this.LLJLIL;
        String second2 = null;
        if (pair != null) {
            second = pair.getSecond();
        } else {
            second = null;
        }
        Pair<String, String> pair2 = this.LLJLIL;
        if (pair2 != null) {
            second2 = pair2.getSecond();
        }
        return uF2(i, second, second2, enumC2008807tu);
    }

    private final C1DKV H4(int i, Context context, CameraComponentModel cameraComponentModel) {
        k2 k2Var = new k2(context, cameraComponentModel, new AwS569S0100000_25(cameraComponentModel, 244));
        k2Var.LJIJJLI = K4().LIZIZ();
        return new o2(i, cameraComponentModel, k2Var);
    }

    public boolean E5(EnumC1448590nnd enumC1448590nnd, EnumC1448590nnd enumC1448590nnd2, String str, String str2) {
        if (enumC1448590nnd != EnumC1448590nnd.RATIO_9_16 || enumC1448590nnd != enumC1448590nnd2) {
            if (enumC1448590nnd == enumC1448590nnd2) {
                if (str == null || Intrinsics.LJFF(str, str2)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final Object N6(String str, int i, int i2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean z;
        float fB4;
        InterfaceC1649220t1E interfaceC1649220t1EZ4;
        Pair<Function1<VECameraSettings.Builder, Unit>, VEVideoEncodeSettings> pairBF0;
        if (!this.LLJJJJLIIL.containsKey(C2286608xc.LJ(zA2()))) {
            this.LLJJJJLIIL.put(C2286608xc.LJ(zA2()), getCameraApiComponent().u92().LIZIZ().LIZIZ.LJIIIIZZ);
        }
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        CameraComponentModel cameraComponentModelPw0 = getCameraApiComponent().pw0();
        if (C1660530tJT.LIZ(i2) && !C539900LFk.LIZ(getShortVideoContext())) {
            z = true;
        } else {
            z = false;
        }
        cameraComponentModelPw0.enableRecordingMp4 = z;
        Float value = getCameraApiComponent().Tz1().getValue();
        if (value != null) {
            fB4 = value.floatValue();
        } else {
            fB4 = getCameraApiComponent().St2().getCameraController().B4();
        }
        AwS11S0000001_25 awS11S0000001_25 = new AwS11S0000001_25(fB4, 6);
        Map<Integer, VEVideoEncodeSettings> map = this.LLJJJJLIIL;
        Integer numLJ = C2286608xc.LJ(i2);
        VEVideoEncodeSettings vEVideoEncodeSettingsLIZIZ = map.get(numLJ);
        if (vEVideoEncodeSettingsLIZIZ == null) {
            vEVideoEncodeSettingsLIZIZ = C1DKT.LIZIZ(H4(i2, getActivity(), cameraComponentModelPw0));
            map.put(numLJ, vEVideoEncodeSettingsLIZIZ);
        }
        VEVideoEncodeSettings vEVideoEncodeSettings = vEVideoEncodeSettingsLIZIZ;
        Pair<Function1<VECameraSettings.Builder, Unit>, VEVideoEncodeSettings> pair = new Pair<>(awS11S0000001_25, vEVideoEncodeSettings);
        C201955140j.LIZLLL(C201967140v.LIZIZ, "ChangeCameraSpecComponent", "switchCamera");
        if (K4().LIZIZ() && (interfaceC1649220t1EZ4 = Z4()) != null && (pairBF0 = interfaceC1649220t1EZ4.bF0(str, vEVideoEncodeSettings)) != null) {
            pair = pairBF0;
        }
        getCameraApiComponent().zr1(i, i2, pair.getFirst(), pair.getSecond(), C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_SWITCH_FROM_NOW, null), new AwS569S0100000_25(this, 246), new AwS604S0100000_25(c23260099m, 119));
        if (K6(str)) {
            C2243608qg.LIZ(true, c23260099m);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public boolean uF2(int i, String str, String str2, EnumC2008807tu enumC2008807tu) {
        int iLJFF = i;
        String strT5 = t5(str);
        String strT52 = t5(str2);
        this.LLJL = getShortVideoContext().shootMode;
        if (x5() && C1660530tJT.LIZLLL(iLJFF) == EnumC1448590nnd.RATIO_3_4) {
            iLJFF = C1660530tJT.LJFF(C1660530tJT.LIZJ(iLJFF), EnumC1448590nnd.RATIO_9_16, C1660530tJT.LIZ(iLJFF));
        }
        EnumC1448590nnd enumC1448590nndLIZLLL = C1660530tJT.LIZLLL(zA2());
        EnumC1448590nnd enumC1448590nndLIZLLL2 = C1660530tJT.LIZLLL(iLJFF);
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeCameraSpec,currentSpec:");
        sbLIZ.append(zA2());
        sbLIZ.append(",targetSpec:");
        sbLIZ.append(iLJFF);
        sbLIZ.append(",fromTab:");
        sbLIZ.append(strT5);
        sbLIZ.append(",toTab:");
        sbLIZ.append(strT52);
        sbLIZ.append(",fromRatio:");
        sbLIZ.append(enumC1448590nndLIZLLL);
        sbLIZ.append(",toRatio:");
        sbLIZ.append(enumC1448590nndLIZLLL2);
        C201955140j.LIZLLL(c201967140v, "ChangeCameraSpecComponent", C2188811AlT.LIZIZ(sbLIZ));
        boolean zF4 = F4(strT5, strT52);
        if (iLJFF == zA2() && !zF4) {
            C201955140j.LIZLLL(c201967140v, "ChangeCameraSpecComponent", "directly return,no camera spec changed");
            if (K4().LIZIZ()) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C2108108Nr.LIZ, null, new C1646330swZ(this, strT52, null), 2);
                return false;
            }
            return false;
        }
        C09AE c09ae = this.LLJJJJJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C1646150swH c1646150swH = new C1646150swH(EnumC1646200swM.STARTED, zA2(), iLJFF, strT5, strT52, enumC2008807tu);
        this.LLJLL.LJIIJ(c1646150swH);
        this.LLJJJJJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C2108108Nr.LIZ, null, new C1646320swY(this, enumC1448590nndLIZLLL, enumC1448590nndLIZLLL2, strT5, strT52, c1646150swH, zF4, str2, iLJFF, null), 2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m6(X.C1649170t19 r7, java.lang.String r8, X.EnumC1448590nnd r9, boolean r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            boolean r0 = r11 instanceof X.C1649200t1C
            if (r0 == 0) goto L7c
            r3 = r11
            X.0t1C r3 = (X.C1649200t1C) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r1 = r3.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r6 = 1
            if (r0 == 0) goto L2d
            if (r0 != r6) goto L82
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r1)
            mn3.e0 r0 = r7.getCameraApiComponent()
            android.view.View r5 = r0.fF2()
            X.0t11 r1 = r7.n5()
            r2 = 0
            if (r1 == 0) goto L28
            mn3.e0 r0 = r7.getCameraApiComponent()
            X.1DKk r0 = r0.St2()
            X.15Rf r0 = r0.getViewFunction()
            android.view.View r0 = r0.getView()
            boolean r0 = r1.LIZ(r9, r5, r0, r10)
            if (r0 != r6) goto L28
            r3.LL = r5
            r3.LLILZ = r6
            X.099m r2 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r3)
            r2.<init>(r0)
            Y.ARunnableS125S0100000_25 r1 = new Y.ARunnableS125S0100000_25
            r0 = 16
            r1.<init>(r2, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r5, r1)
            java.lang.Object r1 = r2.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L79
            X.C099Q.LIZJ(r3)
        L79:
            if (r1 != r4) goto L22
            return r4
        L7c:
            X.0t1C r3 = new X.0t1C
            r3.<init>(r7, r11)
            goto L12
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1649170t19.m6(X.0t19, java.lang.String, X.0nnd, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L6(X.EnumC1448590nnd r15, X.EnumC1448590nnd r16, java.lang.String r17, java.lang.String r18, X.InterfaceC1364105Vn<? super java.lang.Boolean> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1649170t19.L6(X.0nnd, X.0nnd, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
