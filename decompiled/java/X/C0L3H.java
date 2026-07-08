package X;

import Y.ARunnableS77S0200000_8;
import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS291S0000000_8;

/* JADX INFO: renamed from: X.0L3H, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L3H extends C535980L0i {
    public final WeakReference<Activity> LLILZLL;

    public C0L3H(C19EG c19eg) {
        super(c19eg, null);
        this.LLILZLL = new WeakReference<>(c19eg);
    }

    @Override // X.C535980L0i
    public final void LJ(final int i, final int i2, final Intent intent, final ShortVideoContext shortVideoContext, final ArrayList<MediaModel> arrayList, final int i3) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0L3G
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OnThisDayPhotoMvChosenResultImpl@f2ca.onChosenResultAfterShowDialog$1");
                try {
                    C0MKJ c0mkj = C0MKJ.LIZ;
                    final ShortVideoContext shortVideoContext2 = shortVideoContext;
                    CreativeInfo creativeInfo = shortVideoContext2.creativeInfo;
                    final ArrayList<MediaModel> arrayList2 = arrayList;
                    final long j = jCurrentTimeMillis;
                    final C0L3H c0l3h = this;
                    final int i4 = i;
                    final int i5 = i2;
                    final Intent intent2 = intent;
                    final int i6 = i3;
                    Function2<Long, Long, Unit> function2 = new Function2<Long, Long, Unit>() { // from class: X.0L3F
                        @Override // kotlin.jvm.functions.Function2
                        public final Unit invoke(Long l, Long l2) {
                            long jLongValue = l.longValue();
                            l2.longValue();
                            if (jLongValue <= 0) {
                                C0MKJ c0mkj2 = C0MKJ.LIZ;
                                ArrayList<MediaModel> arrayList3 = arrayList2;
                                long j2 = j;
                                c0mkj2.getClass();
                                if (!C0MKJ.LIZLLL(j2, arrayList3)) {
                                    C0L3H c0l3h2 = c0l3h;
                                    Activity activity = c0l3h2.LLILZLL.get();
                                    if (activity != null) {
                                        activity.runOnUiThread(new ARunnableS77S0200000_8(c0l3h2, activity, 35));
                                    }
                                } else {
                                    C0ML7 c0ml7 = C0ML7.LIZ;
                                    CreativeModel creativeModel = shortVideoContext2.creativeModel;
                                    ArrayList<MediaModel> arrayList4 = arrayList2;
                                    AFwS291S0000000_8 aFwS291S0000000_8 = AFwS291S0000000_8.get$arr$(33);
                                    c0ml7.getClass();
                                    C0ML7.LJIIIIZZ(creativeModel, arrayList4, aFwS291S0000000_8);
                                    C01TT.LIZLLL(new C0L3I(c0l3h, i4, i5, intent2, shortVideoContext2, arrayList2, i6));
                                }
                            }
                            return Unit.LIZ;
                        }
                    };
                    c0mkj.getClass();
                    C0MKJ.LJIIJJI(creativeInfo, arrayList2, function2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OnThisDayPhotoMvChosenResultImpl@f2ca.onChosenResultAfterShowDialog$1");
            }
        });
    }
}
