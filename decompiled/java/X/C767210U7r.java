package X;

import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0U7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767210U7r implements InterfaceC767240U7u {
    public static final C01GW<C767210U7r> LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(350));
    public final C0U5Z LIZ = C760630Tsb.LIZ();

    public final void LIZ() {
        AbstractC766100U3k<T> abstractC766100U3k;
        if (((ArrayList) this.LIZ.LIZ).isEmpty()) {
            return;
        }
        int iLIZJ = LIZJ();
        int i = iLIZJ + 1;
        if (i >= ((ArrayList) this.LIZ.LIZ).size()) {
            i = 0;
        }
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LIZ.LIZ, i);
        if (this.LIZ.LJI(liveEffect)) {
            C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJJIFFI;
            if (C500260Jjc.LJJIFFI(c20337914i1.LIZIZ())) {
                c20337914i1.LJFF(Boolean.TRUE);
            }
            this.LIZ.getClass();
            LJ(iLIZJ, i);
            return;
        }
        ComposerFilterViewModel composerFilterViewModel = this.LIZ.LJ;
        if (composerFilterViewModel == null || (abstractC766100U3k = composerFilterViewModel.LL) == 0 || !abstractC766100U3k.LIZ.contains(liveEffect)) {
            this.LIZ.LJ(liveEffect);
        }
    }

    public final void LIZIZ() {
        if (((ArrayList) this.LIZ.LIZ).isEmpty()) {
            return;
        }
        int iLIZJ = LIZJ();
        int size = iLIZJ - 1;
        if (size < 0) {
            size = ((ArrayList) this.LIZ.LIZ).size() - 1;
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJJIFFI;
        if (C500260Jjc.LJJIFFI(c20337914i1.LIZIZ())) {
            c20337914i1.LJFF(Boolean.TRUE);
        }
        this.LIZ.getClass();
        LJ(iLIZJ, size);
    }

    public final int LIZJ() {
        Integer numLIZIZ = InterfaceC766480U4w.LIZ.LIZIZ();
        if (numLIZIZ.intValue() >= ((ArrayList) this.LIZ.LIZ).size() || numLIZIZ.intValue() < 0) {
            return 0;
        }
        return numLIZIZ.intValue();
    }

    public final String LIZLLL() {
        return ((ArrayList) this.LIZ.LIZ).isEmpty() ? "" : ((LiveEffect) ListProtector.get(this.LIZ.LIZ, LIZJ())).getName();
    }

    public final void LJ(int i, int i2) {
        if (i < ((ArrayList) this.LIZ.LIZ).size() && i2 < ((ArrayList) this.LIZ.LIZ).size()) {
            C760630Tsb.LIZ().LIZJ(i2);
            C784440Upu.LIZ().LIZIZ(new Object() { // from class: X.0U7t
            });
        }
    }
}
