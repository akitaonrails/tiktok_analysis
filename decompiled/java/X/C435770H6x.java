package X;

import android.text.StaticLayout;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0H6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C435770H6x extends C2217421BqW implements Function2<StaticLayout, Integer, Integer> {
    public static final C435770H6x LL = new C435770H6x();

    public C435770H6x() {
        super(2, StaticLayout.class, "getOffsetToLeftOf", "getOffsetToLeftOf(I)I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(StaticLayout staticLayout, Integer num) {
        return Integer.valueOf(staticLayout.getOffsetToLeftOf(num.intValue()));
    }
}
