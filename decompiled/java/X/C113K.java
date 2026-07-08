package X;

import Y.ARunnableS129S0100000_29;
import android.view.MotionEvent;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.effect.EffectModel;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.113K, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C113K implements InterfaceC21676019sM {
    public final LifecycleOwner LL;
    public final RecyclerView LLILLJJLI;
    public final boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public long LLJILLL;
    public RecyclerView.ViewHolder LLJJI;
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1031));
    public int LLJJIII = -1;
    public final ARunnableS129S0100000_29 LLJJIJI = new ARunnableS129S0100000_29(this, 200);
    public final ARunnableS129S0100000_29 LLJJIJIIJIL = new ARunnableS129S0100000_29(this, 199);

    @Override // X.InterfaceC21676019sM
    public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC21676019sM
    public final void LJIIZILJ(boolean z) {
    }

    public final void LIZ(boolean z) {
        RecyclerView.ViewHolder viewHolder;
        EffectModel effectModel;
        EffectModel effectModel2;
        C113D c113d;
        C113J c113j;
        int iLIZ;
        EffectModel effectModel3;
        boolean z2 = this.LLIZ;
        if ((!z2 && !this.LLILZ && !this.LLILZLL) || (viewHolder = this.LLJJI) == null || !(viewHolder instanceof C113H)) {
            return;
        }
        if (this.LLILZLL && this.LLILZIL) {
            this.LLILZIL = false;
            C113H c113h = (C113H) viewHolder;
            if (c113h.LLILLL && (c113j = c113h.LLILZIL) != null && -1 != (iLIZ = c113j.LIZ(c113h.getAbsoluteAdapterPosition())) && (effectModel3 = c113h.LLIZ) != null) {
                c113h.R5(0.9f);
                C113J c113j2 = c113h.LLILZIL;
                if (c113j2 != null) {
                    c113j2.LJII(0, iLIZ, effectModel3);
                    return;
                }
                return;
            }
            return;
        }
        if (z2) {
            if (!this.LLIZLLLIL && System.currentTimeMillis() - this.LLJILLL < 1000 && z) {
                ((C113H) viewHolder).P5();
                return;
            }
            C113H c113h2 = (C113H) viewHolder;
            int absoluteAdapterPosition = this.LLJJIII;
            if ((!c113h2.LLILLL || (effectModel2 = c113h2.LLIZ) == null || (c113d = c113h2.LLILZ) == null || !c113d.LJIILL(effectModel2)) && z) {
                c113h2.P5();
                return;
            }
            C113J c113j3 = c113h2.LLILZIL;
            if (c113j3 == null) {
                return;
            }
            if (absoluteAdapterPosition < 0) {
                absoluteAdapterPosition = c113h2.getAbsoluteAdapterPosition();
            }
            int iLIZ2 = c113j3.LIZ(absoluteAdapterPosition);
            if (-1 == iLIZ2 || (effectModel = c113h2.LLIZ) == null) {
                return;
            }
            c113h2.R5(1.0f);
            C113J c113j4 = c113h2.LLILZIL;
            if (c113j4 == null) {
                return;
            }
            c113j4.LJII(1, iLIZ2, effectModel);
            return;
        }
        if (!this.LLILZ || !z) {
            return;
        }
        ((C113H) viewHolder).P5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (r2 != 3) goto L9;
     */
    @Override // X.InterfaceC21676019sM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIFFI(androidx.recyclerview.widget.RecyclerView r8, android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113K.LJJIFFI(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    public C113K(LifecycleOwner lifecycleOwner, RecyclerView recyclerView, boolean z) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = recyclerView;
        this.LLILLL = z;
    }
}
