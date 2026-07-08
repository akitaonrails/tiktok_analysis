package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import jv6.a;
import kotlin.jvm.internal.AwS24S1110000_30;

/* JADX INFO: renamed from: X.145T, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C145T {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        return C1798550wu5.LIZIZ.isInitialized();
    }

    public static int LIZ(Context context) {
        return C1798550wu5.LIZIZ.LJIIIZ(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.145V, java.lang.Object] */
    public static void LIZIZ(final Context context, final C145Y c145y) {
        boolean z;
        C145W.LIZ.getClass();
        IPluginService iPluginService = C145W.LIZIZ;
        if (iPluginService != null) {
            iPluginService.LJ();
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            c145y.LIZ(4001, "com.ss.android.ugc.aweme.df_location", true);
            return;
        }
        if (iPluginService != null && iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_location")) {
            c145y.LIZJ("com.ss.android.ugc.aweme.df_location", true);
            return;
        }
        final ?? r4 = new C145Y() { // from class: X.145V
            @Override // X.C145Y
            public final void LIZJ(String str, boolean z2) {
                C145W c145w = C145W.LIZ;
                Context context2 = context;
                c145w.getClass();
                IPluginService iPluginService2 = C145W.LIZIZ;
                if (iPluginService2 != null && iPluginService2.LIZLLL() != null) {
                    a.install(context2);
                }
                c145y.LIZJ(str, z2);
            }

            @Override // X.C145Y
            public final void LIZ(int i, String str, boolean z2) {
                c145y.LIZ(i, str, z2);
            }
        };
        C844020X9c c844020X9c = new C844020X9c();
        c844020X9c.LIZ = "com.ss.android.ugc.aweme.df_location";
        c844020X9c.LIZIZ = true;
        c844020X9c.LIZJ = false;
        c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.145U
            @Override // X.InterfaceC842850X4p
            public final void LIZJ(String str, boolean z2) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("install onSuccess >>packageName ");
                sbLIZ.append(str);
                sbLIZ.append("  listener>>");
                sbLIZ.append(r4);
                C2188811AlT.LIZIZ(sbLIZ);
                C145W.LIZ.getClass();
                C0P5E.LIZ(new AwS24S1110000_30(r4, str, z2, 1));
            }

            @Override // X.InterfaceC842850X4p
            public final void LIZ(int i, String str, boolean z2) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("install onFailed >>packageName ");
                sbLIZ.append(str);
                sbLIZ.append("  >> reason ");
                sbLIZ.append(i);
                sbLIZ.append("  listener>>");
                sbLIZ.append(r4);
                C2188811AlT.LIZIZ(sbLIZ);
                C145W.LIZ.getClass();
                C0P5E.LIZ(new C145X(r4, str, z2, i));
            }
        };
        AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
        anonymousClass1403.LJII = EnumC202055144f.APPEND;
        c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
        C202068144s c202068144s = new C202068144s(c844020X9c);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start install >>packageName ");
        sbLIZ.append("com.ss.android.ugc.aweme.df_location");
        sbLIZ.append("  listener>>");
        sbLIZ.append((Object) r4);
        C2188811AlT.LIZIZ(sbLIZ);
        if (iPluginService == null) {
            return;
        }
        iPluginService.LJJI(c202068144s);
    }
}
