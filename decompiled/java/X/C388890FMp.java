package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationAutoRefresh$observer$2$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.0FMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388890FMp {
    public final Lifecycle LIZ;
    public final Function0<Integer> LIZIZ;
    public final Function0<Integer> LIZJ;
    public boolean LIZLLL;
    public C054G LJ;
    public final C01GW LJFF;

    public final void LIZJ() {
        C2296808zG.LIZLLL(this.LJ, "");
        if (C0BIH.LIZ()) {
            this.LIZ.removeObserver((StickerDurationAutoRefresh$observer$2$1) this.LJFF.getValue());
        }
    }

    public final void LIZ(Function1<? super Integer, Unit> function1) {
        this.LIZLLL = true;
        C2296808zG.LIZLLL(this.LJ, "");
        function1.invoke(this.LIZIZ.invoke());
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJ = C2296808zG.LIZ(C2107308Nj.LIZ);
        C09IC.LJJI(this.LJ, new C861640Xr8(new C1331405Iy(function1, this, null), new C095D(new C1331305Ix(this, null))));
    }

    public final boolean LIZIZ(BaseStickerModel baseStickerModel, Function1<? super Integer, Unit> function1) {
        if (!LIZLLL(baseStickerModel.getStartTime(), baseStickerModel.getEndTime()) && C385630FAb.LIZJ(baseStickerModel)) {
            LIZ(function1);
            return true;
        }
        return false;
    }

    public final boolean LIZLLL(float f, float f2) {
        if (f == 0.0f && f2 == this.LIZJ.invoke().intValue()) {
            return true;
        }
        return false;
    }

    public C388890FMp(Lifecycle lifecycle, Function0<Integer> function0, Function0<Integer> function02) {
        this.LIZ = lifecycle;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJ = C2296808zG.LIZ(C2107308Nj.LIZ);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 64));
        this.LJFF = c01gwLIZIZ;
        lifecycle.addObserver((StickerDurationAutoRefresh$observer$2$1) c01gwLIZIZ.getValue());
    }
}
