package X;

import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iJ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237430iJ3 extends C09AY implements Function0<TokenCert> {
    public C1237430iJ3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TokenCert invoke() {
        return TokenCert.Companion.with("bpea-general_in_app_precise_permission");
    }
}
