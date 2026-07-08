package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19rz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21673719rz {
    public InterfaceC21677319sZ LL;
    public final ArrayList<InterfaceC21676919sV> LLILLJJLI = new ArrayList<>();
    public long LLILLL = 120;
    public long LLILZ = 120;
    public long LLILZIL = 250;
    public long LLILZLL = 250;

    public abstract boolean LIZJ(RecyclerView.ViewHolder viewHolder, C21676319sP c21676319sP, C21676319sP c21676319sP2);

    public abstract boolean LIZLLL(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, C21676319sP c21676319sP, C21676319sP c21676319sP2);

    public abstract boolean LJ(RecyclerView.ViewHolder viewHolder, C21676319sP c21676319sP, C21676319sP c21676319sP2);

    public abstract boolean LJFF(RecyclerView.ViewHolder viewHolder, C21676319sP c21676319sP, C21676319sP c21676319sP2);

    public boolean LJII(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    public abstract void LJIIJJI(RecyclerView.ViewHolder viewHolder);

    public abstract void LJIIL();

    public abstract boolean LJIIZILJ();

    public abstract void LJIJI();

    public final void LJIIJ() {
        int size = this.LLILLJJLI.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC21676919sV) ListProtector.get(this.LLILLJJLI, i)).LIZ();
        }
        this.LLILLJJLI.clear();
    }

    public long LJIILIIL() {
        return this.LLILLL;
    }

    public long LJIILJJIL() {
        return this.LLILZLL;
    }

    public long LJIILL() {
        return this.LLILZIL;
    }

    public long LJIILLIIL() {
        return this.LLILZ;
    }

    public static int LJI(RecyclerView.ViewHolder viewHolder) {
        int i = viewHolder.mFlags & 14;
        if (viewHolder.isInvalid()) {
            return 4;
        }
        if ((i & 4) == 0) {
            int oldPosition = viewHolder.getOldPosition();
            int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                return i | SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            }
            return i;
        }
        return i;
    }

    public final void LIZ(RecyclerView.ViewHolder viewHolder) {
        InterfaceC21677319sZ interfaceC21677319sZ = this.LL;
        if (interfaceC21677319sZ != null) {
            C21676219sO c21676219sO = (C21676219sO) interfaceC21677319sZ;
            c21676219sO.getClass();
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (!viewHolder.shouldBeKeptAsChild() && !c21676219sO.LIZ.removeAnimatingView(viewHolder.itemView) && viewHolder.isTmpDetached()) {
                c21676219sO.LIZ.removeDetachedView(viewHolder.itemView, false);
            }
        }
    }

    public final void LJIIIZ(RecyclerView.ViewHolder viewHolder) {
        try {
            LIZ(viewHolder);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ItemAnimator Guard---->\n");
            sbLIZ.append(e);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "rv_item_animator_illegal_argument_guard", true, false)) {
                throw e;
            }
        }
    }

    public final boolean LJIJ(InterfaceC21676919sV interfaceC21676919sV) {
        boolean zLJIIZILJ = LJIIZILJ();
        if (interfaceC21676919sV != null) {
            if (!zLJIIZILJ) {
                interfaceC21676919sV.LIZ();
            } else {
                this.LLILLJJLI.add(interfaceC21676919sV);
                return zLJIIZILJ;
            }
        }
        return zLJIIZILJ;
    }

    public void LJIJJ(long j) {
        this.LLILLL = j;
    }

    public void LJIJJLI(long j) {
        this.LLILZLL = j;
    }

    public void LJIL(long j) {
        this.LLILZIL = j;
    }

    public void LJJ(long j) {
        this.LLILZ = j;
    }

    public boolean LJIIIIZZ(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        return LJII(viewHolder);
    }
}
