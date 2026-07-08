package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qdd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557710qdd extends C09AY implements Function1<Object, C1556450qbb> {
    public C1557710qdd() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1556450qbb invoke(Object obj) {
        String str;
        if (obj != null) {
            str = (String) obj;
        } else {
            str = null;
        }
        return new C1556450qbb(str);
    }
}
