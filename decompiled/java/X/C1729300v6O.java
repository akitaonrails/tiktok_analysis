package X;

import android.content.Context;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BaseTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS57S0100100_26;
import kotlin.jvm.internal.AwS73S0100100_26;

/* JADX INFO: renamed from: X.0v6O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729300v6O {
    public final C1728950v5p LIZ = new C1728950v5p();
    public final C1728230v4f LIZIZ = new C1728230v4f();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardActivityInfo> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C1729320v6Q
            if (r0 == 0) goto L21
            r10 = r14
            X.0v6Q r10 = (X.C1729320v6Q) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r2 = r10.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r4 = 0
            r9 = 1
            if (r0 == 0) goto L2f
            if (r0 != r9) goto L27
            goto L46
        L21:
            X.0v6Q r10 = new X.0v6Q
            r10.<init>(r11, r14)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r2)
            X.0v4f r0 = r11.LIZIZ     // Catch: java.lang.Throwable -> L4c
            X.0v4e r0 = r0.LLILLJJLI     // Catch: java.lang.Throwable -> L4c
            r10.LLILLL = r9     // Catch: java.lang.Throwable -> L4c
            r8 = 0
            X.0v4f r0 = r0.LL     // Catch: java.lang.Throwable -> L4c
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.repo.BillboardNetApi r5 = r0.LL     // Catch: java.lang.Throwable -> L4c
            r7 = r13
            r6 = r12
            java.lang.Object r2 = r5.getBillboardTemplates(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4c
            if (r2 != r1) goto L49
            return r1
        L46:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L4c
        L49:
            X.0X52 r2 = (X.C0X52) r2     // Catch: java.lang.Throwable -> L4c
            goto L51
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2 = r4
        L51:
            if (r2 == 0) goto L89
            T r0 = r2.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L89
            T r0 = r0.data
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateListData r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateListData) r0
            if (r0 == 0) goto L89
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RespTemplateItem> r0 = r0.templateList
            if (r0 == 0) goto L89
            java.util.Iterator r3 = r0.iterator()
        L67:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RespTemplateItem r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RespTemplateItem) r0
            java.lang.Integer r0 = r0.type
            if (r0 == 0) goto L8a
            int r1 = r0.intValue()
            r0 = 8
            if (r1 != r0) goto L8a
            r0 = 1
        L81:
            if (r0 == 0) goto L67
        L83:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RespTemplateItem r2 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RespTemplateItem) r2
            if (r2 == 0) goto L89
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardActivityInfo r4 = r2.activityInfo
        L89:
            return r4
        L8a:
            r0 = 0
            goto L81
        L8c:
            r2 = r4
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1729300v6O.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C1729110v65 r20, java.lang.String r21, java.lang.String r22, android.content.Context r23, X.InterfaceC1364105Vn<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1729300v6O.LIZIZ(X.0v65, java.lang.String, java.lang.String, android.content.Context, X.05Vn):java.lang.Object");
    }

    public static Object LIZJ(BaseTemplateItem baseTemplateItem, List list, Context context, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BaseTemplateItem baseTemplateItem2 = (BaseTemplateItem) it2.next();
            if (baseTemplateItem2.type == baseTemplateItem.type) {
                arrayList.add(baseTemplateItem);
            } else {
                arrayList.add(baseTemplateItem2);
            }
        }
        RootData rootData = new RootData(str, str2, false, 24);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1730290v7z.LIZ.getClass();
        String strLJIIIZ = C1730290v7z.LJIIIZ();
        if (strLJIIIZ == null) {
            strLJIIIZ = "";
        }
        C1728460v52.LIZJ(rootData, "", strLJIIIZ, "template_msg_update", "display_total");
        Object objLIZLLL = new C1730010v7X().LIZLLL(context, baseTemplateItem, arrayList, new RootData(str, str2, false, 24), false, "", new AwS73S0100100_26(rootData, jCurrentTimeMillis, 1), new AwS57S0100100_26(rootData, jCurrentTimeMillis, 5), interfaceC1364105Vn);
        if (objLIZLLL != C099R.LJFF()) {
            objLIZLLL = Unit.LIZ;
        }
        if (objLIZLLL == C099R.LJFF()) {
            return objLIZLLL;
        }
        return Unit.LIZ;
    }
}
