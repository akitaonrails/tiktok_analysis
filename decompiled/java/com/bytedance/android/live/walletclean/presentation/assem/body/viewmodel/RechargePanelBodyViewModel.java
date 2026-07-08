package com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel;

import X.C099R;
import X.C1005840cHW;
import X.C1005850cHX;
import X.C1005860cHY;
import X.C1005870cHZ;
import X.C1005880cHa;
import X.C15438062q;
import X.C1556220qbE;
import X.C1559260qg8;
import X.C1803830x2b;
import X.C1803880x2g;
import X.C1804620x3s;
import X.C1804830x4D;
import X.C1804910x4L;
import X.C1805170x4l;
import X.C1805210x4p;
import X.C1805470x5F;
import X.C1805530x5L;
import X.C1806160x6M;
import X.C1868007Ti;
import X.C23250099c;
import X.C291001Au;
import X.C500260Jjc;
import X.C723600SZy;
import X.EnumC1803160x1W;
import X.InterfaceC0148002o;
import X.InterfaceC1005900cHc;
import X.InterfaceC1364105Vn;
import X.InterfaceC1804490x3f;
import X.InterfaceC1804890x4J;
import X.InterfaceC1805000x4U;
import X.InterfaceC1805750x5h;
import X.InterfaceC1806790x7N;
import X.InterfaceC1806810x7P;
import X.InterfaceC1868207Tk;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;
import com.bytedance.android.live.walletnew.BaseRechargeViewModel;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tracking.TrackingEventV3Data;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import webcast.api.profit.IapListResult;

