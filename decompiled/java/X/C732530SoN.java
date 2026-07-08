package X;

import Y.ARunnableS80S0200000_11;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732530SoN extends C09AY implements Function2<VideoShareAssem, C291001Au<? extends Pair<? extends EnumC733460Sps, ? extends Object>>, Unit> {
    public C732530SoN() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoShareAssem videoShareAssem, C291001Au<? extends Pair<? extends EnumC733460Sps, ? extends Object>> c291001Au) {
        VideoShareAssem videoShareAssem2 = videoShareAssem;
        C291001Au<? extends Pair<? extends EnumC733460Sps, ? extends Object>> c291001Au2 = c291001Au;
        Context context = videoShareAssem2.getContext();
        if (context == null || !C0SXF.LJIL(context)) {
            C2041907zF.LIZ(videoShareAssem2.getContentView().findViewById(R.id.uz4), new ARunnableS80S0200000_11(videoShareAssem2, c291001Au2, 7));
        }
        return Unit.LIZ;
    }
}
