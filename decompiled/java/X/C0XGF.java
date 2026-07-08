package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XGF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XGF extends C09AY implements Function0<Keva> {
    public C0XGF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return KevaImpl.getRepo("keva_oidc_client_list", 1);
    }
}
