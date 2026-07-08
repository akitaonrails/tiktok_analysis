package X;

import com.ss.android.ttve.nativePort.TEEffectUtils;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1642350sq9 extends C2217421BqW implements Function0<String> {
    public static final C1642350sq9 LL = new C1642350sq9();

    public C1642350sq9() {
        super(0, C1A66.class, "getEffectSDKVer", "getEffectSDKVer()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return TEEffectUtils.getEffectVersion();
    }
}
