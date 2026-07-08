package X;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS295S0300000_17;

/* JADX INFO: renamed from: X.0fDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1118790fDh extends C2217421BqW implements Function1<C1118840fDm, Unit> {
    public C1118790fDh(C1085590eM9 c1085590eM9) {
        super(1, c1085590eM9, C1085590eM9.class, "handleSmallFlyMicGiftStartEvent", "handleSmallFlyMicGiftStartEvent(Lcom/bytedance/android/live/linkmic/FlyMicGiftAnimaInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1118840fDm c1118840fDm) {
        Integer num;
        C1126540fQC c1126540fQC;
        C1118840fDm c1118840fDm2 = c1118840fDm;
        C1085590eM9 c1085590eM9 = (C1085590eM9) this.receiver;
        c1085590eM9.getClass();
        boolean z = true;
        if (!C924810aAp.LJ().LJJJJI.equals("grid_fix") && !C924810aAp.LJ().LJJJJI.equals("float_fix") && ((!C924810aAp.LJ().LJJJJI.equals("grid") && !C924810aAp.LJ().LJJJJI.equals("float")) || C924810aAp.LJ().LJJII < 1)) {
            z = false;
        }
        if (!z) {
            C1118780fDg.LIZIZ(new C1118840fDm(c1118840fDm2.LIZ, new Pair(new Point(0, 0), new Point(0, 0)), 2, 0L, 8), 5, 2, 2, false);
            C20441214yg.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "layout condition is invalid, so return");
        } else {
            long j = c1118840fDm2.LIZ.LJ;
            Map map = (Map) c1085590eM9.LIZ.gg0(C750330Tbz.class);
            if (map != null && (num = (Integer) map.get(Long.valueOf(j))) != null) {
                int iIntValue = (int) (num.intValue() * 1.2f);
                int i = iIntValue / 2;
                float f = c1118840fDm2.LIZIZ.getFirst().x - i;
                float f2 = c1118840fDm2.LIZIZ.getFirst().y - i;
                if (c1085590eM9.LJFF == null) {
                    c1085590eM9.LJFF = new C1085630eMD<>();
                }
                C1085630eMD<C1126540fQC> c1085630eMD = c1085590eM9.LJFF;
                if (c1085630eMD == null || (c1126540fQC = c1085630eMD.LIZIZ()) == null) {
                    c1126540fQC = new C1126540fQC(c1085590eM9.LIZJ);
                    c1126540fQC.setId(R.id.vly);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iIntValue, iIntValue);
                    layoutParams.gravity = 17;
                    C786410Ut5.t6(c1126540fQC, layoutParams);
                    float f3 = c1118840fDm2.LIZIZ.getFirst().x - i;
                    float f4 = c1118840fDm2.LIZIZ.getFirst().y - i;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("raw startX is ");
                    sbLIZ.append(c1118840fDm2.LIZIZ.getFirst().x);
                    sbLIZ.append(", raw startY is ");
                    sbLIZ.append(c1118840fDm2.LIZIZ.getFirst().y);
                    sbLIZ.append(",containerSize is ");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append(", realStartX is ");
                    sbLIZ.append(f3);
                    sbLIZ.append(", realStartY is");
                    sbLIZ.append(f4);
                    C20441214yg.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", C2188811AlT.LIZIZ(sbLIZ));
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126540fQC);
                    c1126540fQC.setX(f3);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126540fQC);
                    c1126540fQC.setY(f4);
                }
                ViewGroup viewGroup = c1085590eM9.LIZIZ;
                if (viewGroup != null) {
                    viewGroup.addView(c1126540fQC);
                }
                Context context = c1085590eM9.LIZJ;
                if (context != null) {
                    C1118780fDg.LIZ(c1126540fQC, context, c1118840fDm2.LIZ.LJIIJ, new C1118800fDi(c1085590eM9, c1126540fQC, c1118840fDm2, f, f2), new AwS295S0300000_17(c1085590eM9, c1126540fQC, c1118840fDm2, 3));
                }
            } else {
                C1118780fDg.LIZIZ(c1118840fDm2, 7, c1118840fDm2.LIZJ, 2, false);
                C20441214yg.LJ("LiveLinkMicGiftFlyAnimationHelper", "return for originSize is null");
            }
        }
        return Unit.LIZ;
    }
}
