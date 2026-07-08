package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OSR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OSR implements InterfaceC1891350zJl {
    public static final /* synthetic */ int LLIZ = 0;
    public final C419910GdJ LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final View.OnClickListener LLILZLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C0OSR(C419910GdJ c419910GdJ, int i, int i2, View.OnClickListener onClickListener, int i3) {
        int i4;
        if ((i3 & 2) != 0) {
            i4 = 20;
        } else {
            i4 = 0;
        }
        int i5 = (i3 & 4) != 0 ? 20 : 0;
        i2 = (i3 & 64) != 0 ? R.attr.a1h : i2;
        this.LL = c419910GdJ;
        this.LLILLJJLI = i4;
        this.LLILLL = i5;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = onClickListener;
    }
}
