package X;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0his, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1215000his extends C2217421BqW implements Function1<Integer, Integer> {
    public C1215000his(Object obj) {
        super(1, obj, Resources.class, "getDimensionPixelSize", "getDimensionPixelSize(I)I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Integer num) {
        return Integer.valueOf(((Resources) this.receiver).getDimensionPixelSize(num.intValue()));
    }
}
