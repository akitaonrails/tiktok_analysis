package X;

import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0faD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1132750faD implements InterfaceC1137250fhT {
    public final FrameLayout LIZ;
    public C1135810ff9 LIZIZ;
    public EnumC1136790fgj LIZJ = EnumC1136790fgj.ONE_HOST_MEDIUM_V3;
    public DataChannel LIZLLL;
    public InterfaceC1136920fgw LJ;

    public final boolean LJIIZILJ() {
        C1135810ff9 c1135810ff9;
        User owner;
        User user;
        Boolean bool;
        if (((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).kg2()) {
            return false;
        }
        DataChannel dataChannel = this.LIZLLL;
        boolean zBooleanValue = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) == null) ? false : bool.booleanValue();
        C1135810ff9 c1135810ff92 = this.LIZIZ;
        long id = (c1135810ff92 == null || (user = c1135810ff92.LJJJJZI) == null) ? 0L : user.getId();
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZLLL);
        boolean z = id != 0 && id == ((roomLJJLIIIIJ == null || (owner = roomLJJLIIIIJ.getOwner()) == null) ? 0L : owner.getId());
        if (zBooleanValue && z) {
            return false;
        }
        IInteractService iInteractService = C1128450fTH.LIZ;
        boolean z2 = iInteractService.He2(C1128450fTH.LIZLLL()) && iInteractService.mx1();
        long jQ9 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).q9();
        return zBooleanValue && z2 && ((jQ9 > 0L ? 1 : (jQ9 == 0L ? 0 : -1)) <= 0 || ((c1135810ff9 = this.LIZIZ) != null && (jQ9 > c1135810ff9.LJJJJZ ? 1 : (jQ9 == c1135810ff9.LJJJJZ ? 0 : -1)) == 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ() {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1132750faD.LJIJ():void");
    }

    public final void LJIJI() {
        C1142070fpF.LIZ.getClass();
        IMusicGiftService iMusicGiftServiceLJIILIIL = C1142070fpF.LJIILIIL();
        if (iMusicGiftServiceLJIILIIL != null) {
            iMusicGiftServiceLJIILIIL.HB2(C1142070fpF.LJIIL);
        }
        IMusicGiftService iMusicGiftService = (IMusicGiftService) C1140740fn6.LJIIIIZZ.getValue();
        DataChannel dataChannel = this.LIZLLL;
        C1135810ff9 c1135810ff9 = this.LIZIZ;
        iMusicGiftService.HJ0(new C1147020fxE(c1135810ff9 != null ? c1135810ff9.LJJJJZ : 0L, 0L, 0L, 0L, EnumC1142190fpR.GIFT_TRAY, null, null, 0L, 0, null, 1006), dataChannel);
    }

    public AbstractC1132750faD(FrameLayout frameLayout) {
        this.LIZ = frameLayout;
    }

    @Override // X.InterfaceC1137250fhT
    public final void LJIILIIL(C1137360fhe c1137360fhe) {
        this.LJ = c1137360fhe;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(android.content.Context r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1132750faD.LJIJJ(android.content.Context, java.lang.String):void");
    }
}
