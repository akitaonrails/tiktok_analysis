package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0x3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804450x3b {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        Context context;
        IHybridStorageService iHybridStorageService;
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null && (context = iHostAppContext.context()) != null && str != null && (iHybridStorageService = (IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)) != null) {
            iHybridStorageService.CM(context, str, "live_recharge_v3_last_tab_panel_channel", null);
        }
    }
}
