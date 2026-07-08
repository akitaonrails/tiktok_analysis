package X;

import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20051713cx implements Comparator<FocusTargetNode> {
    public static final C20051713cx LL = new C20051713cx();

    @Override // java.util.Comparator
    public final int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        FocusTargetNode focusTargetNode3 = focusTargetNode;
        FocusTargetNode focusTargetNode4 = focusTargetNode2;
        int i = 0;
        if (C20059613eE.LIZLLL(focusTargetNode3) && C20059613eE.LIZLLL(focusTargetNode4)) {
            C20053713dH c20053713dHLJFF = C20052513d5.LJFF(focusTargetNode3);
            C20053713dH c20053713dHLJFF2 = C20052513d5.LJFF(focusTargetNode4);
            if (!Intrinsics.LJFF(c20053713dHLJFF, c20053713dHLJFF2)) {
                C19968013Aw c19968013Aw = new C19968013Aw(new C20053713dH[16]);
                while (c20053713dHLJFF != null) {
                    c19968013Aw.LIZJ(0, c20053713dHLJFF);
                    c20053713dHLJFF = c20053713dHLJFF.LJJIJIL();
                }
                C19968013Aw c19968013Aw2 = new C19968013Aw(new C20053713dH[16]);
                while (c20053713dHLJFF2 != null) {
                    c19968013Aw2.LIZJ(0, c20053713dHLJFF2);
                    c20053713dHLJFF2 = c20053713dHLJFF2.LJJIJIL();
                }
                int iMin = Math.min(c19968013Aw.LLILLL - 1, c19968013Aw2.LLILLL - 1);
                if (iMin >= 0) {
                    while (Intrinsics.LJFF(c19968013Aw.LL[i], c19968013Aw2.LL[i])) {
                        if (i != iMin) {
                            i++;
                        }
                    }
                    return Intrinsics.LJI(((C20053713dH) c19968013Aw.LL[i]).LJJIJL(), ((C20053713dH) c19968013Aw2.LL[i]).LJJIJL());
                }
                "Could not find a common ancestor between the two FocusModifiers.".toString();
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
            return 0;
        }
        if (C20059613eE.LIZLLL(focusTargetNode3)) {
            return -1;
        }
        if (C20059613eE.LIZLLL(focusTargetNode4)) {
            return 1;
        }
        return 0;
    }
}
