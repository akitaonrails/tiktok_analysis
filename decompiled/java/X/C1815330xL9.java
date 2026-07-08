package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xL9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815330xL9 extends C09AY implements Function1<C00IK, C00IK> {
    public final /* synthetic */ List<InterfaceC1891350zJl> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815330xL9(List<InterfaceC1891350zJl> list) {
        super(1);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C00IK invoke(C00IK c00ik) {
        List<InterfaceC1891350zJl> list = this.LL;
        c00ik.getClass();
        return new C00IK(list);
    }
}
