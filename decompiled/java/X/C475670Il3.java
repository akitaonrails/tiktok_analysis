package X;

import Y.ARunnableS10S0210000_7;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Il3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475670Il3 extends C09AY implements InterfaceC1685420txc<List<? extends C468240IXu>, Boolean, Long, String, Integer, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C475700Il6 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC475680Il4 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475670Il3(long j, C475700Il6 c475700Il6, boolean z, InterfaceC475680Il4 interfaceC475680Il4) {
        super(5);
        this.LL = j;
        this.LLILLJJLI = c475700Il6;
        this.LLILLL = z;
        this.LLILZ = interfaceC475680Il4;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(List<? extends C468240IXu> list, Boolean bool, Long l, String str, Integer num) {
        InterfaceC475680Il4 interfaceC475680Il4;
        List<? extends C468240IXu> list2 = list;
        boolean zBooleanValue = bool.booleanValue();
        l.longValue();
        int iIntValue = num.intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed[heroId=");
        sbLIZ.append(this.LL);
        sbLIZ.append("] data loaded successfully: ");
        sbLIZ.append(list2.size());
        sbLIZ.append(" rooms, hasMore: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", totalSize: ");
        sbLIZ.append(iIntValue);
        C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ));
        C475700Il6 c475700Il6 = this.LLILLJJLI;
        c475700Il6.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Setting hasMore: ");
        sbLIZ2.append(zBooleanValue);
        sbLIZ2.append(" (was: ");
        sbLIZ2.append(c475700Il6.LLILLJJLI);
        sbLIZ2.append(')');
        C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ2));
        c475700Il6.LLILLJJLI = zBooleanValue;
        C475700Il6 c475700Il62 = this.LLILLJJLI;
        boolean z = this.LLILLL;
        c475700Il62.getClass();
        c475700Il62.LLJ = System.currentTimeMillis();
        RecyclerView recyclerView = c475700Il62.LLILZ;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS10S0210000_7(c475700Il62, list2, z, 3));
        }
        this.LLILLJJLI.LLILZIL = null;
        if (this.LLILLL && (interfaceC475680Il4 = this.LLILZ) != null) {
            interfaceC475680Il4.LIZ(list2.size());
        }
        return Unit.LIZ;
    }
}
