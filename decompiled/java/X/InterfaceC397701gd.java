package X;

import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.01gd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC397701gd {
    void LJIIL(Effect effect, IFetchEffectListener iFetchEffectListener);

    void LJIILIIL(List list, Map map, C396901gV c396901gV);

    void LJIILJJIL(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener);

    Gson getGson();
}
