package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12PT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12PT extends AbstractC1664510tPt<InterfaceC19753512Qj> implements InterfaceC19753512Qj {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final int LLJLIL;
    public final LiveEvent<Unit> LLJILJIL;
    public final LiveEvent<Unit> LLJILJILJ;
    public final LiveData<Boolean> LLJILLL;
    public C12PV LLJJ;
    public final List<Function1<Boolean, Unit>> LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public Function0<Unit> LLJJJJ;
    public final List<C12PX> LLJJJJJIL;
    public long LLJJJJLIIL;
    public boolean LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12PT.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12PT.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12PT.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C12PT.class, "voApiComponent", "getVoApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C12PT.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C12PT.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C12PT.class, "memeAudioCaptionApiComponent", "getMemeAudioCaptionApiComponent()Lcom/ss/android/ugc/aweme/aicaption/MemeAudioCaptionApiComponent;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
        LLJLIL = 8;
    }

    @Override // X.InterfaceC1455730nz9
    public void Fd0(boolean z) {
    }

    @Override // X.AbstractC1664510tPt
    public int q3() {
        return R.layout.enr;
    }

    @Override // X.InterfaceC1455730nz9
    public void zp(float f, float f2) {
    }

    private final InterfaceC1455860nzM F4() {
        return (InterfaceC1455860nzM) this.LLJJJ.getValue(this, LLJL[4]);
    }

    private final C1451630nsX H4() {
        return (C1451630nsX) this.LLJJJIL.getValue(this, LLJL[5]);
    }

    private final InterfaceC19530111b1 K4() {
        return (InterfaceC19530111b1) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJL[6]);
    }

    private final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJJIII.getValue(this, LLJL[0]);
    }

    private final AbstractC214814194y O4() {
        return (AbstractC214814194y) this.LLJJIJIIJIL.getValue(this, LLJL[2]);
    }

    private final C12SF P4() {
        return (C12SF) this.LLJJIJIL.getValue(this, LLJL[3]);
    }

    private final InterfaceC19753012Qe T4() {
        return (InterfaceC19753012Qe) this.LLJJIJI.getValue(this, LLJL[1]);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    @Override // X.InterfaceC1455720nz8, X.InterfaceC1455730nz9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJJJIZL() {
        /*
            r7 = this;
            X.12PV r2 = r7.LLJJ
            if (r2 == 0) goto L10
            java.util.Stack<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r2.LIZIZ
            r0.clear()
            X.0KiL r1 = r2.LIZ
            X.12PW r0 = r2.LIZJ
            r1.b8(r0)
        L10:
            r4 = 0
            r7.LLJJ = r4
            r7.hide()
            java.util.List<kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>> r0 = r7.LLJJI
            java.util.Iterator r2 = r0.iterator()
        L1c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.invoke(r0)
            goto L1c
        L2e:
            X.11b1 r0 = r7.K4()
            if (r0 == 0) goto L3d
            r1 = 0
            r6 = 30
            r2 = r1
            r3 = r1
            r5 = r1
            X.C1419240n2I.LIZ(r0, r1, r2, r3, r4, r5, r6)
        L3d:
            X.0nsX r1 = r7.H4()
            if (r1 == 0) goto L4c
            r0 = 107(0x6b, float:1.5E-43)
            kotlin.jvm.internal.AFwS273S0000000_29 r0 = kotlin.jvm.internal.AFwS273S0000000_29.get$arr$(r0)
            r1.LIZIZ(r0)
        L4c:
            long r0 = r7.LLJJJJLIIL
            r7.Z4(r0)
            X.0nzM r2 = r7.F4()
            boolean r0 = r2 instanceof X.InterfaceC1446740nke
            if (r0 == 0) goto L71
            X.0nke r2 = (X.InterfaceC1446740nke) r2
            if (r2 == 0) goto L71
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r7.LJJJLIIL()
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.getVeAudioRecorderParam()
            if (r0 == 0) goto L72
            boolean r1 = r0.hasRecord()
            r0 = 1
            if (r1 != r0) goto L72
        L6e:
            r2.rh0(r0)
        L71:
            return
        L72:
            r0 = 0
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12PT.LJJJJIZL():void");
    }

    @Override // X.InterfaceC1455720nz8
    public void SS1() {
        Function0<Unit> function0 = this.LLJJJJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z4() {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12PT.z4():void");
    }

    @Override // X.InterfaceC1455720nz8, X.InterfaceC1455730nz9
    public void LLJJJJ() {
        P4().LLJJJJ();
    }

    @Override // X.InterfaceC1455720nz8, X.InterfaceC1455730nz9, X.InterfaceC1456070nzh
    public void c4() {
        this.LLJJJJLIIL = System.currentTimeMillis();
        if (O4() instanceof InterfaceC524950KiL) {
            this.LLJJ = new C12PV((InterfaceC524950KiL) O4());
        }
        this.LLJJL = true;
        show();
        Iterator<Function1<Boolean, Unit>> it2 = this.LLJJI.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Boolean.TRUE);
        }
        InterfaceC19530111b1 interfaceC19530111b1K4 = K4();
        if (interfaceC19530111b1K4 != null) {
            C1419240n2I.LIZ(interfaceC19530111b1K4, true, false, false, null, false, 30);
        }
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(LJJJLIIL());
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(LJJJLIIL()));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", LJJJLIIL().mShootWay);
        c0lab.LJ("creation_id", LJJJLIIL().getCreationId());
        c0lab.LJ("content_type", C1428470nHB.LJIILL(LJJJLIIL()));
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(LJJJLIIL()));
        c0lab.LIZ(iIntValue2, "pic_cnt");
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LJ("enter_dm", LJJJLIIL().creativeModel.initialModel.dmCameraModel.enterDM);
        c0lab.LJ("edit_tab_entrance", C1403850mdT.LIZLLL(LJJJLIIL()));
        c0lab.LJ("editorpro_click_from", C1403850mdT.LJ(LJJJLIIL()));
        C0MJO.LIZIZ(LJJJLIIL().creativeModel, c0lab);
        C1413430msv.LIZLLL(LJJJLIIL(), c0lab);
        C1413430msv.LIZIZ(LJJJLIIL(), c0lab);
        c0lab.LIZ((C573570MeZ.LIZJ(LJJJLIIL()) || C573570MeZ.LIZIZ(LJJJLIIL())) ? 1 : 0, "is_pic_frame_single_pic_edit");
        if (C573570MeZ.LIZJ(LJJJLIIL()) || C573570MeZ.LIZIZ(LJJJLIIL())) {
            c0lab.LIZ(1, "pic_cnt");
            c0lab.LJ("content_type", "multi_photo");
        }
        if (LJJJLIIL().creativeModel.imageEditModel.livePicCnt > 0) {
            c0lab.LIZ(LJJJLIIL().creativeModel.imageEditModel.livePicCnt, "live_pic_cnt");
        }
        C1413430msv.LIZ(LJJJLIIL(), c0lab);
        C20684815ws.LJIILLIIL("click_audio_editing", c0lab.LIZ);
        C1451630nsX c1451630nsXH4 = H4();
        if (c1451630nsXH4 != null) {
            c1451630nsXH4.LIZIZ(AFwS273S0000000_29.get$arr$(108));
        }
    }

    @Override // X.AbstractC1664510tPt, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        z4();
    }

    @Override // X.AbstractC1664510tPt, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJJI.clear();
    }

    @Override // X.InterfaceC1455730nz9
    public LiveEvent<Unit> EZ() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1455720nz8, X.InterfaceC1455730nz9
    public LiveData<Boolean> g5() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1456070nzh
    public LiveEvent<Unit> jj2() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC19753512Qj
    public void De2(Function1<? super Boolean, Unit> function1) {
        if (!this.LLJJI.contains(function1)) {
            this.LLJJI.add(function1);
        }
    }

    @Override // X.InterfaceC19753512Qj
    public void PV0(C12PX c12px) {
        this.LLJJJJJIL.add(c12px);
    }

    @Override // X.InterfaceC19753512Qj
    public void TF2(Function0<Unit> function0) {
        this.LLJJJJ = function0;
    }

    public final void Z4(long j) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(System.currentTimeMillis() - j, "duration");
        c0lab.LJ("enter_from", "voice filter panel");
        c0lab.LJ("creation_id", LJJJLIIL().getCreationId());
        c0lab.LJ("shoot_way", LJJJLIIL().mShootWay);
        C20684815ws.LJIILLIIL("stay_time", c0lab.LIZ);
    }

    @Override // X.InterfaceC19753512Qj
    public void hR1(String str) {
        Iterator<C12PX> it2 = this.LLJJJJJIL.iterator();
        while (it2.hasNext()) {
            it2.next().p0(str);
        }
    }

    @Override // X.InterfaceC19753512Qj
    public void jz(C12PX c12px) {
        this.LLJJJJJIL.remove(c12px);
    }

    @Override // X.InterfaceC19753512Qj
    public void ka1(Function0<Unit> function0) {
        C12PV c12pv = this.LLJJ;
        if (c12pv != null && !c12pv.LIZIZ.contains(function0)) {
            c12pv.LIZIZ.push(function0);
        }
    }

    @Override // X.AbstractC1664510tPt
    public void o2(C19A3 c19a3) {
        T2("AudioEditingUIComponent", AFwS273S0000000_29.get$arr$(106));
        X1("AudioEditingUIComponent", new AwS608S0100000_29(c19a3, 153));
    }

    @Override // X.InterfaceC19753512Qj
    public void sM2(String str) {
        Iterator<C12PX> it2 = this.LLJJJJJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LLLILZJ(str);
        }
    }

    @Override // X.InterfaceC19753512Qj
    public void tp2(Function0<Unit> function0) {
        C12PV c12pv = this.LLJJ;
        if (c12pv != null && c12pv.LIZIZ.contains(function0)) {
            c12pv.LIZIZ.remove(function0);
        }
    }

    @Override // X.InterfaceC1455720nz8
    public void yf0(Context context) {
        if (C298050BmF.LIZ() && !this.LLJJL) {
            C21146717pB.LIZJ(context, R.layout.enw);
        }
    }

    public C12PT(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJILJIL = new LiveEvent<>();
        this.LLJILJILJ = new LiveEvent<>();
        this.LLJILLL = new MutableLiveData();
        this.LLJJI = new ArrayList();
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19753012Qe.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), C12SF.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
        this.LLJJJJJIL = new ArrayList();
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19530111b1.class, null);
    }

    @Override // X.InterfaceC1455720nz8, X.InterfaceC1456070nzh
    public void ij(InterfaceC1455860nzM interfaceC1455860nzM, VideoPublishEditModel videoPublishEditModel) {
        T4().dF1();
    }
}
