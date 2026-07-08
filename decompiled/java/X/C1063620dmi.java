package X;

import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.sdk.xbridge.services.IUtilsService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1063620dmi extends AbstractC1051750dTZ {
    public final InterfaceC1063690dmp LL;
    public final InterfaceC1063710dmr LLILLJJLI;
    public boolean LLILLL;
    public EnumC1051570dTH LLILZ;
    public final /* synthetic */ InterfaceC1063710dmr LLILZIL;
    public final /* synthetic */ C1059860dge LLILZLL;
    public final /* synthetic */ List<InterfaceC1063660dmm> LLIZ;

    public final EnumC1059790dgX LIZJ() {
        EnumC1054630dYD enumC1054630dYDLJ;
        InterfaceC1028200cra interfaceC1028200cra = (InterfaceC1028200cra) this.contextProviderFactory.LIZIZ(InterfaceC1028200cra.class);
        if (interfaceC1028200cra == null || (enumC1054630dYDLJ = interfaceC1028200cra.LJ()) == null) {
            enumC1054630dYDLJ = EnumC1054630dYD.RN;
        }
        int i = C1054620dYC.LIZ[enumC1054630dYDLJ.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? EnumC1059790dgX.RN : EnumC1059790dgX.WEB : EnumC1059790dgX.RN : EnumC1059790dgX.LYNX;
    }

    @Override // X.InterfaceC1051460dT6
    public final String getName() {
        String name;
        InterfaceC1063690dmp interfaceC1063690dmp = this.LL;
        if (interfaceC1063690dmp != null && (name = interfaceC1063690dmp.getName()) != null) {
            return name;
        }
        InterfaceC1063710dmr interfaceC1063710dmr = this.LLILLJJLI;
        return interfaceC1063710dmr != null ? interfaceC1063710dmr.getName() : "";
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051690dTT
    public final void release() {
        super.release();
        InterfaceC1063690dmp interfaceC1063690dmp = this.LL;
        if (interfaceC1063690dmp != null) {
            interfaceC1063690dmp.release();
        }
        InterfaceC1063710dmr interfaceC1063710dmr = this.LLILLJJLI;
        if (interfaceC1063710dmr != null) {
            interfaceC1063710dmr.release();
        }
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public final EnumC1051570dTH getAccess() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public final boolean getNeedCallback() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1051750dTZ
    public final void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.LLILZ = enumC1051570dTH;
    }

    @Override // X.AbstractC1051750dTZ
    public final void setNeedCallback(boolean z) {
        this.LLILLL = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:32:0x00a0, B:34:0x00aa, B:40:0x00b6, B:41:0x00ba, B:36:0x00ae, B:38:0x00b2), top: B:56:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6 A[Catch: all -> 0x00be, PHI: r0
      0x00b6: PHI (r0v28 com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend) = 
      (r0v26 com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend)
      (r0v30 com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend)
     binds: [B:35:0x00ac, B:39:0x00b4] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00be, blocks: (B:32:0x00a0, B:34:0x00aa, B:40:0x00b6, B:41:0x00ba, B:36:0x00ae, B:38:0x00b2), top: B:56:0x00a0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.InterfaceC1058710den r10, java.util.Map<java.lang.String, ? extends java.lang.Object> r11) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1063620dmi.LIZIZ(X.0den, java.util.Map):void");
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.0dmk] */
    @Override // X.InterfaceC1051730dTX
    public final void handle(JSONObject jSONObject, final InterfaceC1058710den interfaceC1058710den) throws Exception {
        AbstractC1544480qII c1544500qIK;
        EnumC1059790dgX enumC1059790dgXLIZJ = LIZJ();
        InterfaceC1063710dmr interfaceC1063710dmr = this.LLILZIL;
        if (interfaceC1063710dmr != null) {
            if (enumC1059790dgXLIZJ == EnumC1059790dgX.WEB) {
                c1544500qIK = new C1544470qIH(interfaceC1063710dmr, jSONObject);
            } else if (enumC1059790dgXLIZJ == EnumC1059790dgX.LYNX) {
                C587540N2q.LIZ.getClass();
                c1544500qIK = new C1544500qIK(interfaceC1063710dmr, ((IUtilsService) C587540N2q.LIZ(IUtilsService.class)).convertJsonToMap(jSONObject));
            } else {
                return;
            }
            final ?? r1 = new InterfaceC801410VcB() { // from class: X.0dmk
                @Override // X.InterfaceC801410VcB
                public final void LIZ(Map<String, ? extends Object> map) {
                    this.LIZ.LIZIZ(interfaceC1058710den, map);
                }
            };
            c1544500qIK.LIZJ(new InterfaceC1543380qGW() { // from class: X.0dmj
                @Override // X.InterfaceC1543380qGW
                public final void LIZIZ(Object obj) {
                    Object c098200Yq;
                    Map<String, ? extends Object> mapLJ;
                    InterfaceC801410VcB interfaceC801410VcB = r1;
                    try {
                        if (obj instanceof JSONObject) {
                            C1543800qHC.LIZ.getClass();
                            mapLJ = C1543800qHC.LIZIZ((JSONObject) obj);
                        } else if (obj instanceof ReadableMap) {
                            mapLJ = ((ReadableMap) obj).toHashMap();
                        } else {
                            mapLJ = C2097608Jq.LJ();
                        }
                        interfaceC801410VcB.LIZ(mapLJ);
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    InterfaceC801410VcB interfaceC801410VcB2 = r1;
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("code", 0);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("call bridge failed, error = ");
                        sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                        linkedHashMap.put("msg", C2188811AlT.LIZIZ(sbLIZ));
                        interfaceC801410VcB2.LIZ(linkedHashMap);
                    }
                }
            });
            return;
        }
        if (this.LL != null) {
            Iterator<InterfaceC1063660dmm> it2 = this.LLIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1063660dmm next = it2.next();
                if (next.LIZIZ(enumC1059790dgXLIZJ)) {
                    InterfaceC1107590evd interfaceC1107590evdLIZ = next.LIZ(jSONObject);
                    if (interfaceC1107590evdLIZ != null) {
                        this.LL.LIZIZ(interfaceC1107590evdLIZ, new InterfaceC1063920dnC() { // from class: X.0dml
                            @Override // X.InterfaceC1063920dnC
                            public final void LIZ(Map<String, Object> map) {
                                this.LIZ.LIZIZ(interfaceC1058710den, map);
                            }
                        }, enumC1059790dgXLIZJ);
                        return;
                    }
                }
            }
            interfaceC1058710den.onError(-3, "Unsupported platform type");
            return;
        }
        throw new Exception("Bullet Inner XBridge is Null!!");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1063620dmi(C1051660dTQ c1051660dTQ, InterfaceC1063690dmp interfaceC1063690dmp, C1059860dge c1059860dge, InterfaceC1063710dmr interfaceC1063710dmr, List list) {
        String value;
        EnumC1063530dmZ access;
        EnumC1051570dTH enumC1051570dTH;
        super(c1051660dTQ);
        this.LLILZIL = interfaceC1063710dmr;
        this.LLILZLL = c1059860dge;
        this.LLIZ = list;
        c1059860dge.LIZLLL(IESJsBridge.class, c1051660dTQ.LIZIZ(IESJsBridge.class));
        c1059860dge.LIZIZ(InterfaceC1548390qOb.class, new InterfaceC1548390qOb() { // from class: X.0dh3
            @Override // X.InterfaceC1548390qOb
            public final void H4(final InterfaceC1107590evd interfaceC1107590evd, final String str) {
                InterfaceC1028200cra interfaceC1028200cra = (InterfaceC1028200cra) this.LL.contextProviderFactory.LIZIZ(InterfaceC1028200cra.class);
                if (interfaceC1028200cra != null) {
                    interfaceC1028200cra.onEvent(new InterfaceC1047320dMQ(interfaceC1107590evd, str) { // from class: X.0dh4
                        public final String LIZ;
                        public final JSONObject LIZIZ;

                        @Override // X.InterfaceC1047320dMQ
                        public final String getName() {
                            return this.LIZ;
                        }

                        @Override // X.InterfaceC1047320dMQ
                        public final /* bridge */ /* synthetic */ Object getParams() {
                            return this.LIZIZ;
                        }

                        {
                            JSONObject jSONObject;
                            this.LIZ = str;
                            if (interfaceC1107590evd != null) {
                                C1872780ypo.LIZ.getClass();
                                jSONObject = C1872780ypo.LIZIZ(interfaceC1107590evd);
                            } else {
                                jSONObject = new JSONObject();
                            }
                            this.LIZIZ = jSONObject;
                        }
                    });
                }
            }
        });
        c1059860dge.LIZIZ(InterfaceC1052500dUm.class, new InterfaceC1052500dUm() { // from class: X.0dYB
            @Override // X.InterfaceC1052500dUm
            public final String LIZ() {
                C1047290dMN sessionInfo;
                String str;
                InterfaceC1028200cra interfaceC1028200cra = (InterfaceC1028200cra) this.LIZ.contextProviderFactory.LIZIZ(InterfaceC1028200cra.class);
                return (interfaceC1028200cra == null || (sessionInfo = interfaceC1028200cra.getSessionInfo()) == null || (str = sessionInfo.LIZ) == null) ? "" : str;
            }
        });
        interfaceC1063690dmp.LIZ(c1059860dge);
        this.LL = interfaceC1063690dmp;
        this.LLILLJJLI = interfaceC1063710dmr;
        EnumC1063570dmd access2 = interfaceC1063690dmp.getAccess();
        if (access2 == null || (value = access2.getValue()) == null) {
            if (interfaceC1063710dmr != null && (access = interfaceC1063710dmr.getAccess()) != null) {
                value = access.getValue();
            } else {
                value = "";
            }
        }
        if (Intrinsics.LJFF(value, EnumC1063570dmd.PRIVATE.getValue())) {
            enumC1051570dTH = EnumC1051570dTH.PRIVATE;
        } else if (Intrinsics.LJFF(value, EnumC1063570dmd.PROTECT.getValue())) {
            enumC1051570dTH = EnumC1051570dTH.PROTECT;
        } else if (Intrinsics.LJFF(value, EnumC1063570dmd.PUBLIC.getValue())) {
            enumC1051570dTH = EnumC1051570dTH.PUBLIC;
        } else {
            enumC1051570dTH = EnumC1051570dTH.PRIVATE;
        }
        this.LLILZ = enumC1051570dTH;
    }
}
