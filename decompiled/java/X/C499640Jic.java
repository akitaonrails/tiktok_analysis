package X;

import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499640Jic {
    public final View LIZ;
    public final LiveIconView LIZIZ;
    public final C16F5 LIZJ;
    public final C16F5 LIZLLL;
    public final C16F5 LJ;
    public final View LJFF;
    public final C20743716Ff LJI;
    public final LiveIconView LJII;
    public final LiveIconView LJIIIIZZ;

    public C499640Jic() {
        this(null, null, null, null, null, null, null, null, null, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C499640Jic)) {
            return false;
        }
        C499640Jic c499640Jic = (C499640Jic) obj;
        return Intrinsics.LJFF(this.LIZ, c499640Jic.LIZ) && Intrinsics.LJFF(this.LIZIZ, c499640Jic.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c499640Jic.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c499640Jic.LIZLLL) && Intrinsics.LJFF(this.LJ, c499640Jic.LJ) && Intrinsics.LJFF(this.LJFF, c499640Jic.LJFF) && Intrinsics.LJFF(this.LJI, c499640Jic.LJI) && Intrinsics.LJFF(this.LJII, c499640Jic.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c499640Jic.LJIIIIZZ);
    }

    public final int hashCode() {
        View view = this.LIZ;
        int iHashCode = (view == null ? 0 : view.hashCode()) * 31;
        LiveIconView liveIconView = this.LIZIZ;
        int iHashCode2 = (iHashCode + (liveIconView == null ? 0 : liveIconView.hashCode())) * 31;
        C16F5 c16f5 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c16f5 == null ? 0 : c16f5.hashCode())) * 31;
        C16F5 c16f52 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (c16f52 == null ? 0 : c16f52.hashCode())) * 31;
        C16F5 c16f53 = this.LJ;
        int iHashCode5 = (iHashCode4 + (c16f53 == null ? 0 : c16f53.hashCode())) * 31;
        View view2 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (view2 == null ? 0 : view2.hashCode())) * 31;
        C20743716Ff c20743716Ff = this.LJI;
        int iHashCode7 = (iHashCode6 + (c20743716Ff == null ? 0 : c20743716Ff.hashCode())) * 31;
        LiveIconView liveIconView2 = this.LJII;
        int iHashCode8 = (iHashCode7 + (liveIconView2 == null ? 0 : liveIconView2.hashCode())) * 31;
        LiveIconView liveIconView3 = this.LJIIIIZZ;
        return iHashCode8 + (liveIconView3 != null ? liveIconView3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SettingsItemVhViews(container=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", redDot=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", switch=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", tipsIcon=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", chevronIcon=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C499640Jic(View view, LiveIconView liveIconView, C16F5 c16f5, C16F5 c16f52, C16F5 c16f53, View view2, C20743716Ff c20743716Ff, LiveIconView liveIconView2, LiveIconView liveIconView3, int i) {
        view = (i & 1) != 0 ? null : view;
        liveIconView = (i & 2) != 0 ? null : liveIconView;
        c16f5 = (i & 4) != 0 ? null : c16f5;
        c16f52 = (i & 8) != 0 ? null : c16f52;
        c16f53 = (i & 16) != 0 ? null : c16f53;
        view2 = (i & 32) != 0 ? null : view2;
        c20743716Ff = (i & 64) != 0 ? null : c20743716Ff;
        liveIconView2 = (i & 128) != 0 ? null : liveIconView2;
        liveIconView3 = (i & 256) != 0 ? null : liveIconView3;
        this.LIZ = view;
        this.LIZIZ = liveIconView;
        this.LIZJ = c16f5;
        this.LIZLLL = c16f52;
        this.LJ = c16f53;
        this.LJFF = view2;
        this.LJI = c20743716Ff;
        this.LJII = liveIconView2;
        this.LJIIIIZZ = liveIconView3;
    }
}
