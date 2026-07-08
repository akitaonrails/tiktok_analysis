package X;

import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Stx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735990Stx extends C09AY implements Function2<EdgeSpeedupAssem, C291001Au<? extends String>, Unit> {
    public C735990Stx() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EdgeSpeedupAssem edgeSpeedupAssem, C291001Au<? extends String> c291001Au) {
        Object obj;
        Object obj2;
        Object obj3;
        C736060Su4 c736060Su4Fp;
        Object obj4;
        EdgeSpeedupAssem edgeSpeedupAssem2 = edgeSpeedupAssem;
        C291001Au<? extends String> c291001Au2 = c291001Au;
        if (c291001Au2 != null && c291001Au2.LIZ != 0) {
            edgeSpeedupAssem2.LLLIILIL = true;
            if (C300710BqX.LIZ() && (c736060Su4Fp = edgeSpeedupAssem2.Fp()) != null) {
                C724270Sb3 c724270Sb3 = edgeSpeedupAssem2.LLJI;
                if (c724270Sb3 != null) {
                    obj4 = c724270Sb3.LL;
                } else {
                    obj4 = null;
                }
                if (c736060Su4Fp.LIZ(System.identityHashCode(((VideoItemParams) obj4).getAweme()))) {
                    edgeSpeedupAssem2.Gp();
                }
            }
            InterfaceC1616480sAQ interfaceC1616480sAQLJIJI = C19252910Tv.LIZIZ.LIZLLL().LJIJI();
            C724270Sb3 c724270Sb32 = edgeSpeedupAssem2.LLJI;
            if (c724270Sb32 != null) {
                obj = c724270Sb32.LL;
            } else {
                obj = null;
            }
            if (interfaceC1616480sAQLJIJI.LLFZ(((VideoItemParams) obj).mEventType) && edgeSpeedupAssem2.Bp()) {
                C589960NBy c589960NBy = C589960NBy.LIZ;
                C724270Sb3 c724270Sb33 = edgeSpeedupAssem2.LLJI;
                if (c724270Sb33 != null) {
                    obj2 = c724270Sb33.LL;
                } else {
                    obj2 = null;
                }
                String str = ((VideoItemParams) obj2).mEventType;
                C724270Sb3 c724270Sb34 = edgeSpeedupAssem2.LLJI;
                if (c724270Sb34 != null) {
                    obj3 = c724270Sb34.LL;
                } else {
                    obj3 = null;
                }
                Aweme aweme = ((VideoItemParams) obj3).getAweme();
                c589960NBy.getClass();
                C589960NBy.LJ(2.0f, aweme, str, null);
            }
        }
        return Unit.LIZ;
    }
}
