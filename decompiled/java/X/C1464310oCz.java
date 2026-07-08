package X;

import Y.AObserverS220S0100000_16;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarState;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0oCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464310oCz {
    public final FTCEditToolbarViewModel LIZ;
    public final C11NJ LIZIZ = new C11NJ();
    public final List<Pair<LiveData<Object>, Observer<Object>>> LIZJ = new ArrayList();
    public final AbstractC214814194y LIZLLL;

    public final void LIZ() {
        this.LIZIZ.LJ();
        for (Pair<LiveData<Object>, Observer<Object>> pair : this.LIZJ) {
            pair.getFirst().removeObserver(pair.getSecond());
        }
        ((ArrayList) this.LIZJ).clear();
    }

    public final void LIZJ(Map<Integer, ? extends View> map) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> liveDataHB = this.LIZ.hB(iIntValue);
            if (liveDataHB != null) {
                AbstractC214814194y abstractC214814194y = this.LIZLLL;
                AObserverS220S0100000_16 aObserverS220S0100000_16 = new AObserverS220S0100000_16(view, 27);
                liveDataHB.observe(abstractC214814194y, aObserverS220S0100000_16);
                ((ArrayList) this.LIZJ).add(new Pair(liveDataHB, aObserverS220S0100000_16));
            }
        }
    }

    public final void LIZLLL(Map<Integer, ? extends View> map) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> liveDataDD2 = this.LIZ.dD2(iIntValue);
            if (liveDataDD2 != null) {
                AbstractC214814194y abstractC214814194y = this.LIZLLL;
                AObserverS220S0100000_16 aObserverS220S0100000_16 = new AObserverS220S0100000_16(view, 28);
                liveDataDD2.observe(abstractC214814194y, aObserverS220S0100000_16);
                ((ArrayList) this.LIZJ).add(new Pair(liveDataDD2, aObserverS220S0100000_16));
            }
        }
    }

    public final void LJ(Map<Integer, ? extends View> map) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> liveDataV01 = this.LIZ.v01(iIntValue);
            if (liveDataV01 != null) {
                AbstractC214814194y abstractC214814194y = this.LIZLLL;
                AObserverS220S0100000_16 aObserverS220S0100000_16 = new AObserverS220S0100000_16(view, 29);
                liveDataV01.observe(abstractC214814194y, aObserverS220S0100000_16);
                ((ArrayList) this.LIZJ).add(new Pair(liveDataV01, aObserverS220S0100000_16));
            }
        }
    }

    public C1464310oCz(FTCEditToolbarViewModel fTCEditToolbarViewModel, C19A3 c19a3) {
        this.LIZ = fTCEditToolbarViewModel;
        this.LIZLLL = C372650EjH.LIZIZ(c19a3);
    }

    public final void LIZIZ(InterfaceC1166920gTK interfaceC1166920gTK, C1460640o74 c1460640o74) {
        interfaceC1166920gTK.selectNonNullSubscribe(this.LIZ, new C2217381BqS() { // from class: X.0oD2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditToolbarState) obj).getChooseMusicText();
            }
        }, new C1765020w20(), new AwS636S0100000_22(c1460640o74, 51));
        interfaceC1166920gTK.selectNonNullSubscribe(this.LIZ, new C2217381BqS() { // from class: X.0oD1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditToolbarState) obj).getChooseMusicRawIconRes();
            }
        }, new C1765020w20(), new AwS636S0100000_22(c1460640o74, 52));
    }
}
