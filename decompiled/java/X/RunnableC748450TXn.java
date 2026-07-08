package X;

import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0TXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class RunnableC748450TXn implements Runnable {
    public final /* synthetic */ C748440TXm LL;
    public final /* synthetic */ EditText LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    public RunnableC748450TXn(C748440TXm c748440TXm, EditText editText, long j, int i, int i2) {
        this.LL = c748440TXm;
        this.LLILLJJLI = editText;
        this.LLILLL = j;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("BlockWordView@4f61.tryRestoreSoftKeyboard$1");
        try {
            if (!this.LL.LLJILLL) {
                C500260Jjc.LJLLILLLL(this.LLILLJJLI);
                C748440TXm c748440TXm = this.LL;
                EditText editText = this.LLILLJJLI;
                long j = this.LLILLL;
                int i = this.LLILZ + 1;
                int i2 = this.LLILZIL;
                c748440TXm.getClass();
                if (i <= i2 && editText != null) {
                    HandlerHook.viewPostDelay(editText, new RunnableC748450TXn(c748440TXm, editText, j, i, i2), j);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BlockWordView@4f61.tryRestoreSoftKeyboard$1");
    }
}
