package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0KqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530020KqW {
    public static final String[] LIZLLL = {"_data", "_size", "_display_name", "datetaken", "mime_type", "duration", "width", "height", "orientation"};
    public final Context LIZ;
    public final boolean LIZIZ;
    public final ConcurrentHashMap<String, TikTokMediaModel> LIZJ = new ConcurrentHashMap<>();

    public C530020KqW(Context context, boolean z) {
        this.LIZ = context;
        this.LIZIZ = z;
    }

    public final TikTokMediaModel LIZ(String str, EnumC538220L8y enumC538220L8y) {
        boolean z;
        if ((C302030Bsf.LIZ() || C0CHQ.LIZ().LJJJJIZL().LIZ()) && this.LIZIZ) {
            z = true;
            TikTokMediaModel tikTokMediaModel = this.LIZJ.get(str);
            if (tikTokMediaModel != null && tikTokMediaModel.loadSource == enumC538220L8y) {
                return tikTokMediaModel;
            }
        } else {
            z = false;
        }
        TikTokMediaModel.Companion.getClass();
        TikTokMediaModel tikTokMediaModel2 = new TikTokMediaModel(str, enumC538220L8y, 4);
        if (z) {
            this.LIZJ.put(str, tikTokMediaModel2);
        }
        return tikTokMediaModel2;
    }
}
