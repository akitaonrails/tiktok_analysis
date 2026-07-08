package X;

import android.content.res.Resources;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rs5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709350Rs5 extends C09AY implements Function0<Float> {
    public C709350Rs5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(Resources.getSystem().getDisplayMetrics().density);
    }
}
