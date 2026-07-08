package X;

import Y.AfS78S0101000_7;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.setting.LiveDrawerTabLandingCustomSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C468460IYq extends AbstractC468490IYt {
    public final C11RK<Boolean> LLILLL;
    public final String LLILZ;
    public final View LLILZIL;
    public final TextView LLILZLL;
    public final TextView LLIZ;
    public final C16F5 LLIZLLLIL;
    public final LiveIconView LLJ;

    public final void P5(int i) {
        if (i == 0) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_empty_show");
            C467800IWc c467800IWc = C467800IWc.LJIJ;
            c474500IjALIZ.LJJII(Integer.valueOf(c467800IWc.LJ()), "has_banner");
            c474500IjALIZ.LJJII(c467800IWc.LJIIIIZZ, "tab_type");
            c474500IjALIZ.LJJII(c467800IWc.LJIIL, "landing_reason");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_explore_no_more_show");
        C467800IWc c467800IWc2 = C467800IWc.LJIJ;
        c474500IjALIZ2.LJJII(Integer.valueOf(c467800IWc2.LJ()), "has_banner");
        c474500IjALIZ2.LJJII(c467800IWc2.LJIIIIZZ, "tab_type");
        c474500IjALIZ2.LJJII(this.LLILZ, "no_more_type");
        c474500IjALIZ2.LJJII(c467800IWc2.LJIIL, "landing_reason");
        c474500IjALIZ2.LJJII(Integer.valueOf(i), "show_num");
        c474500IjALIZ2.LJJII(C0IXQ.LIZIZ(), C467800IWc.LJIL);
        c474500IjALIZ2.LJJII(Integer.valueOf(c467800IWc2.LJI() ? 1 : 0), C467800IWc.LJIJJLI);
        c474500IjALIZ2.LJJII(c467800IWc2.LIZIZ(), "entrance_type");
        c474500IjALIZ2.LJIL();
        c474500IjALIZ2.LIZ();
    }

    @Override // X.AbstractC468490IYt
    public final void I5(int i, Object obj) {
        if (i == 0) {
            C786410Ut5.LJLLLLLL(0, this.LLILZIL);
            C786410Ut5.LLIL(this.LLILZLL, 8);
            LiveDrawerTabLandingCustomSetting liveDrawerTabLandingCustomSetting = LiveDrawerTabLandingCustomSetting.INSTANCE;
            if (liveDrawerTabLandingCustomSetting.getValue()) {
                C470390IcX.LIZ(this.LLJ, R.attr.eoe);
            } else {
                this.LLJ.setIconAttr(R.attr.dy_);
            }
            LiveIconView liveIconView = this.LLJ;
            if (liveDrawerTabLandingCustomSetting.getValue()) {
                C0JAI.LJII(C439101nJ.LIZ(130), C439101nJ.LIZ(96), liveIconView);
                C0JAI.LJFF(liveIconView, 108.0f);
            } else {
                C0JAI.LJII(C439101nJ.LIZ(72), C439101nJ.LIZ(72), liveIconView);
                C0JAI.LJFF(liveIconView, 132.0f);
            }
        } else {
            C786410Ut5.LJLLLLLL(8, this.LLILZIL);
            C786410Ut5.LLIL(this.LLILZLL, 0);
        }
        if (this.LLILZ.contains("game_drawer_drops")) {
            this.LLILZLL.setText("");
            this.LLIZ.setText(2131841774);
            this.LLIZLLLIL.setText(2131841773);
        } else if ("following".equals(this.LLILZ)) {
            this.LLILZLL.setText(2131841459);
            this.LLIZ.setText(2131841462);
            this.LLIZLLLIL.setText(2131841459);
        } else if ("outdoor".equals(this.LLILZ)) {
            this.LLILZLL.setText(2131841642);
            this.LLIZ.setText(2131841462);
            this.LLIZLLLIL.setText(2131841641);
        } else if ("fashion".equals(this.LLILZ)) {
            this.LLILZLL.setText(2131841640);
            this.LLIZ.setText(2131841462);
            this.LLIZLLLIL.setText(2131841639);
        } else if ("mix_talent".equals(this.LLILZ)) {
            this.LLILZLL.setText(2131841644);
            this.LLIZ.setText(2131841462);
            this.LLIZLLLIL.setText(2131841643);
        } else if ("auction".equals(this.LLILZ)) {
            this.LLILZLL.setText(2131832858);
            this.LLIZ.setText(2131841462);
            this.LLIZLLLIL.setText(2131832858);
        } else if ("music_spotlight".equals(this.LLILZ)) {
            this.LLILZLL.setText(2131852029);
            this.LLIZ.setText(2131841462);
            this.LLIZLLLIL.setText(2131852028);
        } else {
            this.LLILZLL.setText(2131841465);
            this.LLIZ.setText(2131841462);
            this.LLIZLLLIL.setText(2131841464);
        }
        P5(i);
        C11RK<Boolean> c11rk = this.LLILLL;
        if (c11rk != null) {
            N5(c11rk.LJJLJLI(new AfS78S0101000_7(this, i, 0)));
        }
    }

    public C468460IYq(View view, C11RK<Boolean> c11rk, String str) {
        super(view);
        this.LLILLL = c11rk;
        this.LLILZ = str;
        this.LLJ = (LiveIconView) view.findViewById(R.id.h3g);
        this.LLILZIL = view.findViewById(R.id.h3f);
        this.LLILZLL = (TextView) view.findViewById(R.id.h58);
        this.LLIZ = (TextView) view.findViewById(R.id.g_z);
        this.LLIZLLLIL = (C16F5) view.findViewById(R.id.tv_suggested_desc);
    }
}
