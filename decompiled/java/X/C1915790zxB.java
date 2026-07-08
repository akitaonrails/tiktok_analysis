package X;

import Y.ARunnableS22S1300000_28;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pns.consent.core.network.ConsentEntityWithRecord;
import com.ss.android.ugc.aweme.pns.consent.core.network.FetchConsentResponse;
import java.net.URI;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915790zxB {
    public final C1915660zwy LIZIZ;
    public final C1915890zxL LIZJ;
    public int LJ;
    public int LJFF;
    public final String LIZ = "";
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1915820zxE(this));

    public C1915790zxB(C1915660zwy c1915660zwy, C1915890zxL c1915890zxL) {
        this.LIZIZ = c1915660zwy;
        this.LIZJ = c1915890zxL;
    }

    public final void LIZ(final C1915720zx4 c1915720zx4, final String str, final InterfaceC1915880zxK interfaceC1915880zxK) {
        boolean z;
        Object c098200Yq;
        C1518500pcO c1518500pcO;
        InterfaceC1518570pcV interfaceC1518570pcVLIZLLL = C100C.LIZ.LIZLLL();
        Object obj = null;
        if (interfaceC1518570pcVLIZLLL.LIZLLL()) {
            if (this.LIZ.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    c098200Yq = URI.create(this.LIZ).resolve("/consent/api/combine/list/v3").toString();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                String str2 = (String) obj;
                if (str2 == null) {
                    str2 = a0.LJLJJI(this.LIZ, '/') + '/' + a0.LJLJJLL("/consent/api/combine/list/v3", '/');
                }
                c1518500pcO = new C1518500pcO("/consent/api/combine/list/v3", str2);
            } else {
                c1518500pcO = new C1518500pcO("/consent/api/combine/list/v3", null);
            }
            c1518500pcO.LIZJ = EnumC1518490pcN.POST;
            c1518500pcO.LIZLLL.put("sdk_version", "2.7.4.4");
            c1518500pcO.LIZLLL.put("sdk_name", "pns_consent_sdk");
            interfaceC1518570pcVLIZLLL.LIZIZ().LIZ(c1518500pcO.LIZ(), FetchConsentResponse.class, false, new InterfaceC1518350pc9<FetchConsentResponse>() { // from class: X.0zxC
                @Override // X.InterfaceC1518350pc9
                public final void LIZ(C1518330pc7<FetchConsentResponse> c1518330pc7) {
                    FetchConsentResponse fetchConsentResponse = c1518330pc7.LIZ;
                    int i = fetchConsentResponse.statusCode;
                    if (i != 0) {
                        String strLIZIZ = fetchConsentResponse.statusMsg;
                        if (strLIZIZ == null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("statusCode = ");
                            sbLIZ.append(i);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        InterfaceC1915880zxK interfaceC1915880zxK2 = interfaceC1915880zxK;
                        if (interfaceC1915880zxK2 != null) {
                            interfaceC1915880zxK2.onFailure(i, strLIZIZ);
                        }
                        this.LIZIZ.LIZ("/consent/api/combine/list/v3", String.valueOf(i), strLIZIZ, str, null);
                        C1915890zxL c1915890zxL = this.LIZJ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fetchConsentRecord fail, statusCode = ");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", statusMsg = ");
                        sbLIZ2.append(strLIZIZ);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        c1915890zxL.getClass();
                        return;
                    }
                    List<ConsentEntityWithRecord> list = fetchConsentResponse.entities;
                    if (list == null) {
                        String str3 = fetchConsentResponse.statusMsg;
                        if (str3 == null) {
                            str3 = "(entities == null)";
                        }
                        InterfaceC1915880zxK interfaceC1915880zxK3 = interfaceC1915880zxK;
                        if (interfaceC1915880zxK3 != null) {
                            interfaceC1915880zxK3.onFailure(i, str3);
                        }
                        this.LIZIZ.LIZ("/consent/api/combine/list/v3", String.valueOf(i), str3, str, null);
                        C1915890zxL c1915890zxL2 = this.LIZJ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fetchConsentRecord fail, statusCode = ");
                        sbLIZ3.append(i);
                        sbLIZ3.append(", statusMsg = (entities == null)");
                        C2188811AlT.LIZIZ(sbLIZ3);
                        c1915890zxL2.getClass();
                        return;
                    }
                    C1915720zx4 c1915720zx42 = c1915720zx4;
                    C1915720zx4 c1915720zx43 = C1915720zx4.LIZ;
                    c1915720zx42.getClass();
                    C1915720zx4.LJII(list, null, true);
                    String str4 = fetchConsentResponse.statusMsg;
                    if (str4 == null) {
                        str4 = "onSuccess";
                    }
                    InterfaceC1915880zxK interfaceC1915880zxK4 = interfaceC1915880zxK;
                    if (interfaceC1915880zxK4 != null) {
                        interfaceC1915880zxK4.LIZ(i, str4);
                    }
                    this.LIZIZ.LIZ("/consent/api/combine/list/v3", String.valueOf(i), str4, str, null);
                    C1915890zxL c1915890zxL3 = this.LIZJ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("fetchConsentRecord success, statusCode = ");
                    sbLIZ4.append(i);
                    sbLIZ4.append(", statusMsg = ");
                    sbLIZ4.append(str4);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    c1915890zxL3.getClass();
                    c1915720zx4.LIZJ(list);
                }

                @Override // X.InterfaceC1518350pc9
                public final void onError(Throwable th2) {
                    String message = th2.getMessage();
                    if (message == null) {
                        message = "network error";
                    }
                    InterfaceC1915880zxK interfaceC1915880zxK2 = interfaceC1915880zxK;
                    if (interfaceC1915880zxK2 != null) {
                        interfaceC1915880zxK2.onFailure(-2, message);
                    }
                    this.LIZIZ.LIZ("/consent/api/combine/list/v3", "-2", message, str, null);
                    C1915890zxL c1915890zxL = this.LIZJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchConsentRecord network error: ");
                    sbLIZ.append(message);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c1915890zxL.getClass();
                }
            });
            return;
        }
        ((InterfaceC1915760zx8) this.LIZLLL.getValue()).LIZIZ("2.7.4.4", "pns_consent_sdk").LJ(new InterfaceC2385309Wh() { // from class: X.0zxA
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                int i;
                Exception excLJIIJJI;
                String message;
                FetchConsentResponse fetchConsentResponse;
                Exception excLJIIJJI2;
                String message2;
                String string;
                Exception excLJIIJJI3;
                String message3;
                Exception excLJIIJJI4;
                String message4;
                String string2;
                Exception excLJIIJJI5;
                String message5;
                C1C7U.LIZ("ConsentApiManager@24f3.fetchConsentRecordAfterDidReady$3");
                FetchConsentResponse fetchConsentResponse2 = (FetchConsentResponse) c15o7.LJIIL();
                if (fetchConsentResponse2 != null) {
                    i = fetchConsentResponse2.statusCode;
                } else {
                    i = -2;
                }
                C1915790zxB c1915790zxB = this;
                int i2 = c1915790zxB.LJ + 1;
                c1915790zxB.LJ = i2;
                if (Integer.compare(Integer.MIN_VALUE ^ i2, -2147483645) < 0 && (i == 20007 || i == 499 || (500 <= i && i < 600))) {
                    C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS22S1300000_28(this, str, c1915720zx4, interfaceC1915880zxK, 1));
                } else {
                    this.LJ = 0;
                    Integer numValueOf = null;
                    if (c15o7.LJIILJJIL() && c15o7.LJIIL() != null && (fetchConsentResponse = (FetchConsentResponse) c15o7.LJIIL()) != null && fetchConsentResponse.statusCode == 0) {
                        List<ConsentEntityWithRecord> list = ((FetchConsentResponse) c15o7.LJIIL()).entities;
                        if (list == null) {
                            FetchConsentResponse fetchConsentResponse3 = (FetchConsentResponse) c15o7.LJIIL();
                            String str3 = "(entities == null)";
                            if ((fetchConsentResponse3 == null || (message4 = fetchConsentResponse3.statusMsg) == null) && ((excLJIIJJI4 = c15o7.LJIIJJI()) == null || (message4 = excLJIIJJI4.getMessage()) == null)) {
                                message4 = "(entities == null)";
                            }
                            InterfaceC1915880zxK interfaceC1915880zxK2 = interfaceC1915880zxK;
                            if (interfaceC1915880zxK2 != null) {
                                interfaceC1915880zxK2.onFailure(i, message4);
                            }
                            C1915660zwy c1915660zwy = this.LIZIZ;
                            FetchConsentResponse fetchConsentResponse4 = (FetchConsentResponse) c15o7.LJIIL();
                            if (fetchConsentResponse4 == null || (string2 = Integer.valueOf(fetchConsentResponse4.statusCode).toString()) == null) {
                                string2 = "(entities == null)";
                            }
                            FetchConsentResponse fetchConsentResponse5 = (FetchConsentResponse) c15o7.LJIIL();
                            if ((fetchConsentResponse5 != null && (message5 = fetchConsentResponse5.statusMsg) != null) || ((excLJIIJJI5 = c15o7.LJIIJJI()) != null && (message5 = excLJIIJJI5.getMessage()) != null)) {
                                str3 = message5;
                            }
                            c1915660zwy.LIZ("/consent/api/combine/list/v3", string2, str3, str, null);
                            C1915890zxL c1915890zxL = this.LIZJ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("fetchConsentRecord fail, statusCode = ");
                            FetchConsentResponse fetchConsentResponse6 = (FetchConsentResponse) c15o7.LJIIL();
                            if (fetchConsentResponse6 != null) {
                                numValueOf = Integer.valueOf(fetchConsentResponse6.statusCode);
                            }
                            sbLIZ.append(numValueOf);
                            sbLIZ.append(", statusMsg = (entities == null)");
                            C2188811AlT.LIZIZ(sbLIZ);
                            c1915890zxL.getClass();
                        } else {
                            C1915720zx4 c1915720zx42 = c1915720zx4;
                            C1915720zx4 c1915720zx43 = C1915720zx4.LIZ;
                            c1915720zx42.getClass();
                            C1915720zx4.LJII(list, null, true);
                            FetchConsentResponse fetchConsentResponse7 = (FetchConsentResponse) c15o7.LJIIL();
                            String str4 = "onSuccess";
                            if ((fetchConsentResponse7 == null || (message2 = fetchConsentResponse7.statusMsg) == null) && ((excLJIIJJI2 = c15o7.LJIIJJI()) == null || (message2 = excLJIIJJI2.getMessage()) == null)) {
                                message2 = "onSuccess";
                            }
                            InterfaceC1915880zxK interfaceC1915880zxK3 = interfaceC1915880zxK;
                            if (interfaceC1915880zxK3 != null) {
                                interfaceC1915880zxK3.LIZ(i, message2);
                            }
                            C1915660zwy c1915660zwy2 = this.LIZIZ;
                            FetchConsentResponse fetchConsentResponse8 = (FetchConsentResponse) c15o7.LJIIL();
                            if (fetchConsentResponse8 == null || (string = Integer.valueOf(fetchConsentResponse8.statusCode).toString()) == null) {
                                string = "onSuccess";
                            }
                            FetchConsentResponse fetchConsentResponse9 = (FetchConsentResponse) c15o7.LJIIL();
                            if ((fetchConsentResponse9 != null && (message3 = fetchConsentResponse9.statusMsg) != null) || ((excLJIIJJI3 = c15o7.LJIIJJI()) != null && (message3 = excLJIIJJI3.getMessage()) != null)) {
                                str4 = message3;
                            }
                            c1915660zwy2.LIZ("/consent/api/combine/list/v3", string, str4, str, null);
                            C1915890zxL c1915890zxL2 = this.LIZJ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("fetchConsentRecord success, statusCode = ");
                            FetchConsentResponse fetchConsentResponse10 = (FetchConsentResponse) c15o7.LJIIL();
                            if (fetchConsentResponse10 != null) {
                                numValueOf = Integer.valueOf(fetchConsentResponse10.statusCode);
                            }
                            sbLIZ2.append(numValueOf);
                            sbLIZ2.append(", statusMsg = ");
                            sbLIZ2.append(message2);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            c1915890zxL2.getClass();
                            c1915720zx4.LIZJ(list);
                        }
                    } else {
                        FetchConsentResponse fetchConsentResponse11 = (FetchConsentResponse) c15o7.LJIIL();
                        if ((fetchConsentResponse11 == null || (message = fetchConsentResponse11.statusMsg) == null) && ((excLJIIJJI = c15o7.LJIIJJI()) == null || (message = excLJIIJJI.getMessage()) == null)) {
                            message = "!it.isCompleted || it.result == null || it.result?.statusCode != 0";
                        }
                        InterfaceC1915880zxK interfaceC1915880zxK4 = interfaceC1915880zxK;
                        if (interfaceC1915880zxK4 != null) {
                            interfaceC1915880zxK4.onFailure(i, message);
                        }
                        this.LIZIZ.LIZ("/consent/api/combine/list/v3", String.valueOf(i), message, str, null);
                        C1915890zxL c1915890zxL3 = this.LIZJ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fetchConsentRecord fail, statusCode = ");
                        sbLIZ3.append(i);
                        sbLIZ3.append(", statusMsg = ");
                        sbLIZ3.append(message);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        c1915890zxL3.getClass();
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ConsentApiManager@24f3.fetchConsentRecordAfterDidReady$3");
                return unit;
            }
        }, C807400Vlq.LIZ(), null);
    }
}
