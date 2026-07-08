package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.10wE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19406810wE extends FrameLayout {
    public final int LL;
    public final boolean LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    private final View getAvatarContainer() {
        return (View) this.LLJ.getValue();
    }

    private final C427660Gpo getAvatarView() {
        return (C427660Gpo) this.LLIZLLLIL.getValue();
    }

    private final TuxTextView getChampionTag() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final C362690EJv getPlaceHolderView() {
        return (C362690EJv) this.LLIZ.getValue();
    }

    private final TuxTextView getTvName() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    private final TuxTextView getTvRank() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    private final TuxTextView getTvScore() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    public final int getPosition() {
        return this.LL;
    }

    public C19406810wE(int i, Context context) {
        super(context);
        this.LL = i;
        this.LLILLJJLI = C426750GoL.LIZLLL(context);
        this.LLILLL = C452501pT.LIZIZ(new AwS430S0200000_29(context, this, 127));
        this.LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1092));
        this.LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1093));
        this.LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1094));
        this.LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1091));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1090));
        this.LLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1089));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.csj, this, true);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
        if (i == 0) {
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(12));
        } else if (i == 1) {
            c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(12));
        }
        setBackground(c384050F3z.LIZ(context));
        getTvRank().setText(String.valueOf(i + 1));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float x;
        super.onLayout(z, i, i2, i3, i4);
        if (this.LL == 0) {
            TuxTextView championTag = getChampionTag();
            if (this.LLILLJJLI) {
                x = getAvatarContainer().getX();
            } else {
                x = getAvatarContainer().getX() + C418440Gaw.LIZIZ(10);
            }
            C786410Ut5.Jd(championTag, x);
        }
    }

    public final void LIZ(Double d, IMUser iMUser, boolean z, boolean z2, boolean z3, int i, EnumC19360410ok enumC19360410ok, String str) {
        String strLIZ;
        if (z2) {
            C337180DJs.LIZJ(getTvRank());
            getTvRank().setText(String.valueOf(i));
        } else {
            C1584506Ih.LIZ(getTvRank());
        }
        if (iMUser == null) {
            C1584506Ih.LIZ(getAvatarView());
            C337180DJs.LIZJ(getPlaceHolderView());
            C362690EJv placeHolderView = getPlaceHolderView();
            placeHolderView.LLIZ = 12;
            placeHolderView.invalidate();
            getTvName().setText(getContext().getString(2131831832));
        } else {
            C337180DJs.LIZJ(getAvatarView());
            C1584506Ih.LIZ(getPlaceHolderView());
            TuxTextView tvName = getTvName();
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null && iIMContactUtilServiceLIZ.LJIIIZ(iMUser)) {
                strLIZ = getContext().getString(2131831836);
            } else {
                strLIZ = C892130YzD.LIZ(iMUser, str);
            }
            tvName.setText(strLIZ);
            C427660Gpo.LJIIJJI(getAvatarView(), C438710HIf.LIZ(iMUser.getAvatarThumb()), false, null, null, false, false, null, null, false, null, 1022);
        }
        if (d == null) {
            if (z3) {
                getTvScore().setText(getContext().getString(2131831803));
            } else {
                getTvScore().setText(getContext().getString(2131831797));
            }
            getTvScore().setTuxFont(62);
            getTvScore().setTextColorRes(R.attr.a1p);
            getTvScore().setTypeface(C1697580uHE.LIZIZ(0.0f, 500, 0.0f, 0.0f, null, 0.0f, 0, null, 253));
            return;
        }
        getTvScore().setTuxFont(63);
        getTvScore().setTextColorRes(R.attr.a1h);
        getTvScore().setTypeface(C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 0.0f, 0.0f, null, -6.0f, 0, null, 221));
        if (this.LL == 0 && z) {
            if (getChampionTag().getParent() == null) {
                addView(getChampionTag(), new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17))));
            }
        } else {
            TuxTextView championTag = getChampionTag();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, championTag);
            removeView(championTag);
        }
        getTvScore().setText(C19361410ou.LIZIZ(d, enumC19360410ok));
    }
}
