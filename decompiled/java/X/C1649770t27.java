package X;

import Y.AObjectS178S0000000_25;
import Y.AObjectS246S0100000_25;
import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0t27, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649770t27 extends C1652400t6M {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public static final int LLLFZ;
    public final C19A3 LLJLLIL;
    public final InterfaceC1731706qJ LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1652370t6J LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1649770t27.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1649770t27.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1649770t27.class, "shootModeSwitchApiComponent", "getShootModeSwitchApiComponent()Lcom/ss/android/ugc/aweme/social/creation/record/bottom/ShootModeSwitchApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1649770t27.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1649770t27.class, "recordPermissionApi", "getRecordPermissionApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLLFZ = 8;
    }

    private final InterfaceC1653800t8c R5() {
        return (InterfaceC1653800t8c) this.LLJZIJLIL.getValue(this, LLLFFI[2]);
    }

    private final a getPlanCUIApiComponent() {
        return (a) this.LLL.getValue(this, LLLFFI[3]);
    }

    public final InterfaceC1652190t61 N5() {
        return (InterfaceC1652190t61) this.LLLF.getValue(this, LLLFFI[4]);
    }

    public final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJLLL.getValue(this, LLLFFI[0]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLJZ.getValue(this, LLLFFI[1]);
    }

    @Override // X.C1652400t6M
    public boolean P4() {
        return getShortVideoContext().creativeModel.initialModel.dmCameraModel.enterFromDM;
    }

    public final boolean S5() {
        return (getShortVideoContext().LJJIFFI() || getShortVideoContext().LJJLL() || d4.LJJII(getShortVideoContext()) || getShortVideoContext().LJJJ() || getShortVideoContext().LJJIL() || getShortVideoContext().creativeModel.initialModel.dmCameraModel.isBulletin || getShortVideoContext().LJJJJL() || getShortVideoContext().isDuetMode || d4.LJJIII(getShortVideoContext()) || d4.LJIIIZ(getShortVideoContext()) || getShortVideoContext().LJJIJ() || getShortVideoContext().shootMode == 30) ? false : true;
    }

    @Override // X.C1652400t6M
    public boolean T4() {
        return d4.LJJIII(getShortVideoContext()) || d4.LJIIIZ(getShortVideoContext());
    }

    @Override // X.C1652400t6M
    public void n5() {
        InterfaceC1648870t0f interfaceC1648870t0f = (InterfaceC1648870t0f) getDiContainer().LJII(InterfaceC1648870t0f.class, null);
        interfaceC1648870t0f.setNeedNoTouchListener(true);
        interfaceC1648870t0f.getNoBlockTouchEvent().LIZ(this, new AObjectS246S0100000_25(this, 260));
    }

    @Override // X.C1652400t6M, X.AbstractC2255721DQs
    public void onCreate() {
        ShootExtraData shootExtraData;
        super.onCreate();
        getRecordAdapterApi().n72(this);
        this.LLJLLIL.add(R.id.sz5, e4(), "RecordChooseMusicScene");
        if (C533930Kwp.LIZLLL("android.permission.CAMERA") && (shootExtraData = getShortVideoContext().creativeFlowData.getShootExtraData()) != null && Intrinsics.LJFF(shootExtraData.getReplaceOfflineMusic(), Boolean.TRUE)) {
            C1389880mGw c1389880mGw = new C1389880mGw(getActivity());
            c1389880mGw.LJIIIIZZ(2131848261);
            c1389880mGw.LJIIJ();
        }
    }

    @Override // X.C1652400t6M, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().n72(null);
    }

    @Override // X.C1652400t6M
    public void registerObservers() {
        C385670FAf<Boolean> c385670FAfRX1;
        super.registerObservers();
        getPlanCUIApiComponent().RS().LIZ(this, new AObjectS246S0100000_25(this, 261));
        this.LLILLL.LIZ.LIZ(this, new AObjectS246S0100000_25(this, 262));
        InterfaceC1652190t61 interfaceC1652190t61N5 = N5();
        if (interfaceC1652190t61N5 != null && (c385670FAfRX1 = interfaceC1652190t61N5.rX1()) != null) {
            c385670FAfRX1.LIZ(this, new AObjectS246S0100000_25(this, 263));
        }
        R5().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 264));
        getPlanCUIApiComponent().LLZIL().LIZ(this, new AObjectS246S0100000_25(this, 265));
        getPlanCUIApiComponent().nS().LIZ(this, new AObjectS246S0100000_25(this, 266));
        getPlanCUIApiComponent().Qw1().LIZ(this, new AObjectS246S0100000_25(this, 267));
        getPlanCUIApiComponent().E21().LIZ(this, new AObjectS246S0100000_25(this, 268));
        getPlanCUIApiComponent().A71().LIZ(this, new AObjectS178S0000000_25(this, 0));
    }

    @Override // X.C1652400t6M
    public C385670FAf<Boolean> sK0() {
        return ((InterfaceC1647890sz5) getDiContainer().LJII(a.class, null)).sK0();
    }

    @Override // X.C1652400t6M
    public InterfaceC1652370t6J c3() {
        return this.LLLFF;
    }

    @Override // X.C1652400t6M, X.InterfaceC1628590sTx
    public void mQ0(boolean z) {
        Class<?> cls;
        IAnotherMusicService iAnotherMusicService = (IAnotherMusicService) C0CHQ.LIZ().LJJJJL();
        if (!z) {
            Activity activityLIZIZ = C19713312Ax.LIZIZ();
            if (activityLIZIZ != null) {
                cls = activityLIZIZ.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.LJFF(cls, iAnotherMusicService.LIZJ())) {
                InterfaceC1652770t6x interfaceC1652770t6xV3 = v3();
                if ((interfaceC1652770t6xV3 != null && interfaceC1652770t6xV3.Xq()) || getPlanCUIApiComponent().HF1()) {
                    return;
                }
                q stickerApiComponent = getStickerApiComponent();
                if (stickerApiComponent != null && stickerApiComponent.Eh2()) {
                    return;
                }
            } else {
                return;
            }
        }
        W2().t1();
    }

    public final void setEnable(boolean z) {
        if (getShortVideoContext().LJJJJLL() || getShortVideoContext().LJJJJZ() || getShortVideoContext().cameraComponentModel.isEditorProRecordMode || getShortVideoContext().LJJIJL()) {
            z = false;
        }
        y5(z);
        Yj(z);
        if (!getShortVideoContext().LJJJJL() && !getShortVideoContext().isDuetMode && !getShortVideoContext().LJJLL() && !getShortVideoContext().LJJIFFI()) {
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic == null && getShortVideoContext().cameraComponentModel.isEditorProRecordMode) {
                Y7(Boolean.FALSE, null, null);
                return;
            }
            if (z) {
                if (aVMusicExtractAVMusic == null) {
                    FO1(null, null);
                    return;
                }
                return;
            } else {
                if (aVMusicExtractAVMusic == null || !getShortVideoContext().LJJJJZI()) {
                    return;
                }
                FO1(aVMusicExtractAVMusic, getShortVideoContext().LJIIJJI());
                return;
            }
        }
        Y7(Boolean.FALSE, null, null);
    }

    public C1649770t27(C19A3 c19a3, final C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJLLIL = c19a3;
        this.LLJLLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
        this.LLJZ = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1653800t8c.class, null);
        this.LLL = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
        this.LLLF = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1652190t61.class, null);
        this.LLLFF = new InterfaceC1652370t6J() { // from class: X.0sxl
            @Override // X.InterfaceC1652370t6J
            public final boolean A3() {
                C385670FAf<Boolean> c385670FAfA3;
                Boolean boolLIZJ;
                InterfaceC577400Mkk interfaceC577400Mkk = (InterfaceC577400Mkk) c1drg.LJIIL(null, InterfaceC577400Mkk.class);
                if (interfaceC577400Mkk == null || (c385670FAfA3 = interfaceC577400Mkk.A3()) == null || (boolLIZJ = c385670FAfA3.LIZJ()) == null) {
                    return false;
                }
                return boolLIZJ.booleanValue();
            }

            @Override // X.InterfaceC1652370t6J
            public final void wd() {
                a aVarLIZJ = this.LIZ.getRecordAdapterApi().pi2().LIZJ();
                if (aVarLIZJ != null) {
                    aVarLIZJ.L02(false);
                }
            }

            @Override // X.InterfaceC1652370t6J
            public final void vd(AVMusic aVMusic) {
                InterfaceC1628900sUS interfaceC1628900sUS = (InterfaceC1628900sUS) c1drg.LJIIL(null, InterfaceC1628900sUS.class);
                if (interfaceC1628900sUS != null) {
                    interfaceC1628900sUS.vd(aVMusic);
                }
            }
        };
    }
}
