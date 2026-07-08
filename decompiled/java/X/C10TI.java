package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10TI, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10TI extends C09AY implements Function0<Keva> {
    public C10TI() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("LoginAndConsentAssem");
    }
}