/* JADX INFO: loaded from: classes28.dex */
public final class RechargePanelBodyViewModel extends AssemViewModel<C1805470x5F> {
    public final InterfaceC1804490x3f LL;
    public final InterfaceC1005900cHc LLILLJJLI;
    public final InterfaceC1805000x4U LLILLL;
    public final InterfaceC1805750x5h LLILZ;
    public final InterfaceC1804890x4J LLILZIL;
    public final IWalletService LLILZLL;
    public final C1559260qg8 LLIZ = new C1559260qg8(new C723600SZy(this, C1805530x5L.class, "wallet_recharge_panel_body_params"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1805470x5F(new C1556220qbE(0), new C1805210x4p(0), new C291001Au(null), null);
    }

    public final C1805530x5L wQ2() {
        return (C1805530x5L) this.LLIZ.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLJJLI.LJI();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        this.LLILLJJLI.LIZ();
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1005840cHW(this, null), 3);
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1005850cHX(this, null), 3);
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1005860cHY(this, null), 3);
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1005870cHZ(this, null), 3);
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1005880cHa(this, null), 3);
    }

    public final int vQ2() {
        IapListResult.QuickChargeConfig quickChargeConfig;
        IapListResult.ListResultExtra listResultExtra = getState().LLILLJJLI.LJ;
        if (listResultExtra == null || listResultExtra.quickChargeConfig == null) {
            return -1;
        }
        IapListResult.ListResultExtra listResultExtra2 = getState().LLILLJJLI.LJ;
        return (listResultExtra2 == null || (quickChargeConfig = listResultExtra2.quickChargeConfig) == null || !quickChargeConfig.hasValidBizContract) ? 0 : 1;
    }

    public final TrackingEventV3Data xQ2(boolean z) {
        C1803830x2b c1803830x2b;
        InterfaceC1804890x4J interfaceC1804890x4J = this.LLILZIL;
        C1805530x5L c1805530x5LWQ2 = wQ2();
        if (c1805530x5LWQ2 != null) {
            c1803830x2b = c1805530x5LWQ2.LLILLL;
        } else {
            c1803830x2b = null;
        }
        return interfaceC1804890x4J.LIZIZ(c1803830x2b, getState().LLILLJJLI.LIZLLL.getValue(), C500260Jjc.LJJJI(Boolean.valueOf(getState().LLILLJJLI.LJI)), z, getState().LLILLJJLI.LIZ, getState().LLILLJJLI.LIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0260 A[PHI: r6
      0x0260: PHI (r6v18 webcast.api.profit.TemplateButton) = (r6v17 webcast.api.profit.TemplateButton), (r6v21 webcast.api.profit.TemplateButton) binds: [B:125:0x023f, B:132:0x025e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04ab A[EDGE_INSN: B:338:0x04ab->B:267:0x04ab BREAK  A[LOOP:7: B:232:0x0429->B:340:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cb  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zQ2(X.AbstractC1805870x5t r32) {
        /*
            Method dump skipped, instruction units count: 1435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel.zQ2(X.0x5t):void");
    }

    public final Object BQ2(Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        IapListResult.ListResultExtra resultExtra;
        InterfaceC1806810x7P interfaceC1806810x7PLIZJ;
        C1803880x2g c1803880x2g;
        C1805530x5L c1805530x5LWQ2 = wQ2();
        if (c1805530x5LWQ2 == null) {
            return Unit.LIZ;
        }
        if ((th instanceof C1803880x2g) && (c1803880x2g = (C1803880x2g) th) != null) {
            resultExtra = c1803880x2g.getResultExtra();
        } else {
            resultExtra = null;
        }
        C1805210x4p c1805210x4pLIZ = C1805210x4p.LIZ(getState().LLILLJJLI, null, false, false, null, resultExtra, null, false, false, null, false, null, null, null, null, null, false, th, 65519);
        setState(new AwS393S0200000_27(c1805210x4pLIZ, resultExtra, 24));
        this.LLILZIL.LIZ(th, c1805530x5LWQ2.LLILLL, c1805210x4pLIZ.LJIILL, c1805210x4pLIZ.LJIILIIL, c1805530x5LWQ2.LLILZ, vQ2());
        if (c1805210x4pLIZ.LJIILL) {
            C1556220qbE c1556220qbE = getState().LL;
            IapListResult.ListResultExtra listResultExtra = c1805210x4pLIZ.LJ;
            C1803830x2b c1803830x2b = c1805530x5LWQ2.LLILLL;
            InterfaceC1805750x5h interfaceC1805750x5h = this.LLILZ;
            List<InterfaceC1806790x7N> list = c1556220qbE.LIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (InterfaceC1806790x7N interfaceC1806790x7N : list) {
                if ((interfaceC1806790x7N instanceof InterfaceC1806810x7P) && (interfaceC1806810x7PLIZJ = interfaceC1805750x5h.LIZJ(th, listResultExtra, c1803830x2b)) != null) {
                    interfaceC1806790x7N = interfaceC1806810x7PLIZJ;
                }
                arrayList.add(interfaceC1806790x7N);
            }
            setState(new AwS606S0100000_27(arrayList, (List<TakoActiveBotItem>) 59));
            return Unit.LIZ;
        }
        Object objEQ2 = EQ2(c1805210x4pLIZ, th, null, interfaceC1364105Vn);
        if (objEQ2 == C099R.LJFF()) {
            return objEQ2;
        }
        return Unit.LIZ;
    }

    public final void DQ2(InterfaceC1868207Tk interfaceC1868207Tk, boolean z) {
        if (z) {
            setStateImmediate(new AwS606S0100000_27(interfaceC1868207Tk, 60));
        } else {
            setState(new AwS606S0100000_27(interfaceC1868207Tk, 61));
        }
    }

    public final Object yQ2(Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1803880x2g c1803880x2g;
        IapListResult.ListResultExtra resultExtra;
        IapListResult.IapCustomData iapCustomData;
        if ((th instanceof C1803880x2g) && (resultExtra = (c1803880x2g = (C1803880x2g) th).getResultExtra()) != null && (iapCustomData = resultExtra.iapCustomData) != null && iapCustomData.enableFailureCustomEntranceGuide && c1803880x2g.getResultExtra().packageUnavailableConfig != null) {
            Object objBQ2 = BQ2(th, interfaceC1364105Vn);
            if (objBQ2 == C099R.LJFF()) {
                return objBQ2;
            }
            return Unit.LIZ;
        }
        if (C1806160x6M.LIZ()) {
            Object objBQ22 = BQ2(th, interfaceC1364105Vn);
            if (objBQ22 == C099R.LJFF()) {
                return objBQ22;
            }
            return Unit.LIZ;
        }
        DQ2(new C1868007Ti(th), false);
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r1 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List CQ2(java.lang.String r20, X.C1804840x4E r21, boolean r22) {
        /*
            r0 = r21
            r1 = r20
            java.util.List r1 = r0.LJIIJ(r1)
            r8 = 1
            r7 = 0
            if (r22 == 0) goto L32
            if (r1 == 0) goto La9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r1.iterator()
        L17:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.livesdk.wallet.Diamond r0 = (com.bytedance.android.livesdk.wallet.Diamond) r0
            boolean r0 = r0.LIZ()
            r0 = r0 ^ 1
            if (r0 == 0) goto L17
            r3.add(r1)
            goto L17
        L30:
            r1 = r3
            goto L34
        L32:
            if (r1 == 0) goto La9
        L34:
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r5.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L43:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r4 = r6.next()
            com.bytedance.android.livesdk.wallet.Diamond r4 = (com.bytedance.android.livesdk.wallet.Diamond) r4
            java.lang.String r9 = r4.iapId
            int r3 = r4.count
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2[r1] = r0
            java.lang.String r0 = r4.price
            r2[r8] = r0
            r0 = 2131755791(0x7f10030f, float:1.9142471E38)
            java.lang.String r10 = X.C497740JfY.LJIIL(r0, r3, r2)
            int r0 = r4.count
            java.lang.String r11 = java.lang.String.valueOf(r0)
            boolean r0 = r4.LIZIZ()
            if (r0 == 0) goto La6
            java.lang.String r12 = X.C1804850x4F.LJI(r4)
        L78:
            java.lang.String r13 = r4.LIZIZ
            double r14 = r4.LJFF
            java.lang.String r3 = r4.LJI
            int r2 = r4.count
            boolean r18 = r4.LIZIZ()
            java.lang.String r19 = X.C1804850x4F.LIZIZ(r4)
            java.lang.String r1 = r4.customPriceCurrency
            com.bytedance.android.live.wallet.model.CurrencyPriceItem r0 = r4.usdPrice
            if (r0 == 0) goto La4
            java.lang.Long r0 = r0.price
        L90:
            X.0x55 r8 = new X.0x55
            r17 = r3
            r20 = r1
            r21 = r0
            r22 = r4
            r16 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22)
            r5.add(r8)
            r8 = 1
            goto L43
        La4:
            r0 = r7
            goto L90
        La6:
            java.lang.String r12 = r4.price
            goto L78
        La9:
            X.13BV r5 = X.C13BV.INSTANCE
        Lab:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel.CQ2(java.lang.String, X.0x4E, boolean):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object EQ2(X.C1805210x4p r35, java.lang.Throwable r36, X.C1805370x55 r37, X.InterfaceC1364105Vn<? super kotlin.Unit> r38) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel.EQ2(X.0x4p, java.lang.Throwable, X.0x55, X.05Vn):java.lang.Object");
    }

    public RechargePanelBodyViewModel(InterfaceC1804490x3f interfaceC1804490x3f, C1804620x3s c1804620x3s, C1804910x4L c1804910x4L, C1805170x4l c1805170x4l, InterfaceC1804890x4J interfaceC1804890x4J, IWalletService iWalletService) {
        this.LL = interfaceC1804490x3f;
        this.LLILLJJLI = c1804620x3s;
        this.LLILLL = c1804910x4L;
        this.LLILZ = c1805170x4l;
        this.LLILZIL = interfaceC1804890x4J;
        this.LLILZLL = iWalletService;
    }

    public static void AQ2(RechargePanelBodyViewModel rechargePanelBodyViewModel, C1803830x2b c1803830x2b, EnumC1803160x1W enumC1803160x1W, RecommendStrategyParam recommendStrategyParam, long j, int i) {
        long j2 = j;
        RecommendStrategyParam recommendStrategyParam2 = recommendStrategyParam;
        if ((i & 4) != 0) {
            recommendStrategyParam2 = null;
        }
        if ((i & 8) != 0) {
            j2 = BaseRechargeViewModel.LLJJJ;
        }
        C23250099c.LIZLLL(rechargePanelBodyViewModel.getAssemVMScope(), null, null, new C1804830x4D(rechargePanelBodyViewModel, c1803830x2b, 0, enumC1803160x1W, recommendStrategyParam2, j2, null), 3);
    }
}
