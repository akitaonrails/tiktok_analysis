package Y;

import X.C09JN;
import X.C0B09;
import X.C0C5T;
import X.C0C7T;
import X.C0C7W;
import X.C0C7Z;
import X.C0CFL;
import X.C0CJY;
import X.C0CKZ;
import X.C0POE;
import X.C0X52;
import X.C118300cf;
import X.C1515820pY4;
import X.C1720406oU;
import X.C1C7U;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C259800zU;
import X.C311520CJa;
import X.C311570CJf;
import X.C311580CJg;
import X.C311590CJh;
import X.C311600CJi;
import X.EnumC311620CJk;
import X.EnumC311630CJl;
import X.InterfaceC420801kM;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS13S0400000_4;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonChunkTask;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonRequest;
import com.ss.android.ugc.aweme.settingsrequest.api.FetchABTestCommonTask;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedChunkTask;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedRequest;
import com.ss.android.ugc.aweme.settingsrequest.api.optimized.FetchABTestCommonOptimizedTask;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS150S1200000_4;
import kotlin.jvm.internal.AwS282S0300000_4;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes5.dex */
public class AfS102S0300000_4 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS102S0300000_4 afS102S0300000_4, Object obj) {
        C1C7U.LIZ("PluginService@95b4.prefetchABSettings$1");
        C0X52<IPluginService.OnboardingConfigResponse> c0x52 = (C0X52) obj;
        ((PluginService) afS102S0300000_4.l0).processPrefetchedAbConfig(c0x52);
        ((PluginService) afS102S0300000_4.l0).processCallback(c0x52, (Function1) afS102S0300000_4.l1);
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS102S0300000_4.l2).element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C1C7U.LIZIZ("PluginService@95b4.prefetchABSettings$1");
    }

    public static final void accept$1(AfS102S0300000_4 afS102S0300000_4, Object obj) {
        C1C7U.LIZ("FetchABTestCommonChunkTask@eeed.run$result$2");
        final C259800zU c259800zU = new C259800zU();
        final C311600CJi c311600CJi = (C311600CJi) afS102S0300000_4.l0;
        final FetchABTestCommonChunkTask fetchABTestCommonChunkTask = (FetchABTestCommonChunkTask) afS102S0300000_4.l1;
        final C118300cf c118300cf = (C118300cf) afS102S0300000_4.l2;
        ((C1515820pY4) obj).LIZLLL(new C0POE<C311580CJg>() { // from class: X.0CJd
            @Override // X.C0POE
            public final void onComplete() throws JSONException {
                C311600CJi c311600CJi2 = c311600CJi;
                if (c311600CJi2 != null) {
                    FetchABTestCommonChunkTask fetchABTestCommonChunkTask2 = fetchABTestCommonChunkTask;
                    c311600CJi2.LJIILJJIL = fetchABTestCommonChunkTask2.LLILLJJLI;
                    c311600CJi2.LJIIIIZZ = fetchABTestCommonChunkTask2.LLILLL;
                    c311600CJi2.LJI(fetchABTestCommonChunkTask2.LLILZIL);
                    c311600CJi2.LJIILIIL = fetchABTestCommonChunkTask2.LLIZ;
                    c311600CJi2.LJIILLIIL = fetchABTestCommonChunkTask2.LLIZLLLIL;
                    c311600CJi2.LJIIZILJ = fetchABTestCommonChunkTask2.LLJ.LIZJ;
                    c311600CJi2.LIZJ();
                }
                fetchABTestCommonChunkTask.LJIIIIZZ();
                C311520CJa.LIZ.LIZJ();
            }

            @Override // X.C0POE
            public final void onFailed(Throwable th) throws Throwable {
                C311600CJi c311600CJi2 = c311600CJi;
                if (c311600CJi2 != null) {
                    c311600CJi2.LJ(3);
                }
                c118300cf.element++;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("chunk error: ");
                sbLIZ.append(c118300cf.element);
                sbLIZ.append(", ");
                sbLIZ.append(th);
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ), th);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v14, types: [T] */
            @Override // X.C0POE
            public final void onNext(C311580CJg c311580CJg) throws Throwable {
                k kVar;
                n nVarLJIILIIL;
                final C0CFL c0cfl;
                final C0C7W c0c7w;
                String str;
                String lowerCase;
                String str2;
                C311580CJg c311580CJg2 = c311580CJg;
                C311600CJi c311600CJi2 = c311600CJi;
                if (c311600CJi2 != null) {
                    c311600CJi2.LJII();
                }
                C080U c080u = null;
                if (c311580CJg2 != null && (kVar = c311580CJg2.LIZ) != null && (nVarLJIILIIL = kVar.LJIILIIL()) != null) {
                    fetchABTestCommonChunkTask.LLIZ += c311580CJg2.LIZIZ;
                    int iIntValue = nVarLJIILIIL.LJJIJIIJI("code").LJIJ().intValue();
                    if (iIntValue != 0) {
                        C311600CJi c311600CJi3 = c311600CJi;
                        if (c311600CJi3 != null) {
                            c311600CJi3.LJIJ = iIntValue;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("chunk code:");
                        sbLIZ.append(iIntValue);
                        sbLIZ.append(", chunkIndex: ");
                        sbLIZ.append(c118300cf.element);
                        sbLIZ.append(' ');
                        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    int iIntValue2 = nVarLJIILIIL.LJJIJIIJI("chunk_num").LJIJ().intValue() - 1;
                    int iIntValue3 = nVarLJIILIIL.LJJIJIIJI("chunk_index").LJIJ().intValue();
                    if (iIntValue3 == 0) {
                        FetchABTestCommonChunkTask fetchABTestCommonChunkTask2 = fetchABTestCommonChunkTask;
                        fetchABTestCommonChunkTask2.LLILZIL = EnumC311620CJk.SUCCESS;
                        C311570CJf c311570CJf = fetchABTestCommonChunkTask2.LLJ;
                        List<C080U> list = c311570CJf.LIZ;
                        if (list != null) {
                            Iterator<C080U> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C080U next = it2.next();
                                C080U c080u2 = next;
                                if (c080u2 != null && (str2 = c080u2.LIZ) != null) {
                                    lowerCase = str2.toLowerCase(Locale.ROOT);
                                } else {
                                    lowerCase = null;
                                }
                                if (Intrinsics.LJFF(lowerCase, "x-tt-logid")) {
                                    c080u = next;
                                    break;
                                }
                            }
                            C080U c080u3 = c080u;
                            if (c080u3 != null && (str = c080u3.LIZIZ) != null) {
                                int i = C2187451AjH.LIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("x-tt-logid:");
                                sbLIZ2.append(str);
                                C1720106oR.LJI("FetchAB/FetchABTestCommonChunkRequest", C2188811AlT.LIZIZ(sbLIZ2));
                                ISettingsRequestService iSettingsRequestService = (ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class);
                                if (iSettingsRequestService != null) {
                                    iSettingsRequestService.LJIIJJI(C2097608Jq.LJIIJ(new Pair("commonLogId", str)));
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("x-tt-logid", str);
                                String str3 = c311570CJf.LIZIZ;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                linkedHashMap.put("url", str3);
                                ISettingRequestExtraInfo iSettingRequestExtraInfo = (ISettingRequestExtraInfo) ServiceManager.get().getService(ISettingRequestExtraInfo.class);
                                if (iSettingRequestExtraInfo != null) {
                                    iSettingRequestExtraInfo.LIZIZ(linkedHashMap);
                                }
                            }
                        }
                        if (iIntValue2 == 0) {
                            c0cfl = C0CFL.FIRST_FINISH;
                        } else {
                            c0cfl = C0CFL.FIRST;
                        }
                    } else if (iIntValue3 == iIntValue2) {
                        c0cfl = C0CFL.FINISH;
                    } else {
                        c0cfl = C0CFL.MIDDLE;
                    }
                    C311600CJi c311600CJi4 = c311600CJi;
                    if (c311600CJi4 != null) {
                        c311600CJi4.LJIIJ = SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        c311600CJi4.LJIJJ = c311580CJg2.LIZIZ;
                    }
                    C259800zU<n> c259800zU2 = c259800zU;
                    final FetchABTestCommonChunkTask fetchABTestCommonChunkTask3 = fetchABTestCommonChunkTask;
                    final C311600CJi c311600CJi5 = c311600CJi;
                    ?? r0 = c259800zU2.element;
                    fetchABTestCommonChunkTask3.getClass();
                    k kVar2 = c311580CJg2.LIZ;
                    T t = r0;
                    if (kVar2 != null) {
                        final n nVarLJIILIIL2 = kVar2.LJIILIIL();
                        final C259800zU c259800zU3 = new C259800zU();
                        c259800zU3.element = r0;
                        if (fetchABTestCommonChunkTask3.LLJI) {
                            c0c7w = C0C7W.CHUNK_ALL_UPDATE;
                        } else {
                            c0c7w = C0C7W.CHUNK_INCREMENT_UPDATE;
                        }
                        try {
                            C303320Buk.LIZ(new Runnable() { // from class: X.0CJR
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:67:0x01b7  */
                                /* JADX WARN: Type inference failed for: r11v0, types: [T, com.google.gson.n, java.lang.Object] */
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
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void LIZ() throws org.json.JSONException {
                                    /*
                                        Method dump skipped, instruction units count: 1196
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C0CJR.LIZ():void");
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("FetchABTestCommonChunkTask@eeed.storeValue$runnable$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("FetchABTestCommonChunkTask@eeed.storeValue$runnable$1");
                                }
                            });
                            t = c259800zU3.element;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            fetchABTestCommonChunkTask3.LLILZIL = EnumC311620CJk.OTHER_FAILED;
                            if (c311600CJi5 != null) {
                                c311600CJi5.LIZIZ(2);
                                c311600CJi5.LJ(3);
                                c311600CJi5.LJFF(th.toString());
                            }
                            throw th;
                        }
                    }
                    c259800zU2.element = t;
                    c118300cf.element++;
                    return;
                }
                throw new Throwable("chunk is null");
            }
        });
        C1C7U.LIZIZ("FetchABTestCommonChunkTask@eeed.run$result$2");
    }

    public static final void accept$2(AfS102S0300000_4 afS102S0300000_4, Object obj) throws JSONException {
        IAppContextService iAppContextService;
        int i;
        C1C7U.LIZ("FetchABTestCommonChunkTask@eeed.run$result$3");
        Throwable th = (Throwable) obj;
        C311600CJi c311600CJi = (C311600CJi) afS102S0300000_4.l0;
        if (c311600CJi != null) {
            FetchABTestCommonChunkTask fetchABTestCommonChunkTask = (FetchABTestCommonChunkTask) afS102S0300000_4.l1;
            c311600CJi.LJIILJJIL = fetchABTestCommonChunkTask.LLILLJJLI;
            int i2 = fetchABTestCommonChunkTask.LLILLL;
            c311600CJi.LJIIIIZZ = i2;
            if (i2 == fetchABTestCommonChunkTask.LLILZ) {
                i = 3;
            } else {
                i = 4;
            }
            c311600CJi.LJI = i;
            c311600CJi.LJI(fetchABTestCommonChunkTask.LLILZIL);
            c311600CJi.LJFF(String.valueOf(th.getMessage()));
            c311600CJi.LJIILIIL = fetchABTestCommonChunkTask.LLIZ;
            c311600CJi.LJIILLIIL = fetchABTestCommonChunkTask.LLIZLLLIL;
            c311600CJi.LJIIZILJ = fetchABTestCommonChunkTask.LLJ.LIZJ;
            c311600CJi.LIZJ();
        }
        ((FetchABTestCommonChunkTask) afS102S0300000_4.l1).LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchABTestCommonRequest failed, is_combine = false, throwable = ");
        sbLIZ.append(th);
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!C1720406oU.LIZIZ.LIZ("config_fetch_success")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT);
            c2344009Gk.LJIIIIZZ("source", "1");
            C20684815ws.LJIILLIIL("config_fetch_success", c2344009Gk.LIZ);
        }
        C311520CJa.LIZ.LIZJ();
        if (((Boolean) C0B09.LIZ.getValue()).booleanValue() && (iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null)) != null && !iAppContextService.isAppBackground()) {
            new FetchABTestCommonTask(((FetchABTestCommonChunkTask) afS102S0300000_4.l1).LL).run((Context) afS102S0300000_4.l2);
        }
        C1C7U.LIZIZ("FetchABTestCommonChunkTask@eeed.run$result$3");
    }

    public static final void accept$3(AfS102S0300000_4 afS102S0300000_4, Object obj) throws JSONException {
        C1C7U.LIZ("FetchABTestCommonRequest@87b9.request$result$5");
        C0CJY c0cjy = (C0CJY) obj;
        try {
            C311600CJi c311600CJi = (C311600CJi) afS102S0300000_4.l0;
            if (c311600CJi != null) {
                c311600CJi.LJIIJ = SystemClock.elapsedRealtimeNanos() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
            C0CKZ.LIZLLL.LJI("ab_common_request_duration");
            ARunnableS13S0400000_4 aRunnableS13S0400000_4 = new ARunnableS13S0400000_4(c0cjy, (FetchABTestCommonRequest) afS102S0300000_4.l1, (C311600CJi) afS102S0300000_4.l0, (Context) afS102S0300000_4.l2, 0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C311600CJi c311600CJi2 = (C311600CJi) afS102S0300000_4.l0;
            if (c311600CJi2 != null) {
                c311600CJi2.LJI(EnumC311620CJk.DATA_STORE_FAILED);
                c311600CJi2.LJFF(th.toString());
                c311600CJi2.LIZJ();
            }
        }
        C1C7U.LIZIZ("FetchABTestCommonRequest@87b9.request$result$5");
    }

    public static final void accept$4(AfS102S0300000_4 afS102S0300000_4, Object obj) throws JSONException {
        IAppContextService iAppContextService;
        C1C7U.LIZ("FetchABTestCommonOptimizedChunkTask@1720.run$result$3");
        Throwable th = (Throwable) obj;
        C311590CJh c311590CJh = (C311590CJh) afS102S0300000_4.l0;
        if (c311590CJh != null) {
            FetchABTestCommonOptimizedChunkTask fetchABTestCommonOptimizedChunkTask = (FetchABTestCommonOptimizedChunkTask) afS102S0300000_4.l1;
            c311590CJh.LJ(fetchABTestCommonOptimizedChunkTask.LLILLJJLI.LIZ);
            c311590CJh.LIZLLL(String.valueOf(th.getMessage()));
            c311590CJh.LJIILIIL = fetchABTestCommonOptimizedChunkTask.LLILZ;
            c311590CJh.LJIIZILJ = fetchABTestCommonOptimizedChunkTask.LLILZIL.LIZJ;
            c311590CJh.LIZIZ();
        }
        FetchABTestCommonOptimizedChunkTask fetchABTestCommonOptimizedChunkTask2 = (FetchABTestCommonOptimizedChunkTask) afS102S0300000_4.l1;
        fetchABTestCommonOptimizedChunkTask2.LLILZ = 0;
        fetchABTestCommonOptimizedChunkTask2.LLILZIL = new C311570CJf(0);
        fetchABTestCommonOptimizedChunkTask2.LLILZLL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchABTestCommonRequest failed, is_combine = false, throwable = ");
        sbLIZ.append(th);
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!C1720406oU.LIZIZ.LIZ("config_fetch_success")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT);
            c2344009Gk.LJIIIIZZ("source", "1");
            C20684815ws.LJIILLIIL("config_fetch_success", c2344009Gk.LIZ);
        }
        C311520CJa.LIZ.LIZJ();
        if (((Boolean) C0B09.LIZ.getValue()).booleanValue() && (iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null)) != null && !iAppContextService.isAppBackground()) {
            FetchABTestCommonOptimizedChunkTask fetchABTestCommonOptimizedChunkTask3 = (FetchABTestCommonOptimizedChunkTask) afS102S0300000_4.l1;
            new FetchABTestCommonOptimizedTask(fetchABTestCommonOptimizedChunkTask3.LL, fetchABTestCommonOptimizedChunkTask3.LLILLJJLI).run((Context) afS102S0300000_4.l2);
        }
        C1C7U.LIZIZ("FetchABTestCommonOptimizedChunkTask@1720.run$result$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(AfS102S0300000_4 afS102S0300000_4, Object obj) {
        C1C7U.LIZ("FetchABTestCommonOptimizedRequest@46af.request$result$5");
        C0CJY c0cjy = (C0CJY) obj;
        try {
            final n nVar = c0cjy.LIZIZ;
            final String str = c0cjy.LIZ;
            FetchABTestCommonOptimizedRequest fetchABTestCommonOptimizedRequest = (FetchABTestCommonOptimizedRequest) afS102S0300000_4.l0;
            C0C7T c0c7t = fetchABTestCommonOptimizedRequest.LLILLJJLI;
            C0C5T c0c5t = new C0C5T(fetchABTestCommonOptimizedRequest.LLILZ);
            C311590CJh c311590CJh = (C311590CJh) afS102S0300000_4.l1;
            C0CFL c0cfl = C0CFL.FINISH;
            C0C7W c0c7w = (C0C7W) ((C259800zU) afS102S0300000_4.l2).element;
            final FetchABTestCommonOptimizedRequest fetchABTestCommonOptimizedRequest2 = (FetchABTestCommonOptimizedRequest) afS102S0300000_4.l0;
            c0c7t.LIZLLL(c0c5t, c311590CJh, nVar, c0cfl, c0c7w, new C0C7Z(str, nVar) { // from class: X.0CJ6
                public final /* synthetic */ n LIZIZ;

                @Override // X.C0C7Z
                public final void LIZJ() {
                }

                @Override // X.C0C7Z
                public final void LIZIZ(n nVar2) {
                    if (nVar2 != null && C0CLN.LIZJ()) {
                        C823050WQl.LIZIZ().submit(new ARunnableS104S0100000_4(nVar2, 41));
                    }
                }

                {
                    this.LIZIZ = nVar;
                }

                @Override // X.C0C7Z
                public final void LIZ(n nVar2, List<String> list, n nVar3) {
                    String strLJIL;
                    this.LIZ.getClass();
                    C0CKZ c0ckz = C0CKZ.LIZLLL;
                    c0ckz.LJI("ab_common_request_save_config_data");
                    c0ckz.LJ("ab_common_request_save_config_data_finish_to_end");
                    C2155308cR.LIZ();
                    C0C5Q.LIZ = null;
                    if (nVar3 != null) {
                        FetchABTestCommonOptimizedRequest fetchABTestCommonOptimizedRequest3 = this.LIZ;
                        AwS282S0300000_4 awS282S0300000_4 = new AwS282S0300000_4(nVar2, fetchABTestCommonOptimizedRequest3, this.LIZIZ, 2);
                        fetchABTestCommonOptimizedRequest3.getClass();
                        C11S5.LIZ().LIZIZ(new ARunnableS13S0400000_4(fetchABTestCommonOptimizedRequest3, nVar3, list, awS282S0300000_4, 5));
                    }
                    FetchABTestCommonOptimizedRequest fetchABTestCommonOptimizedRequest4 = this.LIZ;
                    n nVar4 = this.LIZIZ;
                    fetchABTestCommonOptimizedRequest4.getClass();
                    try {
                        q qVarLJJIJIIJI = nVar4.LJJIJIIJI("meta_version");
                        if (qVarLJJIJIIJI == null || (strLJIL = qVarLJJIJIIJI.LJIL()) == null) {
                            strLJIL = "";
                        }
                        C0CL9.LIZIZ(strLJIL);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
            C311590CJh c311590CJh2 = (C311590CJh) afS102S0300000_4.l1;
            if (c311590CJh2 != null) {
                C0C7T c0c7t2 = ((FetchABTestCommonOptimizedRequest) afS102S0300000_4.l0).LLILLJJLI;
                c311590CJh2.LJIILJJIL = c0c7t2.LIZIZ;
                c311590CJh2.LJIIIIZZ = c0c7t2.LIZJ;
                c311590CJh2.LJ(c0c7t2.LIZ);
                c311590CJh2.LIZIZ();
            }
            C311520CJa.LIZ.LIZJ();
            C1C7U.LIZIZ("FetchABTestCommonOptimizedRequest@46af.request$result$5");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0C7T c0c7t3 = ((FetchABTestCommonOptimizedRequest) afS102S0300000_4.l0).LLILLJJLI;
            if (c0c7t3.LIZ == EnumC311630CJl.SUCCESS) {
                c0c7t3.LIZ = EnumC311630CJl.OTHER_FAILED;
            }
            throw th;
        }
    }

    public static final void accept$6(AfS102S0300000_4 afS102S0300000_4, Object obj) throws JSONException {
        C1C7U.LIZ("FetchABTestCommonOptimizedRequest@46af.request$result$6");
        Throwable th = (Throwable) obj;
        C311590CJh c311590CJh = (C311590CJh) afS102S0300000_4.l0;
        if (c311590CJh != null) {
            c311590CJh.LJ(((FetchABTestCommonOptimizedRequest) afS102S0300000_4.l1).LLILLJJLI.LIZ);
            c311590CJh.LIZLLL(String.valueOf(th.getMessage()));
            c311590CJh.LIZIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchABTestCommonRequest failed, is_combine = false, throwable = ");
        sbLIZ.append(th);
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!C1720406oU.LIZIZ.LIZ("config_fetch_success")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT);
            c2344009Gk.LJIIIIZZ("source", "1");
            C20684815ws.LJIILLIIL("config_fetch_success", c2344009Gk.LIZ);
        }
        C311520CJa.LIZ.LIZJ();
        IAppContextService iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
        if (iAppContextService != null && !iAppContextService.isAppBackground()) {
            new FetchABTestCommonTask(((FetchABTestCommonOptimizedRequest) afS102S0300000_4.l1).LL).run((Context) afS102S0300000_4.l2);
        }
        C1C7U.LIZIZ("FetchABTestCommonOptimizedRequest@46af.request$result$6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$7(AfS102S0300000_4 afS102S0300000_4, Object obj) {
        C1C7U.LIZ("FetchABTestCommonOptimizedTask@962.run$result$5");
        C0CJY c0cjy = (C0CJY) obj;
        try {
            final n nVar = c0cjy.LIZIZ;
            final String str = c0cjy.LIZ;
            FetchABTestCommonOptimizedTask fetchABTestCommonOptimizedTask = (FetchABTestCommonOptimizedTask) afS102S0300000_4.l0;
            C0C7T c0c7t = fetchABTestCommonOptimizedTask.LLILLJJLI;
            C0C5T c0c5t = new C0C5T(fetchABTestCommonOptimizedTask.LLILZ);
            C311590CJh c311590CJh = (C311590CJh) afS102S0300000_4.l1;
            C0CFL c0cfl = C0CFL.FINISH;
            C0C7W c0c7w = (C0C7W) ((C259800zU) afS102S0300000_4.l2).element;
            final FetchABTestCommonOptimizedTask fetchABTestCommonOptimizedTask2 = (FetchABTestCommonOptimizedTask) afS102S0300000_4.l0;
            c0c7t.LIZLLL(c0c5t, c311590CJh, nVar, c0cfl, c0c7w, new C0C7Z() { // from class: X.0CJ7
                @Override // X.C0C7Z
                public final void LIZJ() {
                }

                @Override // X.C0C7Z
                public final void LIZIZ(n nVar2) {
                    if (nVar2 != null && C0CLN.LIZJ()) {
                        C823050WQl.LIZIZ().submit(new ARunnableS104S0100000_4(nVar2, 42));
                    }
                }

                @Override // X.C0C7Z
                public final void LIZ(n nVar2, List<String> list, n nVar3) {
                    String strLJIL;
                    if (nVar3 != null) {
                        FetchABTestCommonOptimizedTask fetchABTestCommonOptimizedTask3 = fetchABTestCommonOptimizedTask2;
                        AwS150S1200000_4 awS150S1200000_4 = new AwS150S1200000_4(fetchABTestCommonOptimizedTask3, nVar, str, 0);
                        fetchABTestCommonOptimizedTask3.getClass();
                        C11S5.LIZ().LIZIZ(new ARunnableS13S0400000_4(fetchABTestCommonOptimizedTask3, nVar3, list, awS150S1200000_4, 6));
                    }
                    FetchABTestCommonOptimizedTask fetchABTestCommonOptimizedTask4 = fetchABTestCommonOptimizedTask2;
                    n nVar4 = nVar;
                    fetchABTestCommonOptimizedTask4.getClass();
                    try {
                        q qVarLJJIJIIJI = nVar4.LJJIJIIJI("meta_version");
                        if (qVarLJJIJIIJI == null || (strLJIL = qVarLJJIJIIJI.LJIL()) == null) {
                            strLJIL = "";
                        }
                        C0CL9.LIZIZ(strLJIL);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
            C311590CJh c311590CJh2 = (C311590CJh) afS102S0300000_4.l1;
            if (c311590CJh2 != null) {
                C0C7T c0c7t2 = ((FetchABTestCommonOptimizedTask) afS102S0300000_4.l0).LLILLJJLI;
                c311590CJh2.LJIILJJIL = c0c7t2.LIZIZ;
                c311590CJh2.LJIIIIZZ = c0c7t2.LIZJ;
                c311590CJh2.LJ(c0c7t2.LIZ);
                c311590CJh2.LIZIZ();
            }
            C311520CJa.LIZ.LIZJ();
            C1C7U.LIZIZ("FetchABTestCommonOptimizedTask@962.run$result$5");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0C7T c0c7t3 = ((FetchABTestCommonOptimizedTask) afS102S0300000_4.l0).LLILLJJLI;
            if (c0c7t3.LIZ == EnumC311630CJl.SUCCESS) {
                c0c7t3.LIZ = EnumC311630CJl.OTHER_FAILED;
            }
            throw th;
        }
    }

    public static final void accept$8(AfS102S0300000_4 afS102S0300000_4, Object obj) throws JSONException {
        C1C7U.LIZ("FetchABTestCommonOptimizedTask@962.run$result$6");
        Throwable th = (Throwable) obj;
        C311590CJh c311590CJh = (C311590CJh) afS102S0300000_4.l0;
        if (c311590CJh != null) {
            c311590CJh.LJ(((FetchABTestCommonOptimizedTask) afS102S0300000_4.l1).LLILLJJLI.LIZ);
            c311590CJh.LIZLLL(String.valueOf(th.getMessage()));
            c311590CJh.LIZIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchABTestCommonRequest failed, is_combine = false, throwable = ");
        sbLIZ.append(th);
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!C1720406oU.LIZIZ.LIZ("config_fetch_success")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT);
            c2344009Gk.LJIIIIZZ("source", "1");
            C20684815ws.LJIILLIIL("config_fetch_success", c2344009Gk.LIZ);
        }
        C311520CJa.LIZ.LIZJ();
        IAppContextService iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
        if (iAppContextService != null && !iAppContextService.isAppBackground()) {
            new FetchABTestCommonTask(((FetchABTestCommonOptimizedTask) afS102S0300000_4.l1).LL).run((Context) afS102S0300000_4.l2);
        }
        C1C7U.LIZIZ("FetchABTestCommonOptimizedTask@962.run$result$6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS102S0300000_4(Object obj, PluginService pluginService, Function1<? super IPluginService.OnboardingConfigResponse, Unit> function1, C259800zU<InterfaceC420801kM> c259800zU) {
        this.$t = c259800zU;
        this.l0 = obj;
        this.l1 = pluginService;
        this.l2 = function1;
    }
}
