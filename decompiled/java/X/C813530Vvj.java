package X;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Vvj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813530Vvj {
    public final Context LIZ;
    public final Notification.Builder LIZIZ;
    public final C813610Vvr LIZJ;
    public final RemoteViews LIZLLL;
    public final RemoteViews LJ;
    public final List<Bundle> LJFF = new ArrayList();
    public final Bundle LJI = new Bundle();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027d  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.app.Notification$BubbleMetadata, android.net.Uri, java.lang.CharSequence, java.lang.CharSequence[], long[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C813530Vvj(X.C813610Vvr r19) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C813530Vvj.<init>(X.0Vvr):void");
    }

    public final void LIZ(C813540Vvk c813540Vvk) {
        Bundle bundle;
        IconCompat iconCompatLIZ = c813540Vvk.LIZ();
        Icon iconLJFF = null;
        if (iconCompatLIZ != null) {
            iconLJFF = C815270VyX.LJFF(iconCompatLIZ, null);
        }
        Notification.Action.Builder builderLIZ = C813490Vvf.LIZ(iconLJFF, c813540Vvk.LJIIIIZZ, c813540Vvk.LJIIIZ);
        C813560Vvm[] c813560VvmArr = c813540Vvk.LIZJ;
        if (c813560VvmArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[c813560VvmArr.length];
            for (int i = 0; i < c813560VvmArr.length; i++) {
                remoteInputArr[i] = C813560Vvm.LIZ(c813560VvmArr[i]);
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                C813520Vvi.LIZJ(builderLIZ, remoteInput);
            }
        }
        if (c813540Vvk.LIZ != null) {
            bundle = new Bundle(c813540Vvk.LIZ);
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c813540Vvk.LIZLLL);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            C813470Vvd.LIZ(builderLIZ, c813540Vvk.LIZLLL);
        }
        bundle.putInt("android.support.action.semanticAction", c813540Vvk.LJFF);
        if (i2 >= 28) {
            C813580Vvo.LIZIZ(builderLIZ, c813540Vvk.LJFF);
            if (i2 >= 29) {
                C813480Vve.LIZJ(builderLIZ, c813540Vvk.LJI);
                if (i2 >= 31) {
                    C813600Vvq.LIZ(builderLIZ, c813540Vvk.LJIIJ);
                }
            }
        }
        bundle.putBoolean("android.support.action.showsUserInterface", c813540Vvk.LJ);
        C813520Vvi.LIZIZ(builderLIZ, bundle);
        C813520Vvi.LIZ(this.LIZIZ, C813520Vvi.LIZLLL(builderLIZ));
    }
}
