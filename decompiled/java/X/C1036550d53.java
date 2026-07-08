package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0d53, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1036550d53 extends C09AY implements Function2<C1251150ifB, String, Unit> {
    public final /* synthetic */ C1036540d52 LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1036550d53(C1036540d52 c1036540d52, int i) {
        super(2);
        this.LL = c1036540d52;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1251150ifB c1251150ifB, String str) {
        C419910GdJ c419910GdJ;
        C1251150ifB c1251150ifB2 = c1251150ifB;
        String str2 = str;
        int iHashCode = str2.hashCode();
        if (iHashCode != -1577550664) {
            if (iHashCode != 1452188919) {
                if (iHashCode == 1452530533 && str2.equals("navBarMore") && (c419910GdJ = this.LL.LJIIL) != null) {
                    c419910GdJ.LIZLLL = Integer.valueOf(this.LLILLJJLI);
                    c1251150ifB2.LIZIZ(c419910GdJ);
                }
            } else if (str2.equals("navBarBack") && (c419910GdJ = this.LL.LJIIJJI) != null) {
                c419910GdJ.LIZLLL = Integer.valueOf(this.LLILLJJLI);
                c1251150ifB2.LIZIZ(c419910GdJ);
            }
        } else if (str2.equals("navBarShoppingCart") && (c419910GdJ = this.LL.LJIILIIL) != null) {
            c419910GdJ.LIZLLL = Integer.valueOf(this.LLILLJJLI);
            c1251150ifB2.LIZIZ(c419910GdJ);
        }
        return Unit.LIZ;
    }
}
