package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0euJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106770euJ extends C09AY implements Function1<Object, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Class<TYPE> LLILLJJLI;
    public final /* synthetic */ Function1<TYPE, Unit> LLILLL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1106770euJ(String str, Class<TYPE> cls, Function1<? super TYPE, Unit> function1, Function1<? super Throwable, Unit> function12) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = cls;
        this.LLILLL = function1;
        this.LLILZ = function12;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        C1106750euH c1106750euH = C1106750euH.LIZ;
        Object objLIZLLL = C1106750euH.LIZLLL(C1106750euH.LJ().get(this.LL), this.LLILLJJLI);
        if (objLIZLLL != null) {
            this.LLILLL.invoke((TYPE) objLIZLLL);
        } else {
            final Throwable th = null;
            final String str = "Failed to convert response data";
            this.LLILZ.invoke(new AbstractC1106920euY(str, th) { // from class: X.0eua
            });
        }
        return Unit.LIZ;
    }
}
