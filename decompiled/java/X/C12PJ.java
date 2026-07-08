package X;

import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS115S0110000_29;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS668S0100000_19;
import nv7.c0;

/* JADX INFO: renamed from: X.12PJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12PJ extends i<C12RU, C12PA, C12PE, C12PF> implements C12RU, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final int LLJJJJ;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public int LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12PJ.class, "audioEditingApiComponent", "getAudioEditingApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/AudioEditingApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12PJ.class, "aeVoiceChangeApiComponent", "getAeVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voicechange/AEVoiceChangeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12PJ.class, "aeVolumeApiComponent", "getAeVolumeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/volume/AEVolumeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C12PJ.class, "aeRecordApiComponent", "getAeRecordApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/record/AERecordApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C12PJ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C12PJ.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJJJJ = 8;
    }

    public final void x5() {
        this.LLJJIJIL = false;
        i3(AFwS273S0000000_29.get$arr$(110));
        P4().Xc(new AwS573S0100000_29(this, 210));
    }

    public final boolean F4() {
        C19546111db c19546111db = C19546111db.LIZ;
        int i = this.LLJJJ;
        c19546111db.getClass();
        int i2 = i >> 10;
        int i3 = this.LLJJJ;
        c19546111db.getClass();
        int i4 = (i3 >> 7) & 7;
        if (i2 == 0) {
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                return false;
            }
        } else if (i4 == 1 || i4 == 2) {
            return false;
        }
        return true;
    }

    public final C12PK P4() {
        return (C12PK) this.LLJJIII.getValue(this, LLJJJIL[3]);
    }

    public final C12PO T4() {
        return (C12PO) this.LLJJ.getValue(this, LLJJJIL[1]);
    }

    public final C12PP Z4() {
        return (C12PP) this.LLJJI.getValue(this, LLJJJIL[2]);
    }

    public final InterfaceC19753512Qj d5() {
        return (InterfaceC19753512Qj) this.LLJILLL.getValue(this, LLJJJIL[0]);
    }

    public final InterfaceC559500Lwy k5() {
        return (InterfaceC559500Lwy) this.LLJJIJIIJIL.getValue(this, LLJJJIL[5]);
    }

    public final InterfaceC1455860nzM n5() {
        return (InterfaceC1455860nzM) this.LLJJIJI.getValue(this, LLJJJIL[4]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12PE> o2() {
        return AFwS218S0000000_29.get$arr$(153);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12PF> w2() {
        return new AwS573S0100000_29(this, 211);
    }

    private final void K4() {
        double fullScreenHeight = (((((double) ScreenUtils.getFullScreenHeight(C1664590tQ1.LJII(this))) * 0.55d) - ((double) ScreenUtils.getStatusBarHeight(C1664590tQ1.LJII(this)))) - ((double) ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(C1664590tQ1.LJII(this)))) - ((double) C366700EZg.LIZ(44.0d));
        int iLIZ = C446980Hfs.LIZ(C1664590tQ1.LJII(this), R.color.b6);
        int statusBarHeight = ScreenUtils.getStatusBarHeight(C1664590tQ1.LJII(this)) + ((int) C12ES.LIZJ(44.0f, C1664590tQ1.LJII(this)));
        int iLIZJ = (int) C12ES.LIZJ(290.0f, C1664590tQ1.LJII(this));
        int i = (int) fullScreenHeight;
        c0 c0Var = c0.LIZ;
        c0Var.n2();
        C1453160nv0 c1453160nv0LIZIZ = C1453170nv1.LIZIZ(iLIZ, statusBarHeight, iLIZJ, i, false, false, 1984);
        c1453160nv0LIZIZ.LJIIL = new AwS573S0100000_29(this, 209);
        c1453160nv0LIZIZ.LJIIJJI = AFwS218S0000000_29.get$arr$(152);
        int iLIZ2 = C446980Hfs.LIZ(C1664590tQ1.LJII(this), R.color.b6);
        int statusBarHeight2 = ScreenUtils.getStatusBarHeight(C1664590tQ1.LJII(this)) + ((int) C12ES.LIZJ(44.0f, C1664590tQ1.LJII(this)));
        int iLIZJ2 = (int) C12ES.LIZJ(290.0f, C1664590tQ1.LJII(this));
        c0Var.n2();
        d5().De2(new AwS238S0300000_29(this, c1453160nv0LIZIZ, C1453170nv1.LIZ(iLIZ2, statusBarHeight2, iLIZJ2, i), 9));
    }

    private final void v5() {
        boolean zLJJIZ = T4().LJJIZ();
        boolean zZo = P4().Zo();
        boolean zLJJIZ2 = Z4().LJJIZ();
        if (zLJJIZ || zZo || zLJJIZ2) {
            C5(C1664590tQ1.LJII(this), new C12PL(zZo, this, zLJJIZ, zLJJIZ2));
        } else {
            H4();
        }
    }

    public final void H4() {
        P4().Mo(new InterfaceC352140DrI() { // from class: X.12PN
            @Override // X.InterfaceC352140DrI
            public final void LIZ() {
            }

            @Override // X.InterfaceC352140DrI
            public final void LIZIZ() {
                C2487409ou.LIZJ(new ARunnableS129S0100000_29(this.LIZ, 62));
            }
        });
    }

    public final boolean O4() {
        return P4().isRecording() || P4().Ug();
    }

    public final void py2() {
        P4().py2();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        K4();
        super.show();
        py2();
        n5().vW1().observe(this, new AObserverS231S0100000_29(this, 73));
    }

    @Override // X.C12RU
    public void Hk2() {
        v5();
    }

    @Override // X.C12RU
    public void cp() {
        x5();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.C12RU
    public boolean isPlaying() {
        return this.LLJJIJIL;
    }

    @Override // X.C12RU
    public void LLIL(boolean z) {
        T4().LLIL(z);
        P4().LLIL(z);
        i3(new AwS41S0010000_29(z, 14));
        this.LLJJIJIL = z;
    }

    @Override // X.C12RU
    public void Mn2(int i) {
        i3(new AwS41S0001000_29(i, 8));
        this.LLJJJ = i;
    }

    @Override // X.C12RU
    public void cc2(boolean z) {
        i3(new AwS41S0010000_29(z, 15));
    }

    public final void t5(boolean z) {
        if (T4().Pb2()) {
            P4().tr1(new AwS115S0110000_29(this, z, 2));
            T4().D8(new AtomicBoolean(!z));
        } else {
            T4().LLIL(z);
            P4().LLIL(z);
        }
        this.LLJJIJIL = z;
    }

    public C12PJ(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19753512Qj.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), C12PO.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), C12PP.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), C12PK.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
    }

    private final void C5(Context context, Function0<Unit> function0) {
        if (C0DHG.LIZ() && C1388190mED.LIZ(context) != null) {
            C632670Orh.LIZIZ(context, new C19719212De(-1179482018, new AwS668S0100000_19(function0, (Function0<Unit>) 7), true));
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131822392);
        C985403tE.LIZ(c1397580mTM, new AwS608S0100000_29(function0, (Function0<Unit>) 157));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}
