package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemBottomStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OR1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OR1 implements C0OT0 {
    public final BulletinCommonAbility LIZ;
    public final View LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;

    @Override // X.C0OT0
    public final View LJIJI() {
        throw null;
    }

    public final void LIZLLL(BulletinBaseItem bulletinBaseItem) {
        String str;
        String str2;
        if (!(bulletinBaseItem instanceof C0OO7) && !this.LIZJ && !this.LIZLLL) {
            BulletinItemBottomStruct bulletinItemBottomStructLIZIZ = bulletinBaseItem.LIZIZ();
            if (bulletinItemBottomStructLIZIZ != null) {
                str = bulletinItemBottomStructLIZIZ.bottomTip;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                BulletinItemBottomStruct bulletinItemBottomStructLIZIZ2 = bulletinBaseItem.LIZIZ();
                if (bulletinItemBottomStructLIZIZ2 != null && (str2 = bulletinItemBottomStructLIZIZ2.bottomTip) != null) {
                    TextView textView = (TextView) this.LJFF.getValue();
                    if (textView != null) {
                        textView.setText(str2);
                    }
                    View view = (View) this.LJ.getValue();
                    if (view != null) {
                        C12ES.LJIILL(0, view);
                        return;
                    }
                    return;
                }
                return;
            }
            if (bulletinBaseItem.LJJIJL() > 0 && bulletinBaseItem.LJJJJ()) {
                String strJ4 = C786410Ut5.j4(this.LIZIZ.getContext().getString(2131828146), Arrays.copyOf(new Object[]{C214824195i.LIZIZ.LJIIZILJ(bulletinBaseItem.LJJIJL())}, 1));
                TextView textView2 = (TextView) this.LJFF.getValue();
                if (textView2 != null) {
                    textView2.setText(strJ4);
                }
                View view2 = (View) this.LJ.getValue();
                if (view2 == null) {
                    return;
                }
                C12ES.LJIILL(0, view2);
                return;
            }
            View view3 = (View) this.LJ.getValue();
            if (view3 == null) {
                return;
            }
            C0DTR.LIZIZ(view3);
            return;
        }
        View view4 = (View) this.LJ.getValue();
        if (view4 != null) {
            C0DTR.LIZIZ(view4);
        }
    }

    public final View LJFF(ViewStub viewStub) {
        int i;
        viewStub.setLayoutResource(R.layout.a8p);
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        if (!C0OS8.LIZLLL()) {
            if (C279940Ay8.LIZ()) {
                i = 8;
            } else {
                i = 4;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
            ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1383370m6R.LJI(viewLJLLLL);
            if (marginLayoutParamsLJI != null) {
                marginLayoutParamsLJI.topMargin = iLIZIZ;
            }
            BulletinCommonAbility bulletinCommonAbility = this.LIZ;
            if (bulletinCommonAbility != null && bulletinCommonAbility.To()) {
                if (marginLayoutParamsLJI != null) {
                    marginLayoutParamsLJI.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                }
            } else if (marginLayoutParamsLJI != null) {
                marginLayoutParamsLJI.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            }
            C786410Ut5.W5(viewLJLLLL, marginLayoutParamsLJI);
        }
        return viewLJLLLL;
    }

    public C0OR1(ViewStub viewStub, BulletinInteractionAbility bulletinInteractionAbility, BulletinCommonAbility bulletinCommonAbility) {
        View viewLJFF;
        boolean zV20;
        ViewGroup viewGroup;
        int i;
        this.LIZ = bulletinCommonAbility;
        if (C0OS8.LJI()) {
            ViewParent parent = viewStub.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                C786410Ut5.LJJLJLI(viewStub, viewGroup);
                Context context = viewStub.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.d1e);
                C786410Ut5.a6(frameLayout, layoutParams);
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                tuxTextView.setId(R.id.d1d);
                C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
                tuxTextView.setTextColorRes(R.attr.a1k);
                tuxTextView.setTuxFont(61);
                tuxTextView.setMaxLines(1);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                frameLayout.addView(tuxTextView);
                viewGroup.addView(frameLayout, iIndexOfChild);
                viewLJFF = frameLayout;
                if (!C0OS8.LIZLLL()) {
                    if (C279940Ay8.LIZ()) {
                        i = 8;
                    } else {
                        i = 4;
                    }
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
                    ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1383370m6R.LJI(frameLayout);
                    if (marginLayoutParamsLJI != null) {
                        marginLayoutParamsLJI.topMargin = iLIZIZ;
                    }
                    if (bulletinCommonAbility != null && bulletinCommonAbility.To()) {
                        if (marginLayoutParamsLJI != null) {
                            marginLayoutParamsLJI.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                        }
                    } else if (marginLayoutParamsLJI != null) {
                        marginLayoutParamsLJI.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    }
                    C786410Ut5.a6(frameLayout, marginLayoutParamsLJI);
                    viewLJFF = frameLayout;
                }
            } else {
                viewLJFF = LJFF(viewStub);
            }
        } else {
            viewLJFF = LJFF(viewStub);
        }
        this.LIZIZ = viewLJFF;
        if (bulletinInteractionAbility != null) {
            zV20 = bulletinInteractionAbility.v20();
        } else {
            zV20 = false;
        }
        this.LIZJ = zV20;
        this.LIZLLL = bulletinInteractionAbility != null ? bulletinInteractionAbility.AK2() : false;
        this.LJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1725));
        this.LJFF = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1726));
    }
}
