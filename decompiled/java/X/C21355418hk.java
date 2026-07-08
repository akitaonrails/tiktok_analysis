package X;

import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18hk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21355418hk extends AbstractC21355018hg {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String idStr;
        Boolean boolValueOf;
        InterfaceC21355218hi interfaceC21355218hi = (InterfaceC21355218hi) xBaseParamModel;
        InterfaceC21355118hh interfaceC21355118hh = (InterfaceC21355118hh) C1909107dp.LIZJ(InterfaceC21355118hh.class, null);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        if (!Intrinsics.LJFF(idStr, interfaceC21355218hi.getRoomID())) {
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
            return;
        }
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus != null) {
            boolValueOf = Boolean.valueOf(roomAuthStatus.enableChat);
        } else {
            boolValueOf = Boolean.TRUE;
        }
        interfaceC21355118hh.setChatEnable(boolValueOf);
        completionBlock.onSuccess(interfaceC21355118hh, "");
    }
}
