package X;

import android.view.Choreographer;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348350lBx extends C09AY implements Function0<Object> {
    public C1348350lBx() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1348340lBw.LIZ.getClass();
        Field fieldLIZ = C1961107mD.LIZ(Choreographer.class, "FRAME_CALLBACK_TOKEN");
        if (fieldLIZ != null) {
            return fieldLIZ.get(null);
        }
        return null;
    }
}
