package X;

import Y.AObserverS216S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.effect.navi.NaviAvatarListPresenter;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0UCU, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UCU implements InterfaceC768930UEh {
    public final Fragment LIZ;
    public C0UCW LIZIZ;
    public ViewGroup LIZJ;
    public final NaviAvatarListPresenter LIZLLL;

    @Override // X.InterfaceC768930UEh
    public final void LIZIZ(String str) {
    }

    @Override // X.InterfaceC768930UEh
    public final void LIZLLL(String str, ViewGroup viewGroup) {
    }

    @Override // X.InterfaceC768930UEh
    public final void LJ(String str) {
    }

    @Override // X.InterfaceC768930UEh
    public final void LJII(Function2<? super String, ? super String, Integer> function2) {
    }

    @Override // X.InterfaceC768930UEh
    public final void onDestroy() {
    }

    public final C0UCW LJIIJ() {
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL;
        C0UCW c0ucw = this.LIZIZ;
        if (c0ucw == null) {
            Context context = this.LIZ.getContext();
            Boolean boolValueOf = null;
            if (context == null) {
                return null;
            }
            c0ucw = new C0UCW(context);
            NaviAvatarListPresenter naviAvatarListPresenter = this.LIZLLL;
            Fragment fragment = this.LIZ;
            c0ucw.LLILZIL = naviAvatarListPresenter;
            if (naviAvatarListPresenter == null) {
                naviAvatarListPresenter = null;
            }
            MutableLiveData<List<C768350UCb>> mutableLiveData = naviAvatarListPresenter.LLILZIL.LLILLJJLI;
            if (fragment == null) {
                fragment = null;
            }
            mutableLiveData.observe(fragment, new AObserverS216S0100000_12(c0ucw, 101));
            this.LIZLLL.LLILZ = c0ucw;
            LiveEffect liveEffect = C767790U9x.LIZ;
            if (liveEffect != null && (stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL()) != null) {
                boolValueOf = Boolean.valueOf(stickerSDKExtraLJLJLLL.isFullBodyAvatar);
            }
            if (C500260Jjc.LJJJI(boolValueOf) && C500260Jjc.LJJ()) {
                C500260Jjc.LJIILIIL(c0ucw.LL);
            } else {
                C500260Jjc.LLFFF(c0ucw.LL);
            }
            this.LIZIZ = c0ucw;
        }
        return c0ucw;
    }

    @Override // X.InterfaceC768930UEh
    public final void LIZJ() {
        C0UCW c0ucwLJIIJ = LJIIJ();
        if (c0ucwLJIIJ != null) {
            C500260Jjc.LJIILIIL(c0ucwLJIIJ);
            NaviAvatarListPresenter naviAvatarListPresenter = c0ucwLJIIJ.LLILZIL;
            if (naviAvatarListPresenter == null) {
                naviAvatarListPresenter = null;
            }
            naviAvatarListPresenter.LLIZ = false;
            naviAvatarListPresenter.LLJILJIL = false;
            naviAvatarListPresenter.LLJ = false;
            C767790U9x.LIZIZ = null;
            C0UCV c0ucv = naviAvatarListPresenter.LLILZLL;
            if (c0ucv != null) {
                c0ucv.LIZJ();
            }
            naviAvatarListPresenter.LLILZLL = null;
            naviAvatarListPresenter.LJ();
            ((LinkedHashMap) naviAvatarListPresenter.LLJILLL).clear();
            ((LinkedHashMap) naviAvatarListPresenter.LLJJ).clear();
        }
    }

    public final void LIZ(ViewGroup viewGroup) {
        ViewParent parent;
        ViewGroup viewGroup2;
        if (LJIIJ() == null) {
            return;
        }
        View view = null;
        try {
            C0UCW c0ucwLJIIJ = LJIIJ();
            if (c0ucwLJIIJ != null) {
                parent = c0ucwLJIIJ.getParent();
            } else {
                parent = null;
            }
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(LJIIJ(), viewGroup2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C500260Jjc.LLFFF(viewGroup);
        View viewLJIIJ = LJIIJ();
        if (viewLJIIJ != null) {
            C500260Jjc.LJIILIIL(viewLJIIJ);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewLJIIJ);
            viewLJIIJ.setAlpha(1.0f);
            view = viewLJIIJ;
        }
        C19ME c19me = new C19ME(-1, (int) C497740JfY.LIZIZ(66.0f));
        c19me.bottomToBottom = viewGroup.getId();
        viewGroup.addView(view, c19me);
    }

    @Override // X.InterfaceC768930UEh
    public final void LJFF(LiveEffect liveEffect) {
        ViewGroup viewGroup = this.LIZJ;
        if (viewGroup != null) {
            LIZ(viewGroup);
        }
        if (liveEffect != null) {
            ViewGroup viewGroup2 = this.LIZJ;
            if (viewGroup2 != null) {
                C500260Jjc.LLFFF(viewGroup2);
            }
            C0UCW c0ucwLJIIJ = LJIIJ();
            if (c0ucwLJIIJ != null) {
                C500260Jjc.LLFFF(c0ucwLJIIJ);
                NaviAvatarListPresenter naviAvatarListPresenter = c0ucwLJIIJ.LLILZIL;
                Boolean boolValueOf = null;
                if (naviAvatarListPresenter == null) {
                    naviAvatarListPresenter = null;
                }
                naviAvatarListPresenter.LJFF(liveEffect);
                LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL();
                if (stickerSDKExtraLJLJLLL != null) {
                    boolValueOf = Boolean.valueOf(stickerSDKExtraLJLJLLL.isFullBodyAvatar);
                }
                if (C500260Jjc.LJJJI(boolValueOf) && DataChannelGlobal.LLILZ.gg0(BroadcastSceneGlobalChannel.class) == EnumC768840UDy.BROADCAST) {
                    C500260Jjc.LJIILIIL(c0ucwLJIIJ.LL);
                } else {
                    C500260Jjc.LLFFF(c0ucwLJIIJ.LL);
                }
            }
        }
    }

    @Override // X.InterfaceC768930UEh
    public final boolean LJIIIIZZ(LiveEffect liveEffect) {
        return C0U7C.LJIILLIIL(liveEffect);
    }

    @Override // X.InterfaceC768930UEh
    public final void LJI(LiveEffect liveEffect, String str) {
        LJIIJ();
    }

    @Override // X.InterfaceC768930UEh
    public final void LJIIIZ(ViewGroup viewGroup, boolean z) {
        C0UCW c0ucwLJIIJ;
        if (C0U7C.LJIILLIIL((LiveEffect) C13LP.LJJJLL(C0UA1.LIZ().qr(C0UD4.LIZIZ))) || C0U7C.LJIILLIIL((LiveEffect) C13LP.LJJJLL(C0UA1.LIZ().qr(C0UD4.LJ)))) {
            LIZ(viewGroup);
            C0UCW c0ucwLJIIJ2 = LJIIJ();
            if (c0ucwLJIIJ2 != null) {
                C500260Jjc.LLFFF(c0ucwLJIIJ2);
                if (z && (c0ucwLJIIJ = LJIIJ()) != null) {
                    C500260Jjc.LJIILIIL(c0ucwLJIIJ.LL);
                }
            }
        }
    }

    public C0UCU(DataChannel dataChannel, Fragment fragment, C0UCY c0ucy) {
        this.LIZ = fragment;
        this.LIZLLL = new NaviAvatarListPresenter(dataChannel, fragment, c0ucy);
    }
}
