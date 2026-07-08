package X;

import Y.ACListenerS113S0200000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618790OOv implements C0OT0 {
    public final BulletinPublishViewModel LIZ;
    public final BulletinCommonAbility LIZIZ;
    public final boolean LIZJ;
    public final View LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C01GW LJI;

    @Override // X.C0OT0
    public final View LJIJI() {
        throw null;
    }

    public final FrameLayout LJI() {
        return (FrameLayout) this.LJI.getValue();
    }

    public static TuxIconView LJFF(Context context) {
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.M6(tuxIconView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = R.raw.icon_info_circle;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1m);
        tuxIconView.setTuxIcon(c419910GdJ);
        return tuxIconView;
    }

    public final void LIZLLL(BulletinBaseItem bulletinBaseItem) {
        if (!(bulletinBaseItem instanceof C0OO7) && !this.LJ && !this.LJFF) {
            if (bulletinBaseItem.LJJIL()) {
                FrameLayout frameLayoutLJI = LJI();
                if (frameLayoutLJI != null) {
                    C786410Ut5.O7(frameLayoutLJI, null);
                }
                FrameLayout frameLayoutLJI2 = LJI();
                if (frameLayoutLJI2 != null) {
                    C0DTR.LIZIZ(frameLayoutLJI2);
                    return;
                }
                return;
            }
            FrameLayout frameLayoutLJI3 = LJI();
            if (frameLayoutLJI3 != null) {
                C786410Ut5.O7(frameLayoutLJI3, new ACListenerS113S0200000_9(this, bulletinBaseItem, 38));
            }
            FrameLayout frameLayoutLJI4 = LJI();
            if (frameLayoutLJI4 == null) {
                return;
            }
            C12ES.LJIILL(0, frameLayoutLJI4);
            return;
        }
        FrameLayout frameLayoutLJI5 = LJI();
        if (frameLayoutLJI5 != null) {
            C786410Ut5.O7(frameLayoutLJI5, null);
        }
        FrameLayout frameLayoutLJI6 = LJI();
        if (frameLayoutLJI6 != null) {
            C0DTR.LIZIZ(frameLayoutLJI6);
        }
    }

    public final View LJIIJ(ViewStub viewStub) {
        viewStub.setLayoutResource(R.layout.a88);
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        if (this.LIZJ) {
            FrameLayout frameLayout = (FrameLayout) viewLJLLLL.findViewById(R.id.d4r);
            if (frameLayout != null) {
                C786410Ut5.LJJJJIZL(frameLayout);
                frameLayout.addView(LJFF(viewLJLLLL.getContext()));
            }
            return viewLJLLLL;
        }
        ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1383370m6R.LJI(viewLJLLLL);
        if (marginLayoutParamsLJI != null) {
            marginLayoutParamsLJI.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            marginLayoutParamsLJI.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        }
        C786410Ut5.W5(viewLJLLLL, marginLayoutParamsLJI);
        return viewLJLLLL;
    }

    public C618790OOv(ViewStub viewStub, BulletinPublishViewModel bulletinPublishViewModel, BulletinCommonAbility bulletinCommonAbility, BulletinInteractionAbility bulletinInteractionAbility) {
        View viewLJIIJ;
        boolean zV20;
        ViewGroup viewGroup;
        this.LIZ = bulletinPublishViewModel;
        this.LIZIZ = bulletinCommonAbility;
        boolean z = true;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_voice_consumer_enable", true, false) && !C0OPA.LIZ()) {
            z = false;
        }
        this.LIZJ = z;
        if (C0OS8.LJI()) {
            ViewParent parent = viewStub.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                C786410Ut5.LJJLJLI(viewStub, viewGroup);
                Context context = viewStub.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.d4r);
                C786410Ut5.a6(frameLayout, layoutParams);
                if (z) {
                    frameLayout.addView(LJFF(context));
                } else {
                    TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                    C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
                    tuxTextView.setText(context.getString(2131828050));
                    tuxTextView.setTextColorRes(R.attr.zs);
                    tuxTextView.setTuxFont(61);
                    frameLayout.addView(tuxTextView);
                    ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1383370m6R.LJI(frameLayout);
                    if (marginLayoutParamsLJI != null) {
                        marginLayoutParamsLJI.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                        marginLayoutParamsLJI.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    }
                    C786410Ut5.a6(frameLayout, marginLayoutParamsLJI);
                }
                viewGroup.addView(frameLayout, iIndexOfChild);
                viewLJIIJ = frameLayout;
            } else {
                viewLJIIJ = LJIIJ(viewStub);
            }
        } else {
            viewLJIIJ = LJIIJ(viewStub);
        }
        this.LIZLLL = viewLJIIJ;
        if (bulletinInteractionAbility != null) {
            zV20 = bulletinInteractionAbility.v20();
        } else {
            zV20 = false;
        }
        this.LJ = zV20;
        this.LJFF = bulletinInteractionAbility != null ? bulletinInteractionAbility.AK2() : false;
        this.LJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1728));
    }
}
