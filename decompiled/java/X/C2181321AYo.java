package X;

import java.util.List;
import kotlin.jvm.functions.Function0;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1AYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181321AYo extends C09AY implements Function0<List<? extends PosIdentity>> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181321AYo(C1AXM c1axm) {
        super(0);
        this.LL = c1axm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends PosIdentity> invoke() {
        return this.LL.LJJLIIJ().LJIIIZ();
    }
}
