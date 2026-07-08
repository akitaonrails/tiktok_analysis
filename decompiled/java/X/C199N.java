package X;

import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.199N, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C199N extends C09AY implements Function1<SAFFragmentRootScene, Unit> {
    public final /* synthetic */ InterfaceC214902198i LL;
    public final /* synthetic */ Class<? extends InterfaceC214902198i> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199N(InterfaceC214902198i interfaceC214902198i, Class<? extends InterfaceC214902198i> cls) {
        super(1);
        this.LL = interfaceC214902198i;
        this.LLILLJJLI = cls;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SAFFragmentRootScene sAFFragmentRootScene) {
        SAFFragmentRootScene sAFFragmentRootScene2 = sAFFragmentRootScene;
        sAFFragmentRootScene2.LLJJI = new C199P(sAFFragmentRootScene2, this.LL, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
