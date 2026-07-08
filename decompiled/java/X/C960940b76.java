package X;

import Y.ARunnableS19S1200000_15;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0b76, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960940b76 {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZIZ(RecyclerView.ViewHolder viewHolder, C955670ayb c955670ayb) {
        String str;
        C961720b8M c961720b8M = c955670ayb.LIZLLL;
        if (c961720b8M == null || c961720b8M.LIZJ || (str = c961720b8M.LIZIZ) == null) {
            return;
        }
        c961720b8M.LIZJ = true;
        C961660b8G c961660b8G = c961720b8M.LIZ;
        HandlerHook.viewPost(viewHolder.itemView, new ARunnableS19S1200000_15(c961660b8G, str, c961660b8G.LJ, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.ies.sdk.datachannel.DataChannel r37, java.lang.String r38, java.util.List r39, boolean r40) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C960940b76.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, java.util.List, boolean):void");
    }
}
