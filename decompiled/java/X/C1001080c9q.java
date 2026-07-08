package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;

/* JADX INFO: renamed from: X.0c9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001080c9q extends AbstractC1017460caG {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean LIZIZ(Context context, Aweme aweme, int i) {
        IAdSceneService iAdSceneService;
        IAdSceneService iAdSceneService2;
        IAdSceneService iAdSceneService3;
        IAdSceneService iAdSceneService4;
        if (!AwemeExtKt.isAdTraffic(aweme) || !C1017070cZd.LJJLIIJ(aweme)) {
            return false;
        }
        String type = aweme.getAwemeRawAd().getType();
        if (TextUtils.isEmpty(type)) {
            return false;
        }
        if ((i == 1 || i == 2) && C1017070cZd.LLLJL(aweme)) {
            return true;
        }
        if (TextUtils.equals(type, "paid_content")) {
            IAdSceneService iAdSceneService5 = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
            if (iAdSceneService5 != null) {
                iAdSceneService5.LIZIZ();
                C1022290ci3.LJ(context, aweme, i);
            }
            return true;
        }
        if (!TextUtils.equals(type, "app") && !TextUtils.equals(type, "phone") && !C1017070cZd.LJJZZIII(aweme) && (i == 1 || i == 18 || i == 4 || i == 35 || i == 5 || i == 36 || i == 7 || i == 37 || i == 38)) {
            return AbstractC1017460caG.LIZ(context, aweme, i);
        }
        String type2 = aweme.getAwemeRawAd().getType();
        if ((!TextUtils.equals(type2, "app") && !TextUtils.equals(type2, "phone") && !C1017070cZd.LJJZZIII(aweme) && (i == 11 || i == 14 || i == 12 || i == 13 || i == 15 || i == 20 || i == 19 || i == 21)) || (C1017070cZd.LJJLL(aweme) && (i == 3 || i == 92 || i == 11 || i == 14 || i == 20 || i == 12 || i == 2 || i == 1 || i == 35 || i == 4 || i == 8 || i == 58))) {
            return AbstractC1017460caG.LIZ(context, aweme, i);
        }
        type.getClass();
        switch (type.hashCode()) {
            case 96801:
                if (type.equals("app") && (iAdSceneService4 = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class)) != null) {
                    iAdSceneService4.LIZIZ();
                    C1022290ci3.LJ(context, aweme, i);
                    break;
                }
                break;
            case 117588:
                if (type.equals("web")) {
                }
                break;
            case 106642798:
                if (type.equals("phone") && C1017070cZd.LJJZZI(aweme) && (iAdSceneService3 = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class)) != null) {
                    iAdSceneService3.LIZIZ();
                    C1022290ci3.LJ(context, aweme, i);
                    break;
                }
                break;
            case 954925063:
                if (type.equals("message")) {
                    if (C1017070cZd.LLIL(aweme) || C1017070cZd.LJJZZIII(aweme)) {
                        DmNoticeProxy dmNoticeProxyLIZJ = DmNoticeProxyImpl.LIZJ();
                        if (dmNoticeProxyLIZJ != null && dmNoticeProxyLIZJ.LIZIZ()) {
                            C1388190mED.LIZ(context);
                        } else {
                            IAdSceneService iAdSceneService6 = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
                            if (iAdSceneService6 != null) {
                                iAdSceneService6.LIZIZ();
                                C1022290ci3.LJ(context, aweme, i);
                            }
                        }
                    }
                }
                break;
            case 957829685:
                if (type.equals("counsel") && AwemeExtKt.isAdTraffic(aweme) && (iAdSceneService2 = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class)) != null) {
                    iAdSceneService2.LIZIZ();
                    C1022290ci3.LJ(context, aweme, i);
                    break;
                }
                break;
            case 1893962841:
                if (type.equals("redpacket") && (iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class)) != null) {
                    iAdSceneService.LIZIZ();
                    C1022290ci3.LJ(context, aweme, i);
                }
                break;
        }
        return false;
    }
}
