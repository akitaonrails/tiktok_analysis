package X;

import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* JADX INFO: renamed from: X.07rG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1992407rG extends C2217421BqW implements Function1<Character, Boolean> {
    public static final C1992407rG LL = new C1992407rG();

    public C1992407rG() {
        super(1, CharsKt.class, "isDigit", "isDigit(C)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Character ch) {
        return Boolean.valueOf(Character.isDigit(ch.charValue()));
    }
}
