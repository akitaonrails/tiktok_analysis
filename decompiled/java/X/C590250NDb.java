package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590250NDb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C590250NDb(C013C c013c, String str, long j) {
        super(0);
        this.LL = c013c;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C013C c013c = this.LL;
        C0NDV.LIZ.getClass();
        c013c.element = C0NDV.LJII().LJIIJ(this.LLILLL, System.currentTimeMillis(), this.LLILLJJLI);
        return Unit.LIZ;
    }
}
