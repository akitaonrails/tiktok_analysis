package X;

import Y.AfS175S0100000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel;
import com.ss.android.ugc.aweme.vibefeed.model.SummaryStats;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS580S0100000_1;
import org.json.JSONObject;
import wh6.AbS510S0200000_24;
import wh6.AbS687S0100000_4;
import wh6.AbS703S0100000_24;

/* JADX INFO: renamed from: X.0r6F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575450r6F {
    public final View LIZ;
    public final Context LIZIZ;
    public final Function0<Unit> LIZJ;
    public C11JF LIZLLL;
    public VibeFeedConsumeViewModel LJ;
    public JSONObject LJFF;
    public boolean LJI;
    public int LJII;
    public ViewTreeObserverOnGlobalLayoutListenerC521800KdG LJIIIZ;
    public DialogC1389620mGW LJIIJ;
    public EnumC1575470r6H LJIIIIZZ = EnumC1575470r6H.LOCKED;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1695));

    public final void LJ() {
        String strOptString;
        String strOptString2;
        JSONObject jSONObject = this.LJFF;
        String strOptString3 = jSONObject != null ? jSONObject.optString("conversation_id") : null;
        String str = "";
        if (strOptString3 == null) {
            strOptString3 = "";
        }
        C1575940r72 c1575940r72 = C1575940r72.LIZ;
        Context context = this.LIZIZ;
        JSONObject jSONObject2 = this.LJFF;
        if (jSONObject2 == null || (strOptString = jSONObject2.optString("to_user_id")) == null) {
            strOptString = "";
        }
        JSONObject jSONObject3 = this.LJFF;
        if (jSONObject3 != null && (strOptString2 = jSONObject3.optString("sec_user_id")) != null) {
            str = strOptString2;
        }
        int i = this.LJII;
        String strLIZLLL = C0P30.LIZ().LIZLLL(strOptString3);
        c1575940r72.getClass();
        C1575940r72.LIZ(i, context, strOptString3, strOptString, str, strLIZLLL, "shared_feed_summary", "shared_feed");
    }

    public final Drawable LJFF() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
        Drawable drawableLIZ = c384050F3z.LIZ(this.LIZIZ);
        drawableLIZ.setAlpha(15);
        return drawableLIZ;
    }

    public final EnumC912680ZrG LJI() {
        return (EnumC912680ZrG) this.LJIIJJI.getValue();
    }

    public final void LJIIIIZZ() {
        if (this.LJI) {
            DialogC1389620mGW dialogC1389620mGW = this.LJIIJ;
            if (dialogC1389620mGW != null) {
                C786410Ut5.J4(dialogC1389620mGW);
                return;
            }
            DialogC1389620mGW dialogC1389620mGW2 = new DialogC1389620mGW(this.LIZIZ);
            dialogC1389620mGW2.LJJLIIJ(false);
            this.LJIIJ = dialogC1389620mGW2;
            C786410Ut5.J4(dialogC1389620mGW2);
        }
    }

    public final void LIZ(SummaryStats summaryStats) {
        long jIntValue;
        long jLongValue;
        long jLongValue2;
        Long l;
        Long l2;
        Integer num;
        TextView textView = (TextView) this.LIZ.findViewById(R.id.zr6);
        long jCeil = 0;
        if (summaryStats != null && (num = summaryStats.historyCoLikedCount) != null) {
            jIntValue = num.intValue();
        } else {
            jIntValue = 0;
        }
        textView.setText(C1843500y4a.LIZIZ(jIntValue));
        TextView textView2 = (TextView) this.LIZ.findViewById(R.id.zr7);
        if (summaryStats != null && (l2 = summaryStats.historyDaysTogether) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        textView2.setText(C1843500y4a.LIZIZ(jLongValue));
        TextView textView3 = (TextView) this.LIZ.findViewById(R.id.zr8);
        if (summaryStats != null && (l = summaryStats.historyTimeSpentMin) != null) {
            jLongValue2 = l.longValue();
        } else {
            jLongValue2 = 0;
        }
        Long lValueOf = Long.valueOf(jLongValue2);
        if (lValueOf != null) {
            lValueOf.longValue();
            if (lValueOf.longValue() > 0) {
                jCeil = (long) Math.ceil(lValueOf.longValue() / 60.0d);
            }
        }
        textView3.setText(C1843500y4a.LIZIZ(jCeil));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c9  */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r15) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1575450r6F.LIZIZ(boolean):void");
    }

    public final void LIZJ(UrlModel urlModel) {
        UrlModel urlModel2;
        C11JF c11jf;
        C786410Ut5.LJLZ(8, (ViewGroup) this.LIZ.findViewById(R.id.onv));
        TuxIconView tuxIconView = (TuxIconView) this.LIZ.findViewById(R.id.l_2);
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        C2177251AIx c2177251AIx = new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), null, 0, 0, 0.9f, 0.0f, 0, 0, null, null, true, true, true, null, 73596);
        Context context = tuxIconView.getContext();
        UrlModel[] urlModelArr = new UrlModel[2];
        C1262570ixb.LIZ.getClass();
        User userLIZJ = C1262570ixb.LIZJ();
        if (userLIZJ == null || (urlModel2 = userLIZJ.getAvatarThumb()) == null) {
            urlModel2 = new UrlModel();
        }
        urlModelArr[0] = urlModel2;
        if (urlModel == null) {
            urlModel = new UrlModel();
        }
        urlModelArr[1] = urlModel;
        C2177241AIw c2177241AIw = new C2177241AIw(context, new C1246110iX3(C1697810uHb.LJIIJJI(urlModelArr), 2), c2177251AIx);
        tuxIconView.setImageBitmap(c2177241AIw.LIZ());
        C11JF c11jf2 = this.LIZLLL;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LIZLLL) != null) {
            c11jf.dispose();
        }
        this.LIZLLL = (C11JF) c2177241AIw.LIZLLL().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS175S0100000_6(tuxIconView, 15));
    }

    public static void LJII(int i, SmartImageView smartImageView) {
        C1575530r6N.LIZ.getClass();
        String strLIZIZ = C1575530r6N.LIZIZ();
        if (strLIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append("/vibe_both_like/");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ2);
                sbLIZ2.append(i);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
                if (strLIZIZ3 != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ3);
                    sbLIZ3.append(".png");
                    String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ3);
                    if (strLIZIZ4 != null) {
                        C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(strLIZIZ4));
                        c1331670kl3LJII.LJIL = Bitmap.Config.ARGB_8888;
                        c1331670kl3LJII.LJJ(smartImageView);
                        c1331670kl3LJII.LJIIJ(new C04J2(smartImageView, 2));
                    }
                }
            }
        }
    }

    public C1575450r6F(Context context, View view, C1575500r6K c1575500r6K) {
        this.LIZ = view;
        this.LIZIZ = context;
        this.LIZJ = c1575500r6K;
    }

    public final void LIZLLL(EnumC1575470r6H enumC1575470r6H, JSONObject jSONObject, VibeFeedConsumeViewModel vibeFeedConsumeViewModel) {
        String strOptString;
        UrlModel avatarThumb;
        C0P31 c0p31;
        Iterable iterable;
        UrlModel avatarThumb2;
        C0P3X state;
        SummaryStats summaryStatsLJIIIZ = null;
        if (jSONObject == null || (strOptString = jSONObject.optString("to_user_id")) == null) {
            strOptString = "";
        }
        IMUser iMUserLIZLLL = C1575440r6E.LIZLLL(strOptString);
        this.LJ = vibeFeedConsumeViewModel;
        this.LJFF = jSONObject;
        this.LJIIIIZZ = enumC1575470r6H;
        if (LJI().isGroup()) {
            VibeFeedConsumeViewModel vibeFeedConsumeViewModel2 = this.LJ;
            if (vibeFeedConsumeViewModel2 == null || (state = vibeFeedConsumeViewModel2.getState()) == null || (iterable = state.LLJI) == null) {
                iterable = C13BV.INSTANCE;
            }
            List listLJJII = C09RB.LJJII(C09RB.LJJI(C09RB.LJIJI(new C08QP(new C1939607ik(C13LP.LLIIII(iterable)), AFwS264S0000000_24.get$arr$(595)), AFwS264S0000000_24.get$arr$(596)), 4));
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            C1262570ixb.LIZ.getClass();
            User userLIZJ = C1262570ixb.LIZJ();
            if (userLIZJ != null) {
                avatarThumb2 = userLIZJ.getAvatarThumb();
            } else {
                avatarThumb2 = null;
            }
            c13dvLIZIZ.add(avatarThumb2);
            c13dvLIZIZ.addAll(listLJJII);
            List<? extends UrlModel> listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
            if (listLIZ.size() <= 2) {
                LIZJ((UrlModel) C13LP.LJJLIIIJL(listLIZ));
            } else {
                C786410Ut5.LLLLLLZZ((TuxIconView) this.LIZ.findViewById(R.id.l_2), 8);
                C0FG7 c0fg7 = (C0FG7) this.LIZ.findViewById(R.id.onv);
                c0fg7.LIZ(listLIZ, false);
                int visibility = c0fg7.getVisibility();
                c0fg7.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c0fg7);
                C426750GoL.LJIIIZ(this.LIZ.findViewById(R.id.i53), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80))), null, null, false, 28);
            }
        } else {
            if (iMUserLIZLLL != null) {
                avatarThumb = iMUserLIZLLL.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            LIZJ(avatarThumb);
        }
        LIZIZ(false);
        boolean z = C14LC.LJIIIZ;
        if (!C309690CBz.LIZ.LJFF) {
            C426750GoL.LJIIIZ(this.LIZ.findViewById(R.id.i3n), null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))), false, 23);
        }
        if (enumC1575470r6H == EnumC1575470r6H.PARTIAL_UNLOCKED) {
            C786410Ut5.LJLZ(8, (ViewGroup) this.LIZ.findViewById(R.id.i6o));
            C786410Ut5.LJLZ(0, (ViewGroup) this.LIZ.findViewById(R.id.ng2));
            C197039127h c197039127h = (C197039127h) this.LIZ.findViewById(R.id.upv);
            c197039127h.LJJJJL(new AwS580S0100000_1(c197039127h, 462));
            VibeFeedConsumeViewModel vibeFeedConsumeViewModel3 = this.LJ;
            if (vibeFeedConsumeViewModel3 != null && vibeFeedConsumeViewModel3.LLJ.LIZ) {
                c197039127h.setEnabled(false);
                C786410Ut5.w5(c197039127h, 0.4f);
                return;
            } else {
                C786410Ut5.I7(new AbS510S0200000_24(this, c197039127h, 2), c197039127h);
                return;
            }
        }
        VibeFeedConsumeViewModel vibeFeedConsumeViewModel4 = this.LJ;
        if (vibeFeedConsumeViewModel4 != null && (c0p31 = vibeFeedConsumeViewModel4.LLILZ) != null) {
            summaryStatsLJIIIZ = c0p31.LJIIIZ();
        }
        C786410Ut5.LJLZ(0, (ViewGroup) this.LIZ.findViewById(R.id.i6o));
        C786410Ut5.LJLZ(8, (ViewGroup) this.LIZ.findViewById(R.id.ng2));
        C786410Ut5.I7(new AbS687S0100000_4(this, 5), this.LIZ.findViewById(R.id.zqv));
        View viewFindViewById = this.LIZ.findViewById(R.id.nec);
        viewFindViewById.setBackground(LJFF());
        C786410Ut5.I7(new AbS703S0100000_24(this, 13), viewFindViewById);
        View viewFindViewById2 = this.LIZ.findViewById(R.id.ned);
        viewFindViewById2.setBackground(LJFF());
        C786410Ut5.I7(new AbS703S0100000_24(this, 14), viewFindViewById2);
        View viewFindViewById3 = this.LIZ.findViewById(R.id.nee);
        viewFindViewById3.setBackground(LJFF());
        C786410Ut5.I7(new AbS703S0100000_24(this, 15), viewFindViewById3);
        LIZ(summaryStatsLJIIIZ);
    }
}
