package X;

import Y.AObserverS189S0200000_29;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.groupchat.DMGroupChatStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.14Ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20280014Ww extends AbstractC19588311kP<DMGroupChatStickerModel> {
    public boolean LLILZIL;
    public final Aweme LLILZLL;
    public final C20280114Wx LLIZ;

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C20280114Wx c20280114Wx = this.LLIZ;
        c20280114Wx.LL.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20280114Wx c20280114Wx = this.LLIZ;
        c20280114Wx.LL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    public C20280014Ww(Context context) {
        super(0, 14, context, (AttributeSet) null);
        this.LLIZ = new C20280114Wx();
    }

    public static void LJI(int i, Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs;
        DMGroupChatStickerStruct dMGroupChatStickerStructCopy;
        InteractStickerStruct next;
        if (aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
            Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
            while (true) {
                dMGroupChatStickerStructCopy = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getType() == EnumC1466150oFx.DM_GROUP_CHAT.getType()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InteractStickerStruct interactStickerStruct = next;
            if (interactStickerStruct != null) {
                DMGroupChatStickerStruct groupChatStickerStruct = interactStickerStruct.getGroupChatStickerStruct();
                if (groupChatStickerStruct != null) {
                    dMGroupChatStickerStructCopy = groupChatStickerStruct.copy(groupChatStickerStruct.conversationShortId, groupChatStickerStruct.groupName, groupChatStickerStruct.groupAvatar, groupChatStickerStruct.accessCriteriaCopy, Integer.valueOf(i), groupChatStickerStruct.uiStyle, groupChatStickerStruct.eventTracking, groupChatStickerStruct.groupMemberCount, groupChatStickerStruct.groupDesc);
                }
                interactStickerStruct.setGroupChatStickerStruct(dMGroupChatStickerStructCopy);
            }
        }
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        DMGroupChatStickerModel dMGroupChatStickerModel;
        MutableLiveData<Boolean> mutableLiveData;
        if ((stickerModel instanceof DMGroupChatStickerModel) && (dMGroupChatStickerModel = (DMGroupChatStickerModel) stickerModel) != null && dMGroupChatStickerModel.isNotEmptyModel()) {
            addView(LJFF(new C1664680tQA<>(dMGroupChatStickerModel), false, this.LLILZLL));
            C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
            if (interactStickerContainerCommonParam != null && (mutableLiveData = interactStickerContainerCommonParam.LJIILIIL) != null) {
                mutableLiveData.observe(this.LLIZ, new AObserverS189S0200000_29(this, dMGroupChatStickerModel, 7));
            }
        }
    }

    public C20280014Ww(C19EG c19eg, C19591211ks c19591211ks, Aweme aweme) {
        super(0, c19eg, (AttributeSet) null, c19591211ks);
        this.LLIZ = new C20280114Wx();
        this.LLILZLL = aweme;
    }

    public final ComposeView LJFF(C1664680tQA<DMGroupChatStickerModel> c1664680tQA, boolean z, Aweme aweme) {
        ComposeView composeView = new ComposeView(getContext(), null, 6);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-834011020, new C19631611rO(c1664680tQA, this, z, aweme), true));
        return composeView;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1664680tQA<com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel> r59, boolean r60, com.ss.android.ugc.aweme.feed.model.Aweme r61, X.InterfaceC1680500tpg r62, int r63, int r64) {
        /*
            Method dump skipped, instruction units count: 1217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20280014Ww.LIZIZ(X.0tQA, boolean, com.ss.android.ugc.aweme.feed.model.Aweme, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C1664680tQA<com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel> r54, boolean r55, com.ss.android.ugc.aweme.feed.model.Aweme r56, X.InterfaceC1680500tpg r57, int r58, int r59) {
        /*
            Method dump skipped, instruction units count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20280014Ww.LIZLLL(X.0tQA, boolean, com.ss.android.ugc.aweme.feed.model.Aweme, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C1664680tQA<com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel> r47, boolean r48, com.ss.android.ugc.aweme.feed.model.Aweme r49, boolean r50, X.InterfaceC1680500tpg r51, int r52, int r53) {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20280014Ww.LJ(X.0tQA, boolean, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, X.0tpg, int, int):void");
    }
}
