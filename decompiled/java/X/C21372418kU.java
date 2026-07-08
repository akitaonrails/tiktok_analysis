package X;

import Y.ACListenerS134S0200000_32;
import Y.ACListenerS96S0300000_32;
import Y.AObjectS406S0100000_32;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS138S0101000_32;

/* JADX INFO: renamed from: X.18kU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21372418kU extends FrameLayout implements InterfaceC21372218kS {
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final LinearLayout LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public final View LLIZ;
    public final boolean LLIZLLLIL;

    public C21372418kU(C19EG c19eg) {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        View viewFindViewById;
        super(c19eg, null, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.d3n, this, true);
        this.LL = viewTd;
        if (viewTd != null) {
            tuxTextView = (TuxTextView) viewTd.findViewById(R.id.wlq);
        } else {
            tuxTextView = null;
        }
        this.LLILLJJLI = tuxTextView;
        if (viewTd != null) {
            tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.g7l);
        } else {
            tuxTextView2 = null;
        }
        this.LLILLL = tuxTextView2;
        if (viewTd != null) {
            viewFindViewById = viewTd.findViewById(R.id.tzf);
        } else {
            viewFindViewById = null;
        }
        this.LLIZ = viewFindViewById;
        this.LLILZ = viewTd != null ? (LinearLayout) viewTd.findViewById(R.id.d78) : null;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        this.LLIZLLLIL = currentUser != null ? currentUser.LJIIJJI() : false;
    }

    @Override // X.InterfaceC21372218kS
    public final void LIZIZ(int i, List<? extends UrlModel> list) {
        TuxTextView tuxTextView;
        View view = this.LLILZLL;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.title);
        } else {
            tuxTextView = null;
        }
        if (i != 0 && !list.isEmpty()) {
            try {
                C447070Hg1.LIZLLL(list, new AwS138S0101000_32(tuxTextView, i, 5));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    @Override // X.InterfaceC21372218kS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.Long r8, java.lang.Long r9) {
        /*
            r7 = this;
            r6 = 1
            r5 = 0
            if (r9 == 0) goto L73
            long r3 = r9.longValue()
            X.0KWL r0 = X.C0KWL.LIZ
            r0.getClass()
            long r1 = X.C0KWL.LJ()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L73
            com.bytedance.tux.input.TuxTextView r0 = r7.LLILLL
            if (r0 == 0) goto L1c
            X.C786410Ut5.LLLLZLL(r0, r5)
        L1c:
            com.bytedance.tux.input.TuxTextView r4 = r7.LLILLL
            if (r4 == 0) goto L3a
            android.content.Context r3 = r7.getContext()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            long r0 = r9.longValue()
            java.lang.String r0 = X.C447070Hg1.LIZ(r0)
            r2[r5] = r0
            r0 = 2131846745(0x7f116659, float:1.9326948E38)
            java.lang.String r0 = r3.getString(r0, r2)
            r4.setText(r0)
        L3a:
            if (r8 == 0) goto L60
            com.bytedance.tux.input.TuxTextView r4 = r7.LLILLJJLI
            if (r4 == 0) goto L5c
            android.content.Context r3 = r7.getContext()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            if (r8 == 0) goto L5d
            long r0 = r8.longValue()
        L4c:
            java.lang.String r0 = X.C447070Hg1.LIZ(r0)
            r2[r5] = r0
            r0 = 2131846746(0x7f11665a, float:1.932695E38)
            java.lang.String r0 = r3.getString(r0, r2)
            r4.setText(r0)
        L5c:
            return
        L5d:
            r0 = 0
            goto L4c
        L60:
            com.bytedance.tux.input.TuxTextView r2 = r7.LLILLJJLI
            if (r2 == 0) goto L5c
            android.content.Context r1 = r7.getContext()
            r0 = 2131846737(0x7f116651, float:1.9326932E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            return
        L73:
            com.bytedance.tux.input.TuxTextView r1 = r7.LLILLL
            if (r1 == 0) goto L3a
            r0 = 8
            X.C786410Ut5.LLLLZLL(r1, r0)
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21372418kU.LIZJ(java.lang.Long, java.lang.Long):void");
    }

    @Override // X.InterfaceC21372218kS
    public final void LIZ(VideoPublishEditModel videoPublishEditModel, AObjectS406S0100000_32 aObjectS406S0100000_32, AObjectS406S0100000_32 aObjectS406S0100000_322) {
        ViewTreeObserver viewTreeObserver;
        String string;
        ViewGroup viewGroup;
        View view = this.LL;
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.v4e)) != null) {
            C0KWL c0kwl = C0KWL.LIZ;
            Context context = getContext();
            c0kwl.getClass();
            viewGroup.addView(C0KWL.LIZLLL(context));
        }
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null) {
            C0KWL c0kwl2 = C0KWL.LIZ;
            Context context2 = linearLayout.getContext();
            if (this.LLIZLLLIL) {
                string = linearLayout.getContext().getString(2131846751);
            } else {
                string = linearLayout.getContext().getString(2131846750);
            }
            c0kwl2.getClass();
            View viewLIZIZ = C0KWL.LIZIZ(context2, string, R.raw.icon_color_arrow_up_circle_fill_light, null, true);
            viewLIZIZ.setBackground(viewLIZIZ.getContext().getDrawable(R.drawable.amp));
            this.LLILZIL = viewLIZIZ;
            linearLayout.addView(viewLIZIZ);
            linearLayout.addView(C0KWL.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), linearLayout.getContext()));
            View viewLIZIZ2 = C0KWL.LIZIZ(linearLayout.getContext(), linearLayout.getContext().getString(2131846752), R.raw.icon_tab_bottom_friends, Integer.valueOf(R.attr.a1h), true);
            viewLIZIZ2.setBackground(viewLIZIZ2.getContext().getDrawable(R.drawable.amj));
            this.LLILZLL = viewLIZIZ2;
            linearLayout.addView(viewLIZIZ2);
        }
        View view2 = this.LLILZIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS96S0300000_32(videoPublishEditModel, aObjectS406S0100000_32, this, 3), view2);
        }
        View view3 = this.LLILZLL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS96S0300000_32(videoPublishEditModel, aObjectS406S0100000_32, this, 4), view3);
        }
        View view4 = this.LLIZ;
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS134S0200000_32(aObjectS406S0100000_322, this, 12), view4);
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null && (viewTreeObserver = tuxTextView.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct = new ViewTreeObserverOnGlobalLayoutListenerC1864770yct(this, 4);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1864770yct);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1864770yct, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }
}
