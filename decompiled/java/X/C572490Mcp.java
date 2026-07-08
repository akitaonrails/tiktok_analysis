package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.ICommentInlineBannerReadyListener;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0Mcp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572490Mcp {
    public static final C572490Mcp LIZ = new C572490Mcp();
    public static final ConcurrentHashMap<String, C572500Mcq> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C09AE> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<ICommentInlineBannerReadyListener>> LIZLLL = new ConcurrentHashMap<>();

    public static void LIZ(Context context, C572500Mcq c572500Mcq, Bundle bundle) {
        C572250McR.LIZ(c572500Mcq.LIZ.LIZIZ.creativeModel.text2ImageModel, bundle);
        C572350Mcb c572350Mcb = C572350Mcb.LIZ;
        VideoPublishEditModel videoPublishEditModel = c572500Mcq.LIZ.LIZIZ;
        c572350Mcb.getClass();
        if (videoPublishEditModel != null) {
            C0CHQ.LIZ().getPublishService().LJJJLL();
            C1431870nMf.LJIIIIZZ(videoPublishEditModel);
        }
        C572410Mch c572410Mch = c572500Mcq.LIZ;
        C572350Mcb.LJII(context, c572410Mch.LIZIZ, c572410Mch.LIZJ, c572500Mcq.LIZIZ, null);
    }
}
