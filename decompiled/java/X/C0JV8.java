package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageBottomAssem;
import com.bytedance.android.livesdk.livesetting.subscription.SubEuRegionSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0JV8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JV8 extends C09AY implements Function2<UIAssem, C291001Au<? extends User>, Unit> {
    public final /* synthetic */ SuggestEmotePageBottomAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JV8(SuggestEmotePageBottomAssem suggestEmotePageBottomAssem) {
        super(2);
        this.LL = suggestEmotePageBottomAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends User> c291001Au) {
        String strLJIJI;
        int length;
        User userLIZ = c291001Au.LIZ();
        if (userLIZ != null) {
            SuggestEmotePageBottomAssem suggestEmotePageBottomAssem = this.LL;
            suggestEmotePageBottomAssem.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (SubEuRegionSetting.INSTANCE.isEuRegion()) {
                strLJIJI = C497740JfY.LJIJI(2131852087);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131852088);
            }
            if (strLJIJI != null) {
                length = strLJIJI.length();
            } else {
                length = 0;
            }
            String strLJIJJ = C497740JfY.LJIJJ(2131852086, strLJIJI, C0KVU.LIZ(userLIZ));
            int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
            spannableStringBuilder.append((CharSequence) new SpannableString(strLJIJJ));
            int i = length + iLJJJ;
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C497740JfY.LIZLLL(R.attr.ex3, suggestEmotePageBottomAssem.getContext())), iLJJJ, i, 33);
            C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJJ, i, 33, 500);
            C16F5 c16f5 = suggestEmotePageBottomAssem.LLJI;
            if (c16f5 != null) {
                c16f5.setText(spannableStringBuilder);
            }
        }
        return Unit.LIZ;
    }
}
