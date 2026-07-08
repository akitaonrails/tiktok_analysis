package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hEX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196190hEX extends C09AY implements Function1<C1196140hES, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1196190hEX(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1196140hES c1196140hES) {
        C1196140hES c1196140hES2 = c1196140hES;
        c1196140hES2.LIZ(C1189060h32.LJJIIZ(Boolean.valueOf(this.LL)), "has_permission");
        c1196140hES2.LIZIZ(C1189060h32.LJJIIZ(Boolean.valueOf(this.LLILLJJLI)), "shouldShowRequestPermissionRationaleBefore");
        c1196140hES2.LIZJ(C1189060h32.LJJIIZ(Boolean.valueOf(this.LLILLL)), "shouldShowRequestPermissionRationaleAfter");
        c1196140hES2.LIZLLL(C1189060h32.LJJIIZ(Boolean.valueOf(this.LLILZ)), "metTime");
        String str = this.LLILZIL;
        if (str != null) {
            c1196140hES2.LJIIIIZZ = new Pair<>("certToken", str);
        }
        String str2 = this.LLILZLL;
        if (str2 != null) {
            c1196140hES2.LJIIIZ = new Pair<>("certToken", str2);
        }
        String str3 = this.LLIZ;
        if (str3 != null) {
            c1196140hES2.LJIIJ = new Pair<>("certToken", str3);
        }
        return Unit.LIZ;
    }
}
