package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0e1X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072810e1X extends C09AY implements Function0<String> {
    public C1072810e1X() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return C0XQ7.LJFF().isNewUser() ? "sign_up" : "login";
    }
}
