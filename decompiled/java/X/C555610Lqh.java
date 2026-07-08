package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Lqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555610Lqh extends Exception {
    public final int LL;
    public final String LLILLJJLI;
    public final InterfaceC1406105et LLILLL;
    public final Throwable LLILZ;
    public final Map<String, InterfaceC1406105et> LLILZIL;

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.LLILZ;
    }

    public final InterfaceC1406105et getCustomContext() {
        return this.LLILLL;
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMessage() {
        return this.LLILLJJLI;
    }

    public final Map<String, InterfaceC1406105et> getExtras() {
        return this.LLILZIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C555610Lqh(int i, String str, InterfaceC1406105et interfaceC1406105et, Throwable th, Map<String, ? extends InterfaceC1406105et> map) {
        super(str, th);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC1406105et;
        this.LLILZ = th;
        this.LLILZIL = map;
    }
}
