package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qdb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557690qdb extends C09AY implements Function1<Object, C1556420qbY> {
    public C1557690qdb() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1556420qbY invoke(Object obj) {
        String str;
        if (obj != null) {
            str = (String) obj;
        } else {
            str = null;
        }
        return new C1556420qbY(str);
    }
}
