package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07hg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1933007hg implements InterfaceC1936307iD<Boolean> {
    @Override // X.InterfaceC1936307iD
    public final Boolean parse(String str) {
        String lowerCase = a0.LJLIIIL(str).toString().toLowerCase(Locale.ROOT);
        if (Intrinsics.LJFF(lowerCase, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.LJFF(lowerCase, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }
}
