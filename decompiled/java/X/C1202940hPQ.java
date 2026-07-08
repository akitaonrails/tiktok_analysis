package X;

import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0hPQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202940hPQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC1484830ok5 interfaceC1484830ok5, final FrameLayout frameLayout) {
        if (frameLayout == null) {
            return;
        }
        interfaceC1484830ok5.LIZJ(new InterfaceC1483820oiS() { // from class: X.0hPR
            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ boolean bn() {
                return true;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
                return null;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ Surface getSurface() {
                return null;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ void hj() {
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ void pe() {
            }

            @Override // X.InterfaceC1483820oiS
            public final HashMap getParams() {
                return new HashMap();
            }

            @Override // X.InterfaceC1483820oiS
            public final FrameLayout getPlayViewContainer() {
                return frameLayout;
            }
        });
        int childCount = frameLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = frameLayout.getChildAt(i);
            C2271391DvN.LIZ(childAt, (C1A5L) C2271381DvM.S.getValue());
            childAt.setOnTouchListener(new View.OnTouchListener() { // from class: X.0hPP
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            });
            C339190DRl.LIZLLL(childAt);
        }
    }
}
