package X;

import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0KUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518460KUy extends AbstractC518470KUz {
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
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        Boolean boolValueOf = null;
        if (room == null) {
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
            return;
        }
        C0KV0 c0kv0 = (C0KV0) C1909107dp.LIZJ(C0KV0.class, null);
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus != null) {
            boolValueOf = Boolean.valueOf(roomAuthStatus.chatSubOnly);
        }
        c0kv0.setEnable(Boolean.valueOf(C500260Jjc.LJJJI(boolValueOf)));
        completionBlock.onSuccess(c0kv0, "");
    }
}
