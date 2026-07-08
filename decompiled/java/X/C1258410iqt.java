package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0iqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258410iqt {
    public static final String LIZIZ(int i, boolean z) {
        return i != 0 ? i != 1 ? i != 4 ? i != 14 ? i != 24 ? "" : z ? "personal_cameo_tab" : "others_cameo_tab" : z ? "personal_private_tab" : "others_private_tab" : z ? "personal_collection_videos_tab" : "others_collection_videos_tab" : z ? "personal_favorite_tab" : "others_favorite_tab" : z ? "personal_public_tab" : "others_public_tab";
    }

    public static final void LJ(boolean z) {
        if (z) {
            int i = C2187451AjH.LIZ;
        }
    }

    public static final boolean LIZLLL(int i, boolean z) {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ;
        IPrivacyService iPrivacyService = (IPrivacyService) PluggableExtentionKt.pluggableSpi$default(IPrivacyService.class, false, false, false, 14, null);
        if ((iPrivacyService != null && (privacySettingsRestrictionItemLJIIIZ = iPrivacyService.LJIIIZ(0, "favorite")) != null && privacySettingsRestrictionItemLJIIIZ.showType == 2) || !z || 1 != i) {
            return false;
        }
        C19259110Wf c19259110Wf = C746350TPl.LIZ;
        Integer numLIZ = c19259110Wf.LJIIJJI().LIZ();
        if ((numLIZ != null && numLIZ.intValue() == 0) || C10EU.LJIIIIZZ() || c19259110Wf.LJIIIIZZ().LIZ().booleanValue() || c19259110Wf.LJII().LIZ().booleanValue() || !c19259110Wf.LJIIIZ().LIZ().booleanValue()) {
            return false;
        }
        return true;
    }

    public static final void LJFF(boolean z, C0W93 c0w93) {
        String str;
        if (z && !C1253130iiN.LJ) {
            return;
        }
        if (z) {
            C1253130iiN.LJ = false;
            str = "my_profile";
        } else {
            str = C1253130iiN.LIZ;
            C1253130iiN.LIZIZ = false;
        }
        C818480W8w.LIZJ(str, c0w93, null, C2097608Jq.LJ());
    }

    public static final boolean LIZ(String str, List<? extends Aweme> list, Function2<? super Integer, ? super Aweme, Unit> function2) {
        boolean z = false;
        if (str != null && list != null) {
            int i = 0;
            for (Aweme aweme : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    Aweme aweme2 = aweme;
                    if (aweme2 != null && TextUtils.equals(str, aweme2.getAid())) {
                        function2.invoke(Integer.valueOf(i), aweme2);
                        z = true;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return z;
    }

    public static final View LIZJ(int i, View view, boolean z) {
        TuxIconView tuxIconView;
        if (!C1258400iqs.LIZ() && !LIZLLL(i, z)) {
            return null;
        }
        Context context = view.getContext();
        View viewFindViewById = view.findViewById(R.id.je1);
        TextView textView = (TextView) view.findViewById(R.id.mo6);
        ImageView imageView = (ImageView) view.findViewById(R.id.lc0);
        viewFindViewById.setBackgroundColor(C960203pA.LIZ(R.attr.bx, context));
        if ((imageView instanceof TuxIconView) && (tuxIconView = (TuxIconView) imageView) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_x_mark_small;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        textView.setTextColor(C960203pA.LIZ(R.attr.ud, context));
        if (!C1258400iqs.LIZ()) {
            String string = context.getString(2131845486);
            String string2 = context.getString(2131845483);
            String strJ4 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{context.getString(2131845483)}, 1));
            SpannableString spannableString = new SpannableString(strJ4);
            int iLJJJ = a0.LJJJ(strJ4, string2, 0, false, 6);
            int length = string2.length() + iLJJJ;
            if (iLJJJ >= 0 && length >= 0) {
                C786410Ut5.p2(spannableString, new C785780Us4(context, viewFindViewById, 6), iLJJJ, length, 18);
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a04, context)), iLJJJ, length, 18);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(spannableString);
            }
        }
        C786410Ut5.Q7(imageView, new ACListenerS147S0100000_12(viewFindViewById, 333));
        return viewFindViewById;
    }
}
