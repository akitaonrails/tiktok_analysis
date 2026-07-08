package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18FS, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FS extends C09AY implements Function0<Object> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18FS(int i) {
        super(0);
        this.LL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeParent ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
