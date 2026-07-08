package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.BoardSceneryFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817520xOg extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ BoardSceneryFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817520xOg(BoardSceneryFragment boardSceneryFragment) {
        super(1);
        this.LL = boardSceneryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        C062P<InterfaceC111300bX> c062p2 = c062p;
        BoardSceneryFragment boardSceneryFragment = this.LL;
        c062p2.LIZ = new C1815530xLT(boardSceneryFragment.LL, boardSceneryFragment.LLILLJJLI, boardSceneryFragment.LLILLL);
        c062p2.LIZIZ = "BoardSceneryHierarchyData";
        return Unit.LIZ;
    }
}
