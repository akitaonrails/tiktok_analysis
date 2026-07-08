package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0Nbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597210Nbb implements InterfaceC1608000rwk {
    public final Aweme LL;
    public final Long LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final C1231704rr LLILZIL;
    public InterfaceC594490NTj LLILZLL;
    public AnonymousClass0956 LLIZ;

    @Override // X.InterfaceC1608000rwk
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1608000rwk
    public final void LIZIZ(long j, boolean z) {
    }

    @Override // X.InterfaceC1608000rwk
    public final void LIZJ(long j) {
    }

    @Override // X.InterfaceC1608000rwk
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC1608000rwk
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC1608000rwk
    public final void LJI() {
        this.LLILZLL = null;
        AnonymousClass0956 anonymousClass0956 = this.LLIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC1608000rwk
    public final Aweme LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC1608000rwk
    public final void deleteItem(String str) {
    }

    @Override // X.InterfaceC1608000rwk
    public final long getStartIndex() {
        return -1L;
    }

    @Override // X.InterfaceC1608000rwk
    public final void refresh() {
        String str = this.LLILLL;
        if (str == null) {
            return;
        }
        this.LLIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C597240Nbe(this, str, null), 3);
    }

    @Override // X.InterfaceC1608000rwk
    public final void LJ(C1607990rwj c1607990rwj) {
        this.LLILZLL = c1607990rwj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r15, java.lang.String r16, X.InterfaceC1364105Vn<? super java.lang.Boolean> r17) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C597210Nbb.LJII(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public C597210Nbb(Aweme aweme, Long l, String str, String str2) {
        C1231704rr c1231704rr = new C1231704rr("B2CAwemeIdProvider", null, 6);
        this.LL = aweme;
        this.LLILLJJLI = l;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c1231704rr;
    }
}
