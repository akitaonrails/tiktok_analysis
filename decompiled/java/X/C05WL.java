package X;

import Y.AfS171S0100000_2;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedRequest;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05WL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.video.vo.ECAwemeListModel$refreshList$2$firstBatchJobDeferred$1", f = "ECAwemeListModel.kt", l = {458}, m = "invokeSuspend")
public final class C05WL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CommonFeedModel>, Object> {
    public int LL;
    public final /* synthetic */ C1525405y8 LLILLJJLI;
    public final /* synthetic */ C2189821An6 LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05WL(C1525405y8 c1525405y8, C2189821An6 c2189821An6, long j, String str, InterfaceC1364105Vn<? super C05WL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1525405y8;
        this.LLILLL = c2189821An6;
        this.LLILZ = j;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05WL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIJ = obj;
        C1C7U.LIZ("ECAwemeListModel@117f.refreshList$2$firstBatchJobDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            C1365405Wa c1365405Wa = InterfaceC1365505Wb.LIZ;
            CommonFeedRequest commonFeedRequest = new CommonFeedRequest(this.LLILLJJLI.LJIIL(this.LLILLL), 2, 6, 1, null, this.LLILZ, Collections.singletonList(C2286608xc.LJFF(this.LLILLJJLI.LL)), C13LP.LLIIII(this.LLILLJJLI.LLILLL), this.LLILZIL, 16, null);
            c1365405Wa.getClass();
            C11NZ c11nzLIZ = C1365405Wa.LIZ(commonFeedRequest);
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            c2252611DEt.LJJII(new AwS581S0100000_2(c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS171S0100000_2(c2252611DEt, 44), new AfS171S0100000_2(c2252611DEt, 45)), 508));
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("ECAwemeListModel@117f.refreshList$2$firstBatchJobDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ECAwemeListModel@117f.refreshList$2$firstBatchJobDeferred$1");
        return objLJIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CommonFeedModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
