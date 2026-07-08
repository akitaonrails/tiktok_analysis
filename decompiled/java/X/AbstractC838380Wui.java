package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0Wui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC838380Wui extends AbstractC19515011Wq {
    public abstract void LIZIZ(C19514611Wm c19514611Wm, C0HWO... c0hwoArr);

    @Override // X.AbstractC19515011Wq
    public final void LIZ(C19514611Wm c19514611Wm, String... strArr) {
        WeakReference<Context> weakReference;
        Context context;
        if (c19514611Wm != null && (weakReference = c19514611Wm.LJ) != null && (context = weakReference.get()) != null) {
            C0HWO[] c0hwoArr = (C0HWO[]) C19514011Wg.LIZ(context, C13LQ.LJJLL(strArr)).toArray(new C0HWO[0]);
            LIZIZ(c19514611Wm, (C0HWO[]) Arrays.copyOf(c0hwoArr, c0hwoArr.length));
        }
    }
}
