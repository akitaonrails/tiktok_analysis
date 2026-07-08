package X;

/* JADX INFO: renamed from: X.03jY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C925403jY extends AbstractC925503jZ {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if ((r2 instanceof com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r2 = (com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r0 = r2.getView();
     */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r7, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r8, X.EnumC1063300dmC r9) {
        /*
            r6 = this;
            X.03fx r0 = X.C903103fx.LIZ
            r0.getClass()
            X.0vTg r3 = X.C903103fx.LIZLLL()
            r2 = 4
            r1 = 0
            r4 = 0
            if (r3 != 0) goto L14
            java.lang.String r0 = "can't find osp activity"
            X.C2382909Vj.LIZ(r8, r1, r0, r4, r2)
            return
        L14:
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity
            if (r0 == 0) goto L22
            r0 = r3
            com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r5 = r0.LLLZ()
        L1f:
            if (r5 == 0) goto L83
            goto L2e
        L22:
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity
            if (r0 == 0) goto L83
            r0 = r3
            com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r5 = r0.LLLZ()
            goto L1f
        L2e:
            androidx.fragment.app.FragmentManager r0 = r3.getSupportFragmentManager()     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L7e
            java.util.List r0 = r0.LJJLIIIJL()     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L7e
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L7e
        L3a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L7e
            if (r0 == 0) goto L5f
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L7e
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L7e
            java.lang.String r1 = r2.getTag()     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L7e
            java.lang.String r0 = "order_submit_fragment"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L7e
            if (r0 == 0) goto L3a
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L7e
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment r2 = (com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment) r2     // Catch: java.lang.Throwable -> L5b java.util.concurrent.CancellationException -> L7e
            if (r2 == 0) goto L5f
            goto L61
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5f:
            r0 = r4
            goto L65
        L61:
            android.view.View r0 = r2.getView()
        L65:
            r5.wQ2(r0)
            java.lang.Class<X.03jb> r1 = X.InterfaceC925703jb.class
            X.0OvC r0 = r6.IBridgeSdkContext
            if (r0 == 0) goto L72
            java.lang.String r4 = r0.getContainerID()
        L72:
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.C1909107dp.LIZJ(r1, r4)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r1 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r1
            java.lang.String r0 = "Success"
            r8.onSuccess(r1, r0)
            return
        L7e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L83:
            java.lang.String r0 = "can't find osp view model"
            X.C2382909Vj.LIZ(r8, r1, r0, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C925403jY.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
