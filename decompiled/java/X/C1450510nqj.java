package X;

import android.animation.ValueAnimator;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450510nqj {
    public final Context LIZ;
    public final InterfaceC1455860nzM LIZIZ;
    public final C1450550nqn LIZJ;
    public final C1836880xtu LIZLLL;
    public final InterfaceC1450560nqo LJ;
    public ValueAnimator LJIIIIZZ;
    public final float LJIIJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS566S0100000_22(this, 953));
    public final int LJI = (C1450870nrJ.LIZ + C1450870nrJ.LJ) + C1450870nrJ.LIZLLL;
    public float LJII = 1.0f;
    public final float LJIIIZ = (C1450870nrJ.LIZ / 2) + C1450870nrJ.LJ;

    public final int LIZ() {
        int i;
        int i2;
        if (C1441980ncy.LIZ()) {
            int i3 = C1428150nGf.LJFF;
            C1450550nqn c1450550nqn = this.LIZJ;
            i = i3 - c1450550nqn.LIZJ;
            i2 = c1450550nqn.LIZLLL;
        } else {
            int i4 = this.LJI;
            C1450550nqn c1450550nqn2 = this.LIZJ;
            i = i4 - c1450550nqn2.LIZJ;
            i2 = c1450550nqn2.LIZLLL;
        }
        return i - i2;
    }

    public C1450510nqj(Context context, SingleImageData singleImageData, InterfaceC1451050nrb interfaceC1451050nrb, C1450550nqn c1450550nqn, C1836880xtu c1836880xtu, C1450530nql c1450530nql) {
        this.LIZ = context;
        this.LIZIZ = interfaceC1451050nrb;
        this.LIZJ = c1450550nqn;
        this.LIZLLL = c1836880xtu;
        this.LJ = c1450530nql;
        this.LJIIJ = c1450550nqn.LIZJ + (LIZ() / 2);
    }
}
