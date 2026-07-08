package X;

import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService;
import com.bytedance.android.livesdk.impl.revenue.enigma.EnigmaService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KZN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0KZN extends C2217421BqW implements Function1<Throwable, Boolean> {
    public C0KZN(IEnigmaService iEnigmaService) {
        super(1, iEnigmaService, EnigmaService.class, "isRetryable", "isRetryable(Ljava/lang/Throwable;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Throwable th) {
        this.receiver.getClass();
        return Boolean.TRUE;
    }
}
