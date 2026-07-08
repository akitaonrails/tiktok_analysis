package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.social.creation.api.edit.spi.IAlbumSharpImagePreloadService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MOu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C567820MOu {
    public static final C01GW<IAlbumSharpImagePreloadService> LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(475));
    public final boolean LIZ;
    public final String LIZIZ;
    public final C0L23 LIZJ = new C0L23(-1, -1, new Pair(-16777216, -16777216));

    public final C0L23 LIZ(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = 2;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        if (bitmapDecodeFile == null) {
            return this.LIZJ;
        }
        C0L23 c0l23LIZJ = C0L22.LIZJ(bitmapDecodeFile, str);
        bitmapDecodeFile.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
        return c0l23LIZJ;
    }

    public C567820MOu(CreativeInfo creativeInfo, boolean z) {
        this.LIZ = z;
        this.LIZIZ = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIZ(creativeInfo);
    }
}
