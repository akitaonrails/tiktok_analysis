package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0ndY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442340ndY {
    public static final int LIZ() {
        Integer numValueOf = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "upload_video_size_index", true));
        Integer numValueOf2 = Integer.valueOf(InterfaceC1442520ndq.LJIIIZ.uploadVideoSizeIndex());
        if (C1442390ndd.LIZ() || C1442400nde.LIZ()) {
            StringBuilder sb = new StringBuilder("key : upload_video_size_index , byteBenchValue : ");
            sb.append(C1983207pm.LIZ(Integer.class) ? String.valueOf(numValueOf2) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), numValueOf2));
            C1440300naG.LIZ(sb.toString());
            numValueOf = numValueOf2;
        } else {
            StringBuilder sb2 = new StringBuilder("key : upload_video_size_index , libraValue : ");
            sb2.append(C1983207pm.LIZ(Integer.class) ? String.valueOf(numValueOf) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), numValueOf));
            C1440300naG.LIZ(sb2.toString());
        }
        return numValueOf.intValue();
    }
}
