package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import jv6.a;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0X4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842820X4m {
    public static final C842820X4m LIZ = new C842820X4m();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(307));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4907));

    public static void LIZLLL() {
        Context contextLIZ;
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF == null || (contextLIZ = abstractC1387200mCcLJFF.LIZIZ()) == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        C01GW<C0XA3> c01gw = C0XA3.LIZIZ;
        C842840X4o.LIZ().LJFF(contextLIZ.getString(2131848597));
    }

    public static void LIZIZ(C842790X4j c842790X4j, InterfaceC842850X4p interfaceC842850X4p) {
        if (PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null) == null) {
            if (c842790X4j.LIZLLL) {
                LIZLLL();
            }
            interfaceC842850X4p.LIZ(1, "", false);
        } else {
            if (c842790X4j.LIZIZ) {
                C842860X4q c842860X4q = C842860X4q.LIZ;
                String str = c842790X4j.LIZ;
                c842860X4q.getClass();
                C842860X4q.LIZ(str);
            }
            LIZ(1, interfaceC842850X4p, c842790X4j);
        }
    }

    public static void LIZJ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("description", str2);
        ((Keva) LIZJ.getValue()).storeString("kids_df_load", c2344009Gk.LIZ.toString());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0X4l] */
    public static void LIZ(final int i, final InterfaceC842850X4p interfaceC842850X4p, final C842790X4j c842790X4j) {
        String str = c842790X4j.LIZ;
        boolean z = c842790X4j.LJFF;
        final ?? r3 = new InterfaceC842850X4p() { // from class: X.0X4l
            @Override // X.InterfaceC842850X4p
            public final void LIZJ(String str2, boolean z2) {
                InterfaceC842850X4p interfaceC842850X4p2 = interfaceC842850X4p;
                if (interfaceC842850X4p2 != null) {
                    interfaceC842850X4p2.LIZJ(str2, z2);
                }
            }

            @Override // X.InterfaceC842850X4p
            public final void LIZ(int i2, String str2, boolean z2) {
                C842790X4j c842790X4j2 = c842790X4j;
                if (c842790X4j2.LIZJ && i < c842790X4j2.LJ) {
                    C23250099c.LIZLLL(C842820X4m.LIZIZ, null, null, new C319460Cfg(c842790X4j2, interfaceC842850X4p, i, null), 3);
                    return;
                }
                if (c842790X4j2.LIZLLL) {
                    C842820X4m.LIZ.getClass();
                    C842820X4m.LIZLLL();
                }
                InterfaceC842850X4p interfaceC842850X4p2 = interfaceC842850X4p;
                if (interfaceC842850X4p2 != null) {
                    interfaceC842850X4p2.LIZ(i2, str2, z2);
                }
            }
        };
        C844470XAv.LIZ.getClass();
        final Context contextLIZ = C844470XAv.LIZ();
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService == null) {
            r3.LIZ(1, "", false);
            return;
        }
        if (iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_kids_mode")) {
            a.install(contextLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("from: ");
            sbLIZ.append(str);
            LIZJ("onExist", C2188811AlT.LIZIZ(sbLIZ));
            r3.LIZJ("com.ss.android.ugc.aweme.df_kids_mode", true);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("from: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", first_install: ");
        sbLIZ2.append(((Boolean) LIZLLL.getValue()).booleanValue());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        C844020X9c c844020X9c = new C844020X9c();
        c844020X9c.LIZIZ = z;
        c844020X9c.LIZ = "com.ss.android.ugc.aweme.df_kids_mode";
        c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.0X4n
            @Override // X.InterfaceC842850X4p
            public final void LIZJ(String str2, boolean z2) {
                String str3;
                a.install(contextLIZ);
                C842820X4m c842820X4m = C842820X4m.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(", pkg=");
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                sbLIZ3.append(str3);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                c842820X4m.getClass();
                C842820X4m.LIZJ("onSuccess", strLIZIZ2);
                r3.LIZJ(str2, z2);
            }

            @Override // X.InterfaceC842850X4p
            public final void LIZ(int i2, String str2, boolean z2) {
                String str3;
                C842820X4m c842820X4m = C842820X4m.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(", pkg=");
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                sbLIZ3.append(str3);
                sbLIZ3.append(", reason=");
                sbLIZ3.append(i2);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                c842820X4m.getClass();
                C842820X4m.LIZJ("onFailed", strLIZIZ2);
                r3.LIZ(i2, str2, z2);
            }
        };
        iPluginService.LJJI(new C202068144s(c844020X9c));
    }
}
