package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15UU, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15UU {
    public static final C15UU LIZ = new C15UU();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            com.ss.android.ugc.aweme.feed.model.Video r0 = r4.getVideo()
            if (r0 == 0) goto L78
            int r0 = r0.getWidth()
            if (r0 != 0) goto L78
            r0 = 1
        Ld:
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L1d
            com.ss.android.ugc.aweme.feed.model.Video r0 = r4.getVideo()
            if (r0 == 0) goto L5f
            int r0 = r0.getHeight()
            if (r0 != 0) goto L5f
        L1d:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r4.getVideo()
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getCover()
            if (r2 == 0) goto L76
            int r0 = r2.getHeight()
            float r1 = (float) r0
            float r1 = r1 * r3
            int r0 = r2.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
        L39:
            r3 = 1068149419(0x3faaaaab, float:1.3333334)
            if (r0 == 0) goto L5b
            float r2 = r0.floatValue()
        L42:
            float r1 = java.lang.Math.abs(r2)
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L50
            r2 = 1068149419(0x3faaaaab, float:1.3333334)
        L50:
            r0 = 1061158912(0x3f400000, float:0.75)
            float r0 = java.lang.Math.max(r2, r0)
            float r0 = java.lang.Math.min(r0, r3)
            return r0
        L5b:
            r2 = 1068149419(0x3faaaaab, float:1.3333334)
            goto L42
        L5f:
            com.ss.android.ugc.aweme.feed.model.Video r2 = r4.getVideo()
            if (r2 == 0) goto L76
            int r0 = r2.getHeight()
            float r1 = (float) r0
            float r1 = r1 * r3
            int r0 = r2.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            goto L39
        L76:
            r0 = 0
            goto L39
        L78:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15UU.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):float");
    }

    public static float LIZIZ(Aweme aweme) {
        String aid;
        Float f;
        if (((Boolean) C278040Av4.LIZ.getValue()).booleanValue() && (aid = aweme.getAid()) != null && aid.length() != 0) {
            synchronized (C084C.LIZ) {
                f = (Float) C084C.LIZIZ.get((Object) aid);
            }
            if (f != null) {
                return f.floatValue();
            }
        }
        return LIZ(aweme);
    }

    public static boolean LIZLLL(int i) {
        if (i != EnumC1568370qup.STARSHIP_PREFETCH.getValue() && i != EnumC1568370qup.SERVER_PREFETCH.getValue()) {
            return false;
        }
        return true;
    }

    public static int LIZJ(C1086520eNe c1086520eNe, View view, boolean z) {
        int height;
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int i = rect.top;
        int i2 = rect.bottom;
        Rect originalPowerListRect = c1086520eNe.getOriginalPowerListRect();
        c1086520eNe.getGlobalVisibleRect(originalPowerListRect);
        int i3 = originalPowerListRect.top;
        int i4 = originalPowerListRect.bottom;
        int i5 = 0;
        if (C304280BwI.LIZLLL()) {
            View viewLIZ = C1570830qyn.LIZ(C1388190mED.LIZ(view.getContext()));
            if (viewLIZ == null) {
                View rootView = view.getRootView();
                if (rootView != null) {
                    viewLIZ = rootView.findViewById(R.id.nwe);
                } else {
                    viewLIZ = null;
                }
            }
            Rect rect2 = new Rect();
            if (viewLIZ != null) {
                viewLIZ.getGlobalVisibleRect(rect2);
            }
            int i6 = rect2.top;
            if (i4 > i6) {
                if (i4 > i6) {
                    i4 = i6;
                }
                if (i2 >= i4) {
                    i5 = i6 - originalPowerListRect.bottom;
                }
            }
        }
        if (i <= i3) {
            height = rect.bottom - i3;
        } else if (i2 >= i4) {
            height = i4 - i;
        } else {
            height = view.getHeight();
        }
        if (z && height < view.getHeight() && i2 >= i4) {
            return height - view.getHeight();
        }
        return i5;
    }
}
