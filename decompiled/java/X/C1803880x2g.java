package X;

import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1803880x2g extends Throwable {
    public final Throwable LL;
    public final IapListResult.ListResultExtra LLILLJJLI;

    public final Throwable getError() {
        return this.LL;
    }

    public final IapListResult.ListResultExtra getResultExtra() {
        return this.LLILLJJLI;
    }

    public C1803880x2g(Throwable th, IapListResult.ListResultExtra listResultExtra) {
        super(th);
        this.LL = th;
        this.LLILLJJLI = listResultExtra;
    }
}
