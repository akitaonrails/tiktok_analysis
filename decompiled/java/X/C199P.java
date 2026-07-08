package X;

import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.199P, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C199P extends C09AY implements Function0<InterfaceC214902198i> {
    public final /* synthetic */ SAFFragmentRootScene LL;
    public final /* synthetic */ InterfaceC214902198i LLILLJJLI;
    public final /* synthetic */ Class<? extends InterfaceC214902198i> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199P(SAFFragmentRootScene sAFFragmentRootScene, InterfaceC214902198i interfaceC214902198i, Class<? extends InterfaceC214902198i> cls) {
        super(0);
        this.LL = sAFFragmentRootScene;
        this.LLILLJJLI = interfaceC214902198i;
        this.LLILLL = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC214902198i invoke() {
        this.LL.LLJJI = new C199Q(this.LLILLL);
        return this.LLILLJJLI;
    }
}
