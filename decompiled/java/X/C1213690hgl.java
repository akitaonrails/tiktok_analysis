package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0hgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213690hgl {
    public final List<Function2<Float, Float, Unit>> LIZ = new ArrayList();
    public float LIZIZ = 0.0f;

    public final void LIZ(float f) {
        Iterator<Function2<Float, Float, Unit>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Float.valueOf(this.LIZIZ), Float.valueOf(f));
        }
        this.LIZIZ = f;
    }
}
