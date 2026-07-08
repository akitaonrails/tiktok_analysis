package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0hVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206880hVm {
    public static boolean LIZIZ;
    public static CharSequence LIZLLL;
    public static final C1206880hVm LIZ = new C1206880hVm();
    public static boolean LIZJ = true;

    public static void LIZ(final View view) {
        boolean z;
        Object obj;
        ILocationBaseServiceForMT iLocationBaseServiceForMT;
        boolean z2 = LIZIZ;
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        Context context = view.getContext();
        c19741112Lp.getClass();
        boolean zLIZLLL = C19741112Lp.LIZLLL(context, "android.permission.ACCESS_FINE_LOCATION");
        C1207120hWA c1207120hWA = C1207120hWA.LIZ;
        ILocationBaseServiceForMT iLocationBaseServiceForMT2 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT2 != null && iLocationBaseServiceForMT2.LJJIJ()) {
            z = true;
        } else {
            z = false;
        }
        c1207120hWA.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "location_services_setting");
        String str = "1";
        if (zLIZLLL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("system_is_precise", obj);
        if (!z) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("inapp_is_precise", str);
        C20684815ws.LJIILLIIL("toggle_precise_location", linkedHashMap);
        if (z2) {
            LIZIZ = false;
            ILocationBaseServiceForMT iLocationBaseServiceForMT3 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
            if (iLocationBaseServiceForMT3 != null) {
                iLocationBaseServiceForMT3.LIZIZ(false);
            }
            C1198910hIv.LIZIZ.LIZ();
            return;
        }
        boolean zLIZLLL2 = C19741112Lp.LIZLLL(view.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
        TokenCert tokenCertWith = TokenCert.Companion.with("bpea-location_precise_setting_request_permission");
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            if (zLIZLLL2 && !zLIZLLL) {
                LIZIZ = false;
                ILocationBaseServiceForMT iLocationBaseServiceForMT4 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                if (iLocationBaseServiceForMT4 == null) {
                    return;
                }
                iLocationBaseServiceForMT4.LJIJJLI("poi", "add_location", tokenCertWith, c19egLIZIZ, new C1207520hWo("location_services_setting", null, null, null, false, false, null, null, null, 510), new InterfaceC1207030hW1() { // from class: X.0hVn
                    @Override // X.InterfaceC1207030hW1
                    public final void LIZIZ(int i, String str2) {
                    }

                    @Override // X.InterfaceC1207030hW1
                    public final void LIZJ(int i) {
                    }

                    @Override // X.InterfaceC1207030hW1
                    public final void LIZ() {
                        C1206880hVm c1206880hVm = C1206880hVm.LIZ;
                        c1206880hVm.getClass();
                        C1206880hVm.LIZIZ = true;
                        ILocationBaseServiceForMT iLocationBaseServiceForMT5 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
                        if (iLocationBaseServiceForMT5 != null) {
                            iLocationBaseServiceForMT5.LIZIZ(true);
                        }
                        C1198910hIv.LIZIZ.LIZ();
                        String string = view.getContext().getString(2131844829);
                        c1206880hVm.getClass();
                        C1206880hVm.LIZLLL = string;
                    }
                }, true, true);
                return;
            }
            ILocationBaseServiceForMT iLocationBaseServiceForMT5 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
            if (iLocationBaseServiceForMT5 != null) {
                iLocationBaseServiceForMT5.LIZIZ(true);
            }
            C1198910hIv.LIZIZ.LIZ();
            return;
        }
        if (zLIZLLL2 && !zLIZLLL && (iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null)) != null) {
            iLocationBaseServiceForMT.LJIJJLI("poi", "add_location", tokenCertWith, c19egLIZIZ, null, new InterfaceC1207030hW1() { // from class: X.0hVo
                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str2) {
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                }
            }, true, true);
        }
        LIZIZ = true;
        ILocationBaseServiceForMT iLocationBaseServiceForMT6 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT6 != null) {
            iLocationBaseServiceForMT6.LIZIZ(true);
        }
        C1198910hIv.LIZIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r16) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1206880hVm.LIZIZ(android.content.Context):void");
    }
}
