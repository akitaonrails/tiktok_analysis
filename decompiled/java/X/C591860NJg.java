package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0NJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.tab.v2.DramaPicksRepo$getRefreshData$res$1", f = "DramaPicksRepo.kt", l = {236}, m = "invokeSuspend")
public final class C591860NJg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SeriesFeedResp>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<Aweme> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C591860NJg(String str, boolean z, String str2, List<? extends Aweme> list, boolean z2, InterfaceC1364105Vn<? super C591860NJg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = str2;
        this.LLILZIL = list;
        this.LLILZLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591860NJg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        ArrayList arrayList;
        Object objLIZ = obj;
        C1C7U.LIZ("DramaPicksRepo@bee8.getRefreshData$res$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C1574280r4M.LIZ.getClass();
            SeriesFeedRepository seriesFeedRepository = (SeriesFeedRepository) C1574280r4M.LIZIZ.getValue();
            if (Intrinsics.LJFF(this.LLILLJJLI, "init_fetch")) {
                z = this.LLILLL;
            } else {
                z = false;
            }
            ArrayList arrayList2 = null;
            if (Intrinsics.LJFF(this.LLILLJJLI, "init_fetch")) {
                str = this.LLILZ;
            } else {
                str = null;
            }
            String str2 = this.LLILLJJLI;
            List<Aweme> list = this.LLILZIL;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<Aweme> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getAid());
                }
            } else {
                arrayList = null;
            }
            List<Aweme> list2 = this.LLILZIL;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Aweme aweme : list2) {
                    if (aweme.isAd()) {
                        arrayList3.add(aweme);
                    }
                }
                arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((Aweme) it3.next()).getAid());
                }
            }
            boolean z2 = this.LLILZLL;
            this.LL = 1;
            objLIZ = seriesFeedRepository.LIZ(1, true, z, str, str2, null, null, arrayList, arrayList2, true, 0, z2, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("DramaPicksRepo@bee8.getRefreshData$res$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DramaPicksRepo@bee8.getRefreshData$res$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SeriesFeedResp> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
