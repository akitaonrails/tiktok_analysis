package X;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Q0M, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q0M {
    public static void LIZ(C0QB7 c0qb7, MatchedFriendStruct matchedFriendStruct) {
        int size;
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        List<MutualUser> list;
        if (c0qb7 != null) {
            C0DTR.LIZIZ(c0qb7);
            if (matchedFriendStruct != null) {
                C12ES.LJIILL(0, c0qb7);
                MutualStruct mutualStruct = matchedFriendStruct.mMutualStruct;
                if (mutualStruct != null && (list = mutualStruct.userList) != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                if (size > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    TuxTextView tvDesc = c0qb7.getTvDesc();
                    if (tvDesc != null) {
                        ViewGroup.LayoutParams layoutParams = tvDesc.getLayoutParams();
                        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                            marginLayoutParams2.rightMargin = 0;
                        }
                        tvDesc.requestLayout();
                    }
                } else {
                    TuxTextView tvDesc2 = c0qb7.getTvDesc();
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    if (tvDesc2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = tvDesc2.getLayoutParams();
                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            marginLayoutParams.rightMargin = iLIZIZ;
                        }
                        tvDesc2.requestLayout();
                    }
                }
                c0qb7.LLILLL.LLILZLL = true;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(2));
                gradientDrawable.setColor(C960203pA.LIZ(R.attr.br, c0qb7.getContext()));
                c0qb7.setRootBackground(gradientDrawable);
                c0qb7.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)));
                c0qb7.setTuxTextSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                C0QB7.LJ(c0qb7, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))));
                c0qb7.getTvDesc().setTextColor(C960203pA.LIZ(R.attr.a1k, c0qb7.getContext()));
                c0qb7.getTvDesc().setTuxFont(72);
                int iLIZ = C960203pA.LIZ(R.attr.bz, c0qb7.getContext());
                int iLIZ2 = C960203pA.LIZ(R.attr.a1j, c0qb7.getContext());
                C443640HaU c443640HaU = c0qb7.LLILLL;
                c443640HaU.LLIZ = iLIZ;
                c443640HaU.LLIZLLLIL = iLIZ2;
                if (z) {
                    c0qb7.LIZ(matchedFriendStruct.mMutualStruct, 4);
                } else {
                    C786410Ut5.LLLLZLL(c0qb7.LLILLJJLI, 0);
                    c0qb7.LLILLJJLI.setMaxLines(3);
                    C786410Ut5.LLLLZLL(c0qb7.LLILZLL, 8);
                    C786410Ut5.v1(c0qb7.LLILLL, 8);
                }
                c0qb7.getTvDesc().setText(matchedFriendStruct.recommendReason);
            }
        }
    }
}
