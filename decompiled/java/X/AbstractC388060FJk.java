package X;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0FJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC388060FJk extends RecyclerView.ViewHolder {
    public static final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
    public static final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
    public static final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
    public final InterfaceC388110FJp LL;
    public final C388080FJm LLILLJJLI;

    public abstract void I5(C388080FJm c388080FJm);

    public C388080FJm L5() {
        return this.LLILLJJLI;
    }

    public AbstractC388060FJk(FrameLayout frameLayout, InterfaceC388110FJp interfaceC388110FJp) {
        super(frameLayout);
        this.LL = interfaceC388110FJp;
        this.LLILLJJLI = new C388080FJm(0, 0, 0, false, 0, 0, 0, 2047);
    }
}
