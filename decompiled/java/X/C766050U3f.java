package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0U3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766050U3f extends C0U5H {
    public final C0U3W LIZJ = new C0U3W();

    @Override // X.C0U3X
    public final List<C0U74<LiveEffect>> LJI(EffectChannelResponse effectChannelResponse) {
        return this.LIZJ.LJI(effectChannelResponse);
    }

    @Override // X.C0U5H, X.C0U69
    public final List<C0U74<LiveEffect>> LJIIIZ(List<C0U74<LiveEffect>> list) {
        Iterator<Object> it2 = new C1939607ik(list).iterator();
        while (it2.hasNext()) {
            for (T t : ((C0U74) it2.next()).LIZIZ) {
                if (!C0U5H.LJIILL(t)) {
                    C761830TuX c761830TuX = C761830TuX.LIZ;
                    if (C761830TuX.LIZLLL(t)) {
                        LJIIL(t, null, false, false, false);
                    }
                }
            }
        }
        return list;
    }
}
