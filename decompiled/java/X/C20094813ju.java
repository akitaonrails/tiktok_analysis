package X;

import android.view.View;
import java.util.ArrayList;
import u4.q0;

/* JADX INFO: renamed from: X.13ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20094813ju {
    public static void LIZ(View view, C20094413jq c20094413jq) {
        C20094213jo c20094213joLJFF = q0.LJFF(view);
        if (c20094213joLJFF == null) {
            q0.LJIJ(view, c20094413jq);
            return;
        }
        if (c20094213joLJFF instanceof C20094513jr) {
            c20094413jq.LJIILLIIL = false;
            ((ArrayList) ((C20094513jr) c20094213joLJFF).LIZ).add(c20094413jq);
            return;
        }
        c20094413jq.LJIILLIIL = false;
        C20094513jr c20094513jr = new C20094513jr();
        ((ArrayList) c20094513jr.LIZ).add(c20094213joLJFF);
        ((ArrayList) c20094513jr.LIZ).add(c20094413jq);
        q0.LJIJ(view, c20094513jr);
    }
}
