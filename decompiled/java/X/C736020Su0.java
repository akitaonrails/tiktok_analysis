package X;

import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Su0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736020Su0 extends C09AY implements Function2<Float, Aweme, Unit> {
    public final /* synthetic */ EdgeSpeedupAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C736020Su0(EdgeSpeedupAssem edgeSpeedupAssem) {
        super(2);
        this.LL = edgeSpeedupAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Float f, Aweme aweme) {
        float fFloatValue = f.floatValue();
        if (Intrinsics.LJFF(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme(), aweme)) {
            if (fFloatValue < 2.0f) {
                C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                if (c19252910Tv.LIZLLL().LJIJI().LLFZ(((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType)) {
                    c19252910Tv.LIZLLL().LJIJI().LLJILJIL(null);
                }
            } else if (fFloatValue == 2.0f) {
                C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLJILJIL(((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType);
            }
        }
        return Unit.LIZ;
    }
}
