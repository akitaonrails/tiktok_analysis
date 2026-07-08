package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.KeyStore;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14BV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14BV extends C09AY implements Function0<KeyStore.SecretKeyEntry> {
    public final /* synthetic */ C14BS LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14BV(C14BS c14bs) {
        super(0);
        this.LL = c14bs;
    }

    @Override // kotlin.jvm.functions.Function0
    public final KeyStore.SecretKeyEntry invoke() {
        C14BS c14bs = this.LL;
        c14bs.getClass();
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(c14bs.LIZ)) {
                c14bs.LIZJ();
            }
            return (KeyStore.SecretKeyEntry) keyStore.getEntry(c14bs.LIZ, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
