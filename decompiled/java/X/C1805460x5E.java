package X;

import Y.ACListenerS88S1100000_27;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0x5E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805460x5E extends AbstractC1805640x5W {
    public final ViewGroup LIZJ;
    public C1567220qsy LIZLLL;

    @Override // X.AbstractC1805640x5W
    public final int LIZIZ() {
        return R.layout.h3s;
    }

    @Override // X.AbstractC1805640x5W
    public final void LJ() {
    }

    @Override // X.AbstractC1805640x5W
    public final void LJFF() {
        NoticesResult.Notice notice;
        String str;
        C1567220qsy c1567220qsy = this.LIZLLL;
        if (c1567220qsy == null || (notice = c1567220qsy.LIZ) == null || (str = notice.id) == null) {
            return;
        }
        long currentUserId = UserService.getInstance().user() == null ? 0L : UserService.getInstance().user().getCurrentUserId();
        C20337914i1<Map<String, Map<String, Double>>> c20337914i1 = InterfaceC1106030et7.O5;
        Map<String, Double> map = c20337914i1.LIZIZ().get(String.valueOf(currentUserId));
        if (map == null) {
            map = new HashMap<>();
        }
        Double d = map.get(str);
        map.put(str, Double.valueOf((d != null ? d.doubleValue() : 0.0d) + ((double) 1)));
        c20337914i1.LIZIZ().put(String.valueOf(currentUserId), map);
        c20337914i1.LIZJ();
        C0JT6<Map<String, Long>> c0jt6 = InterfaceC1106030et7.P5;
        HashMap map2 = (HashMap) c0jt6.LIZ();
        if (map2 == null) {
            map2 = new HashMap();
        }
        map2.put(str, Long.valueOf(System.currentTimeMillis()));
        c0jt6.LIZJ(map2);
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJJIJ("top_banner");
    }

    @Override // X.AbstractC1805640x5W
    public final void LIZJ() {
        View viewFindViewById;
        super.LIZJ();
        View view = this.LIZIZ;
        if (view == null || (viewFindViewById = view.findViewById(R.id.sm3)) == null) {
            return;
        }
        C1143680frq.LJ(viewFindViewById, "tiktok_live_wallet_resource", "ttlive_ic_recharge_banner_quick_charge_icon.png", ImageView.ScaleType.FIT_XY);
    }

    @Override // X.AbstractC1805640x5W
    public final EnumC1568540qv6 LIZ() {
        return EnumC1568540qv6.QUICK_CHARGE;
    }

    public C1805460x5E(ViewGroup viewGroup) {
        super(viewGroup);
        this.LIZJ = viewGroup;
    }

    @Override // X.AbstractC1805640x5W
    public final void LIZLLL(AbstractC1568580qvA abstractC1568580qvA) {
        C1567220qsy c1567220qsy;
        String str;
        String str2;
        View view;
        View view2;
        NoticesResult.Notice notice;
        NoticesResult.Style style;
        String str3;
        View view3;
        TextView textView;
        if ((abstractC1568580qvA instanceof C1567220qsy) && (c1567220qsy = (C1567220qsy) abstractC1568580qvA) != null) {
            this.LIZLLL = c1567220qsy;
            C1567220qsy c1567220qsy2 = (C1567220qsy) abstractC1568580qvA;
            NoticesResult.Notice notice2 = c1567220qsy2.LIZ;
            if (notice2 != null && (str3 = notice2.content) != null && (view3 = this.LIZIZ) != null && (textView = (TextView) view3.findViewById(R.id.sm5)) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str3);
                sbLIZ.append(" _");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_ltr;
                c419910GdJ.LIZIZ = C439101nJ.LIZ(12);
                c419910GdJ.LIZJ = C439101nJ.LIZ(12);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LIZJ.getContext());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
                int length = spannableStringBuilder.length() - 1;
                C786410Ut5.q2(spannableStringBuilder, new C416760GVu(tuxIconDrawableLIZ), length, length + 1, 17);
                textView.setText(spannableStringBuilder);
            }
            C1567220qsy c1567220qsy3 = this.LIZLLL;
            if (c1567220qsy3 == null || (notice = c1567220qsy3.LIZ) == null || (style = notice.style) == null || (str = style.backgroundColorCode) == null) {
                str = "";
            }
            if (C1533950q1J.LJ(str) && (view2 = this.LIZIZ) != null) {
                view2.setBackgroundColor(ColorProtector.parseColor(str));
            }
            NoticesResult.Notice notice3 = c1567220qsy2.LIZ;
            if (notice3 != null && (str2 = notice3.schemaUrl) != null && str2.length() != 0 && (view = this.LIZIZ) != null) {
                C786410Ut5.I7(new ACListenerS88S1100000_27(this, str2, 0), view);
            }
        }
    }
}
