package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KU1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KU1 extends C0KU3 {
    public static Map LIZJ(User user) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (user == null) {
            return linkedHashMap;
        }
        linkedHashMap.put("user_id", String.valueOf(user.getId()));
        linkedHashMap.put("sec_user_id", user.getSecUid());
        int i2 = 0;
        if (user.getAvatarThumb() != null) {
            linkedHashMap.put("avatar", ListProtector.get(user.getAvatarThumb().getUrls(), 0));
        }
        linkedHashMap.put("nickname", C0KVU.LIZLLL(user));
        if (user.getAnchorInfo() != null) {
            linkedHashMap.put("anchor_level", Long.valueOf(user.getAnchorInfo().level));
        }
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        if (c1095140ebYUw0 != null) {
            i = (int) c1095140ebYUw0.LIZ;
        } else {
            i = 0;
        }
        linkedHashMap.put("fans_level", Integer.valueOf(i));
        if (c1095140ebYUw0 != null && c1095140ebYUw0.LJ == 2) {
            i2 = 1;
        }
        linkedHashMap.put("is_sleeping", Integer.valueOf(i2));
        return linkedHashMap;
    }

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

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c7  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r14, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r15, X.EnumC1063300dmC r16) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KU1.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
