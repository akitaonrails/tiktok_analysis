package X;

import java.util.List;

/* JADX INFO: renamed from: X.0bIA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C967800bIA implements InterfaceC2231121CUc {
    public final InterfaceC2181441AZa LL;
    public final List<InterfaceC968220bIq> LLILLJJLI;
    public final String LLILLL;

    @Override // X.InterfaceC2231121CUc
    public final void LJLI(long j) {
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJZI() {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "onReceivedFirstFrameSetChanged", null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LL() {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "onWillSendJoinChannelRequest ", null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLII() {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "onWillKickoutSelf", null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLIIJLIL() {
        C1AZW.LIZIZ(this.LL, this.LLILLL, "on onLinkerWillEndLinkMic: ", null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLIIIL(boolean z) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on onAnchorVideoMuteDidChangedWhenResumeLive... isVideoMute: ");
        sbLIZ.append(z);
        C1AZW.LIZIZ(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLJJLL(long j) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onListChange ");
        sbLIZ.append(j);
        C1AZW.LIZIZ(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLJL(List<C967180bHA> list) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkedListDidChanged: ");
        sbLIZ.append(list);
        C1AZW.LJIIIZ(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJZL(long j) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onListChange ");
        sbLIZ.append(j);
        C1AZW.LIZIZ(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLFII(C964420bCi c964420bCi) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSelfUserWillLeaveGroup, reason: ");
        sbLIZ.append(c964420bCi);
        C1AZW.LJIIIZ(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLIIIJ(String str) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on onLayoutStateChanged. new LayoutId: ");
        sbLIZ.append(str);
        C1AZW.LIZIZ(interfaceC2181441AZa, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    public C967800bIA(C965350bED c965350bED, List list) {
        String strLIZJ;
        this.LL = c965350bED;
        this.LLILLJJLI = list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((c965350bED == null || (strLIZJ = C965350bED.LIZJ(c965350bED.LIZ.LIZIZ)) == null) ? "LinkMicSDK" : strLIZJ);
        sbLIZ.append("LinkerEvent[Biz]");
        this.LLILLL = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJL(long j, boolean z) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSelfWillJoinRtcChannel ");
        sbLIZ.append(j);
        sbLIZ.append(", preJoin: ");
        sbLIZ.append(z);
        C1AZW.LIZIZ(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLIIL(String str, byte[] bArr) {
        Integer numValueOf;
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on onAvatarStateChanged... \n [");
        sbLIZ.append(str);
        sbLIZ.append("], byte: \n ");
        if (bArr != null) {
            numValueOf = Integer.valueOf(bArr.length);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1AZW.LIZIZ(interfaceC2181441AZa, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLILLLLZI(String str, byte[] bArr) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on onLinkMicPerception: ");
        sbLIZ.append(str);
        C1AZW.LIZIZ(interfaceC2181441AZa, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLJI(C1CXK c1cxk, String str) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserDidLeaveChannel rtcConnectionState[");
        sbLIZ.append(c1cxk);
        sbLIZ.append("], linkMicId[");
        sbLIZ.append(str);
        sbLIZ.append(']');
        C1AZW.LIZIZ(interfaceC2181441AZa, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLJLJ(String str, String str2) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str3 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on onFirstFrameRenderCallback[");
        sbLIZ.append(str);
        sbLIZ.append("] -> (");
        sbLIZ.append(str2);
        sbLIZ.append(")...");
        C1AZW.LIZIZ(interfaceC2181441AZa, str3, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLJLLL(long j, String str) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserDidLeaveChannel uid[");
        sbLIZ.append(j);
        sbLIZ.append("], linkMicId[");
        sbLIZ.append(str);
        sbLIZ.append(']');
        C1AZW.LIZIZ(interfaceC2181441AZa, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLLLL(long j, C966980bGq c966980bGq) {
        if (c966980bGq != null) {
            InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
            String str = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on onChangeStateResult... changeState[");
            sbLIZ.append(j);
            sbLIZ.append("], error: ");
            sbLIZ.append(c966980bGq);
            C1AZW.LJIILLIIL(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
            return;
        }
        InterfaceC2181441AZa interfaceC2181441AZa2 = this.LL;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("on onChangeStateResult... changeState[");
        sbLIZ2.append(j);
        sbLIZ2.append(']');
        C1AZW.LIZIZ(interfaceC2181441AZa2, str2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLFF(EnumC2231171CUh enumC2231171CUh, byte[] bArr) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCompensateImSucceed[");
        sbLIZ.append(enumC2231171CUh);
        sbLIZ.append("]..");
        C1AZW.LIZIZ(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLIFFJFJJ(long j, C966980bGq c966980bGq) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on onJoinChannelRequestFailed...[");
        sbLIZ.append(j);
        sbLIZ.append("], ");
        sbLIZ.append(c966980bGq);
        C1AZW.LJIILLIIL(interfaceC2181441AZa, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LLIIJI(C1CX5 c1cx5, String str) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str2 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on onNetworkQualityChanged...\n [");
        sbLIZ.append(str);
        sbLIZ.append("], networkQuality: \n ");
        sbLIZ.append(c1cx5);
        C1AZW.LIZIZ(interfaceC2181441AZa, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC2231121CUc
    public final void LJLLLLLL(long j, String str, String str2) {
        InterfaceC2181441AZa interfaceC2181441AZa = this.LL;
        String str3 = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserWillLeaveChannel uid[");
        sbLIZ.append(j);
        sbLIZ.append("], linkMicId[");
        sbLIZ.append(str);
        sbLIZ.append("], reason: ");
        sbLIZ.append(str2);
        C1AZW.LIZIZ(interfaceC2181441AZa, str3, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }
}
