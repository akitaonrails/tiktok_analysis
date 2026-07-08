package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646260PWm extends C09AY implements Function1<C0PWA, Object> {
    public C646260PWm() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(C0PWA c0pwa) {
        long j;
        C0PWA c0pwa2 = c0pwa;
        Object obj = c0pwa2.LIZJ;
        if (obj instanceof C0PM7) {
            j = ((C0PM7) obj).LL;
        } else {
            j = ((C0PM7) C646300PWq.LJI.LIZIZ(c0pwa2, EnumC646250PWl.SEARCH_ROOT).LIZJ()).LL;
        }
        return Long.valueOf(j);
    }
}
