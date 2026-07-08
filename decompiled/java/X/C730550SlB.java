package X;

import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730550SlB extends C09AY implements Function2<VideoDiggAssem, Boolean, Unit> {
    public C730550SlB() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoDiggAssem videoDiggAssem, Boolean bool) {
        VideoDiggAssem videoDiggAssem2 = videoDiggAssem;
        if (bool.booleanValue()) {
            videoDiggAssem2.getClass();
            LruCache<String, Drawable> lruCache = C730700SlQ.LIZ;
            videoDiggAssem2.getContentView().findViewById(R.id.ftt).setTag(R.id.v9t, Boolean.FALSE);
            ((C1295960jpS) videoDiggAssem2.getContentView().findViewById(R.id.ftt)).setImageDrawable(videoDiggAssem2.LLLFZ);
        } else {
            ((C1295960jpS) videoDiggAssem2.getContentView().findViewById(R.id.ftt)).setImageDrawable(videoDiggAssem2.LLLFZ);
        }
        return Unit.LIZ;
    }
}
