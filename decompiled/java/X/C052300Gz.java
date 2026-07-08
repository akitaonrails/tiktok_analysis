package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00Gz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C052300Gz extends C09AY implements Function1<String, CharSequence> {
    public C052300Gz() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\"');
        sbLIZ.append(str);
        sbLIZ.append('\"');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
