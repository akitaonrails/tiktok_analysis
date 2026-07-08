package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastEffectManagerOpt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0U3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766040U3e implements C0U69<LiveEffect> {
    @Override // X.C0U69
    public final List<C0U74<LiveEffect>> LJIIIZ(List<C0U74<LiveEffect>> list) {
        C770170UJb.LIZJ("VoiceEffect");
        C770170UJb.LIZLLL = "";
        if (LiveBroadcastEffectManagerOpt.forbidVoicePreload()) {
            return list;
        }
        Iterator<Object> it2 = new C1939607ik(list).iterator();
        while (it2.hasNext()) {
            for (T t : ((C0U74) it2.next()).LIZIZ) {
                if (!C766720U5u.LJIILLIIL(t)) {
                    C761830TuX c761830TuX = C761830TuX.LIZ;
                    if (C761830TuX.LIZLLL(t)) {
                        C766720U5u.LJ(t, null);
                    }
                }
            }
        }
        return list;
    }
}
