package X;

import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsPreloadFrameworkPrefetchCourseDetailSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsPreloadFrameworkPrefetchServiceBioAnchorSetting;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.EventDrivenConfig;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0edS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.infra.preloadengine.GeneralPreloadTask$start$1", f = "GeneralPreloadTask.kt", l = {}, m = "invokeSuspend")
public final class C1096320edS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1097420efE LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096320edS(C1097420efE c1097420efE, InterfaceC1364105Vn<? super C1096320edS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1097420efE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1096320edS c1096320edS = new C1096320edS(this.LLILLJJLI, interfaceC1364105Vn);
        c1096320edS.LL = obj;
        return c1096320edS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("GeneralPreloadTask@f031.start$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final C1097420efE c1097420efE = this.LLILLJJLI;
        try {
            C1092980eY4 c1092980eY4 = new C1092980eY4();
            c1092980eY4.LIZ(new C1092780eXk(new C1089010eRf()));
            c1092980eY4.LIZ = C0J0P.APP;
            C1092970eY3 c1092970eY3LIZIZ = c1092980eY4.LIZIZ();
            for (final String str : (List) c1097420efE.LIZIZ.getValue()) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start register general strategy ");
                sbLIZ.append(str);
                C1096330edT.LIZ("GeneralPreloadTask", C2188811AlT.LIZIZ(sbLIZ));
                ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).fR1(new InterfaceC1092860eXs() { // from class: X.0efA
                    @Override // X.InterfaceC1092860eXs
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LIZJ() {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v37, types: [X.0ef8, X.0efJ] */
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
                    @Override // X.InterfaceC1092860eXs
                    public final void LJ(C1092890eXv c1092890eXv) {
                        Object obj2;
                        InterfaceC805220ViK interfaceC805220ViK;
                        AbstractC2213701BkW abstractC2213701BkWLIZLLL;
                        String str2;
                        Object obj3;
                        Object obj4;
                        String string;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("strategy state change ");
                        sbLIZ2.append(c1092890eXv.LIZ);
                        C1096330edT.LIZ("GeneralPreloadTask", C2188811AlT.LIZIZ(sbLIZ2));
                        C1097420efE c1097420efE2 = c1097420efE;
                        String str3 = str;
                        long j = jCurrentTimeMillis;
                        synchronized (c1097420efE2) {
                            C0J0M c0j0m = c1092890eXv.LIZIZ;
                            Object obj5 = null;
                            if (c0j0m != null) {
                                obj2 = c0j0m.LIZ;
                            } else {
                                obj2 = null;
                            }
                            if ((obj2 instanceof InterfaceC805220ViK) && (interfaceC805220ViK = (InterfaceC805220ViK) obj2) != null && (abstractC2213701BkWLIZLLL = interfaceC805220ViK.LIZLLL()) != null && (str2 = abstractC2213701BkWLIZLLL.LIZIZ) != null) {
                                if (!Intrinsics.LJFF(str3, str2)) {
                                    return;
                                }
                                C0J0M c0j0m2 = c1092890eXv.LIZIZ;
                                if (c0j0m2 != null) {
                                    obj3 = c0j0m2.LIZIZ;
                                } else {
                                    obj3 = null;
                                }
                                JSONObject jSONObject = new JSONObject(String.valueOf(obj3));
                                Sequence sequenceLIZIZ = C09R4.LIZIZ(jSONObject.keys());
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Object obj6 : sequenceLIZIZ) {
                                    Object objOpt = jSONObject.opt((String) obj6);
                                    if (objOpt == null || (string = objOpt.toString()) == null) {
                                        string = "";
                                    }
                                    linkedHashMap.put(obj6, string);
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("onStrategyStateChange key=");
                                sbLIZ3.append(c1092890eXv.LIZ);
                                sbLIZ3.append(" value=");
                                C0J0M c0j0m3 = c1092890eXv.LIZIZ;
                                if (c0j0m3 != null) {
                                    obj4 = c0j0m3.LIZ;
                                } else {
                                    obj4 = null;
                                }
                                sbLIZ3.append(obj4);
                                C1096330edT.LIZ("GeneralPreloadTask", C2188811AlT.LIZIZ(sbLIZ3));
                                List list = (List) ((Map) c1097420efE2.LIZ.getValue()).get(str3);
                                if (list == null) {
                                    list = C13BV.INSTANCE;
                                }
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Object next = it2.next();
                                    EventDrivenConfig eventDrivenConfig = (EventDrivenConfig) next;
                                    Map<String, String> map = eventDrivenConfig.condition;
                                    if (!map.isEmpty()) {
                                        for (Map.Entry<String, String> entry : map.entrySet()) {
                                            if (!Intrinsics.LJFF(linkedHashMap.get(entry.getKey()), entry.getValue())) {
                                                break;
                                            }
                                        }
                                    }
                                    if (Intrinsics.LJFF(eventDrivenConfig.event, linkedHashMap.get("event_name"))) {
                                        obj5 = next;
                                        break;
                                    }
                                }
                                EventDrivenConfig eventDrivenConfig2 = (EventDrivenConfig) obj5;
                                if (eventDrivenConfig2 == null) {
                                    return;
                                }
                                if ((!Intrinsics.LJFF(eventDrivenConfig2.event, "livesdk_service_plus_live_room_management_page") || LivePcsPreloadFrameworkPrefetchServiceBioAnchorSetting.INSTANCE.enable()) && (!Intrinsics.LJFF(eventDrivenConfig2.event, "livesdk_service_plus_audience_service_item") || LivePcsPreloadFrameworkPrefetchCourseDetailSetting.INSTANCE.enable())) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("found matched event event=");
                                    sbLIZ4.append(eventDrivenConfig2);
                                    C1096330edT.LIZ("GeneralPreloadTask", C2188811AlT.LIZIZ(sbLIZ4));
                                    Map<String, String> map2 = eventDrivenConfig2.preloadParams;
                                    c1097420efE2.LIZIZ(map2, eventDrivenConfig2, linkedHashMap);
                                    ?? r0 = new AbstractC1097350ef7(map2) { // from class: X.0ef8
                                        public final Map<String, String> LIZJ;
                                        public final Map<String, Object> LIZLLL;
                                        public final Map<String, Boolean> LJFF;
                                        public final String LIZ = "live_pcs_event_driven_scene";
                                        public final Map<String, String> LIZIZ = C2097608Jq.LJ();
                                        public final boolean LJ = true;

                                        @Override // X.InterfaceC1097470efJ
                                        public final boolean LIZ() {
                                            return this.LJ;
                                        }

                                        @Override // X.InterfaceC1097470efJ
                                        public final Map<String, String> LIZJ() {
                                            return this.LIZJ;
                                        }

                                        @Override // X.InterfaceC1097470efJ
                                        public final Map<String, Boolean> LIZLLL() {
                                            return this.LJFF;
                                        }

                                        @Override // X.InterfaceC1097470efJ
                                        public final Map<String, Object> LJII() {
                                            return this.LIZLLL;
                                        }

                                        @Override // X.InterfaceC1097470efJ
                                        public final Map<String, String> getLogParam() {
                                            return this.LIZIZ;
                                        }

                                        @Override // X.InterfaceC1097470efJ
                                        public final String getSceneKey() {
                                            return this.LIZ;
                                        }

                                        {
                                            this.LIZJ = map2;
                                            this.LIZLLL = map2;
                                            C176600m4.LIZ();
                                            this.LJFF = C2097608Jq.LJ();
                                        }
                                    };
                                    PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig("", "", Boolean.FALSE, Boolean.FALSE, "", Boolean.FALSE, eventDrivenConfig2.config, 100);
                                    if (eventDrivenConfig2.preloadType <= 0) {
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("onStrategyStateChange strategyValue is wrong ");
                                        sbLIZ5.append(eventDrivenConfig2.preloadType);
                                        C1096330edT.LIZ("GeneralPreloadTask", C2188811AlT.LIZIZ(sbLIZ5));
                                        C1097450efH.LIZIZ(c1097420efE2.LJFF, r0, str3, "", false, Integer.valueOf(C386801es.DEFAULT), "strategy value type is wrong", System.currentTimeMillis() - j);
                                        return;
                                    }
                                    c1097420efE2.LIZ(r0, eventDrivenConfig2, preloadStrategyConfig);
                                }
                            }
                        }
                    }

                    @Override // X.InterfaceC1092860eXs
                    public final void LIZLLL(String str2, C477840IoY c477840IoY) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("register general strategy failed ");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(' ');
                        sbLIZ2.append(c477840IoY);
                        C1096330edT.LIZ("GeneralPreloadTask", C2188811AlT.LIZIZ(sbLIZ2));
                        Integer numValueOf = Integer.valueOf(c477840IoY.LIZ);
                        String str3 = c477840IoY.LIZIZ;
                        if (str3 == null) {
                            str3 = "unknown error";
                        }
                        C1097450efH.LIZIZ(null, null, str2, "-1", false, numValueOf, str3, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }, c1092970eY3LIZIZ, null, str);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start general scene failed: ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C1096330edT.LIZ("GeneralPreloadTask", C2188811AlT.LIZIZ(sbLIZ2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GeneralPreloadTask@f031.start$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
