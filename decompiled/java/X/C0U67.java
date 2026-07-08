package X;

import Y.AfS181S0100000_12;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* JADX INFO: renamed from: X.0U67, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U67<T> implements IFetchEffectChannelListener {
    public final String LIZ;
    public final C0U3X<T> LIZIZ;
    public final C0U69<T> LIZJ;
    public final C0U68<T> LIZLLL;
    public final long LJ = System.currentTimeMillis();

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        C770170UJb.LIZJ("LiveEffectDataProvider");
        C770170UJb.LIZIZ("fetch from remote fail");
        LIZ(this.LIZ, false);
        C0U68<T> c0u68 = this.LIZLLL;
        if (c0u68 != null) {
            c0u68.onFail();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        C770170UJb.LIZJ("LiveEffectDataProvider");
        C770170UJb.LIZIZ("fetch from remote success");
        C11NZ.LJIJJLI(new C786330Usx(this, effectChannelResponse, 4)).LJIILIIL(new C0UO0()).LJJLJLI(new AfS181S0100000_12(this, 234));
    }

    public final void LIZ(String str, boolean z) {
        String str2;
        String str3 = C0UD4.LIZ;
        if ("livefiltercomposerexperiment".equals(str)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_filter_panel_download");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - this.LJ), "duration");
            if (z) {
                str2 = "done";
            } else {
                str2 = "failed";
            }
            c474500IjALIZ.LJJII(str2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c474500IjALIZ.LIZ();
        }
    }

    public C0U67(String str, C0U3X<T> c0u3x, C0U69<T> c0u69, C0U68<T> c0u68) {
        this.LIZ = str;
        this.LIZIZ = c0u3x;
        this.LIZJ = c0u69;
        this.LIZLLL = c0u68;
    }
}
