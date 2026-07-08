package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0ne6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442680ne6 {
    public static int LIZ() {
        Integer numValueOf = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "tool_photo_to_video_resolution_strategy", true));
        Integer numValueOf2 = Integer.valueOf(InterfaceC1442770neF.LJII.mvDynamicResolutionStrategy());
        if (C1442400nde.LIZ()) {
            StringBuilder sb = new StringBuilder("key : tool_photo_to_video_resolution_strategy , byteBenchValue : ");
            sb.append(C1983207pm.LIZ(Integer.class) ? String.valueOf(numValueOf2) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), numValueOf2));
            C1440300naG.LIZ(sb.toString());
            numValueOf = numValueOf2;
        } else {
            StringBuilder sb2 = new StringBuilder("key : tool_photo_to_video_resolution_strategy , libraValue : ");
            sb2.append(C1983207pm.LIZ(Integer.class) ? String.valueOf(numValueOf) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), numValueOf));
            C1440300naG.LIZ(sb2.toString());
        }
        return numValueOf.intValue();
    }
}
