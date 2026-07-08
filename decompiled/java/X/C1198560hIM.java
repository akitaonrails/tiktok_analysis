package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS38S0310000_18;

/* JADX INFO: renamed from: X.0hIM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198560hIM {
    public static final C1198560hIM LIZ = new C1198560hIM();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(710));

    public static ILocationBaseServiceForMT LIZIZ() {
        return (ILocationBaseServiceForMT) LIZIZ.getValue();
    }

    public static boolean LIZ(Context context, TokenCert tokenCert) {
        EnumC1205470hTV enumC1205470hTVLIZ;
        if (C300190Bph.LIZ()) {
            ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
            if (iLocationServiceForLS != null) {
                enumC1205470hTVLIZ = iLocationServiceForLS.LIZ(context, tokenCert, "search_poi");
            } else {
                enumC1205470hTVLIZ = null;
            }
            if (enumC1205470hTVLIZ != EnumC1205470hTV.SUCCESS) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean LIZLLL(Context context, EnumC1198680hIY enumC1198680hIY) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        AbstractC1201400hMw abstractC1201400hMw;
        boolean z;
        boolean z2;
        boolean z3;
        ILocationBaseServiceForMT iLocationBaseServiceForMTLIZIZ = LIZIZ();
        Boolean boolValueOf4 = null;
        if (iLocationBaseServiceForMTLIZIZ != null) {
            boolValueOf = Boolean.valueOf(iLocationBaseServiceForMTLIZIZ.LJIIJ());
        } else {
            boolValueOf = null;
        }
        boolean zLJIILJJIL = C1189060h32.LJIILJJIL(boolValueOf);
        ILocationBaseServiceForMT iLocationBaseServiceForMTLIZIZ2 = LIZIZ();
        if (iLocationBaseServiceForMTLIZIZ2 != null) {
            boolValueOf2 = Boolean.valueOf(iLocationBaseServiceForMTLIZIZ2.LJJIJ());
        } else {
            boolValueOf2 = null;
        }
        boolean zLJIILJJIL2 = C1189060h32.LJIILJJIL(boolValueOf2);
        ILocationBaseServiceForMT iLocationBaseServiceForMTLIZIZ3 = LIZIZ();
        if (iLocationBaseServiceForMTLIZIZ3 != null) {
            boolValueOf3 = Boolean.valueOf(iLocationBaseServiceForMTLIZIZ3.LJ(context));
        } else {
            boolValueOf3 = null;
        }
        boolean zLJIILJJIL3 = C1189060h32.LJIILJJIL(boolValueOf3);
        ILocationBaseServiceForMT iLocationBaseServiceForMTLIZIZ4 = LIZIZ();
        if (iLocationBaseServiceForMTLIZIZ4 != null) {
            boolValueOf4 = Boolean.valueOf(iLocationBaseServiceForMTLIZIZ4.LJIILJJIL());
        }
        boolean zLJIILJJIL4 = C1189060h32.LJIILJJIL(boolValueOf4);
        if (zLJIILJJIL) {
            abstractC1201400hMw = C1198920hIw.LIZIZ;
        } else {
            abstractC1201400hMw = C1198910hIv.LIZIZ;
        }
        if ((zLJIILJJIL || !zLJIILJJIL2) && !abstractC1201400hMw.LIZIZ() && enumC1198680hIY != EnumC1198680hIY.POI_RE_TAG) {
            z = true;
        } else {
            z = false;
        }
        if (!C1198930hIx.LIZIZ.LIZIZ() && enumC1198680hIY != EnumC1198680hIY.POI_RE_TAG) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C1197440hGY.LIZIZ.LIZIZ() && enumC1198680hIY == EnumC1198680hIY.ADD_LOCATION) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!zLJIILJJIL4) {
            return z3;
        }
        if (!zLJIILJJIL3) {
            if (z || z2 || z3) {
                return true;
            }
            return false;
        }
        if (z || z3) {
            return true;
        }
        return false;
        return true;
    }

    public static void LIZJ(final Context context, Fragment fragment, final boolean z, String str, final Function2 function2) {
        String str2;
        String str3 = str;
        Activity activityLIZ = C06MM.LIZ(context);
        if (activityLIZ != null) {
            TokenCert tokenCertLJI = C1198600hIQ.LJI(z);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("promoteSystemPermission cert:");
            sbLIZ.append(tokenCertLJI);
            C2188811AlT.LIZIZ(sbLIZ);
            LIZ.getClass();
            ILocationBaseServiceForMT iLocationBaseServiceForMTLIZIZ = LIZIZ();
            if (iLocationBaseServiceForMTLIZIZ != null) {
                if (z) {
                    str2 = "click_show";
                } else {
                    str2 = "direct_show";
                }
                if (str3 == null) {
                    str3 = "video_post_page";
                }
                iLocationBaseServiceForMTLIZIZ.LJIL(activityLIZ, fragment, tokenCertLJI, new C1207520hWo("search_poi", str2, null, str3, false, false, null, null, null, 500), new InterfaceC1207170hWF() { // from class: X.0hIP
                    @Override // X.InterfaceC1207170hWF
                    public final void LIZ(C1208240hXy c1208240hXy) {
                    }

                    @Override // X.InterfaceC1207170hWF
                    public final void LIZIZ(C1208000hXa c1208000hXa) {
                        Boolean boolValueOf;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("promoteSystemPermission result :");
                        sbLIZ2.append(c1208000hXa.LIZ);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        int i = C1207240hWM.LIZ[c1208000hXa.LIZ.ordinal()];
                        boolean z2 = true;
                        if (i != 1) {
                            if (i != 2 && i != 3 && i != 4 && i != 5) {
                                return;
                            }
                            C1197730hH1 c1197730hH1 = C1197730hH1.LIZ;
                            Context context2 = context;
                            boolean z3 = z;
                            EnumC1207930hXT enumC1207930hXT = c1208000hXa.LIZ;
                            c1197730hH1.getClass();
                            c1197730hH1.LIZJ("poi_search_promote_precise_not_show", new AwS38S0310000_18(context2, z3, C1198600hIQ.LJI(z3), enumC1207930hXT, 2));
                            return;
                        }
                        Function2<Boolean, Boolean, Unit> function22 = function2;
                        C1207220hWK c1207220hWK = c1208000hXa.LIZJ;
                        if (c1207220hWK != null) {
                            boolValueOf = Boolean.valueOf(c1207220hWK.LIZIZ);
                        } else {
                            boolValueOf = null;
                        }
                        Boolean boolValueOf2 = Boolean.valueOf(C1189060h32.LJIILJJIL(boolValueOf));
                        C1207220hWK c1207220hWK2 = c1208000hXa.LIZJ;
                        if (c1207220hWK2 == null || c1207220hWK2.LIZ != 2) {
                            z2 = false;
                        }
                        function22.invoke(boolValueOf2, Boolean.valueOf(z2));
                    }
                });
            }
        }
    }
}
