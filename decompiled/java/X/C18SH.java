package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18SH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18SH extends C09AY implements Function1<C18S9, C18S9> {
    public final /* synthetic */ float LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18SH(float f) {
        super(1);
        this.LL = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C18S9 invoke(C18S9 c18s9) {
        return C18S9.LIZ(c18s9, false, null, false, 2 * this.LL, null, null, null, 119);
    }
}
