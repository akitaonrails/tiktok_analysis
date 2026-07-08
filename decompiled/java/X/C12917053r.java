package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.053r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12917053r extends C09AY implements Function0<String> {
    public static final /* synthetic */ int LL = 0;

    static {
        new C12917053r();
    }

    public C12917053r() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_init_in_app_vibration_");
        sbLIZ.append(C0I0B.LJFF.LIZ().getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
