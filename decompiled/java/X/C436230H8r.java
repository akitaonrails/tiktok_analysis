package X;

import android.net.Uri;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0H8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436230H8r {
    public C1322110kVd LIZ;

    public final void LIZ(FrameLayout frameLayout) {
        ViewGroup viewGroup;
        if (frameLayout != null) {
            if (this.LIZ == null) {
                C1322110kVd c1322110kVd = new C1322110kVd(frameLayout.getContext());
                C786410Ut5.c7(c1322110kVd, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(323)), 51));
                C1331090kk7 c1331090kk7 = new C1331090kk7(c1322110kVd.getResources());
                c1331090kk7.LJIIL = InterfaceC1320380kSq.LIZJ;
                c1322110kVd.setHierarchy(c1331090kk7.LIZ());
                C786410Ut5.LLZZLLIL(c1322110kVd, 8);
                C786410Ut5.H5(c1322110kVd, 0.5f);
                this.LIZ = c1322110kVd;
            }
            C1322110kVd c1322110kVd2 = this.LIZ;
            if (c1322110kVd2 != null) {
                ViewParent parent = c1322110kVd2.getParent();
                if (parent == null) {
                    frameLayout.addView(c1322110kVd2);
                } else if (!Intrinsics.LJFF(parent, frameLayout)) {
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        C786410Ut5.LJJJLZIJ(c1322110kVd2, viewGroup);
                    }
                    frameLayout.addView(c1322110kVd2);
                }
                if (c1322110kVd2.getVisibility() != 0) {
                    C786410Ut5.LLZZLLIL(c1322110kVd2, 0);
                }
                c1322110kVd2.bringToFront();
            }
        }
    }

    public final void LIZIZ(String str) {
        C1322110kVd c1322110kVd;
        Uri uriFromFile;
        if (a0.LJJJIL(str) || (c1322110kVd = this.LIZ) == null) {
            return;
        }
        try {
            if (C2471909mP.LJJIIZI(str)) {
                uriFromFile = UriProtector.parse(str);
            } else {
                uriFromFile = Uri.fromFile(new C0VSJ(str));
            }
            if (uriFromFile != null) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJI(uriFromFile);
                c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
                c1320810kTXLIZJ.LJIIIIZZ = new C0IE7(uriFromFile, 2);
                c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
            }
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ(float f, float f2) {
        C1322110kVd c1322110kVd = this.LIZ;
        if (c1322110kVd == null) {
            return;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1322110kVd);
        c1322110kVd.setTranslationX((f - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)) / 2.0f)) - c1322110kVd.getLeft());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1322110kVd);
        c1322110kVd.setTranslationY((f2 - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(323)) / 2.0f)) - c1322110kVd.getTop());
    }
}
