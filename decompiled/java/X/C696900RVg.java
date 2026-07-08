package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C696900RVg extends C09AY implements Function1<C696930RVj<Object>, C696930RVj<Object>> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC696950RVl LLILLJJLI;
    public final /* synthetic */ Function0<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C696900RVg(BaseCellContentComponent baseCellContentComponent, C696960RVm c696960RVm, Function0 function0) {
        super(1);
        this.LL = baseCellContentComponent;
        this.LLILLJJLI = c696960RVm;
        this.LLILLL = function0;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0SxQ, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final C696930RVj<Object> invoke(C696930RVj<Object> c696930RVj) {
        boolean zBooleanValue;
        Boolean bool;
        C696930RVj<Object> c696930RVj2 = c696930RVj;
        VideoItemParams videoItemParams = null;
        switch (C696890RVf.LIZ[c696930RVj2.LIZ.ordinal()]) {
            case 1:
                C1554960qZC.LIZ(C1558520qew.LJIIL(this.LL), this.LLILLJJLI, InterfaceC696950RVl.class, "fcp_priority_maker_manager_key");
                this.LLILLJJLI.LIZLLL().getClass();
                break;
            case 2:
                Object obj = c696930RVj2.LIZIZ;
                if (obj instanceof VideoItemParams) {
                    videoItemParams = (VideoItemParams) obj;
                }
                this.LLILLJJLI.LIZLLL().LIZLLL(videoItemParams);
                break;
            case 3:
                Object obj2 = c696930RVj2.LIZIZ;
                if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                this.LLILLJJLI.LIZLLL().LJFF(zBooleanValue);
                break;
            case 4:
                this.LLILLJJLI.LIZLLL().LJIIIIZZ();
                break;
            case 5:
                C697180RWi c697180RWiLIZLLL = this.LLILLJJLI.LIZLLL();
                this.LLILLL.invoke();
                c697180RWiLIZLLL.LJII();
                break;
            case 6:
                this.LLILLJJLI.LIZLLL().LJ();
                break;
        }
        return c696930RVj2;
    }
}
