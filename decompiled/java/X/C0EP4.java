package X;

import com.ss.android.ugc.aweme.tools.sticker.core.BezierControlPoint;
import com.ss.android.ugc.aweme.tools.sticker.core.KeyframeInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.Frame;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.Keyframe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0EP4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EP4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static final KeyframeInfo LIZIZ(Keyframe keyframe) {
        ?? arrayList;
        BezierControlPoint bezierControlPoint;
        String str = keyframe.type;
        String str2 = keyframe.property;
        List<Frame> list = keyframe.frames;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (Frame frame : list) {
                AbstractC1174304ib abstractC1174304ib = frame.left;
                BezierControlPoint bezierControlPoint2 = null;
                if (abstractC1174304ib instanceof C1174404ic) {
                    bezierControlPoint = ((C1174404ic) abstractC1174304ib).LIZ;
                } else {
                    bezierControlPoint = null;
                }
                AbstractC1174304ib abstractC1174304ib2 = frame.right;
                if (abstractC1174304ib2 instanceof C1174404ic) {
                    bezierControlPoint2 = ((C1174404ic) abstractC1174304ib2).LIZ;
                }
                arrayList.add(new com.ss.android.ugc.aweme.tools.sticker.core.Keyframe(frame.time, frame.value, frame.graphType, bezierControlPoint, bezierControlPoint2));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return new KeyframeInfo(str, str2, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0203  */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r104v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v37, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r43v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r47v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r59v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r62v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r64v0, types: [X.0FTc] */
    /* JADX WARN: Type inference failed for: r66v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r67v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r70v1, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel r103, java.lang.Integer r104, com.ss.android.vesdk.VESize r105, java.lang.String r106, java.lang.String r107, java.lang.String r108, com.bytedance.ies.nle.editor_jni.NLETrackSlot r109, com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.Composite r110, X.C05WK r111, java.lang.String r112, java.util.List r113) {
        /*
            Method dump skipped, instruction units count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EP4.LIZ(com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel, java.lang.Integer, com.ss.android.vesdk.VESize, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.Composite, X.05WK, java.lang.String, java.util.List):void");
    }
}
