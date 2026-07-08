package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gt7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182910gt7 extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182910gt7(Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = num;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        int i;
        C1196140hES c1196140hES2 = c1196140hES;
        c1196140hES2.LIZ(this.LL ? 1 : 0, "is_init");
        Integer num = this.LLILLJJLI;
        if (num != null && num.intValue() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        c1196140hES2.LIZIZ(i, "is_success");
        c1196140hES2.LIZJ(this.LLILLL ? 1 : 0, "is_empty");
        c1196140hES2.LIZLLL(this.LLILZ ? 1 : 0, "location_allowed");
        c1196140hES2.LJIIIIZZ("log_id", String.valueOf(this.LLILZIL));
        String str = this.LLILZLL;
        if (str != null) {
            c1196140hES2.LJFF("enter_from", str);
        }
        return Unit.LIZ;
    }
}
