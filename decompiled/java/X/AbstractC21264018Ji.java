package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.18Ji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21264018Ji implements InterfaceC21263418Jc {
    public final ArrayList<Integer> LL = new ArrayList<>();

    @Override // X.InterfaceC21263418Jc
    public void LJII() {
    }

    @Override // X.InterfaceC21263418Jc
    public final int[] LJ() {
        return C13LP.LLII(this.LL);
    }

    @Override // X.InterfaceC21263418Jc
    public InterfaceC21263718Jf LJFF() {
        return C21264318Jl.LIZ;
    }

    @Override // X.InterfaceC21263418Jc
    public final EnumC21263618Je LJIIIIZZ() {
        return EnumC21263618Je.ACTIVITY_DESTORY;
    }

    @Override // X.InterfaceC21263418Jc
    public final EnumC714840S2g threadMode() {
        return EnumC714840S2g.SINGLE;
    }

    @Override // X.InterfaceC21263418Jc
    public final ViewGroup LJI(Context context) {
        return new FrameLayout(context);
    }
}
