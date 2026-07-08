package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import tikcast.linkmic.common.LayoutState;

/* JADX INFO: renamed from: X.0ZxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916580ZxY {
    public DataChannel LIZ;
    public final Function0<LayoutState> LIZIZ;
    public final C916590ZxZ LIZJ = new InterfaceC958970b3v() { // from class: X.0ZxZ
        @Override // X.InterfaceC958970b3v
        public final void LIZJ(int i, List list) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJJIJL(C2180891AWx c2180891AWx) {
        }

        @Override // X.InterfaceC958970b3v
        public final boolean LJJJIL() {
            return true;
        }

        @Override // X.InterfaceC958970b3v
        public final void LLIIIL(Map map) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJJJ() {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLJLLL(List list, boolean z) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLJ(LinkUser linkUser) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
        }

        @Override // X.InterfaceC958970b3v
        public final void LJJJI() {
            this.LL.LIZ();
        }

        @Override // X.InterfaceC958970b3v
        public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
            this.LL.LIZ();
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r6 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.LIZ
            r3 = 0
            if (r1 == 0) goto Lc2
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.CurrentRealDisplayChannel> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.CurrentRealDisplayChannel.class
            java.lang.Object r2 = r1.gg0(r0)
            kotlin.Pair r2 = (kotlin.Pair) r2
        Ld:
            boolean r0 = X.C931790aM5.LIZIZ()
            if (r0 == 0) goto La3
            X.0a86 r0 = X.C940770aaZ.LIZ()
            X.0a3Q r0 = r0.getDataSource()
            java.lang.String r1 = r0.LJIL()
        L1f:
            X.01GW<X.0aFK> r0 = X.C927600aFK.LIZIZ
            X.0aFK r0 = X.C307001Gy.LIZ()
            r0.getClass()
            X.0a1R r0 = X.C927600aFK.LJFF()
            if (r0 == 0) goto La1
            boolean r0 = X.C916560ZxW.LIZIZ(r0)
            if (r0 == 0) goto L9f
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            int r0 = X.C921180a4y.LJIIZILJ(r0)
            if (r0 <= 0) goto La1
            r0 = 3
        L3f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r1, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r2)
            r0 = 32
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "DisplayObserver"
            X.C20441214yg.LIZIZ(r0, r1)
            r4 = 0
            if (r2 == 0) goto L7a
            java.lang.Object r0 = r2.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r5.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r1 != r0) goto L7a
        L79:
            return
        L7a:
            kotlin.jvm.functions.Function0<tikcast.linkmic.common.LayoutState> r0 = r6.LIZIZ
            java.lang.Object r0 = r0.invoke()
            tikcast.linkmic.common.LayoutState r0 = (tikcast.linkmic.common.LayoutState) r0
            if (r0 == 0) goto L79
            java.lang.String r2 = r0.layoutId
            if (r2 == 0) goto L79
            java.lang.Class<com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService> r0 = com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService r0 = (com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService) r0
            X.0k15 r1 = r0.y22()
            if (r1 == 0) goto L79
            X.0Zxa r0 = new X.0Zxa
            r0.<init>()
            r1.LJJL(r4, r2, r0, r3)
            return
        L9f:
            r0 = 2
            goto L3f
        La1:
            r0 = 1
            goto L3f
        La3:
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0awC r0 = r0.LLJLL()
            if (r0 == 0) goto Lbf
            X.0aVw r0 = r0.LLIIJLIL()
            if (r0 == 0) goto Lbf
            X.0aVo r0 = r0.LJJJJZ()
            if (r0 == 0) goto Lbf
            java.lang.String r1 = r0.getLayoutId()
            goto L1f
        Lbf:
            r1 = r3
            goto L1f
        Lc2:
            r2 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C916580ZxY.LIZ():void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ZxZ] */
    public C916580ZxY(DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15) {
        this.LIZ = dataChannel;
        this.LIZIZ = awS559S0100000_15;
    }
}
