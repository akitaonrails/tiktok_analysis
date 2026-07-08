package X;

import com.bytedance.android.live.effect.model.Area;
import com.bytedance.android.live.effect.model.Canvas;
import com.bytedance.android.live.effect.model.StreamSize;
import com.bytedance.android.live.effect.model.VideoSize;

/* JADX INFO: renamed from: X.0UFQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UFQ implements C0UAE {
    public static VideoSize LIZIZ;
    public static StreamSize LIZJ;
    public static Area LJII;
    public static final C0UFQ LIZ = new C0UFQ();
    public static int LIZLLL = C497740JfY.LJIIZILJ();
    public static int LJ = C497740JfY.LJIILLIIL();
    public static int LJFF = (int) C497740JfY.LIZIZ(347.0f);
    public static Area LJI = new Area(163, 302, 0, 0);

    static {
        Integer numLIZIZ = InterfaceC772190UQv.X3.LIZIZ();
        LJII = new Area(216, null, 0, (numLIZIZ == null || numLIZIZ.intValue() != C0UFR.VERTICAL.getValue()) ? 0 : 135);
    }

    public static final VideoSize LIZ() {
        int i;
        int i2;
        StreamSize streamSize = LIZJ;
        if (streamSize == null) {
            return null;
        }
        int i3 = streamSize.surfaceWidth;
        int i4 = streamSize.surfaceHeight;
        float f = i3;
        float f2 = i4;
        float f3 = f / f2;
        int i5 = streamSize.videoWidth;
        int i6 = streamSize.videoHeight;
        float f4 = i5 / i6;
        if (f3 > f4) {
            i2 = (int) (f / f4);
            i = i3;
        } else {
            i = (int) (f2 * f4);
            i2 = i4;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceWidth:");
        sbLIZ.append(i3);
        sbLIZ.append(",videoWidth:");
        sbLIZ.append(i5);
        sbLIZ.append(",realWidth:");
        sbLIZ.append(i);
        sbLIZ.append(",surfaceHeight:");
        sbLIZ.append(i4);
        sbLIZ.append(",videoHeight:");
        sbLIZ.append(i6);
        sbLIZ.append(",realHeight:");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("LiveGoalEffect", C2188811AlT.LIZIZ(sbLIZ));
        return new VideoSize(i, i3, i2, i4, true);
    }

    public static Canvas LIZIZ() {
        VideoSize videoSize = LIZIZ;
        int iLJJI = (int) C497740JfY.LJJI(videoSize != null ? videoSize.realWidth : 720);
        VideoSize videoSize2 = LIZIZ;
        return new Canvas(iLJJI, (int) C497740JfY.LJJI(videoSize2 != null ? videoSize2.realHeight : 1280));
    }

    public static int LIZJ() {
        VideoSize videoSize = LIZIZ;
        if (videoSize != null) {
            return (int) C497740JfY.LJJI((videoSize.realHeight - videoSize.surfaceHeight) - ((int) ((C500260Jjc.LJJIJLIJ() ? 0 : C497740JfY.LJIJ()) * (videoSize.surfaceHeight / C497740JfY.LJIILLIIL()))));
        }
        return 0;
    }

    public static Area LIZLLL() {
        Area area = new Area(LJII.top + LIZJ(), null, LJII.left + LJII(), LJII.right + LJII());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fullScreenArea: ");
        sbLIZ.append(area);
        C20441214yg.LIZIZ("LiveGoalEffect", C2188811AlT.LIZIZ(sbLIZ));
        Area area2 = new Area((int) (LJII.top * LJFF()), null, (int) (LJII.left * LJI()), (int) (LJII.right * LJI()));
        Area area3 = new Area(area2.top + LIZJ(), null, area2.left + LJII(), area2.right + LJII());
        VideoSize videoSize = LIZIZ;
        return (videoSize == null || !videoSize.isFullScreen) ? area3 : area;
    }

    public static Area LJ() {
        int iLIZJ = LJI.top + LIZJ();
        Integer num = LJI.bottom;
        Area area = new Area(iLIZJ, Integer.valueOf(num != null ? num.intValue() : 0), LJI.left + LJII(), LJI.right + LJII());
        Area area2 = new Area((int) (LJI.top * LJFF()), Integer.valueOf((int) ((LJI.bottom != null ? r0.intValue() : 0) * LJFF())), (int) (LJI.left * LJI()), (int) (LJI.right * LJI()));
        int iLIZJ2 = area2.top + LIZJ();
        Integer num2 = area2.bottom;
        Area area3 = new Area(iLIZJ2, Integer.valueOf(num2 != null ? num2.intValue() : 0), area2.left + LJII(), area2.right + LJII());
        VideoSize videoSize = LIZIZ;
        return (videoSize == null || !videoSize.isFullScreen) ? area3 : area;
    }

    public static float LJFF() {
        VideoSize videoSize;
        float f = LJ;
        if (f <= 0.0f || (videoSize = LIZIZ) == null) {
            return 1.0f;
        }
        return videoSize.surfaceHeight / f;
    }

    public static float LJI() {
        VideoSize videoSize;
        float f = LIZLLL;
        if (f <= 0.0f || (videoSize = LIZIZ) == null) {
            return 1.0f;
        }
        return videoSize.surfaceWidth / f;
    }

    public static int LJII() {
        VideoSize videoSize = LIZIZ;
        if (videoSize != null) {
            return (int) C497740JfY.LJJI((videoSize.realWidth - videoSize.surfaceWidth) / 2);
        }
        return 0;
    }
}
