package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoTag;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mUq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398500mUq {
    public static final C1398500mUq LIZ = new C1398500mUq();
    public static final Map<String, Boolean> LIZIZ = new ConcurrentHashMap();
    public static final boolean LIZJ = C444960Hcc.LIZIZ();

    public static boolean LIZ(Aweme aweme) {
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getABService();
        if (C1400500mY4.LIZLLL() && aweme.getDetailPageVideoTag() == VideoTag.EFFECT) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        C1387620mDI.LIZ.getClass();
        if (!C1387620mDI.LJI(aweme) && !C1387620mDI.LJFF(aweme)) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, String str5) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        Object obj = concurrentHashMap.get(str);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(obj, bool)) {
            return;
        }
        concurrentHashMap.put(str, bool);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        if (str5 != null) {
            c2344009Gk.LJFF("effect_id", str5);
        }
        if (str4 != null) {
            c2344009Gk.LJFF("music_id", str4);
        }
        C20684815ws.LJIILLIIL("video_friend_tag_show", c2344009Gk.LIZ);
    }

    public static void LIZJ(final View view, final View view2, final LinearLayout linearLayout, final C427660Gpo c427660Gpo, final TuxIconView tuxIconView, final TuxTextView tuxTextView, final Aweme aweme) {
        C786410Ut5.x3(linearLayout.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0Dea
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C786410Ut5.C3(linearLayout.getViewTreeObserver(), this);
                boolean z = C1398500mUq.LIZJ;
                if (z) {
                    C1398500mUq c1398500mUq = C1398500mUq.LIZ;
                    TuxTextView tuxTextView2 = tuxTextView;
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    c1398500mUq.getClass();
                    tuxTextView2.setPadding(iLIZIZ, tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), tuxTextView2.getPaddingBottom());
                }
                if (!AwemeExtKt.isPhotoMode(aweme)) {
                    C1398500mUq c1398500mUq2 = C1398500mUq.LIZ;
                    Aweme aweme2 = aweme;
                    View view3 = view;
                    C427660Gpo c427660Gpo2 = c427660Gpo;
                    LinearLayout linearLayout2 = linearLayout;
                    View view4 = view2;
                    c1398500mUq2.getClass();
                    if (z) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout2.getLayoutParams();
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view3.getLayoutParams();
                        layoutParams.gravity = 8388611;
                        C786410Ut5.W5(view3, layoutParams);
                        marginLayoutParams.setMarginStart(c427660Gpo2.getWidth());
                    }
                    C1398500mUq.LJ(aweme2, view3, linearLayout2.getWidth(), view4.getWidth(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 0);
                    return;
                }
                C1398500mUq c1398500mUq3 = C1398500mUq.LIZ;
                Aweme aweme3 = aweme;
                View view5 = view;
                C427660Gpo c427660Gpo3 = c427660Gpo;
                TuxIconView tuxIconView2 = tuxIconView;
                LinearLayout linearLayout3 = linearLayout;
                View view6 = view2;
                c1398500mUq3.getClass();
                if (tuxIconView2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) tuxIconView2.getLayoutParams();
                    int width = tuxIconView2.getWidth() + marginLayoutParams2.getMarginStart() + marginLayoutParams2.getMarginEnd();
                    int width2 = linearLayout3.getWidth();
                    int width3 = view6.getWidth();
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    if (width2 >= ((width3 - (iLIZIZ2 * 2)) - width) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) linearLayout3.getLayoutParams();
                        int width4 = (view6.getWidth() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2)) - width;
                        if (z) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view5.getLayoutParams();
                            layoutParams2.gravity = 8388611;
                            C786410Ut5.W5(view5, layoutParams2);
                            marginLayoutParams3.setMarginStart(c427660Gpo3.getWidth());
                        }
                        marginLayoutParams3.setMarginEnd((view6.getWidth() - width4) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                        C786410Ut5.d6(linearLayout3, marginLayoutParams3);
                    }
                    C1398500mUq.LJ(aweme3, view5, linearLayout3.getWidth(), view6.getWidth(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), tuxIconView2.getWidth(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                }
            }
        });
    }

    public static void LJ(Aweme aweme, View view, int i, int i2, int i3, int i4, int i5) {
        int i6 = i2 - (i3 * 2);
        if (i4 <= 0 ? i >= i6 : i >= (i6 - i4) - i5) {
            C786410Ut5.LJLLLLLL(0, view);
            if (LIZ(aweme) || LIZIZ(aweme)) {
                view.setBackgroundResource(R.drawable.bhr);
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }
}
