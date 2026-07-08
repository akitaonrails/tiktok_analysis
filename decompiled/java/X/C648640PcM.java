package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0PcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648640PcM implements InterfaceC650860Pfw, Comparable<C648640PcM> {
    public final RecyclerView.ViewHolder LL;
    public final C21681919tJ LLILLJJLI;
    public final View LLILLL;
    public final InterfaceC648350Pbt LLILZ;
    public View LLILZIL;
    public InterfaceC650860Pfw LLILZLL;

    @Override // X.InterfaceC652740Piy
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC650860Pfw
    public final int LJFF() {
        return this.LLILLJJLI.LLILLJJLI;
    }

    @Override // X.InterfaceC650860Pfw
    public final int LJIIIZ() {
        return this.LLILLJJLI.LL;
    }

    @Override // X.InterfaceC650860Pfw
    public final boolean N1() {
        return this.LLILZ.N1() && this.LLILZ.l2();
    }

    @Override // X.InterfaceC652740Piy
    public final int getPosition() {
        return this.LL.getBindingAdapterPosition();
    }

    @Override // X.InterfaceC652740Piy
    public final View getView() {
        View detectView = this.LLILZIL;
        if (detectView == null) {
            detectView = this.LLILZ.getDetectView();
            if (detectView == null) {
                detectView = this.LLILLL;
            }
            this.LLILZIL = detectView;
        }
        return detectView;
    }

    @Override // X.InterfaceC650860Pfw
    public final InterfaceC650860Pfw LJII() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC650860Pfw
    public final InterfaceC650860Pfw LJI(int i) {
        if (this.LLILLJJLI.LL == i) {
            return this;
        }
        InterfaceC650860Pfw interfaceC650860Pfw = this.LLILZLL;
        if (interfaceC650860Pfw != null && interfaceC650860Pfw.LJIIIZ() == i) {
            return this.LLILZLL;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C648640PcM c648640PcM) {
        return getPosition() - c648640PcM.getPosition();
    }

    public C648640PcM(RecyclerView.ViewHolder viewHolder, C21681919tJ c21681919tJ, View view, InterfaceC648350Pbt interfaceC648350Pbt) {
        this.LL = viewHolder;
        this.LLILLJJLI = c21681919tJ;
        this.LLILLL = view;
        this.LLILZ = interfaceC648350Pbt;
    }
}
