package X;

import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.AfS181S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.OnFilterSelectedByClickEvent;
import com.bytedance.android.live.effect.api.OnFilterSelectedEvent;
import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.bytedance.android.livesdk.model.EnhanceChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761510Tu1 extends AbstractC761520Tu2 {
    public final DataChannel LIZLLL;
    public final ComposerFilterViewModel LJ;
    public LifecycleOwner LJFF;
    public final C761880Tuc LJI;
    public final List<LiveEffect> LJII;
    public final String LJIIIIZZ;
    public Integer LJIIIZ;
    public AnonymousClass0956 LJIIJ;
    public final View LJIIJJI;
    public final View LJIIL;

    @Override // X.AbstractC761520Tu2
    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956;
        this.LJFF = null;
        AnonymousClass0956 anonymousClass09562 = this.LJIIJ;
        if (anonymousClass09562 == null || !anonymousClass09562.isActive() || (anonymousClass0956 = this.LJIIJ) == null) {
            return;
        }
        C23118094a.LIZIZ("dialog close", null, anonymousClass0956);
    }

    @Override // X.AbstractC761520Tu2
    public final void LIZLLL() {
        this.LIZIZ.addOnScrollListener(new C772770UTb(C1EOY.LIZ.LIZIZ("panel_filter_slide"), null));
    }

    public final void LJ() {
        Integer num = this.LJIIIZ;
        C20337914i1<Integer> c20337914i1 = InterfaceC766480U4w.LIZ;
        if (Intrinsics.LJFF(num, c20337914i1.LIZIZ())) {
            return;
        }
        this.LJI.LLLJ(this.LJIIIZ.intValue());
        Integer numLIZIZ = c20337914i1.LIZIZ();
        this.LJIIIZ = numLIZIZ;
        if (numLIZIZ.intValue() < 0 || this.LJIIIZ.intValue() >= ((ArrayList) this.LJII).size()) {
            return;
        }
        C761880Tuc c761880Tuc = this.LJI;
        c761880Tuc.getClass();
        c761880Tuc.LLILZIL = c20337914i1.LIZIZ().intValue();
        this.LJI.LLLILZ(this.LJIIIZ.intValue());
        this.LIZIZ.smoothScrollToPosition(this.LJIIIZ.intValue());
    }

    @Override // X.AbstractC761520Tu2
    public final void LIZIZ() {
        C784440Upu.LIZ().LIZLLL(this.LJFF, C761650TuF.class, C0TBY.LL).LIZJ(new AfS181S0100000_12(this, 167));
        this.LJIIJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LJ), null, null, new C761430Ttt(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LJ), null, null, new C761410Ttr(this, null), 3);
        LJ();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0TuC] */
    public C761510Tu1(ViewGroup viewGroup, DataChannel dataChannel, ComposerFilterViewModel composerFilterViewModel, LifecycleOwner lifecycleOwner) {
        super(R.layout.gf3, viewGroup);
        this.LIZLLL = dataChannel;
        this.LJ = composerFilterViewModel;
        this.LJFF = lifecycleOwner;
        C761880Tuc c761880Tuc = new C761880Tuc(viewGroup.getContext(), composerFilterViewModel, new InterfaceC761900Tue() { // from class: X.0TuC
            @Override // X.InterfaceC761900Tue
            public final void LIZ(int i) {
                int i2;
                C946060aj6 c946060aj6LIZ;
                C946050aj5 c946050aj5LIZIZ;
                if (i >= 0 && i < ((ArrayList) this.LIZ.LJII).size()) {
                    C761510Tu1 c761510Tu1 = this.LIZ;
                    DataChannel dataChannel2 = c761510Tu1.LIZLLL;
                    if (dataChannel2 != null) {
                        dataChannel2.LC0(OnFilterSelectedEvent.class, ListProtector.get(c761510Tu1.LJII, i));
                    }
                    DataChannel dataChannel3 = this.LIZ.LIZLLL;
                    if (dataChannel3 != null) {
                        dataChannel3.LC0(OnFilterSelectedByClickEvent.class, Boolean.TRUE);
                    }
                    Integer num = this.LIZ.LJIIIZ;
                    if (num == null || i != num.intValue()) {
                        if (i < this.LIZ.LJIIIZ.intValue()) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        C784440Upu.LIZ().LIZIZ(new C761650TuF(i2));
                        this.LIZ.LJIIIZ = Integer.valueOf(i);
                    }
                    DataChannel dataChannel4 = this.LIZ.LIZLLL;
                    if (dataChannel4 != null && (c946060aj6LIZ = C0URX.LIZ(dataChannel4, EnhanceChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) != null) {
                        c946050aj5LIZIZ.LJ();
                    }
                }
            }
        });
        this.LJI = c761880Tuc;
        this.LJII = new ArrayList();
        String str = C0UD4.LIZ;
        this.LJIIIIZZ = "livefiltercomposerexperiment";
        this.LJIIIZ = InterfaceC766480U4w.LIZ.LIZIZ();
        this.LJIIJJI = this.LIZ.findViewById(R.id.nnp);
        View viewFindViewById = this.LIZ.findViewById(R.id.hc6);
        this.LJIIL = viewFindViewById;
        this.LIZIZ.setLayoutManager(this.LIZJ);
        this.LIZIZ.setAdapter(c761880Tuc);
        this.LJIIJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(composerFilterViewModel), null, null, new C761430Ttt(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(composerFilterViewModel), null, null, new C761400Ttq(this, null), 3);
        this.LIZIZ.addOnScrollListener(new C772770UTb(C1EOY.LIZ.LIZIZ("panel_filter_slide"), null));
        HandlerHook.viewPost(this.LIZIZ, new ARunnableS112S0100000_12(this, 297));
        C784440Upu.LIZ().LIZLLL(this.LJFF, C761650TuF.class, C0TBY.LL).LIZJ(new AfS181S0100000_12(this, 167));
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 332), viewFindViewById);
    }
}
