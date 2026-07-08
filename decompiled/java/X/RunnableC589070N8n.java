package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0N8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC589070N8n implements Runnable {
    public final Aweme LL;
    public boolean LLILLJJLI;
    public final /* synthetic */ CommerceVideoDelegateKt LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CommerceVideoDelegateKt$AwesomeTask@3e69.run");
        try {
            Aweme aweme = this.LL;
            if (aweme != null && !this.LLILLJJLI) {
                String aid = aweme.getAid();
                Aweme aweme2 = this.LLILLL.aweme;
                if (TextUtils.equals(aid, aweme2 != null ? aweme2.getAid() : null) && this.LLILLL.isSelected) {
                    this.LLILLL.LLZLLLL(this.LL, false);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceVideoDelegateKt$AwesomeTask@3e69.run");
    }

    public RunnableC589070N8n(CommerceVideoDelegateKt commerceVideoDelegateKt, Aweme aweme) {
        this.LLILLL = commerceVideoDelegateKt;
        this.LL = aweme;
    }
}
