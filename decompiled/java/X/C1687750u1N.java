package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.relation.model.MutualRelationListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0u1N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.network.ConnectNowMatchAPI$getMatchedUsers$2", f = "ConnectNowMatchAPI.kt", l = {56}, m = "invokeSuspend")
public final class C1687750u1N extends C09AX implements Function1<InterfaceC1364105Vn<? super MutualRelationListResponse>, Object> {
    public int LL;
    public final /* synthetic */ List<C1687730u1L> LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687750u1N(long j, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1687750u1N(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super MutualRelationListResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ = obj;
        C1C7U.LIZ("ConnectNowMatchAPI@8ee2.getMatchedUsers$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            C1243980iTc c1243980iTc = C1243980iTc.LIZIZ;
            List<C1687730u1L> list = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1687730u1L> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ.getSecUid());
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", "", "", 0, null, null, 56);
            List<C1687730u1L> list2 = this.LLILLJJLI;
            long j = this.LLILLL;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (C1687730u1L c1687730u1L : list2) {
                long jLIZ = ((((long) C0BUN.LIZ()) + c1687730u1L.LJ) - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[request] fetchLatestMatches - secUid ");
                sbLIZ.append(c1687730u1L.LIZ.getSecUid());
                sbLIZ.append(", ");
                sbLIZ.append(jLIZ);
                c1910890zpHLIZ.LIZ("ConnectNowMatchVM", C2188811AlT.LIZIZ(sbLIZ));
                arrayList2.add(C2286608xc.LJFF(Math.max(jLIZ, 0L)));
            }
            String strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
            List<C1687730u1L> list3 = this.LLILLJJLI;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator<C1687730u1L> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(C2286608xc.LJ(it3.next().LIZIZ.getValue()));
            }
            String strLJJLIIIJ3 = C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62);
            List<C1687730u1L> list4 = this.LLILLJJLI;
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
            Iterator<C1687730u1L> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(C2286608xc.LJ(it4.next().LIZJ.getValue()));
            }
            String strLJJLIIIJ4 = C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62);
            List<C1687730u1L> list5 = this.LLILLJJLI;
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list5, 10));
            Iterator<C1687730u1L> it5 = list5.iterator();
            while (it5.hasNext()) {
                arrayList5.add(C2286608xc.LJ(it5.next().LIZLLL.getValue()));
            }
            AbstractC19484711Kz<MutualRelationListResponse> abstractC19484711KzLIZ = c1243980iTc.LIZ(3, "", strLJJLIIIJ, null, null, strLJJLIIIJ2, strLJJLIIIJ3, strLJJLIIIJ4, C13LP.LJJLIIIJ(arrayList5, ",", null, null, 0, null, null, 62));
            this.LL = 1;
            objLIZIZ = C11UD.LIZIZ(abstractC19484711KzLIZ, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("ConnectNowMatchAPI@8ee2.getMatchedUsers$2");
                return objLJFF;
            }
        }
        MutualRelationListResponse mutualRelationListResponse = (MutualRelationListResponse) objLIZIZ;
        if (mutualRelationListResponse != null) {
            mutualRelationListResponse.checkValid();
        } else {
            mutualRelationListResponse = null;
        }
        C1C7U.LIZIZ("ConnectNowMatchAPI@8ee2.getMatchedUsers$2");
        return mutualRelationListResponse;
    }
}
