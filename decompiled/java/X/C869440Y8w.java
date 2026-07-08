package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Y8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869440Y8w extends C09AY implements Function1<C869450Y8x, CharSequence> {
    public C869440Y8w() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(C869450Y8x c869450Y8x) {
        C869450Y8x c869450Y8x2 = c869450Y8x;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(c869450Y8x2.LIZ);
        sbLIZ.append(' ');
        sbLIZ.append(c869450Y8x2.LIZIZ.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
