package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceRes;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceResCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgDataTransfer;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ReachCfgDataForMall;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w8T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769030w8T implements InterfaceC1769450w99 {
    public final InterfaceC497601wk LIZ;
    public final ReachCfgDataTransfer LIZIZ;
    public final InterfaceC1769150w8f LIZJ;
    public final String LIZLLL;
    public final int LJ = hashCode();
    public final WeakReference<InterfaceC497601wk> LJFF;
    public AnonymousClass0956 LJI;
    public ReachCfgDataForMall LJII;
    public final Map<EnumC1768880w8E, AbstractC1769070w8X> LJIIIIZZ;
    public AbstractC1769070w8X LJIIIZ;
    public EnumC1768880w8E LJIIJ;
    public volatile EnumC1768230w7B LJIIJJI;

    public final boolean LJFF() {
        for (Map.Entry entry : ((LinkedHashMap) this.LJIIIIZZ).entrySet()) {
            entry.getKey();
            if (((AbstractC1769070w8X) entry.getValue()).LJFF()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1769450w99
    public final int LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1769450w99
    public final Map<String, Object> LIZIZ(EnumC1768880w8E enumC1768880w8E) {
        AbstractC1769070w8X abstractC1769070w8X = (AbstractC1769070w8X) ((LinkedHashMap) this.LJIIIIZZ).get(enumC1768880w8E);
        if (abstractC1769070w8X != null) {
            return abstractC1769070w8X.LIZJ();
        }
        return null;
    }

    @Override // X.InterfaceC1769450w99
    public final void LIZJ(EnumC1768230w7B enumC1768230w7B) {
        this.LJIIJJI = enumC1768230w7B;
    }

    public final void LJ(final ReachCfgDataTransfer reachCfgDataTransfer) {
        AbstractC1769090w8Z abstractC1769090w8Z;
        final EnumC341090DYt enumC341090DYt;
        String str;
        final EnumC341090DYt enumC341090DYt2;
        DiversionEntranceRes diversionEntranceResLIZ;
        if (((Boolean) C077H.LIZ.getValue()).booleanValue()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("ShopByteSync BadgeTask===== shop tab When the red dot inversion is turned on, the experiment starts without creating a red dot task");
            return;
        }
        ReachCfgData reachCfgData = reachCfgDataTransfer.reachCfgData;
        String str2 = null;
        if (reachCfgData != null && (diversionEntranceResLIZ = C1767520w62.LIZ(reachCfgData)) != null) {
            str2 = diversionEntranceResLIZ.type;
        }
        if (Intrinsics.LJFF(str2, EnumC1769230w8n.BASE_BADGE.getValue())) {
            final InterfaceC497601wk interfaceC497601wk = this.LJFF.get();
            final InterfaceC1769150w8f interfaceC1769150w8f = this.LIZJ;
            if (interfaceC1769150w8f.am1() == EnumC1768630w7p.BOTTOM_TAB.getValue()) {
                enumC341090DYt2 = EnumC341090DYt.MALL_TAB;
            } else {
                enumC341090DYt2 = EnumC341090DYt.MALL_TOP_TAB;
            }
            abstractC1769090w8Z = new AbstractC1769090w8Z(interfaceC497601wk, interfaceC1769150w8f, enumC341090DYt2, reachCfgDataTransfer, this) { // from class: X.0w8m
                @Override // X.AbstractC1769090w8Z
                public final void LJIIJ(C1769130w8d c1769130w8d) {
                    ReachCfgData reachCfgData2;
                    Integer num;
                    ReachCfgDataTransfer reachCfgDataTransfer2 = this.LIZLLL;
                    if (reachCfgDataTransfer2 != null && (reachCfgData2 = reachCfgDataTransfer2.reachCfgData) != null && (num = reachCfgData2.showCount) != null && num.intValue() < 1) {
                        this.LIZIZ.If1(this.LIZLLL, EnumC1768880w8E.TAB_BADGE);
                    }
                    super.LJIIJ(c1769130w8d);
                }
            };
        } else {
            if (!Intrinsics.LJFF(str2, EnumC1769230w8n.BASE_TOOLTIP.getValue()) && !Intrinsics.LJFF(str2, EnumC1769230w8n.VOUCHER_TOOLTIP.getValue()) && !Intrinsics.LJFF(str2, EnumC1769230w8n.BASE_ICON.getValue())) {
                return;
            }
            final InterfaceC497601wk interfaceC497601wk2 = this.LJFF.get();
            final InterfaceC1769150w8f interfaceC1769150w8f2 = this.LIZJ;
            if (interfaceC1769150w8f2.am1() == EnumC1768630w7p.BOTTOM_TAB.getValue()) {
                enumC341090DYt = EnumC341090DYt.MALL_TAB;
            } else {
                enumC341090DYt = EnumC341090DYt.MALL_TOP_TAB;
            }
            abstractC1769090w8Z = new AbstractC1769090w8Z(interfaceC497601wk2, interfaceC1769150w8f2, enumC341090DYt, reachCfgDataTransfer, this) { // from class: X.0w9E
            };
        }
        Map<EnumC1768880w8E, AbstractC1769070w8X> map = this.LJIIIIZZ;
        EnumC1768880w8E enumC1768880w8E = EnumC1768880w8E.TAB_BADGE;
        map.put(enumC1768880w8E, abstractC1769090w8Z);
        this.LJIIJ = enumC1768880w8E;
        C1768560w7i c1768560w7i = C1768560w7i.LIZ;
        EnumC1768570w7j enumC1768570w7j = EnumC1768570w7j.HANDLE_RESPONSE;
        EnumC1768960w8M enumC1768960w8M = EnumC1768960w8M.CREATE_UI_TASK;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("type", enumC1768880w8E.getValue());
        ReachCfgData reachCfgData2 = reachCfgDataTransfer.reachCfgData;
        if (reachCfgData2 == null || (str = reachCfgData2.diversionId) == null) {
            str = "";
        }
        pairArr[1] = new Pair("diversion_id", str);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1768560w7i.getClass();
        C1768560w7i.LJ(enumC1768570w7j, enumC1768960w8M, true, mapLJIIIIZZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.EnumC1768880w8E r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1408030mkD
            if (r0 == 0) goto L75
            r7 = r10
            X.0mkD r7 = (X.C1408030mkD) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 == r4) goto L67
            if (r0 != r5) goto L7b
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            if (r9 != 0) goto L30
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            java.util.Map<X.0w8E, X.0w8X> r0 = r8.LJIIIIZZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r3 = r0.get(r9)
            X.0w8X r3 = (X.AbstractC1769070w8X) r3
            if (r3 == 0) goto L83
            r8.LJIIIZ = r3
            X.09Fh r2 = X.C2341109Fh.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ShopByteSync ReachTask===== show ui task: "
            r1.append(r0)
            r1.append(r3)
            r0 = 32
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C2341109Fh.LIZ(r0)
            r7.LLILLL = r4
            java.lang.Object r1 = r3.LIZIZ(r7)
            if (r1 != r6) goto L6a
            return r6
        L67:
            X.C155000ia.LIZIZ(r1)
        L6a:
            X.0w8E r1 = (X.EnumC1768880w8E) r1
            r7.LLILLL = r5
            java.lang.Object r0 = r8.LJI(r1, r7)
            if (r0 != r6) goto L25
            return r6
        L75:
            X.0mkD r7 = new X.0mkD
            r7.<init>(r8, r10)
            goto L12
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L83:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1769030w8T.LJI(X.0w8E, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<? extends X.EnumC1768880w8E> r7, X.EnumC1769260w8q r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C1408040mkE
            if (r0 == 0) goto Lb0
            r5 = r9
            X.0mkE r5 = (X.C1408040mkE) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb0
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r3 = 1
            if (r0 == 0) goto L6d
            if (r0 != r3) goto Lb7
            X.0w8q r8 = r5.LLILLJJLI
            java.lang.Object r7 = r5.LL
            java.util.List r7 = (java.util.List) r7
            X.C155000ia.LIZIZ(r1)
        L28:
            r0 = 0
            r6.LJI = r0
            java.util.Iterator r4 = r7.iterator()
        L2f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lbf
            java.lang.Object r1 = r4.next()
            java.util.Map<X.0w8E, X.0w8X> r0 = r6.LJIIIIZZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r3 = r0.get(r1)
            X.0w8X r3 = (X.AbstractC1769070w8X) r3
            if (r3 == 0) goto L2f
            X.09Fh r2 = X.C2341109Fh.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ShopByteSync ReachTask===== hide ui task type: "
            r1.append(r0)
            X.0w8E r0 = r3.LJ()
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C2341109Fh.LIZ(r0)
            r3.LIZ(r8)
            goto L2f
        L6d:
            X.C155000ia.LIZIZ(r1)
            X.09Fh r2 = X.C2341109Fh.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ShopByteSync ReachTask===== try cancel reach task "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C2341109Fh.LIZ(r0)
            java.lang.String r0 = r6.LIZLLL
            if (r0 == 0) goto Lbf
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ShopByteSync ReachTask===== cancel reach task "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C2341109Fh.LIZ(r0)
            X.0956 r0 = r6.LJI
            if (r0 == 0) goto L28
            r5.LL = r7
            r5.LLILLJJLI = r8
            r5.LLILZIL = r3
            java.lang.Object r0 = X.C23118094a.LIZLLL(r0, r5)
            if (r0 != r4) goto L28
            return r4
        Lb0:
            X.0mkE r5 = new X.0mkE
            r5.<init>(r6, r9)
            goto L12
        Lb7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lbf:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1769030w8T.LIZLLL(java.util.List, X.0w8q, X.05Vn):java.lang.Object");
    }

    public C1769030w8T(InterfaceC497601wk interfaceC497601wk, ReachCfgDataTransfer reachCfgDataTransfer, EnumC1768910w8H enumC1768910w8H, String str, InterfaceC1769150w8f interfaceC1769150w8f) {
        String str2;
        String str3;
        ReachCfgData reachCfgData;
        Integer num;
        EnumC341090DYt enumC341090DYt;
        String str4;
        DiversionEntranceResCfg diversionEntranceResCfg;
        Integer num2;
        EnumC341090DYt enumC341090DYt2;
        String str5;
        DiversionEntranceResCfg diversionEntranceResCfg2;
        ReachCfg reachCfg;
        ReachCfg reachCfg2;
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = reachCfgDataTransfer;
        this.LIZJ = interfaceC1769150w8f;
        WeakReference<InterfaceC497601wk> weakReference = new WeakReference<>(this.LIZ);
        this.LJFF = weakReference;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LJIIIIZZ = linkedHashMap;
        this.LJIIJJI = EnumC1768230w7B.DEFAULT;
        int i = C1768920w8I.LIZ[enumC1768910w8H.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LIZLLL = null;
                this.LJII = null;
                return;
            }
            throw new C1954807lC();
        }
        if (reachCfgDataTransfer != null && (reachCfg2 = reachCfgDataTransfer.reachCfg) != null) {
            str2 = reachCfg2.noticeId;
        } else {
            str2 = null;
        }
        this.LIZLLL = str2;
        if (reachCfgDataTransfer != null && (reachCfg = reachCfgDataTransfer.reachCfg) != null) {
            str3 = reachCfg.data;
        } else {
            str3 = null;
            reachCfgData = reachCfgDataTransfer == null ? null : reachCfgData;
            this.LJII = new ReachCfgDataForMall(str3, reachCfgData, false, false, false, null, null, System.currentTimeMillis());
            if (reachCfgDataTransfer != null || reachCfgDataTransfer.reachCfgData == null) {
            }
            String str6 = "";
            if (!Intrinsics.LJFF(str, EnumC1769230w8n.BASE_TOOLTIP.getValue()) && !Intrinsics.LJFF(str, EnumC1769230w8n.VOUCHER_TOOLTIP.getValue())) {
                if (Intrinsics.LJFF(str, EnumC1769230w8n.BASE_ICON.getValue())) {
                    ReachCfgData reachCfgData2 = reachCfgDataTransfer.reachCfgData;
                    if (reachCfgData2 != null) {
                        num2 = reachCfgData2.showCount;
                    } else {
                        num2 = null;
                    }
                    DiversionEntranceRes diversionEntranceResLIZ = C1767520w62.LIZ(reachCfgData2);
                    if (diversionEntranceResLIZ != null && (diversionEntranceResCfg2 = diversionEntranceResLIZ.config) != null && diversionEntranceResCfg2.redDot != null) {
                        LJ(reachCfgDataTransfer);
                    }
                    if (num2 == null || num2.intValue() >= 1) {
                        return;
                    }
                    InterfaceC497601wk interfaceC497601wk2 = weakReference.get();
                    if (interfaceC1769150w8f.am1() == EnumC1768630w7p.BOTTOM_TAB.getValue()) {
                        enumC341090DYt2 = EnumC341090DYt.MALL_TAB;
                    } else {
                        enumC341090DYt2 = EnumC341090DYt.MALL_TOP_TAB;
                    }
                    EnumC1768880w8E enumC1768880w8E = EnumC1768880w8E.TAB_BADGE;
                    C1769100w8a c1769100w8a = new C1769100w8a(interfaceC497601wk2, interfaceC1769150w8f, enumC341090DYt2, reachCfgDataTransfer, linkedHashMap.get(enumC1768880w8E) == null ? null : enumC1768880w8E, this);
                    EnumC1768880w8E enumC1768880w8E2 = EnumC1768880w8E.TAB_ICON;
                    linkedHashMap.put(enumC1768880w8E2, c1769100w8a);
                    this.LJIIJ = enumC1768880w8E2;
                    C1768560w7i c1768560w7i = C1768560w7i.LIZ;
                    EnumC1768570w7j enumC1768570w7j = EnumC1768570w7j.HANDLE_RESPONSE;
                    EnumC1768960w8M enumC1768960w8M = EnumC1768960w8M.CREATE_UI_TASK;
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("type", enumC1768880w8E2.getValue());
                    ReachCfgData reachCfgData3 = reachCfgDataTransfer.reachCfgData;
                    if (reachCfgData3 != null && (str5 = reachCfgData3.diversionId) != null) {
                        str6 = str5;
                    }
                    pairArr[1] = new Pair("diversion_id", str6);
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                    c1768560w7i.getClass();
                    C1768560w7i.LJ(enumC1768570w7j, enumC1768960w8M, true, mapLJIIIIZZ);
                    return;
                }
                if (!Intrinsics.LJFF(str, EnumC1769230w8n.BASE_BADGE.getValue())) {
                    return;
                }
                LJ(reachCfgDataTransfer);
                return;
            }
            ReachCfgData reachCfgData4 = reachCfgDataTransfer.reachCfgData;
            DiversionEntranceRes diversionEntranceResLIZ2 = C1767520w62.LIZ(reachCfgData4);
            if (diversionEntranceResLIZ2 != null && (diversionEntranceResCfg = diversionEntranceResLIZ2.config) != null && diversionEntranceResCfg.redDot != null) {
                LJ(reachCfgDataTransfer);
            }
            if (reachCfgData4 == null || (num = reachCfgData4.showCount) == null || num.intValue() >= 1) {
                return;
            }
            InterfaceC497601wk interfaceC497601wk3 = weakReference.get();
            if (interfaceC1769150w8f.am1() == EnumC1768630w7p.BOTTOM_TAB.getValue()) {
                enumC341090DYt = EnumC341090DYt.MALL_TAB;
            } else {
                enumC341090DYt = EnumC341090DYt.MALL_TOP_TAB;
            }
            EnumC1768880w8E enumC1768880w8E3 = EnumC1768880w8E.TAB_BADGE;
            C1769080w8Y c1769080w8Y = new C1769080w8Y(interfaceC497601wk3, interfaceC1769150w8f, enumC341090DYt, reachCfgDataTransfer, linkedHashMap.get(enumC1768880w8E3) == null ? null : enumC1768880w8E3, this);
            EnumC1768880w8E enumC1768880w8E4 = EnumC1768880w8E.TAB_TOOLTIP;
            linkedHashMap.put(enumC1768880w8E4, c1769080w8Y);
            this.LJIIJ = enumC1768880w8E4;
            C1768560w7i c1768560w7i2 = C1768560w7i.LIZ;
            EnumC1768570w7j enumC1768570w7j2 = EnumC1768570w7j.HANDLE_RESPONSE;
            EnumC1768960w8M enumC1768960w8M2 = EnumC1768960w8M.CREATE_UI_TASK;
            Pair[] pairArr2 = new Pair[2];
            pairArr2[0] = new Pair("type", enumC1768880w8E4.getValue());
            ReachCfgData reachCfgData5 = reachCfgDataTransfer.reachCfgData;
            if (reachCfgData5 != null && (str4 = reachCfgData5.diversionId) != null) {
                str6 = str4;
            }
            pairArr2[1] = new Pair("diversion_id", str6);
            Map mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(pairArr2);
            c1768560w7i2.getClass();
            C1768560w7i.LJ(enumC1768570w7j2, enumC1768960w8M2, true, mapLJIIIIZZ2);
            return;
        }
        reachCfgData = reachCfgDataTransfer.reachCfgData;
        this.LJII = new ReachCfgDataForMall(str3, reachCfgData, false, false, false, null, null, System.currentTimeMillis());
        if (reachCfgDataTransfer != null) {
        }
    }
}
