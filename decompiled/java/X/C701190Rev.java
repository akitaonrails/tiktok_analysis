package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701190Rev extends C09AY implements Function1<C701030Ref, C700790ReH> {
    public final /* synthetic */ C700170RdH LL;
    public final /* synthetic */ C700790ReH LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701190Rev(C700170RdH c700170RdH, C700790ReH c700790ReH) {
        super(1);
        this.LL = c700170RdH;
        this.LLILLJJLI = c700790ReH;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C700790ReH invoke(C701030Ref c701030Ref) {
        C700970ReZ c700970ReZ;
        C701030Ref c701030Ref2 = c701030Ref;
        C700170RdH c700170RdH = this.LL;
        if (c701030Ref2 instanceof C700970ReZ) {
            c700970ReZ = (C700970ReZ) c701030Ref2;
        } else {
            c700970ReZ = null;
        }
        return new C700790ReH(c700170RdH, c700970ReZ, this.LLILLJJLI.nodeKeys);
    }
}
