package X;

import Y.AObjectS240S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0F2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383790F2z extends AbstractC1664490tPr<C0E3X, C0F37> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 705));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 704));
    public C383760F2w LLJJJJJIL;
    public int LLJJJJLIIL;

    public final C0F30 LLLLLJIL() {
        return (C0F30) this.LLJJJIL.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        ((RecyclerView) this.LLJJJJ.getValue()).stopScroll();
        LLLLLJIL().LLIZLLLIL = false;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.LJLLLLLL(4, view);
        LLLLLJIL().setFrameCacheProvider(LLLLIL().k());
        LLLLIL().o(LLLLLJIL().getDynamicParams());
        ((RecyclerView) this.LLJJJJ.getValue()).setLayoutManager(new LinearLayoutManager(requireSceneContext(), 0, false));
        C383760F2w c383760F2w = new C383760F2w(LLLLIL().k());
        this.LLJJJJJIL = c383760F2w;
        c383760F2w.LLILZ = new C0F3C(this);
        ((RecyclerView) this.LLJJJJ.getValue()).setAdapter(this.LLJJJJJIL);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E3Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0E3X) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 599));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E3Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C0E3X) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 600));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E3a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0E3X) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 601));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E3c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0E3X) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 602));
        LLLLLJIL().getCurStartTimeEvent().LIZ(this, new AObjectS240S0100000_5(this, 101));
        LLLLLJIL().getRangeSeekEvent().LIZ(this, new AObjectS240S0100000_5(this, 102));
        LLLLLJIL().setCursorTouchListener(new C0F3D() { // from class: X.0F36
            @Override // X.C0F3D
            public final void LIZIZ() {
            }

            @Override // X.C0F3D
            public final void LIZ() {
                C0E55 player;
                C0E48 c0e48LIZ = this.LIZ.LLLLIL().LIZ();
                if (c0e48LIZ == null || (player = c0e48LIZ.getPlayer()) == null) {
                    return;
                }
                player.pause(false);
            }
        });
        LLLLLJIL().setOnScrollerChange(new AwS584S0100000_5(this, 598));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C21146717pB.LIZIZ(requireSceneContext(), R.layout.bz0, viewGroup, false);
    }
}
