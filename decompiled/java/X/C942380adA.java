package X;

import android.graphics.Rect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS99S1200000_15;
import njp.a;

/* JADX INFO: renamed from: X.0adA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji.MultiGuestMicSeatEmojiPlayer$addEmojiToMicSeat$1", f = "MultiGuestMicSeatEmojiPlayer.kt", l = {85}, m = "invokeSuspend")
public final class C942380adA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C942410adD LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C942380adA(C942410adD c942410adD, List<String> list, long j, long j2, InterfaceC1364105Vn<? super C942380adA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c942410adD;
        this.LLILLL = list;
        this.LLILZ = j;
        this.LLILZIL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C942380adA(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ = obj;
        C1C7U.LIZ("MultiGuestMicSeatEmojiPlayer@e495.addEmojiToMicSeat$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            C942410adD c942410adD = this.LLILLJJLI;
            this.LL = 1;
            objLIZIZ = c942410adD.LIZIZ(this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("MultiGuestMicSeatEmojiPlayer@e495.addEmojiToMicSeat$1");
                return objLJFF;
            }
        }
        Rect rect = (Rect) objLIZIZ;
        if (rect == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MultiGuestMicSeatEmojiPlayer@e495.addEmojiToMicSeat$1");
            return unit;
        }
        C118300cf c118300cf = new C118300cf();
        C238400w2 c238400w2 = new C238400w2();
        LIZ(this.LLILLL.size(), this.LLILZ, this.LLILZIL, rect, this.LLILLJJLI, this.LLILLL, c118300cf, c238400w2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MultiGuestMicSeatEmojiPlayer@e495.addEmojiToMicSeat$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static final void LIZ(int i, long j, long j2, Rect rect, C942410adD c942410adD, List list, C118300cf c118300cf, C238400w2 c238400w2) {
        int i2 = c118300cf.element;
        if (i2 < i) {
            String str = (String) ListProtector.get(list, i2);
            C942390adB c942390adB = new C942390adB(i, j, j2, rect, c942410adD, list, c118300cf, c238400w2);
            final C942440adG c942440adG = c942410adD.LIZLLL;
            final C1143800fs2 c1143800fs2 = new C1143800fs2(j, c942410adD, str, rect, c942390adB);
            final AwS99S1200000_15 awS99S1200000_15 = new AwS99S1200000_15(c942410adD, str, c942390adB, 9);
            c942440adG.getClass();
            if (str.length() == 0) {
                awS99S1200000_15.invoke("resource id is empty");
            }
            C01GW c01gw = C762030Tur.LIZ;
            C762030Tur.LIZLLL(c942440adG.LIZ, "live_mic_seat_emoticon", str, new InterfaceC760840Tsw() { // from class: X.0UNv
                @Override // X.InterfaceC760840Tsw
                public final void onFail() {
                    C20441214yg.LJ("MultiGuestMicSeatEmojiDataSource", "getEmojiResource fail");
                    onFail();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
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
                /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v6 boolean
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                    */
                @Override // X.InterfaceC760840Tsw
                public final void LIZ(com.bytedance.android.livesdkapi.depend.model.LiveEffect r9) {
                    /*
                        r8 = this;
                        java.lang.String r3 = "repeat_mode"
                        java.lang.String r2 = ""
                        if (r9 != 0) goto Le
                        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r1 = r3
                        java.lang.String r0 = "live effect is null"
                        r1.invoke(r0)
                        return
                    Le:
                        com.google.gson.p r0 = new com.google.gson.p     // Catch: java.lang.Exception -> L8c
                        r0.<init>()     // Catch: java.lang.Exception -> L8c
                        java.lang.String r0 = r9.getExtra()     // Catch: java.lang.Exception -> L8c
                        com.google.gson.k r0 = com.google.gson.p.LIZJ(r0)     // Catch: java.lang.Exception -> L8c
                        com.google.gson.n r1 = r0.LJIILIIL()     // Catch: java.lang.Exception -> L8c
                        X.00zU r7 = new X.00zU     // Catch: java.lang.Exception -> L8c
                        r7.<init>()     // Catch: java.lang.Exception -> L8c
                        r7.element = r2     // Catch: java.lang.Exception -> L8c
                        boolean r0 = r1.LJJIJIIJIL(r3)     // Catch: java.lang.Exception -> L8c
                        if (r0 == 0) goto L36
                        com.google.gson.k r0 = r1.LJJIIZ(r3)     // Catch: java.lang.Exception -> L8c
                        java.lang.String r0 = r0.LJIL()     // Catch: java.lang.Exception -> L8c
                        r7.element = r0     // Catch: java.lang.Exception -> L8c
                    L36:
                        java.lang.String r0 = "emoticon_resource"
                        com.google.gson.k r0 = r1.LJJIIZ(r0)     // Catch: java.lang.Exception -> L8c
                        java.lang.String r5 = r0.LJIL()     // Catch: java.lang.Exception -> L8c
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L8c
                        java.lang.String r0 = r9.LJI()     // Catch: java.lang.Exception -> L8c
                        if (r0 == 0) goto L4b
                        r2 = r0
                    L4b:
                        r1.append(r2)     // Catch: java.lang.Exception -> L8c
                        r1.append(r5)     // Catch: java.lang.Exception -> L8c
                        java.lang.String r6 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L8c
                        X.0adG r0 = r1     // Catch: java.lang.Exception -> L8c
                        X.0UNp r0 = r0.LIZIZ     // Catch: java.lang.Exception -> L8c
                        java.lang.String r0 = r0.getFullPath()     // Catch: java.lang.Exception -> L8c
                        X.0VSJ r2 = new X.0VSJ     // Catch: java.lang.Exception -> L8c
                        r2.<init>(r0, r5)     // Catch: java.lang.Exception -> L8c
                        boolean r0 = r2.exists()     // Catch: java.lang.Exception -> L8c
                        if (r0 == 0) goto L70
                        kotlin.jvm.functions.Function2<java.io.File, java.lang.String, kotlin.Unit> r1 = r2     // Catch: java.lang.Exception -> L8c
                        T r0 = r7.element     // Catch: java.lang.Exception -> L8c
                        r1.invoke(r2, r0)     // Catch: java.lang.Exception -> L8c
                        return
                    L70:
                        X.0adG r4 = r1     // Catch: java.lang.Exception -> L8c
                        kotlin.jvm.internal.AwS378S0200000_12 r3 = new kotlin.jvm.internal.AwS378S0200000_12     // Catch: java.lang.Exception -> L8c
                        kotlin.jvm.functions.Function2<java.io.File, java.lang.String, kotlin.Unit> r1 = r2     // Catch: java.lang.Exception -> L8c
                        r0 = 103(0x67, float:1.44E-43)
                        r3.<init>(r1, r7, r0)     // Catch: java.lang.Exception -> L8c
                        r4.getClass()     // Catch: java.lang.Exception -> L8c
                        X.01GW r0 = X.C762030Tur.LIZ     // Catch: java.lang.Exception -> L8c
                        X.0UNp r2 = r4.LIZIZ     // Catch: java.lang.Exception -> L8c
                        kotlin.jvm.internal.AwS97S1200000_12 r1 = new kotlin.jvm.internal.AwS97S1200000_12     // Catch: java.lang.Exception -> L8c
                        r0 = 3
                        r1.<init>(r4, r3, r5, r0)     // Catch: java.lang.Exception -> L8c
                        X.C762030Tur.LIZJ(r5, r6, r2, r1)     // Catch: java.lang.Exception -> L8c
                        return
                    L8c:
                        r2 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "getEmojiResource fail: "
                        r1.append(r0)
                        java.lang.String r0 = r2.getMessage()
                        r1.append(r0)
                        java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                        java.lang.String r0 = "MultiGuestMicSeatEmojiDataSource"
                        X.C20441214yg.LJ(r0, r1)
                        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r1 = r3
                        java.lang.String r0 = "json parse error"
                        r1.invoke(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C771410UNv.LIZ(com.bytedance.android.livesdkapi.depend.model.LiveEffect):void");
                }
            });
            return;
        }
        long j3 = j2 - c238400w2.element;
        if (j3 > 0) {
            C054G c054g = c942410adD.LJII;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ, null, new C01YE(j3, j, c942410adD, null), 2);
        } else {
            if (j != c942410adD.LJIIIZ) {
                return;
            }
            c942410adD.LIZLLL(true);
        }
    }
}
