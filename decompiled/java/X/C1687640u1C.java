package X;

import com.ss.android.ugc.aweme.relation.ffp.nearby.vm.ConnectNowMatchVM;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u1C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1687640u1C extends C2217421BqW implements Function1<AbstractC1152880g6g, Unit> {
    public C1687640u1C(Object obj) {
        super(1, obj, ConnectNowMatchVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/relation/ffp/nearby/vm/MatchedUserStateEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1152880g6g abstractC1152880g6g) {
        AbstractC1152880g6g abstractC1152880g6g2 = abstractC1152880g6g;
        ConnectNowMatchVM connectNowMatchVM = (ConnectNowMatchVM) this.receiver;
        connectNowMatchVM.getClass();
        if (abstractC1152880g6g2 instanceof C1152870g6f) {
            String str = ((C1152870g6f) abstractC1152880g6g2).LIZ;
            List<C1687730u1L> list = connectNowMatchVM.getState().LL;
            ArrayList arrayList = new ArrayList();
            for (C1687730u1L c1687730u1L : list) {
                if (!Intrinsics.LJFF(c1687730u1L.LIZ.getUid(), str)) {
                    arrayList.add(c1687730u1L);
                }
            }
            List<C1687730u1L> list2 = connectNowMatchVM.getState().LLILLJJLI;
            ArrayList arrayList2 = new ArrayList();
            for (C1687730u1L c1687730u1L2 : list2) {
                if (!Intrinsics.LJFF(c1687730u1L2.LIZ.getUid(), str)) {
                    arrayList2.add(c1687730u1L2);
                }
            }
            if (str != null) {
                ((ConcurrentHashMap) connectNowMatchVM.LLILZ).put(str, Boolean.TRUE);
                C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("add ");
                sbLIZ.append(str);
                sbLIZ.append(" to blocked set, current set: ");
                sbLIZ.append(connectNowMatchVM.LLILZ);
                sbLIZ.append(", ");
                sbLIZ.append(System.identityHashCode(connectNowMatchVM.LLILZ));
                c1910890zpHLIZ.LIZ("ConnectNowMatchVM", C2188811AlT.LIZIZ(sbLIZ));
            }
            C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZ("ConnectNowMatchVM", "new list after block " + arrayList + ", new follower list " + arrayList2);
            connectNowMatchVM.setState(new AwS391S0200000_25(arrayList, arrayList2, 362));
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
