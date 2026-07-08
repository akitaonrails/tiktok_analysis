package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import bfk.b0;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653300t7o {
    public final ShortVideoContext LIZ;
    public final C0GUE LIZIZ;
    public C0P0T LIZLLL;
    public b0 LJ;
    public final C01GW LJI;
    public final C1653450t83 LIZJ = new C1653450t83();
    public final Set<String> LJFF = new LinkedHashSet();

    public final boolean LIZIZ() {
        return this.LIZJ.LIZ() || !this.LIZJ.LIZIZ();
    }

    public final int LIZJ(String str) {
        if (this.LIZIZ.getChildCount() <= 0) {
            return -1;
        }
        int childCount = this.LIZIZ.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (Intrinsics.LJFF(str, this.LIZIZ.getChildAt(i).getTag())) {
                return i;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [bfk.b0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final int LIZLLL(b0 b0Var) {
        if (this.LIZIZ.getChildCount() <= 0) {
            return 0;
        }
        if (b0Var == 0) {
            String strLIZ = C0MTD.LIZ(2131845855);
            int childCount = this.LIZIZ.getChildCount();
            int i = 0;
            b0Var = b0Var;
            while (i < childCount) {
                if (Intrinsics.LJFF(strLIZ, this.LIZIZ.getChildAt(i).getTag())) {
                    b0Var = this.LIZIZ.getChildAt(i);
                }
                i++;
                b0Var = b0Var;
            }
            if (b0Var == 0) {
                return 0;
            }
        }
        Rect rect = new Rect();
        float f = 0.0f;
        if (b0Var.getGlobalVisibleRect(rect)) {
            float fWidth = rect.width();
            float measuredWidth = b0Var.getMeasuredWidth();
            if (measuredWidth != 0.0f) {
                f = fWidth / measuredWidth;
            }
        }
        return (int) (f * 100);
    }

    public C1653300t7o(ShortVideoContext shortVideoContext, TabHost tabHost) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = (C0GUE) tabHost.findViewById(R.id.eqx);
        new C1646570swx();
        new LinkedHashMap();
        this.LJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(160));
    }

    public static final void LJ(int i, C1653300t7o c1653300t7o) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", C1653340t7s.LJ);
        c0lab.LIZ(i, "show_percentage");
        float f = i;
        if (f <= 0.0f) {
            str = "not_show";
        } else if (f >= 100.0f) {
            str = "show";
        } else {
            str = "half_show";
        }
        c0lab.LJ("show_type", str);
        c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(C1653340t7s.LIZ, "is_new_anchor");
        c0lab.LJ("shoot_way", C1653340t7s.LIZIZ);
        c0lab.LIZ(C1653340t7s.LIZJ ? 1 : 0, "is_live_tab_default");
        HashMap<String, String> map = C1653340t7s.LJFF;
        c0lab.LJI(map);
        C20684815ws.LJIILLIIL("livesdk_shoot_live_tab_load", c0lab.LIZ);
        C1653320t7q c1653320t7q = C1653320t7q.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", C1653320t7q.LIZIZ);
        c2344009Gk.LJIIIIZZ("origin_enter_from", C1653320t7q.LIZJ);
        c2344009Gk.LIZJ(1, "is_success");
        c2344009Gk.LJI(map);
        C20684815ws.LJIILLIIL("livesdk_live_tab_load_result", c2344009Gk.LIZ);
        if (i > 0 && !C1653340t7s.LIZJ) {
            c1653300t7o.getClass();
            C0LAB c0lab2 = new C0LAB();
            c0lab2.LJ("enter_from", C1653340t7s.LJ);
            c0lab2.LJ("live_entrance_name", C1653340t7s.LJ);
            c0lab2.LJ("live_tab_show_type", "first_screen");
            C20684815ws.LJIILLIIL("livesdk_live_entrance_show", c0lab2.LIZ);
            C1653340t7s.LIZLLL = "first_screen";
        }
    }

    public static void LJFF(b0 b0Var, CharSequence charSequence, final int i, boolean z) {
        final TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        b0Var.setText(charSequence);
        TextView textView = b0Var.getTextView();
        if ((textView instanceof TuxTextView) && (tuxTextView2 = (TuxTextView) textView) != null) {
            tuxTextView2.LJJJJI(16.0f);
        }
        if (i != 0) {
            if (z) {
                TextView textView2 = b0Var.getTextView();
                if ((textView2 instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView2) != null) {
                    C786410Ut5.x3(tuxTextView.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0FRM
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            C786410Ut5.C3(tuxTextView.getViewTreeObserver(), this);
                            Drawable drawableLIZIZ = C800330VaR.LIZIZ(tuxTextView.getContext(), i);
                            if (drawableLIZIZ == null) {
                                return;
                            }
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableLIZIZ.getIntrinsicWidth(), drawableLIZIZ.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            drawableLIZIZ.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                            drawableLIZIZ.draw(canvas);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
                            Matrix matrix = new Matrix();
                            TuxTextView tuxTextView3 = tuxTextView;
                            matrix.setScale(tuxTextView3.getWidth() / bitmapCreateBitmap.getWidth(), tuxTextView3.getHeight() / bitmapCreateBitmap.getHeight());
                            bitmapShader.setLocalMatrix(matrix);
                            tuxTextView.getPaint().setShader(bitmapShader);
                            tuxTextView.invalidate();
                        }
                    });
                    return;
                }
                return;
            }
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(b0Var.getContext(), i);
            if (drawableLIZIZ == null) {
                return;
            }
            drawableLIZIZ.setBounds(0, 1, drawableLIZIZ.getIntrinsicWidth(), drawableLIZIZ.getIntrinsicHeight() + 1);
            b0Var.getTextView().setCompoundDrawables(drawableLIZIZ, null, null, null);
            b0Var.getTextView().setCompoundDrawablePadding((int) C12ES.LIZJ(3.0f, b0Var.getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r7, java.lang.CharSequence r8, java.lang.String r9, boolean r10, kotlin.jvm.functions.Function0 r11, boolean r12, kotlin.jvm.functions.Function2 r13) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1653300t7o.LIZ(int, java.lang.CharSequence, java.lang.String, boolean, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function2):void");
    }
}
