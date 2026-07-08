package X;

import Y.ACListenerS140S0100000_5;
import Y.AObserverS209S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Eua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379660Eua extends AbstractC376010Eoh {
    public RecyclerView LLJJJIL;
    public TuxIconView LLJJJJ;
    public View LLJJJJJIL;
    public final C379880Euw LLJJJJLIIL;
    public final MutableLiveData<C379670Eub> LLJJL;
    public final MutableLiveData<Pair<EditorProAIGCMediaItemModel, Boolean>> LLJJLIIIJLLLLLLLZ;
    public C379870Euv LLJL;

    public C379660Eua() {
        setTheme(R.style.y0);
        this.LLJJJJLIIL = new C379880Euw();
        this.LLJJL = new MutableLiveData<>();
        this.LLJJLIIIJLLLLLLLZ = new MutableLiveData<>();
    }

    public final void LLLLLJIL() {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue = LLLLIL().LJIIIZ.invoke().intValue();
        int i = C372480Ej0.LLLLLILLIL;
        int i2 = iIntValue - C372480Ej0.LLLLLILLIL;
        if (i2 >= 0) {
            View view = this.LLJJJJJIL;
            if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                layoutParams.height = i2;
            }
            View view2 = this.LLJJJJJIL;
            if (view2 != null) {
                view2.requestLayout();
            }
        }
    }

    public final void LLLLLJLJLL(boolean z) {
        View view;
        int i;
        LLLLLJIL();
        if (z && (view = this.LLJJJJJIL) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            C786410Ut5.ed(view, i);
            view.animate().translationY(0.0f).setDuration(250L).setInterpolator(new C21388418n4()).start();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        TuxIconView tuxIconView;
        super.onViewCreated(view, bundle);
        this.LLJJJJJIL = view;
        LLLLLJIL();
        this.LLJJJJ = (TuxIconView) requireViewById(R.id.h9j);
        if (C357780E0y.LIZ() && (tuxIconView = this.LLJJJJ) != null) {
            tuxIconView.setIconRes(R.raw.icon_tick);
        }
        this.LLJJJIL = (RecyclerView) requireViewById(R.id.h9k);
        requireViewById(R.id.h9l);
        requireViewById(R.id.es8);
        RecyclerView recyclerView = this.LLJJJIL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(this.LLJJJJLIIL);
        }
        C379880Euw c379880Euw = this.LLJJJJLIIL;
        c379880Euw.LLILZIL = this.LLJJL;
        c379880Euw.LLILZLL = this.LLJJLIIIJLLLLLLLZ;
        c379880Euw.LLILZ = new C379770Eul(this);
        TuxIconView tuxIconView2 = this.LLJJJJ;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS140S0100000_5(this, 12));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Es3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C377830Erd) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 214));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Eue
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C377830Erd) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 216));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Euf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C377830Erd) obj).LJII;
            }
        }, Lifecycle.State.STARTED, AFwS231S0000000_3.get$arr$(107));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Eug
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C377830Erd) obj).LJ;
            }
        }, new C379450EuF(this));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Eud
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C377830Erd) obj).LJI;
            }
        }, new AwS584S0100000_5(this, 208));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Es4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C377830Erd) obj).LJFF;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 209));
        this.LLJJL.observe(this, new AObserverS209S0100000_5(this, 32));
        this.LLJJLIIIJLLLLLLLZ.observe(this, new AObserverS209S0100000_5(this, 33));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c4p, viewGroup, false);
        this.LLJJJJJIL = viewGroup2;
        return viewGroup2;
    }
}
