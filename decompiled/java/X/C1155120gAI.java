package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gAI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155120gAI extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1155120gAI(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fragment: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" disableUserVisibleHint");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
