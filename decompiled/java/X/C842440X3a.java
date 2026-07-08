package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0X3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842440X3a extends C09AY implements Function1<C842480X3e, CharSequence> {
    public C842440X3a() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(C842480X3e c842480X3e) {
        C842480X3e c842480X3e2 = c842480X3e;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c842480X3e2.LIZ);
        sbLIZ.append(',');
        sbLIZ.append(c842480X3e2.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
