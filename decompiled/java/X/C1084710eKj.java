package X;

import android.net.Uri;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.forestx.RequestParamsX;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0eKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1084710eKj {
    public static int LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static boolean LIZLLL;
    public static final List<String> LJ = new ArrayList();

    public final void LIZ() {
        if (LIZ != 0) {
            return;
        }
        LIZ = 2;
        C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0qXF
            /* JADX WARN: Multi-variable type inference failed */
            public final void LIZ() {
                Object c098200Yq;
                Uri uri;
                String path;
                List listLJJLIIIJILLIZJL;
                C1084710eKj c1084710eKj = this.LL;
                try {
                    String strLIZIZ = C1107580evc.LIZIZ(UriProtector.parse(C1152420g5w.LIZ.pageIntroCard));
                    int i = 1;
                    if (strLIZIZ != null && strLIZIZ.length() != 0) {
                        EnumC1533980q1M enumC1533980q1M = null;
                        Object[] objArr = 0;
                        if (strLIZIZ != null && (uri = UriProtector.parse(strLIZIZ)) != null && (path = uri.getPath()) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(path, new String[]{"/"}, 0, 6)) != null && !listLJJLIIIJILLIZJL.isEmpty() && listLJJLIIIJILLIZJL.size() >= 6) {
                            String str = (String) listLJJLIIIJILLIZJL.get(6);
                            if (str.length() != 0 && !C0KPJ.Ue.LIZIZ().equals(str)) {
                                if (C1535630q41.LJJIII) {
                                    C1532680pzG.LIZ.getClass();
                                    C1532950pzh c1532950pzh = C1532680pzG.LJJ;
                                    RequestParamsX requestParamsX = new RequestParamsX(null, null, 3, null);
                                    requestParamsX.channel = str;
                                    requestParamsX.bundle = a0.LJJLJLI(strLIZIZ, str, strLIZIZ);
                                    requestParamsX.source = "GamePartnershipGeckoHandler";
                                    c1532950pzh.LIZ(strLIZIZ, requestParamsX, new C1553740qXE(c1084710eKj, str));
                                } else {
                                    JSONArray jSONArray = C1533710q0v.LIZ;
                                    IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
                                    if (iResourceServiceXLIZIZ != null) {
                                        RequestParams requestParams = new RequestParams(enumC1533980q1M, i, objArr == true ? 1 : 0);
                                        requestParams.channel = str;
                                        iResourceServiceXLIZIZ.fetchResourceAsyncIfNeed(strLIZIZ, requestParams, new C1553760qXG(c1084710eKj, str));
                                    }
                                }
                            }
                        }
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C20441214yg.LJI("GamePartnershipGeckoHandler", thM5exceptionOrNullimpl);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GamePartnershipGeckoHandler@9165.tryPreDownloadGameCardLynxTemplate$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GamePartnershipGeckoHandler@9165.tryPreDownloadGameCardLynxTemplate$1");
            }
        });
    }

    public final void LIZIZ() {
        if (!LIZLLL) {
            ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).NP0("tiktok_live_interaction_cross_platform");
            LIZLLL = true;
        }
        if (LIZIZ != 0) {
            return;
        }
        LIZIZ = 2;
        C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0eKk
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GamePartnershipGeckoHandler@9165.updateAnchorGeckoChannel$1");
                try {
                    C1084710eKj c1084710eKj = this.LL;
                    C1084730eKl c1084730eKl = new C1084730eKl();
                    c1084710eKj.getClass();
                    C1084710eKj.LIZLLL("tiktok_live_interaction_gamepad", c1084730eKl, true);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GamePartnershipGeckoHandler@9165.updateAnchorGeckoChannel$1");
            }
        });
    }

    public final void LIZJ() {
        if (LIZJ != 0) {
            return;
        }
        LIZJ = 2;
        C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0eKh
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GamePartnershipGeckoHandler@9165.updateAudienceGeckoChannel$1");
                try {
                    C1084710eKj c1084710eKj = this.LL;
                    try {
                        C1084700eKi c1084700eKi = new C1084700eKi();
                        c1084710eKj.getClass();
                        C1084710eKj.LIZLLL("tiktok_live_interaction_gamepad_watch_live", c1084700eKi, false);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GamePartnershipGeckoHandler@9165.updateAudienceGeckoChannel$1");
            }
        });
    }

    public static void LIZLLL(final String str, final Function0 function0, final boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check update : ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("GamePartnershipGeckoHandler", C2188811AlT.LIZIZ(sbLIZ));
        IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        final boolean zU61 = iHostResource.u61(str);
        ArrayList arrayList = (ArrayList) LJ;
        if (!arrayList.contains(str)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(zU61);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_partnership_gecko_exist");
            c474500IjALIZ.LJJII(str, "channel");
            c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0), "is_anchor");
            c474500IjALIZ.LJJII(boolValueOf2, "gecko_exist");
            c474500IjALIZ.LIZ();
            arrayList.add(str);
        }
        iHostResource.nd1(new AbstractC1552040qUU() { // from class: X.0eKn
            @Override // X.AbstractC1552040qUU
            public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("check update : ");
                sbLIZ2.append(str);
                sbLIZ2.append("   onLocalNewestVersion");
                C20441214yg.LJ("GamePartnershipGeckoHandler", C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                String message;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("check update : ");
                sbLIZ2.append(str);
                sbLIZ2.append("   onUpdateFailed");
                C20441214yg.LJ("GamePartnershipGeckoHandler", C2188811AlT.LIZIZ(sbLIZ2));
                String str2 = str;
                Boolean bool = Boolean.FALSE;
                Boolean boolValueOf3 = Boolean.valueOf(z);
                if (th == null || (message = th.getMessage()) == null) {
                    message = "";
                }
                C1878360yyo.LJI(bool, str2, message, boolValueOf3, Boolean.valueOf(zU61));
                if (!zU61) {
                    function0.invoke();
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIL(long j, UpdatePackage updatePackage) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("check update : ");
                sbLIZ2.append(str);
                sbLIZ2.append("   onUpdateSuccess");
                C20441214yg.LJ("GamePartnershipGeckoHandler", C2188811AlT.LIZIZ(sbLIZ2));
                C1878360yyo.LJI(Boolean.TRUE, str, "", Boolean.valueOf(z), Boolean.valueOf(zU61));
            }
        }, str);
    }
}
