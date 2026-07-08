package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ptl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659430Ptl {
    public static final void LIZ(MotionEvent motionEvent, View view, C653660PkS c653660PkS, Aweme aweme) {
        String str;
        String groupId;
        if (c653660PkS != null) {
            str = c653660PkS.LJIIIIZZ;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "general_search")) {
            return;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        int iLIZIZ = C341940Daq.LIZIZ(C14KQ.LJIIIIZZ(contextLIZ));
        int iLIZIZ2 = C341940Daq.LIZIZ(C14KQ.LJ(contextLIZ));
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        int iLIZIZ3 = C341940Daq.LIZIZ(((double) motionEvent.getRawX()) - ((double) iArr[0]));
        int iLIZIZ4 = C341940Daq.LIZIZ(((double) motionEvent.getRawY()) - ((double) iArr[1]));
        C659890PuV c659890PuV = new C659890PuV();
        c659890PuV.LJIJJ(c653660PkS.LJIIIIZZ);
        if (aweme == null || (groupId = aweme.getGroupId()) == null) {
            groupId = "";
        }
        c659890PuV.LJIJI("search_result_id", groupId);
        c659890PuV.LJIIZILJ("btm", "a2270.b6880.c8153.d0");
        c659890PuV.LJIIZILJ("x", String.valueOf(iLIZIZ3));
        c659890PuV.LJIIZILJ("y", String.valueOf(iLIZIZ4));
        c659890PuV.LJIIZILJ("rank", String.valueOf(c653660PkS.LJIILL));
        c659890PuV.LJIIZILJ("universal_rank", String.valueOf(c653660PkS.LJIILLIIL));
        c659890PuV.LJIIZILJ("screen_width", String.valueOf(iLIZIZ));
        c659890PuV.LJIIZILJ("screen_height", String.valueOf(iLIZIZ2));
        c659890PuV.LJIILJJIL();
    }
}
