package X;

/* JADX INFO: renamed from: X.0wbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1786910wbJ extends Exception {
    public static final C1786920wbK Companion = new Object() { // from class: X.0wbK
    };
    public final String LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;

    public final String getChannelName() {
        return this.LL;
    }

    public final int getErrorCode() {
        return this.LLILLJJLI;
    }

    public final String getErrorMessage() {
        return this.LLILLL;
    }

    public final Integer getErrorSubCode() {
        return this.LLILZ;
    }

    public C1786910wbJ(String str, int i, String str2, Integer num) {
        super(str2);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = num;
    }
}
