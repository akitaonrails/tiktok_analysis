package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0tOJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663530tOJ extends FrameLayout implements InterfaceC1663540tOK {
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public C424650Gkx LLILZ;
    public C424630Gkv LLILZIL;
    public C427660Gpo LLILZLL;
    public TextView LLIZ;
    public TextView LLIZLLLIL;
    public boolean LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;
    public TuxIconView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public FrameLayout LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public C427660Gpo LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public TextView LLJJJ;

    public final void LIZ() {
        UrlModel avatarThumb;
        List<String> urlList;
        Object obj;
        C427660Gpo c427660Gpo;
        UrlModel avatarThumb2;
        String strLIZJ;
        if (this.LLJ) {
            return;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.i9z, this, false);
        this.LLJJ = viewTd.findViewById(R.id.yad);
        this.LL = viewTd.findViewById(R.id.j88);
        this.LLILLJJLI = viewTd.findViewById(R.id.j6a);
        this.LLILLL = viewTd.findViewById(R.id.j4q);
        this.LLILZ = (C424650Gkx) viewTd.findViewById(R.id.user_avatar);
        this.LLJJI = viewTd.findViewById(R.id.y9r);
        this.LLJJIII = (C427660Gpo) viewTd.findViewById(R.id.w_h);
        this.LLJJIJIIJIL = viewTd.findViewById(R.id.sv5);
        this.LLJJIJIL = (TuxIconView) viewTd.findViewById(R.id.w8y);
        this.LLJJJ = (TextView) viewTd.findViewById(R.id.w_y);
        this.LLJJIJI = viewTd.findViewById(R.id.t0a);
        this.LLILZIL = (C424630Gkv) viewTd.findViewById(R.id.otv);
        this.LLILZLL = (C427660Gpo) viewTd.findViewById(R.id.ptd);
        this.LLIZ = (TextView) viewTd.findViewById(R.id.zym);
        this.LLIZLLLIL = (TextView) viewTd.findViewById(R.id.zy8);
        C424650Gkx c424650Gkx = this.LLILZ;
        if (c424650Gkx != null) {
            c424650Gkx.setBorderColor(R.attr.ee);
        }
        if (C298250BmZ.LIZ()) {
            ((TextView) viewTd.findViewById(R.id.ya3)).setText(C555520LqY.LIZIZ(2131834793));
            ((TextView) viewTd.findViewById(R.id.ya4)).setText(C555520LqY.LIZIZ(2131850698));
        }
        View view = this.LL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        addView(viewTd);
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null || currentUser.getAvatarThumb() == null) {
            C1324750kZt.LIZIZ(this.LLILZ, 2130971789);
            C427660Gpo c427660Gpo2 = this.LLJJIII;
            if (c427660Gpo2 != null) {
                C427660Gpo.LJIIJJI(c427660Gpo2, 2130971789, false, null, null, false, false, null, null, false, null, 1022);
            }
        } else {
            C1324750kZt.LJI(this.LLILZ, currentUser.getAvatarThumb(), (int) C11VU.LIZIZ(49.0f, getContext()), (int) C11VU.LIZIZ(49.0f, getContext()));
            C427660Gpo c427660Gpo3 = this.LLJJIII;
            if (c427660Gpo3 != null) {
                C427660Gpo.LJIIJJI(c427660Gpo3, C438710HIf.LIZ(currentUser.getAvatarThumb()), false, null, null, false, false, null, null, false, null, 990);
            }
        }
        TextView textView = this.LLIZ;
        if (textView != null) {
            if (C0FEA.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('@');
                C1464900oDw c1464900oDw = C1464900oDw.LIZ;
                C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
                Resources resources = getResources();
                c1464900oDw.getClass();
                sbLIZ.append(C1464900oDw.LIZJ(currentUser2, resources));
                strLIZJ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                C1464900oDw c1464900oDw2 = C1464900oDw.LIZ;
                C19292410dm currentUser3 = C0CHQ.LIZ().getAccountService().getCurrentUser();
                Resources resources2 = getResources();
                c1464900oDw2.getClass();
                strLIZJ = C1464900oDw.LIZJ(currentUser3, resources2);
            }
            textView.setText(strLIZJ);
        }
        if (C0FEA.LIZIZ()) {
            TextView textView2 = this.LLIZ;
            if (textView2 != null) {
                textView2.setTextSize(17.0f);
            }
        } else {
            TextView textView3 = this.LLIZ;
            if (textView3 != null) {
                textView3.setTextSize(15.0f);
            }
        }
        List<String> urlList2 = (currentUser == null || (avatarThumb2 = currentUser.getAvatarThumb()) == null) ? null : avatarThumb2.getUrlList();
        if (urlList2 != null && !urlList2.isEmpty() && currentUser != null && (avatarThumb = currentUser.getAvatarThumb()) != null && (urlList = avatarThumb.getUrlList()) != null && (obj = ListProtector.get(urlList, 0)) != null && (c427660Gpo = this.LLILZLL) != null) {
            C427660Gpo.LJIIJJI(c427660Gpo, obj, false, null, null, false, false, null, null, false, null, 1022);
        }
        C1324750kZt.LIZIZ(this.LLILZIL, R.drawable.bzg);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_music_note_s_alt;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.getMinimumWidth(), tuxIconDrawableLIZ.getMinimumHeight());
        if (C426750GoL.LIZLLL(getContext())) {
            TextView textView4 = this.LLIZLLLIL;
            if (textView4 != null) {
                textView4.setCompoundDrawables(null, null, tuxIconDrawableLIZ, null);
            }
        } else {
            TextView textView5 = this.LLIZLLLIL;
            if (textView5 != null) {
                textView5.setCompoundDrawables(tuxIconDrawableLIZ, null, null, null);
            }
        }
        TextView textView6 = this.LLIZLLLIL;
        if (textView6 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            C1464900oDw c1464900oDw3 = C1464900oDw.LIZ;
            Context context = getContext();
            C19292410dm currentUser4 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            c1464900oDw3.getClass();
            sbLIZ2.append(C1464900oDw.LIZ(context, currentUser4));
            textView6.setText(C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LLJ = true;
        this.LLJI = (TuxIconView) viewTd.findViewById(R.id.rqc);
        this.LLJIJIL = (TuxIconView) viewTd.findViewById(R.id.rq_);
        this.LLJILJIL = (TuxIconView) viewTd.findViewById(R.id.rqd);
        this.LLJILJILJ = (TuxIconView) viewTd.findViewById(R.id.gzy);
        this.LLJILLL = (FrameLayout) viewTd.findViewById(R.id.ou2);
        View view2 = this.LLJJ;
        if (view2 != null) {
            C786410Ut5.T4(view2, 0.5f);
        }
        C424650Gkx c424650Gkx2 = this.LLILZ;
        if (c424650Gkx2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424650Gkx2);
            c424650Gkx2.setAlpha(0.5f);
        }
        TuxIconView tuxIconView = this.LLJI;
        if (tuxIconView != null) {
            C786410Ut5.x5(tuxIconView, 0.5f);
        }
        TuxIconView tuxIconView2 = this.LLJIJIL;
        if (tuxIconView2 != null) {
            C786410Ut5.x5(tuxIconView2, 0.5f);
        }
        TuxIconView tuxIconView3 = this.LLJILJIL;
        if (tuxIconView3 != null) {
            C786410Ut5.x5(tuxIconView3, 0.5f);
        }
        TextView textView7 = this.LLIZ;
        if (textView7 != null) {
            C786410Ut5.S4(0.5f, textView7);
        }
        TextView textView8 = this.LLIZLLLIL;
        if (textView8 != null) {
            C786410Ut5.S4(0.5f, textView8);
        }
        TuxIconView tuxIconView4 = this.LLJILJILJ;
        if (tuxIconView4 != null) {
            C786410Ut5.x5(tuxIconView4, 0.5f);
        }
        FrameLayout frameLayout = this.LLJILLL;
        if (frameLayout != null) {
            C786410Ut5.U4(frameLayout, 0.5f);
        }
        C427660Gpo c427660Gpo4 = this.LLJJIII;
        if (c427660Gpo4 != null) {
            C786410Ut5.v5(c427660Gpo4, 0.5f);
        }
        View view3 = this.LLJJIJIIJIL;
        if (view3 != null) {
            C786410Ut5.T4(view3, 0.45f);
        }
        TuxIconView tuxIconView5 = this.LLJJIJIL;
        if (tuxIconView5 != null) {
            C786410Ut5.x5(tuxIconView5, 0.5f);
        }
        TextView textView9 = this.LLJJJ;
        if (textView9 != null) {
            C786410Ut5.S4(0.5f, textView9);
        }
        View view4 = this.LLJJIJI;
        if (view4 != null) {
            C786410Ut5.T4(view4, 0.17f);
        }
    }

    @Override // X.InterfaceC1663540tOK
    public View getContentView() {
        LIZ();
        return this;
    }

    public final View getGradualMaskBottom() {
        return this.LLILLL;
    }

    public final View getGroupBottomLine() {
        return this.LLILLJJLI;
    }

    public final View getGroupRightLine() {
        return this.LL;
    }

    public final boolean getHasInit() {
        return this.LLJ;
    }

    public final C427660Gpo getIvOriginMusicCover() {
        return this.LLILZLL;
    }

    public final C424650Gkx getMAvatarView() {
        return this.LLILZ;
    }

    public final C424630Gkv getMMusicCoverView() {
        return this.LLILZIL;
    }

    public final TextView getTvMusic() {
        return this.LLIZLLLIL;
    }

    public final TextView getTvName() {
        return this.LLIZ;
    }

    public C1663530tOJ(Context context) {
        super(context);
    }

    public final void LIZIZ(boolean z) {
        LIZ();
        View view = this.LLILLL;
        int i = 0;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            if (!z) {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
    }

    public final void LIZJ(boolean z) {
        int i;
        LIZ();
        View view = this.LL;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void LIZLLL(boolean z) {
        int i;
        LIZ();
        View view = this.LLJJI;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void LJ(boolean z) {
        int i;
        LIZ();
        View view = this.LLJJ;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void setGradualMaskBottom(View view) {
        this.LLILLL = view;
    }

    public final void setGroupBottomLine(View view) {
        this.LLILLJJLI = view;
    }

    public final void setGroupRightLine(View view) {
        this.LL = view;
    }

    public final void setHasInit(boolean z) {
        this.LLJ = z;
    }

    public final void setIvOriginMusicCover(C427660Gpo c427660Gpo) {
        this.LLILZLL = c427660Gpo;
    }

    public final void setMAvatarView(C424650Gkx c424650Gkx) {
        this.LLILZ = c424650Gkx;
    }

    public final void setMMusicCoverView(C424630Gkv c424630Gkv) {
        this.LLILZIL = c424630Gkv;
    }

    public final void setTvMusic(TextView textView) {
        this.LLIZLLLIL = textView;
    }

    public final void setTvName(TextView textView) {
        this.LLIZ = textView;
    }
}
