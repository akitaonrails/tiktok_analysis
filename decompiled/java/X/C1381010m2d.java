package X;

import Y.AUListenerS253S0100000_2;
import Y.AUListenerS270S0100000_21;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0m2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@InterfaceC1294060jmO
public final class C1381010m2d {
    public static final C1381010m2d LIZ = new C1381010m2d();
    public static ValueAnimator LIZIZ;

    public static void LIZ(C1381020m2e c1381020m2e) {
        if (c1381020m2e == null) {
            return;
        }
        SparseArray<Integer> sparseArray = c1381020m2e.LJI;
        FrameLayout frameLayout = c1381020m2e.LJFF;
        if (frameLayout != null) {
            Iterator<View> it2 = new C1381030m2f(frameLayout).iterator();
            while (true) {
                C1077410e8x c1077410e8x = (C1077410e8x) it2;
                if (!c1077410e8x.hasNext()) {
                    break;
                }
                View view = (View) c1077410e8x.next();
                if (sparseArray.get(view.getId()) != null) {
                    C786410Ut5.LJLLLLLL(sparseArray.get(view.getId()).intValue(), view);
                } else {
                    C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("shareCompleteClick, status is null for id ");
                    sbLIZ.append(view.getId());
                    c2276411E8h.LIZJ("common_feed", 4, "FeedShareHelper", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        C1440005kM.LIZ(new C739860T0m());
    }

    public static void LIZIZ(C1381020m2e c1381020m2e) {
        FrameLayout frameLayout;
        if (c1381020m2e != null && (frameLayout = c1381020m2e.LJFF) != null) {
            int childCount = frameLayout.getChildCount();
            SparseArray<Integer> sparseArray = new SparseArray<>();
            for (int i = 0; i < childCount; i++) {
                View childAt = c1381020m2e.LJFF.getChildAt(i);
                sparseArray.put(childAt.getId(), Integer.valueOf(childAt.getVisibility()));
                C786410Ut5.LJLLLLLL(8, childAt);
            }
            c1381020m2e.LJI = sparseArray;
        }
    }

    public static void LIZJ(C1381020m2e c1381020m2e, AnimatorListenerAdapter animatorListenerAdapter) {
        ValueAnimator valueAnimator;
        View view = c1381020m2e.LIZIZ;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c1381020m2e.LIZIZ.getHeight(), 0.0f);
        LIZIZ = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS270S0100000_21(c1381020m2e, 38));
        }
        if (animatorListenerAdapter != null && (valueAnimator = LIZIZ) != null) {
            valueAnimator.addListener(animatorListenerAdapter);
        }
        ValueAnimator valueAnimator2 = LIZIZ;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(300L);
        }
        ValueAnimator valueAnimator3 = LIZIZ;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public static void LIZLLL(Object obj, C1381020m2e c1381020m2e) {
        BaseContact baseContact;
        String string;
        String string2;
        C844470XAv.LIZ.getClass();
        Resources resources = C844470XAv.LIZ().getResources();
        int i = 8;
        if (obj instanceof C1365850leB) {
            TuxIconView tuxIconView = c1381020m2e.LIZLLL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            TextView textView = c1381020m2e.LJ;
            if (textView != null) {
                if (((C1365850leB) obj).LIZLLL instanceof IMUser) {
                    i = 0;
                }
                C786410Ut5.LLIL(textView, i);
            }
            TuxTextView tuxTextView = c1381020m2e.LIZ;
            if (tuxTextView != null) {
                C1365850leB c1365850leB = (C1365850leB) obj;
                if (c1365850leB.LJ) {
                    string2 = resources.getString(2131847377, c1365850leB.LIZLLL.getDisplayName());
                } else {
                    string2 = resources.getString(2131847376, c1365850leB.LIZLLL.getDisplayName());
                }
                tuxTextView.setText(string2);
            }
            TuxIconView tuxIconView2 = c1381020m2e.LIZJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_paperplane_fill);
            }
        } else if (obj instanceof C1365870leD) {
            C1365870leD c1365870leD = (C1365870leD) obj;
            List<IMContact> list = c1365870leD.LIZIZ;
            if (list == null || (baseContact = (BaseContact) C13LP.LJJJLL(list)) == null) {
                baseContact = c1365870leD.LIZ;
            }
            TuxTextView tuxTextView2 = c1381020m2e.LIZ;
            if (tuxTextView2 != null) {
                String str = "";
                if (c1365870leD.LIZJ) {
                    Object[] objArr = new Object[1];
                    String displayName = baseContact.getDisplayName();
                    if (displayName != null) {
                        str = displayName;
                    }
                    objArr[0] = str;
                    string = resources.getString(2131835476, objArr);
                } else if ((c1365870leD.LIZ instanceof IMConversation) && c1365870leD.LJII) {
                    string = resources.getString(2131835378);
                } else {
                    Object[] objArr2 = new Object[1];
                    String displayName2 = baseContact.getDisplayName();
                    if (displayName2 != null) {
                        str = displayName2;
                    }
                    objArr2[0] = str;
                    string = resources.getString(2131835475, objArr2);
                }
                tuxTextView2.setText(string);
            }
            TuxIconView tuxIconView3 = c1381020m2e.LIZLLL;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
            }
            TextView textView2 = c1381020m2e.LJ;
            if (textView2 != null) {
                C786410Ut5.LLIL(textView2, 8);
            }
            TuxIconView tuxIconView4 = c1381020m2e.LIZJ;
            if (tuxIconView4 != null) {
                tuxIconView4.setIconRes(R.raw.icon_tick_circle_fill);
            }
        } else if (obj instanceof C1365860leC) {
            TuxIconView tuxIconView5 = c1381020m2e.LIZLLL;
            if (tuxIconView5 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
            }
            TextView textView3 = c1381020m2e.LJ;
            if (textView3 != null) {
                C786410Ut5.LLIL(textView3, 8);
            }
            TuxTextView tuxTextView3 = c1381020m2e.LIZ;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(C844470XAv.LIZ().getResources().getString(2131834358));
            }
            TuxIconView tuxIconView6 = c1381020m2e.LIZJ;
            if (tuxIconView6 != null) {
                tuxIconView6.setIconRes(R.raw.icon_exclamation_mark_circle_fill);
            }
        }
        float fLIZJ = C12ES.LIZJ(32.0f, C844470XAv.LIZ());
        View view = c1381020m2e.LIZIZ;
        if (view != null) {
            view.getLayoutParams().height = 0;
            view.requestLayout();
            C786410Ut5.LJLLLLLL(0, view);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, fLIZJ);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS253S0100000_2(view, 28));
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.start();
        }
    }
}
