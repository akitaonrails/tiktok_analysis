package X;

import android.text.StaticLayout;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0H6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C435780H6y extends C2217421BqW implements Function2<StaticLayout, Integer, Integer> {
    public static final C435780H6y LL = new C435780H6y();

    public C435780H6y() {
        super(2, StaticLayout.class, "getOffsetToRightOf", "getOffsetToRightOf(I)I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(StaticLayout staticLayout, Integer num) {
        return Integer.valueOf(staticLayout.getOffsetToRightOf(num.intValue()));
    }
}
