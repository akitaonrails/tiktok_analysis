package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WYE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WYE extends C09AY implements Function0<Keva> {
    public final /* synthetic */ C0WYD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WYE(C0WYD c0wyd) {
        super(0);
        this.LL = c0wyd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        return this.LL.LJ.invoke();
    }
}
