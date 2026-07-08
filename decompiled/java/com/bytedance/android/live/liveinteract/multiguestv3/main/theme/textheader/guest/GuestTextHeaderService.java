package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.guest;

import X.InterfaceC927080aEU;
import X.InterfaceC948500an2;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC948500an2(name = "GUEST_TEXT_HEADER")
public final class GuestTextHeaderService implements InterfaceC927080aEU {
    public static final /* synthetic */ int LIZLLL = 0;
    public final DataChannel LIZIZ;
    public final GuestTextHeaderViewModel LIZJ;

    @Override // X.InterfaceC930300aJg
    public final boolean isRunning() {
        GuestTextHeaderViewModel guestTextHeaderViewModel = this.LIZJ;
        if (guestTextHeaderViewModel != null) {
            return guestTextHeaderViewModel.DQ2();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    @Override // X.InterfaceC927080aEU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.livesdk.sei.SeiAppData r14) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.guest.GuestTextHeaderService.LIZ(com.bytedance.android.livesdk.sei.SeiAppData):void");
    }

    public GuestTextHeaderService(DataChannel dataChannel, GuestTextHeaderViewModel guestTextHeaderViewModel) {
        this.LIZIZ = dataChannel;
        this.LIZJ = guestTextHeaderViewModel;
    }
}
