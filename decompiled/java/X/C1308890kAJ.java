package X;

import android.util.TypedValue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kAJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308890kAJ extends C09AY implements Function1<TypedValue, Float> {
    public C1308890kAJ() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(TypedValue typedValue) {
        TypedValue typedValue2 = typedValue;
        if (typedValue2.type == 4) {
            return Float.valueOf(typedValue2.getFloat());
        }
        return null;
    }
}
