package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.feed.IMCommonFeedBridgeApi;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Zjw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908140Zjw {
    public static final C01GW<C908140Zjw> LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(384));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(385));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1345));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1344));

    public final C823170WQx<String> LIZ() {
        return (C823170WQx) this.LIZ.getValue();
    }

    public final void LIZIZ(Aweme aweme, Boolean bool) {
        C0Z7L c0z7l;
        SimVideoUrlModel simVideoUrlModelLIZLLL;
        boolean zIsCache;
        if (C289830BXp.LIZ() && (c0z7l = (C0Z7L) PluggableExtentionKt.pluggableSpiForReal(IDMResourceManagementService.class)) != null) {
            if (bool != null) {
                zIsCache = bool.booleanValue();
            } else {
                IMCommonFeedBridgeApi.LIZ.getClass();
                IMCommonFeedBridgeApi value = C913490ZsZ.LIZIZ.getValue();
                if (value != null) {
                    simVideoUrlModelLIZLLL = value.LIZLLL(aweme);
                } else {
                    simVideoUrlModelLIZLLL = null;
                }
                zIsCache = C1478160oZK.LIZ().isCache(simVideoUrlModelLIZLLL);
            }
            if (!zIsCache) {
                c0z7l.LIZ(EnumC894670Z7x.PREDICT_AWEME_VIDEO_PRELOAD, "online", aweme.getAid());
                LIZ().add(aweme.getAid());
                c0z7l.LJI(null, true);
            }
        }
    }
}
