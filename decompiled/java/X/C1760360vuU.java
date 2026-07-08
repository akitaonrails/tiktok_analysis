package X;

import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vuU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760360vuU implements InterfaceC21200617xs {
    public static final Map<String, String> LIZLLL = C2097608Jq.LJIIJ(new Pair("enable_lynx_config", "1"), new Pair("enable_mts_module", "1"));
    public final C599380Nf6 LIZ;
    public InterfaceC1541990qEH LIZIZ;
    public EnumC1760390vuX LIZJ = EnumC1760390vuX.INIT;

    @Override // X.InterfaceC21200617xs
    public final View getView() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZIZ;
        if (interfaceC1541990qEH != null) {
            return interfaceC1541990qEH.e1();
        }
        return null;
    }

    @Override // X.InterfaceC21200617xs
    public final void hide() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZIZ;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.onHide();
        }
    }

    @Override // X.InterfaceC21200617xs
    public final void load() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZIZ;
        if (interfaceC1541990qEH == null || this.LIZJ != EnumC1760390vuX.CREATED) {
            return;
        }
        interfaceC1541990qEH.load();
    }

    @Override // X.InterfaceC21200617xs
    public final void show() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZIZ;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.onShow();
        }
    }

    @Override // X.InterfaceC21200617xs
    public final EnumC1760390vuX getStatus() {
        return this.LIZJ;
    }

    public C1760360vuU(C599380Nf6 c599380Nf6) {
        this.LIZ = c599380Nf6;
    }

    public static SparkContext LIZLLL(C1750060vds c1750060vds) {
        C1537910q7h c1537910q7h;
        String str = c1750060vds.LIZ;
        String str2 = c1750060vds.LIZIZ;
        Map<String, C1311220kE4> map = c1750060vds.LJFF;
        C1538140q84 c1538140q84 = C1538140q84.LIZ;
        C1538590q8n c1538590q8n = new C1538590q8n();
        c1538590q8n.LIZLLL = false;
        c1538590q8n.LJ = false;
        c1538590q8n.LJFF = false;
        c1538590q8n.LJI = true;
        SparkContext sparkContextLIZJ = c1538140q84.LIZJ(str, c1538590q8n);
        sparkContextLIZJ.bid = "astro_behavior_lynx";
        InterfaceC1531560pxS interfaceC1531560pxS = sparkContextLIZJ.hybridParams;
        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJJ(map);
        }
        if (str2 != null) {
            sparkContextLIZJ.lynxBuilderViewConfig = LIZLLL;
            sparkContextLIZJ.initData = str2;
        }
        sparkContextLIZJ.LJJJJZ(new C1776230wK5(2));
        return sparkContextLIZJ;
    }

    public static Map LJ(C1750060vds c1750060vds) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, c1750060vds.LIZJ.LIZ), new Pair("schema", c1750060vds.LIZ));
        Map<String, String> map = c1750060vds.LIZJ.LIZIZ;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                mapLJIIJ.put(entry.getKey(), entry.getValue());
            }
        }
        return mapLJIIJ;
    }

    @Override // X.InterfaceC21200617xs
    public final void LIZ(String str) {
        Object obj = this.LIZIZ;
        if (obj != null && (obj instanceof LynxView)) {
            ((LynxView) obj).reloadTemplate(TemplateData.LJIIIIZZ(str));
        }
    }

    @Override // X.InterfaceC21200617xs
    public final void LIZJ(String str) {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZIZ;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.U0(C2097608Jq.LJ());
            interfaceC1541990qEH.d1(str);
        }
    }

    @Override // X.InterfaceC21200617xs
    public final void LLD(boolean z) {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZIZ;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LLD(z);
        }
    }

    @Override // X.InterfaceC21200617xs
    public final View LIZIZ(Context context, final C1750060vds c1750060vds, final AbstractC1760410vuZ abstractC1760410vuZ) {
        InterfaceC1541990qEH interfaceC1541990qEHLIZIZ;
        SparkContext sparkContextLIZLLL;
        InterfaceC1531560pxS interfaceC1531560pxS;
        HybridSchemaParam hybridSchemaParamLIZJ;
        C1544610qIV c1544610qIV;
        C1075770e6J c1075770e6J;
        C1543410qGZ c1543410qGZLJIIJ;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZIZ;
        if (interfaceC1541990qEH != null) {
            return interfaceC1541990qEH.e1();
        }
        try {
            sparkContextLIZLLL = LIZLLL(c1750060vds);
            interfaceC1531560pxS = sparkContextLIZLLL.hybridParams;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(",errorReason:");
            sbLIZ.append(e.getMessage());
            abstractC1760410vuZ.LIZ(C2188811AlT.LIZIZ(sbLIZ), c1750060vds.LIZJ);
        }
        if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null) {
            interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParamLIZJ, sparkContextLIZLLL, context, new AbstractC1537870q7d() { // from class: X.0vuV
                @Override // X.AbstractC1537870q7d
                public final void LJLJJI() {
                    C599810Nfn.LIZ.getClass();
                    C599810Nfn.LIZ("SeaContentLynxCardContainer", "onPreKitCreate() called");
                }

                @Override // X.AbstractC1537870q7d
                public final void onDestroy() {
                    C599810Nfn.LIZ.getClass();
                    C599810Nfn.LIZ("SeaContentLynxCardContainer", "onDestroy() called");
                }

                @Override // X.AbstractC1537870q7d
                public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH2) {
                    AbstractC1760410vuZ abstractC1760410vuZ2;
                    C599810Nfn.LIZ.getClass();
                    C599810Nfn.LIZ("SeaContentLynxCardContainer", "onLoadFinish() called");
                    C1760360vuU c1760360vuU = this.LL;
                    if (c1760360vuU.LIZJ == EnumC1760390vuX.LOAD_SUCCESS && (abstractC1760410vuZ2 = abstractC1760410vuZ) != null) {
                        abstractC1760410vuZ2.LIZJ(c1750060vds.LIZJ, c1760360vuU);
                    }
                }

                @Override // X.AbstractC1537870q7d
                public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH2) {
                    C599810Nfn.LIZ.getClass();
                    C599810Nfn.LIZ("SeaContentLynxCardContainer", "onPostKitCreated() called");
                    C1760360vuU c1760360vuU = this.LL;
                    c1760360vuU.LIZJ = EnumC1760390vuX.CREATED;
                    c1760360vuU.LIZIZ = interfaceC1541990qEH2;
                    if (!c1750060vds.LIZLLL.isEmpty()) {
                        interfaceC1541990qEH2.U0(c1750060vds.LIZLLL);
                    }
                }

                @Override // X.AbstractC1537870q7d
                public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH2, String str) {
                    C599810Nfn.LIZ.getClass();
                    C599810Nfn.LIZ("SeaContentLynxCardContainer", "onLoadStart() called");
                    this.LL.LIZJ = EnumC1760390vuX.LOADING;
                    AbstractC1760410vuZ abstractC1760410vuZ2 = abstractC1760410vuZ;
                    if (abstractC1760410vuZ2 != null) {
                        abstractC1760410vuZ2.LIZIZ();
                    }
                }

                @Override // X.AbstractC1537870q7d
                public final void LJLJJL(String str, byte[] bArr) {
                    boolean z;
                    this.LL.LIZJ = EnumC1760390vuX.LOAD_SUCCESS;
                    C599810Nfn c599810Nfn = C599810Nfn.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onResourceLoadFinish.show lynx card,templateArray is null ");
                    if (bArr == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ2.append(z);
                    sbLIZ2.append(", baseUrl ");
                    sbLIZ2.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c599810Nfn.getClass();
                    C599810Nfn.LIZ("SeaContentLynxCardContainer", strLIZIZ);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super((Object) null);
                }

                @Override // X.AbstractC1537870q7d
                public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH2, String str, C1542120qEU c1542120qEU) {
                    C599810Nfn c599810Nfn = C599810Nfn.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onLoadFailed() called reason: ");
                    sbLIZ2.append(c1542120qEU.LIZIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c599810Nfn.getClass();
                    C599810Nfn.LIZ("SeaContentLynxCardContainer", strLIZIZ);
                    C599380Nf6 c599380Nf6 = this.LL.LIZ;
                    if (c599380Nf6 != null) {
                        EnumC599390Nf7 enumC599390Nf7 = EnumC599390Nf7.LOAD_ERROR;
                        String strLIZ = c1542120qEU.LIZ();
                        C1760360vuU c1760360vuU = this.LL;
                        C1750060vds c1750060vds2 = c1750060vds;
                        c1760360vuU.getClass();
                        c599380Nf6.LIZLLL(enumC599390Nf7, strLIZ, C1760360vuU.LJ(c1750060vds2));
                    }
                    this.LL.LIZJ = EnumC1760390vuX.LOAD_FAIL;
                    AbstractC1760410vuZ abstractC1760410vuZ2 = abstractC1760410vuZ;
                    if (abstractC1760410vuZ2 != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("errorCode:");
                        sbLIZ3.append(c1542120qEU.LIZ);
                        sbLIZ3.append(",errorReason:");
                        sbLIZ3.append(c1542120qEU.LIZIZ);
                        abstractC1760410vuZ2.LIZ(C2188811AlT.LIZIZ(sbLIZ3), c1750060vds.LIZJ);
                    }
                }
            });
            if (interfaceC1541990qEHLIZIZ != null) {
                Map<Class<?>, C1544630qIX<?>> map = c1750060vds.LJ;
                C1537480q70 hybridContext = interfaceC1541990qEHLIZIZ.getHybridContext();
                if (hybridContext != null && (c1075770e6J = (C1075770e6J) hybridContext.LJFF(C1075770e6J.class)) != null && (c1543410qGZLJIIJ = c1075770e6J.LJIIJ()) != null) {
                    c1544610qIV = c1543410qGZLJIIJ.LJ;
                } else {
                    c1544610qIV = null;
                }
                if ((c1544610qIV instanceof C1544610qIV) && map != null) {
                    c1544610qIV.LIZ.putAll(map);
                }
            }
        } else {
            C599380Nf6 c599380Nf6 = this.LIZ;
            if (c599380Nf6 != null) {
                c599380Nf6.LIZLLL(EnumC599390Nf7.CREATE_ERROR, "view = null", LJ(c1750060vds));
            }
            interfaceC1541990qEHLIZIZ = null;
        }
        this.LIZIZ = interfaceC1541990qEHLIZIZ;
        if (interfaceC1541990qEHLIZIZ == null) {
            return null;
        }
        return (View) interfaceC1541990qEHLIZIZ;
    }
}
