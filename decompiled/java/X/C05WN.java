package X;

import Y.ARunnableS71S0200000_2;
import Y.AfS171S0100000_2;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedRequest;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.05WN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.video.vo.ECAwemeListModel$loadMoreList$2", f = "ECAwemeListModel.kt", l = {460}, m = "invokeSuspend")
public final class C05WN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1525405y8 LLILZ;
    public final /* synthetic */ C2189821An6 LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05WN(C1525405y8 c1525405y8, C2189821An6 c2189821An6, int i, long j, InterfaceC1364105Vn<? super C05WN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1525405y8;
        this.LLILZIL = c2189821An6;
        this.LLILZLL = i;
        this.LLIZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05WN(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        String str;
        C259800zU c259800zU2;
        AnchorCustomData anchorCustomData;
        T t;
        Object obj2 = obj;
        C1C7U.LIZ("ECAwemeListModel@117f.loadMoreList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        String str2 = null;
        boolean z = true;
        try {
            if (i != 0) {
                if (i == 1) {
                    c259800zU2 = this.LLILLJJLI;
                    c259800zU = this.LL;
                    C155000ia.LIZIZ(obj2);
                    t = obj2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj2);
                c259800zU = new C259800zU();
                C1525405y8 c1525405y8 = this.LLILZ;
                C2189821An6 c2189821An6 = this.LLILZIL;
                int i2 = this.LLILZLL;
                long j = this.LLIZ;
                C1365405Wa c1365405Wa = InterfaceC1365505Wb.LIZ;
                String strLJIIL = c1525405y8.LJIIL(c2189821An6);
                String str3 = c1525405y8.LLILZIL;
                List listSingletonList = Collections.singletonList(C2286608xc.LJFF(c1525405y8.LL));
                List listLLIIII = C13LP.LLIIII(c1525405y8.LLILLL);
                if (c2189821An6 != null && (anchorCustomData = c2189821An6.getAnchorCustomData()) != null) {
                    str = anchorCustomData.pageName;
                } else {
                    str = null;
                }
                CommonFeedRequest commonFeedRequest = new CommonFeedRequest(strLJIIL, 2, 6, i2, str3, j, listSingletonList, listLLIIII, str);
                c1365405Wa.getClass();
                C11NZ c11nzLIZ = C1365405Wa.LIZ(commonFeedRequest);
                this.LL = c259800zU;
                this.LLILLJJLI = c259800zU;
                this.LLILLL = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                c2252611DEt.LJJII(new AwS581S0100000_2(c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS171S0100000_2(c2252611DEt, 42), new AfS171S0100000_2(c2252611DEt, 43)), 507));
                Object objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("ECAwemeListModel@117f.loadMoreList$2");
                    return objLJFF;
                }
                c259800zU2 = c259800zU;
                t = objLJIJ;
            }
            c259800zU2.element = t;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        String str4 = this.LLILZ.LLILZIL;
        if (str4 != null && !a0.LJJJIL(str4)) {
            z = false;
        }
        if (z) {
            C1525405y8 c1525405y82 = this.LLILZ;
            CommonFeedModel commonFeedModel = (CommonFeedModel) c259800zU.element;
            if (commonFeedModel != null) {
                str2 = commonFeedModel.sessionId;
            }
            c1525405y82.LLILZIL = str2;
        }
        CommonFeedModel commonFeedModel2 = (CommonFeedModel) c259800zU.element;
        if (commonFeedModel2 != null) {
            this.LLILZ.LJIIJ(commonFeedModel2, this.LLILZIL);
        }
        Message messageObtainMessage = this.LLILZ.mHandler.obtainMessage(0);
        Object obj3 = c259800zU.element;
        if (obj3 == null) {
            obj3 = this.LLILZ.mData;
        }
        messageObtainMessage.obj = obj3;
        C1525405y8 c1525405y83 = this.LLILZ;
        C786410Ut5.LJJZZIII(c1525405y83.LLILZLL, new ARunnableS71S0200000_2(c1525405y83, messageObtainMessage, 16));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECAwemeListModel@117f.loadMoreList$2");
        return unit;
    }
}
