package X;

import com.bytedance.android.livesdkapi.host.IHostResource;

/* JADX INFO: renamed from: X.0TGE, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TGE implements Runnable {
    public static final C0TGE LL = new C0TGE();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FansClubUtils@cd26.updateTaskPageGeckoResource$1");
        try {
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            if (iHostResource != null && !iHostResource.u61("tiktok_live_revenue_fans_level_main_user")) {
                iHostResource.NP0("tiktok_live_revenue_fans_level_main_user");
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FansClubUtils@cd26.updateTaskPageGeckoResource$1");
    }
}
