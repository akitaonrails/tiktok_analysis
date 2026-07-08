package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0ndl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442470ndl {
    public static int LIZ() {
        SettingsManager.LIZLLL().getClass();
        Integer numValueOf = Integer.valueOf(SettingsManager.LJ("high_quality_compile_video_size_index", 99));
        Integer numValueOf2 = Integer.valueOf(InterfaceC1442520ndq.LJIIIZ.hdCompileVideoSizeIndex());
        if (C1442390ndd.LIZ() || C1442400nde.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key : ");
            sbLIZ.append("high_quality_compile_video_size_index");
            sbLIZ.append(" , byteBenchValue : ");
            sbLIZ.append(C1983207pm.LIZ(Integer.class) ? String.valueOf(numValueOf2) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), numValueOf2));
            C1440300naG.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            numValueOf = numValueOf2;
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key : ");
            sbLIZ2.append("high_quality_compile_video_size_index");
            sbLIZ2.append(" , libraValue : ");
            sbLIZ2.append(C1983207pm.LIZ(Integer.class) ? String.valueOf(numValueOf) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), numValueOf));
            C1440300naG.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return numValueOf.intValue();
    }
}
