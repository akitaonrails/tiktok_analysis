package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.115Q, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C115Q extends C2217421BqW implements Function2<Integer, Integer, Integer> {
    public static final C115Q LL = new C115Q();

    public C115Q() {
        super(2, C814440VxC.class, "max", "max(II)I", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(Integer num, Integer num2) {
        return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
    }
}
