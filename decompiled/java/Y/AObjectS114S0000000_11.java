package Y;

import X.C2188811AlT;
import X.C703160Ri6;
import X.C703410RiV;
import X.C703510Rif;
import X.C737030Svd;
import X.EnumC703190Ri9;
import android.graphics.drawable.GradientDrawable;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AObjectS114S0000000_11 implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public AObjectS114S0000000_11(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS114S0000000_11 aObjectS114S0000000_11, Object obj) {
        C703410RiV c703410RiV = (C703410RiV) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c703410RiV.LIZIZ);
        sbLIZ.append("(timing=");
        sbLIZ.append(c703410RiV.LIZJ);
        sbLIZ.append(",delay=");
        long j = c703410RiV.LIZLLL.LIZ;
        if (j < 0) {
            j = 0;
        }
        sbLIZ.append(j);
        sbLIZ.append("ms)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AObjectS114S0000000_11 aObjectS114S0000000_11, Object obj) {
        List<String> list;
        C703160Ri6 c703160Ri6 = (C703160Ri6) obj;
        boolean z = false;
        if (c703160Ri6.LIZIZ == EnumC703190Ri9.REMOVE && ((list = c703160Ri6.LIZLLL) == null || list.isEmpty())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AObjectS114S0000000_11 aObjectS114S0000000_11, Object obj) {
        C703160Ri6 c703160Ri6 = (C703160Ri6) obj;
        String str = c703160Ri6.LIZ;
        EnumC703190Ri9 enumC703190Ri9 = c703160Ri6.LIZIZ;
        Long l = c703160Ri6.LIZJ;
        long j = 0;
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue >= 0) {
                j = jLongValue;
            }
        }
        return new C703410RiV(str, enumC703190Ri9, null, new C703510Rif(j));
    }

    public static final Object invoke$3(AObjectS114S0000000_11 aObjectS114S0000000_11, Object obj) {
        C737030Svd c737030Svd = (C737030Svd) obj;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        c737030Svd.LJIIJ = "click_repost_button";
        return c737030Svd;
    }

    public static final Object invoke$4(AObjectS114S0000000_11 aObjectS114S0000000_11, Object obj) {
        C737030Svd c737030Svd = (C737030Svd) obj;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        c737030Svd.LJIIJ = "tablet_on_keyboard_event";
        return c737030Svd;
    }
}
