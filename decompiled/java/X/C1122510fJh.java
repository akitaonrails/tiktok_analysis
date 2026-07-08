package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector.HighIntentCommentDetector;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122510fJh extends C09AY implements Function1<Pair<? extends Long, ? extends Boolean>, Unit> {
    public final /* synthetic */ HighIntentCommentDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122510fJh(HighIntentCommentDetector highIntentCommentDetector) {
        super(1);
        this.LL = highIntentCommentDetector;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Long, ? extends Boolean> pair) {
        Long lValueOf;
        Pair<? extends Long, ? extends Boolean> pair2 = pair;
        Room room = this.LL.LLILZ;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        Long first = pair2.getFirst();
        boolean zBooleanValue = pair2.getSecond().booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsAudienceServicePlusIconVisibleChannel show=");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append("  expectedRoomId=");
        sbLIZ.append(first);
        sbLIZ.append(" currentRoomId=");
        sbLIZ.append(lValueOf);
        C20441214yg.LIZIZ("DM_guidance", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(lValueOf, first)) {
            HighIntentCommentDetector highIntentCommentDetector = this.LL;
            highIntentCommentDetector.LLJ = zBooleanValue;
            if (zBooleanValue) {
                highIntentCommentDetector.A1();
            } else {
                C1122420fJY c1122420fJY = highIntentCommentDetector.LLIZ;
                if (c1122420fJY != null) {
                    c1122420fJY.LIZJ();
                }
            }
        }
        return Unit.LIZ;
    }
}
