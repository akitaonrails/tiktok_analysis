package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XUC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XUC extends C09AY implements Function0<Keva> {
    public C0XUC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return Keva.getRepo("login_method_repo");
    }
}
