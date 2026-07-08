package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.tools.integration.plugin.album.CreationAlbumPlatformPluginBridgeService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import jv6.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13zW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20191613zW {
    public static final C20191613zW LIZ = new C20191613zW();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(240));
    public static volatile EnumC19508611Ue LIZJ;
    public static final AFwS219S0000000_30 LIZLLL;

    static {
        LIZJ = EnumC19508611Ue.UNKNOWN;
        if (LIZJ()) {
            LIZJ = EnumC19508611Ue.INSTALLED;
        }
        LIZLLL = AFwS219S0000000_30.get$arr$(239);
    }

    public static boolean LIZJ() {
        Object c098200Yq;
        boolean zCheckPluginInstalled = ((IPluginService) LIZIZ.getValue()).checkPluginInstalled("com.ss.android.ugc.aweme.df_camera");
        C554740LpI c554740LpI = C554740LpI.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEPluginManager checkPluginInstalled ");
        sbLIZ.append(zCheckPluginInstalled);
        C201955140j.LIZJ(c554740LpI, C2188811AlT.LIZIZ(sbLIZ));
        if (!zCheckPluginInstalled) {
            try {
                c098200Yq = Class.forName("com.ss.android.ugc.aweme.tools.aab.CameraDFInternalServiceImpl");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            if (c098200Yq == null) {
                C201955140j.LIZJ(C554740LpI.LIZIZ, "VEPluginManager CameraDFInternalServiceImpl not exists");
                return false;
            }
            C201955140j.LIZJ(C554740LpI.LIZIZ, "VEPluginManager CameraDFInternalServiceImpl exists");
        }
        C20129613pW.LIZ.set(true);
        return true;
    }

    public static void LIZIZ(Context context) {
        if (context != null) {
            a.install(context);
        } else {
            C844470XAv.LIZ.getClass();
            a.install(C844470XAv.LIZ());
        }
        for (Activity activity : ActivityStack.getActivityStack()) {
            a.LIZLLL(activity);
        }
        LIZJ = EnumC19508611Ue.INSTALLED;
        CreationAlbumPlatformPluginBridgeService.LIZ.getClass();
        if (PluggableExtentionKt.pluggableSpi$default(CreationAlbumPlatformPluginBridgeService.class, false, false, false, 14, null) == null) {
            ServiceManager.get().bind(CreationAlbumPlatformPluginBridgeService.class, new ServiceProvider() { // from class: X.04n2
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    Object c098200Yq;
                    try {
                        Object objNewInstance = Class.forName("com.ss.android.ugc.aweme.tools.integration.plugin.album.CreationAlbumPlatformPluginBridgeServiceImpl").newInstance();
                        c098200Yq = objNewInstance instanceof CreationAlbumPlatformPluginBridgeService ? (CreationAlbumPlatformPluginBridgeService) objNewInstance : null;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        return null;
                    }
                    return c098200Yq;
                }
            }).asSingleton();
        }
    }

    public static void LIZ(final Context context, boolean z, final Function0 function0) {
        if (LIZJ == EnumC19508611Ue.INSTALLED) {
            function0.invoke();
            return;
        }
        if (LIZJ()) {
            LIZJ = EnumC19508611Ue.DOWNLOADED;
            LIZIZ(context);
            function0.invoke();
            return;
        }
        LIZJ = EnumC19508611Ue.DOWNLOADING;
        C844020X9c c844020X9c = new C844020X9c();
        c844020X9c.LIZ = "com.ss.android.ugc.aweme.df_camera";
        c844020X9c.LIZIZ = z;
        AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
        anonymousClass1403.LJIIIZ = false;
        c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
        c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.13zS
            @Override // X.InterfaceC842850X4p
            public final void LIZJ(String str, boolean z2) {
                Context contextLIZ = context;
                if (contextLIZ == null) {
                    C844470XAv.LIZ.getClass();
                    contextLIZ = C844470XAv.LIZ();
                }
                a.install(contextLIZ);
                C20191613zW.LIZ.getClass();
                if (C20191613zW.LIZJ()) {
                    C554740LpI c554740LpI = C554740LpI.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("VEPluginManager download: onSuccess, packageName: ");
                    sbLIZ.append(str);
                    C201955140j.LIZJ(c554740LpI, C2188811AlT.LIZIZ(sbLIZ));
                    C20191613zW.LIZJ = EnumC19508611Ue.DOWNLOADED;
                    C20191613zW.LIZIZ(context);
                    function0.invoke();
                    return;
                }
                C201955140j.LIZJ(C554740LpI.LIZIZ, "VEPluginManager downloaded but plugin is not found");
                C20191613zW.LIZJ = EnumC19508611Ue.UNKNOWN;
            }

            @Override // X.InterfaceC842850X4p
            public final void LIZ(int i, String str, boolean z2) {
                C554740LpI c554740LpI = C554740LpI.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VEPluginManager download: onFailed, isSilent: ");
                sbLIZ.append(z2);
                sbLIZ.append(", reason: ");
                sbLIZ.append(i);
                C201955140j.LIZJ(c554740LpI, C2188811AlT.LIZIZ(sbLIZ));
                C20191613zW c20191613zW = C20191613zW.LIZ;
                C20191613zW.LIZJ = EnumC19508611Ue.UNKNOWN;
            }
        };
        ((IPluginService) LIZIZ.getValue()).LJJI(new C202068144s(c844020X9c));
    }
}
