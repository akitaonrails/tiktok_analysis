package X;

import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponse;
import com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponseExtra;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0n2T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.network.NetRequest$requestNLE$2", f = "NetRequest.kt", l = {669, 673, 677, 681, 685, 699}, m = "invokeSuspend")
public final class C1419350n2T extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C096H>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InterfaceC1419480n2g LLILZ;
    public final /* synthetic */ C23186096q LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1419350n2T(InterfaceC1419480n2g interfaceC1419480n2g, C23186096q c23186096q, InterfaceC1364105Vn<? super C1419350n2T> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = interfaceC1419480n2g;
        this.LLILZIL = c23186096q;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1419370n2V c1419370n2V;
        C1494690ozz c1494690ozz;
        n nVar;
        String string;
        String str;
        int cronetInternalErrorCode;
        String localizedMessage;
        k kVarLJJIIZ;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        NLEModelResponseExtra nLEModelResponseExtra;
        String str3;
        NLEModelResponseExtra nLEModelResponseExtra2;
        String str4;
        NLEModelResponseExtra nLEModelResponseExtra3;
        String str5;
        String str6;
        NLEModelResponseExtra nLEModelResponseExtra4;
        C1C7U.LIZ("NetRequest@98a9.requestNLE$2");
        Object objLJFF = C099R.LJFF();
        switch (this.LL) {
            case 0:
                C155000ia.LIZIZ(obj);
                InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
                Throwable th = (Throwable) this.LLILLL;
                C1466940oHE c1466940oHE = new C1466940oHE(this.LLILZ, this.LLILZIL, 1);
                if (th instanceof C1419370n2V) {
                    c1419370n2V = (C1419370n2V) th;
                } else {
                    c1419370n2V = null;
                }
                int statusCode = 0;
                if (c1419370n2V != null) {
                    NLEModelResponse nLEModelResponse = c1419370n2V.LL;
                    if (nLEModelResponse == null) {
                        Object objInvoke = c1466940oHE.invoke(C2286608xc.LJ(4000), C2286608xc.LJ(4000), "getAutoCutNLEModel result is empty", null);
                        this.LLILLJJLI = null;
                        this.LL = 1;
                        if (interfaceC346701Wf.emit(objInvoke, this) == objLJFF) {
                            C1C7U.LIZIZ("NetRequest@98a9.requestNLE$2");
                            return objLJFF;
                        }
                    } else {
                        if (nLEModelResponse.statusCode == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            Integer numLJ = C2286608xc.LJ(2000);
                            NLEModelResponse nLEModelResponse2 = c1419370n2V.LL;
                            if (nLEModelResponse2 != null) {
                                statusCode = nLEModelResponse2.statusCode;
                            }
                            Integer numLJ2 = C2286608xc.LJ(statusCode);
                            NLEModelResponse nLEModelResponse3 = c1419370n2V.LL;
                            if (nLEModelResponse3 == null || (str5 = nLEModelResponse3.statusMsg) == null) {
                                str5 = "server no msg";
                            }
                            if (nLEModelResponse3 != null && (nLEModelResponseExtra4 = nLEModelResponse3.extra) != null) {
                                str6 = nLEModelResponseExtra4.logId;
                            } else {
                                str6 = null;
                            }
                            Object objInvoke2 = c1466940oHE.invoke(numLJ, numLJ2, str5, str6);
                            this.LLILLJJLI = null;
                            this.LL = 2;
                            if (interfaceC346701Wf.emit(objInvoke2, this) == objLJFF) {
                                C1C7U.LIZIZ("NetRequest@98a9.requestNLE$2");
                                return objLJFF;
                            }
                        } else {
                            String str7 = nLEModelResponse.data;
                            if (str7 != null && str7.length() != 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                Integer numLJ3 = C2286608xc.LJ(4000);
                                Integer numLJ4 = C2286608xc.LJ(4001);
                                NLEModelResponse nLEModelResponse4 = c1419370n2V.LL;
                                if (nLEModelResponse4 != null && (nLEModelResponseExtra3 = nLEModelResponse4.extra) != null) {
                                    str4 = nLEModelResponseExtra3.logId;
                                } else {
                                    str4 = null;
                                }
                                Object objInvoke3 = c1466940oHE.invoke(numLJ3, numLJ4, "response data isNullOrEmpty", str4);
                                this.LLILLJJLI = null;
                                this.LL = 3;
                                if (interfaceC346701Wf.emit(objInvoke3, this) == objLJFF) {
                                    C1C7U.LIZIZ("NetRequest@98a9.requestNLE$2");
                                    return objLJFF;
                                }
                            } else {
                                String str8 = c1419370n2V.LLILLJJLI;
                                if (str8 == null) {
                                    Integer numLJ5 = C2286608xc.LJ(4000);
                                    Integer numLJ6 = C2286608xc.LJ(4002);
                                    NLEModelResponse nLEModelResponse5 = c1419370n2V.LL;
                                    if (nLEModelResponse5 != null && (nLEModelResponseExtra2 = nLEModelResponse5.extra) != null) {
                                        str3 = nLEModelResponseExtra2.logId;
                                    } else {
                                        str3 = null;
                                    }
                                    Object objInvoke4 = c1466940oHE.invoke(numLJ5, numLJ6, "response without nle_config", str3);
                                    this.LLILLJJLI = null;
                                    this.LL = 4;
                                    if (interfaceC346701Wf.emit(objInvoke4, this) == objLJFF) {
                                        C1C7U.LIZIZ("NetRequest@98a9.requestNLE$2");
                                        return objLJFF;
                                    }
                                } else {
                                    if (str8.length() == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        statusCode = 1;
                                    }
                                    if (statusCode != 0) {
                                        Integer numLJ7 = C2286608xc.LJ(4000);
                                        Integer numLJ8 = C2286608xc.LJ(4003);
                                        NLEModelResponse nLEModelResponse6 = c1419370n2V.LL;
                                        if (nLEModelResponse6 != null && (nLEModelResponseExtra = nLEModelResponse6.extra) != null) {
                                            str2 = nLEModelResponseExtra.logId;
                                        } else {
                                            str2 = null;
                                        }
                                        Object objInvoke5 = c1466940oHE.invoke(numLJ7, numLJ8, "nleModel is empty", str2);
                                        this.LLILLJJLI = null;
                                        this.LL = 5;
                                        if (interfaceC346701Wf.emit(objInvoke5, this) == objLJFF) {
                                            C1C7U.LIZIZ("NetRequest@98a9.requestNLE$2");
                                            return objLJFF;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("NetRequest@98a9.requestNLE$2");
                    return unit;
                }
                C1419410n2Z.LIZ.getClass();
                if (th instanceof C1494690ozz) {
                    c1494690ozz = (C1494690ozz) th;
                } else {
                    c1494690ozz = null;
                }
                String str9 = "";
                if (c1494690ozz != null) {
                    str = c1494690ozz.traceCode;
                    if (str == null) {
                        str = "";
                    }
                    statusCode = c1494690ozz.getStatusCode();
                    cronetInternalErrorCode = c1494690ozz.getCronetInternalErrorCode();
                    String requestLog = c1494690ozz.getRequestLog();
                    if (requestLog != null) {
                        str9 = requestLog;
                    }
                    try {
                        new p();
                        k kVarLJJIIZ2 = p.LIZJ(str9).LJIILIIL().LJJIIZ("header");
                        if (kVarLJJIIZ2 != null && (kVarLJJIIZ = kVarLJJIIZ2.LJIILIIL().LJJIIZ("x-tt-trace-id")) != null) {
                            string = kVarLJJIIZ.toString();
                        } else {
                            string = null;
                        }
                        try {
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th2) {
                            th = th2;
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        string = null;
                    }
                    nVar = new n();
                    nVar.LJJIIJ("ttnet_trace_code", str);
                    nVar.LJJIII(Integer.valueOf(statusCode), "ttnet_status_code");
                    nVar.LJJIII(Integer.valueOf(cronetInternalErrorCode), "ttnet_internal_error_code");
                    break;
                } else {
                    nVar = null;
                    string = null;
                    str = "";
                    cronetInternalErrorCode = Integer.MIN_VALUE;
                }
                int iSwigValue = SmartMovieErrorCode.CONFIG_REQUEST_FAILURE.swigValue();
                String message = th.getMessage();
                Throwable cause = th.getCause();
                if (cause != null) {
                    localizedMessage = cause.getLocalizedMessage();
                } else {
                    localizedMessage = null;
                }
                C1417710mzp.LJJIIZ(iSwigValue, cronetInternalErrorCode, false, message, localizedMessage, str, Integer.valueOf(statusCode), str9, str, string);
                C443120HZe c443120HZe = new C443120HZe(nVar, Integer.valueOf(cronetInternalErrorCode), str);
                k kVar = (k) c443120HZe.getFirst();
                int iIntValue = ((Number) c443120HZe.getSecond()).intValue();
                Object third = c443120HZe.getThird();
                h hVar = new h();
                if (kVar != null) {
                    hVar.LJJIFFI(kVar);
                }
                C1419410n2Z.LIZ.getClass();
                hVar.LJJIFFI(C1419410n2Z.LIZIZ(th));
                Object objInvoke6 = c1466940oHE.invoke(C2286608xc.LJ(5000), C2286608xc.LJ(iIntValue), hVar.toString(), third);
                this.LLILLJJLI = null;
                this.LL = 6;
                if (interfaceC346701Wf.emit(objInvoke6, this) == objLJFF) {
                    C1C7U.LIZIZ("NetRequest@98a9.requestNLE$2");
                    return objLJFF;
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("NetRequest@98a9.requestNLE$2");
                return unit2;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                C155000ia.LIZIZ(obj);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("NetRequest@98a9.requestNLE$2");
                return unit3;
            case 6:
                C155000ia.LIZIZ(obj);
                Unit unit22 = Unit.LIZ;
                C1C7U.LIZIZ("NetRequest@98a9.requestNLE$2");
                return unit22;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C096H> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1419350n2T c1419350n2T = new C1419350n2T(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1419350n2T.LLILLJJLI = interfaceC346701Wf;
        c1419350n2T.LLILLL = th;
        return c1419350n2T.invokeSuspend(Unit.LIZ);
    }
}
