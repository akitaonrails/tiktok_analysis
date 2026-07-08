package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1662670tMv extends C09AY implements Function1<C1662500tMe, C1662500tMe> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1662670tMv(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
        this.LLILZIL = z5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1662500tMe invoke(C1662500tMe c1662500tMe) {
        boolean z;
        C1662500tMe c1662500tMe2 = c1662500tMe;
        if (!this.LL && this.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        return C1662500tMe.LIZ(c1662500tMe2, null, null, null, false, false, new C375830EoP(Boolean.valueOf(this.LLILLL)), z, this.LLILZ, false, this.LLILZIL, null, null, false, null, 31279);
    }
}
