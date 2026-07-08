package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126980fQu extends AbstractC1126600fQI<C1128940fU4> {
    public AwS561S0100000_17 LJJI;

    @Override // X.AbstractC1126600fQI
    public final String LIZJ() {
        return "Match Item";
    }

    @Override // X.AbstractC1126600fQI
    public final long LJI() {
        return -1L;
    }

    @Override // X.AbstractC1126600fQI
    public final ImageModel LJII() {
        return ((C1128940fU4) this.LIZIZ).LJIIIIZZ;
    }

    @Override // X.AbstractC1126600fQI
    public final String LJIIIZ() {
        return ((C1128940fU4) this.LIZIZ).LJI;
    }

    @Override // X.AbstractC1126600fQI
    public final boolean LJIILJJIL() {
        T t = this.LIZIZ;
        if (!(t instanceof C1128940fU4)) {
            return super.LJIILJJIL();
        }
        ImageModel imageModel = ((C1128940fU4) t).LJII;
        return (imageModel == null || C842240X2g.LIZ(imageModel) == null || !(C842240X2g.LIZ(imageModel).isEmpty() ^ true)) ? false : true;
    }

    public C1126980fQu(C1128940fU4 c1128940fU4) {
        super(12, c1128940fU4);
    }

    public final boolean LJJIIJZLJL(C1126980fQu c1126980fQu) {
        C1128940fU4 c1128940fU4;
        C1128940fU4 c1128940fU42 = (C1128940fU4) this.LIZIZ;
        if (c1126980fQu != null && (c1128940fU4 = (C1128940fU4) c1126980fQu.LIZIZ) != null) {
            if (c1128940fU42.LJIIJ == c1128940fU4.LJIIJ && c1128940fU42.LJIIJJI == c1128940fU4.LJIIJJI && c1128940fU42.LJIIL == c1128940fU4.LJIIL) {
                return true;
            }
            return false;
        }
        c1128940fU42.getClass();
        return false;
    }
}
