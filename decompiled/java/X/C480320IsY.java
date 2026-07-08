package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.feed.LiveNearbyTabSetting;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.root.tab.wrapper.TabWrapperFragment;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480320IsY extends AbstractC480380Ise {
    public final List<InterfaceC475320IkU> LLJI;
    public final InterfaceC479780Irg<?> LLJIJIL;
    public final InterfaceC475300IkS LLJILJIL;
    public final Map<Integer, WeakReference<TabWrapperFragment>> LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public final Map<LifecycleOwner, List<C475260IkO>> LLJJIII;
    public final Map<LifecycleOwner, DefaultLifecycleObserver> LLJJIJI;
    public final C479800Iri LLJJIJIIJIL;

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJI.size();
    }

    @Override // X.AbstractC480380Ise
    public final boolean LLLFZ(long j) {
        if (j >= 0 && j < getItemCount()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC480380Ise
    public final void LLLIIIIL(final C480420Isi c480420Isi) {
        TabWrapperFragment tabWrapperFragment;
        Fragment fragmentLJ = this.LLILLL.LJ(c480420Isi.getItemId());
        ViewGroup viewGroup = null;
        if ((fragmentLJ instanceof TabWrapperFragment) && (tabWrapperFragment = (TabWrapperFragment) fragmentLJ) != null) {
            View view = c480420Isi.itemView;
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            }
            tabWrapperFragment.LLILZLL = viewGroup;
        }
        final Fragment fragmentLJ2 = this.LLILLL.LJ(c480420Isi.getItemId());
        if (fragmentLJ2 != null) {
            final ViewGroup viewGroup2 = (ViewGroup) c480420Isi.itemView;
            View view2 = fragmentLJ2.getView();
            if (!fragmentLJ2.isAdded() && view2 != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (fragmentLJ2.isAdded() && view2 == null) {
                this.LLILLJJLI.LJZL(new AbstractC813200VvC() { // from class: X.0IsZ
                    @Override // X.AbstractC813200VvC
                    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view3, Bundle bundle) {
                        if (fragment == fragmentLJ2) {
                            fragmentManager.LLIILZL(this);
                            this.getClass();
                        }
                    }
                }, false);
                return;
            }
            if (fragmentLJ2.isAdded() && view2.getParent() != null) {
                view2.getParent();
                return;
            }
            if (fragmentLJ2.isAdded()) {
                return;
            }
            if (!this.LLILLJJLI.LJLJJI()) {
                this.LLILLJJLI.LJZL(new AbstractC813200VvC() { // from class: X.0IsZ
                    @Override // X.AbstractC813200VvC
                    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view3, Bundle bundle) {
                        if (fragment == fragmentLJ2) {
                            fragmentManager.LLIILZL(this);
                            this.getClass();
                        }
                    }
                }, false);
                C480340Isa c480340Isa = this.LLIZ;
                c480340Isa.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((CopyOnWriteArrayList) c480340Isa.LIZ).iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                    arrayList.add(AbstractC480350Isb.LIZ);
                }
                try {
                    fragmentLJ2.setMenuVisibility(false);
                    C19EH c19ehLJIIJ = this.LLILLJJLI.LJIIJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("f");
                    sbLIZ.append(c480420Isi.getItemId());
                    c19ehLJIIJ.LIZLLL(fragmentLJ2, C2188811AlT.LIZIZ(sbLIZ));
                    c19ehLJIIJ.LJIL(fragmentLJ2, Lifecycle.State.STARTED);
                    c19ehLJIIJ.LJIIJJI();
                    this.LLILZLL.LIZIZ(false);
                    this.LLIZ.getClass();
                    C480340Isa.LIZIZ(arrayList);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLIZ.getClass();
                    C480340Isa.LIZIZ(arrayList);
                    throw th;
                }
            }
            if (this.LLILLJJLI.LJL()) {
                return;
            }
            this.LL.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.live.root.tab.tabpage.FragmentStateAdapter$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (this.LLILLJJLI.LJLJJI()) {
                        return;
                    }
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    if (c480420Isi.itemView.isAttachedToWindow()) {
                        this.LLLIIIIL(c480420Isi);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final TabWrapperFragment LLLIL(Integer num) {
        if (num == null) {
            return null;
        }
        num.intValue();
        Reference reference = (Reference) ((LinkedHashMap) this.LLJILJILJ).get(num);
        if (reference == null) {
            return null;
        }
        return (TabWrapperFragment) reference.get();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i >= this.LLJI.size() || i < 0) {
            return 0;
        }
        if (!Intrinsics.LJFF("discover", ((InterfaceC475320IkU) ListProtector.get(this.LLJI, i)).name()) && !Intrinsics.LJFF("nearby", ((InterfaceC475320IkU) ListProtector.get(this.LLJI, i)).name())) {
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Iri] */
    public C480320IsY(List list, C19GS c19gs, InterfaceC479780Irg interfaceC479780Irg, InterfaceC475300IkS interfaceC475300IkS) {
        super(c19gs);
        this.LLJI = list;
        this.LLJIJIL = interfaceC479780Irg;
        this.LLJILJIL = interfaceC475300IkS;
        this.LLJILJILJ = new LinkedHashMap();
        this.LLJILLL = -1;
        this.LLJJ = -1;
        this.LLJJI = -1;
        this.LLJJIII = new LinkedHashMap();
        this.LLJJIJI = new LinkedHashMap();
        this.LLJJIJIIJIL = new AbstractC712240Rwk() { // from class: X.0Iri
            @Override // X.AbstractC712240Rwk
            public final void onPageScrollStateChanged(int i) {
                InterfaceC479810Irj interfaceC479810Irj;
                Iterator it2 = ((LinkedHashMap) this.LL.LLJILJILJ).entrySet().iterator();
                while (it2.hasNext()) {
                    TabWrapperFragment tabWrapperFragment = (TabWrapperFragment) ((Reference) ((Map.Entry) it2.next()).getValue()).get();
                    if (tabWrapperFragment != null && tabWrapperFragment.LLIZ && (interfaceC479810Irj = tabWrapperFragment.LLILZIL) != null) {
                        interfaceC479810Irj.onPageScrollStateChanged(i);
                    }
                }
                LiveNearbyTabSetting liveNearbyTabSetting = LiveNearbyTabSetting.INSTANCE;
                if (liveNearbyTabSetting.enable() && liveNearbyTabSetting.getValue().enableDraggingOpt && i == 1) {
                    IHostPerformanceOpt iHostPerformanceOpt = (IHostPerformanceOpt) C1161920gLG.LIZJ(IHostPerformanceOpt.class);
                    if (iHostPerformanceOpt != null) {
                        iHostPerformanceOpt.MS1(3000L);
                    }
                    C08MD c08md = C08MD.LIZ;
                    ((IHostPerformanceOpt) C1161920gLG.LIZJ(IHostPerformanceOpt.class)).OC2();
                    JatoXL.requestBlockGc(1000L);
                }
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                TabWrapperFragment tabWrapperFragment;
                InterfaceC479810Irj interfaceC479810Irj;
                TabWrapperFragment tabWrapperFragment2;
                InterfaceC479810Irj interfaceC479810Irj2;
                C480320IsY c480320IsY = this.LL;
                int i2 = c480320IsY.LLJJI;
                if (i2 == i) {
                    return;
                }
                if (i2 != -1) {
                    Reference reference = (Reference) ((LinkedHashMap) c480320IsY.LLJILJILJ).get(Integer.valueOf(i2));
                    if (reference != null && (tabWrapperFragment2 = (TabWrapperFragment) reference.get()) != null) {
                        tabWrapperFragment2.LLJI = Boolean.FALSE;
                        if (tabWrapperFragment2.LLIZ && (interfaceC479810Irj2 = tabWrapperFragment2.LLILZIL) != null) {
                            interfaceC479810Irj2.LLLILZLLLI();
                        }
                    }
                }
                Reference reference2 = (Reference) ((LinkedHashMap) this.LL.LLJILJILJ).get(Integer.valueOf(i));
                if (reference2 != null && (tabWrapperFragment = (TabWrapperFragment) reference2.get()) != null) {
                    tabWrapperFragment.LLJI = Boolean.TRUE;
                    if (tabWrapperFragment.LLIZ && (interfaceC479810Irj = tabWrapperFragment.LLILZIL) != null) {
                        interfaceC479810Irj.onPageSelected();
                    }
                }
                this.LL.LLJJI = i;
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageScrolled(int i, float f, int i2) {
                TabWrapperFragment tabWrapperFragment;
                TabWrapperFragment tabWrapperFragment2;
                if (f > 0.0f) {
                    int i3 = i + 1;
                    Reference reference = (Reference) ((LinkedHashMap) this.LL.LLJILJILJ).get(Integer.valueOf(i));
                    if (reference != null && (tabWrapperFragment2 = (TabWrapperFragment) reference.get()) != null) {
                        tabWrapperFragment2.al();
                    }
                    if (i3 < this.LL.LLJI.size()) {
                        Reference reference2 = (Reference) ((LinkedHashMap) this.LL.LLJILJILJ).get(Integer.valueOf(i3));
                        if (reference2 != null && (tabWrapperFragment = (TabWrapperFragment) reference2.get()) != null) {
                            tabWrapperFragment.al();
                        }
                    }
                }
            }
        };
    }
}
