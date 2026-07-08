package X;

import Y.ARunnableS71S0200000_2;
import Y.AfS171S0100000_2;
import android.os.Message;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedRequest;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05WM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.video.vo.ECAwemeListModel$refreshList$3", f = "ECAwemeListModel.kt", l = {458, 474}, m = "invokeSuspend")
public final class C05WM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1525405y8 LLILLJJLI;
    public final /* synthetic */ C2189821An6 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05WM(C1525405y8 c1525405y8, C2189821An6 c2189821An6, int i, long j, String str, InterfaceC1364105Vn<? super C05WM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1525405y8;
        this.LLILLL = c2189821An6;
        this.LLILZ = i;
        this.LLILZIL = j;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05WM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CommonFeedModel commonFeedModel;
        String str;
        Object objLJIJ = obj;
        C1C7U.LIZ("ECAwemeListModel@117f.refreshList$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJIJ);
                    commonFeedModel = (CommonFeedModel) objLJIJ;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJIJ);
                commonFeedModel = (CommonFeedModel) objLJIJ;
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            if (((ArrayList) this.LLILLJJLI.LLILZ).size() < 2) {
                C1365405Wa c1365405Wa = InterfaceC1365505Wb.LIZ;
                CommonFeedRequest commonFeedRequest = new CommonFeedRequest(this.LLILLJJLI.LJIIL(this.LLILLL), 0, 6, this.LLILZ, null, this.LLILZIL, Collections.singletonList(C2286608xc.LJFF(this.LLILLJJLI.LL)), C13LP.LLIIII(this.LLILLJJLI.LLILLL), this.LLILZLL, 16, null);
                c1365405Wa.getClass();
                C11NZ c11nzLIZ = C1365405Wa.LIZ(commonFeedRequest);
                this.LL = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                c2252611DEt.LJJII(new AwS581S0100000_2(c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS171S0100000_2(c2252611DEt, 46), new AfS171S0100000_2(c2252611DEt, 47)), 509));
                objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("ECAwemeListModel@117f.refreshList$3");
                    return objLJFF;
                }
                commonFeedModel = (CommonFeedModel) objLJIJ;
            } else {
                C1365405Wa c1365405Wa2 = InterfaceC1365505Wb.LIZ;
                CommonFeedRequest commonFeedRequest2 = new CommonFeedRequest(this.LLILLJJLI.LJIIL(this.LLILLL), 1, 6, this.LLILZ, null, this.LLILZIL, Collections.singletonList(C2286608xc.LJFF(this.LLILLJJLI.LL)), C13LP.LLIIII(this.LLILLJJLI.LLILLL), this.LLILZLL, 16, null);
                c1365405Wa2.getClass();
                C11NZ c11nzLIZ2 = C1365405Wa.LIZ(commonFeedRequest2);
                this.LL = 2;
                C2252611DEt c2252611DEt2 = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt2.LJIJJ();
                c2252611DEt2.LJJII(new AwS581S0100000_2(c11nzLIZ2.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS171S0100000_2(c2252611DEt2, 48), new AfS171S0100000_2(c2252611DEt2, 49)), 510));
                objLJIJ = c2252611DEt2.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("ECAwemeListModel@117f.refreshList$3");
                    return objLJFF;
                }
                commonFeedModel = (CommonFeedModel) objLJIJ;
            }
        }
        C1525405y8 c1525405y8 = this.LLILLJJLI;
        if (commonFeedModel != null) {
            str = commonFeedModel.sessionId;
        } else {
            str = null;
        }
        c1525405y8.LLILZIL = str;
        if (commonFeedModel != null) {
            c1525405y8.LJIIJ(commonFeedModel, this.LLILLL);
            Message messageObtainMessage = this.LLILLJJLI.mHandler.obtainMessage(0);
            messageObtainMessage.obj = commonFeedModel;
            C1525405y8 c1525405y82 = this.LLILLJJLI;
            C786410Ut5.LJJZZIII(c1525405y82.LLILZLL, new ARunnableS71S0200000_2(c1525405y82, messageObtainMessage, 18));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECAwemeListModel@117f.refreshList$3");
        return unit;
    }
}
