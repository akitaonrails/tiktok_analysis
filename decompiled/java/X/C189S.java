package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.189S, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C189S {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final C1537720q7O LIZJ;
    public final SparkContext LIZLLL;
    public C1898607c8 LJ;
    public final C189R LJFF;

    public final void LIZ() {
        C1537910q7h c1537910q7h;
        this.LIZJ.LLD(true);
        InterfaceC1531560pxS interfaceC1531560pxS = this.LIZLLL.hybridParams;
        if ((interfaceC1531560pxS instanceof C1537830q7Z) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList = c1537910q7h.LJJJIL;
            if (copyOnWriteArrayList.contains(this.LJFF)) {
                copyOnWriteArrayList.remove(this.LJFF);
            }
        }
        this.LJ = null;
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        this.LIZJ.LIZ(str, jSONObject);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.189R] */
    public C189S(Context context, Aweme aweme, String str) {
        C1537720q7O c1537720q7O;
        this.LIZ = context;
        this.LIZIZ = aweme;
        C1538140q84 c1538140q84 = C1538140q84.LIZ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        C1538590q8n c1538590q8n = new C1538590q8n();
        c1538590q8n.LJFF = false;
        c1538590q8n.LJI = false;
        c1538590q8n.LIZLLL = false;
        c1538590q8n.LJ = false;
        c1538590q8n.LIZIZ = false;
        c1538590q8n.LIZ = true;
        c1538590q8n.LJIIIIZZ = true;
        C1538140q84.LIZIZ(c1538140q84, sparkContext, c1538590q8n, 4);
        this.LIZLLL = sparkContext;
        InterfaceC1541990qEH interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(new HybridSchemaParam(null, 1, null), this.LIZLLL, this.LIZ, new AbstractC1537870q7d() { // from class: X.189Q
            {
                super((Object) null);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str2, C1542120qEU c1542120qEU) {
                int iIntValue;
                String aid;
                Integer num = c1542120qEU.LIZ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[hybridKit_onLoadFailed] url=");
                sbLIZ.append(str2);
                sbLIZ.append(", errorCode=");
                sbLIZ.append(iIntValue);
                sbLIZ.append(", reason=");
                sbLIZ.append(c1542120qEU.LIZIZ);
                sbLIZ.append(", loadErrorInfo=");
                sbLIZ.append(this.LL.LJ);
                sbLIZ.append(", aid=");
                Aweme aweme2 = this.LL.LIZIZ;
                String aid2 = null;
                if (aweme2 != null) {
                    aid2 = aweme2.getAid();
                }
                sbLIZ.append(aid2);
                C2188811AlT.LIZIZ(sbLIZ);
                if (!((Boolean) C298280Bmc.LIZIZ.getValue()).booleanValue()) {
                    return;
                }
                C189S c189s = this.LL;
                if (c189s.LJ != null) {
                    return;
                }
                c189s.LJ = new C1898607c8("load_failed", iIntValue, c1542120qEU.LIZIZ);
                Aweme aweme3 = c189s.LIZIZ;
                if (aweme3 == null || (aid = aweme3.getAid()) == null) {
                    aid = "";
                }
                if (aid.length() > 0) {
                    C1440005kM.LIZ(new C1361880lXm(iIntValue, this.LL.LIZIZ, "load_failed", c1542120qEU.LIZIZ));
                }
            }
        });
        if ((interfaceC1541990qEHLIZIZ instanceof C1537720q7O) && (c1537720q7O = (C1537720q7O) interfaceC1541990qEHLIZIZ) != null) {
            this.LIZJ = c1537720q7O;
            this.LJFF = new LynxViewClient() { // from class: X.189R
                @Override // com.lynx.tasm.LynxViewClient
                public final void LJIIJ() {
                    C725770SdT c725770SdT = (C725770SdT) this.LL.LIZLLL.LJFF(C725770SdT.class);
                    if (c725770SdT != null) {
                        c725770SdT.LIZ.invoke(Long.valueOf(System.currentTimeMillis() - c725770SdT.LIZJ));
                    }
                }

                @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
                public final void LJFF(LynxError lynxError) {
                    Integer numValueOf;
                    Integer numValueOf2;
                    String str2;
                    String strLIZJ;
                    String strLIZLLL;
                    String aid;
                    int iLIZIZ;
                    String strLIZJ2;
                    String aid2;
                    Function1<String, Unit> function1;
                    Integer numValueOf3;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[onReceivedError] code=");
                    String strLIZJ3 = null;
                    if (lynxError != null) {
                        numValueOf = Integer.valueOf(lynxError.LIZIZ());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(", subCode=");
                    if (lynxError != null) {
                        numValueOf2 = Integer.valueOf(lynxError.LIZJ);
                    } else {
                        numValueOf2 = null;
                    }
                    sbLIZ.append(numValueOf2);
                    sbLIZ.append(", level=");
                    if (lynxError != null) {
                        str2 = lynxError.LJIIIZ;
                    } else {
                        str2 = null;
                    }
                    sbLIZ.append(str2);
                    sbLIZ.append(", msg=");
                    if (lynxError != null) {
                        strLIZJ = lynxError.LIZJ();
                    } else {
                        strLIZJ = null;
                    }
                    sbLIZ.append(strLIZJ);
                    sbLIZ.append(", rootCause=");
                    if (lynxError != null) {
                        strLIZLLL = lynxError.LIZLLL();
                    } else {
                        strLIZLLL = null;
                    }
                    sbLIZ.append(strLIZLLL);
                    sbLIZ.append(", loadErrorInfo=");
                    sbLIZ.append(this.LL.LJ);
                    sbLIZ.append(", aid=");
                    Aweme aweme2 = this.LL.LIZIZ;
                    if (aweme2 != null) {
                        aid = aweme2.getAid();
                    } else {
                        aid = null;
                    }
                    sbLIZ.append(aid);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C725770SdT c725770SdT = (C725770SdT) this.LL.LIZLLL.LJFF(C725770SdT.class);
                    if (c725770SdT != null && (function1 = c725770SdT.LIZIZ) != null) {
                        if (lynxError != null) {
                            numValueOf3 = Integer.valueOf(lynxError.LIZIZ());
                        } else {
                            numValueOf3 = null;
                        }
                        function1.invoke(String.valueOf(numValueOf3));
                    }
                    if (lynxError != null) {
                        iLIZIZ = lynxError.LIZIZ();
                    } else {
                        iLIZIZ = -1;
                    }
                    C01GW c01gw = C298280Bmc.LIZJ;
                    if (((C005O) c01gw.getValue()).LIZ && !((C005O) c01gw.getValue()).LIZIZ.contains(Integer.valueOf(iLIZIZ))) {
                        C189S c189s = this.LL;
                        if (c189s.LJ != null) {
                            return;
                        }
                        if (lynxError != null) {
                            strLIZJ2 = lynxError.LIZJ();
                        } else {
                            strLIZJ2 = null;
                        }
                        c189s.LJ = new C1898607c8("received_error", iLIZIZ, strLIZJ2);
                        Aweme aweme3 = this.LL.LIZIZ;
                        if (aweme3 == null || (aid2 = aweme3.getAid()) == null) {
                            aid2 = "";
                        }
                        if (aid2.length() > 0) {
                            Aweme aweme4 = this.LL.LIZIZ;
                            if (lynxError != null) {
                                strLIZJ3 = lynxError.LIZJ();
                            }
                            C1440005kM.LIZ(new C1361880lXm(iLIZIZ, aweme4, "received_error", strLIZJ3));
                        }
                    }
                }
            };
        } else {
            "createLiteKitView is not LiteLynxKitView".toString();
            throw new IllegalStateException("createLiteKitView is not LiteLynxKitView");
        }
    }
}
