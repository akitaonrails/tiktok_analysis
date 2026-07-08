package X;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.model.IMActionTemplate;
import com.ss.android.ugc.aweme.im.common.model.IMFromMessageTips;
import com.ss.android.ugc.aweme.im.saas.host.api.im.model.GroupRecShowInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.im.model.NoticeAckPayload;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import wh6.AbS702S0100000_22;

/* JADX INFO: renamed from: X.0n6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421930n6d extends RecyclerView.ViewHolder implements C0Z37<C1421950n6f>, InterfaceC1508640pMU {
    public final View LL;
    public C1421950n6f LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "InboxRecommendGroupBannerVH";
    }

    public final void I5() {
        String str;
        Function0<Unit> function0;
        C1421950n6f c1421950n6f = this.LLILLJJLI;
        if (c1421950n6f != null && (function0 = c1421950n6f.LLILZLL) != null) {
            function0.invoke();
        }
        C1466920oHC c1466920oHC = new C1466920oHC(CoroutineExceptionHandler.LJJLIL, 3);
        C1227904rF c1227904rF = C1227904rF.LIZ;
        C1421950n6f c1421950n6f2 = this.LLILLJJLI;
        if (c1421950n6f2 == null || (str = c1421950n6f2.LLILZIL) == null) {
            str = "";
        }
        NoticeAckPayload noticeAckPayload = new NoticeAckPayload(null, null, new GroupRecShowInfo(str));
        c1227904rF.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()).plus(c1466920oHC)), null, null, new C1411180mpI(this, C1227904rF.LJI(noticeAckPayload), null), 3);
    }

    public C1421930n6d(View view) {
        super(view);
        this.LL = view;
        this.LLILLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 999));
        this.LLILZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, LSPassThroughRecordSizeConfig.DEFAULT));
        this.LLILZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1001));
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        IMFromMessageTips iMFromMessageTips;
        Integer numLIZJ;
        this.LLILLJJLI = (C1421950n6f) interfaceC1891350zJl;
        C786410Ut5.I7(new AbS702S0100000_22(this, 2), this.LL);
        C786410Ut5.I7(new AbS702S0100000_22(this, 1), (View) this.LLILLL.getValue());
        ((TuxTextView) this.LLILZIL.getValue()).setMinTextSize(9.0f);
        C1421950n6f c1421950n6f = this.LLILLJJLI;
        String str = null;
        if (c1421950n6f != null) {
            str = c1421950n6f.LLILZ;
        }
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZ = R.raw.icon_play_rectangle_fill;
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1p, this.LL.getContext());
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LL.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a03, this.LL.getContext());
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.LL.getContext()));
            C1322090kVb c1322090kVb = (C1322090kVb) this.LLILZ.getValue();
            if ((c1322090kVb instanceof ImageView) && c1322090kVb != null) {
                c1322090kVb.setImageDrawable(layerDrawableLJIILIIL);
            }
        } else {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ((SmartImageView) this.LLILZ.getValue());
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        C1421950n6f c1421950n6f2 = this.LLILLJJLI;
        if (c1421950n6f2 != null && (iMFromMessageTips = c1421950n6f2.LLILLJJLI) != null) {
            String str2 = iMFromMessageTips.tips;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
            List list = iMFromMessageTips.template;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            if (!list.isEmpty()) {
                IMActionTemplate iMActionTemplate = (IMActionTemplate) ListProtector.get(list, 0);
                String str4 = iMActionTemplate.name;
                if (str4 != null) {
                    str3 = str4;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("{{");
                sbLIZ.append(iMActionTemplate.key);
                sbLIZ.append("}}");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int iLJJJ = a0.LJJJ(spannableStringBuilder, strLIZIZ, 0, false, 6);
                if (iLJJJ >= 0) {
                    spannableStringBuilder.replace(iLJJJ, strLIZIZ.length() + iLJJJ, (CharSequence) str3);
                }
                Context context = this.LL.getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, context)) != null) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), iLJJJ, str3.length() + iLJJJ, 33);
                }
            }
            ((TextView) this.LLILZIL.getValue()).setText(spannableStringBuilder);
        }
    }
}
