package X;

import com.ss.android.ugc.aweme.IPasskeyPopUpHelper;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HYW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HYW extends C09AY implements Function0<IPasskeyPopUpHelper> {
    public C0HYW() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.IPasskeyPopUpHelper, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IPasskeyPopUpHelper invoke() {
        return ServiceManager.get().getService(IPasskeyPopUpHelper.class);
    }
}
