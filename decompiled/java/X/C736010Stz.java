package X;

import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Stz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736010Stz extends C09AY implements Function2<EdgeSpeedupAssem, C291001Au<? extends Integer>, Unit> {
    public C736010Stz() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EdgeSpeedupAssem edgeSpeedupAssem, C291001Au<? extends Integer> c291001Au) {
        Object obj;
        Object obj2;
        EdgeSpeedupAssem edgeSpeedupAssem2 = edgeSpeedupAssem;
        C291001Au<? extends Integer> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            ((Number) c291001Au2.LIZ).intValue();
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            if (c19252910Tv.LIZLLL().LJIJI().LL() && edgeSpeedupAssem2.Bp()) {
                c19252910Tv.LIZLLL().LJIJI().LLJILJIL(null);
                C589960NBy c589960NBy = C589960NBy.LIZ;
                C724270Sb3 c724270Sb3 = edgeSpeedupAssem2.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                String str = ((VideoItemParams) obj).mEventType;
                C724270Sb3 c724270Sb32 = edgeSpeedupAssem2.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                Aweme aweme = ((VideoItemParams) obj2).getAweme();
                c589960NBy.getClass();
                C589960NBy.LJ(1.0f, aweme, str, null);
            }
        }
        return Unit.LIZ;
    }
}
