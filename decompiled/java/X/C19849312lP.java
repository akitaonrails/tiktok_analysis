package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.12lP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19849312lP extends IOException {
    public C19849312lP(String str) {
        super(str);
    }

    public C19849312lP(String str, Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }
}
