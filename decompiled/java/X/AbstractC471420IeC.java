package X;

import Y.AObserverS211S0100000_7;
import android.database.Observable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IeC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC471420IeC<T> extends C1A6D<T, RecyclerView.ViewHolder> {
    public PagingViewModel<T> LLILLJJLI;
    public final AObserverS211S0100000_7 LLILLL;
    public final AObserverS211S0100000_7 LLILZ;
    public final AObserverS211S0100000_7 LLILZIL;
    public final AObserverS211S0100000_7 LLILZLL;
    public final AObserverS211S0100000_7 LLIZ;
    public final AObserverS211S0100000_7 LLIZLLLIL;
    public EnumC470780IdA LLJ;
    public EnumC470780IdA LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final boolean LLJJ;
    public final boolean LLJJI;
    public final AbstractC471420IeC<T>.c LLJJIII;

    /* JADX INFO: renamed from: X.0IeC$c */
    public class c extends Observable<AbstractC471570IeR> {
        public final /* synthetic */ AbstractC471420IeC LIZ;

        public final void LIZ() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC471570IeR) ListProtector.get(((Observable) this).mObservers, size)).LIZ();
            }
        }

        public c(AbstractC471430IeD abstractC471430IeD) {
            this.LIZ = abstractC471430IeD;
        }

        public final void LIZIZ(int i, int i2) {
            this.LIZ.getClass();
            this.LIZ.getClass();
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC471570IeR) ListProtector.get(((Observable) this).mObservers, size)).LJ(i, i2);
            }
        }

        public final void LIZJ(int i, int i2) {
            this.LIZ.getClass();
            int size = ((Observable) this).mObservers.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AbstractC471570IeR) ListProtector.get(((Observable) this).mObservers, size)).LIZJ(i, i2, null);
                } else {
                    return;
                }
            }
        }

        public final void LIZLLL(int i, int i2) {
            this.LIZ.getClass();
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC471570IeR) ListProtector.get(((Observable) this).mObservers, size)).LIZLLL(i, i2);
            }
        }

        public final void LJ(int i, int i2) {
            this.LIZ.getClass();
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC471570IeR) ListProtector.get(((Observable) this).mObservers, size)).LJFF(i, i2);
            }
        }
    }

    public abstract int LLLIL(Object obj);

    public abstract AbstractC468490IYt LLLL(int i, ViewGroup viewGroup);

    public final boolean LLLILZ() {
        return !this.LLJILJILJ && this.LLJILJIL && this.LLJJI;
    }

    public final int LLLIILIL() {
        return super.getItemCount();
    }

    public final boolean LLLILZLLLI() {
        EnumC470780IdA enumC470780IdA;
        if (LLLILZ() || !this.LLJJ || (enumC470780IdA = this.LLJI) == null) {
            return false;
        }
        if (enumC470780IdA == EnumC470780IdA.SUCCESS) {
            EnumC470780IdA enumC470780IdA2 = this.LLJ;
            return enumC470780IdA2 == EnumC470780IdA.RUNNING || enumC470780IdA2 == EnumC470780IdA.FAILED;
        }
        EnumC470780IdA enumC470780IdA3 = EnumC470780IdA.FAILED;
        return enumC470780IdA == enumC470780IdA3 && this.LLJ == enumC470780IdA3;
    }

    @Override // X.C1A6D, X.AbstractC21673619ry
    public final int getItemCount() {
        return super.getItemCount() + (LLLILZ() ? 1 : 0) + (LLLILZLLLI() ? 1 : 0) + ((this.LLJILJILJ && LLLLIIL()) ? 1 : 0);
    }

    public boolean LLLLIIL() {
        return this.LLJILLL;
    }

    public AbstractC471420IeC(C471620IeW c471620IeW) {
        super(c471620IeW);
        final AbstractC471430IeD abstractC471430IeD = (AbstractC471430IeD) this;
        this.LLILLL = new AObserverS211S0100000_7(abstractC471430IeD, 38);
        this.LLILZ = new AObserverS211S0100000_7(abstractC471430IeD, 39);
        this.LLILZIL = new AObserverS211S0100000_7(abstractC471430IeD, 43);
        this.LLILZLL = new AObserverS211S0100000_7(abstractC471430IeD, 40);
        this.LLIZ = new AObserverS211S0100000_7(abstractC471430IeD, 41);
        this.LLIZLLLIL = new AObserverS211S0100000_7(abstractC471430IeD, 42);
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = false;
        this.LLJILLL = true;
        this.LLJJ = true;
        this.LLJJI = true;
        AbstractC471570IeR abstractC471570IeR = new AbstractC471570IeR() { // from class: X.0IeP
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                abstractC471430IeD.LLJJIII.LIZ();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZIZ(int i, int i2) {
                abstractC471430IeD.LLJJIII.LIZJ(i, i2);
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                abstractC471430IeD.LLJJIII.LIZLLL(i, i2);
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i, int i2) {
                abstractC471430IeD.LLJJIII.LIZIZ(i, i2);
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i, int i2) {
                abstractC471430IeD.LLJJIII.LJ(i, i2);
            }
        };
        this.LLJJIII = new c(abstractC471430IeD);
        super.registerAdapterDataObserver(abstractC471570IeR);
    }

    public static final void LLLLII(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewHolder.itemView.getLayoutParams();
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
    }

    public final T LJJLIIIJJI(int i) {
        if (i >= 0 && i < super.getItemCount()) {
            return (T) super.LLLFZ(i);
        }
        return null;
    }

    @Override // X.C1A6D
    public final T LLLFZ(int i) {
        int itemCount = super.getItemCount();
        if (LLLILZLLLI() && i == itemCount) {
            return null;
        }
        if (LLLILZ() && i == itemCount) {
            return null;
        }
        if (this.LLJILJILJ && LLLLIIL() && i == itemCount) {
            return null;
        }
        return LJJLIIIJJI(i);
    }

    public RecyclerView.ViewHolder LLLII(ViewGroup viewGroup) {
        return new C471610IeV(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g3p, viewGroup, false));
    }

    public void LLLJ(RecyclerView.ViewHolder viewHolder) {
        LLLLII(viewHolder);
    }

    public RecyclerView.ViewHolder LLLJL(ViewGroup viewGroup) {
        return new C471610IeV(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g3o, viewGroup, false));
    }

    public final void LLLLIIIILLL(EnumC470780IdA enumC470780IdA) {
        boolean z = this.LLJIJIL;
        this.LLJ = enumC470780IdA;
        boolean zLLLILZLLLI = LLLILZLLLI();
        int itemCount = super.getItemCount();
        if (!z) {
            if (zLLLILZLLLI) {
                notifyItemInserted(itemCount);
            }
        } else if (!zLLLILZLLLI) {
            notifyItemRemoved(getItemCount());
        } else {
            notifyItemRemoved(itemCount);
            notifyItemInserted(itemCount);
        }
        this.LLJIJIL = zLLLILZLLLI;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        int itemCount = getItemCount() - 1;
        if (this.LLJILJILJ && LLLLIIL() && i == 0) {
            return -1091641683;
        }
        if (LLLILZLLLI() && i == itemCount) {
            if (this.LLJ == EnumC470780IdA.FAILED) {
                return -1091576149;
            }
            return -1091576148;
        }
        if (LLLILZ() && i == itemCount) {
            return -559038737;
        }
        if (i >= super.getItemCount()) {
            return -8888;
        }
        return LLLIL(LJJLIIIJJI(i));
    }

    @Override // X.AbstractC21673619ry
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof AbstractC468490IYt) {
            ((AbstractC468490IYt) viewHolder).onViewAttachedToWindow();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof AbstractC468490IYt) {
            ((AbstractC468490IYt) viewHolder).onViewDetachedFromWindow();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC468490IYt) {
            ((AbstractC468490IYt) viewHolder).LLILLJJLI.LJ();
        } else if (viewHolder instanceof C470960IdS) {
            viewHolder.getClass();
        } else {
            if (!(viewHolder instanceof AbstractC470810IdD)) {
                return;
            }
            ((AbstractC470810IdD) viewHolder).L5();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void registerAdapterDataObserver(AbstractC471570IeR abstractC471570IeR) {
        this.LLJJIII.registerObserver(abstractC471570IeR);
    }

    @Override // X.AbstractC21673619ry
    public final void unregisterAdapterDataObserver(AbstractC471570IeR abstractC471570IeR) {
        this.LLJJIII.unregisterObserver(abstractC471570IeR);
    }

    public RecyclerView.ViewHolder LLLIIIIL(int i, ViewGroup viewGroup) {
        if (i == -1091576148) {
            return new C470960IdS(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g3r, viewGroup, false));
        }
        if (i == -1091576149) {
            return new C470750Id7(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g3q, viewGroup, false), this.LLILLJJLI);
        }
        throw new RuntimeException("unknown footer type");
    }

    public void LLLJIL(RecyclerView.ViewHolder viewHolder, int i) {
        LLLLII(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int itemViewType = getItemViewType(i);
        if (itemViewType == -559038738) {
            LLLLII(viewHolder);
            return;
        }
        if (itemViewType == -559038737) {
            LLLJIL(viewHolder, i);
            return;
        }
        if (itemViewType != -1091576148 && itemViewType != -1091576149) {
            if (itemViewType == -1091641683) {
                LLLJ(viewHolder);
                return;
            }
            if (!(viewHolder instanceof AbstractC468490IYt)) {
                return;
            }
            T tLLLFZ = LLLFZ(i);
            if (tLLLFZ instanceof C471690Ied) {
                tLLLFZ.getClass();
                AbstractC468490IYt abstractC468490IYt = (AbstractC468490IYt) viewHolder;
                abstractC468490IYt.getClass();
                abstractC468490IYt.I5(i, null);
            } else {
                ((AbstractC468490IYt) viewHolder).I5(i, tLLLFZ);
            }
            if (!((AbstractC468490IYt) viewHolder).L5()) {
                return;
            }
            LLLLII(viewHolder);
            return;
        }
        LLLLII(viewHolder);
        if (viewHolder instanceof C470960IdS) {
            ((C470960IdS) viewHolder).I5();
            return;
        }
        if (!(viewHolder instanceof AbstractC470810IdD)) {
            return;
        }
        AbstractC470810IdD abstractC470810IdD = (AbstractC470810IdD) viewHolder;
        if (!this.LLJILJILJ && super.getItemCount() != 0) {
            z = false;
        } else {
            z = true;
        }
        abstractC470810IdD.I5(z);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLLLIIIIL;
        if (i != -559038738) {
            if (i == -559038737) {
                viewHolderLLLIIIIL = LLLII(viewGroup);
            } else if (i != -1091576148 && i != -1091576149) {
                if (i == -1091641683) {
                    viewHolderLLLIIIIL = LLLJL(viewGroup);
                } else {
                    viewHolderLLLIIIIL = LLLL(i, viewGroup);
                }
            } else {
                viewHolderLLLIIIIL = LLLIIIIL(i, viewGroup);
            }
            if (viewHolderLLLIIIIL != null) {
                try {
                    View view = viewHolderLLLIIIIL.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            viewHolderLLLIIIIL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
            try {
                if (viewHolderLLLIIIIL.itemView.getParent() != null) {
                    boolean zLIZ = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (zLIZ) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(viewHolderLLLIIIIL.getClass().getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C1AF0.LIZJ(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) viewHolderLLLIIIIL.itemView.getParent();
                        if (viewGroup2 != null) {
                            C786410Ut5.LJJJLZIJ(viewHolderLLLIIIIL.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2081408Dk.LIZ(e2);
                C2344809Gs.LIZ(e2);
            }
            C20612085q.LIZ = viewHolderLLLIIIIL.getClass().getName();
            return viewHolderLLLIIIIL;
        }
        throw new RuntimeException("create your header view holder");
    }
}
