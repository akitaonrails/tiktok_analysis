package X;

import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0Rwv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712350Rwv {
    public static final void LIZ(final C21599719g3 c21599719g3, final int i) {
        if (c21599719g3.getWindowVisibility() != 8) {
            c21599719g3.LLFFF(i, false);
        } else {
            HandlerHook.viewPost(c21599719g3, new Runnable() { // from class: X.0Rwu
                public final /* synthetic */ boolean LLILLL = false;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ImagePageViewerKt@93db.setImageViewerPositionSafely$1");
                    try {
                        c21599719g3.LLFFF(i, this.LLILLL);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ImagePageViewerKt@93db.setImageViewerPositionSafely$1");
                }
            });
        }
    }
}
