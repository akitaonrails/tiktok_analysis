package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0xuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1837200xuQ extends Exception implements InterfaceC1193104ld {
    public static final C1837260xuW Companion = new Object() { // from class: X.0xuW
    };
    public final String LL;
    public final Throwable LLILLJJLI;
    public final String LLILLL;
    public final Map<String, String> LLILZ;

    public AbstractC1837200xuQ() {
        this(null, null, null);
    }

    public abstract int getErrorCode();

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1193104ld
    public Map<String, String> getLogMap() {
        return this.LLILZ;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LL;
    }

    public final String getMessageDisplay() {
        return this.LLILLL;
    }

    public AbstractC1837200xuQ(String str) {
        this(str, null, null);
    }

    public AbstractC1837200xuQ(String str, Throwable th) {
        this(str, th, null);
    }

    public AbstractC1837200xuQ(String str, Throwable th, String str2) {
        this.LL = str;
        this.LLILLJJLI = th;
        this.LLILLL = str2;
        this.LLILZ = new LinkedHashMap();
    }
}
