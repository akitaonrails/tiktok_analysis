package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276561E8w extends C09AY implements Function0<InterfaceC2276571E8x> {
    public C2276561E8w() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1E8x, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC2276571E8x invoke() {
        return ServiceManager.get().getService(InterfaceC2276571E8x.class);
    }
}
