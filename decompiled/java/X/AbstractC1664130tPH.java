package X;

import Y.ARunnableS121S0100000_21;
import Y.ARunnableS32S0101000_21;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tPH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1664130tPH extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public RecyclerView LL;
    public InterfaceC1664180tPM LLILLJJLI;
    public List<? extends Effect> LLILZ;
    public C19754712Qv LLILZIL;
    public Effect LLILZLL;
    public final ArrayList<C1664150tPJ> LLILLL = new ArrayList<>();
    public int LLIZ = -1;
    public int LLIZLLLIL = -1;
    public final C1664160tPK LLJ = new InterfaceC1664290tPX() { // from class: X.0tPK
        @Override // X.InterfaceC1664290tPX
        public final void LIZ(int i) {
            if (-1 == i) {
                return;
            }
            C1664150tPJ c1664150tPJ = (C1664150tPJ) ListProtector.get(this.LIZ.LLILLL, i);
            InterfaceC1664180tPM interfaceC1664180tPM = this.LIZ.LLILLJJLI;
            if (interfaceC1664180tPM != null) {
                interfaceC1664180tPM.LIZ(i, c1664150tPJ);
            }
        }
    };

    public abstract void LLLFZ();

    public abstract void LLLIIIIL();

    public abstract RecyclerView.ViewHolder LLLIILIL(ViewGroup viewGroup, int i, C1664160tPK c1664160tPK);

    public final void LLLI() {
        if (this.LLIZ == -1) {
            return;
        }
        Iterator<C1664150tPJ> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().LJII = false;
        }
        notifyItemChanged(this.LLIZ);
        this.LLIZ = -1;
    }

    public final void LLLIL() {
        int i = this.LLIZ;
        if (i < 0 || i >= this.LLILLL.size()) {
            RecyclerView recyclerView = this.LL;
            if (recyclerView != null) {
                HandlerHook.viewPost(recyclerView, new ARunnableS121S0100000_21(this, 98));
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.LL;
        if (recyclerView2 != null) {
            HandlerHook.viewPost(recyclerView2, new ARunnableS32S0101000_21(i, this, 9));
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    public final void LLLILZ(int i) {
        Effect effect;
        boolean z;
        int i2 = this.LLIZ;
        if (i2 == i) {
            return;
        }
        this.LLIZ = i;
        String name = null;
        int i3 = 0;
        C1664150tPJ c1664150tPJ = null;
        for (C1664150tPJ c1664150tPJ2 : this.LLILLL) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C1664150tPJ c1664150tPJ3 = c1664150tPJ2;
                if (i == i3) {
                    c1664150tPJ = c1664150tPJ3;
                }
                if (i == i3) {
                    z = true;
                } else {
                    z = false;
                }
                c1664150tPJ3.LJII = z;
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select ");
        sbLIZ.append(i);
        sbLIZ.append("  ");
        if (c1664150tPJ != null && (effect = c1664150tPJ.LIZ) != null) {
            name = effect.getName();
        }
        sbLIZ.append(name);
        C2188811AlT.LIZIZ(sbLIZ);
        notifyItemChanged(i2);
        notifyItemChanged(i);
    }

    @Override // X.AbstractC21673619ry
    public int getItemViewType(int i) {
        return !((C1664150tPJ) ListProtector.get(this.LLILLL, i)).LIZIZ ? 1 : 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LL = recyclerView;
    }

    public static boolean LLLII(Effect effect, Effect effect2) {
        String effectId;
        String name;
        String effectId2 = effect.getEffectId();
        String strLJII = null;
        if (effect2 != null) {
            effectId = effect2.getEffectId();
        } else {
            effectId = null;
        }
        if (!Intrinsics.LJFF(effectId2, effectId)) {
            String name2 = effect.getName();
            if (effect2 != null) {
                name = effect2.getName();
            } else {
                name = null;
            }
            if (Intrinsics.LJFF(name2, name)) {
                String strLJII2 = C1664460tPo.LJII(effect);
                if (effect2 != null) {
                    strLJII = C1664460tPo.LJII(effect2);
                }
                if (Intrinsics.LJFF(strLJII2, strLJII)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1664150tPJ c1664150tPJ = (C1664150tPJ) ListProtector.get(this.LLILLL, i);
        if (viewHolder instanceof C1664300tPY) {
            ((C1664300tPY) viewHolder).I5(c1664150tPJ);
        }
        LLLIIIIL();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLLLIILIL = LLLIILIL(viewGroup, i, this.LLJ);
        if (viewHolderLLLIILIL != null) {
            try {
                View view = viewHolderLLLIILIL.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        viewHolderLLLIILIL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLLLIILIL.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLLLIILIL.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLLLIILIL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLLLIILIL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLLLIILIL.getClass().getName();
        return viewHolderLLLIILIL;
    }
}
