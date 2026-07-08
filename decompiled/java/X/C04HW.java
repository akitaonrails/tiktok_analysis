package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04HW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04HW extends AbstractC2172971A2l<C042Y, C1072104Hf> {
    public final int LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC1749380vcm LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public InterfaceC1072404Hi LLJILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i % 2 == 0) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1749350vcj c1749350vcj;
        C1072104Hf c1072104Hf = (C1072104Hf) viewHolder;
        C042Y c042yLLLFZ = LLLFZ(i);
        InterfaceC1749380vcm interfaceC1749380vcm = this.LLILZ;
        boolean z = this.LLILZLL;
        int i2 = this.LLILLJJLI;
        int i3 = this.LLILLL;
        int i4 = this.LLIZ;
        int i5 = this.LLIZLLLIL;
        int i6 = this.LLJ;
        int i7 = this.LLJI;
        int i8 = this.LLJIJIL;
        int i9 = this.LLJILJIL;
        int i10 = this.LLJILJILJ;
        c1072104Hf.getClass();
        int i11 = C04HT.LLJJJJ;
        if (C04HU.LIZ(i, z)) {
            i2 = i3;
        } else {
            i9 = i10;
        }
        View view = c1072104Hf.itemView;
        if ((view instanceof C1749350vcj) && (c1749350vcj = (C1749350vcj) view) != null) {
            if (i != i4) {
                c1749350vcj.setSpecTextMaxLines(i9);
                c1749350vcj.setSpecTextViewHeight(i2);
            } else {
                c1749350vcj.setSpecTextMaxLines(i5);
                c1749350vcj.setSpecTextContainerHeight(i2);
                c1749350vcj.setSpecTextViewHeight(i6);
                c1749350vcj.setBenefitTextViewHeight(i7);
            }
            c1749350vcj.setTextMaxWidth(i8);
            c1749350vcj.j0(c042yLLLFZ.LLIZLLLIL, c042yLLLFZ.LLJI, i, interfaceC1749380vcm);
            if (!Intrinsics.LJFF(c1072104Hf.LL, c042yLLLFZ.LL)) {
                c1072104Hf.LL = c042yLLLFZ.LL;
                c1749350vcj.l0(c042yLLLFZ.LLILZ, c042yLLLFZ.LLILLJJLI, c042yLLLFZ.LLILZLL, i);
            }
        }
        InterfaceC1072404Hi interfaceC1072404Hi = this.LLJILLL;
        if (interfaceC1072404Hi != null) {
            interfaceC1072404Hi.LIZ(c1072104Hf.itemView, i, c042yLLLFZ);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1072104Hf c1072104Hf = new C1072104Hf(viewGroup.getContext(), this.LLILZIL);
        try {
            View view = c1072104Hf.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1072104Hf.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1072104Hf.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1072104Hf.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1072104Hf.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1072104Hf.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1072104Hf.class.getName();
        return c1072104Hf;
    }

    public C04HW(int i, int i2, C04EQ c04eq, int i3, boolean z, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        super(new AbstractC339510DSr<C042Y>() { // from class: X.04ER
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C042Y c042y, C042Y c042y2) {
                C042Y c042y3 = c042y;
                C042Y c042y4 = c042y2;
                if (Intrinsics.LJFF(c042y3, c042y4) && c042y3.LLIZLLLIL == c042y4.LLIZLLLIL && c042y3.LLJI == c042y4.LLJI && c042y3.LLJ == c042y4.LLJ) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C042Y c042y, C042Y c042y2) {
                return Intrinsics.LJFF(c042y.LL, c042y2.LL);
            }
        });
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = c04eq;
        this.LLILZIL = i3;
        this.LLILZLL = z;
        this.LLIZ = i4;
        this.LLIZLLLIL = i5;
        this.LLJ = i6;
        this.LLJI = i7;
        this.LLJIJIL = i8;
        this.LLJILJIL = i9;
        this.LLJILJILJ = i10;
    }
}
