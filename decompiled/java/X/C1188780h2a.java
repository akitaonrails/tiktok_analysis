package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0h2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188780h2a extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188780h2a(String str, Integer num, String str2, boolean z, String str3) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = num;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        C1196140hES c1196140hES2 = c1196140hES;
        c1196140hES2.LIZ(this.LL ? 1 : 0, "load lynx status");
        Integer num = this.LLILLJJLI;
        if (num != null) {
            c1196140hES2.LIZIZ(num.intValue(), "lynx error code");
        }
        String str = this.LLILLL;
        if (str != null) {
            c1196140hES2.LJIIIIZZ = new Pair<>("biz_type", str);
        }
        String str2 = this.LLILZ;
        if (str2 != null) {
            c1196140hES2.LJIIIZ = new Pair<>("url", str2);
        }
        String str3 = this.LLILZIL;
        if (str3 != null) {
            c1196140hES2.LJIIJ = new Pair<>("reason", str3);
        }
        return Unit.LIZ;
    }
}
