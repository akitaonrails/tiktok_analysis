package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0Pyb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662430Pyb implements Serializable {
    public String LL = "";
    public boolean LLILLJJLI = true;
    public int LLILLL = -1;
    public String LLILZ = "";
    public String LLILZIL = "";
    public User LLILZLL;
    public static final C662530Pyl Companion = new Object() { // from class: X.0Pyl
    };
    public static final int $stable = 8;

    public static final C662500Pyi newBuilder() {
        Companion.getClass();
        return new C662500Pyi();
    }

    public final int getRank() {
        return this.LLILLL;
    }

    public final String getSearchKeyWord() {
        return this.LLILZIL;
    }

    public final String getSearchResultId() {
        return this.LL;
    }

    public final String getTokenType() {
        return this.LLILZ;
    }

    public final User getUser() {
        return this.LLILZLL;
    }

    public final boolean isAladdin() {
        return this.LLILLJJLI;
    }

    public final void setAladdin(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setRank(int i) {
        this.LLILLL = i;
    }

    public final void setSearchKeyWord(String str) {
        this.LLILZIL = str;
    }

    public final void setSearchResultId(String str) {
        this.LL = str;
    }

    public final void setTokenType(String str) {
        this.LLILZ = str;
    }

    public final void setUser(User user) {
        this.LLILZLL = user;
    }
}
