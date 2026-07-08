package X;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524610pmF {
    public final InterfaceC1304870k3p LIZ;
    public final InterfaceC1525090pn1 LIZIZ;
    public final C1304160k2g LIZJ;
    public int LIZLLL;

    public final C1525120pn4 LIZ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectLIZ;
        String strJ3;
        final C1524620pmG c1524620pmG = new C1524620pmG(jSONObject);
        C1525120pn4 c1525120pn4 = c1524620pmG.LIZ;
        if (c1525120pn4 != null) {
            return c1525120pn4;
        }
        String strValueOf = String.valueOf(c1524620pmG.LIZIZ);
        String str = c1524620pmG.LIZLLL;
        List<String> list = C1524670pmL.LIZ;
        EnumC1524730pmR enumC1524730pmR = C1524670pmL.LIZ("request", strValueOf, this.LIZJ).LIZ;
        if (enumC1524730pmR != EnumC1524730pmR.SUCCESS) {
            int i = C1524890pmh.LIZ[enumC1524730pmR.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return C1524690pmN.LJ("request");
                    }
                    return C1525150pn7.LIZ(600011, "request", C786410Ut5.j4("url validate error", new Object[0])).LIZIZ();
                }
                return C1525150pn7.LIZ(21100, "request", u.LJJIFFI("url not in domain list, url == %s", "%s", strValueOf, false)).LIZIZ();
            }
            return C1525150pn7.LIZ(600009, "request", "invalid URL").LIZIZ();
        }
        if (this.LIZ.LJFF(this.LIZLLL)) {
            this.LIZ.LJJLIIIJLJLI(this.LIZLLL);
            C1525120pn4 c1525120pn4LIZIZ = C1525150pn7.LIZ(600003, "request", "network interrupted error").LIZIZ();
            int iIntValue = ((Integer) c1525120pn4LIZIZ.LIZ.get("errNo")).intValue();
            Object obj = c1525120pn4LIZIZ.LIZ.get("errMsg");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("state", "fail");
            jSONObject2.put("requestTaskId", this.LIZLLL);
            jSONObject2.put("errorCode", iIntValue);
            jSONObject2.put("errorMsg", obj);
            this.LIZIZ.emitJSAPIEvent("innerRequestTaskStateChange", jSONObject2);
        } else {
            if (C244700x3.LIZIZ(strValueOf)) {
                jSONObjectLIZ = C244700x3.LIZ(c1524620pmG.LIZJ);
            } else {
                jSONObjectLIZ = c1524620pmG.LIZJ;
            }
            InterfaceC1304870k3p interfaceC1304870k3p = this.LIZ;
            C1524420plw c1524420plw = new C1524420plw(strValueOf, str);
            c1524420plw.LIZJ = this.LIZLLL;
            c1524420plw.LJFF = new C1502140pC0(jSONObjectLIZ, null, 2);
            JSONObject jSONObject3 = c1524620pmG.LJ;
            if (jSONObject3 == null || (strJ3 = C786410Ut5.J3(jSONObject3)) == null) {
                strJ3 = c1524620pmG.LJFF;
            }
            c1524420plw.LJI = new C1524430plx(strJ3, c1524620pmG.LJIIIIZZ);
            c1524420plw.LJ = String.valueOf(c1524620pmG.LJII);
            c1524420plw.LIZLLL = c1524620pmG.LJIIIZ;
            interfaceC1304870k3p.LJJIJLIJ(c1524420plw.LIZ(), new InterfaceC1304860k3o() { // from class: X.0pmE
                @Override // X.InterfaceC1304860k3o
                public final void LIZIZ() throws JSONException {
                    this.LIZ.getClass();
                    C1525120pn4 c1525120pn4LIZIZ2 = C1525150pn7.LIZ(600003, "request", "network interrupted error").LIZIZ();
                    int iIntValue2 = ((Integer) c1525120pn4LIZIZ2.LIZ.get("errNo")).intValue();
                    Object obj2 = c1525120pn4LIZIZ2.LIZ.get("errMsg");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("requestTaskId", this.LIZ.LIZLLL);
                    jSONObject4.put("state", "fail");
                    jSONObject4.put("errorCode", iIntValue2);
                    jSONObject4.put("errorMsg", obj2);
                    this.LIZ.LIZIZ.emitJSAPIEvent("innerRequestTaskStateChange", jSONObject4);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.InterfaceC1304860k3o
                public final void LIZ(C1524380pls c1524380pls) throws JSONException {
                    boolean z;
                    byte[] bArr;
                    String str2;
                    String str3;
                    String str4;
                    int i2;
                    String message;
                    int i3;
                    boolean z2;
                    byte[] bArr2;
                    JSONArray jSONArrayPut;
                    byte[] bArr3;
                    IClientAdapterService iClientAdapterServiceLIZIZ;
                    boolean zEquals = TextUtils.equals(c1524380pls.LJ, "arraybuffer");
                    JSONObject jSONObject4 = null;
                    if (zEquals) {
                        C1304160k2g c1304160k2g = this.LIZ.LIZJ;
                        if (!c1304160k2g.LJIIIIZZ.sendBufferEvent || ((iClientAdapterServiceLIZIZ = c1304160k2g.LIZIZ()) != null && iClientAdapterServiceLIZIZ.isRemoteDebugMode())) {
                            z = false;
                            C1524430plx c1524430plx = c1524380pls.LIZLLL;
                            if (c1524430plx != null && (bArr3 = c1524430plx.LIZIZ) != null) {
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("key", "data");
                                jSONObject5.put("value", bArr3);
                                jSONArrayPut = new JSONArray().put(jSONObject5);
                            } else {
                                jSONArrayPut = null;
                            }
                            this.LIZ.getClass();
                            if (jSONArrayPut != null) {
                                jSONArrayPut.toString();
                            }
                        } else {
                            z = true;
                            C1524430plx c1524430plx2 = c1524380pls.LIZLLL;
                            if (c1524430plx2 != null && c1524430plx2.LIZIZ != null) {
                                this.LIZ.getClass();
                            }
                        }
                    } else {
                        z = false;
                    }
                    Object objLIZIZ = "";
                    if (zEquals) {
                        if (z) {
                            C1524430plx c1524430plx3 = c1524380pls.LIZLLL;
                            if (c1524430plx3 == null || (bArr = c1524430plx3.LIZIZ) == null) {
                                bArr = new byte[0];
                            }
                            str3 = "";
                        } else {
                            C1524430plx c1524430plx4 = c1524380pls.LIZLLL;
                            if (c1524430plx4 == null || (bArr2 = c1524430plx4.LIZIZ) == null) {
                                bArr2 = new byte[0];
                            }
                            str2 = Base64.encodeToString(bArr2, 2);
                            bArr = null;
                            str3 = str2;
                        }
                    } else {
                        C1524430plx c1524430plx5 = c1524380pls.LIZLLL;
                        if (c1524430plx5 != null) {
                            String str5 = c1524430plx5.LIZ;
                            str2 = str5;
                            if (str5 == null) {
                                str2 = new String(c1524430plx5.LIZ(), Charsets.UTF_8);
                            }
                            bArr = null;
                            str3 = str2;
                        } else {
                            bArr = null;
                            str3 = "";
                        }
                    }
                    if (TextUtils.equals(c1524620pmG.LJI, "json") && !zEquals) {
                        int length = str3.length() - 1;
                        int i4 = 0;
                        boolean z3 = false;
                        while (i4 <= length) {
                            if (!z3) {
                                i3 = i4;
                            } else {
                                i3 = length;
                            }
                            if (Intrinsics.LJI(str3.charAt(i3), 32) <= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z3) {
                                if (!z2) {
                                    z3 = true;
                                } else {
                                    i4++;
                                }
                            } else if (!z2) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        if (str3.subSequence(i4, length + 1).toString().length() != 0) {
                            try {
                                jSONObject4 = new JSONObject(str3);
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("requestTaskId", this.LIZ.LIZLLL);
                    if (c1524380pls.LIZ) {
                        jSONObject6.put("statusCode", c1524380pls.LIZIZ);
                        jSONObject6.put("state", "success");
                        C1502140pC0 c1502140pC0 = c1524380pls.LIZJ;
                        if (c1502140pC0 != null) {
                            objLIZIZ = c1502140pC0.LIZIZ();
                        }
                        jSONObject6.put("header", objLIZIZ);
                        Object obj2 = str3;
                        if (!z) {
                            if (jSONObject4 != null) {
                                obj2 = jSONObject4;
                            }
                            jSONObject6.put("data", obj2);
                        }
                    } else if (c1524380pls.LIZIZ != -3) {
                        for (Throwable cause = c1524380pls.LJFF; cause != null; cause = cause.getCause()) {
                            if (C1524380pls.LIZ(cause.toString()) || ((message = cause.getMessage()) != null && C1524380pls.LIZ(message))) {
                                str4 = "request timeout";
                                i2 = 21103;
                                break;
                            }
                        }
                        i2 = c1524380pls.LJII;
                        str4 = c1524380pls.LJI;
                        jSONObject6.put("state", "fail");
                        jSONObject6.put("errorCode", i2);
                        jSONObject6.put("errorMsg", str4);
                    } else {
                        str4 = "request timeout";
                        i2 = 21103;
                        jSONObject6.put("state", "fail");
                        jSONObject6.put("errorCode", i2);
                        jSONObject6.put("errorMsg", str4);
                    }
                    if (bArr != null) {
                        this.LIZ.LIZIZ.LJJLL(jSONObject6, C2097908Jt.LIZJ(new Pair("data", bArr)));
                    } else {
                        this.LIZ.LIZIZ.emitJSAPIEvent("innerRequestTaskStateChange", jSONObject6);
                    }
                }
            });
        }
        C1525140pn6 c1525140pn6 = new C1525140pn6();
        c1525140pn6.LIZ.put("requestTaskId", this.LIZLLL);
        return C1524690pmN.LIZJ("request", c1525140pn6.LIZ);
    }

    public C1524610pmF(InterfaceC1304870k3p interfaceC1304870k3p, InterfaceC1525090pn1 interfaceC1525090pn1, C1304160k2g c1304160k2g) {
        this.LIZ = interfaceC1304870k3p;
        this.LIZIZ = interfaceC1525090pn1;
        this.LIZJ = c1304160k2g;
    }
}
