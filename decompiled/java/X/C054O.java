package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.054O, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054O extends C09AY implements Function0<String> {
    public C054O() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
        return curUserId == null ? "" : curUserId;
    }
}
