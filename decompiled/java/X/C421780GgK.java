package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.baselist.FYPPageStateImp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GgK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421780GgK extends C09AY implements Function0<ViewGroup> {
    public final /* synthetic */ FYPPageStateImp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C421780GgK(FYPPageStateImp fYPPageStateImp) {
        super(0);
        this.LL = fYPPageStateImp;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.view.ViewGroup] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ViewGroup invoke() {
        C1749280vcc c1749280vcc = this.LL.LLJILJILJ;
        if (c1749280vcc == null) {
            return null;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c1749280vcc.getContext()), R.layout.b6c, c1749280vcc, true);
        ?? FindViewById = viewTd.findViewById(R.id.tsc);
        ((C417130GXf) FindViewById.findViewById(R.id.dts)).setDisplayMode(EnumC429090Gs7.PROGRESS);
        if (C296090Bj5.LIZ()) {
            int iLIZIZ = C296090Bj5.LIZIZ();
            int i = iLIZIZ != 1 ? iLIZIZ != 2 ? iLIZIZ != 3 ? R.raw.icon_color_like_shadow_alt_1 : R.raw.icon_exp_exp_02_icon_media_like : R.raw.icon_exp_exp_01_icon_media_like : R.raw.icon_media_like;
            TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.mnv);
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = i;
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            int iLIZIZ2 = C296090Bj5.LIZIZ();
            int i2 = iLIZIZ2 != 1 ? iLIZIZ2 != 2 ? iLIZIZ2 != 3 ? R.raw.icon_color_comment_shadow_alt_1 : R.raw.icon_exp_exp_02_icon_media_comment : R.raw.icon_exp_exp_01_icon_media_comment : R.raw.icon_media_comment;
            TuxIconView tuxIconView2 = (TuxIconView) viewTd.findViewById(R.id.eb3);
            if (tuxIconView2 != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = i2;
                tuxIconView2.setTuxIcon(c419910GdJ2);
            }
            int iLIZIZ3 = C296090Bj5.LIZIZ();
            int i3 = iLIZIZ3 != 1 ? iLIZIZ3 != 2 ? iLIZIZ3 != 3 ? R.raw.icon_color_bookmark_shadow_alt_1 : R.raw.icon_exp_exp_02_icon_media_favoriate : R.raw.icon_exp_exp_01_icon_media_favoriate : R.raw.icon_media_favoriate;
            TuxIconView tuxIconView3 = (TuxIconView) viewTd.findViewById(R.id.hq8);
            if (tuxIconView3 != null) {
                C419910GdJ c419910GdJ3 = new C419910GdJ();
                c419910GdJ3.LIZ = i3;
                tuxIconView3.setTuxIcon(c419910GdJ3);
            }
            int iLIZIZ4 = C296090Bj5.LIZIZ();
            int i4 = iLIZIZ4 != 1 ? iLIZIZ4 != 2 ? iLIZIZ4 != 3 ? R.raw.icon_color_share_shadow_alt_2 : R.raw.icon_exp_exp_02_icon_media_share : R.raw.icon_exp_exp_01_icon_media_share : R.raw.icon_media_share;
            TuxIconView tuxIconView4 = (TuxIconView) viewTd.findViewById(R.id.uzg);
            if (tuxIconView4 != null) {
                C419910GdJ c419910GdJ4 = new C419910GdJ();
                c419910GdJ4.LIZ = i4;
                tuxIconView4.setTuxIcon(c419910GdJ4);
            }
        }
        if (C305550ByL.LIZLLL()) {
            C339190DRl.LIZLLL(FindViewById.findViewById(R.id.vfl));
            View viewFindViewById = FindViewById.findViewById(R.id.vfl);
            if (viewFindViewById != null) {
                C426750GoL.LJIIIZ(viewFindViewById, 0, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL)))), false, 16);
            }
            View viewFindViewById2 = FindViewById.findViewById(R.id.otv);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
            viewFindViewById2.setBackground(c384050F3z.LIZ(c1749280vcc.getContext()));
            View viewFindViewById3 = FindViewById.findViewById(R.id.user_avatar);
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.ee);
            viewFindViewById3.setBackground(c384050F3z2.LIZ(c1749280vcc.getContext()));
            View viewFindViewById4 = FindViewById.findViewById(R.id.fns);
            C384050F3z c384050F3z3 = new C384050F3z();
            c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z3.LIZIZ = Integer.valueOf(R.attr.ee);
            viewFindViewById4.setBackground(c384050F3z3.LIZ(c1749280vcc.getContext()));
            View viewFindViewById5 = FindViewById.findViewById(R.id.fnu);
            C384050F3z c384050F3z4 = new C384050F3z();
            c384050F3z4.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z4.LIZIZ = Integer.valueOf(R.attr.ee);
            viewFindViewById5.setBackground(c384050F3z4.LIZ(c1749280vcc.getContext()));
            View viewFindViewById6 = FindViewById.findViewById(R.id.fnt);
            C384050F3z c384050F3z5 = new C384050F3z();
            c384050F3z5.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z5.LIZIZ = Integer.valueOf(R.attr.ee);
            viewFindViewById6.setBackground(c384050F3z5.LIZ(c1749280vcc.getContext()));
        }
        return FindViewById;
    }
}
