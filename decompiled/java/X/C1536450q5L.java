package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q5L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536450q5L extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ C1537480q70 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536450q5L(C1537480q70 c1537480q70, boolean z, C1536400q5G c1536400q5G) {
        super(1);
        this.LL = c1537480q70;
        this.LLILLJJLI = z;
        this.LLILLL = c1536400q5G;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        C1533790q13 c1533790q132 = c1533790q13;
        boolean z = C1536390q5F.LIZ;
        C1536410q5H c1536410q5HLIZJ = C1536390q5F.LIZJ(this.LL, null);
        if (c1536410q5HLIZJ != null) {
            c1536410q5HLIZJ.LIZJ(c1533790q132);
        }
        if (this.LLILLJJLI) {
            C086F c086f = C086F.LIZ;
            final Function1<Boolean, Unit> function1 = this.LLILLL;
            Runnable runnable = new Runnable() { // from class: X.00kL
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LynxI18nUtils@8acb.tryFetchCache$4$1");
                    try {
                        function1.invoke(Boolean.FALSE);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LynxI18nUtils@8acb.tryFetchCache$4$1");
                }
            };
            c086f.getClass();
            C086F.LJII(runnable);
        } else {
            C086F c086f2 = C086F.LIZ;
            final Function1<Boolean, Unit> function12 = this.LLILLL;
            Runnable runnable2 = new Runnable() { // from class: X.00kM
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LynxI18nUtils@8acb.tryFetchCache$4$2");
                    try {
                        function12.invoke(Boolean.FALSE);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LynxI18nUtils@8acb.tryFetchCache$4$2");
                }
            };
            c086f2.getClass();
            C086F.LIZLLL(runnable2);
        }
        return Unit.LIZ;
    }
}
