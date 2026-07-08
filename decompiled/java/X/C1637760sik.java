package X;

import Y.AObserverS186S0200000_25;
import Y.ARunnableS125S0100000_25;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.ss.android.ugc.aweme.sticker.types.game.GameResultViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.HashMap;
import java.util.Map;
import pyl.s;

/* JADX INFO: renamed from: X.0sik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637760sik implements InterfaceC1624920sO2 {
    public final InterfaceC2254081DKk LIZ;
    public final InterfaceC1637800sio LIZIZ;
    public final InterfaceC1631350sYP LIZJ;
    public final C19GS LIZLLL;
    public Effect LJ;
    public boolean LJFF;
    public long LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public final ViewModelProvider LJIIJ;
    public final InterfaceC1624900sO0 LJIIJJI;
    public final InterfaceC1624710sNh LJIIL;
    public final InterfaceC524950KiL LJIILIIL;
    public final C1637790sin LJIILJJIL;
    public final Map<String, CommerceSticker> LJIILL;

    @Override // X.InterfaceC1624920sO2
    public final void LIZ() {
        this.LJFF = false;
        this.LIZIZ.m();
    }

    public final ShortVideoContext LIZLLL() {
        return ((ShortVideoContextViewModel) this.LJIIJ.get(ShortVideoContextViewModel.class)).LL;
    }

    @Override // X.InterfaceC1624920sO2
    public final void onDestroy() {
        this.LJIILIIL.b8(this.LJIILJJIL);
    }

    @Override // X.InterfaceC1624920sO2
    public final void startPlay() {
        if (this.LIZ.I4()) {
            return;
        }
        ((C1624700sNg) this.LJIIL).LIZ.xP1(true, false, true);
        this.LJFF = true;
        if (this.LJI == 0) {
            this.LJI = LIZLLL().cameraComponentModel.mMaxDuration;
        }
        this.LIZIZ.i();
        ShortVideoContext shortVideoContextLIZLLL = LIZLLL();
        if (!shortVideoContextLIZLLL.isStory) {
            shortVideoContextLIZLLL.LJJLIIIJJI(2147483647L);
        }
        CameraComponentModel cameraComponentModel = shortVideoContextLIZLLL.cameraComponentModel;
        cameraComponentModel.recordMode = 1;
        if (cameraComponentModel.gameDuetResource != null) {
            this.LIZ.sendEffectMsg(4103, r0.gameScore, 0L, "");
        }
        TextView textView = ((C1631340sYO) this.LIZJ).LIZLLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        this.LJIIJJI.getClass();
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(C0CHQ.LIZ, 0, "publish").edit();
        editorEdit.putInt("record_mode", 1);
        C1499900p8O.LIZ(editorEdit);
        C1624700sNg c1624700sNg = (C1624700sNg) this.LJIIL;
        c1624700sNg.LIZ.mE1(new C1656120tCM(s.NORMAL));
        c1624700sNg.LIZ.oa0(new C1448290nn9(EnumC1448830no1.CLICK), false);
    }

    public final void LIZJ(String str) {
        if (this.LJI > 0) {
            LIZLLL().LJJLIIIJJI(this.LJI);
            this.LJI = 0L;
        }
        if (this.LJIIIIZZ) {
            return;
        }
        ((C1624700sNg) this.LJIIL).LIZ.xP1(true, false, true);
        TextView textView = ((C1631340sYO) this.LIZJ).LIZLLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        C1631360sYQ c1631360sYQ = (C1631360sYQ) this.LIZJ;
        View view = c1631360sYQ.LIZIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
            C786410Ut5.LJJJZ(c1631360sYQ.LIZIZ, c1631360sYQ.LIZJ);
        }
        this.LJII = false;
        ((GameResultViewModel) this.LJIIJ.get(GameResultViewModel.class)).LLILLJJLI = false;
        C1624010sMZ.LJII(((C1624890sNz) this.LJIIJJI).LIZIZ, null);
        LIZLLL().cameraComponentModel.recordMode = 0;
        if (LIZLLL().cameraComponentModel.mWorkspace.getMusicPath() != null) {
            this.LIZ.E4(true);
            this.LIZ.pauseEffectAudio(true);
            this.LIZ.Ra(true);
            this.LIZ.G4(LIZLLL().cameraComponentModel.mWorkspace.getMusicPath(), LIZLLL().LJIILJJIL(), LIZLLL().cameraComponentModel.mTotalRecordingTime, false, false, false, 0, -1L);
        } else {
            this.LIZ.E4(false);
        }
        this.LIZ.wh(true);
        if (LIZLLL().cameraComponentModel.gameDuetResource != null) {
            C1444920nhi.LIZJ(LIZLLL(), str, "video_shoot_page", "video_shoot_page");
            ((C1624700sNg) this.LJIIL).LIZ.cV0(false);
        } else {
            this.LIZIZ.l(this.LJ);
        }
        this.LJ = null;
    }

    public final void LJ(String str) {
        if (this.LJIIIIZZ) {
            if (this.LJI > 0) {
                LIZLLL().LJJLIIIJJI(this.LJI);
                this.LJI = 0L;
                return;
            }
            return;
        }
        this.LJFF = false;
        C1624700sNg c1624700sNg = (C1624700sNg) this.LJIIL;
        InterfaceC1648570t0B interfaceC1648570t0B = c1624700sNg.LIZ;
        C1644050sst c1644050sst = new C1644050sst("quit game");
        c1644050sst.LIZ = 6;
        c1644050sst.LJ = new ARunnableS125S0100000_25(c1624700sNg, 116);
        interfaceC1648570t0B.h81(c1644050sst);
        LIZLLL().cameraComponentModel.recordMode = 0;
        int i = this.LJIIIZ;
        if (i != 0) {
            if (i == 1) {
                this.LIZIZ.j(this.LJ);
                return;
            }
            return;
        }
        LIZJ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0142  */
    @Override // X.InterfaceC1624920sO2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(final com.ss.android.ugc.effectmanager.effect.model.Effect r13, int r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1637760sik.LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect, int, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0EJn, X.0sin] */
    public C1637760sik(C19GS c19gs, InterfaceC524950KiL interfaceC524950KiL, InterfaceC1650230t2r interfaceC1650230t2r, C1631340sYO c1631340sYO, C1624890sNz c1624890sNz, C1624700sNg c1624700sNg, InterfaceC1637800sio interfaceC1637800sio, C1DRG c1drg) {
        ?? r1 = new InterfaceC362610EJn() { // from class: X.0sin
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                C1637760sik c1637760sik = this.LL;
                if (c1637760sik.LJII && i == 4) {
                    if (c1637760sik.LJFF) {
                        c1637760sik.LJ("system_back_button");
                        return true;
                    }
                    c1637760sik.LIZJ("system_back_button");
                    return true;
                }
                return false;
            }
        };
        this.LJIILJJIL = r1;
        this.LJIILL = new HashMap();
        this.LIZ = interfaceC1650230t2r.St2();
        this.LIZIZ = interfaceC1637800sio;
        this.LIZLLL = c19gs;
        this.LJIIJJI = c1624890sNz;
        this.LJIIL = c1624700sNg;
        this.LJIILIIL = interfaceC524950KiL;
        interfaceC524950KiL.kF(r1);
        this.LIZJ = c1631340sYO;
        c1631340sYO.LIZ = new C1637810sip(this);
        ViewModelProvider viewModelProvider = (ViewModelProvider) c1drg.LJII(ViewModelProvider.class, null);
        this.LJIIJ = viewModelProvider;
        GameResultViewModel gameResultViewModel = (GameResultViewModel) viewModelProvider.get(GameResultViewModel.class);
        if (gameResultViewModel.LL == null) {
            gameResultViewModel.LL = new MutableLiveData<>();
        }
        gameResultViewModel.LL.observe((LifecycleOwner) c1drg.LJII(LifecycleOwner.class, null), new AObserverS186S0200000_25((Object) this, (LiveData<C1641640sp0<HorizontalEffectsModel>>) c1624700sNg, (l0) 12));
    }
}
