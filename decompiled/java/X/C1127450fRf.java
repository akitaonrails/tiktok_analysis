package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelMetaData;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127450fRf implements InterfaceC1127800fSE {
    public final LifecycleOwner LL;
    public final EnumC1127500fRk LLILLJJLI = EnumC1127500fRk.RELATION_ROSE_GIFT;
    public final C01GW LLILLL;
    public GiftPanelMetaData LLILZ;

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LIZIZ(InterfaceC1127800fSE interfaceC1127800fSE, View view, C1124680fNC c1124680fNC) {
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJII() {
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1127800fSE
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1127800fSE
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final C1133700fbk LJ() {
        return (C1133700fbk) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1127800fSE
    public final EnumC1127500fRk getBannerType() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1127800fSE
    public final boolean LJFF(C1124680fNC c1124680fNC) {
        GiftPanelMetaData giftPanelMetaData;
        Object obj;
        C1128940fU4 c1128940fU4;
        C1128940fU4 c1128940fU42;
        C1126800fQc.LIZ.GN();
        C1123320fL0 c1123320fL0LIZIZ = C1121450fHz.LIZIZ(EnumC1121470fI1.GIFT_PANEL_TP.getType());
        Object obj2 = null;
        if (c1123320fL0LIZIZ != null) {
            giftPanelMetaData = (GiftPanelMetaData) c1123320fL0LIZIZ.LIZLLL;
        } else {
            giftPanelMetaData = null;
        }
        this.LLILZ = giftPanelMetaData;
        if (c1124680fNC.LIZ == 16) {
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = c1124680fNC.LIZIZ;
            if (abstractC1126600fQI != null) {
                obj = abstractC1126600fQI.LIZIZ;
            } else {
                obj = null;
            }
            if ((obj instanceof C1128940fU4) && (c1128940fU4 = (C1128940fU4) obj) != null && c1128940fU4.LJIIJJI == C1128580fTU.LIZ()) {
                AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = c1124680fNC.LIZIZ;
                if (abstractC1126600fQI2 != null) {
                    obj2 = abstractC1126600fQI2.LIZIZ;
                }
                if (!(obj2 instanceof C1128940fU4) || (c1128940fU42 = (C1128940fU4) obj2) == null || !c1128940fU42.LJIIL) {
                    return true;
                }
            }
            return false;
        }
        return c1124680fNC.LIZIZ instanceof C293201Bq;
    }

    public C1127450fRf(View view, LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
        this.LLILLL = C452501pT.LIZIZ(new AwS561S0100000_17(view, 531));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[PHI: r1
      0x006f: PHI (r1v1 webcast.data.TPText) = (r1v0 webcast.data.TPText), (r1v4 webcast.data.TPText) binds: [B:29:0x006c, B:20:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1127800fSE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJI(X.C1124680fNC r6, X.InterfaceC1124700fNE r7, X.InterfaceC1123410fL9 r8) {
        /*
            r5 = this;
            X.0fQI<? extends X.0054> r0 = r6.LIZIZ
            r4 = 0
            if (r0 == 0) goto L71
            T extends X.0054 r0 = r0.LIZIZ
        L7:
            boolean r0 = r0 instanceof X.C1128940fU4
            if (r0 == 0) goto L42
            com.bytedance.android.livesdk.model.GiftPanelBanner r0 = r6.LJII
            if (r0 == 0) goto L3f
            com.bytedance.android.livesdk.model.message.common.Text r2 = r0.displayText
            com.bytedance.android.live.base.model.ImageModel r1 = r0.leftIcon
        L13:
            X.0fbk r0 = r5.LJ()
            r0.LIZJ(r1, r2)
            X.0fbk r0 = r5.LJ()
            r0.LIZ(r4)
        L21:
            X.0fbk r3 = r5.LJ()
            java.lang.String r2 = "show"
            long r0 = r6.LJFF
            r3.LIZIZ(r0, r2)
            X.0fbk r2 = r5.LJ()
            Y.ACListenerS152S0100000_17 r1 = new Y.ACListenerS152S0100000_17
            r0 = 163(0xa3, float:2.28E-43)
            r1.<init>(r5, r0)
            X.C786410Ut5.C8(r2, r1)
            X.0fbk r0 = r5.LJ()
            return r0
        L3f:
            r2 = r4
            r1 = r4
            goto L13
        L42:
            X.0fbk r3 = r5.LJ()
            com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelMetaData r2 = r5.LLILZ
            if (r2 == 0) goto L6b
            com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelBannerMetaData r0 = r2.banner
            if (r0 == 0) goto L6b
            webcast.data.TPText r1 = r0.content
        L50:
            com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelBannerMetaData r0 = r2.banner
            if (r0 == 0) goto L6f
            com.bytedance.android.live.base.model.ImageModel r0 = r0.icon
        L56:
            r3.LIZLLL(r1, r0)
            X.0fbk r1 = r5.LJ()
            com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelMetaData r0 = r5.LLILZ
            if (r0 == 0) goto L67
            com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelBannerMetaData r0 = r0.banner
            if (r0 == 0) goto L67
            webcast.data.TPText r4 = r0.countdownTs
        L67:
            r1.LIZ(r4)
            goto L21
        L6b:
            r1 = r4
            if (r2 == 0) goto L6f
            goto L50
        L6f:
            r0 = r4
            goto L56
        L71:
            r0 = r4
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1127450fRf.LJI(X.0fNC, X.0fNE, X.0fL9):android.view.View");
    }
}
