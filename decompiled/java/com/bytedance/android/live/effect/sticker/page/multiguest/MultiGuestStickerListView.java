package com.bytedance.android.live.effect.sticker.page.multiguest;

import X.C0DXQ;
import X.C0PEM;
import X.C0U60;
import X.C0U96;
import X.C0U9F;
import X.C0UC5;
import X.C0UCY;
import X.C0UD4;
import X.C23250099c;
import X.C500260Jjc;
import X.C767520U8w;
import X.C781710UlV;
import X.C786410Ut5;
import X.InterfaceC1268640j7O;
import X.InterfaceC769000UEo;
import Y.AObserverS177S0200000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.MultiGuestStickerSelectedEvent;
import com.bytedance.android.live.effect.api.MultiGuestShrinkStickerEvent;
import com.bytedance.android.live.effect.api.MultiGuestStickerFullPanelHiddenStateChangedEvent;
import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;
import com.bytedance.android.live.liveinteract.api.GuestManagePanelStickerChangeEvent;
import com.bytedance.android.live.liveinteract.api.GuestManagePanelStickerRemoveEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS448S0200000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class MultiGuestStickerListView extends BaseMultiGuestStickerView {
    public static final /* synthetic */ int LLJJIII = 0;
    public final RecyclerView LLJILJIL;
    public final View LLJILJILJ;
    public final View LLJILLL;
    public final C0U9F LLJJ;
    public final C781710UlV LLJJI;

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final String LJI() {
        return "shortcut";
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        }
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final View LJFF() {
        return C786410Ut5.Sd(R.layout.gff, C786410Ut5.ne(this.LL.getContext()), null);
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final void LJIIJ() {
        C781710UlV c781710UlV = this.LLJJI;
        if (c781710UlV != null) {
            c781710UlV.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final void LJIIJJI() {
        C781710UlV c781710UlV;
        if (BaseMultiGuestStickerView.LLJIJIL || (c781710UlV = this.LLJJI) == null) {
            return;
        }
        c781710UlV.LIZJ(true);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.LLJJ.LLLZ();
        C781710UlV c781710UlV = this.LLJJI;
        if (c781710UlV != null) {
            c781710UlV.LIZJ(true);
        }
        LJIIIIZZ();
        this.LLJ.LJIIJJI(C0UD4.LJ);
        this.LLJ.LJIILL(this.LLILZ);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.LLJJ.LLLLZLLLI();
        C781710UlV c781710UlV = this.LLJJI;
        if (c781710UlV != null) {
            c781710UlV.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final void onDestroy() {
        super.onDestroy();
        C0UC5 c0uc5 = C0UC5.LIZ;
        C0UC5.LIZJ = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiGuestStickerListView(Fragment fragment, ViewGroup viewGroup, int i, InterfaceC1268640j7O interfaceC1268640j7O, InterfaceC769000UEo interfaceC769000UEo, C0U96 c0u96) {
        C0UCY c0ucy;
        boolean z;
        if (c0u96 != null) {
            c0ucy = c0u96.LIZIZ;
        } else {
            c0ucy = null;
        }
        if (c0u96 != null && c0u96.LIZ) {
            z = true;
        } else {
            z = false;
        }
        super(fragment, interfaceC1268640j7O, interfaceC769000UEo, viewGroup, c0ucy, z);
        RecyclerView recyclerView = (RecyclerView) LJII().findViewById(R.id.eux);
        this.LLJILJIL = recyclerView;
        LJII().findViewById(R.id.xmb);
        View viewFindViewById = LJII().findViewById(R.id.nnp);
        this.LLJILJILJ = viewFindViewById;
        this.LLJILLL = LJII().findViewById(R.id.hc6);
        C0U9F c0u9f = new C0U9F(this.LLILZLL, C0U60.LIZ());
        this.LLJJ = c0u9f;
        LJIIIZ();
        MultiGuestStickerViewModel multiGuestStickerViewModel = (MultiGuestStickerViewModel) this.LLIZ.getValue();
        DataChannel dataChannel = this.LLILZLL;
        multiGuestStickerViewModel.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(multiGuestStickerViewModel), C0PEM.LIZJ, null, new C767520U8w(multiGuestStickerViewModel, dataChannel, i, null), 2);
        ((MultiGuestStickerViewModel) this.LLIZ.getValue()).LLILLL.observe(fragment, new AObserverS177S0200000_12(this, fragment, 0));
        DataChannel dataChannel2 = this.LLILZLL;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(fragment, MultiGuestStickerSelectedEvent.class, new AwS591S0100000_12(this, 108));
        }
        DataChannel dataChannel3 = this.LLILZLL;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(fragment, MultiGuestShrinkStickerEvent.class, new AwS591S0100000_12(this, 109));
        }
        DataChannel dataChannel4 = this.LLILZLL;
        if (dataChannel4 != null) {
            dataChannel4.BQ2(fragment, MultiGuestStickerFullPanelHiddenStateChangedEvent.class, new AwS591S0100000_12(this, 110));
            dataChannel4.BQ2(fragment, GuestManagePanelStickerChangeEvent.class, new AwS591S0100000_12(this, 111));
            dataChannel4.BQ2(fragment, GuestManagePanelStickerRemoveEvent.class, new AwS591S0100000_12(this, 112));
        }
        C500260Jjc.LLFFF(viewFindViewById);
        recyclerView.setAdapter(c0u9f);
        recyclerView.setLayoutManager(new LinearLayoutManager(LJII().getContext(), 0, false));
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new C0DXQ(10.0f, 10.0f, 0.0f));
        c0u9f.LLIZ = new AwS448S0200000_12(this, interfaceC769000UEo, 1);
        this.LLJJI = new C781710UlV(0, 0.0d, recyclerView, new AwS626S0100000_12(this, 8));
    }
}
