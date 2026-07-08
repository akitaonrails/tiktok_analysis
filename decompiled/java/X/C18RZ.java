package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18RZ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final /* synthetic */ class C18RZ extends C2217421BqW implements Function1<Integer, Unit> {
    public C18RZ(C18S2 c18s2) {
        super(1, c18s2, C18S2.class, "updateSelectedItems", "updateSelectedItems(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C18S2) this.receiver).N5(num.intValue());
        return Unit.LIZ;
    }
}
