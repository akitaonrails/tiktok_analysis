package X;

import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0f6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1114600f6w implements InterfaceC1115280f82 {
    public final /* synthetic */ CommentWidget LIZ;
    public final /* synthetic */ String LIZIZ;

    public /* synthetic */ C1114600f6w(CommentWidget commentWidget, String str) {
        this.LIZ = commentWidget;
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC1115280f82
    public final void LIZ() {
        CommentWidget commentWidget = this.LIZ;
        String str = this.LIZIZ;
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = commentWidget.LLLLII;
        liveEmojiInputDialogFragment.hS(str);
        liveEmojiInputDialogFragment.LLJJLIIIJLLLLLLLZ.setIconAttr(R.attr.cjo);
    }
}
