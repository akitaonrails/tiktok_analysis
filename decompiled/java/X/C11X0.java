package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel;
import com.ss.android.ugc.profile.business.effect.dashboard.PopupBannerItem;
import com.ss.android.ugc.profile.business.effect.dashboard.TopEffectRankingBannerInfo;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.text.u;

/* JADX INFO: renamed from: X.11X0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11X0<T> {
    public static final C11X1 LJFF = new C11X1();
    public EffectProfileListViewModel LIZ;
    public ViewGroup LIZIZ;
    public T LIZJ;
    public InterfaceC19515911Wz LIZLLL;
    public final C01GW LJ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS218S0000000_29.get$arr$(382));

    public abstract Object LIZJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public abstract C20514915Pf LIZLLL();

    public static Object LIZIZ(Context context, String str, AbstractC23140094w abstractC23140094w) {
        if (str != null && str.length() != 0) {
            if (!u.LJJIIJZLJL(str, "http", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(str);
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(C2286608xc.LJ(4));
            C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJIJL(context);
            c1331670kl3LJIIIZ.LJJI = c1331730kl9;
            c1331670kl3LJIIIZ.LJJIIJ(new C1766606vw(c23260099m, 1));
            Object objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(abstractC23140094w);
            }
            return objLIZ;
        }
        return null;
    }

    public static CharSequence LIZ(Context context, PopupBannerItem popupBannerItem, int i, int i2) {
        String str;
        int iIntValue;
        Object[] objArr = new Object[2];
        objArr[0] = popupBannerItem.effectName;
        TopEffectRankingBannerInfo topEffectRankingBannerInfo = popupBannerItem.topEffectRankingBanner;
        if (topEffectRankingBannerInfo == null || (str = topEffectRankingBannerInfo.rankTypeTranslation) == null) {
            str = "";
        }
        objArr[1] = str;
        String string = context.getString(i, objArr);
        String string2 = context.getString(i2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append(' ');
        sbLIZ.append(string2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SpannableString spannableString = new SpannableString(strLIZIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -65536;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), strLIZIZ.length() - string2.length(), strLIZIZ.length(), 0);
        C786410Ut5.p2(spannableString, new C444920HcY(62, true), strLIZIZ.length() - string2.length(), strLIZIZ.length(), 0);
        return spannableString;
    }
}
