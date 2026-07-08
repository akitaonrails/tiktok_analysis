package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.tako.otherpage.feed.button.TakoBottomButtonProvider;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707730RpT extends C09AY implements Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<? super VideoItemParams, ? super Map<String, ? extends Object>, ? super InterfaceC1364105Vn<? super AbstractC1387105bp>, ? extends Object>> {
    public final /* synthetic */ TakoBottomButtonProvider LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C707730RpT(TakoBottomButtonProvider takoBottomButtonProvider) {
        super(1);
        this.LL = takoBottomButtonProvider;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:29)(7:10|(0)(5:18|(6:21|(1:25)|26|(3:45|28|48)(1:47)|46|19)|44|31|(0)(1:35))|36|42|37|40|41)|30|36|42|37|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C1AF0.LIZIZ();
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1631620sYq<? super com.ss.android.ugc.aweme.feed.model.VideoItemParams, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, ? super X.InterfaceC1364105Vn<? super X.AbstractC1387105bp>, ? extends java.lang.Object> invoke(java.lang.ref.WeakReference<X.C704830Rkn> r8) {
        /*
            r7 = this;
            java.lang.ref.Reference r8 = (java.lang.ref.Reference) r8
            r3 = 0
            if (r8 == 0) goto L59
            java.lang.Object r0 = r8.get()
            X.0Rkn r0 = (X.C704830Rkn) r0
            if (r0 == 0) goto L59
            kotlin.jvm.functions.Function0<com.ss.android.ugc.aweme.feed.model.VideoItemParams> r0 = r0.LIZLLL
            if (r0 == 0) goto L59
            java.lang.Object r0 = r0.invoke()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L59
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.getAweme()
            if (r4 == 0) goto L5a
            com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo r0 = r4.getStandardComponentInfo()
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.feed.model.banner.StandardButtonContainerStruct r0 = r0.buttonContainer
            if (r0 == 0) goto L5a
            java.util.List<com.ss.android.ugc.aweme.feed.model.banner.StandardComponentStruct> r0 = r0.buttons
            if (r0 == 0) goto L5a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r0.iterator()
        L36:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r2 = r5.next()
            r0 = r2
            com.ss.android.ugc.aweme.feed.model.banner.StandardComponentStruct r0 = (com.ss.android.ugc.aweme.feed.model.banner.StandardComponentStruct) r0
            com.ss.android.ugc.aweme.feed.model.banner.StandardComponentKey r0 = r0.key
            if (r0 == 0) goto L4b
            java.lang.String r1 = r0.componentKey
            if (r1 != 0) goto L4d
        L4b:
            java.lang.String r1 = ""
        L4d:
            java.lang.String r0 = "bottom_button_tako_prompt"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L36
            r6.add(r2)
            goto L36
        L59:
            r4 = r3
        L5a:
            r2 = r3
            goto L6e
        L5c:
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L5a
            java.lang.Object r0 = X.C13LP.LJJJLL(r6)
            com.ss.android.ugc.aweme.feed.model.banner.StandardComponentStruct r0 = (com.ss.android.ugc.aweme.feed.model.banner.StandardComponentStruct) r0
            if (r0 == 0) goto L5a
            java.lang.String r2 = r0.customizedInfo
        L6e:
            com.ss.android.ugc.aweme.tako.otherpage.feed.button.TakoBottomButtonProvider r0 = r7.LL
            r0.getClass()
            com.google.gson.Gson r1 = X.C597040NbK.LIZ()     // Catch: java.lang.Exception -> L81
            java.lang.Class<com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAICustomInfo> r0 = com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAICustomInfo.class
            java.lang.Object r0 = r1.LJII(r2, r0)     // Catch: java.lang.Exception -> L81
            com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAICustomInfo r0 = (com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAICustomInfo) r0     // Catch: java.lang.Exception -> L81
            r3 = r0
            goto L88
        L81:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LIZIZ()
        L88:
            X.14St r0 = new X.14St
            r0.<init>(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C707730RpT.invoke(java.lang.Object):java.lang.Object");
    }
}
