package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0WTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C823770WTf extends C2217421BqW implements Function2<Integer, Integer, Integer> {
    public static final C823770WTf LL = new C823770WTf();

    public C823770WTf() {
        super(2, Integer.TYPE, "plus", "plus(I)I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(Integer num, Integer num2) {
        return Integer.valueOf(num.intValue() + num2.intValue());
    }
}
