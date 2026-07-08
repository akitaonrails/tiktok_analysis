package X;

import Y.ARunnableS71S0200000_2;
import android.os.Message;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.model.ECInsertContent;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.CommonFeedData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12B2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.model.ECMixFeedAwemeListModel$refreshList$1", f = "ECMixFeedAwemeListModel.kt", l = {98}, m = "invokeSuspend")
public final class C12B2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C12B3 LLILLL;
    public final /* synthetic */ C2189821An6 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12B2(C12B3 c12b3, C2189821An6 c2189821An6, InterfaceC1364105Vn<? super C12B2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c12b3;
        this.LLILZ = c2189821An6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C12B2 c12b2 = new C12B2(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c12b2.LLILLJJLI = obj;
        return c12b2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ECInsertContent eCInsertContent;
        Integer num;
        boolean z;
        C12B9 c12b9;
        C12B8 c12b8;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("ECMixFeedAwemeListModel@943d.refreshList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJLIIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, C0PEM.LIZJ, null, new C1399405do(this.LLILZ, null), 2);
            this.LL = 1;
            objLJLIIIL = c099gLIZIZ.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("ECMixFeedAwemeListModel@943d.refreshList$1");
                return objLJFF;
            }
        }
        Aweme aweme = (Aweme) objLJLIIIL;
        if (aweme != null) {
            C12B3 c12b3 = this.LLILLL;
            C2189821An6 c2189821An6 = this.LLILZ;
            C1735810vGt.LIZ.getClass();
            C1735810vGt.LIZ(aweme);
            c12b3.getClass();
            C12B3.LJIIJJI(aweme, c2189821An6, true);
            if (AwemeSaaSExtKt.isLive(aweme)) {
                z = true;
            } else {
                z = false;
            }
            List<C12B4> list = c12b3.LLILZ;
            if (z) {
                c12b9 = null;
                c12b8 = new C12B8(aweme);
            } else {
                i2 = 3;
                c12b9 = new C12B9(aweme);
                c12b8 = null;
            }
            Boolean.valueOf(((ArrayList) list).add(new C12B4(true, null, null, C2286608xc.LJ(i2), c12b8, c12b9, null, null, 910)));
        }
        if (!((ArrayList) this.LLILLL.LLILZ).isEmpty()) {
            Message messageObtainMessage = this.LLILLL.mHandler.obtainMessage(0);
            messageObtainMessage.obj = new CommonFeedData(null, true, C2286608xc.LJ(1), null, null);
            C12B3 c12b32 = this.LLILLL;
            Boolean.valueOf(C786410Ut5.LJJZZIII(c12b32.LLILLL, new ARunnableS71S0200000_2(c12b32, messageObtainMessage, 13)));
        } else {
            C12B3 c12b33 = this.LLILLL;
            C2189821An6 c2189821An62 = this.LLILZ;
            C12B7 c12b7 = c12b33.LL;
            if (c12b7 != null) {
                eCInsertContent = c12b7.LIZIZ;
                ECInsertContent eCInsertContent2 = c12b7.LIZIZ;
                if (eCInsertContent2 != null) {
                    num = eCInsertContent2.startCursor;
                }
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C12B1(num, c12b33, c2189821An62, eCInsertContent, null), 3);
            } else {
                eCInsertContent = null;
            }
            num = null;
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C12B1(num, c12b33, c2189821An62, eCInsertContent, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMixFeedAwemeListModel@943d.refreshList$1");
        return unit;
    }
}
