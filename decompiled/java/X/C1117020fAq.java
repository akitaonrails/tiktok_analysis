package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117020fAq extends AbstractC1117040fAs {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Long lValueOf;
        Long lValueOf2;
        RoomAuthStatus roomAuthStatus;
        boolean z;
        boolean z2;
        User owner;
        User userLIZIZ = C0KXJ.LIZIZ();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (userLIZIZ != null) {
            lValueOf = Long.valueOf(userLIZIZ.getId());
        } else {
            lValueOf = null;
        }
        if (room != null && (owner = room.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        } else {
            lValueOf2 = null;
        }
        boolean zLJFF = Intrinsics.LJFF(lValueOf, lValueOf2);
        if (room != null) {
            roomAuthStatus = room.getRoomAuthStatus();
        } else {
            roomAuthStatus = null;
        }
        boolean z3 = true;
        if (roomAuthStatus != null && room.getRoomAuthStatus().isEnableGift()) {
            z = true;
        } else {
            z = false;
        }
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C1118310fCv.LIZIZ(zLJFF, z2, z) == EnumC1118300fCu.SHOW) {
            z3 = false;
        }
        InterfaceC1117030fAr interfaceC1117030fAr = (InterfaceC1117030fAr) C1909107dp.LIZJ(InterfaceC1117030fAr.class, null);
        interfaceC1117030fAr.setDisabledGift(Boolean.valueOf(z3));
        completionBlock.onSuccess(interfaceC1117030fAr, "");
    }
}
