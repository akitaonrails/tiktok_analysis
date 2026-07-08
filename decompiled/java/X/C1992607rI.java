package X;

import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* JADX INFO: renamed from: X.07rI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1992607rI extends C2217421BqW implements Function1<Character, Boolean> {
    public static final C1992607rI LL = new C1992607rI();

    public C1992607rI() {
        super(1, CharsKt.class, "isLetter", "isLetter(C)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Character ch) {
        return Boolean.valueOf(Character.isLetter(ch.charValue()));
    }
}
