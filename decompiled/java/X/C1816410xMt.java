package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.InterceptReason;
import webcast.api.smb.SMBBoardAuditResponse;

/* JADX INFO: renamed from: X.0xMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.chain.DecorationSmbReviewDisclaimerCheckHandler$handleData$2$2$1", f = "DecorationSmbReviewDisclaimerCheckHandler.kt", l = {}, m = "invokeSuspend")
public final class C1816410xMt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C470590Icr<SMBBoardAuditResponse.Data> LL;
    public final /* synthetic */ C1816400xMs LLILLJJLI;
    public final /* synthetic */ C1816270xMf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816410xMt(C470590Icr<SMBBoardAuditResponse.Data> c470590Icr, C1816400xMs c1816400xMs, C1816270xMf c1816270xMf, InterfaceC1364105Vn<? super C1816410xMt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c470590Icr;
        this.LLILLJJLI = c1816400xMs;
        this.LLILLL = c1816270xMf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1816410xMt(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<InterceptReason> list;
        List<InterceptReason> list2;
        C1C7U.LIZ("DecorationSmbReviewDisclaimerCheckHandler@8829.handleData$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SMBBoardAuditResponse.Data data = this.LL.data;
        if (data == null || ((list = data.reasons) != null && list.isEmpty())) {
            this.LLILLJJLI.LIZIZ(this.LLILLL);
        } else {
            SMBBoardAuditResponse.Data data2 = this.LL.data;
            if (data2 != null && (list2 = data2.reasons) != null) {
                C1816400xMs c1816400xMs = this.LLILLJJLI;
                C1816270xMf c1816270xMf = this.LLILLL;
                c1816400xMs.getClass();
                Context context = c1816270xMf.LIZ;
                String str = c1816270xMf.LJ.LIZ;
                StringBuilder sb = new StringBuilder();
                sb.append(C497740JfY.LJIJI(2131851172));
                if (true ^ list2.isEmpty()) {
                    sb.append('\n');
                    sb.append(C13LP.LJJLIIIJ(list2, "\n", null, null, 0, null, new C1816460xMy(), 30));
                }
                String string = sb.toString();
                ArrayList arrayList = new ArrayList();
                Iterator<InterceptReason> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().reasonText);
                }
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJI(C497740JfY.LJIJI(2131851173));
                c1397580mTM.LIZIZ(string);
                C985403tE.LIZ(c1397580mTM, new C1816450xMx(c1816270xMf, c1816400xMs, str, arrayList, list2));
                c1397580mTM.LJII = false;
                c1397580mTM.LIZJ(new C1816380xMq(c1816270xMf));
                c1397580mTM.LJ(new C1816430xMv(c1816400xMs, str, arrayList));
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DecorationSmbReviewDisclaimerCheckHandler@8829.handleData$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
