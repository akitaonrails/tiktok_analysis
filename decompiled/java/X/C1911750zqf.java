package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.assem.TikTokToolsAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.ss.android.ugc.aweme.services.edit.StripMusicPostType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911750zqf extends C09AY implements Function0<C1911730zqd> {
    public final /* synthetic */ TikTokToolsAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1911750zqf(TikTokToolsAssem tikTokToolsAssem) {
        super(0);
        this.LL = tikTokToolsAssem;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0zqd] */
    @Override // kotlin.jvm.functions.Function0
    public final C1911730zqd invoke() {
        return new InterfaceC486470J5x(LifecycleOwnerKt.getLifecycleScope(this.LL)) { // from class: X.0zqd
            public final LifecycleCoroutineScope LL;

            {
                this.LL = lifecycleCoroutineScope;
            }

            @Override // X.InterfaceC486470J5x
            public final void LIZIZ(WsChannelMsg wsChannelMsg) {
                Object c098200Yq;
                Object c098200Yq2;
                try {
                    C201955140j.LJIILL(C201962140q.LIZIZ, "music_edit", "onReceivedWsMsg");
                    if (((IReplaceMusicService) PluggableExtentionKt.pluggableSpi$default(IReplaceMusicService.class, false, false, false, 14, null)) != null) {
                        JSONObject jSONObject = new JSONObject(new String(wsChannelMsg.LIZ(), Charsets.UTF_8));
                        boolean z = JSONObjectProtectorUtils.getBoolean(jSONObject, "success");
                        C1440005kM.LIZ(new C1911700zqa(JSONObjectProtectorUtils.getString(jSONObject, "item_id")));
                        try {
                            String strOptString = jSONObject.optString("biz_extra_str");
                            if (strOptString == null) {
                                c098200Yq2 = null;
                            } else {
                                c098200Yq2 = new JSONObject(strOptString).optString("post_type");
                            }
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq2 = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                            c098200Yq2 = null;
                        }
                        String str = (String) c098200Yq2;
                        if (!Intrinsics.LJFF(str, StripMusicPostType.POST_FROM_ADD_SOUND.getValue()) && !Intrinsics.LJFF(str, StripMusicPostType.POST_WITH_PREVIEW.getValue()) && !Intrinsics.LJFF(str, StripMusicPostType.POST_FROM_REPLACE_WITH_STRIP.getValue())) {
                            ((IReplaceMusicService) ServiceManager.get().getService(IReplaceMusicService.class)).showWindow(jSONObject, z);
                        } else {
                            LifecycleCoroutineScope lifecycleCoroutineScope = this.LL;
                            C1DFH c1dfh = C0PEM.LIZ;
                            C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ, null, new C05FJ(z, jSONObject, null), 2);
                        }
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C2344809Gs.LJI(thM5exceptionOrNullimpl);
                }
            }
        };
    }
}
