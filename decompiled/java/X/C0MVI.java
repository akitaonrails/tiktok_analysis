package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MVI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MVI extends C09AY implements Function0<C537750L7d> {
    public C0MVI() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0L7d] */
    @Override // kotlin.jvm.functions.Function0
    public final C537750L7d invoke() {
        return new InterfaceC536090L0t() { // from class: X.0L7d
            @Override // X.InterfaceC536090L0t
            public final C571560MbK LIZIZ(CreativeInfo creativeInfo) {
                return new C571560MbK(creativeInfo);
            }

            @Override // X.InterfaceC536090L0t
            public final C0L7R LIZ(Activity activity, long j, long j2, boolean z, C1DRG c1drg) {
                return new C0L7R(activity, j, j2, z, c1drg);
            }
        };
    }
}
