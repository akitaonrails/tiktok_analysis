package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bWL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976590bWL extends C09AY implements Function1<C470590Icr<Unit>, Unit> {
    public final /* synthetic */ C975970bVL LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C976590bWL(C975970bVL c975970bVL, boolean z, boolean z2, Function0<Unit> function0) {
        super(1);
        this.LL = c975970bVL;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C470590Icr<Unit> c470590Icr) {
        C975970bVL c975970bVL = this.LL;
        c975970bVL.LJIIJJI = false;
        if (this.LLILLJJLI) {
            if (this.LLILLL) {
                c975970bVL.LJJIJ("punish_cut_short_request_negative", false);
            } else {
                c975970bVL.LJJIJ("cut_short_request", false);
            }
        }
        this.LLILZ.invoke();
        return Unit.LIZ;
    }
}
