package X;

import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bOK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class DialogC971620bOK extends AbstractDialogC962810bA7 {
    public static DialogC971620bOK LLJIJIL;
    public final EnumC952890au7 LLJI;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g_2;
    }

    @Override // X.C19GI, X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+mRsEIix6zmUcBwbyL0ej0znPyXhkjA4ffPpsTQ7PoQ4GWjdV0IjVYbsdO8g5fo2T+6nmktxLO9Rg==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/NoticeBoardBaseDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/NoticeBoardBaseDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            C19GI c19gi = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C19GI) obj;
            super.show();
            c0wst.LIZ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/NoticeBoardBaseDialog", "show", null, objArr, c19gi, c0wzw, true);
        }
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        EnumC952890au7 enumC952890au7 = this.LLJI;
        multiCanvasUtils.getClass();
        C946850akN.LJFF(MultiCanvasUtils.LJIIJJI(enumC952890au7), EnumC971610bOJ.FAQ, "in_spots");
    }

    @Override // X.AbstractDialogC962810bA7, X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        super.onCreate(bundle);
        ((C0GUM) findViewById(R.id.tsc)).e0(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 279), findViewById(R.id.bnb));
        ((TextView) findViewById(R.id.mtc)).setText(2131853980);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.evm);
        EnumC971640bOM enumC971640bOM = EnumC971640bOM.BOLD_TEXT;
        MultiguestNoticeboardV2Setting multiguestNoticeboardV2Setting = MultiguestNoticeboardV2Setting.INSTANCE;
        if (multiguestNoticeboardV2Setting.isPreviewEnable()) {
            i = 2131853982;
        } else {
            i = 2131853981;
        }
        LJL(viewGroup, enumC971640bOM, i);
        EnumC971640bOM enumC971640bOM2 = EnumC971640bOM.NORMAL;
        if (multiguestNoticeboardV2Setting.isPreviewEnable()) {
            i2 = 2131853969;
        } else {
            i2 = 2131853968;
        }
        LJL(viewGroup, enumC971640bOM2, i2);
        EnumC971640bOM enumC971640bOM3 = EnumC971640bOM.NORMAL;
        if (multiguestNoticeboardV2Setting.isPreviewEnable()) {
            i3 = 2131853971;
        } else {
            i3 = 2131853970;
        }
        LJL(viewGroup, enumC971640bOM3, i3);
        LJL(viewGroup, EnumC971640bOM.IMAGE, 0);
        EnumC971640bOM enumC971640bOM4 = EnumC971640bOM.BOLD_TEXT;
        if (multiguestNoticeboardV2Setting.isPreviewEnable()) {
            i4 = 2131853984;
        } else {
            i4 = 2131853983;
        }
        LJL(viewGroup, enumC971640bOM4, i4);
        LJL(viewGroup, EnumC971640bOM.NORMAL, 2131853973);
        EnumC971640bOM enumC971640bOM5 = EnumC971640bOM.NORMAL;
        if (multiguestNoticeboardV2Setting.isPreviewEnable()) {
            i5 = 2131853975;
        } else {
            i5 = 2131853974;
        }
        LJL(viewGroup, enumC971640bOM5, i5);
        if (multiguestNoticeboardV2Setting.templateEnable()) {
            LJL(viewGroup, EnumC971640bOM.BOLD_TEXT, 2131853985);
            LJL(viewGroup, EnumC971640bOM.NORMAL, 2131853976);
            LJL(viewGroup, EnumC971640bOM.SUB_NORMAL, 2131853977);
            LJL(viewGroup, EnumC971640bOM.SUB_NORMAL, 2131853978);
            LJL(viewGroup, EnumC971640bOM.NORMAL, 2131853979);
        }
    }

    public DialogC971620bOK(Context context, EnumC952890au7 enumC952890au7) {
        super(context);
        this.LLJI = enumC952890au7;
    }

    public final void LJL(ViewGroup viewGroup, EnumC971640bOM enumC971640bOM, int i) {
        int iLIZIZ;
        View view;
        int i2 = C971630bOL.LIZ[enumC971640bOM.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        LinearLayout linearLayout = new LinearLayout(getContext());
                        linearLayout.setOrientation(0);
                        TuxTextView tuxTextView = new TuxTextView(linearLayout.getContext(), null, 6, 0);
                        tuxTextView.setText(i);
                        tuxTextView.setTextColor(C497740JfY.LIZLLL(R.attr.ezs, tuxTextView.getContext()));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                        linearLayout.addView(tuxTextView, layoutParams);
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                        view = linearLayout;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.hfg, viewGroup, false);
                    C1322110kVd c1322110kVd = (C1322110kVd) viewTd.findViewById(R.id.kb7);
                    C1143920fsE c1143920fsE = new C1143920fsE();
                    c1143920fsE.LIZ = c1322110kVd;
                    c1143920fsE.LIZIZ = "tiktok_live_interaction_normal_1";
                    c1143920fsE.LIZJ = "notice_board_faq1.webp";
                    c1143920fsE.LJ = new C1143950fsH() { // from class: X.0bON
                        @Override // X.C1143950fsH
                        public final void LJ(Animatable animatable) {
                            C20441214yg.LJIIIZ("NoticeBoardFAQDialog", "startGeckoWebpController onStart");
                        }

                        @Override // X.C1143950fsH
                        public final void LJFF(Animatable animatable) {
                            C20441214yg.LJIIIZ("NoticeBoardFAQDialog", "startGeckoWebpController onStop");
                        }
                    };
                    C1143680frq.LJIIIIZZ(c1143920fsE);
                    C1322110kVd c1322110kVd2 = (C1322110kVd) viewTd.findViewById(R.id.kb8);
                    C1143920fsE c1143920fsE2 = new C1143920fsE();
                    c1143920fsE2.LIZ = c1322110kVd2;
                    c1143920fsE2.LIZIZ = "tiktok_live_interaction_normal_1";
                    c1143920fsE2.LIZJ = "notice_board_faq2.webp";
                    c1143920fsE2.LJ = new C1143950fsH() { // from class: X.0bOO
                        @Override // X.C1143950fsH
                        public final void LJ(Animatable animatable) {
                            C20441214yg.LJIIIZ("NoticeBoardFAQDialog", "startGeckoWebpController onStart");
                        }

                        @Override // X.C1143950fsH
                        public final void LJFF(Animatable animatable) {
                            C20441214yg.LJIIIZ("NoticeBoardFAQDialog", "startGeckoWebpController onStop");
                        }
                    };
                    C1143680frq.LJIIIIZZ(c1143920fsE2);
                    ((TextView) viewTd.findViewById(R.id.z1z)).setText(2131853972);
                    ((TextView) viewTd.findViewById(R.id.z20)).setText(2131853967);
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    view = viewTd;
                }
            } else {
                LinearLayout linearLayout2 = new LinearLayout(getContext());
                linearLayout2.setOrientation(0);
                View view2 = new View(linearLayout2.getContext());
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.ex7, view2.getContext()));
                gradientDrawable.setSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
                view2.setBackground(gradientDrawable);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
                layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
                layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                linearLayout2.addView(view2, layoutParams2);
                TuxTextView tuxTextView2 = new TuxTextView(linearLayout2.getContext(), null, 6, 0);
                tuxTextView2.setText(i);
                tuxTextView2.setTextColor(C497740JfY.LIZLLL(R.attr.ezs, tuxTextView2.getContext()));
                linearLayout2.addView(tuxTextView2, new LinearLayout.LayoutParams(-2, -2));
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                view = linearLayout2;
            }
        } else {
            TuxTextView tuxTextView3 = new TuxTextView(getContext(), null, 6, 0);
            tuxTextView3.setText(i);
            tuxTextView3.setTextColor(C497740JfY.LIZLLL(R.attr.ezq, tuxTextView3.getContext()));
            tuxTextView3.setTuxFont(43);
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            view = tuxTextView3;
        }
        C19ME c19me = new C19ME(-1, -2);
        ((ViewGroup.MarginLayoutParams) c19me).topMargin = iLIZIZ;
        viewGroup.addView(view, c19me);
    }
}
