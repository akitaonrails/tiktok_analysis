package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00un, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C230700un extends C09AY implements Function1<C230600um, C230600um> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C230700un(boolean z, int i) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C230600um invoke(C230600um c230600um) {
        return C230600um.LIZ(c230600um, null, new C291001Au(new Pair(Boolean.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI))), null, 5);
    }
}
