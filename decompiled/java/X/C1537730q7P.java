package X;

import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.base.TraceEvent;
import java.nio.ByteBuffer;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0q7P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537730q7P implements InterfaceC1538750q93<C1537720q7O> {
    public final EnumC1067640dtC LIZ = EnumC1067640dtC.LYNX;

    @Override // X.InterfaceC1538750q93
    public final EnumC1067640dtC getViewType() {
        return this.LIZ;
    }

    /* JADX WARN: Type inference failed for: r2v38, types: [X.09AY, kotlin.jvm.functions.Function1] */
    @Override // X.InterfaceC1538750q93
    public final InterfaceC1541990qEH LIZ(HybridSchemaParam hybridSchemaParam, C1537480q70 c1537480q70, Context context, AbstractC1537870q7d abstractC1537870q7d) {
        Object obj;
        Uri uri;
        EnumC1067640dtC type;
        C1299620jvM c1299620jvM;
        C1299620jvM c1299620jvM2;
        EnumC1067640dtC type2;
        EnumC1067640dtC type3;
        C1536660q5g c1536660q5g = C1536660q5g.LIZ;
        c1536660q5g.LIZ();
        C1537810q7X c1537810q7XLIZLLL = C1537540q76.LIZLLL(c1537480q70);
        int i = 0;
        c1537810q7XLIZLLL.LIZJ = Long.valueOf(C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.LYNX_VIEW_INIT_END, EnumC1537220q6a.SPARK_PREPARE_INNER_START}, Long.valueOf(System.currentTimeMillis())));
        c1537810q7XLIZLLL.LJIIIZ = Long.valueOf(C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_GLOBAL_PROPS_START}, null));
        C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
        C1326430kcb.LIZ().LIZJ(context, c1537480q70);
        C1529830puf c1529830puf = C1537480q70.Companion;
        String str = c1537480q70.containerId;
        c1529830puf.getClass();
        C1529830puf.LIZJ(c1537480q70, str);
        if (C08RQ.LIZJ(c1537480q70.containerId).containsKey("ab_params")) {
            C1326430kcb.LIZ().LIZLLL(c1537480q70.containerId);
        } else {
            LruCache<String, C1536930q67> lruCache = C1536910q65.LIZ;
            C1536930q67 c1536930q67LIZIZ = C1536910q65.LIZIZ(c1537480q70.LJIJI());
            if ((c1536930q67LIZIZ != null || (c1536930q67LIZIZ = C1536910q65.LIZ(c1537480q70.LJIJI())) != null) && (obj = c1536930q67LIZIZ.LIZLLL) != null) {
                C1326430kcb.LIZ().LJ(c1537480q70.containerId, C2097908Jt.LIZJ(new Pair("abParams", obj)));
            }
        }
        c1537810q7XLIZLLL.LJIIJ = Long.valueOf(C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_GLOBAL_PROPS_END}, null));
        String url = hybridSchemaParam.getUrl();
        if (url != null && url.length() != 0) {
            uri = UriProtector.parse(hybridSchemaParam.getUrl());
        } else {
            uri = UriProtector.parse(hybridSchemaParam.getSurl());
        }
        if (uri.isOpaque()) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri);
            sbLIZ.append(" isn't a hierarchical URI.");
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "LiteLynxKitViewProvider");
            return null;
        }
        EnumC1067640dtC enumC1067640dtC = this.LIZ;
        InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
        if (interfaceC1531560pxS != null) {
            type = interfaceC1531560pxS.getType();
        } else {
            type = null;
        }
        String str2 = "";
        if (enumC1067640dtC == type) {
            C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_COMPONENT_START}, null);
            C1537540q76.LIZ(c1537480q70, hybridSchemaParam);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1537790q7V c1537790q7V = new C1537790q7V(c1537480q70, abstractC1537870q7d);
            c1537480q70.LJJIJ(jCurrentTimeMillis);
            if (c1537480q70.usePreload) {
                InterfaceC1531560pxS interfaceC1531560pxS2 = c1537480q70.hybridParams;
                if (interfaceC1531560pxS2 != null) {
                    interfaceC1531560pxS2.LIZLLL(C2097908Jt.LIZJ(new Pair("usePreload", "1")));
                }
                i = 2;
            }
            C1536670q5h.LIZ.getClass();
            if (!C1536670q5h.LIZJ) {
                c1536660q5g.LIZLLL(null);
                String str3 = c1537480q70.containerId;
                String str4 = c1537480q70.vaid;
                if (str4 != null) {
                    str2 = str4;
                }
                C1520080pew.LJ(null, str3, new C1520180pf6(101, "lynxKit not inited, please trigger HybridKit.initLynxKit() at first", str2));
                C1490740otc.LIZ.LIZ("lynxKit not inited, please trigger HybridKit.initLynxKit() at first", EnumC1490770otf.E, "LiteLynxKitViewProvider");
            }
            C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.PARSE_SCHEMA_START}, null);
            C1537910q7h c1537910q7h = (C1537910q7h) c1537480q70.hybridParams;
            C1538000q7q.LIZ(c1537910q7h, hybridSchemaParam);
            C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.PARSE_SCHEMA_END}, null);
            if (c1537910q7h.LJIILJJIL() == null) {
                c1537910q7h.LJJIFFI((byte[]) c1537480q70.LJFF(byte[].class));
            }
            if (c1537910q7h.LJIILL() == null) {
                c1537910q7h.LJJII((ByteBuffer) c1537480q70.LJFF(ByteBuffer.class));
            }
            if (c1537910q7h.LJIILLIIL() == null) {
                c1537910q7h.LJJIII((TemplateBundle) c1537480q70.LJFF(TemplateBundle.class));
            }
            TraceEvent.LIZLLL("CreateLynxView");
            c1537810q7XLIZLLL.LIZIZ = Long.valueOf(C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.LYNX_VIEW_INIT_START}, null));
            c1537790q7V.LJLJJI();
            AbstractC1538740q92 abstractC1538740q92 = (AbstractC1538740q92) c1537480q70.LJFF(AbstractC1538740q92.class);
            if (abstractC1538740q92 != null) {
                do {
                    abstractC1538740q92.LJLJJI();
                    abstractC1538740q92 = abstractC1538740q92.LL;
                } while (abstractC1538740q92 != null);
            }
            c1537910q7h.LJJJ = (LynxBackgroundRuntime) c1537480q70.LJFF(LynxBackgroundRuntime.class);
            c1537480q70.LJJIII(LynxBackgroundRuntime.class);
            c1537480q70.LJJIII(C1538540q8i.class);
            C1537890q7f c1537890q7f = C1537890q7f.LIZ;
            String string = uri.toString();
            c1537890q7f.getClass();
            C1309760kBi c1309760kBiLIZJ = C1537890q7f.LIZJ(c1537910q7h, c1537480q70, context, string);
            C1312970kGt c1312970kGt = c1537480q70.lynxViewGroupWrapper;
            if (c1312970kGt != null) {
                c1299620jvM = c1312970kGt.LIZJ;
            } else {
                c1299620jvM = null;
            }
            c1309760kBiLIZJ.LJJIJIIJIL = c1299620jvM;
            C1490740otc c1490740otc2 = C1490740otc.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createKitView url: ");
            sbLIZ2.append(uri);
            sbLIZ2.append(", lynxViewGroup: ");
            C1312970kGt c1312970kGt2 = c1537480q70.lynxViewGroupWrapper;
            if (c1312970kGt2 != null) {
                c1299620jvM2 = c1312970kGt2.LIZJ;
            } else {
                c1299620jvM2 = null;
            }
            sbLIZ2.append(c1299620jvM2);
            C1490740otc.LIZIZ(c1490740otc2, C2188811AlT.LIZIZ(sbLIZ2), null, "Embed", 2);
            c1537810q7XLIZLLL.LIZLLL = Long.valueOf(C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.CUSTOM_INIT_START}, null));
            ?? r2 = c1537910q7h.LJJII;
            if (r2 != 0) {
                r2.invoke(c1309760kBiLIZJ);
            }
            c1537810q7XLIZLLL.LJ = Long.valueOf(C1530570pvr.LIZJ(c1537480q70, new EnumC1537220q6a[]{EnumC1537220q6a.CUSTOM_INIT_END}, null));
            C1294080jmQ.LIZ.LIZ(c1309760kBiLIZJ);
            C1537720q7O c1537720q7O = new C1537720q7O(context, c1537480q70, c1309760kBiLIZJ, c1537910q7h, c1537790q7V);
            TraceEvent.LJII("CreateLynxView");
            AbstractC1537870q7d lynxKitLifeCycle = c1537720q7O.getLynxKitLifeCycle();
            if (lynxKitLifeCycle != null) {
                lynxKitLifeCycle.LJLILLLLZI();
            }
            AbstractC1537870q7d lynxKitLifeCycle2 = c1537720q7O.getLynxKitLifeCycle();
            if (lynxKitLifeCycle2 != null) {
                lynxKitLifeCycle2.LJLJI(c1537720q7O);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("createLynxView cost: ");
            sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis);
            c1490740otc2.LIZ(C2188811AlT.LIZIZ(sbLIZ3), EnumC1490770otf.I, "LiteLynxKitViewProvider");
            C1529360ptu c1529360ptu = C1529360ptu.LIZ;
            C1521530phH c1521530phH = new C1521530phH(c1537480q70.bid, new C1520400pfS());
            c1521530phH.LIZIZ = true;
            c1521530phH.LIZLLL = c1537480q70.vaid;
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor.INSTANCE.registerLynxViewMonitor(c1537720q7O, c1521530phH);
            c1537480q70.LJIIIZ().LIZJ("spark_scene", Integer.valueOf(i));
            return c1537720q7O;
        }
        String str5 = c1537480q70.containerId;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Type ");
        InterfaceC1531560pxS interfaceC1531560pxS3 = c1537480q70.hybridParams;
        if (interfaceC1531560pxS3 != null) {
            type2 = interfaceC1531560pxS3.getType();
        } else {
            type2 = null;
        }
        sbLIZ4.append(type2);
        sbLIZ4.append(" not support");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        String str6 = c1537480q70.vaid;
        if (str6 != null) {
            str2 = str6;
        }
        C1520080pew.LJ(null, str5, new C1520180pf6(103, strLIZIZ, str2));
        C1490740otc c1490740otc3 = C1490740otc.LIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("Type ");
        InterfaceC1531560pxS interfaceC1531560pxS4 = c1537480q70.hybridParams;
        if (interfaceC1531560pxS4 != null) {
            type3 = interfaceC1531560pxS4.getType();
        } else {
            type3 = null;
        }
        sbLIZ5.append(type3);
        sbLIZ5.append(" not support");
        C1490740otc.LIZIZ(c1490740otc3, C2188811AlT.LIZIZ(sbLIZ5), null, null, 6);
        return null;
    }
}
