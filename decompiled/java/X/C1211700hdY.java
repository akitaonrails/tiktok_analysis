package X;

import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0hdY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1211700hdY implements InterfaceC1211710hdZ {
    public final /* synthetic */ InterfaceC1211710hdZ LL;

    @Override // X.InterfaceC1211710hdZ
    public final void LIZ(float f, boolean z) {
        this.LL.LIZ(f, z);
    }

    @Override // X.InterfaceC1211710hdZ
    public final void LIZJ() {
        this.LL.LIZJ();
    }

    @Override // X.InterfaceC1211710hdZ
    public final void LJ(boolean z, Aweme aweme, ValueAnimator valueAnimator) {
        this.LL.LJ(z, aweme, valueAnimator);
    }

    @Override // X.InterfaceC1211710hdZ
    public final void LJFF() {
        this.LL.LJFF();
    }

    @Override // X.InterfaceC1211710hdZ
    public final void LJI(int i, Aweme aweme, String str, String str2) {
        this.LL.LJI(i, aweme, str, str2);
    }

    @Override // X.InterfaceC1211710hdZ
    public final String getEventType() {
        return this.LL.getEventType();
    }

    @Override // X.InterfaceC1211710hdZ
    public final void onDestroy() {
        this.LL.onDestroy();
    }

    public C1211700hdY(C2248671Czp c2248671Czp) {
        this.LL = c2248671Czp;
    }
}
