package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.middlepage.historytag.utils.HistoryTagProcessor$setHistoryTag$1", f = "HistoryTagProcessor.kt", l = {}, m = "invokeSuspend")
public final class C644320PPa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ SearchMixFeedList LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C644320PPa(LifecycleOwner lifecycleOwner, SearchMixFeedList searchMixFeedList, InterfaceC1364105Vn<? super C644320PPa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = searchMixFeedList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C644320PPa(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(13:4|(1:6)|7|(4:9|(1:13)|14|(1:18))|19|(1:21)|22|(2:27|(2:32|(1:37)))|26|45|40|43|44)(1:38)|39|7|(0)|19|(0)|22|(3:24|27|(3:29|32|(2:34|37)(0))(0))(0)|26|45|40|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        X.C1AF0.LJFF(r1, "historyTag");
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "HistoryTagProcessor@77d.setHistoryTag$1"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r9)
            androidx.lifecycle.LifecycleOwner r0 = r8.LL
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r0 = X.C0Q3E.LJ(r0)
            X.0PCY r0 = r0.Ph1()
            X.0sD9 r0 = r0.LIZJ()
            X.0PRC r0 = (X.C0PRC) r0
            java.lang.String r4 = r0.LLIZLLLIL
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList r0 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig r0 = r0.globalDoodleConfig
            r6 = 0
            if (r0 == 0) goto L8a
            com.ss.android.ugc.aweme.discover.model.HistoryIntentInfo r2 = r0.getHistoryIntentInfo()
            if (r2 == 0) goto L8b
            java.lang.Integer r5 = r2.historyIntentType
        L2c:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r2 == 0) goto L4d
            com.ss.android.ugc.aweme.discover.model.UserIntentExtra r0 = r2.userIntentExtra
            if (r0 == 0) goto L40
            java.lang.String r1 = r0.sugUserId
            if (r1 == 0) goto L40
            java.lang.String r0 = "sug_user_id"
            r3.put(r0, r1)
        L40:
            com.ss.android.ugc.aweme.discover.model.EcomIntentExtra r0 = r2.ecomIntentExtra
            if (r0 == 0) goto L4d
            java.lang.String r1 = r0.searchPenetrateInfo
            if (r1 == 0) goto L4d
            java.lang.String r0 = "search_penetrate_info"
            r3.put(r0, r1)
        L4d:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L56
            r3 = r6
        L56:
            X.0PPb r2 = X.EnumC644330PPb.USER
            int r1 = r2.getValue()
            if (r5 == 0) goto L69
            int r0 = r5.intValue()
            if (r0 != r1) goto L69
        L64:
            X.0QF6 r1 = X.C0QPJ.LJIJI(r6)
            goto L8d
        L69:
            X.0PPb r2 = X.EnumC644330PPb.POI
            int r1 = r2.getValue()
            if (r5 == 0) goto L78
            int r0 = r5.intValue()
            if (r0 != r1) goto L78
            goto L64
        L78:
            X.0PPb r2 = X.EnumC644330PPb.ECOM
            int r1 = r2.getValue()
            if (r5 == 0) goto L87
            int r0 = r5.intValue()
            if (r0 != r1) goto L87
            goto L64
        L87:
            X.0PPb r2 = X.EnumC644330PPb.NONE
            goto L64
        L8a:
            r2 = r6
        L8b:
            r5 = r6
            goto L2c
        L8d:
            X.0PPc r0 = new X.0PPc     // Catch: java.util.ConcurrentModificationException -> L96
            r0.<init>(r4, r2, r3)     // Catch: java.util.ConcurrentModificationException -> L96
            r1.LIZLLL(r0)     // Catch: java.util.ConcurrentModificationException -> L96
            goto L9f
        L96:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "historyTag"
            X.C1AF0.LJFF(r1, r0)
        L9f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C644320PPa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
