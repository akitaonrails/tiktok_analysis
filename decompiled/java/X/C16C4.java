package X;

import X.C1659640tI2;
import X.C16C5;
import X.C2217381BqS;
import Y.AfS165S0200000_31;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel.ChooseMediaState;
import com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.16C4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16C4 extends C16C5 {
    public C20734916Bv LLJJJIL;

    @Override // X.C16C5
    public final void LLLLIILL() {
        getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.base.selector.tryon.ChoosePhotoConfigKt$selectMediaList$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_START) {
                    onStart();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            public final void onStart() {
                this.getLifecycle().removeObserver(this);
                BaseJediViewModel baseJediViewModel = (BaseJediViewModel) C1659640tI2.LIZJ(this.mView).LIZ(ChooseMediaViewModel.class);
                C16C5 c16c5 = this;
                BaseJediViewModel.iR2(baseJediViewModel, c16c5, new C2217381BqS() { // from class: X.16C9
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((ChooseMediaState) obj).getPhotoMediaList();
                    }
                }, new AwS397S0200000_31(this, c16c5, 43));
            }
        });
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        LLLLIL(true, false);
        C20734916Bv c20734916Bv = this.LLJJJIL;
        if (c20734916Bv != null) {
            c20734916Bv.invoke();
        }
    }

    @Override // X.C16C5, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1659640tI2.LIZLLL(this).LIZ(ChooseMediaViewModel.class);
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            this.LLJJ = new C16CD(sceneContext, this.LLJILLL);
        }
        C16CD c16cd = this.LLJJ;
        if (c16cd != null) {
            c16cd.LLILZLL = this.LLJJIII;
            c16cd.LLJI = this.LLJJJ;
            c16cd.LLLII();
        }
        C16CD c16cd2 = this.LLJJ;
        if (c16cd2 != null) {
            c16cd2.LLILZIL = new C16CC(this);
        }
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(null, this.LLJILLL);
        gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.16C3
            @Override // X.AbstractC214823195h
            public final int LJFF(int i) {
                C16CD c16cd3 = this.LJ.LLJJ;
                if (c16cd3 == null || c16cd3.getItemViewType(i) != 1) {
                    return 1;
                }
                return gridLayoutManager.LLILLJJLI;
            }
        };
        gridLayoutManager.mInitialPrefetchItemCount = this.LLJILLL;
        RecyclerView recyclerView = this.LLJJI;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
        }
        RecyclerView recyclerView2 = this.LLJJI;
        if (recyclerView2 != null) {
            recyclerView2.setItemAnimator(null);
        }
        RecyclerView recyclerView3 = this.LLJJI;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView4 = this.LLJJI;
        if (recyclerView4 != null) {
            final int i = this.LLJILLL;
            C1546210qL5.LIZ.getClass();
            final int iLIZIZ = C814420VxA.LIZIZ(C1546210qL5.LIZ(2));
            recyclerView4.addItemDecoration(new C0DXR(i, iLIZIZ) { // from class: X.0DXm
                public final int LL;
                public final int LLILLJJLI;
                public final boolean LLILLL = true;

                {
                    this.LL = i;
                    this.LLILLJJLI = iLIZIZ;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView5, C21673919s1 c21673919s1) {
                    int childAdapterPosition = recyclerView5.getChildAdapterPosition(view);
                    int i2 = this.LL;
                    int i3 = childAdapterPosition % i2;
                    if (this.LLILLL) {
                        int i4 = this.LLILLJJLI;
                        rect.left = i4 - ((i3 * i4) / i2);
                        rect.right = ((i3 + 1) * i4) / i2;
                        if (childAdapterPosition < i2) {
                            rect.top = i4;
                        }
                        rect.bottom = i4;
                        return;
                    }
                    int i5 = this.LLILLJJLI;
                    rect.left = (i3 * i5) / i2;
                    rect.right = i5 - (((i3 + 1) * i5) / i2);
                    if (childAdapterPosition < i2) {
                        return;
                    }
                    rect.top = i5;
                }
            });
        }
        C16CD c16cd3 = this.LLJJ;
        if (c16cd3 != null) {
            c16cd3.LLIZLLLIL = this.LLJJI;
        }
        RecyclerView recyclerView5 = this.LLJJI;
        if (recyclerView5 != null) {
            recyclerView5.setAdapter(c16cd3);
        }
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.C16C5, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.C16C5
    public final void LLLLIIIILLL(final List<TikTokMediaModel> list, boolean z) {
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        final C16CD c16cd = this.LLJJ;
        if (c16cd != null) {
            c16cd.LLLII();
            C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.16C6
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<C21341918fZ> c09aj) {
                    C1C7U.LIZ("MvImageChooseAdapter@89e4.setPageLoadData$observable$1");
                    final List<TikTokMediaModel> list2 = c16cd.LLJ;
                    final List<TikTokMediaModel> list3 = list;
                    c09aj.onNext(C21342318fd.LIZ(new AbstractC21342018fa(list2, list3) { // from class: X.16C7
                        public final List<TikTokMediaModel> LIZ;
                        public final List<TikTokMediaModel> LIZIZ;

                        @Override // X.AbstractC21342018fa
                        public final int LIZLLL() {
                            return this.LIZIZ.size();
                        }

                        @Override // X.AbstractC21342018fa
                        public final int LJ() {
                            return this.LIZ.size();
                        }

                        {
                            this.LIZ = list2;
                            this.LIZIZ = list3;
                        }

                        @Override // X.AbstractC21342018fa
                        public final boolean LIZ(int i, int i2) {
                            if (ListProtector.get(this.LIZ, i) == ListProtector.get(this.LIZIZ, i2)) {
                                return true;
                            }
                            return false;
                        }

                        @Override // X.AbstractC21342018fa
                        public final boolean LIZIZ(int i, int i2) {
                            return Intrinsics.LJFF(((MediaModel) ListProtector.get(this.LIZ, i)).id, ((MediaModel) ListProtector.get(this.LIZIZ, i2)).id);
                        }

                        @Override // X.AbstractC21342018fa
                        public final Object LIZJ(int i, int i2) {
                            return new Object() { // from class: X.16CM
                            };
                        }
                    }, false));
                    C1C7U.LIZIZ("MvImageChooseAdapter@89e4.setPageLoadData$observable$1");
                }
            }).LJL(C11S5.LIZIZ).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS165S0200000_31(list, c16cd, 13));
        }
    }

    public final void LLLLIL(boolean z, boolean z2) {
        ViewGroup viewGroup = this.LLJJIJI;
        if (viewGroup == null) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.jgf);
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        ViewGroup viewGroup3 = this.LLJJIJI;
        if (viewGroup3 != null) {
            viewGroup3.requestLayout();
        }
    }

    @Override // X.C16C5, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        ViewGroup viewGroup2;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.an6, viewGroup, false);
        View viewFindViewById = null;
        if ((viewTd instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewTd) != null) {
            viewGroup = viewGroup2;
        }
        this.LLJJIJI = viewGroup;
        if (viewGroup != null) {
            recyclerView = (RecyclerView) viewGroup.findViewById(R.id.kck);
        } else {
            recyclerView = null;
        }
        this.LLJJI = recyclerView;
        if (recyclerView != null) {
            recyclerView.setRecycledViewPool((RecyclerView.RecycledViewPool) C194470116m.LIZ.getValue());
        }
        ViewGroup viewGroup3 = this.LLJJIJI;
        if (viewGroup3 != null) {
            viewFindViewById = viewGroup3.findViewById(R.id.kdb);
        }
        this.LLJJIJIIJIL = viewFindViewById;
        LLLLIL(true, false);
        return viewGroup;
    }
}
