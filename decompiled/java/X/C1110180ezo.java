package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ezo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110180ezo implements InterfaceC1115480f8M<EmoteModel> {
    public final DataChannel LL;
    public final InterfaceC1114330f6V LLILLJJLI;
    public final InterfaceC1095590ecH LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public List<? extends EmoteModel> LLJI;
    public List<? extends EmoteModel> LLJIJIL;
    public String LLJILJIL;

    @Override // X.InterfaceC1115480f8M
    public final void LLLLJI(C1115500f8O c1115500f8O) {
        EmoteModel emoteModel = (EmoteModel) c1115500f8O;
        if (emoteModel != null) {
            int i = emoteModel.emoteScene;
            if (i == 2) {
                if (this.LLILZIL || (this.LLILZLL && this.LLIZ)) {
                    LIZ(emoteModel, "fan_club");
                    this.LLILLJJLI.LIZLLL(emoteModel);
                    return;
                }
                return;
            }
            if (i != 3 || !this.LLIZLLLIL) {
                return;
            }
            if (!this.LLILZIL && !this.LLJ) {
                return;
            }
            LIZ(emoteModel, "super_fan");
            this.LLILLJJLI.LIZLLL(emoteModel);
        }
    }

    public final void LIZ(EmoteModel emoteModel, String str) {
        String str2;
        if (emoteModel != null) {
            int i = emoteModel.emoteScene;
            if (i != 2 && i != 3) {
                return;
            }
            DataChannel dataChannel = this.LL;
            String str3 = this.LLJILJIL;
            if (emoteModel == null || (str2 = emoteModel.emoteId) == null) {
                str2 = "";
            }
            C498500Jgm.LIZLLL(dataChannel, str3, "sticker", str2, new ArrayList(this.LLJIJIL), new ArrayList(this.LLJI), str);
        }
    }

    public final void LIZIZ(String str, String str2) {
        C498500Jgm.LIZLLL(this.LL, this.LLJILJIL, str, "", new ArrayList(this.LLJIJIL), new ArrayList(this.LLJI), str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1110180ezo(com.bytedance.ies.sdk.datachannel.DataChannel r4, X.C1114310f6T r5, X.C1114300f6S r6) {
        /*
            r3 = this;
            r3.<init>()
            r3.LL = r4
            r3.LLILLJJLI = r5
            r3.LLILLL = r6
            boolean r0 = X.C500260Jjc.LJJIJL(r4)
            r3.LLILZ = r0
            boolean r2 = X.C500260Jjc.LJIIZILJ(r4)
            r3.LLILZIL = r2
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C500260Jjc.LJJLIIIIJ(r4)
            boolean r0 = X.C518190KTx.LIZIZ(r2, r0)
            r3.LLILZLL = r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C500260Jjc.LJJLIIIIJ(r4)
            r1 = 1
            if (r2 != 0) goto L77
            if (r0 == 0) goto L2b
            r0.getOwner()
        L2b:
            java.lang.Class<com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService> r0 = com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService r0 = (com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService) r0
            if (r0 == 0) goto L77
            X.0ebY r0 = r0.uw0()
            if (r0 == 0) goto L77
            int r0 = r0.LJ
            if (r0 != r1) goto L77
            r0 = 1
        L40:
            r3.LLIZ = r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C500260Jjc.LJJLIIIIJ(r4)
            if (r0 == 0) goto L75
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto L75
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L75
            boolean r0 = r0.isAnchorQualified()
            if (r0 != r1) goto L75
        L5a:
            r3.LLIZLLLIL = r1
            java.lang.Class<com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService> r0 = com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService r0 = (com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService) r0
            boolean r0 = r0.wd2()
            r3.LLJ = r0
            X.13BV r0 = X.C13BV.INSTANCE
            r3.LLJI = r0
            r3.LLJIJIL = r0
            java.lang.String r0 = ""
            r3.LLJILJIL = r0
            return
        L75:
            r1 = 0
            goto L5a
        L77:
            r0 = 0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1110180ezo.<init>(com.bytedance.ies.sdk.datachannel.DataChannel, X.0f6T, X.0f6S):void");
    }
}
