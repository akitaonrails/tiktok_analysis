package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopupTrigger;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS253S0300000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0NKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.trigger.PdpTriggerMgr$configTriggers$1", f = "PdpTriggerMgr.kt", l = {82, 91}, m = "invokeSuspend")
public final class C592250NKt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<PopupTrigger> LLILLL;
    public final /* synthetic */ C1761110vvh LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592250NKt(List<PopupTrigger> list, C1761110vvh c1761110vvh, boolean z, InterfaceC1364105Vn<? super C592250NKt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c1761110vvh;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592250NKt(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        Map<String, Object> map;
        AbstractC592270NKv abstractC592270NKv;
        C1C7U.LIZ("PdpTriggerMgr@61b5.configTriggers$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PdpTriggerMgr@61b5.configTriggers$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (List) this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            List<PopupTrigger> list = this.LLILLL;
            if (list != null && !list.isEmpty()) {
                C1761110vvh c1761110vvh = this.LLILZ;
                if (c1761110vvh.LIZJ && !this.LLILZIL) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("PdpTriggerMgr@61b5.configTriggers$1");
                    return unit2;
                }
                c1761110vvh.LIZJ = true;
                arrayList = new ArrayList();
                List<PopupTrigger> list2 = this.LLILLL;
                C1761110vvh c1761110vvh2 = this.LLILZ;
                ArrayList arrayList2 = new ArrayList();
                for (PopupTrigger popupTrigger : list2) {
                    C592240NKs c592240NKs = C0NLF.Companion;
                    Integer num = popupTrigger.target;
                    c592240NKs.getClass();
                    final C0NLF c0nlfLIZ = C592240NKs.LIZ(num);
                    C1326490kch c1326490kch = C1326490kch.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("configTriggers_");
                    sbLIZ.append(c0nlfLIZ.getValue());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    IPdpStarter.PdpEnterParam pdpEnterParam = c1761110vvh2.LIZ.LLJI;
                    if (pdpEnterParam != null) {
                        map = pdpEnterParam.trackParams;
                    } else {
                        map = null;
                    }
                    c1326490kch.getClass();
                    C1326490kch.LJIIIIZZ("PdpTriggerMgr", strLIZIZ, map);
                    C0NL7 c0nl7 = C0NL6.Companion;
                    Integer num2 = popupTrigger.nextRequestSceneKey;
                    c0nl7.getClass();
                    final C0NL6 c0nl6LIZ = C0NL7.LIZ(num2);
                    if (Intrinsics.LJFF(popupTrigger.cartRefresh, true)) {
                        abstractC592270NKv = new AbstractC592270NKv(c0nlfLIZ, c0nl6LIZ) { // from class: X.0NKx
                            @Override // X.AbstractC592270NKv
                            public final Object LIZ(C0NLD c0nld, PdpViewModel pdpViewModel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                                AwS253S0300000_9 awS253S0300000_9 = new AwS253S0300000_9(pdpViewModel, c0nld, this, 16);
                                if (!((ArrayList) pdpViewModel.LLLZLL).contains(awS253S0300000_9)) {
                                    ((ArrayList) pdpViewModel.LLLZLL).add(awS253S0300000_9);
                                }
                                return Unit.LIZ;
                            }
                        };
                    } else if (Intrinsics.LJFF(popupTrigger.selectedAddressRefresh, true)) {
                        abstractC592270NKv = new AbstractC592270NKv(c0nlfLIZ, c0nl6LIZ) { // from class: X.0NKw
                            @Override // X.AbstractC592270NKv
                            public final Object LIZ(C0NLD c0nld, PdpViewModel pdpViewModel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                                AwS253S0300000_9 awS253S0300000_9 = new AwS253S0300000_9(pdpViewModel, c0nld, this, 17);
                                if (!((ArrayList) pdpViewModel.LLLZLZ).contains(awS253S0300000_9)) {
                                    ((ArrayList) pdpViewModel.LLLZLZ).add(awS253S0300000_9);
                                }
                                return Unit.LIZ;
                            }
                        };
                    } else if (popupTrigger.delayTimeSec != null) {
                        if (list2.size() > 1) {
                            SettingsManager.LIZLLL().getClass();
                            if (SettingsManager.LIZ("pdp_pop_trigger_fallback", true)) {
                                arrayList.add(popupTrigger);
                            }
                        }
                        final int iIntValue = popupTrigger.delayTimeSec.intValue();
                        abstractC592270NKv = new AbstractC592270NKv(iIntValue, c0nlfLIZ, c0nl6LIZ) { // from class: X.0NL1
                            public final int LIZJ;

                            {
                                super(c0nlfLIZ, c0nl6LIZ);
                                this.LIZJ = iIntValue;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
                            @Override // X.AbstractC592270NKv
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object LIZ(X.C0NLD r8, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
                                /*
                                    r7 = this;
                                    boolean r0 = r10 instanceof X.C0NL2
                                    if (r0 == 0) goto L45
                                    r6 = r10
                                    X.0NL2 r6 = (X.C0NL2) r6
                                    int r2 = r6.LLILZIL
                                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r0 = r2 & r1
                                    if (r0 == 0) goto L45
                                    int r2 = r2 - r1
                                    r6.LLILZIL = r2
                                L12:
                                    java.lang.Object r1 = r6.LLILLL
                                    java.lang.Object r5 = X.C099R.LJFF()
                                    int r0 = r6.LLILZIL
                                    r4 = 1
                                    if (r0 == 0) goto L2f
                                    if (r0 != r4) goto L4b
                                    com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r9 = r6.LLILLJJLI
                                    X.0NLD r8 = r6.LL
                                    X.C155000ia.LIZIZ(r1)
                                L26:
                                    X.0NL6 r1 = r7.LIZIZ
                                    r0 = 0
                                    r8.LIZIZ(r9, r1, r0)
                                    kotlin.Unit r0 = kotlin.Unit.LIZ
                                    return r0
                                L2f:
                                    X.C155000ia.LIZIZ(r1)
                                    int r0 = r7.LIZJ
                                    long r2 = (long) r0
                                    r0 = 1000(0x3e8, double:4.94E-321)
                                    long r2 = r2 * r0
                                    r6.LL = r8
                                    r6.LLILLJJLI = r9
                                    r6.LLILZIL = r4
                                    java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r6)
                                    if (r0 != r5) goto L26
                                    return r5
                                L45:
                                    X.0NL2 r6 = new X.0NL2
                                    r6.<init>(r7, r10)
                                    goto L12
                                L4b:
                                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                    r1.<init>(r0)
                                    throw r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C0NL1.LIZ(X.0NLD, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel, X.05Vn):java.lang.Object");
                            }
                        };
                    } else {
                        abstractC592270NKv = new AbstractC592270NKv() { // from class: X.0NKu
                            {
                                C0NLF c0nlf = C0NLF.INVALID;
                                C0NL6 c0nl6 = C0NL6.INVALID;
                            }

                            @Override // X.AbstractC592270NKv
                            public final Object LIZ(C0NLD c0nld, PdpViewModel pdpViewModel, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                                C1019103yf.LIZ(EnumC1014603xw.ERR10000, null, null);
                                return Unit.LIZ;
                            }
                        };
                    }
                    arrayList2.add(abstractC592270NKv);
                }
                C1761110vvh c1761110vvh3 = this.LLILZ;
                this.LL = arrayList;
                this.LLILLJJLI = 1;
                c1761110vvh3.getClass();
                Object objLJ = C2296808zG.LJ(new C0NKQ(arrayList2, c1761110vvh3, null), this);
                if (objLJ != C099R.LJFF()) {
                    objLJ = Unit.LIZ;
                }
                if (objLJ == objLJFF) {
                    C1C7U.LIZIZ("PdpTriggerMgr@61b5.configTriggers$1");
                    return objLJFF;
                }
            } else {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("PdpTriggerMgr@61b5.configTriggers$1");
                return unit3;
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList<Pair> arrayList3 = new ArrayList();
            for (PopupTrigger popupTrigger2 : arrayList) {
                Integer num3 = popupTrigger2.delayTimeSec;
                if (num3 != null) {
                    arrayList3.add(new Pair(C2286608xc.LJ(num3.intValue()), popupTrigger2));
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Pair pair : arrayList3) {
                Integer numLJ = C2286608xc.LJ(((Number) pair.getFirst()).intValue());
                Object arrayList4 = linkedHashMap.get(numLJ);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(numLJ, arrayList4);
                }
                ((List) arrayList4).add(pair.getSecond());
            }
            C0NJN c0njn = new C0NJN(linkedHashMap, this.LLILZ, null);
            this.LL = null;
            this.LLILLJJLI = 2;
            if (C2296808zG.LJ(c0njn, this) == objLJFF) {
                C1C7U.LIZIZ("PdpTriggerMgr@61b5.configTriggers$1");
                return objLJFF;
            }
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("PdpTriggerMgr@61b5.configTriggers$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
