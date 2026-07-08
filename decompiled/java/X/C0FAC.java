package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FAC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FAC extends AbstractC1664490tPr<C0FAE, C0FAF> {
    public C0FA9 LLJJJIL;

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0FA9 c0fa9 = this.LLJJJIL;
        if (c0fa9 != null) {
            c0fa9.LLILZ = new AwS584S0100000_5(this, 1223);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FAD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0FAE) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1224));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        boolean z2;
        int iLIZIZ;
        boolean z3;
        boolean z4;
        int iLIZIZ2;
        int iLIZLLL = C418440Gaw.LIZLLL(requireSceneContext());
        if (iLIZLLL <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320))) {
            z = true;
        } else {
            z = false;
        }
        if (iLIZLLL > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320)) && iLIZLLL <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        } else if (z2) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        }
        int iLIZLLL2 = C418440Gaw.LIZLLL(requireSceneContext());
        if (iLIZLLL2 <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (iLIZLLL2 > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320)) && iLIZLLL2 <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360))) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        } else if (z4) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
        }
        RecyclerView recyclerView = new RecyclerView(requireSceneContext());
        C786410Ut5.p6(recyclerView, new FrameLayout.LayoutParams(-1, iLIZIZ2));
        recyclerView.setMotionEventSplittingEnabled(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, new C1361400lX0(requireSceneContext(), R.style.y0));
        if (numLIZJ != null) {
            recyclerView.setBackgroundColor(numLIZJ.intValue());
        }
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        final C0FA9 c0fa9 = new C0FA9(iLIZIZ, iLIZIZ2, requireSceneContext());
        this.LLJJJIL = c0fa9;
        recyclerView.setAdapter(c0fa9);
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireSceneContext(), 0, false));
        final Context contextRequireSceneContext = requireSceneContext();
        recyclerView.addItemDecoration(new C0DXR(contextRequireSceneContext, c0fa9) { // from class: X.0FAB
            public final C0FA9 LL;
            public final int LLILLJJLI;

            {
                this.LL = c0fa9;
                this.LLILLJJLI = C418440Gaw.LIZLLL(contextRequireSceneContext);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
            @Override // X.C0DXR
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(android.graphics.Rect r8, android.view.View r9, androidx.recyclerview.widget.RecyclerView r10, X.C21673919s1 r11) {
                /*
                    r7 = this;
                    super.LIZIZ(r8, r9, r10, r11)
                    X.0FA9 r0 = r7.LL
                    java.util.ArrayList<X.0F9n> r0 = r0.LLILZIL
                    int r5 = r0.size()
                    X.0FA9 r0 = r7.LL
                    int r6 = r0.LLLFZ()
                    boolean r0 = X.C293810BfP.LIZ()
                    r3 = 7
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L64
                    int r0 = r7.LLILLJJLI
                    int r6 = r6 * r5
                    int r0 = r0 - r6
                    float r4 = (float) r0
                    int r5 = r5 + (-1)
                L21:
                    float r0 = (float) r5
                    float r4 = r4 / r0
                L23:
                    int r4 = (int) r4
                    int r6 = r10.getChildAdapterPosition(r9)
                    X.0FA9 r0 = r7.LL
                    java.util.ArrayList<X.0F9n> r0 = r0.LLILZIL
                    int r5 = r0.size()
                    X.0FA9 r0 = r7.LL
                    java.util.ArrayList<X.0F9n> r0 = r0.LLILZIL
                    int r0 = r0.size()
                    if (r0 < r3) goto L8f
                    r1 = 8
                    if (r6 != 0) goto L61
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                    float r0 = X.C418440Gaw.LIZIZ(r0)
                    int r0 = X.C814420VxA.LIZIZ(r0)
                L4a:
                    r8.left = r0
                    int r5 = r5 - r2
                    if (r6 != r5) goto L5e
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                    float r0 = X.C418440Gaw.LIZIZ(r0)
                    int r0 = X.C814420VxA.LIZIZ(r0)
                L5b:
                    r8.right = r0
                    return
                L5e:
                    int r0 = r4 / 2
                    goto L5b
                L61:
                    int r0 = r4 / 2
                    goto L4a
                L64:
                    X.0FA9 r0 = r7.LL
                    java.util.ArrayList<X.0F9n> r0 = r0.LLILZIL
                    int r0 = r0.size()
                    if (r0 < r3) goto L89
                    int r0 = r7.LLILLJJLI
                    float r4 = (float) r0
                    r0 = 16
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    float r0 = X.C418440Gaw.LIZIZ(r0)
                    int r0 = X.C814420VxA.LIZIZ(r0)
                    float r0 = (float) r0
                    float r4 = r4 - r0
                    int r6 = r6 * r5
                    float r0 = (float) r6
                    float r4 = r4 - r0
                    float r0 = (float) r5
                    float r4 = r4 / r0
                    float r0 = (float) r2
                    float r4 = r4 - r0
                    goto L23
                L89:
                    int r0 = r7.LLILLJJLI
                    int r6 = r6 * r5
                    int r0 = r0 - r6
                    float r4 = (float) r0
                    goto L21
                L8f:
                    boolean r0 = X.C293810BfP.LIZ()
                    if (r0 == 0) goto Lad
                    int r0 = r10.getLayoutDirection()
                    if (r0 != r2) goto Lab
                    r0 = 1
                L9c:
                    if (r5 <= 0) goto La8
                    int r5 = r5 - r2
                    if (r6 == r5) goto La8
                    if (r0 == 0) goto La9
                    r0 = r4
                    r4 = 0
                La5:
                    r8.set(r0, r1, r4, r1)
                La8:
                    return
                La9:
                    r0 = 0
                    goto La5
                Lab:
                    r0 = 0
                    goto L9c
                Lad:
                    int r0 = r4 / 2
                    r8.left = r0
                    r8.right = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0FAB.LIZIZ(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.19s1):void");
            }
        });
        return recyclerView;
    }
}
