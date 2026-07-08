package X;

import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0f7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class RunnableC1115110f7l implements Runnable {
    public final /* synthetic */ LiveEmojiInputDialogFragment LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    public /* synthetic */ RunnableC1115110f7l(LiveEmojiInputDialogFragment liveEmojiInputDialogFragment, long j, int i, int i2) {
        this.LL = liveEmojiInputDialogFragment;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LL;
        long j = this.LLILLJJLI;
        int i = this.LLILLL;
        int i2 = this.LLILZ;
        liveEmojiInputDialogFragment.getClass();
        C1C7U.LIZ("LiveEmojiInputDialogFragment@b667.tryRestoreSoftKeyboard$1L");
        if (!liveEmojiInputDialogFragment.isResumed() || !liveEmojiInputDialogFragment.LLILZLL) {
            C1C7U.LIZIZ("LiveEmojiInputDialogFragment@b667.tryRestoreSoftKeyboard$1L");
            return;
        }
        KeyBoardUtil.LIZLLL(liveEmojiInputDialogFragment.getContext(), liveEmojiInputDialogFragment.LLJLILLLLZIIL);
        int i3 = i + 1;
        if (liveEmojiInputDialogFragment.LLJLILLLLZIIL != null && i3 <= i2 && liveEmojiInputDialogFragment.LLIZ) {
            HandlerHook.viewPostDelay(liveEmojiInputDialogFragment.LLJLILLLLZIIL, new RunnableC1115110f7l(liveEmojiInputDialogFragment, j, i3, i2), j);
        }
        C1C7U.LIZIZ("LiveEmojiInputDialogFragment@b667.tryRestoreSoftKeyboard$1L");
    }
}
