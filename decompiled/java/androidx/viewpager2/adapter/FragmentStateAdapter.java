package androidx.viewpager2.adapter;

import X.AbstractC21673619ry;
import X.AbstractC483560Ixm;
import X.AbstractC483570Ixn;
import X.AbstractC813200VvC;
import X.C19EG;
import X.C19EH;
import X.C20066713fN;
import X.C2188811AlT;
import X.C483530Ixj;
import X.C483540Ixk;
import X.C483590Ixp;
import X.C521620Kcy;
import X.C786410Ut5;
import X.C835410Wpv;
import X.C835430Wpx;
import X.InterfaceC20633215oY;
import Y.ARunnableS107S0100000_7;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public abstract class FragmentStateAdapter extends AbstractC21673619ry<C483590Ixp> implements InterfaceC20633215oY {
    public final Lifecycle LL;
    public final FragmentManager LLILLJJLI;
    public final C20066713fN<Fragment> LLILLL;
    public final C20066713fN<Fragment.SavedState> LLILZ;
    public final C20066713fN<Integer> LLILZIL;
    public C483530Ixj LLILZLL;
    public final C483540Ixk LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

    public abstract Fragment LLLII(int i);

    @Override // X.AbstractC21673619ry
    public long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLIIIIL() {
        Fragment fragmentLJ;
        View view;
        if (!this.LLJ || this.LLILLJJLI.LJLJJI()) {
            return;
        }
        C835410Wpv c835410Wpv = new C835410Wpv();
        for (int i = 0; i < this.LLILLL.LJIIJJI(); i++) {
            long jLJIIIIZZ = this.LLILLL.LJIIIIZZ(i);
            if (!LLLI(jLJIIIIZZ)) {
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
            LLLILZ(((Long) c835430Wpx.next()).longValue());
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
            if (LLLI(jLJIIIIZZ2)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("s#");
                sbLIZ2.append(jLJIIIIZZ2);
                C786410Ut5.LJJIJL(bundle, C2188811AlT.LIZIZ(sbLIZ2), this.LLILZ.LJ(jLJIIIIZZ2));
            }
        }
        return bundle;
    }

    public FragmentStateAdapter(C19EG c19eg) {
        this(c19eg.getSupportFragmentManager(), c19eg.getLifecycle());
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
                    if (LLLI(j)) {
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
                LLLIIIIL();
                final Handler handler = new Handler(Looper.getMainLooper());
                final ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 3);
                this.LL.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            handler.removeCallbacks(aRunnableS107S0100000_7);
                            lifecycleOwner.getLifecycle().removeObserver(this);
                        }
                    }
                });
                C786410Ut5.LJLIIL(10000L, handler, aRunnableS107S0100000_7);
                return;
            }
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public boolean LLLI(long j) {
        if (j >= 0 && j < getItemCount()) {
            return true;
        }
        return false;
    }

    public final Long LLLIILIL(int i) {
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

    public final void LLLIL(final C483590Ixp c483590Ixp) {
        final Fragment fragmentLJ = this.LLILLL.LJ(c483590Ixp.getItemId());
        if (fragmentLJ != null) {
            final FrameLayout frameLayout = (FrameLayout) c483590Ixp.itemView;
            View view = fragmentLJ.getView();
            if (!fragmentLJ.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (fragmentLJ.isAdded() && view == null) {
                this.LLILLJJLI.LJZL(new AbstractC813200VvC() { // from class: X.0Ixl
                    @Override // X.AbstractC813200VvC
                    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view2, Bundle bundle) {
                        if (fragment == fragmentLJ) {
                            fragmentManager.LLIILZL(this);
                            FragmentStateAdapter fragmentStateAdapter = this.LLILLL;
                            FrameLayout frameLayout2 = frameLayout;
                            fragmentStateAdapter.getClass();
                            FragmentStateAdapter.LLLFZ(view2, frameLayout2);
                        }
                    }
                }, false);
                return;
            }
            if (fragmentLJ.isAdded() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    LLLFZ(view, frameLayout);
                    return;
                }
                return;
            }
            if (fragmentLJ.isAdded()) {
                LLLFZ(view, frameLayout);
                return;
            }
            if (!this.LLILLJJLI.LJLJJI()) {
                this.LLILLJJLI.LJZL(new AbstractC813200VvC() { // from class: X.0Ixl
                    @Override // X.AbstractC813200VvC
                    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view2, Bundle bundle) {
                        if (fragment == fragmentLJ) {
                            fragmentManager.LLIILZL(this);
                            FragmentStateAdapter fragmentStateAdapter = this.LLILLL;
                            FrameLayout frameLayout2 = frameLayout;
                            fragmentStateAdapter.getClass();
                            FragmentStateAdapter.LLLFZ(view2, frameLayout2);
                        }
                    }
                }, false);
                C483540Ixk c483540Ixk = this.LLIZ;
                c483540Ixk.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((CopyOnWriteArrayList) c483540Ixk.LIZ).iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                    arrayList.add(AbstractC483560Ixm.LIZ);
                }
                try {
                    fragmentLJ.setMenuVisibility(false);
                    C19EH c19ehLJIIJ = this.LLILLJJLI.LJIIJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("f");
                    sbLIZ.append(c483590Ixp.getItemId());
                    c19ehLJIIJ.LIZLLL(fragmentLJ, C2188811AlT.LIZIZ(sbLIZ));
                    c19ehLJIIJ.LJIL(fragmentLJ, Lifecycle.State.STARTED);
                    c19ehLJIIJ.LJIIJJI();
                    this.LLILZLL.LIZIZ(false);
                    this.LLIZ.getClass();
                    C483540Ixk.LIZIZ(arrayList);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLIZ.getClass();
                    C483540Ixk.LIZIZ(arrayList);
                    throw th;
                }
            }
            if (this.LLILLJJLI.LJL()) {
                return;
            }
            this.LL.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (FragmentStateAdapter.this.LLILLJJLI.LJLJJI()) {
                        return;
                    }
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    if (c483590Ixp.itemView.isAttachedToWindow()) {
                        FragmentStateAdapter.this.LLLIL(c483590Ixp);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void LLLILZ(long j) {
        ViewParent parent;
        Fragment fragmentLJ = this.LLILLL.LJ(j);
        if (fragmentLJ == null) {
            return;
        }
        if (fragmentLJ.getView() != null && (parent = fragmentLJ.getView().getParent()) != null) {
            C786410Ut5.LJJJJIZL((FrameLayout) parent);
        }
        if (!LLLI(j)) {
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
        if (fragmentLJ.isAdded() && LLLI(j)) {
            C483540Ixk c483540Ixk = this.LLIZ;
            c483540Ixk.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((CopyOnWriteArrayList) c483540Ixk.LIZ).iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
                arrayList.add(AbstractC483560Ixm.LIZ);
            }
            Fragment.SavedState savedStateLLIFFJFJJ = this.LLILLJJLI.LLIFFJFJJ(fragmentLJ);
            this.LLIZ.getClass();
            C483540Ixk.LIZIZ(arrayList);
            this.LLILZ.LJIIIZ(j, savedStateLLIFFJFJJ);
        }
        C483540Ixk c483540Ixk2 = this.LLIZ;
        c483540Ixk2.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = ((CopyOnWriteArrayList) c483540Ixk2.LIZ).iterator();
        while (it3.hasNext()) {
            it3.next().getClass();
            arrayList2.add(AbstractC483560Ixm.LIZ);
        }
        try {
            C19EH c19ehLJIIJ = this.LLILLJJLI.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragmentLJ);
            c19ehLJIIJ.LJIIJJI();
            this.LLILLL.LJIIJ(j);
            this.LLIZ.getClass();
            C483540Ixk.LIZIZ(arrayList2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLIZ.getClass();
            C483540Ixk.LIZIZ(arrayList2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0IeR, X.0Ixo] */
    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (this.LLILZLL == null) {
            final C483530Ixj c483530Ixj = new C483530Ixj(this);
            this.LLILZLL = c483530Ixj;
            c483530Ixj.LIZLLL = C483530Ixj.LIZ(recyclerView);
            C521620Kcy c521620Kcy = new C521620Kcy(c483530Ixj, 1);
            c483530Ixj.LIZ = c521620Kcy;
            c483530Ixj.LIZLLL.LIZIZ(c521620Kcy);
            ?? r0 = new AbstractC483570Ixn() { // from class: X.0Ixo
                @Override // X.AbstractC483570Ixn, X.AbstractC471570IeR
                public final void LIZ() {
                    c483530Ixj.LIZIZ(true);
                }

                {
                    new AbstractC471570IeR(0) { // from class: X.0Ixn
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
            c483530Ixj.LIZIZ = r0;
            registerAdapterDataObserver(r0);
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    c483530Ixj.LIZIZ(false);
                }
            };
            c483530Ixj.LIZJ = lifecycleEventObserver;
            this.LL.addObserver(lifecycleEventObserver);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C483530Ixj c483530Ixj = this.LLILZLL;
        c483530Ixj.getClass();
        C483530Ixj.LIZ(recyclerView).LJI(c483530Ixj.LIZ);
        c483530Ixj.LJFF.unregisterAdapterDataObserver(c483530Ixj.LIZIZ);
        c483530Ixj.LJFF.LL.removeObserver(c483530Ixj.LIZJ);
        c483530Ixj.LIZLLL = null;
        this.LLILZLL = null;
    }

    @Override // X.AbstractC21673619ry
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        LLLIL((C483590Ixp) viewHolder);
        LLLIIIIL();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        Long lLLLIILIL = LLLIILIL(viewHolder.itemView.getId());
        if (lLLLIILIL != null) {
            LLLILZ(lLLLIILIL.longValue());
            this.LLILZIL.LJIIJ(lLLLIILIL.longValue());
        }
    }

    @Override // X.AbstractC21673619ry
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        this.LLILLL = new C20066713fN<>();
        this.LLILZ = new C20066713fN<>();
        this.LLILZIL = new C20066713fN<>();
        this.LLIZ = new C483540Ixk();
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLILLJJLI = fragmentManager;
        this.LL = lifecycle;
        super.setHasStableIds(true);
    }

    public static void LLLFZ(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                C786410Ut5.LJJJJIZL(frameLayout);
            }
            if (view.getParent() != null) {
                C786410Ut5.LJJJLZIJ(view, (ViewGroup) view.getParent());
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C483590Ixp c483590Ixp = (C483590Ixp) viewHolder;
        long itemId = c483590Ixp.getItemId();
        int id = c483590Ixp.itemView.getId();
        Long lLLLIILIL = LLLIILIL(id);
        if (lLLLIILIL != null && lLLLIILIL.longValue() != itemId) {
            LLLILZ(lLLLIILIL.longValue());
            this.LLILZIL.LJIIJ(lLLLIILIL.longValue());
        }
        this.LLILZIL.LJIIIZ(itemId, Integer.valueOf(id));
        long itemId2 = getItemId(i);
        if (!this.LLILLL.LIZLLL(itemId2)) {
            Fragment fragmentLLLII = LLLII(i);
            fragmentLLLII.setInitialSavedState(this.LLILZ.LJ(itemId2));
            this.LLILLL.LJIIIZ(itemId2, fragmentLLLII);
        }
        if (c483590Ixp.itemView.isAttachedToWindow()) {
            LLLIL(c483590Ixp);
        }
        LLLIIIIL();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|31|3|(8:5|(1:7)|16|35|17|(3:37|19|(3:21|24|(1:26)))|29|30)(1:10)|33|11|(1:13)|16|35|17|(0)|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e6, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C2081408Dk.LIZ(r0);
        X.C2344809Gs.LIZ(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r8, int r9) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.adapter.FragmentStateAdapter.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
