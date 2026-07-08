package X;

import android.util.Base64;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlin.text.u;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.module.network.NetWorkSocketJSWrap$connectSocket$1", f = "NetWorkModule.kt", l = {278}, m = "invokeSuspend")
public final class C1524630pmH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1524780pmW LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1524630pmH(C1524780pmW c1524780pmW, JSONObject jSONObject, int i, InterfaceC1364105Vn<? super C1524630pmH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1524780pmW;
        this.LLILLL = jSONObject;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1524630pmH(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0pjc] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        InterfaceC1524590pmD interfaceC1524590pmD;
        JSONObject jSONObjectLIZ;
        C1525120pn4 c1525120pn4LIZIZ;
        C1525180pnA c1525180pnA;
        C1525120pn4 c1525120pn4LIZ;
        C1C7U.LIZ("NetWorkSocketJSWrap@25a7.connectSocket$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1525050pmx c1525050pmx = this.LLILLJJLI.LIZ;
            if (c1525050pmx != null) {
                interfaceC1524590pmD = c1525050pmx.LIZ;
            } else {
                interfaceC1524590pmD = 0;
            }
            InterfaceC1525090pn1 interfaceC1525090pn1 = c1525050pmx.LIZIZ;
            C1304160k2g c1304160k2g = c1525050pmx.LIZJ;
            final C1523050pjj c1523050pjj = new C1523050pjj(interfaceC1524590pmD, interfaceC1525090pn1, c1304160k2g);
            JSONObject jSONObject = this.LLILLL;
            final int i2 = this.LLILZ;
            C1524640pmI c1524640pmI = new C1524640pmI(jSONObject);
            C1525120pn4 c1525120pn4 = c1524640pmI.LIZ;
            if (c1525120pn4 != null) {
                c1525180pnA = new C1525180pnA(c1525120pn4);
            } else {
                String str = c1524640pmI.LIZIZ;
                if (str == null) {
                    c1525180pnA = new C1525180pnA(C1524690pmN.LIZ("connectSocket"));
                } else {
                    C1525190pnB c1525190pnBLIZ = C1524670pmL.LIZ("socket", str, c1304160k2g);
                    EnumC1524730pmR enumC1524730pmR = c1525190pnBLIZ.LIZ;
                    if (enumC1524730pmR != EnumC1524730pmR.SUCCESS) {
                        int i3 = C1524900pmi.LIZ[enumC1524730pmR.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    c1525120pn4LIZ = C1524690pmN.LJ("connectSocket");
                                } else {
                                    String str2 = c1525190pnBLIZ.LIZIZ;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    c1525120pn4LIZ = C1525150pn7.LIZ(EnumC1523070pjl.INVALID_DOMAIN.getCode(), "connectSocket", u.LJJIII(u.LJJIII("url use invalid protocol, url == %s, url support protocol is %s", "%s", str, false), "%s", str2, false)).LIZIZ();
                                }
                            } else {
                                c1525120pn4LIZ = C1525150pn7.LIZ(EnumC1523070pjl.INVALID_DOMAIN.getCode(), "connectSocket", u.LJJIII("url not in domain list, url == %s", "%s", str, false)).LIZIZ();
                            }
                        } else {
                            c1525120pn4LIZ = C1524690pmN.LIZ("connectSocket");
                        }
                        c1525180pnA = new C1525180pnA(c1525120pn4LIZ);
                    } else {
                        if (C244700x3.LIZIZ(str)) {
                            jSONObjectLIZ = C244700x3.LIZ(c1524640pmI.LIZJ);
                        } else {
                            jSONObjectLIZ = c1524640pmI.LIZJ;
                        }
                        if (interfaceC1524590pmD.LJIIJJI(new C1522970pjb(i2, str, new C1502140pC0(jSONObjectLIZ, null, 2), c1524640pmI.LIZLLL, c1524640pmI.LJ), new InterfaceC1523020pjg() { // from class: X.0pjc
                            @Override // X.InterfaceC1523020pjg
                            public final void LIZ(final int i4, final String str3) {
                                c1523050pjj.LIZ(i2, "close", new Function1() { // from class: X.0jbX
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) throws JSONException {
                                        int i5 = i4;
                                        String str4 = str3;
                                        JSONObject jSONObject2 = (JSONObject) obj2;
                                        jSONObject2.put("code", i5);
                                        jSONObject2.put("reason", str4);
                                        return Unit.LIZ;
                                    }
                                });
                            }

                            @Override // X.InterfaceC1523020pjg
                            public final void LIZJ(final String str3, final byte[] bArr) {
                                c1523050pjj.LIZ(i2, "message", new Function1() { // from class: X.0pmv
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) throws JSONException {
                                        byte[] bArr2 = bArr;
                                        String str4 = str3;
                                        JSONObject jSONObject2 = (JSONObject) obj2;
                                        if (bArr2 != null) {
                                            jSONObject2.put("dataType", EnumC1524710pmP.ARRAYBUFFER.getWireValue());
                                            jSONObject2.put("data", Base64.encodeToString(bArr2, 2));
                                        } else if (str4 != null) {
                                            jSONObject2.put("dataType", EnumC1524710pmP.STRING.getWireValue());
                                            jSONObject2.put("data", str4);
                                        }
                                        return Unit.LIZ;
                                    }
                                });
                            }

                            @Override // X.InterfaceC1523020pjg
                            public final void onError(final int i4, final String str3) {
                                c1523050pjj.LIZ(i2, "error", new Function1() { // from class: X.0oOW
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) throws JSONException {
                                        int i5 = i4;
                                        String str4 = str3;
                                        JSONObject jSONObject2 = (JSONObject) obj2;
                                        jSONObject2.put("code", i5);
                                        jSONObject2.put("errMsg", str4);
                                        return Unit.LIZ;
                                    }
                                });
                            }

                            @Override // X.InterfaceC1523020pjg
                            public final void LIZIZ(final C1502140pC0 c1502140pC0, final String str3, final JSONObject jSONObject2) {
                                c1523050pjj.LIZ(i2, "open", new Function1() { // from class: X.0pC2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) throws JSONException {
                                        JSONObject jSONObjectLIZIZ;
                                        JSONObject jSONObject3;
                                        JSONObject jSONObject4 = jSONObject2;
                                        C1502140pC0 c1502140pC02 = c1502140pC0;
                                        String strOptString = str3;
                                        JSONObject jSONObject5 = (JSONObject) obj2;
                                        JSONObject jSONObjectOptJSONObject = null;
                                        if (jSONObject4 == null || ((jSONObjectOptJSONObject = jSONObject4.optJSONObject("header")) == null && (jSONObjectOptJSONObject = jSONObject4.optJSONObject("headers")) == null)) {
                                            jSONObjectLIZIZ = c1502140pC02.LIZIZ();
                                        } else {
                                            jSONObjectLIZIZ = jSONObjectOptJSONObject;
                                        }
                                        jSONObject5.put("header", jSONObjectLIZIZ);
                                        if (a0.LJJJIL(strOptString) && ((jSONObject4 == null || (strOptString = jSONObject4.optString("protocol")) == null || !(!a0.LJJJIL(strOptString))) && (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("Sec-WebSocket-Protocol")) == null))) {
                                            strOptString = "";
                                        }
                                        if (a0.LJJJIL(strOptString)) {
                                            strOptString = "websocket";
                                        }
                                        jSONObject5.put("protocol", strOptString);
                                        if (jSONObject4 == null || (jSONObject3 = jSONObject4.optJSONObject("profile")) == null) {
                                            jSONObject3 = new JSONObject();
                                        }
                                        jSONObject5.put("profile", jSONObject3);
                                        return Unit.LIZ;
                                    }
                                });
                            }
                        })) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("socketTaskId", i2);
                            c1525120pn4LIZIZ = C1524690pmN.LIZJ("connectSocket", jSONObject2);
                        } else {
                            c1525120pn4LIZIZ = C1524690pmN.LIZIZ("connectSocket", new IllegalStateException("socket task already exists"));
                        }
                        c1525180pnA = new C1525180pnA(c1525120pn4LIZIZ);
                    }
                }
            }
            C1525120pn4 c1525120pn42 = c1525180pnA.LIZ;
            if (c1525120pn42 != null && c1525120pn42.LIZJ) {
                int iOptInt = c1525120pn42.LIZ.optInt("errNo", -1);
                String strOptString = c1525120pn42.LIZ.optString("errMsg", "connect fail");
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C1523100pjo c1523100pjo = new C1523100pjo(this.LLILLJJLI, this.LLILZ, iOptInt, strOptString, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c1523100pjo) == objLJFF) {
                    C1C7U.LIZIZ("NetWorkSocketJSWrap@25a7.connectSocket$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NetWorkSocketJSWrap@25a7.connectSocket$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
