package X;

import android.content.Context;
import com.ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.ss.android.ugc.aweme.sticker.model.CommerceStickerUnlockInfo;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;

/* JADX INFO: renamed from: X.0DZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341410DZz {
    public static boolean LIZ(NewFaceStickerBean newFaceStickerBean) {
        InterfaceC341420Da0 interfaceC341420Da0LIZ;
        if (newFaceStickerBean == null || newFaceStickerBean.id == null || newFaceStickerBean.extra == null) {
            return false;
        }
        InterfaceC341420Da0 interfaceC341420Da0LIZ2 = C04PQ.LIZ();
        if ((interfaceC341420Da0LIZ2 != null && interfaceC341420Da0LIZ2.LIZJ(newFaceStickerBean.id)) || newFaceStickerBean.commerceSticker == null || (interfaceC341420Da0LIZ = C04PQ.LIZ()) == null || !interfaceC341420Da0LIZ.isScanUnLockType(newFaceStickerBean.extra)) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(Context context, NewFaceStickerBean newFaceStickerBean) {
        CommerceSticker commerceSticker;
        CommerceStickerUnlockInfo commerceStickerUnlockInfo;
        Boolean boolValueOf;
        InterfaceC341420Da0 interfaceC341420Da0LIZ;
        if (context == null || newFaceStickerBean == null) {
            return;
        }
        InterfaceC341420Da0 interfaceC341420Da0LIZ2 = C04PQ.LIZ();
        if ((interfaceC341420Da0LIZ2 != null && interfaceC341420Da0LIZ2.LIZJ(newFaceStickerBean.id)) || !LIZ(newFaceStickerBean) || (commerceSticker = newFaceStickerBean.commerceSticker) == null || (commerceStickerUnlockInfo = commerceSticker.getCommerceStickerUnlockInfo()) == null) {
            return;
        }
        InterfaceC341420Da0 interfaceC341420Da0LIZ3 = C04PQ.LIZ();
        if (interfaceC341420Da0LIZ3 != null && interfaceC341420Da0LIZ3.LIZIZ(commerceStickerUnlockInfo.openUrl)) {
            return;
        }
        String str = commerceStickerUnlockInfo.webUrl;
        String str2 = commerceStickerUnlockInfo.openUrl;
        InterfaceC341420Da0 interfaceC341420Da0LIZ4 = C04PQ.LIZ();
        if (interfaceC341420Da0LIZ4 != null) {
            boolValueOf = Boolean.valueOf(interfaceC341420Da0LIZ4.LIZ(context, str2));
        } else {
            boolValueOf = null;
        }
        if (!boolValueOf.booleanValue() && (interfaceC341420Da0LIZ = C04PQ.LIZ()) != null) {
            interfaceC341420Da0LIZ.LJ(context, str);
        }
    }
}
