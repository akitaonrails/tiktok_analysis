package X;

import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.root.tab.wrapper.TabWrapperFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0Ise, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC480380Ise extends AbstractC21673619ry<C480420Isi> implements InterfaceC20633215oY {
    public final Lifecycle LL;
    public final FragmentManager LLILLJJLI;
    public final C20066713fN<Fragment> LLILLL;
    public final C20066713fN<Fragment.SavedState> LLILZ;
    public final C20066713fN<Integer> LLILZIL;
    public C480390Isf LLILZLL;
    public final C480340Isa LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

    public abstract boolean LLLFZ(long j);

    public abstract void LLLIIIIL(C480420Isi c480420Isi);

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLI() {
        Fragment fragmentLJ;
        View view;
        if (!this.LLJ || this.LLILLJJLI.LJLJJI()) {
            return;
        }
        C835410Wpv c835410Wpv = new C835410Wpv();
        for (int i = 0; i < this.LLILLL.LJIIJJI(); i++) {
            long jLJIIIIZZ = this.LLILLL.LJIIIIZZ(i);
            if (!LLLFZ(jLJIIIIZZ)) {
                c835410Wpv.add(Long.valueOf(jLJIIIIZZ));
                this.LLILZIL.LJIIJ(jLJIIIIZZ);
            }
        }
        if (!this.LLIZLLLIL) {
            this.LLJ = false;
            for (int i2 = 0; i2 < this.LLILLL.LJIIJJI(); i2++) {
                long jLJIIIIZZ2 = this.LLILLL.LJIIIIZZ(i2);
                if (!this.LLILZIL.LIZLLL(jLJIIIIZZ2) && ((fragmentLJ = this.LLILLL.LJ(jLJIIIIZZ2)) == null || (view = fragmentLJ.getView()) == null || view.getParent() == null)) {
                    c835410Wpv.add(Long.valueOf(jLJIIIIZZ2));
                }
            }
        }
        C835430Wpx c835430Wpx = new C835430Wpx(c835410Wpv);
        while (c835430Wpx.hasNext()) {
            LLLIILIL(((Long) c835430Wpx.next()).longValue());
        }
    }

    @Override // X.InterfaceC20633215oY
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.LLILLL.LJIIJJI() + this.LLILZ.LJIIJJI());
        for (int i = 0; i < this.LLILLL.LJIIJJI(); i++) {
            long jLJIIIIZZ = this.LLILLL.LJIIIIZZ(i);
            Fragment fragmentLJ = this.LLILLL.LJ(jLJIIIIZZ);
            if (fragmentLJ != null && fragmentLJ.isAdded()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("f#");
                sbLIZ.append(jLJIIIIZZ);
                this.LLILLJJLI.LJZI(bundle, fragmentLJ, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        for (int i2 = 0; i2 < this.LLILZ.LJIIJJI(); i2++) {
            long jLJIIIIZZ2 = this.LLILZ.LJIIIIZZ(i2);
            if (LLLFZ(jLJIIIIZZ2)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("s#");
                sbLIZ2.append(jLJIIIIZZ2);
                C786410Ut5.LJJIJL(bundle, C2188811AlT.LIZIZ(sbLIZ2), this.LLILZ.LJ(jLJIIIIZZ2));
            }
        }
        return bundle;
    }

    public AbstractC480380Ise(C19GS c19gs) {
        FragmentManager supportFragmentManager = c19gs.getSupportFragmentManager();
        Lifecycle lifecycle = c19gs.getLifecycle();
        this.LLILLL = new C20066713fN<>();
        this.LLILZ = new C20066713fN<>();
        this.LLILZIL = new C20066713fN<>();
        this.LLIZ = new C480340Isa();
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLILLJJLI = supportFragmentManager;
        this.LL = lifecycle;
        super.setHasStableIds(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC20633215oY
    public final void LJJZ(Parcelable parcelable) {
        if (this.LLILZ.LJII() && this.LLILLL.LJII()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f#") && str.length() > 2) {
                    this.LLILLL.LJIIIZ(CastLongProtector.parseLong(str.substring(2)), this.LLILLJJLI.LJJLIIIJILLIZJL(bundle, str));
                } else if (str.startsWith("s#") && str.length() > 2) {
                    long j = CastLongProtector.parseLong(str.substring(2));
                    Parcelable parcelable2 = bundle.getParcelable(str);
                    if (LLLFZ(j)) {
                        this.LLILZ.LJIIIZ(j, parcelable2);
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected key in savedState: ");
                    sbLIZ.append(str);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (!this.LLILLL.LJII()) {
                this.LLJ = true;
                this.LLIZLLLIL = true;
                LLLI();
                final BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                final ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 140);
                this.LL.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.live.root.tab.tabpage.FragmentStateAdapter$4
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            bPEAHandler.removeCallbacks(aRunnableS107S0100000_7);
                            lifecycleOwner.getLifecycle().removeObserver(this);
                        }
                    }
                });
                C786410Ut5.LJLIIL(10000L, bPEAHandler, aRunnableS107S0100000_7);
                return;
            }
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public final Long LLLII(int i) {
        Long lValueOf = null;
        for (int i2 = 0; i2 < this.LLILZIL.LJIIJJI(); i2++) {
            if (this.LLILZIL.LJIIL(i2).intValue() == i) {
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(this.LLILZIL.LJIIIIZZ(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return lValueOf;
    }

    public final void LLLIILIL(long j) {
        Fragment fragmentLJ = this.LLILLL.LJ(j);
        if (fragmentLJ == null) {
            return;
        }
        if (fragmentLJ.getView() != null && (fragmentLJ.getView() instanceof ViewGroup)) {
            C786410Ut5.LJJJJI((ViewGroup) fragmentLJ.getView());
        }
        if (!LLLFZ(j)) {
            this.LLILZ.LJIIJ(j);
        }
        if (!fragmentLJ.isAdded()) {
            this.LLILLL.LJIIJ(j);
            return;
        }
        if (this.LLILLJJLI.LJLJJI()) {
            this.LLJ = true;
            return;
        }
        if (fragmentLJ.isAdded() && LLLFZ(j)) {
            C480340Isa c480340Isa = this.LLIZ;
            c480340Isa.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((CopyOnWriteArrayList) c480340Isa.LIZ).iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
                arrayList.add(AbstractC480350Isb.LIZ);
            }
            Fragment.SavedState savedStateLLIFFJFJJ = this.LLILLJJLI.LLIFFJFJJ(fragmentLJ);
            this.LLIZ.getClass();
            C480340Isa.LIZIZ(arrayList);
            this.LLILZ.LJIIIZ(j, savedStateLLIFFJFJJ);
        }
        C480340Isa c480340Isa2 = this.LLIZ;
        c480340Isa2.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = ((CopyOnWriteArrayList) c480340Isa2.LIZ).iterator();
        while (it3.hasNext()) {
            it3.next().getClass();
            arrayList2.add(AbstractC480350Isb.LIZ);
        }
        try {
            C19EH c19ehLJIIJ = this.LLILLJJLI.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragmentLJ);
            c19ehLJIIJ.LJIIJJI();
            this.LLILLL.LJIIJ(j);
            this.LLIZ.getClass();
            C480340Isa.LIZIZ(arrayList2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLIZ.getClass();
            C480340Isa.LIZIZ(arrayList2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0IeR, X.0Ish] */
    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (this.LLILZLL == null) {
            final C480390Isf c480390Isf = new C480390Isf(this);
            this.LLILZLL = c480390Isf;
            c480390Isf.LIZLLL = C480390Isf.LIZ(recyclerView);
            C521620Kcy c521620Kcy = new C521620Kcy(c480390Isf, 2);
            c480390Isf.LIZ = c521620Kcy;
            c480390Isf.LIZLLL.LIZIZ(c521620Kcy);
            ?? r0 = new AbstractC480400Isg() { // from class: X.0Ish
                @Override // X.AbstractC480400Isg, X.AbstractC471570IeR
                public final void LIZ() {
                    c480390Isf.LIZIZ(true);
                }

                {
                    new AbstractC471570IeR(0) { // from class: X.0Isg
                        @Override // X.AbstractC471570IeR
                        public abstract void LIZ();

                        @Override // X.AbstractC471570IeR
                        public final void LIZIZ(int i, int i2) {
                            LIZ();
                        }

                        @Override // X.AbstractC471570IeR
                        public final void LIZLLL(int i, int i2) {
                            LIZ();
                        }

                        @Override // X.AbstractC471570IeR
                        public final void LJ(int i, int i2) {
                            LIZ();
                        }

                        @Override // X.AbstractC471570IeR
                        public final void LJFF(int i, int i2) {
                            LIZ();
                        }

                        @Override // X.AbstractC471570IeR
                        public final void LIZJ(int i, int i2, Object obj) {
                            LIZ();
                        }
                    };
                }
            };
            c480390Isf.LIZIZ = r0;
            registerAdapterDataObserver(r0);
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.live.root.tab.tabpage.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    c480390Isf.LIZIZ(false);
                }
            };
            c480390Isf.LIZJ = lifecycleEventObserver;
            this.LL.addObserver(lifecycleEventObserver);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C480390Isf c480390Isf = this.LLILZLL;
        c480390Isf.getClass();
        C480390Isf.LIZ(recyclerView).LJI(c480390Isf.LIZ);
        c480390Isf.LJFF.unregisterAdapterDataObserver(c480390Isf.LIZIZ);
        c480390Isf.LJFF.LL.removeObserver(c480390Isf.LIZJ);
        c480390Isf.LIZLLL = null;
        this.LLILZLL = null;
    }

    @Override // X.AbstractC21673619ry
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        LLLIIIIL((C480420Isi) viewHolder);
        LLLI();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        Long lLLLII = LLLII(viewHolder.itemView.getId());
        if (lLLLII != null) {
            LLLIILIL(lLLLII.longValue());
            this.LLILZIL.LJIIJ(lLLLII.longValue());
        }
    }

    @Override // X.AbstractC21673619ry
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C480420Isi c480420Isi = (C480420Isi) viewHolder;
        long itemId = c480420Isi.getItemId();
        int id = c480420Isi.itemView.getId();
        Long lLLLII = LLLII(id);
        if (lLLLII != null && lLLLII.longValue() != itemId) {
            LLLIILIL(lLLLII.longValue());
            this.LLILZIL.LJIIJ(lLLLII.longValue());
        }
        this.LLILZIL.LJIIIZ(itemId, Integer.valueOf(id));
        long j = i;
        if (!this.LLILLL.LIZLLL(j)) {
            C480320IsY c480320IsY = (C480320IsY) this;
            InterfaceC475320IkU interfaceC475320IkU = (InterfaceC475320IkU) ListProtector.get(c480320IsY.LLJI, i);
            InterfaceC479780Irg<?> interfaceC479780Irg = c480320IsY.LLJIJIL;
            InterfaceC475300IkS interfaceC475300IkS = c480320IsY.LLJILJIL;
            TabWrapperFragment tabWrapperFragment = new TabWrapperFragment();
            tabWrapperFragment.LL = interfaceC475320IkU;
            tabWrapperFragment.LLILLJJLI = interfaceC479780Irg;
            tabWrapperFragment.LLILLL = c480320IsY;
            tabWrapperFragment.LLILZ = interfaceC475300IkS;
            Iterator it2 = ((LinkedHashMap) c480320IsY.LLJJIII).entrySet().iterator();
            while (it2.hasNext()) {
                for (C475260IkO c475260IkO : (Iterable) ((Map.Entry) it2.next()).getValue()) {
                    InterfaceC479810Irj interfaceC479810Irj = tabWrapperFragment.LLILZIL;
                    if (interfaceC479810Irj != null) {
                        interfaceC479810Irj.eP(c475260IkO);
                    } else {
                        ((ArrayList) tabWrapperFragment.LLJ).add(c475260IkO);
                    }
                }
            }
            c480320IsY.LLJILJILJ.put(Integer.valueOf(i), new WeakReference<>(tabWrapperFragment));
            tabWrapperFragment.setInitialSavedState(this.LLILZ.LJ(j));
            this.LLILLL.LJIIIZ(j, tabWrapperFragment);
        }
        if (c480420Isi.itemView.isAttachedToWindow()) {
            LLLIIIIL(c480420Isi);
        }
        LLLI();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup c472280Ifa;
        int i2 = C480420Isi.LL;
        if (i == 1) {
            c472280Ifa = new C472280Ifa(viewGroup.getContext(), null);
            c472280Ifa.setId(View.generateViewId());
        } else {
            final Context context = viewGroup.getContext();
            c472280Ifa = new ConstraintLayout(context) { // from class: X.0HU2
                @Override // android.view.ViewGroup
                public final void addView(View view, int i3) {
                    C19ME c19me = new C19ME(-1, 0);
                    c19me.topToTop = 0;
                    c19me.bottomToBottom = 0;
                    c19me.startToStart = 0;
                    c19me.endToEnd = 0;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                    super.addView(view, i3, c19me);
                }
            };
            c472280Ifa.setId(View.generateViewId());
        }
        C786410Ut5.X5(new ViewGroup.LayoutParams(-1, -1), c472280Ifa);
        c472280Ifa.setSaveEnabled(false);
        C480420Isi c480420Isi = new C480420Isi(c472280Ifa);
        try {
            View view = c480420Isi.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c480420Isi.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c480420Isi.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C480420Isi.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c480420Isi.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c480420Isi.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C480420Isi.class.getName();
        return c480420Isi;
    }
}
