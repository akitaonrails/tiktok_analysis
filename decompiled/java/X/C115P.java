package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.115P, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C115P extends C2217421BqW implements Function2<Integer, Integer, Integer> {
    public static final C115P LL = new C115P();

    public C115P() {
        super(2, C814440VxC.class, "min", "min(II)I", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(Integer num, Integer num2) {
        return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
    }
}
