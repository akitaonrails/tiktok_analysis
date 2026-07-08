package X;

import android.app.Application;
import android.widget.Space;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15k3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20605315k3 extends C09AY implements Function0<Space> {
    public C20605315k3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Space invoke() {
        Application application = C20605015k0.LIZIZ;
        if (application == null) {
            application = null;
        }
        return new Space(application);
    }
}
