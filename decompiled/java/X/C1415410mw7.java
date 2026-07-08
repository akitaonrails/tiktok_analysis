package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0mw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415410mw7 extends C1415280mvu {
    public final VideoPublishEditModel LLLII;
    public final C2252321DDq LLLIIII;
    public final AnonymousClass0951 LLLIIIIL;
    public ComposeView LLLIIIL;
    public int LLLIIL;

    public final void LLLLLLL() {
        C2252321DDq c2252321DDq = this.LLLIIII;
        List<RecommendEffectItem> list = LLLLILI().LIZ.LIZLLL;
        int i = this.LLLIIL;
        C1412020mqe c1412020mqe = LLLLILI().LIZ;
        c2252321DDq.setValue(new C1303440k1W(list, i, LLLLILI().LIZ.LJIIL, false, 0, 48));
    }

    @Override // X.C1415280mvu
    public final void LLLLLJLJLL() {
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mqp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1412020mqe) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 488));
        LLLLILI().LIZ(new C2217381BqS() { // from class: X.0mw4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1412020mqe) obj).LIZLLL;
            }
        }).LJIIIZ(this, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 489));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0mqm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1412020mqe) obj).LJIILIIL;
            }
        }, new AwS601S0100000_22(this, 490));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mw2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1412020mqe) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 491));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mvy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1412020mqe) obj).LJI);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 483));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mw1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1412020mqe) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 484));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0muJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1412020mqe) obj).LIZJ;
            }
        }, new AwS601S0100000_22(this, 485));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mql
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C1412020mqe) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 486));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mqn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1412020mqe) obj).LJIIL);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 487));
    }

    public C1415410mw7(VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        this.LLLII = videoPublishEditModel;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1303440k1W(null, 0, false, false, 0, 63));
        this.LLLIIII = c2252321DDqLIZ;
        this.LLLIIIIL = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    @Override // X.C1415280mvu, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.tf, viewGroup, false);
        ViewTreeViewModelStoreOwner.set(viewGroup2, this);
        viewGroup2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        ViewTreeViewModelStoreOwner.set(viewGroup2, this);
        ComposeView composeView = (ComposeView) viewGroup2.findViewById(R.id.eoc);
        this.LLLIIIL = composeView;
        if (composeView != null) {
            composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
            C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(1202495855, new AwS639S0100000_25(this, 76), true));
        }
        return viewGroup2;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
