package X;

import Y.AObserverS186S0200000_25;
import Y.AObserverS227S0100000_25;
import Y.AsS51S0100000_25;
import android.view.View;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0sWC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629980sWC implements InterfaceC1641700sp6 {
    public final RecyclerView LIZ;
    public final C1630540sX6 LIZIZ;
    public final C19EG LIZJ;
    public final LifecycleOwner LIZLLL;
    public final InterfaceC1629970sWB LJ;
    public final LinearLayoutManager LJFF;
    public List<Effect> LJI;
    public final C1641120soA LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    @Override // X.InterfaceC1641700sp6
    public final void LIZ() {
        throw null;
    }

    @Override // X.InterfaceC1641700sp6
    public final void LIZIZ() {
        LJ(true);
        this.LJII.LJJIIZ.invoke().booleanValue();
    }

    @Override // X.InterfaceC1641700sp6
    public final void hideStickerView() {
        throw null;
    }

    public final void LJ(boolean z) {
        if (z) {
            C786410Ut5.LLIZLLLIL(this.LIZ, 0);
        } else {
            C786410Ut5.LLIZLLLIL(this.LIZ, 8);
        }
    }

    public C1629980sWC(C19EG c19eg, View view, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1629870sW1 interfaceC1629870sW1, C1641120soA c1641120soA, LifecycleOwner lifecycleOwner, CreativeModel creativeModel) {
        C1629990sWD c1629990sWD = new InterfaceC1629970sWB() { // from class: X.0sWD
            @Override // X.InterfaceC1629970sWB
            public final void LIZ() {
            }
        };
        this.LJIIIZ = true;
        this.LIZJ = c19eg;
        this.LIZLLL = lifecycleOwner;
        RecyclerView recyclerView = (RecyclerView) ((ViewStubCompat) view.findViewById(R.id.wc3)).LIZ();
        this.LIZ = recyclerView;
        this.LJ = c1629990sWD;
        C1630540sX6 c1630540sX6 = new C1630540sX6(interfaceC1624480sNK, interfaceC1635560sfC, interfaceC1629870sW1, c1641120soA, creativeModel);
        this.LIZIZ = c1630540sX6;
        this.LJII = c1641120soA;
        recyclerView.addOnScrollListener(new AsS51S0100000_25(this, 0));
        interfaceC1624480sNK.LJII().LIZLLL().observe(lifecycleOwner, new AObserverS227S0100000_25(this, 1));
        interfaceC1629870sW1.kS0().observe(lifecycleOwner, new AObserverS186S0200000_25((Object) this, (LiveData<C1641640sp0<HorizontalEffectsModel>>) interfaceC1629870sW1, (l0) 0));
        interfaceC1629870sW1.Ke0().observe(lifecycleOwner, new AObserverS227S0100000_25(this, 2));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 0, false);
        this.LJFF = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(c1630540sX6);
    }
}
