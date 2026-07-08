package X;

import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;

/* JADX INFO: renamed from: X.06sm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1747006sm implements FakeMsgContent {
    public final int LL;
    public final String LLILLJJLI;
    public final long LLILLL;
    public final String LLILZ;
    public final int LLILZIL;

    @Override // com.ss.android.ugc.aweme.im.message.content.FakeMsgContent
    public final int getMsgType() {
        return this.LL;
    }

    public C1747006sm(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LL = 1;
        this.LLILLJJLI = str;
        this.LLILLL = jCurrentTimeMillis;
        this.LLILZ = "suggested_reply_exit_scene";
        this.LLILZIL = 1;
    }
}
