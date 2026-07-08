package X;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.publicscreen.api.ExtendedPublicScreenFilterTypeChannel;
import com.bytedance.android.live.publicscreen.impl.DisplayUserMarkFilterData;
import com.bytedance.android.live.setting.LiveMinusOneScreenTipsInFeedSetting;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenShowMarkViewerGuide;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0f2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111950f2f extends C1111930f2d<InterfaceC1112710f3t> {
    public final SparseArray<InterfaceC1112510f3Z<InterfaceC1112060f2q>> e;
    public C1112140f2y f;
    public final C01GW g;
    public boolean h;
    public int i;

    @Override // X.C1111930f2d, X.InterfaceC1110630f0X, X.InterfaceC1109340eyS
    public final boolean LIZ() {
        return true;
    }

    @Override // X.C1111930f2d
    public final void LJLIIL() {
    }

    @Override // X.C1111930f2d
    public final boolean LJLJJL() {
        return false;
    }

    @Override // X.C1111930f2d, X.AbstractC1112030f2n
    public final void LJJJJLL() {
        C1113050f4R c1113050f4R = new C1113050f4R();
        this.LLILLL = c1113050f4R;
        this.LL.LIZ(c1113050f4R);
        this.LL.LIZ(new C1113060f4S());
    }

    @Override // X.C1111930f2d
    public final void LJJJLIIL() {
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.ROOM.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.CHAT.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.EMOTE_CHAT.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.GIFT.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.MEMBER.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.LIVE_UNAUTHORIZED_MEMBER_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.DIGG.getIntType(), (OnIMMessageListener) this);
            InterfaceC1085480eLy interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(this.LLLJL.LJIIZILJ);
            if (interfaceC1085480eLyO41 != null && interfaceC1085480eLyO41.isEnabled()) {
                this.mMessageManager.addMessageListener(C001A.LIKE.getIntType(), (OnIMMessageListener) this);
            }
            this.mMessageManager.addMessageListener(C001A.SOCIAL.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.CONTROL.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.SCREEN.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.COMMENT_IMAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.GOODS_ORDER.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.ASSET_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.PORTAL_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.LIVE_INTRO_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.ROOM_VERIFY.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.IM_DELETE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.QUESTION_DELETE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.RED_ENVELOPE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.ENVELOPE_PORTAL_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.SUB_NOTIFY_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.GIFT_COLLECTION_UPDATE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.GIFT_GALLERY_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.MODERATOR_OPERATE_MESSAGE.getIntType(), (OnIMMessageListener) this);
            if (this.LLLJL.LJI) {
                this.mMessageManager.addMessageListener(C001A.ANCHOR_GROW_LEVEL_MESSAGE.getIntType(), (OnIMMessageListener) this);
            }
            this.mMessageManager.addMessageListener(C001A.A_I_SUMMARY_MESSAGE.getIntType(), (OnIMMessageListener) this);
            this.mMessageManager.addMessageListener(C001A.WHISPER_MESSAGE.getIntType(), (OnIMMessageListener) this);
            if (LiveMinusOneScreenTipsInFeedSetting.isTipsInFeedEnabled()) {
                this.mMessageManager.addMessageListener(C001A.INTERACTION_HUB_GOAL_MESSAGE.getIntType(), (OnIMMessageListener) this);
            }
        }
    }

    @Override // X.C1111930f2d
    public final void LJJLIIIJJIZ() {
        Fragment fragmentEx1;
        InterfaceC1112050f2p interfaceC1112050f2p;
        Fragment fragmentEx12;
        InterfaceC1112050f2p interfaceC1112050f2p2 = (InterfaceC1112050f2p) this.mView;
        if (interfaceC1112050f2p2 == null || (fragmentEx1 = interfaceC1112050f2p2.ex1()) == null || (interfaceC1112050f2p = (InterfaceC1112050f2p) this.mView) == null || (fragmentEx12 = interfaceC1112050f2p.ex1()) == null || fragmentEx12.getActivity() == null) {
            return;
        }
        this.LLILLJJLI = (PinMessageViewModel) ViewModelProviders.of(fragmentEx1).get("extended", PinMessageViewModel.class);
    }

    @Override // X.C1111930f2d
    public final int LJJZZI() {
        return ((Number) this.g.getValue()).intValue();
    }

    public final void LLIIII() {
        InterfaceC1112060f2q interfaceC1112060f2q;
        C1111990f2j<InterfaceC1112060f2q> c1111990f2j = this.LLJLL;
        if ((c1111990f2j.LJI ? c1111990f2j.LIZJ.isEmpty() : c1111990f2j.LIZIZ.isEmpty()) && ((interfaceC1112060f2q = this.LLLLIILLL) == null || C500260Jjc.LJJJI(Boolean.valueOf(this.LLJLL.LIZ(interfaceC1112060f2q))))) {
            ((InterfaceC1112710f3t) this.mView).cI1(C497740JfY.LJIJI(2131843079));
        } else {
            ((InterfaceC1112710f3t) this.mView).ay1();
        }
    }

    @Override // X.C1111930f2d
    public final EnumC1112150f2z LJLZ() {
        return EnumC1112150f2z.ExtendedMain;
    }

    public C1111950f2f(boolean z) {
        super(z);
        this.e = new SparseArray<>();
        this.g = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(170));
    }

    @Override // X.C1111930f2d
    public final void LLFII(List<? extends InterfaceC1112060f2q> list) {
        InterfaceC1112680f3q interfaceC1112680f3q;
        super.LLFII(list);
        boolean z = false;
        if (this.h && ((ArrayList) list).size() == 1 && (interfaceC1112680f3q = (InterfaceC1112680f3q) C13LP.LJJJLL(list)) != null && interfaceC1112680f3q.LJJLJ()) {
            return;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1112060f2q) it2.next()).LJLJJI()) {
                if (!C500260Jjc.LJJIFFI(InterfaceC772190UQv.q3.LIZIZ())) {
                    int i = this.i + 1;
                    this.i = i;
                    if (i > 5) {
                        this.dataChannel.FQ2(LiveExtendedScreenShowMarkViewerGuide.class);
                    }
                }
                z = true;
            }
        }
        if (z) {
            this.dataChannel.zW(DisplayUserMarkFilterData.class, Boolean.TRUE);
            this.h = true;
        }
    }

    @Override // X.AbstractC1112030f2n, X.AbstractC945390ai1
    /* JADX INFO: renamed from: LLII, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC1112710f3t interfaceC1112710f3t) {
        super.attachView(interfaceC1112710f3t);
        this.LLLJL.LJJ = true;
        if (this.dataChannel != null) {
            this.e.put(1, new InterfaceC1112510f3Z<InterfaceC1112060f2q>() { // from class: X.0f3F
                @Override // X.InterfaceC1112510f3Z
                public final boolean filter(InterfaceC1112060f2q interfaceC1112060f2q) {
                    InterfaceC1112060f2q interfaceC1112060f2q2 = interfaceC1112060f2q;
                    if (!(interfaceC1112060f2q2 instanceof AbstractC1110800f0o)) {
                        return true;
                    }
                    return true ^ ((AbstractC1110790f0n) interfaceC1112060f2q2).LJLJJI();
                }
            });
            this.dataChannel.BQ2(interfaceC1112710f3t, ExtendedPublicScreenFilterTypeChannel.class, new AwS596S0100000_17(this, 370));
        }
    }
}
