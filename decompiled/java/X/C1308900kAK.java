package X;

import android.util.TypedValue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kAK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308900kAK extends C09AY implements Function1<TypedValue, Integer> {
    public C1308900kAK() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(TypedValue typedValue) {
        TypedValue typedValue2 = typedValue;
        int i = typedValue2.type;
        if (i >= 28 && i <= 31) {
            return Integer.valueOf(typedValue2.data);
        }
        return null;
    }
}
