package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0mZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1401450mZb extends Aweme {
    public static final C1401460mZc Companion = new Object() { // from class: X.0mZc
    };
    public final List<String> LL;
    public final String LLILLJJLI;
    public int LLILLL;
    public boolean shouldUpdate = true;

    public final String getBiz() {
        return this.LLILLJJLI;
    }

    public final int getCount() {
        return this.LLILLL;
    }

    public final List<String> getQueryKeywords() {
        return this.LL;
    }

    public final void setCount(int i) {
        this.LLILLL = i;
    }

    public C1401450mZb(List<String> list, String str, int i) {
        this.LL = list;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }
}
