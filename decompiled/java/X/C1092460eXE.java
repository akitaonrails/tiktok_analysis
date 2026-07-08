package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveFollowBigWordModeOptEnableSetting;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;

/* JADX INFO: renamed from: X.0eXE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092460eXE {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(C1324720kZq c1324720kZq, View view) {
        if (c1324720kZq != null && view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr[0] + ((view.getWidth() + 1) / 2), iArr[1] + ((view.getHeight() + 1) / 2)};
            int[] iArr3 = new int[2];
            c1324720kZq.getLocationOnScreen(iArr3);
            int[] iArr4 = {iArr3[0] + ((c1324720kZq.getWidth() + 1) / 2), iArr3[1] + ((c1324720kZq.getHeight() + 1) / 2)};
            C786410Ut5.Fd(c1324720kZq, (c1324720kZq.getX() + iArr2[0]) - iArr4[0]);
            C786410Ut5.Ld(c1324720kZq, (c1324720kZq.getY() + iArr2[1]) - iArr4[1]);
            c1324720kZq.requestLayout();
        }
    }

    public static final Bitmap LIZJ(Context context, View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setDensity(context.getResources().getDisplayMetrics().densityDpi);
        if (view.getDrawingCacheBackgroundColor() != 0) {
            bitmapCreateBitmap.eraseColor(view.getDrawingCacheBackgroundColor());
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        C842150X1x.LIZIZ(canvas, view);
        return bitmapCreateBitmap;
    }

    public static final void LIZLLL(boolean z, boolean z2, ViewGroup viewGroup) {
        if (!z && !((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1() && !((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1()) {
            if (!z2) {
                if ((!C011Z.LIZ.LJJII() || !LiveFollowBigWordModeOptEnableSetting.INSTANCE.enable()) && viewGroup != null) {
                    viewGroup.setMinimumWidth((int) C497740JfY.LIZIZ(LiveRoomUserInfoWidget.W));
                    return;
                }
                return;
            }
            if (viewGroup == null) {
                return;
            }
            viewGroup.setMinimumWidth(0);
        }
    }

    public static final View LIZIZ(View view, View view2, View view3, View view4) {
        if (view != null && view.getVisibility() == 0) {
            return view;
        }
        if (view2 != null && view2.getVisibility() == 0) {
            return view2;
        }
        if (view3 != null && view3.getVisibility() == 0) {
            return view3;
        }
        if (view4 != null && view4.getVisibility() == 0) {
            return view4;
        }
        return null;
    }
}
