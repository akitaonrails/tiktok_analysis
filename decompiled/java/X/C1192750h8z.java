package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0h8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192750h8z extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1192750h8z(Integer num, String str, int i, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = num;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        C1196140hES c1196140hES2 = c1196140hES;
        c1196140hES2.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(this.LL)), "gps request end");
        c1196140hES2.LJI(this.LLILLJJLI, "gps request duration");
        Integer num = this.LLILLL;
        if (num != null) {
            c1196140hES2.LIZIZ(num.intValue(), "error code");
        }
        String str = this.LLILZ;
        if (str != null) {
            c1196140hES2.LJFF("error msg", str);
        }
        return Unit.LIZ;
    }
}
