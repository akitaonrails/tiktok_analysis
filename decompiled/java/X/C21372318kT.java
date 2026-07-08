package X;

import Y.ACListenerS134S0200000_32;
import Y.ACListenerS96S0300000_32;
import Y.AObjectS406S0100000_32;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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

/* JADX INFO: renamed from: X.18kT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21372318kT extends FrameLayout implements InterfaceC21372218kS {
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final LinearLayout LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public TuxTextView LLIZ;
    public final boolean LLIZLLLIL;

    public C21372318kT(C19EG c19eg) {
        TuxTextView tuxTextView;
        super(c19eg, null, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.d3l, this, true);
        this.LL = viewTd;
        if (viewTd != null) {
            tuxTextView = (TuxTextView) viewTd.findViewById(R.id.wlq);
        } else {
            tuxTextView = null;
        }
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = viewTd != null ? (LinearLayout) viewTd.findViewById(R.id.d78) : null;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        this.LLIZLLLIL = currentUser != null ? currentUser.LJIIJJI() : false;
    }

    @Override // X.InterfaceC21372218kS
    public final void LIZIZ(int i, List<? extends UrlModel> list) {
        TuxTextView tuxTextView;
        View view = this.LLILZIL;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.title);
        } else {
            tuxTextView = null;
        }
        if (i != 0 && !list.isEmpty()) {
            try {
                C447070Hg1.LIZLLL(list, new AwS138S0101000_32(tuxTextView, i, 4));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    @Override // X.InterfaceC21372218kS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.Long r8, java.lang.Long r9) {
        /*
            r7 = this;
            r5 = 1
            r6 = 0
            if (r9 == 0) goto L69
            long r3 = r9.longValue()
            X.0KWL r0 = X.C0KWL.LIZ
            r0.getClass()
            long r1 = X.C0KWL.LJ()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L69
            com.bytedance.tux.input.TuxTextView r3 = r7.LLILLJJLI
            if (r3 == 0) goto L2c
            android.content.Context r2 = r7.getContext()
            long r0 = r9.longValue()
            java.lang.String r0 = X.C447070Hg1.LIZ(r0)
            android.text.SpannableString r0 = X.C0KWL.LJFF(r2, r0)
            r3.setText(r0)
        L2c:
            boolean r0 = X.C08A4.LIZIZ(r8)
            if (r0 == 0) goto L56
            com.bytedance.tux.input.TuxTextView r4 = r7.LLIZ
            if (r4 == 0) goto L52
            android.content.Context r3 = r7.getContext()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            if (r8 == 0) goto L53
            long r0 = r8.longValue()
        L42:
            java.lang.String r0 = X.C447070Hg1.LIZ(r0)
            r2[r6] = r0
            r0 = 2131846753(0x7f116661, float:1.9326964E38)
            java.lang.String r0 = r3.getString(r0, r2)
            r4.setText(r0)
        L52:
            return
        L53:
            r0 = 0
            goto L42
        L56:
            com.bytedance.tux.input.TuxTextView r2 = r7.LLIZ
            if (r2 == 0) goto L52
            android.content.Context r1 = r7.getContext()
            r0 = 2131846747(0x7f11665b, float:1.9326952E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            return
        L69:
            com.bytedance.tux.input.TuxTextView r2 = r7.LLILLJJLI
            if (r2 == 0) goto L2c
            android.content.Context r1 = r7.getContext()
            r0 = 2131846737(0x7f116651, float:1.9326932E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21372318kT.LIZJ(java.lang.Long, java.lang.Long):void");
    }

    @Override // X.InterfaceC21372218kS
    public final void LIZ(VideoPublishEditModel videoPublishEditModel, AObjectS406S0100000_32 aObjectS406S0100000_32, AObjectS406S0100000_32 aObjectS406S0100000_322) {
        String string;
        TuxTextView tuxTextView;
        ViewGroup viewGroup;
        View view = this.LL;
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.v4e)) != null) {
            C0KWL c0kwl = C0KWL.LIZ;
            Context context = getContext();
            c0kwl.getClass();
            viewGroup.addView(C0KWL.LIZLLL(context));
        }
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout != null) {
            C0KWL c0kwl2 = C0KWL.LIZ;
            Context context2 = linearLayout.getContext();
            if (this.LLIZLLLIL) {
                string = linearLayout.getContext().getString(2131846751);
            } else {
                string = linearLayout.getContext().getString(2131846750);
            }
            c0kwl2.getClass();
            View viewLIZIZ = C0KWL.LIZIZ(context2, string, R.raw.icon_color_arrow_up_circle_fill_light, null, false);
            this.LLILZ = viewLIZIZ;
            linearLayout.addView(viewLIZIZ);
            boolean z = false;
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_page_draft_button_panel_v1_options", true) != 2) {
                z = true;
            }
            if (z) {
                linearLayout.addView(C0KWL.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), linearLayout.getContext()));
                View view2 = this.LLILZ;
                if (view2 != null) {
                    view2.setBackground(linearLayout.getContext().getDrawable(R.drawable.amp));
                }
                Context context3 = linearLayout.getContext();
                String string2 = linearLayout.getContext().getString(2131846752);
                Integer numValueOf = Integer.valueOf(R.attr.a1h);
                c0kwl2.getClass();
                View viewLIZIZ2 = C0KWL.LIZIZ(context3, string2, R.raw.icon_tab_bottom_friends, numValueOf, false);
                viewLIZIZ2.setBackground(viewLIZIZ2.getContext().getDrawable(R.drawable.amj));
                this.LLILZIL = viewLIZIZ2;
                linearLayout.addView(viewLIZIZ2);
            }
            Context context4 = linearLayout.getContext();
            String string3 = linearLayout.getContext().getString(2131846747);
            Integer numValueOf2 = Integer.valueOf(R.attr.a1h);
            c0kwl2.getClass();
            View viewLIZIZ3 = C0KWL.LIZIZ(context4, string3, R.raw.icon_archive_box_arrow_down, numValueOf2, false);
            viewLIZIZ3.setBackground(viewLIZIZ3.getContext().getDrawable(R.drawable.amm));
            this.LLILZLL = viewLIZIZ3;
            linearLayout.addView(viewLIZIZ3);
            View view3 = this.LLILZLL;
            if (view3 != null) {
                tuxTextView = (TuxTextView) view3.findViewById(R.id.title);
            } else {
                tuxTextView = null;
            }
            this.LLIZ = tuxTextView;
            View view4 = this.LLILZLL;
            if (view4 != null) {
                C426750GoL.LJIIIZ(view4, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null, false, 29);
            }
        }
        View view5 = this.LLILZ;
        if (view5 != null) {
            C786410Ut5.I7(new ACListenerS96S0300000_32(videoPublishEditModel, aObjectS406S0100000_32, this, 0), view5);
        }
        View view6 = this.LLILZIL;
        if (view6 != null) {
            C786410Ut5.I7(new ACListenerS96S0300000_32(videoPublishEditModel, aObjectS406S0100000_32, this, 1), view6);
        }
        View view7 = this.LLILZLL;
        if (view7 != null) {
            C786410Ut5.I7(new ACListenerS134S0200000_32(aObjectS406S0100000_322, this, 10), view7);
        }
    }
}
