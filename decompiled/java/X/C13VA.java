package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13VA, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13VA extends C09AY implements Function0<Keva> {
    public C13VA() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("prev_login_task");
    }
}
