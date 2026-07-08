package X;

import X.InterfaceC633080OsM;
import Y.AObjectS352S0100000_9;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import java.util.Map;

/* JADX INFO: renamed from: X.0OsK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633060OsK<V extends InterfaceC633080OsM> extends C1260870iur<AbstractC666100QAu<MusicDetail>, V> {
    public String LLILZ;
    public String LLILZIL;
    public Long LLILZLL = 0L;
    public final String LLIZ = "";
    public final Long LLIZLLLIL = 0L;
    public WeakHandler LLJ;

    public final void LJIILL() {
        C1202980hPU.LIZ(this.LLIZ, "MusicDetail", this.LLIZLLLIL.longValue(), this.LLILZLL.longValue(), SystemClock.elapsedRealtime(), C297190Bkr.LIZ(), new InterfaceC1164020gOe() { // from class: X.0OsL
            @Override // X.InterfaceC1164020gOe
            public final void onEvent(Map map) {
                C20684815ws.LJIILLIIL("power_preload_duration_key", map);
            }
        });
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        T t;
        K k = this.LLILLJJLI;
        if (k != 0 && (t = this.LL) != 0) {
            ((InterfaceC633080OsM) k).onLoadMusicDetailSuccess((MusicDetail) t.getData());
        }
        if (this.LLILZ == null || this.LLILZIL == null) {
            return;
        }
        if (!((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).isStandardUIEnable() || ((Boolean) C280400Ays.LIZ.getValue()).booleanValue()) {
            C633100OsO c633100OsO = C633100OsO.LIZ;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            MusicDetail musicDetail = (MusicDetail) this.LL.getData();
            c633100OsO.getClass();
            C603820NmG<String, C633090OsN> c603820NmG = C633100OsO.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('&');
            sbLIZ.append(str2);
            c603820NmG.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), new C633090OsN(musicDetail, System.currentTimeMillis()));
            LJIILL();
        }
    }

    public C633060OsK() {
        LJIIJ(new C0OGF(this));
        new C628510Okz(new AObjectS352S0100000_9(this, 1), new AObjectS352S0100000_9(this, 2));
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC633080OsM) k).onLoadMusicDetailFail(exc);
        }
        String str = this.LLIZ;
        if (str != null) {
            C1203000hPW.LIZ.remove(str);
        }
        C633100OsO.LIZ.getClass();
    }
}
