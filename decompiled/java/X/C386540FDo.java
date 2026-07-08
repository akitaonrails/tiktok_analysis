package X;

import Y.ACListenerS140S0100000_5;
import Y.AObjectS240S0100000_5;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FDo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386540FDo extends AbstractC1664490tPr<C386420FDc, C386520FDm> {
    public C386640FDy LLJJJIL;
    public C0DXP LLJJJJ;
    public C386550FDp LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public RecyclerView LLJJLIIIJLLLLLLLZ;
    public C0EOZ LLJL;
    public GridLayoutManager LLJLIL;

    public final void LLLLLJIL() {
        GridLayoutManager gridLayoutManager = this.LLJLIL;
        if (gridLayoutManager == null) {
            return;
        }
        Iterator<C0FDZ> it2 = LLLLILI().LIZ.LIZIZ.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!it2.next().LIZIZ) {
                i++;
            } else if (i <= 0) {
                break;
            }
        }
        i = 0;
        int i2 = i + (-gridLayoutManager.LLILLJJLI);
        int itemCount = gridLayoutManager.getItemCount();
        if (i2 < 0) {
            gridLayoutManager.scrollToPositionWithOffset(0, 1);
        } else if (i2 >= itemCount) {
            gridLayoutManager.scrollToPositionWithOffset(itemCount - 1, 1);
        } else {
            gridLayoutManager.scrollToPositionWithOffset(i2, 1);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C385670FAf<Boolean> c385670FAfDU0;
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(287));
        C1664590tQ1.LIZLLL(this, "CaptionTemplateListScene", false, AFwS234S0000000_5.get$arr$(288), 2);
        C1664600tQ2.LIZ(this, "CaptionTemplateListScene", new AwS584S0100000_5(this, 555));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            C0EOZ c0eoz = (C0EOZ) c1drg.LJIIL(null, C0EOZ.class);
            this.LLJL = c0eoz;
            if (c0eoz != null) {
                c0eoz.Ui0(true);
            }
            C0EOZ c0eoz2 = this.LLJL;
            if (c0eoz2 != null && (c385670FAfDU0 = c0eoz2.dU0()) != null) {
                c385670FAfDU0.LIZ(this, new AObjectS240S0100000_5(this, 85));
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FDh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C386420FDc) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 565));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FDi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C386420FDc) obj).LJI;
            }
        }, new AwS584S0100000_5(this, 566));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FDv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C386420FDc) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 567));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FDu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C386420FDc) obj).LJFF;
            }
        }, new AwS584S0100000_5(this, 568));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FDg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C386420FDc) obj).LIZLLL;
            }
        }, new AwS584S0100000_5(this, 564));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C197039127h c197039127h;
        setTheme(R.style.y0);
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c04, viewGroup, false);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.gtk);
        if (imageView != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nl;
            imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
        }
        this.LLJJLIIIJLLLLLLLZ = (RecyclerView) viewGroup2.findViewById(R.id.t0q);
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.nna);
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new C0DXR() { // from class: X.0FDr
                public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                    rect.bottom = this.LLILLJJLI;
                    int childLayoutPosition = recyclerView2.getChildLayoutPosition(view);
                    if (childLayoutPosition != 0 && childLayoutPosition != 1) {
                        rect.top = 0;
                    } else {
                        rect.top = this.LL;
                    }
                }
            });
        }
        this.LLJJJIL = new C386640FDy(requireSceneContext(), LLLLILI().LIZ.LIZ, LLLLIL().LIZ, LLLLIL().LIZIZ);
        View viewFindViewById = viewGroup2.findViewById(R.id.p4w);
        this.LLJJL = viewFindViewById;
        if (viewFindViewById != null && (c197039127h = (C197039127h) viewFindViewById.findViewById(R.id.tec)) != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS140S0100000_5(this, 76));
        }
        this.LLJJJJLIIL = viewGroup2.findViewById(R.id.y0b);
        RecyclerView recyclerView2 = this.LLJJLIIIJLLLLLLLZ;
        if (recyclerView2 != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(viewGroup.getContext(), 2);
            this.LLJLIL = gridLayoutManager;
            recyclerView2.setLayoutManager(gridLayoutManager);
            recyclerView2.setAdapter(this.LLJJJIL);
            recyclerView2.setHasFixedSize(true);
            recyclerView2.setItemAnimator(null);
            recyclerView2.addItemDecoration(new C0DXR() { // from class: X.0FDr
                public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                public final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView22, C21673919s1 c21673919s1) {
                    rect.bottom = this.LLILLJJLI;
                    int childLayoutPosition = recyclerView22.getChildLayoutPosition(view);
                    if (childLayoutPosition != 0 && childLayoutPosition != 1) {
                        rect.top = 0;
                    } else {
                        rect.top = this.LL;
                    }
                }
            });
        }
        return viewGroup2;
    }
}
