package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: renamed from: X.15kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20610715kv {
    public final String LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final List<Integer> LIZLLL;
    public final LogPbBean LJ;

    public C20610715kv(String str, List list, List list2, LogPbBean logPbBean, int i) {
        String str2;
        if ((i & 1) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        str = (i & 8) != 0 ? "" : str;
        int i2 = i & 16;
        list = (i & 32) != 0 ? C13BV.INSTANCE : list;
        list2 = (i & 64) != 0 ? C13BV.INSTANCE : list2;
        logPbBean = (i & 256) != 0 ? null : logPbBean;
        this.LIZ = str2;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = list2;
        this.LJ = logPbBean;
    }
}
