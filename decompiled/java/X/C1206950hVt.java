package X;

import X.C1207120hWA;
import X.C19741112Lp;
import X.C20489080x;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.InAppPreciseUploadApi;
import com.ss.android.ugc.aweme.api.PoiSearchRequestBodyForPrecise;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.service.LocationServiceForPreciseImpl$openInBuildSystemPreciseGuidePopup$5$1;
import com.ss.android.ugc.aweme.ui.LocationServicePreciseSettingCell;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS147S0400000_18;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS5S3300000_18;
import kotlin.jvm.internal.AwS70S0210000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206950hVt implements ILocationBaseServiceForMT {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(697));
    public LocationServiceForPreciseImpl$openInBuildSystemPreciseGuidePopup$5$1 LIZIZ;

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJII(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJIIL() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJIILJJIL() {
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJJ() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJJIIJZLJL(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJJIJIIJI() {
    }

    public static int LJJIJL() {
        C20489080x.LIZ.getClass();
        Keva kevaLIZLLL = C20489080x.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("in_app_precise_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return kevaLIZLLL.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final Map<String, String> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1207340hWW.LIZ.getClass();
        if (!C1207340hWW.LJIIJJI()) {
            ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
            C844470XAv.LIZ.getClass();
            boolean zLJ = iLocationBaseServiceForMT.LJ(C844470XAv.LIZ());
            PermissionCache.LL.getClass();
            boolean zLIZIZ = PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION");
            String str = CardStruct.IStatusCode.DEFAULT;
            linkedHashMap.put("enable_location", zLIZIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("system_is_precise", zLJ ? "1" : CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("inapp_is_precise", ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIJ() ? "1" : CardStruct.IStatusCode.DEFAULT);
            String strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(C1194170hBH.LIZJ(C844470XAv.LIZ())));
            if (strLIZLLL != null) {
                str = strLIZLLL;
            }
            linkedHashMap.put("is_location_system_permission", str);
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJIILL() {
        C20489080x.LIZ.getClass();
        long j = C20489080x.LIZLLL().getLong("last_upload_inapp_precise_status_ts", 0L);
        if (j <= 0 || System.currentTimeMillis() - j > 86400000) {
            int i = LJJIJ() ? 1 : LJIIJ() ? 0 : 2;
            InAppPreciseUploadApi.Companion.getClass();
            C0WW4.LIZ(i);
            C20489080x.LIZLLL().storeLong("last_upload_inapp_precise_status_ts", System.currentTimeMillis());
        }
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final List<String> LJIIZILJ() {
        return C1697810uHb.LJIIJJI("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final InterfaceC1891350zJl LJIJI() {
        return new C00F9(0);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJJIIJ() {
        return C292400Bd8.LIZ > 0;
    }

    public final C1207210hWJ LJJIJIL() {
        return (C1207210hWJ) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJIIJ() {
        return LJJIJL() == 0;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJJIJ() {
        return LJJIJL() == 2;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final Class<? extends PowerCell<?>> LJIIIZ() {
        return LocationServicePreciseSettingCell.class;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LIZIZ(boolean z) {
        int i;
        int i2 = 2;
        if (LJJIJ() != z) {
            if (C145T.LIZJ()) {
                C1798550wu5.LIZIZ.LJFF();
            }
            C0WW4 c0ww4 = InAppPreciseUploadApi.Companion;
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            c0ww4.getClass();
            C0WW4.LIZ(i);
        }
        C1798550wu5.LIZIZ.LIZJ();
        C20489080x.LIZ.getClass();
        Keva kevaLIZLLL = C20489080x.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("in_app_precise_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!z) {
            i2 = 1;
        }
        kevaLIZLLL.storeInt(strLIZIZ, i2);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJ(Context context) {
        PermissionCache.LL.getClass();
        return PermissionCache.LIZIZ("android.permission.ACCESS_FINE_LOCATION");
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJFF(Context context) {
        C1206880hVm.LIZ.getClass();
        return C1206880hVm.LIZIZ;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final boolean LJI(Context context) {
        C1206880hVm.LIZ.getClass();
        return C1206880hVm.LIZJ;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final C540070LGb LJIIIIZZ(String str) throws IOException {
        MediaMetadataRetriever mediaMetadataRetrieverLJJ = C2471909mP.LJJ(str);
        try {
            TokenCert tokenCertWith = TokenCert.Companion.with("bpea-poi_publish_read_location_metadata");
            tokenCertWith.auth("uyqw");
            String[] strArrLIZLLL = C20144413ru.LIZLLL(mediaMetadataRetrieverLJJ, tokenCertWith);
            if (strArrLIZLLL != null) {
                C540070LGb c540070LGb = new C540070LGb(strArrLIZLLL[0], strArrLIZLLL[1], Long.valueOf(C1206790hVd.LIZ(C2204961BRm.LJLJI(mediaMetadataRetrieverLJJ, 5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcYnH3zceiim3NJ/uU+18INCJZmenZtebSvMemP7VtXbQIY0=", null)))));
                mediaMetadataRetrieverLJJ.release();
                return c540070LGb;
            }
        } catch (Throwable th) {
            try {
            } catch (Throwable th2) {
                try {
                    mediaMetadataRetrieverLJJ.release();
                    throw th2;
                } finally {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
        try {
            mediaMetadataRetrieverLJJ.release();
            return null;
        } catch (Throwable th22) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final C540070LGb LJIILLIIL(String str) {
        try {
            ExifInterface exifInterfaceLJIILL = C2471909mP.LJIILL(str);
            String[] strArr = new String[2];
            int i = 0;
            do {
                strArr[i] = "";
                i++;
            } while (i < 2);
            if (exifInterfaceLJIILL != null) {
                TokenCert tokenCertWith = TokenCert.Companion.with("bpea-poi_publish_read_location_metadata");
                tokenCertWith.auth("uyqw");
                if (C20144513rv.LIZ(exifInterfaceLJIILL, strArr, tokenCertWith)) {
                    return new C540070LGb(strArr[0], strArr[1], Long.valueOf(C1206790hVd.LIZ(C2204961BRm.LJLIL(exifInterfaceLJIILL, "DateTime", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcYnH3zceiim3NJ/uU+18INCJZmenZtebSvMemP7VtXbQIY0=", null)))));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJIJ(List<C0HWO> list) {
        C0HWO next;
        boolean zLIZ;
        Iterator<C0HWO> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, "android.permission.ACCESS_FINE_LOCATION")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0HWO c0hwo = next;
        if (c0hwo != null) {
            zLIZ = c0hwo.LIZ();
        } else {
            zLIZ = false;
        }
        LIZIZ(zLIZ);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final CharSequence LJIJJ(Context context) {
        C1206880hVm.LIZ.getClass();
        return context.getString(2131844830);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final CharSequence LJJI(Context context) {
        C1206880hVm.LIZ.getClass();
        return C1206880hVm.LIZLLL;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final PoiSearchRequestBody LJJII(PoiSearchRequestBody poiSearchRequestBody) {
        PoiSearchRequestBodyForPrecise poiSearchRequestBodyForPrecise = new PoiSearchRequestBodyForPrecise(poiSearchRequestBody);
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        C844470XAv.LIZ.getClass();
        poiSearchRequestBodyForPrecise.setSystemIsPrecise(iLocationBaseServiceForMT.LJ(C844470XAv.LIZ()) ? 1 : 0);
        poiSearchRequestBodyForPrecise.setInAppIsPrecise(((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIJ() ? 1 : 0);
        return poiSearchRequestBodyForPrecise;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final String LJJIIZ(Context context) {
        return context.getString(2131835148);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJJIIZI(View view) {
        C1206880hVm.LIZ.getClass();
        C1206880hVm.LIZ(view);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJJIJIIJIL(Context context) {
        C1206880hVm.LIZ.getClass();
        C1206880hVm.LIZIZ(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJJIFFI(AFwS256S0000000_18 aFwS256S0000000_18, boolean z) {
        Object[] objArr;
        boolean z2;
        C1207340hWW.LIZ.getClass();
        if (C1207340hWW.LJIIJJI()) {
            return;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C1207400hWc.LIZ.getClass();
        boolean zLIZIZ = C1207400hWc.LIZIZ(contextLIZ);
        C19741112Lp.LIZ.getClass();
        boolean zLIZLLL = C19741112Lp.LIZLLL(contextLIZ, "android.permission.ACCESS_FINE_LOCATION");
        aFwS256S0000000_18.invoke(Boolean.valueOf(zLIZIZ));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "1";
        if (zLIZLLL) {
            objArr = "1";
        } else {
            objArr = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("system_is_precise", objArr);
        if (!LJJIJ()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("inapp_is_precise", str);
        boolean zLIZ = C1194170hBH.LIZ(C844470XAv.LIZ());
        boolean zLIZJ = C1194170hBH.LIZJ(C844470XAv.LIZ());
        if (zLIZ && zLIZJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        String strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(z2));
        if (strLIZLLL == null && (strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(zLIZIZ))) == null) {
            strLIZLLL = "";
        }
        linkedHashMap.put("is_open", strLIZLLL);
        String strLIZLLL2 = C1200530hLX.LIZLLL(Boolean.valueOf(zLIZ));
        String str2 = "-1";
        if (strLIZLLL2 == null) {
            strLIZLLL2 = "-1";
        }
        linkedHashMap.put("is_location_app_permission", strLIZLLL2);
        String strLIZLLL3 = C1200530hLX.LIZLLL(Boolean.valueOf(zLIZJ));
        if (strLIZLLL3 != null) {
            str2 = strLIZLLL3;
        }
        linkedHashMap.put("is_location_system_permission", str2);
        linkedHashMap.put("system_popup_available", String.valueOf(C1207400hWc.LIZ()));
        C20684815ws.LJIILLIIL("location_status", linkedHashMap);
        boolean zLJII = C1606660rua.LIZIZ.LJII();
        C1367960lha.LIZ.getClass();
        IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
        C1199450hJn c1199450hJn = new C1199450hJn("diff_nearby_tab_config_with_location_config");
        c1199450hJn.LIZ(zLJII ? 1L : 0L);
        iPoiServiceLIZ.LJJZZIII(c1199450hJn);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJJIII(Context context, Map<String, String> map) {
        String str;
        boolean zLJ = LJ(context);
        boolean zLJJIJ = LJJIJ();
        String str2 = "1";
        if (zLJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("system_is_precise", str);
        if (!zLJJIJ) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("inapp_is_precise", str2);
    }

    public static final void LJJIL(AtomicBoolean atomicBoolean, InterfaceC1207170hWF interfaceC1207170hWF, C1208000hXa c1208000hXa) {
        if (atomicBoolean.compareAndSet(false, true) && interfaceC1207170hWF != null) {
            interfaceC1207170hWF.LIZIZ(c1208000hXa);
        }
    }

    public static void LJJJI(Context context, View view, Function0 function0) {
        ILocationService iLocationService = (ILocationService) ServiceManager.get().getService(ILocationService.class);
        iLocationService.LJIIIZ(view, true);
        C1749280vcc c1749280vcc = (C1749280vcc) iLocationService.LJIIJ(view);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = context.getResources().getString(2131835154);
        c1722300uv6.LJIIIIZZ = context.getResources().getString(2131835153);
        c1722300uv6.LJIIIZ = new AwS372S0200000_6(context, (Context) function0, (Function0<Unit>) 62);
        c1749280vcc.setStatus(c1722300uv6);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final View LJIILIIL(Context context, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, AwS562S0100000_18 awS562S0100000_18) {
        View viewLIZJ = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LIZJ(context, viewOnAttachStateChangeListenerC20604515jv);
        if (viewLIZJ != null) {
            LJJJI(context, viewLIZJ, new AwS562S0100000_18(awS562S0100000_18, 2528));
        }
        return viewLIZJ;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LIZLLL(final Activity activity, Fragment fragment, final C1207520hWo c1207520hWo, final InterfaceC1207170hWF interfaceC1207170hWF, final String str) {
        C19FO c19fo;
        final C688120Qyw c688120Qyw;
        String str2;
        String str3;
        String str4;
        Context context;
        String str5 = null;
        if (fragment != null && (context = fragment.getContext()) != null) {
            c688120Qyw = new C688120Qyw(context, fragment, null);
        } else if ((activity instanceof C19EG) && (c19fo = (C19FO) activity) != null) {
            c688120Qyw = new C688120Qyw(c19fo, c19fo, null);
        } else {
            LJJIJIL().LJJIFFI("popup_context_missing", null, PopupManager.LJI(), null, null);
            interfaceC1207170hWF.LIZIZ(C1207290hWR.LIZ(EnumC1207420hWe.InApp));
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (PopupManager.LJI()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestLocationPermission: elementLabel: ");
            AbstractC20656215sG abstractC20656215sGLJ = PopupManager.LJ();
            if (abstractC20656215sGLJ != null) {
                str2 = abstractC20656215sGLJ.elementLabel;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            sbLIZ.append(" triggerId: ");
            AbstractC20656215sG abstractC20656215sGLJ2 = PopupManager.LJ();
            if (abstractC20656215sGLJ2 != null) {
                str3 = abstractC20656215sGLJ2.triggerId;
            } else {
                str3 = null;
            }
            sbLIZ.append(str3);
            C2188811AlT.LIZIZ(sbLIZ);
            C1207210hWJ c1207210hWJLJJIJIL = LJJIJIL();
            boolean zLJI = PopupManager.LJI();
            AbstractC20656215sG abstractC20656215sGLJ3 = PopupManager.LJ();
            if (abstractC20656215sGLJ3 != null) {
                str4 = abstractC20656215sGLJ3.elementLabel;
            } else {
                str4 = null;
            }
            AbstractC20656215sG abstractC20656215sGLJ4 = PopupManager.LJ();
            if (abstractC20656215sGLJ4 != null) {
                str5 = abstractC20656215sGLJ4.triggerId;
            }
            c1207210hWJLJJIJIL.LJJIFFI(null, str4, zLJI, str5, null);
        }
        PopupManager.LJIJ(new C10GR() { // from class: X.0hWG
            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return 210;
            }

            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                return c688120Qyw;
            }

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw2, C20656615sK c20656615sK) {
                this.LL.LJJIJIL().LJIL(activity, new C1207150hWD(c20656615sK, c1207520hWo, this.LL, atomicBoolean, interfaceC1207170hWF), str);
            }

            @Override // X.AbstractC20656215sG
            public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                int i = C20657415sS.LIZ[enumC20657015sO2.ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3 && enumC20657015sO == EnumC20657015sO.SHOWED && !atomicBoolean.get()) {
                        C1206950hVt.LJJIL(atomicBoolean, interfaceC1207170hWF, new C1208000hXa(EnumC1207930hXT.Cancel, EnumC1207420hWe.InApp, null, null, 12));
                        return;
                    }
                    return;
                }
                if (atomicBoolean.get()) {
                    return;
                }
                C1206950hVt.LJJIL(atomicBoolean, interfaceC1207170hWF, C1207290hWR.LIZ(EnumC1207420hWe.InApp));
            }

            @Override // X.AbstractC20656215sG
            public final void showPopupFailed(int i, String str6) {
                super.showPopupFailed(i, str6);
                this.LL.LJJIJIL().LJJIFFI(str6, null, PopupManager.LJI(), null, Integer.valueOf(i));
                C1206950hVt.LJJIL(atomicBoolean, interfaceC1207170hWF, C1207290hWR.LIZ(EnumC1207420hWe.InApp));
            }
        }, "location", new C1668306g5("local_permission_gps_general"));
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final C1198940hIy LJIIJJI(Context context, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, AwS384S0200000_18 awS384S0200000_18, AwS562S0100000_18 awS562S0100000_18, AwS562S0100000_18 awS562S0100000_182) {
        boolean z;
        EnumC1205470hTV enumC1205470hTVLIZIZ;
        ILocationService iLocationService = (ILocationService) ServiceManager.get().getService(ILocationService.class);
        EnumC1198780hIi enumC1198780hIi = null;
        if (!iLocationService.LJIJ() && !iLocationService.LJIIZILJ()) {
            return null;
        }
        View viewLIZJ = iLocationService.LIZJ(context, viewOnAttachStateChangeListenerC20604515jv);
        boolean zLJ = LJ(context);
        C19741112Lp.LIZ.getClass();
        boolean zLIZLLL = C19741112Lp.LIZLLL(context, "android.permission.ACCESS_COARSE_LOCATION");
        boolean zLJIIJ = LJIIJ();
        boolean zLJJIJ = LJJIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getGpsBannerHeaderView headerView:");
        sbLIZ.append(viewLIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (viewLIZJ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getGpsBannerHeaderView hasCoarsePermission:");
            sbLIZ2.append(zLIZLLL);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (!zLIZLLL) {
                enumC1198780hIi = EnumC1198780hIi.GPS;
                iLocationService.LJIILLIIL(context, viewLIZJ, new AwS419S0200000_18(iLocationService, awS384S0200000_18, 128));
            } else {
                boolean zLIZJ = false;
                if (!zLJIIJ && zLJJIJ && zLJ) {
                    z = false;
                } else {
                    z = true;
                }
                TokenCert tokenCertWith = TokenCert.Companion.with("bpea-poi-search-precise-manual_popup_android");
                if (C300190Bph.LIZ()) {
                    ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
                    if (iLocationServiceForLS != null) {
                        enumC1205470hTVLIZIZ = iLocationServiceForLS.LIZIZ(context, tokenCertWith);
                    } else {
                        enumC1205470hTVLIZIZ = null;
                    }
                    if (enumC1205470hTVLIZIZ == EnumC1205470hTV.SUCCESS) {
                        zLIZJ = true;
                    }
                } else {
                    C1197760hH4.LIZ.getClass();
                    if (C1197760hH4.LIZ()) {
                        zLIZJ = C1197760hH4.LIZJ(context, tokenCertWith);
                    } else {
                        zLIZJ = z;
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("getGpsBannerHeaderView showPreciseBanner:");
                sbLIZ3.append(zLIZJ);
                C2188811AlT.LIZIZ(sbLIZ3);
                if (zLIZJ) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("getGpsBannerHeaderView service.isPoiAddLocationPreciseV1Group():");
                    sbLIZ4.append(iLocationService.LJIIZILJ());
                    C2188811AlT.LIZIZ(sbLIZ4);
                    if (!iLocationService.LJIIZILJ()) {
                        return null;
                    }
                    enumC1198780hIi = EnumC1198780hIi.PROMOTE_PRECISE;
                    LJJJI(context, viewLIZJ, new AwS562S0100000_18(awS562S0100000_18, 2529));
                } else {
                    awS562S0100000_182.invoke();
                }
            }
        }
        return new C1198940hIy(viewLIZJ, enumC1198780hIi);
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    public final void LJIL(final Activity activity, Fragment fragment, final TokenCert tokenCert, final C1207520hWo c1207520hWo, final InterfaceC1207170hWF interfaceC1207170hWF) {
        String str;
        String str2;
        String str3;
        if (PopupManager.LJI()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestLocationPermission: elementLabel: ");
            AbstractC20656215sG abstractC20656215sGLJ = PopupManager.LJ();
            String str4 = null;
            if (abstractC20656215sGLJ != null) {
                str = abstractC20656215sGLJ.elementLabel;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(" triggerId: ");
            AbstractC20656215sG abstractC20656215sGLJ2 = PopupManager.LJ();
            if (abstractC20656215sGLJ2 != null) {
                str2 = abstractC20656215sGLJ2.triggerId;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            C1207210hWJ c1207210hWJLJJIJIL = LJJIJIL();
            boolean zLJI = PopupManager.LJI();
            AbstractC20656215sG abstractC20656215sGLJ3 = PopupManager.LJ();
            if (abstractC20656215sGLJ3 != null) {
                str3 = abstractC20656215sGLJ3.elementLabel;
            } else {
                str3 = null;
            }
            AbstractC20656215sG abstractC20656215sGLJ4 = PopupManager.LJ();
            if (abstractC20656215sGLJ4 != null) {
                str4 = abstractC20656215sGLJ4.triggerId;
            }
            c1207210hWJLJJIJIL.LJJIFFI(null, str3, zLJI, str4, null);
        }
        final C1208010hXb c1208010hXb = new C1208010hXb(tokenCert, activity, fragment);
        PopupManager.LJIJ(new AbstractC20660815t0(c1208010hXb) { // from class: X.0hWH
            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return 210;
            }

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                this.LL.LJJIJIL().LJJI(activity, tokenCert, new C1207200hWI(interfaceC1207170hWF, c20656615sK, c1207520hWo));
            }

            @Override // X.AbstractC20656215sG
            public final void showPopupFailed(int i, String str5) {
                super.showPopupFailed(i, str5);
                this.LL.LJJIJIL().LJJIFFI(str5, null, PopupManager.LJI(), null, Integer.valueOf(i));
            }
        }, "location", new C1668306g5("local_permission_gps_general"));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.ss.android.ugc.aweme.service.LocationServiceForPreciseImpl$openInBuildSystemPreciseGuidePopup$5$1] */
    public final void LJJIJLIJ(final Context context, final String str, final String str2, InterfaceC1207030hW1 interfaceC1207030hW1, final String str3) {
        LocationServiceForPreciseImpl$openInBuildSystemPreciseGuidePopup$5$1 locationServiceForPreciseImpl$openInBuildSystemPreciseGuidePopup$5$1 = this.LIZIZ;
        if (locationServiceForPreciseImpl$openInBuildSystemPreciseGuidePopup$5$1 != null) {
            ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(locationServiceForPreciseImpl$openInBuildSystemPreciseGuidePopup$5$1);
            this.LIZIZ = null;
        }
        System.currentTimeMillis();
        C21566919al c21566919al = new C21566919al(context);
        c21566919al.LIZIZ = context.getResources().getString(2131844827);
        c21566919al.LIZJ = context.getResources().getString(2131844823);
        c21566919al.LJIIJJI(new DialogInterfaceOnClickListenerC1208800hYs(context, 4), context.getResources().getString(2131826361), true);
        c21566919al.LJIIJ = new C21566819ak(new DialogInterface.OnClickListener() { // from class: X.0hVu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C849850XVn.LIZIZ.LIZJ().LJIJI("location", context.getResources().getString(2131826362), false);
                C1207120hWA c1207120hWA = C1207120hWA.LIZ;
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                boolean zLJJIJ = this.LJJIJ();
                c1207120hWA.getClass();
                C1207120hWA.LIZJ(str4, str5, str6, false, false, zLJJIJ, null);
            }
        }, context.getResources().getString(2131826362), false);
        c21566919al.LJII = false;
        c21566919al.LIZLLL(new AwS227S0300000_18(context, interfaceC1207030hW1, this, 49));
        final C21566519ah c21566519ah = new C21566519ah(c21566919al);
        this.LIZIZ = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.service.LocationServiceForPreciseImpl$openInBuildSystemPreciseGuidePopup$5$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                Context context2 = context;
                c19741112Lp.getClass();
                boolean zLIZLLL = C19741112Lp.LIZLLL(context2, "android.permission.ACCESS_FINE_LOCATION");
                if (event == Lifecycle.Event.ON_RESUME && zLIZLLL) {
                    this.LIZIZ(true);
                    C20489080x.LIZ.getClass();
                    C20489080x.LIZLLL().storeBoolean("location_permission_is_allow", true);
                    C1207120hWA c1207120hWA = C1207120hWA.LIZ;
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    boolean zLJJIJ = this.LJJIJ();
                    c1207120hWA.getClass();
                    C1207120hWA.LIZJ(str4, str5, str6, true, true, zLJJIJ, null);
                    c21566519ah.LIZIZ(null);
                    ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(this);
                    this.LIZIZ = null;
                }
            }
        };
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(this.LIZIZ);
        C1207120hWA.LIZ.getClass();
        JSONObject jSONObject = new JSONObject();
        C2365509Or.LIZLLL(jSONObject, "enter_from", str);
        C2365509Or.LIZLLL(jSONObject, "enter_method", str2);
        C2365509Or.LIZLLL(jSONObject, "previous_page", str3);
        C20684815ws.LJIJ("precise_location_permission_popup", jSONObject);
        c21566519ah.LIZLLL();
    }

    public final void LJJJJ(String str, String str2, String str3, Activity activity, Function0<Unit> function0) {
        C1207120hWA.LIZ.getClass();
        C1207120hWA.LIZIZ(str, str2, str3);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(activity), R.layout.dka, null, false);
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJII = false;
        C1207020hW0.LIZ(c1397580mTM, viewTd);
        C985403tE.LIZ(c1397580mTM, new AwS5S3300000_18(activity, this, str, str2, str3, function0, 0));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final void LJJJ(final String str, final String str2, final Activity activity, Cert cert, final Function0<Unit> function0, Function0<Unit> function02, final String str3) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 31) {
            z = true;
        } else {
            z = false;
        }
        boolean zLJ = LJ(activity);
        if (z) {
            if (zLJ) {
                if (!LJJIJ()) {
                    LJJJJ(str, str3, str2, activity, function0);
                    return;
                } else if (LJJIJ()) {
                    if (function0 == null) {
                        return;
                    }
                    function0.invoke();
                    return;
                }
            }
            if (function02 == null) {
                return;
            }
            function02.invoke();
            return;
        }
        C19741112Lp.LIZ.getClass();
        boolean zLIZLLL = C19741112Lp.LIZLLL(activity, "android.permission.ACCESS_COARSE_LOCATION");
        if (zLJ && LJJIJ() && function0 != null) {
            function0.invoke();
        }
        if (!zLIZLLL) {
            if (function02 == null) {
                return;
            }
            function02.invoke();
        } else {
            if (zLJ) {
                if (LJJIJ()) {
                    return;
                }
                LJJJJ(str, str3, str2, activity, function0);
                return;
            }
            C19514711Wn.LIZIZ.LIZIZ(activity, cert).LIZIZ("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION").LIZJ(new InterfaceC19515111Wr() { // from class: X.0hVz
                @Override // X.InterfaceC19515111Wr
                public final void onCanceled() {
                }

                @Override // X.InterfaceC19515111Wr
                public final void LIZ(C0HWO... c0hwoArr) {
                    if (!this.LJJIJ()) {
                        this.LJJJJ(str, str3, str2, activity, function0);
                    }
                }
            });
        }
    }

    public final void LJJJIL(String str, String str2, String str3, Activity activity, AbstractC1201400hMw abstractC1201400hMw, Function0<Unit> function0, Function0<Unit> function02) {
        if (abstractC1201400hMw != null) {
            abstractC1201400hMw.LJI(true);
        }
        C1207120hWA.LIZ.getClass();
        C1207120hWA.LIZIZ(str, str2, str3);
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        c1397580mTM.LJFF(2131844827);
        c1397580mTM.LIZ(2131844826);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new C1206990hVx(activity, this, function0, str, str2, str3, function02));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    @InterfaceC1294060jmO
    public final void LJIJJLI(String str, String str2, final Cert cert, final Activity activity, final C1207520hWo c1207520hWo, final InterfaceC1207030hW1 interfaceC1207030hW1, final boolean z, final boolean z2) {
        if (!z2 && C1198930hIx.LIZIZ.LIZIZ()) {
            if (interfaceC1207030hW1 != null) {
                interfaceC1207030hW1.LIZIZ(0, "hit frequency");
                return;
            }
            return;
        }
        C1207340hWW.LIZ.getClass();
        if (!C1207340hWW.LJI(str, str2)) {
            if (interfaceC1207030hW1 != null) {
                interfaceC1207030hW1.LIZIZ(0, "this scene is not allow to apply for location permissions");
                return;
            }
            return;
        }
        C19741112Lp.LIZ.getClass();
        final boolean zLIZLLL = C19741112Lp.LIZLLL(activity, "android.permission.ACCESS_COARSE_LOCATION");
        final boolean zLIZLLL2 = C19741112Lp.LIZLLL(activity, "android.permission.ACCESS_FINE_LOCATION");
        if (!zLIZLLL) {
            if (interfaceC1207030hW1 != null) {
                interfaceC1207030hW1.LIZIZ(0, "system conversion popup can't be shown");
                return;
            }
            return;
        }
        if (zLIZLLL2 && interfaceC1207030hW1 != null) {
            interfaceC1207030hW1.LIZ();
        }
        if (Build.VERSION.SDK_INT < 31) {
            if (C849850XVn.LIZIZ.LIZJ().LJJ("location")) {
                PopupManager.LJIJ(new C10GR() { // from class: X.0hW5
                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return 210;
                    }

                    @Override // X.InterfaceC20660415sw
                    public final C688120Qyw i2() {
                        C19FO c19fo;
                        Activity activity2 = activity;
                        if (!(activity2 instanceof C19EG) || (c19fo = (C19FO) activity2) == null) {
                            return null;
                        }
                        return new C688120Qyw(activity2, c19fo, null);
                    }

                    @Override // X.InterfaceC20659015si
                    public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
                        C19514511Wl c19514511WlLIZIZ = C19514711Wn.LIZIZ.LIZIZ(activity, cert).LIZIZ("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
                        final InterfaceC1207030hW1 interfaceC1207030hW12 = interfaceC1207030hW1;
                        c19514511WlLIZIZ.LIZJ(new InterfaceC19515111Wr() { // from class: X.0hW6
                            @Override // X.InterfaceC19515111Wr
                            public final void onCanceled() {
                            }

                            @Override // X.InterfaceC19515111Wr
                            public final void LIZ(C0HWO... c0hwoArr) {
                                final InterfaceC1207030hW1 interfaceC1207030hW13 = interfaceC1207030hW12;
                                final C20656615sK c20656615sK2 = c20656615sK;
                                InterfaceC1207030hW1 interfaceC1207030hW14 = new InterfaceC1207030hW1() { // from class: X.0hW7
                                    @Override // X.InterfaceC1207030hW1
                                    public final void LIZ() {
                                        InterfaceC1207030hW1 interfaceC1207030hW15 = interfaceC1207030hW13;
                                        if (interfaceC1207030hW15 != null) {
                                            interfaceC1207030hW15.LIZ();
                                        }
                                        c20656615sK2.LIZ();
                                    }

                                    @Override // X.InterfaceC1207030hW1
                                    public final void LIZJ(int i) {
                                        InterfaceC1207030hW1 interfaceC1207030hW15 = interfaceC1207030hW13;
                                        if (interfaceC1207030hW15 != null) {
                                            interfaceC1207030hW15.LIZJ(i);
                                        }
                                        c20656615sK2.LIZ();
                                    }

                                    @Override // X.InterfaceC1207030hW1
                                    public final void LIZIZ(int i, String str3) {
                                        InterfaceC1207030hW1 interfaceC1207030hW15 = interfaceC1207030hW13;
                                        if (interfaceC1207030hW15 != null) {
                                            interfaceC1207030hW15.LIZIZ(i, str3);
                                        }
                                        c20656615sK2.LIZ();
                                    }
                                };
                                int length = c0hwoArr.length;
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    C0HWO c0hwo = c0hwoArr[i];
                                    if (Intrinsics.LJFF(c0hwo.LIZ, "android.permission.ACCESS_FINE_LOCATION")) {
                                        if (c0hwo.LIZ()) {
                                            interfaceC1207030hW14.LIZ();
                                            return;
                                        }
                                    } else {
                                        i++;
                                    }
                                }
                                interfaceC1207030hW14.LIZJ(1);
                            }
                        });
                    }
                }, "location", new C1668306g5("local_permission_gps_general"));
                return;
            } else {
                C19514711Wn.LIZIZ.LIZIZ(activity, cert).LIZIZ("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").LIZJ(new C1208940hZ6(interfaceC1207030hW1, 0));
                return;
            }
        }
        final boolean zLJI = C19741112Lp.LJI(activity, "android.permission.ACCESS_FINE_LOCATION", false);
        final C013C c013c = new C013C();
        System.currentTimeMillis();
        if (C849850XVn.LIZIZ.LIZJ().LJJ("location")) {
            PopupManager.LJIJ(new C10GR() { // from class: X.0hW8
                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 210;
                }

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    C19FO c19fo;
                    Activity activity2 = activity;
                    if (!(activity2 instanceof C19EG) || (c19fo = (C19FO) activity2) == null) {
                        return null;
                    }
                    return new C688120Qyw(activity2, c19fo, null);
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, final C20656615sK c20656615sK) {
                    C19514511Wl c19514511WlLIZIZ = C19514711Wn.LIZIZ.LIZIZ(activity, cert).LIZIZ("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
                    final C013C c013c2 = c013c;
                    final C1207520hWo c1207520hWo2 = c1207520hWo;
                    c19514511WlLIZIZ.LIZJ.LIZ(new AbstractC838380Wui() { // from class: X.0hW9
                        @Override // X.AbstractC838380Wui
                        public final void LIZIZ(C19514611Wm c19514611Wm, C0HWO... c0hwoArr) {
                            new AwS147S0400000_18(c0hwoArr, c19514611Wm, c013c2, c1207520hWo2, 2).invoke();
                        }
                    });
                    final boolean z3 = zLIZLLL2;
                    final boolean z4 = zLIZLLL;
                    final C1206950hVt c1206950hVt = this;
                    final boolean z5 = z2;
                    final boolean z6 = zLJI;
                    final Activity activity2 = activity;
                    final C1207520hWo c1207520hWo3 = c1207520hWo;
                    final boolean z7 = z;
                    final InterfaceC1207030hW1 interfaceC1207030hW12 = interfaceC1207030hW1;
                    c19514511WlLIZIZ.LIZJ(new InterfaceC19515111Wr() { // from class: X.0hWB
                        @Override // X.InterfaceC19515111Wr
                        public final void onCanceled() {
                        }

                        @Override // X.InterfaceC19515111Wr
                        public final void LIZ(C0HWO... c0hwoArr) {
                            String str3;
                            boolean zLIZ;
                            String str4;
                            String str5;
                            String str6;
                            String str7;
                            final InterfaceC1207030hW1 interfaceC1207030hW13 = interfaceC1207030hW12;
                            final C20656615sK c20656615sK2 = c20656615sK;
                            InterfaceC1207030hW1 interfaceC1207030hW14 = new InterfaceC1207030hW1() { // from class: X.0hWE
                                @Override // X.InterfaceC1207030hW1
                                public final void LIZ() {
                                    InterfaceC1207030hW1 interfaceC1207030hW15 = interfaceC1207030hW13;
                                    if (interfaceC1207030hW15 != null) {
                                        interfaceC1207030hW15.LIZ();
                                    }
                                    c20656615sK2.LIZ();
                                }

                                @Override // X.InterfaceC1207030hW1
                                public final void LIZJ(int i) {
                                    InterfaceC1207030hW1 interfaceC1207030hW15 = interfaceC1207030hW13;
                                    if (interfaceC1207030hW15 != null) {
                                        interfaceC1207030hW15.LIZJ(i);
                                    }
                                    c20656615sK2.LIZ();
                                }

                                @Override // X.InterfaceC1207030hW1
                                public final void LIZIZ(int i, String str8) {
                                    InterfaceC1207030hW1 interfaceC1207030hW15 = interfaceC1207030hW13;
                                    if (interfaceC1207030hW15 != null) {
                                        interfaceC1207030hW15.LIZIZ(i, str8);
                                    }
                                    c20656615sK2.LIZ();
                                }
                            };
                            int length = c0hwoArr.length;
                            boolean zLIZ2 = false;
                            int i = 0;
                            while (true) {
                                str3 = null;
                                if (i < length) {
                                    C0HWO c0hwo = c0hwoArr[i];
                                    if (Intrinsics.LJFF(c0hwo.LIZ, "android.permission.ACCESS_COARSE_LOCATION")) {
                                        zLIZ = c0hwo.LIZ();
                                        break;
                                    }
                                    i++;
                                } else {
                                    zLIZ = false;
                                    break;
                                }
                            }
                            int length2 = c0hwoArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length2) {
                                    break;
                                }
                                C0HWO c0hwo2 = c0hwoArr[i2];
                                if (Intrinsics.LJFF(c0hwo2.LIZ, "android.permission.ACCESS_FINE_LOCATION")) {
                                    zLIZ2 = c0hwo2.LIZ();
                                    break;
                                }
                                i2++;
                            }
                            AwS70S0210000_18 awS70S0210000_18 = new AwS70S0210000_18(c1207520hWo3, zLIZ2, c1206950hVt, 6);
                            if (!z3 && z4) {
                                if (zLIZ && zLIZ2) {
                                    c1206950hVt.LIZIZ(true);
                                    interfaceC1207030hW14.LIZ();
                                    awS70S0210000_18.invoke(Boolean.TRUE);
                                    if (!z5) {
                                        C1198930hIx.LIZIZ.LJI(true);
                                        return;
                                    }
                                    return;
                                }
                                if (!z6) {
                                    if (zLIZ && !zLIZ2) {
                                        interfaceC1207030hW14.LIZJ(1);
                                    }
                                    awS70S0210000_18.invoke(Boolean.FALSE);
                                    if (z5) {
                                        return;
                                    }
                                    C1198930hIx.LIZIZ.LJI(true);
                                    return;
                                }
                                if (C786410Ut5.r4(activity2, "android.permission.ACCESS_FINE_LOCATION")) {
                                    C1207120hWA c1207120hWA = C1207120hWA.LIZ;
                                    C1207520hWo c1207520hWo4 = c1207520hWo3;
                                    if (c1207520hWo4 != null) {
                                        str6 = c1207520hWo4.LIZ;
                                        str7 = c1207520hWo4.LIZIZ;
                                        str3 = c1207520hWo4.LIZLLL;
                                    } else {
                                        str6 = null;
                                        str7 = null;
                                    }
                                    C1207120hWA.LJI(c1207120hWA, str6, str7, str3);
                                    interfaceC1207030hW14.LIZJ(1);
                                    awS70S0210000_18.invoke(Boolean.FALSE);
                                    if (z5) {
                                        return;
                                    }
                                    C1198930hIx.LIZIZ.LJI(true);
                                    return;
                                }
                                if (!z7) {
                                    return;
                                }
                                C1206950hVt c1206950hVt2 = c1206950hVt;
                                Activity activity3 = activity2;
                                C1207520hWo c1207520hWo5 = c1207520hWo3;
                                if (c1207520hWo5 != null) {
                                    str3 = c1207520hWo5.LIZ;
                                    str4 = c1207520hWo5.LIZIZ;
                                    str5 = c1207520hWo5.LIZLLL;
                                } else {
                                    str4 = null;
                                    str5 = null;
                                }
                                c1206950hVt2.LJJIJLIJ(activity3, str3, str4, interfaceC1207030hW14, str5);
                                if (z5) {
                                    return;
                                }
                                C1198930hIx.LIZIZ.LJI(true);
                            }
                        }
                    });
                }
            }, "location", new C1668306g5("local_permission_gps_general"));
            return;
        }
        C19514511Wl c19514511WlLIZIZ = C19514711Wn.LIZIZ.LIZIZ(activity, cert).LIZIZ("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        c19514511WlLIZIZ.LIZJ.LIZ(new AbstractC838380Wui() { // from class: X.0hVy
            @Override // X.AbstractC838380Wui
            public final void LIZIZ(C19514611Wm c19514611Wm, C0HWO... c0hwoArr) {
                new AwS147S0400000_18(c0hwoArr, c19514611Wm, c013c, c1207520hWo, 3).invoke();
            }
        });
        c19514511WlLIZIZ.LIZJ(new InterfaceC19515111Wr() { // from class: X.0hWC
            @Override // X.InterfaceC19515111Wr
            public final void onCanceled() {
            }

            @Override // X.InterfaceC19515111Wr
            public final void LIZ(C0HWO... c0hwoArr) {
                String str3;
                boolean zLIZ;
                String str4;
                String str5;
                String str6;
                String str7;
                InterfaceC1207030hW1 interfaceC1207030hW12;
                int length = c0hwoArr.length;
                boolean zLIZ2 = false;
                int i = 0;
                while (true) {
                    str3 = null;
                    if (i < length) {
                        C0HWO c0hwo = c0hwoArr[i];
                        if (Intrinsics.LJFF(c0hwo.LIZ, "android.permission.ACCESS_COARSE_LOCATION")) {
                            zLIZ = c0hwo.LIZ();
                            break;
                        }
                        i++;
                    } else {
                        zLIZ = false;
                        break;
                    }
                }
                int length2 = c0hwoArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    C0HWO c0hwo2 = c0hwoArr[i2];
                    if (Intrinsics.LJFF(c0hwo2.LIZ, "android.permission.ACCESS_FINE_LOCATION")) {
                        zLIZ2 = c0hwo2.LIZ();
                        break;
                    }
                    i2++;
                }
                AwS70S0210000_18 awS70S0210000_18 = new AwS70S0210000_18(c1207520hWo, zLIZ2, this, 7);
                if (!zLIZLLL2 && zLIZLLL) {
                    if (zLIZ && zLIZ2) {
                        this.LIZIZ(true);
                        InterfaceC1207030hW1 interfaceC1207030hW13 = interfaceC1207030hW1;
                        if (interfaceC1207030hW13 != null) {
                            interfaceC1207030hW13.LIZ();
                        }
                        awS70S0210000_18.invoke(Boolean.TRUE);
                        if (!z2) {
                            C1198930hIx.LIZIZ.LJI(true);
                            return;
                        }
                        return;
                    }
                    if (!zLJI) {
                        if (zLIZ && !zLIZ2 && (interfaceC1207030hW12 = interfaceC1207030hW1) != null) {
                            interfaceC1207030hW12.LIZJ(1);
                        }
                        awS70S0210000_18.invoke(Boolean.FALSE);
                        if (z2) {
                            return;
                        }
                        C1198930hIx.LIZIZ.LJI(true);
                        return;
                    }
                    if (C786410Ut5.r4(activity, "android.permission.ACCESS_FINE_LOCATION")) {
                        C1207120hWA c1207120hWA = C1207120hWA.LIZ;
                        C1207520hWo c1207520hWo2 = c1207520hWo;
                        if (c1207520hWo2 != null) {
                            str6 = c1207520hWo2.LIZ;
                            str7 = c1207520hWo2.LIZIZ;
                            str3 = c1207520hWo2.LIZLLL;
                        } else {
                            str6 = null;
                            str7 = null;
                        }
                        C1207120hWA.LJI(c1207120hWA, str6, str7, str3);
                        InterfaceC1207030hW1 interfaceC1207030hW14 = interfaceC1207030hW1;
                        if (interfaceC1207030hW14 != null) {
                            interfaceC1207030hW14.LIZJ(1);
                        }
                        awS70S0210000_18.invoke(Boolean.FALSE);
                        if (z2) {
                            return;
                        }
                        C1198930hIx.LIZIZ.LJI(true);
                        return;
                    }
                    if (!z) {
                        return;
                    }
                    C1206950hVt c1206950hVt = this;
                    Activity activity2 = activity;
                    C1207520hWo c1207520hWo3 = c1207520hWo;
                    if (c1207520hWo3 != null) {
                        str4 = c1207520hWo3.LIZ;
                        str5 = c1207520hWo3.LIZIZ;
                    } else {
                        str4 = null;
                        str5 = null;
                    }
                    InterfaceC1207030hW1 interfaceC1207030hW15 = interfaceC1207030hW1;
                    if (c1207520hWo3 != null) {
                        str3 = c1207520hWo3.LIZLLL;
                    }
                    c1206950hVt.LJJIJLIJ(activity2, str4, str5, interfaceC1207030hW15, str3);
                    if (z2) {
                        return;
                    }
                    C1198930hIx.LIZIZ.LJI(true);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT
    @InterfaceC1294060jmO
    public final void LIZJ(final String str, final String str2, final Activity activity, final AbstractC1201400hMw abstractC1201400hMw, final Cert cert, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final String str3) {
        if (C849850XVn.LIZIZ.LIZJ().LJJ("location")) {
            PopupManager.LJIJ(new C10GR() { // from class: X.0hW4
                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 210;
                }

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    C19FO c19fo;
                    Activity activity2 = activity;
                    if (!(activity2 instanceof C19EG) || (c19fo = (C19FO) activity2) == null) {
                        return null;
                    }
                    return new C688120Qyw(activity2, c19fo, null);
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    if (C294550Bgb.LIZ()) {
                        this.LL.LJJJ(str, str2, activity, cert, new AwS419S0200000_18(c20656615sK, (C20656615sK) function0, (Function0<Unit>) 123), new AwS419S0200000_18(c20656615sK, (C20656615sK) function03, (Function0<Unit>) 124), str3);
                    } else {
                        this.LL.LJJIZ(str, str2, activity, abstractC1201400hMw, cert, new AwS419S0200000_18(c20656615sK, (C20656615sK) function0, (Function0<Unit>) 125), new AwS419S0200000_18(c20656615sK, (C20656615sK) function02, (Function0<Unit>) 126), new AwS419S0200000_18(c20656615sK, (C20656615sK) function03, (Function0<Unit>) 127), str3);
                    }
                }
            }, "location", new C1668306g5("local_permission_gps_general"));
        } else if (C294550Bgb.LIZ()) {
            LJJJ(str, str2, activity, cert, function0, function03, str3);
        } else {
            LJJIZ(str, str2, activity, abstractC1201400hMw, cert, function0, function02, function03, str3);
        }
    }

    public final void LJJIZ(final String str, final String str2, final Activity activity, final AbstractC1201400hMw abstractC1201400hMw, Cert cert, final Function0<Unit> function0, final Function0<Unit> function02, Function0<Unit> function03, final String str3) {
        boolean z = true;
        if (abstractC1201400hMw != null && abstractC1201400hMw.LIZIZ()) {
            if (function03 != null) {
                function03.invoke();
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            z = false;
        }
        boolean zLJ = LJ(activity);
        if (z) {
            if (zLJ) {
                if (!LJJIJ()) {
                    LJJJIL(str, str3, str2, activity, abstractC1201400hMw, function0, function02);
                    return;
                } else if (LJJIJ()) {
                    if (function0 == null) {
                        return;
                    }
                    function0.invoke();
                    return;
                }
            }
            if (function03 == null) {
                return;
            }
            function03.invoke();
            return;
        }
        C19741112Lp.LIZ.getClass();
        boolean zLIZLLL = C19741112Lp.LIZLLL(activity, "android.permission.ACCESS_COARSE_LOCATION");
        if (zLJ && LJJIJ() && function0 != null) {
            function0.invoke();
        }
        if (!zLIZLLL) {
            if (function03 == null) {
                return;
            }
            function03.invoke();
        } else {
            if (zLJ) {
                if (LJJIJ()) {
                    return;
                }
                LJJJIL(str, str3, str2, activity, abstractC1201400hMw, function0, function02);
                return;
            }
            C19514711Wn.LIZIZ.LIZIZ(activity, cert).LIZIZ("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION").LIZJ(new InterfaceC19515111Wr() { // from class: X.0hVw
                @Override // X.InterfaceC19515111Wr
                public final void onCanceled() {
                }

                @Override // X.InterfaceC19515111Wr
                public final void LIZ(C0HWO... c0hwoArr) {
                    if (!this.LIZ.LJJIJ()) {
                        this.LIZ.LJJJIL(str, str3, str2, activity, abstractC1201400hMw, function0, function02);
                    }
                }
            });
        }
    }
}
