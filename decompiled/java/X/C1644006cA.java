package X;

import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model.ECBannerContent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06cA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1644006cA extends AbstractC1643906c9<C06AH, C1646606ca> implements InterfaceC1599706Od {
    public final /* synthetic */ C1644306cD LLILZLL;
    public final SessionInfo LLIZ;
    public ECBannerContent LLIZLLLIL;

    @Override // X.C06OD, X.InterfaceC1599706Od
    public final void pause() {
        this.LLILZLL.pause();
    }

    @Override // X.C06OD, X.InterfaceC1599706Od
    public final void resume() {
        this.LLILZLL.resume();
    }

    @Override // X.C06OD
    public final void LIZLLL() {
        C1646606ca c1646606ca = (C1646606ca) this.LLILZIL;
        if (c1646606ca == null || c1646606ca.getVisibility() != 0) {
            return;
        }
        int visibility = c1646606ca.getVisibility();
        c1646606ca.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1646606ca);
        c1646606ca.LLZLI();
    }

    @Override // X.AbstractC1643906c9, X.C06OD
    public final void LJ(C06OO c06oo) {
        super.LJ(c06oo);
        this.LLIZLLLIL = null;
    }

    @Override // X.C06OD
    public final Object LJI(C06OO c06oo) {
        C1646606ca c1646606ca = (C1646606ca) this.LLILZIL;
        if (c1646606ca != null) {
            c1646606ca.LIZ(this.LLIZLLLIL, this.LLIZ.getConversationId(), this.LLIZ.getSingleChatFromUserId());
            return c1646606ca;
        }
        return null;
    }

    public C1644006cA(ViewGroup viewGroup, C909290Zln c909290Zln) {
        super(EnumC1596306Mv.EC_SELLER, viewGroup, R.layout.cgt);
        this.LLILZLL = new C1644306cD(viewGroup);
        this.LLIZ = c909290Zln;
    }

    @Override // X.C06OD
    public final Object LJII(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object c098200Yq;
        Long l;
        C06AH c06ah = (C06AH) c06oo;
        ECBannerContent eCBannerContent = this.LLIZLLLIL;
        if (eCBannerContent == null) {
            try {
                c098200Yq = (ECBannerContent) C051M.LIZIZ(ECBannerContent.class, c06ah.LIZJ.msgContent.tips);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            eCBannerContent = (ECBannerContent) c098200Yq;
        }
        this.LLIZLLLIL = eCBannerContent;
        if (this.LL.isDebugMode()) {
            return true;
        }
        ECBannerContent eCBannerContent2 = this.LLIZLLLIL;
        if (eCBannerContent2 != null && (l = eCBannerContent2.orderId) != null) {
            if (C1646406cY.LIZ(l.longValue()) < 3 && this.LLIZ.getChatType() != 3) {
                return true;
            }
            return false;
        }
        return false;
    }
}
