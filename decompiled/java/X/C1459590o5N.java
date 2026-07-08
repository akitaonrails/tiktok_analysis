package X;

import Y.AObserverS220S0100000_16;
import Y.AfS157S0200000_22;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0o5N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459590o5N implements InterfaceC1458060o2u {
    public final C19EG LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final InterfaceC1455610nyx LIZJ;
    public final C11NJ LIZLLL = new C11NJ();
    public final List<Pair<LiveData<Object>, Observer<Object>>> LJ = new ArrayList();
    public C0P0T LJFF;
    public final AbstractC214814194y LJI;

    public final InterfaceC1460000o62 LIZIZ() {
        InterfaceC1455610nyx interfaceC1455610nyx = this.LIZJ;
        if (interfaceC1455610nyx instanceof InterfaceC1460000o62) {
            return (InterfaceC1460000o62) interfaceC1455610nyx;
        }
        return null;
    }

    @Override // X.InterfaceC1458060o2u
    public final void clear() {
        this.LIZLLL.LJ();
        for (Pair<LiveData<Object>, Observer<Object>> pair : this.LJ) {
            pair.getFirst().removeObserver(pair.getSecond());
        }
        ((ArrayList) this.LJ).clear();
    }

    public final void LIZ(View view) {
        if (!C1403010mc7.LIZ.getMusicService().Qk()) {
            C1403010mc7.LIZ.getMusicService().dl().getClass();
            C11PQ<C204607154j> c11pq = C1458410o3T.LIZLLL;
            if (c11pq != null) {
                this.LIZLLL.LIZ(c11pq.LJJLJLI(new AfS157S0200000_22(view, this, 3)));
            }
        }
    }

    public final void LIZJ(Map<Integer, ? extends View> map) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> liveDataLQ1 = this.LIZJ.lQ1(iIntValue);
            if (liveDataLQ1 != null) {
                LJFF(liveDataLQ1, this.LJI, new AObserverS220S0100000_16(view, 12));
            }
        }
    }

    public final void LIZLLL(Map<Integer, ? extends View> map) {
        LiveData<Boolean> liveDataHB;
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            InterfaceC1460000o62 interfaceC1460000o62LIZIZ = LIZIZ();
            if (interfaceC1460000o62LIZIZ != null && (liveDataHB = interfaceC1460000o62LIZIZ.hB(iIntValue)) != null) {
                LJFF(liveDataHB, this.LJI, new AObserverS220S0100000_16(view, 13));
            }
        }
    }

    public final void LJ(Map<Integer, ? extends View> map) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            View view = (View) entry.getValue();
            LiveData<Boolean> liveDataV01 = this.LIZJ.v01(iIntValue);
            if (liveDataV01 != null) {
                LJFF(liveDataV01, this.LJI, new AObserverS220S0100000_16(view, 14));
            }
        }
    }

    public final void LJFF(LiveData liveData, AbstractC214814194y abstractC214814194y, Observer observer) {
        liveData.observe(abstractC214814194y, observer);
        ((ArrayList) this.LJ).add(new Pair(liveData, observer));
    }

    public C1459590o5N(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, C19A3 c19a3, InterfaceC1455610nyx interfaceC1455610nyx) {
        this.LIZ = c19eg;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = interfaceC1455610nyx;
        this.LJI = C372650EjH.LIZIZ(c19a3);
    }
}
