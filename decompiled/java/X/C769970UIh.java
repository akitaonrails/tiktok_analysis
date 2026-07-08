package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectGenderAlgoResourceId;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.0UIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.GoLiveParamsListener$initFaceDetectListener$1", f = "GoLiveParamsListener.kt", l = {125}, m = "invokeSuspend")
public final class C769970UIh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C769960UIg LLILLL;
    public final /* synthetic */ C259800zU<EnumC770010UIl> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C769970UIh(C769960UIg c769960UIg, C259800zU<EnumC770010UIl> c259800zU, InterfaceC1364105Vn<? super C769970UIh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c769960UIg;
        this.LLILZ = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C769970UIh c769970UIh = new C769970UIh(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c769970UIh.LLILLJJLI = obj;
        return c769970UIh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0UHE, X.0UIj] */
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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("GoLiveParamsListener@13ef.initFaceDetectListener$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C769960UIg c769960UIg = this.LLILLL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            c769960UIg.getClass();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            String value = LiveEffectGenderAlgoResourceId.INSTANCE.getValue();
            if (value.length() == 0) {
                C189200o6.m2constructorimpl("");
                c23260099m.resumeWith("");
            } else {
                IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
                LifecycleOwner lifecycleOwner = c769960UIg.LL;
                List<String> listSingletonList = Collections.singletonList(value);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("panel", C0UD4.LJFF);
                iEffectService.fetchAndDownloadEffectList(lifecycleOwner, listSingletonList, linkedHashMap, new AwS581S0100000_2(c23260099m, 258));
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GoLiveParamsListener@13ef.initFaceDetectListener$1");
                return objLJFF;
            }
        }
        if (((String) obj).length() <= 0) {
            obj = null;
        }
        final String str = (String) obj;
        if (str == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GoLiveParamsListener@13ef.initFaceDetectListener$1");
            return unit;
        }
        final C769960UIg c769960UIg2 = this.LLILLL;
        c769960UIg2.LLJJ = str;
        final C259800zU<EnumC770010UIl> c259800zU = this.LLILZ;
        ?? r1 = new C0UHE() { // from class: X.0UIj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0UHE
            public final void onMessageReceived(int i2, int i3, int i4, String str2) {
                InterfaceC497601wk interfaceC497601wk2;
                AbstractC2238408pq abstractC2238408pq;
                C769980UIi c769980UIi;
                n nVarLJIILIIL;
                k kVarLJJIIZ;
                T t;
                if (i2 == 589825 && i3 == 1 && i4 == 1) {
                    try {
                        try {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onMessageReceived: ");
                            sbLIZ.append(i2);
                            sbLIZ.append(", arg1=");
                            sbLIZ.append(i3);
                            sbLIZ.append(", arg2=");
                            sbLIZ.append(i4);
                            sbLIZ.append(", arg3=");
                            sbLIZ.append(str2);
                            C20441214yg.LIZIZ("BeautyGenderDetect", C2188811AlT.LIZIZ(sbLIZ));
                            c769960UIg2.LLJJJ++;
                            new p();
                            k kVarLJJIIZ2 = p.LIZJ(str2).LJIILIIL().LJJIIZ("expression");
                            if (kVarLJJIIZ2 != null && (nVarLJIILIIL = kVarLJJIIZ2.LJIILIIL()) != null && (kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("boy_prob")) != null) {
                                h hVarLJIIL = kVarLJJIIZ.LJIIL();
                                C259800zU<EnumC770010UIl> c259800zU2 = c259800zU;
                                C769960UIg c769960UIg3 = c769960UIg2;
                                if (hVarLJIIL.size() == 1 && ((k) C13LP.LJJJJZ(hVarLJIIL)).LJIIIZ() > 0.5d) {
                                    t = EnumC770010UIl.MALE;
                                } else if (hVarLJIIL.size() == 1 && ((k) C13LP.LJJJJZ(hVarLJIIL)).LJIIIZ() == -1.0d) {
                                    if (c769960UIg3.LLJJJ <= 5) {
                                        t = EnumC770010UIl.DEFAULT;
                                    } else {
                                        t = EnumC770010UIl.FAILED;
                                    }
                                } else if (hVarLJIIL.size() == 1 && ((k) C13LP.LJJJJZ(hVarLJIIL)).LJIIIZ() <= 0.5d) {
                                    t = EnumC770010UIl.FEMALE;
                                } else if (hVarLJIIL.size() > 1) {
                                    t = EnumC770010UIl.MULTIPLE;
                                } else if (c769960UIg3.LLJJJ <= 5) {
                                    t = EnumC770010UIl.DEFAULT;
                                } else {
                                    t = EnumC770010UIl.NULL;
                                }
                                c259800zU2.element = t;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJI("Error parsing face detect", e);
                            if (c259800zU.element != EnumC770010UIl.DEFAULT) {
                                C20441214yg.LIZIZ("BeautyGenderDetect", "remove effect");
                                interfaceC497601wk2 = interfaceC497601wk;
                                C1DFH c1dfh = C0PEM.LIZ;
                                abstractC2238408pq = C2107308Nj.LIZ;
                                c769980UIi = new C769980UIi(c769960UIg2, str, null);
                            } else {
                                return;
                            }
                        }
                        if (c259800zU.element != EnumC770010UIl.DEFAULT) {
                            C20441214yg.LIZIZ("BeautyGenderDetect", "remove effect");
                            interfaceC497601wk2 = interfaceC497601wk;
                            C1DFH c1dfh2 = C0PEM.LIZ;
                            abstractC2238408pq = C2107308Nj.LIZ;
                            c769980UIi = new C769980UIi(c769960UIg2, str, null);
                            C23250099c.LIZLLL(interfaceC497601wk2, abstractC2238408pq, null, c769980UIi, 2);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (c259800zU.element != EnumC770010UIl.DEFAULT) {
                            C20441214yg.LIZIZ("BeautyGenderDetect", "remove effect");
                            InterfaceC497601wk interfaceC497601wk3 = interfaceC497601wk;
                            C1DFH c1dfh3 = C0PEM.LIZ;
                            C23250099c.LIZLLL(interfaceC497601wk3, C2107308Nj.LIZ, null, new C769980UIi(c769960UIg2, str, null), 2);
                        }
                        throw th;
                    }
                }
            }
        };
        c769960UIg2.LLJILJILJ = r1;
        c769960UIg2.LJIIIZ(r1);
        C20441214yg.LIZIZ("BeautyGenderDetect", "set effect");
        this.LLILLL.LLILLL.setEffect(str);
        this.LLILLL.LLJILLL.set(true);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GoLiveParamsListener@13ef.initFaceDetectListener$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
