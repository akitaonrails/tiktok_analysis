package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022940cj6 extends C09AY implements Function0<String> {
    public C1022940cj6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return DeviceRegisterManager.getOpenUdId();
    }
}
