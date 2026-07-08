package X;

import android.widget.ImageView;
import com.ss.android.ugc.aweme.tako.experiment.TakoInfoModel;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: renamed from: X.14IJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14IJ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Function1<? super ImageView, Unit> LJI;

    public C14IJ(int i) {
        String str = C747440TTq.LIZJ().title;
        String strLJIIIIZZ = (str == null || (strLJIIIIZZ = C786410Ut5.j4(str, Arrays.copyOf(new Object[]{C1852920yJm.LIZ.botName}, 1))) == null) ? C1857750yRZ.LJIIIIZZ(2131828528, C1852920yJm.LIZ.botName) : strLJIIIIZZ;
        String strLJII = C1857750yRZ.LJII(2131828526);
        TakoInfoModel takoInfoModel = C1852920yJm.LIZ;
        String str2 = takoInfoModel.botName;
        String strJ4 = C786410Ut5.j4(strLJII, Arrays.copyOf(new Object[]{str2, str2, str2}, 3));
        String str3 = C747440TTq.LIZJ().confirmTitle;
        String strLJIIIIZZ2 = (str3 == null || (strLJIIIIZZ2 = C786410Ut5.j4(str3, Arrays.copyOf(new Object[]{takoInfoModel.botName}, 1))) == null) ? C1857750yRZ.LJIIIIZZ(2131828527, takoInfoModel.botName) : strLJIIIIZZ2;
        String strLJII2 = C747440TTq.LIZJ().topBannerTitle;
        strLJII2 = strLJII2 == null ? C1857750yRZ.LJII(2131849649) : strLJII2;
        String strLJII3 = C747440TTq.LIZJ().topBannerLearnMore;
        strLJII3 = strLJII3 == null ? C1857750yRZ.LJII(2131849648) : strLJII3;
        String str4 = C747440TTq.LIZJ().topBannerDesc;
        String strLJIIIIZZ3 = (str4 == null || (strLJIIIIZZ3 = C786410Ut5.j4(str4, Arrays.copyOf(new Object[]{takoInfoModel.botName}, 1))) == null) ? C1857750yRZ.LJIIIIZZ(2131849647, takoInfoModel.botName) : strLJIIIIZZ3;
        AFwS232S0000000_4 aFwS232S0000000_4 = AFwS232S0000000_4.get$arr$(1);
        this.LIZ = strLJIIIIZZ;
        this.LIZIZ = strJ4;
        this.LIZJ = strLJIIIIZZ2;
        this.LIZLLL = strLJII2;
        this.LJ = strLJII3;
        this.LJFF = strLJIIIIZZ3;
        this.LJI = aFwS232S0000000_4;
    }
}
