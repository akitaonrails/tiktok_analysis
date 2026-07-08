package X;

import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330660Cxk implements Serializable {
    public final String highlightCids;
    public final List<StoryInsertUser> insertUsers;
    public final String storyCid;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C330660Cxk)) {
            return false;
        }
        C330660Cxk c330660Cxk = (C330660Cxk) obj;
        return Intrinsics.LJFF(this.insertUsers, c330660Cxk.insertUsers) && Intrinsics.LJFF(this.storyCid, c330660Cxk.storyCid) && Intrinsics.LJFF(this.highlightCids, c330660Cxk.highlightCids);
    }

    public C330660Cxk(List<StoryInsertUser> list, String str, String str2) {
        this.insertUsers = list;
        this.storyCid = str;
        this.highlightCids = str2;
    }
}
