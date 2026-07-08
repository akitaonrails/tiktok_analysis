package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.SaveLocalHelper;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.WatermarkMetadata;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.io.File;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0nUX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436750nUX {
    public static final ConcurrentHashSet<String> LIZ = new ConcurrentHashSet<>();

    public static WatermarkMetadata LIZ(String str) {
        SaveLocalHelper.LIZ.getClass();
        StringBuilder sbLJFF = SaveLocalHelper.LJFF(str);
        sbLJFF.append(File.separator);
        sbLJFF.append("metadata.json");
        C0VSJ c0vsj = new C0VSJ(sbLJFF.toString());
        if (c0vsj.exists() && c0vsj.isFile()) {
            try {
                return (WatermarkMetadata) C0CHQ.LIZ().getGson().LJII(C09BH.LJI(c0vsj, Charsets.UTF_8), WatermarkMetadata.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parse metadata failed, path=");
                sbLIZ.append(c0vsj.getPath());
                c1437510nVlLJJLIIIJ.LIZ("post_save_local", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        }
        C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("metadata file not exist, path=");
        sbLIZ2.append(c0vsj.getPath());
        c1437510nVlLJJLIIIJ2.LIZ("post_save_local", C2188811AlT.LIZIZ(sbLIZ2));
        return null;
    }
}
