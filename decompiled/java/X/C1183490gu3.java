package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gu3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183490gu3 extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1183490gu3(int i, String str, boolean z) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        C1196140hES c1196140hES2 = c1196140hES;
        c1196140hES2.LJIIIZ(this.LL);
        String str = this.LLILLJJLI;
        if (str != null) {
            c1196140hES2.LJ("biz status code: code of exception_ux or status_code of response", str);
        }
        c1196140hES2.LJI(!this.LLILLL ? 1 : 0, "is initial fetch?");
        return Unit.LIZ;
    }
}
