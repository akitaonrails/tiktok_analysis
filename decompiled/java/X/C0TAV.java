package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusViewModel;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TAV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TAV {
    public final View LIZ;
    public final int LIZIZ;
    public final C19EG LIZJ;
    public final String LIZLLL;
    public final C19318810i2 LJ;
    public final String LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 976));
    public List<? extends AbstractC19318610i0<?>> LJII = C13BV.INSTANCE;

    public final CreatorPlusViewModel LIZ() {
        return (CreatorPlusViewModel) this.LJI.getValue();
    }

    public C0TAV(ConstraintLayout constraintLayout, int i, C19EG c19eg, String str, C19318810i2 c19318810i2, String str2) {
        this.LIZ = constraintLayout;
        this.LIZIZ = i;
        this.LIZJ = c19eg;
        this.LIZLLL = str;
        this.LJ = c19318810i2;
        this.LJFF = str2;
        LIZ().vQ2();
    }
}
