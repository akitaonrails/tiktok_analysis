package X;

import Y.AObserverS212S0100000_8;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;
import irm.AkS53S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0M2O, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M2O implements C0M1L {
    public DraftBoxPageViewModel LIZ;
    public View LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1138));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1139));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1137));
    public InterfaceC561590M0v LJFF;
    public C0M1U LJI;
    public boolean LJII;

    @Override // X.C0M1L
    public final void onDestroy() {
    }

    public final C197039127h LIZIZ() {
        return (C197039127h) this.LIZJ.getValue();
    }

    public final C197039127h LIZJ() {
        return (C197039127h) this.LIZLLL.getValue();
    }

    @Override // X.C0M1L
    public final void LIZ(View view, DraftBoxPageViewModel draftBoxPageViewModel, InterfaceC561590M0v interfaceC561590M0v) {
        Context context;
        C197039127h c197039127hLIZIZ;
        Context context2;
        C19EG c19egLIZIZ;
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        this.LIZIZ = view;
        this.LIZ = draftBoxPageViewModel;
        this.LJFF = interfaceC561590M0v;
        if (view != null && (context2 = view.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context2)) != null) {
            DraftBoxPageViewModel draftBoxPageViewModel2 = this.LIZ;
            if (draftBoxPageViewModel2 != null && (mutableLiveData2 = draftBoxPageViewModel2.LLIZ) != null) {
                mutableLiveData2.observe(c19egLIZIZ, new AObserverS212S0100000_8(this, 110));
            }
            DraftBoxPageViewModel draftBoxPageViewModel3 = this.LIZ;
            if (draftBoxPageViewModel3 != null && (mutableLiveData = draftBoxPageViewModel3.LLJ) != null) {
                mutableLiveData.observe(c19egLIZIZ, new AObserverS212S0100000_8(this, 111));
            }
        }
        C197039127h c197039127hLIZIZ2 = LIZIZ();
        if (c197039127hLIZIZ2 != null && (context = c197039127hLIZIZ2.getContext()) != null && (c197039127hLIZIZ = LIZIZ()) != null) {
            C786410Ut5.I7(new AkS53S0200000_8(this, context, 18), c197039127hLIZIZ);
        }
    }
}
