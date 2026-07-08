package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ejo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100260ejo extends C09AY implements Function1<C1838520xwY, CharSequence> {
    public C1100260ejo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(C1838520xwY c1838520xwY) {
        C1838520xwY c1838520xwY2 = c1838520xwY;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1838520xwY2.getMeasuredWidth());
        sbLIZ.append('x');
        sbLIZ.append(c1838520xwY2.getMeasuredHeight());
        sbLIZ.append("[max=");
        sbLIZ.append(c1838520xwY2.getMaxWidth());
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
