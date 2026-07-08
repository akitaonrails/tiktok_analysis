package X;

import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444150HbJ implements InterfaceC1891350zJl {
    public final InterfaceC444050Hb9 LL;

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C444150HbJ) && Intrinsics.LJFF(this.LL, ((C444150HbJ) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BasicSetStickerPageItem(emojiType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C444150HbJ(InterfaceC444050Hb9 interfaceC444050Hb9) {
        this.LL = interfaceC444050Hb9;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C444150HbJ c444150HbJ;
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        Long lLIZIZ = c454640HsE.LIZIZ().getImStickerInputPanelService().LIZIZ(this.LL);
        InterfaceC453710Hqj imStickerInputPanelService = c454640HsE.LIZIZ().getImStickerInputPanelService();
        InterfaceC444050Hb9 interfaceC444050Hb9 = null;
        if ((interfaceC1891350zJl instanceof C444150HbJ) && (c444150HbJ = (C444150HbJ) interfaceC1891350zJl) != null) {
            interfaceC444050Hb9 = c444150HbJ.LL;
        }
        return Intrinsics.LJFF(lLIZIZ, imStickerInputPanelService.LIZIZ(interfaceC444050Hb9));
    }
}
