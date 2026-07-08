package X;

import Y.ACallableS10S1101000_31;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sAN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616450sAN {
    public static void LIZ(MotionEvent motionEvent, ViewGroup viewGroup) {
        Integer numValueOf;
        Aweme awemeLJFF;
        View viewLIZIZ;
        String eventType;
        Boolean bool;
        View view;
        if (!C300550BqH.LIZ()) {
            return;
        }
        Integer numValueOf2 = null;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() != 0 && numValueOf.intValue() != 2) {
            int i = 1;
            if (numValueOf.intValue() == 1) {
                if (C300550BqH.LIZ() && viewGroup != null && (awemeLJFF = C740740T3w.LJFF(C827203La.LIZ(viewGroup.getContext()))) != null && C20552315bV.LJIIJ(awemeLJFF)) {
                    if (!C1616460sAO.LIZJ.contains(C20552315bV.LJII(awemeLJFF)) && (viewLIZIZ = C1967407nE.LIZIZ(viewGroup)) != null && !C1616460sAO.LIZ.contains(Integer.valueOf(viewLIZIZ.getId()))) {
                        Set<Integer> set = C1616460sAO.LIZIZ;
                        Object parent = viewLIZIZ.getParent();
                        if ((parent instanceof View) && (view = (View) parent) != null) {
                            numValueOf2 = Integer.valueOf(view.getId());
                        }
                        if (!C13LP.LJJJJ(numValueOf2, set) && (eventType = C680080Qly.LIZIZ(C827203La.LIZ(viewGroup.getContext())).getEventType()) != null) {
                            if (!Intrinsics.LJFF("homepage_hot", eventType) && !Intrinsics.LJFF("homepage_nearby", eventType) && !Intrinsics.LJFF("homepage_follow", eventType) && !Intrinsics.LJFF("homepage_friends", eventType)) {
                                return;
                            }
                            Object tag = viewLIZIZ.getTag(R.id.ekt);
                            if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null && bool.booleanValue()) {
                                i = -1;
                            }
                            C20552315bV.LJIIL(awemeLJFF, "click");
                            C0T5M c0t5m = C0T5M.LIZ;
                            ACallableS10S1101000_31 aCallableS10S1101000_31 = new ACallableS10S1101000_31(i, awemeLJFF, eventType, 0);
                            c0t5m.getClass();
                            C0T5M.LIZIZ(aCallableS10S1101000_31);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            numValueOf.intValue();
        }
    }
}
