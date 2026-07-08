package X;

import Y.ACListenerS51S0400000_15;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.model.InviteChatGroupHelper;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930420aJs extends AbstractC960470b6L<C929070aHh> {
    public final Context LL;
    public final Function1<EnumC928610aGx, Unit> LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public C930420aJs(Context context, Function1<? super EnumC928610aGx, Unit> function1) {
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        C786410Ut5.b6(horizontalScrollView, new ViewGroup.LayoutParams(-2, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C497740JfY.LIZIZ(32.0f));
        layoutParams.topMargin = (int) C497740JfY.LIZIZ(5.0f);
        layoutParams.bottomMargin = (int) C497740JfY.LIZIZ(16.0f);
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setPadding((int) C497740JfY.LIZIZ(16.0f), 0, (int) C497740JfY.LIZIZ(16.0f), 0);
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout);
        super(horizontalScrollView);
        this.LL = context;
        this.LLILLJJLI = function1;
        if (C930540aK4.LJIJJLI()) {
            View view = this.itemView;
            view.getLayoutParams().width = -1;
            view.setBackgroundColor(C20736316Cj.LIZJ(R.attr.ezm, this.itemView));
        }
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        ViewGroup viewGroup;
        View childAt;
        String strLJIJI;
        C929070aHh c929070aHh = (C929070aHh) obj;
        View view = this.itemView;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            childAt = viewGroup.getChildAt(0);
        } else {
            childAt = null;
        }
        if (childAt instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) childAt;
            C786410Ut5.LJJJJJL(linearLayout);
            boolean z = true;
            for (EnumC928610aGx enumC928610aGx : c929070aHh.LIZ) {
                C197039127h c197039127h = new C197039127h(this.LL, null, 6, 0);
                C786410Ut5.J6(c197039127h, new LinearLayout.LayoutParams(-2, -2));
                int i2 = C928620aGy.LIZ[enumC928610aGx.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                strLJIJI = C497740JfY.LJIJI(2131856558);
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            strLJIJI = C497740JfY.LJIJI(2131854158);
                        }
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131854157);
                    }
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131852236);
                }
                c197039127h.setText(strLJIJI);
                c197039127h.setTextSize(14.0f);
                c197039127h.LJJLI(true);
                int iLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
                c197039127h.setPadding(iLIZIZ, 0, iLIZIZ, 0);
                c197039127h.setGravity(17);
                c197039127h.setTag(enumC928610aGx);
                C786410Ut5.U8(c197039127h, new ACListenerS51S0400000_15(c197039127h, c929070aHh, this, childAt, 4));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (!z) {
                    layoutParams.setMarginStart((int) C497740JfY.LIZIZ(8.0f));
                }
                linearLayout.addView(c197039127h, layoutParams);
                z = false;
            }
            L5(childAt, c929070aHh, this);
            InviteChatGroupHelper inviteChatGroupHelper = (InviteChatGroupHelper) C948450amx.LIZIZ.LJIIJJI("INVITE_CHAT_GROUP_HELPER");
            if (inviteChatGroupHelper != null && !inviteChatGroupHelper.LJFF) {
                inviteChatGroupHelper.LJFF = true;
                C923200a8E.LIZIZ("show");
            }
        }
    }

    public static final void L5(View view, C929070aHh c929070aHh, C930420aJs c930420aJs) {
        for (View view2 : new C09RD((ViewGroup) view)) {
            if (view2 instanceof C197039127h) {
                TextView textView = (TextView) view2;
                Object tag = textView.getTag();
                if (tag instanceof EnumC928610aGx) {
                    if (tag == c929070aHh.LIZIZ) {
                        textView.setBackgroundTintList(ColorStateList.valueOf(C20736316Cj.LIZIZ(R.attr.ey7, c930420aJs.LL)));
                        textView.setTextColor(C20736316Cj.LIZIZ(R.attr.eyv, c930420aJs.LL));
                    } else {
                        textView.setBackgroundTintList(ColorStateList.valueOf(C20736316Cj.LIZIZ(R.attr.ey_, c930420aJs.LL)));
                        textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ezt, c930420aJs.LL));
                    }
                }
            }
        }
    }
}
