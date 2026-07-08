package com.bytedance.android.live.slot.util;

import X.C1548820qPI;
import X.C5182020e;
import X.C758930Tpr;
import X.C758940Tps;
import X.C758950Tpt;
import com.bytedance.android.live.slot.IBcToggleService;
import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes13.dex */
public class BcToggleToggleService implements IBcToggleService {
    public static final C758930Tpr LL = new C758930Tpr();
    public static volatile boolean LLILLJJLI;

    @Override // X.C180W
    public final void destroy() {
        LLILLJJLI = false;
        C758930Tpr c758930Tpr = LL;
        c758930Tpr.LLILLL = null;
        C758940Tps c758940Tps = c758930Tpr.LIZIZ().LIZ;
        c758940Tps.LIZ = 3;
        c758940Tps.LIZJ = 3;
        c758940Tps.LIZIZ = false;
        c758940Tps.LIZLLL = false;
        c758940Tps.LJFF = false;
        c758940Tps.LJI = 0;
        c758940Tps.LJII = false;
        C1548820qPI.LJIIIIZZ("liveBrandToggle", c758930Tpr);
        c758930Tpr.LL = null;
        c758930Tpr.getClass();
        c758930Tpr.getClass();
        DataChannelGlobal.LLILZ.HQ2(ECBcToggleChannel.class, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    @Override // X.C180W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C758970Tpv LIZ() {
        /*
            r5 = this;
            X.0Tpr r4 = com.bytedance.android.live.slot.util.BcToggleToggleService.LL
            X.0Tpq r0 = r4.LIZIZ()
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto L6d
            X.0Tpq r0 = r4.LIZIZ()
            X.0Tpt r0 = r0.LIZJ
            r3 = 0
            if (r0 == 0) goto L60
            java.lang.Boolean r1 = r0.LIZLLL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L60
            X.0Tpq r0 = r4.LIZIZ()
            X.0Tpt r0 = r0.LIZJ
            if (r0 == 0) goto L6b
            java.lang.Boolean r0 = r0.LIZJ
            if (r0 == 0) goto L6b
            boolean r2 = r0.booleanValue()
        L2d:
            X.0Tpq r0 = r4.LIZIZ()
            X.0Tpt r0 = r0.LIZJ
            if (r0 == 0) goto L55
            java.lang.Boolean r1 = r0.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L55
            X.0Tpq r0 = r4.LIZIZ()
            X.0Tpt r0 = r0.LIZJ
            if (r0 == 0) goto L4f
            java.lang.Boolean r0 = r0.LIZ
            if (r0 == 0) goto L4f
            boolean r3 = r0.booleanValue()
        L4f:
            X.0Tpv r0 = new X.0Tpv
            r0.<init>(r2, r3)
            return r0
        L55:
            X.0Tpq r0 = r4.LIZIZ()
            com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle r0 = r0.LIZIZ
            if (r0 == 0) goto L4f
            boolean r3 = r0.promoteThirdParty
            goto L4f
        L60:
            X.0Tpq r0 = r4.LIZIZ()
            com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle r0 = r0.LIZIZ
            if (r0 == 0) goto L6b
            boolean r2 = r0.promoteMyself
            goto L2d
        L6b:
            r2 = 0
            goto L2d
        L6d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.util.BcToggleToggleService.LIZ():X.0Tpv");
    }

    @Override // X.C180W
    public final void LIZLLL() {
        LL.getClass();
    }

    @Override // X.C180W
    public final void init() {
        if (LLILLJJLI) {
            return;
        }
        LLILLJJLI = true;
        C1548820qPI.LIZLLL("liveBrandToggle", LL);
    }

    @Override // X.C180W
    public final void LIZIZ(AwS576S0100000_32 awS576S0100000_32) {
        LL.LLILLJJLI = awS576S0100000_32;
    }

    @Override // X.C180W
    public final void LIZJ(C758950Tpt c758950Tpt) {
        LL.LIZIZ().LIZJ = c758950Tpt;
    }

    @Override // X.C180W
    public final void LJ(boolean z) {
        LL.LLILZ = z;
    }

    @Override // com.bytedance.android.live.slot.IBcToggleService
    public final void fV1(CommercialContentToggle commercialContentToggle) {
        C758930Tpr c758930Tpr = LL;
        c758930Tpr.LIZIZ().LIZIZ = commercialContentToggle;
        DataChannelGlobal.LLILZ.HQ2(ECBcToggleChannel.class, c758930Tpr.LIZIZ());
    }

    @Override // com.bytedance.android.live.slot.IBcToggleService
    public final void wr0(LiveMode liveMode) {
        LL.LL = liveMode;
    }

    @Override // com.bytedance.android.live.slot.IBcToggleService
    public final void wy(C5182020e c5182020e) {
        LL.LLILLL = c5182020e;
    }

    public static boolean LJII(int i, int i2) {
        C758940Tps c758940Tps = LL.LIZIZ().LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && c758940Tps.LJI == i2) {
                    return true;
                }
                return false;
            }
            if (c758940Tps.LIZJ == i2) {
                return true;
            }
            return false;
        }
        if (c758940Tps.LIZ == i2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    @Override // X.C180W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(int r16, int r17, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r18) {
        /*
            r15 = this;
            r2 = 2
            r3 = r17
            if (r16 != 0) goto L38
            boolean r0 = LJII(r3, r2)
            if (r0 == 0) goto Lc
            return
        Lc:
            if (r16 != 0) goto L38
            X.0Tpr r1 = com.bytedance.android.live.slot.util.BcToggleToggleService.LL
            X.0Tpq r0 = r1.LIZIZ()
            X.0Tps r5 = r0.LIZ
            r4 = 1
            if (r3 == r4) goto L35
            if (r3 == r2) goto L29
            r0 = 3
            if (r3 != r0) goto L38
            boolean r0 = r5.LJII
        L20:
            if (r0 == 0) goto L38
            boolean r0 = LJII(r3, r4)
            if (r0 == 0) goto L38
            goto L3a
        L29:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = r1.LL
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
            if (r1 != r0) goto L32
            boolean r0 = r5.LJFF
            goto L20
        L32:
            boolean r0 = r5.LIZLLL
            goto L20
        L35:
            boolean r0 = r5.LIZIZ
            goto L20
        L38:
            r2 = r16
        L3a:
            X.0Tpr r4 = com.bytedance.android.live.slot.util.BcToggleToggleService.LL
            X.0Tpq r0 = r4.LIZIZ()
            X.0Tps r0 = r0.LIZ
            r0.getClass()
            X.0Tps r5 = new X.0Tps
            int r7 = r0.LIZ
            boolean r6 = r0.LIZIZ
            int r8 = r0.LIZJ
            boolean r12 = r0.LIZLLL
            int r9 = r0.LJ
            boolean r13 = r0.LJFF
            int r10 = r0.LJI
            boolean r14 = r0.LJII
            int r11 = r0.LJIIIIZZ
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r18
            r4.LIZ(r2, r3, r0)
            X.0Tpq r0 = r4.LIZIZ()
            X.0Tps r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 != 0) goto L78
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r2 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.live.slot.model.ECBcToggleChannel> r1 = com.bytedance.android.live.slot.model.ECBcToggleChannel.class
            X.0Tpq r0 = r4.LIZIZ()
            r2.HQ2(r1, r0)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.util.BcToggleToggleService.LJFF(int, int, com.bytedance.android.livesdkapi.depend.model.live.LiveMode):void");
    }
}
