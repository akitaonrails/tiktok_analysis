package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PGs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642160PGs {
    public static final /* synthetic */ int LJFF = 0;
    public final View LIZ;
    public C1390410mHn LIZIZ;
    public C21647019ng LIZJ;
    public Float LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(715));

    public final void LIZ() {
        C21647019ng c21647019ng = this.LIZJ;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
        this.LIZLLL = null;
        C1390410mHn c1390410mHn = this.LIZIZ;
        if (c1390410mHn == null || !c1390410mHn.LLIZLLLIL) {
            return;
        }
        c1390410mHn.LIZLLL();
    }

    public C642160PGs(View view) {
        this.LIZ = view;
        this.LIZIZ = (C1390410mHn) view.findViewById(R.id.u82);
    }

    public final void LIZIZ(float f) {
        C21647019ng c21647019ng = this.LIZJ;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
        this.LIZLLL = null;
        C1390410mHn c1390410mHn = this.LIZIZ;
        if (c1390410mHn != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1390410mHn);
            c1390410mHn.setTranslationY(f);
        }
        C1390410mHn c1390410mHn2 = this.LIZIZ;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
    }

    public final void LIZJ(float f) {
        C1390410mHn c1390410mHn = this.LIZIZ;
        if (c1390410mHn == null) {
            return;
        }
        if (!c1390410mHn.LLIZLLLIL) {
            C21647019ng c21647019ng = this.LIZJ;
            if (c21647019ng != null) {
                c21647019ng.LIZ();
            }
            this.LIZLLL = null;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1390410mHn);
            c1390410mHn.setTranslationY(f);
        } else if (this.LIZJ == null || !Intrinsics.LIZLLL(this.LIZLLL, f)) {
            float translationY = c1390410mHn.getTranslationY();
            if (Math.abs(translationY - f) < 0.5f) {
                C21647019ng c21647019ng2 = this.LIZJ;
                if (c21647019ng2 != null) {
                    c21647019ng2.LIZ();
                }
                this.LIZLLL = null;
                C786410Ut5.ed(c1390410mHn, f);
            } else {
                C21647019ng c21647019ng3 = this.LIZJ;
                if (c21647019ng3 != null) {
                    c21647019ng3.LIZ();
                }
                this.LIZLLL = Float.valueOf(f);
                C21647019ng c21647019ng4 = new C21647019ng(c1390410mHn.getContext(), c1390410mHn, new C19746312Np(EnumC19746112Nn.SPRING, (C0HU6) this.LJ.getValue(), Collections.singletonList(new C19746412Nq("translationY", new C0HV5(translationY, f)))), false);
                c21647019ng4.LJI(true);
                this.LIZJ = c21647019ng4;
            }
        }
        c1390410mHn.LIZJ();
    }
}
