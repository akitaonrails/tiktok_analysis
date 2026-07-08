package X;

import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* JADX INFO: renamed from: X.07rL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1992907rL extends C2217421BqW implements Function1<Character, Boolean> {
    public static final C1992907rL LL = new C1992907rL();

    public C1992907rL() {
        super(1, CharsKt.class, "isLetterOrDigit", "isLetterOrDigit(C)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Character ch) {
        return Boolean.valueOf(Character.isLetterOrDigit(ch.charValue()));
    }
}
