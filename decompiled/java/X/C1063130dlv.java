package X;

import com.ss.android.ugc.aweme.ad.feed.ibe.IBEPreloadTask;
import com.ss.android.ugc.aweme.ad.feed.ibe.setting.IBEConfigSettings;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dlv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1063130dlv extends C09AY implements Function0<Unit> {
    public final /* synthetic */ IBEPreloadTask LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063130dlv(IBEPreloadTask iBEPreloadTask) {
        super(0);
        this.LL = iBEPreloadTask;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.getClass();
        final C1063150dlx c1063150dlx = new C1063150dlx(0, null, null, "boot_preload", true, 7);
        C823050WQl.LIZLLL().submit(new Runnable() { // from class: X.0dlt
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("IBEPreloadTask@6d30.preloadIBEGecko$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("IBEPreloadTask@6d30.preloadIBEGecko$1");
            }

            public final void LIZ() {
                IBEConfigSettings.IBEChannelConfig[] iBEChannelConfigArr = IBEConfigSettings.LIZ().ibeList;
                C1063150dlx c1063150dlx2 = c1063150dlx;
                for (IBEConfigSettings.IBEChannelConfig iBEChannelConfig : iBEChannelConfigArr) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aweme://lynxview?channel=");
                    sbLIZ.append(a0.LJJJJZ("channel=", iBEChannelConfig.channel));
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1063070dlp(new IBEInfo(1, C2188811AlT.LIZIZ(sbLIZ), null), c1063150dlx2, null), 3);
                }
            }
        });
        return Unit.LIZ;
    }
}
