package X;

import Y.AComparatorS37S0000000_18;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.worldcup.model.WorldCupMatch;
import com.ss.android.ugc.aweme.poi.detail.worldcup.model.WorldCupMatchStatus;
import com.ss.android.ugc.aweme.poi.detail.worldcup.model.WorldCupMatchTeam;
import com.zhiliaoapp.musically.R;
import irm.AkS6S1100000_18;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205640hTm extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public int LLJJIJIL;

    private final SmartImageView getFlagLeft() {
        return (SmartImageView) this.LL.getValue();
    }

    private final SmartImageView getFlagRight() {
        return (SmartImageView) this.LLILLJJLI.getValue();
    }

    private final View getHighlightsContainer() {
        return (View) this.LLJJIII.getValue();
    }

    private final TuxIconView getIvHighlightsIcon() {
        return (TuxIconView) this.LLJJIJI.getValue();
    }

    private final TuxTextView getNameLeft() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final TuxTextView getNameRight() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    private final View getRedCardLeft() {
        return (View) this.LLJIJIL.getValue();
    }

    private final View getRedCardRight() {
        return (View) this.LLJILJIL.getValue();
    }

    private final View getScoreContainer() {
        return (View) this.LLILZLL.getValue();
    }

    private final TuxTextView getTvDisplayInfo() {
        return (TuxTextView) this.LLJJI.getValue();
    }

    private final TuxTextView getTvHighlights() {
        return (TuxTextView) this.LLJJIJIIJIL.getValue();
    }

    private final TuxTextView getTvPenaltyLeft() {
        return (TuxTextView) this.LLJ.getValue();
    }

    private final TuxTextView getTvPenaltyRight() {
        return (TuxTextView) this.LLJI.getValue();
    }

    private final TuxTextView getTvRedCardLeft() {
        return (TuxTextView) this.LLJILJILJ.getValue();
    }

    private final TuxTextView getTvRedCardRight() {
        return (TuxTextView) this.LLJILLL.getValue();
    }

    private final TuxTextView getTvScoreRight() {
        return (TuxTextView) this.LLIZLLLIL.getValue();
    }

    private final TuxTextView getTvStage() {
        return (TuxTextView) this.LLILZIL.getValue();
    }

    private final TuxTextView getTvStartTime() {
        return (TuxTextView) this.LLJJ.getValue();
    }

    public final TuxTextView getTvScoreLeft() {
        return (TuxTextView) this.LLIZ.getValue();
    }

    private final void setScoreMarginDp(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i2 = (int) ((i + 3) * getResources().getDisplayMetrics().density);
        ViewGroup.LayoutParams layoutParams = getTvScoreLeft().getLayoutParams();
        if ((layoutParams instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams2.setMarginEnd(i2);
            C786410Ut5.R6(getTvScoreLeft(), marginLayoutParams2);
        }
        ViewGroup.LayoutParams layoutParams2 = getTvScoreRight().getLayoutParams();
        if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.setMarginStart(i2);
            C786410Ut5.R6(getTvScoreRight(), marginLayoutParams);
        }
    }

    public final void i0(int i) {
        if (getParent() != null && this.LLJJIJIL == i && getScoreContainer().getVisibility() == 0) {
            float f = getResources().getDisplayMetrics().density;
            int i2 = 2;
            int width = getScoreContainer().getWidth() / 2;
            int iMax = Math.max(j0(getTvPenaltyLeft(), getRedCardLeft(), f), j0(getTvPenaltyRight(), getRedCardRight(), f));
            String string = getTvScoreLeft().getText().toString();
            String string2 = getTvScoreRight().getText().toString();
            if (new AComparatorS37S0000000_18(2).compare(string, string2) < 0) {
                string = string2;
            }
            int i3 = 33;
            List listLJIIJJI = C1697810uHb.LJIIJJI(new C443120HZe(123, 32, 12), new C443120HZe(13, 24, 12), new C443120HZe(23, 20, 12), new C443120HZe(33, 17, 12), new C443120HZe(33, 17, 2));
            TextPaint textPaint = new TextPaint(getTvScoreLeft().getPaint());
            Iterator it2 = listLJIIJJI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C443120HZe c443120HZe = (C443120HZe) it2.next();
                int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
                int iIntValue2 = ((Number) c443120HZe.getSecond()).intValue();
                int iIntValue3 = ((Number) c443120HZe.getThird()).intValue();
                textPaint.setTextSize(iIntValue2 * f);
                if (textPaint.measureText(string) <= (width - ((int) ((iIntValue3 + 3) * f))) - iMax) {
                    i2 = iIntValue3;
                    i3 = iIntValue;
                    if (iIntValue == 123 && iIntValue3 == 12) {
                        return;
                    }
                }
            }
            getTvScoreLeft().setTuxFont(i3);
            getTvScoreRight().setTuxFont(i3);
            setScoreMarginDp(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108 A[PHI: r5
      0x0108: PHI (r5v2 int) = (r5v1 int), (r5v5 int) binds: [B:49:0x0104, B:23:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(com.ss.android.ugc.aweme.poi.detail.worldcup.model.WorldCupMatch r7) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1205640hTm.p0(com.ss.android.ugc.aweme.poi.detail.worldcup.model.WorldCupMatch):void");
    }

    public C1205640hTm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void l0(WorldCupMatchTeam worldCupMatchTeam, TuxTextView tuxTextView) {
        int iIntValue;
        Integer num;
        if (worldCupMatchTeam != null && (num = worldCupMatchTeam.penaltyScore) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append(iIntValue);
        sbLIZ.append(')');
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void e0(WorldCupMatch worldCupMatch, AwS597S0100000_18 awS597S0100000_18) {
        String str;
        String str2;
        String strName;
        String str3;
        int i;
        h0(worldCupMatch.homeTeam, getFlagLeft(), getNameLeft());
        h0(worldCupMatch.awayTeam, getFlagRight(), getNameRight());
        TuxTextView tvStage = getTvStage();
        String str4 = worldCupMatch.stage;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        tvStage.setText(str4);
        WorldCupMatchStatus worldCupMatchStatus = worldCupMatch.status;
        if (worldCupMatchStatus == null) {
            worldCupMatchStatus = WorldCupMatchStatus.UNKNOWN;
        }
        int i2 = C1205650hTn.LIZ[worldCupMatchStatus.ordinal()];
        if (i2 != 1 && i2 != 2) {
            C786410Ut5.LJLLLLLL(8, getScoreContainer());
            String str6 = worldCupMatch.startTime;
            if (str6 == null) {
                str6 = "";
            }
            TuxTextView tvStartTime = getTvStartTime();
            if (str6.length() == 0) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLZLL(tvStartTime, i);
            getTvStartTime().setText(str6);
        } else {
            p0(worldCupMatch);
            C786410Ut5.LLLLZLL(getTvStartTime(), 8);
        }
        String str7 = worldCupMatch.displayInfo;
        if (str7 != null && !a0.LJJJIL(str7)) {
            if (worldCupMatchStatus == WorldCupMatchStatus.FINISHED) {
                C786410Ut5.LLLLZLL(getTvDisplayInfo(), 8);
                C786410Ut5.LJLLLLLL(0, getHighlightsContainer());
                getTvHighlights().setText(str7);
                getIvHighlightsIcon().setTintColor(C446980Hfs.LIZ(getContext(), R.color.cr));
            } else {
                C786410Ut5.LJLLLLLL(8, getHighlightsContainer());
                C786410Ut5.LLLLZLL(getTvDisplayInfo(), 0);
                getTvDisplayInfo().setText(str7);
                if (worldCupMatchStatus == WorldCupMatchStatus.IN_PROGRESS) {
                    getTvDisplayInfo().setTuxFont(72);
                    getTvDisplayInfo().setTextColorRes(R.attr.a1h);
                } else {
                    getTvDisplayInfo().setTuxFont(71);
                    getTvDisplayInfo().setTextColorRes(R.attr.a1k);
                }
            }
        } else {
            C786410Ut5.LLLLZLL(getTvDisplayInfo(), 8);
            C786410Ut5.LJLLLLLL(8, getHighlightsContainer());
        }
        setClickable(false);
        setFocusable(false);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(null);
        String str8 = worldCupMatch.searchSchema;
        if (worldCupMatchStatus == WorldCupMatchStatus.FINISHED && str8 != null && !a0.LJJJIL(str8) && (str3 = worldCupMatch.displayInfo) != null && !a0.LJJJIL(str3)) {
            getHighlightsContainer().setClickable(true);
            getHighlightsContainer().setFocusable(true);
            C786410Ut5.I7(new AkS6S1100000_18(awS597S0100000_18, str8, 1), getHighlightsContainer());
        } else {
            getHighlightsContainer().setClickable(false);
            getHighlightsContainer().setFocusable(false);
            C786410Ut5.I7(null, getHighlightsContainer());
        }
        WorldCupMatchTeam worldCupMatchTeam = worldCupMatch.homeTeam;
        if (worldCupMatchTeam == null || (str = worldCupMatchTeam.regionName) == null) {
            str = "";
        }
        WorldCupMatchTeam worldCupMatchTeam2 = worldCupMatch.awayTeam;
        if (worldCupMatchTeam2 == null || (str2 = worldCupMatchTeam2.regionName) == null) {
            str2 = "";
        }
        WorldCupMatchStatus worldCupMatchStatus2 = worldCupMatch.status;
        if (worldCupMatchStatus2 != null && (strName = worldCupMatchStatus2.name()) != null) {
            str5 = strName;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Match between ");
        sbLIZ.append(str);
        sbLIZ.append(" and ");
        sbLIZ.append(str2);
        sbLIZ.append(", status ");
        sbLIZ.append(str5);
        setContentDescription(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1205640hTm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1326));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1327));
        this.LLILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1330));
        this.LLILZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1331));
        this.LLILZIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1343));
        this.LLILZLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1334));
        this.LLIZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1341));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1342));
        this.LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1337));
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1338));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1332));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1333));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1339));
        this.LLJILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1340));
        this.LLJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1344));
        this.LLJJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1335));
        this.LLJJIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1328));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1329));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1336));
    }

    public static void h0(WorldCupMatchTeam worldCupMatchTeam, SmartImageView smartImageView, TuxTextView tuxTextView) {
        UrlModel urlModel;
        String str = "";
        if (worldCupMatchTeam == null) {
            C786410Ut5.LLFF(8, smartImageView);
            tuxTextView.setText("");
            return;
        }
        String str2 = worldCupMatchTeam.regionName;
        if (str2 != null) {
            str = str2;
        }
        tuxTextView.setText(str);
        C786410Ut5.LLFF(0, smartImageView);
        if (C960203pA.LIZIZ(smartImageView.getContext())) {
            urlModel = worldCupMatchTeam.darkRegionFlag;
        } else {
            urlModel = worldCupMatchTeam.lightRegionFlag;
        }
        C1189360h3W c1189360h3WLIZ = new C1180600gpO("poi_detail", "poi_wc_list_national_flag", new C1180560gpK(smartImageView.getContext(), EnumC1177490gkN.FALLBACK_13_PX, new C1180580gpM(Float.valueOf(0.0f)), null)).LIZ(C438710HIf.LIZ(urlModel));
        c1189360h3WLIZ.LIZ.LIZLLL("PoiWorldCupMatchItemView");
        c1189360h3WLIZ.LIZLLL(smartImageView);
        c1189360h3WLIZ.LIZIZ();
    }

    public static int j0(TuxTextView tuxTextView, View view, float f) {
        boolean z;
        int width;
        int width2 = 0;
        if (tuxTextView.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            width = tuxTextView.getWidth() + ((int) (6 * f));
        } else {
            width = 0;
        }
        if (view.getVisibility() == 0) {
            width2 = view.getWidth() + ((int) (6 * f));
        }
        return width + width2;
    }

    public static void n0(WorldCupMatchTeam worldCupMatchTeam, View view, TuxTextView tuxTextView) {
        Integer num;
        int iIntValue;
        if (worldCupMatchTeam != null && (num = worldCupMatchTeam.redCards) != null && (iIntValue = num.intValue()) > 0) {
            C786410Ut5.LJLLLLLL(0, view);
            tuxTextView.setText(String.valueOf(iIntValue));
        } else {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }
}
