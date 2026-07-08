package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hDF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195390hDF extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ EnumC1195380hDE LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1195390hDF(EnumC1195380hDE enumC1195380hDE, String str, String str2, String str3, String str4) {
        super(1);
        this.LL = enumC1195380hDE;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        C1196140hES c1196140hES2 = c1196140hES;
        c1196140hES2.LJII(this.LL.LL, "poi data error");
        c1196140hES2.LJIIIIZZ("poi data error scene", this.LLILLJJLI);
        String str = this.LLILLL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1196140hES2.LJIILL = new Pair<>("poi data error poiid", str);
        String str3 = this.LLILZ;
        if (str3 == null) {
            str3 = "";
        }
        c1196140hES2.LJIILLIIL = new Pair<>("poi data error groupid", str3);
        String str4 = this.LLILZIL;
        if (str4 != null) {
            str2 = str4;
        }
        c1196140hES2.LJIIZILJ = new Pair<>("poi data error enterfrom", str2);
        return Unit.LIZ;
    }
}
