package X;

import android.util.LruCache;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Ey3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381810Ey3 implements InterfaceC381940EyG {
    public final InterfaceC497601wk LIZ;
    public final Function0<VideoPublishEditModel> LIZIZ;
    public final Function0<Pair<Float, Float>> LIZJ;
    public final InterfaceC381790Ey1 LIZLLL;
    public final C382470Ez7 LJ = new Object() { // from class: X.0Ez7
    };
    public final LruCache<List<String>, List<C378700Et2>> LJFF = new LruCache<>(10);

    public final VideoPublishEditModel LJIIIZ() {
        return this.LIZIZ.invoke();
    }

    public final C381620Exk LJI() {
        VideoPublishEditModel videoPublishEditModelLJIIIZ = LJIIIZ();
        if (videoPublishEditModelLJIIIZ == null) {
            return null;
        }
        C382470Ez7 c382470Ez7 = this.LJ;
        InterfaceC497601wk interfaceC497601wk = this.LIZ;
        InterfaceC381790Ey1 interfaceC381790Ey1 = this.LIZLLL;
        c382470Ez7.getClass();
        return new C381620Exk(interfaceC497601wk, videoPublishEditModelLJIIIZ, interfaceC381790Ey1);
    }

    public final C381640Exm LJII() {
        VideoPublishEditModel videoPublishEditModelLJIIIZ = LJIIIZ();
        if (videoPublishEditModelLJIIIZ == null) {
            return null;
        }
        C382470Ez7 c382470Ez7 = this.LJ;
        InterfaceC497601wk interfaceC497601wk = this.LIZ;
        InterfaceC381790Ey1 interfaceC381790Ey1 = this.LIZLLL;
        c382470Ez7.getClass();
        return new C381640Exm(interfaceC497601wk, videoPublishEditModelLJIIIZ, interfaceC381790Ey1);
    }

    public final C381670Exp LJIIIIZZ() {
        VideoPublishEditModel videoPublishEditModelLJIIIZ = LJIIIZ();
        if (videoPublishEditModelLJIIIZ == null) {
            return null;
        }
        C382470Ez7 c382470Ez7 = this.LJ;
        InterfaceC497601wk interfaceC497601wk = this.LIZ;
        InterfaceC381790Ey1 interfaceC381790Ey1 = this.LIZLLL;
        c382470Ez7.getClass();
        return new C381670Exp(interfaceC497601wk, videoPublishEditModelLJIIIZ, interfaceC381790Ey1);
    }

    public static EnumC381960EyI LJIIJ(C381600Exi c381600Exi) {
        EnumC381960EyI enumC381960EyI = c381600Exi.LIZJ;
        if (enumC381960EyI == null) {
            switch (C378040Ery.LIZ[c381600Exi.LIZIZ.ordinal()]) {
                case 1:
                case 2:
                    return EnumC381960EyI.EDITOR_PRO_AIGC_T2I;
                case 3:
                case 4:
                case 5:
                case 6:
                    return EnumC381960EyI.EDITOR_PRO_AIGC_T2V;
                default:
                    return null;
            }
        }
        return enumC381960EyI;
    }

    @Override // X.InterfaceC381940EyG
    public final void LIZJ(List list, AwS584S0100000_5 awS584S0100000_5) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<C378700Et2> list2 = this.LJFF.get(list);
        if (list2 != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            C380450Evr.LIZ.getClass();
            C380450Evr.LIZ(true, null, "", jCurrentTimeMillis2, 0L);
            awS584S0100000_5.invoke(list2);
            return;
        }
        C381620Exk c381620ExkLJI = LJI();
        if (c381620ExkLJI != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C381900EyC(list, c381620ExkLJI, new C382070EyT(jCurrentTimeMillis, this, list, awS584S0100000_5), null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    @Override // X.InterfaceC381940EyG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C382280Eyo r17, X.InterfaceC1364105Vn<? super X.C382010EyN> r18) {
        /*
            r16 = this;
            r3 = r18
            r5 = r17
            boolean r0 = r3 instanceof X.C382020EyO
            r4 = r16
            if (r0 == 0) goto L8f
            r8 = r3
            X.0EyO r8 = (X.C382020EyO) r8
            int r2 = r8.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r8.LLILZIL = r2
        L18:
            java.lang.Object r3 = r8.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILZIL
            r9 = 0
            r6 = 1
            if (r0 == 0) goto L73
            if (r0 != r6) goto L95
            long r1 = r8.LLILLJJLI
            X.0Eyo r5 = r8.LL
            X.C155000ia.LIZIZ(r3)
        L2d:
            X.0EyN r3 = (X.C382010EyN) r3
            if (r3 == 0) goto L68
            java.util.List<X.0Exd> r4 = r3.LIZ
            if (r4 == 0) goto L69
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r6) goto L69
            r8 = 1
        L3e:
            if (r8 != 0) goto L46
            if (r3 == 0) goto L46
            java.lang.String r10 = r3.LIZJ
            if (r10 != 0) goto L48
        L46:
            java.lang.String r10 = ""
        L48:
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r1
            if (r4 == 0) goto L66
            java.lang.Object r0 = X.C13LP.LJJJLL(r4)
            X.0Exd r0 = (X.C381550Exd) r0
            if (r0 == 0) goto L66
            int r15 = r0.LIZIZ
        L59:
            X.0Evr r0 = X.C380450Evr.LIZ
            java.lang.String r13 = r5.LIZLLL
            X.13BV r14 = X.C13BV.INSTANCE
            r0.getClass()
            X.C380450Evr.LIZIZ(r8, r9, r10, r11, r13, r14, r15)
            return r3
        L66:
            r15 = -2
            goto L59
        L68:
            r4 = r9
        L69:
            r8 = 0
            if (r3 == 0) goto L3e
            int r0 = r3.LIZIZ
            java.lang.Integer r9 = X.C2286608xc.LJ(r0)
            goto L3e
        L73:
            X.C155000ia.LIZIZ(r3)
            long r1 = java.lang.System.currentTimeMillis()
            X.0Ey1 r4 = r4.LIZLLL
            X.0Eyb r3 = new X.0Eyb
            r0 = 6
            r3.<init>(r5, r9, r9, r0)
            r8.LL = r5
            r8.LLILLJJLI = r1
            r8.LLILZIL = r6
            java.lang.Object r3 = r4.LJIIJ(r3, r8)
            if (r3 != r7) goto L2d
            return r7
        L8f:
            X.0EyO r8 = new X.0EyO
            r8.<init>(r4, r3)
            goto L18
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381810Ey3.LIZLLL(X.0Eyo, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC381940EyG
    public final void LIZ(AIGCGenerationParamType aIGCGenerationParamType, C382210Eyh c382210Eyh, AwS584S0100000_5 awS584S0100000_5) {
        switch (C378040Ery.LIZIZ[aIGCGenerationParamType.ordinal()]) {
            case 1:
                C381640Exm c381640ExmLJII = LJII();
                if (c381640ExmLJII != null) {
                    c381640ExmLJII.LJII(c382210Eyh, awS584S0100000_5);
                }
                break;
            case 2:
                VideoPublishEditModel videoPublishEditModelLJIIIZ = LJIIIZ();
                if (videoPublishEditModelLJIIIZ != null) {
                    C382470Ez7 c382470Ez7 = this.LJ;
                    InterfaceC497601wk interfaceC497601wk = this.LIZ;
                    InterfaceC381790Ey1 interfaceC381790Ey1 = this.LIZLLL;
                    c382470Ez7.getClass();
                    new C381650Exn(interfaceC497601wk, videoPublishEditModelLJIIIZ, interfaceC381790Ey1).LJII(c382210Eyh, awS584S0100000_5);
                }
                break;
            case 3:
                C381670Exp c381670ExpLJIIIIZZ = LJIIIIZZ();
                if (c381670ExpLJIIIIZZ != null) {
                    c381670ExpLJIIIIZZ.LJII(c382210Eyh, awS584S0100000_5);
                }
                break;
            case 4:
            case 5:
                C381620Exk c381620ExkLJI = LJI();
                if (c381620ExkLJI != null) {
                    c381620ExkLJI.LJII(c382210Eyh, awS584S0100000_5);
                }
                break;
            case 6:
                VideoPublishEditModel videoPublishEditModelLJIIIZ2 = LJIIIZ();
                if (videoPublishEditModelLJIIIZ2 != null) {
                    C382470Ez7 c382470Ez72 = this.LJ;
                    InterfaceC497601wk interfaceC497601wk2 = this.LIZ;
                    InterfaceC381790Ey1 interfaceC381790Ey12 = this.LIZLLL;
                    c382470Ez72.getClass();
                    new C381660Exo(interfaceC497601wk2, videoPublishEditModelLJIIIZ2, interfaceC381790Ey12).LJII(c382210Eyh, awS584S0100000_5);
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0EyH] */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.0EyR] */
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
    @Override // X.InterfaceC381940EyG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final X.C381600Exi r16, boolean r17, final X.InterfaceC382370Eyx r18) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C381810Ey3.LJ(X.0Exi, boolean, X.0Eyx):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Ez7] */
    public C381810Ey3(InterfaceC497601wk interfaceC497601wk, Function0<? extends VideoPublishEditModel> function0, Function0<Pair<Float, Float>> function02, InterfaceC381790Ey1 interfaceC381790Ey1) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = interfaceC381790Ey1;
    }

    @Override // X.InterfaceC381940EyG
    public final void LJFF(EnumC378030Erx enumC378030Erx, EnumC381960EyI enumC381960EyI, EnumC378310EsP enumC378310EsP, Function1<? super C377660ErM, Unit> function1) {
        switch (C378040Ery.LIZ[enumC378030Erx.ordinal()]) {
            case 1:
            case 2:
                C381640Exm c381640ExmLJII = LJII();
                if (c381640ExmLJII != null) {
                    if (enumC381960EyI == null) {
                        enumC381960EyI = EnumC381960EyI.EDITOR_PRO_AIGC_T2I;
                    }
                    c381640ExmLJII.LIZ(null, enumC381960EyI, new AwS584S0100000_5(function1, (Function1<? super NLETrackSlot, Unit>) 1234));
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                C381670Exp c381670ExpLJIIIIZZ = LJIIIIZZ();
                if (c381670ExpLJIIIIZZ != null) {
                    if (enumC381960EyI == null) {
                        enumC381960EyI = EnumC381960EyI.EDITOR_PRO_AIGC_T2V;
                    }
                    c381670ExpLJIIIIZZ.LIZ(enumC378310EsP, enumC381960EyI, new AwS584S0100000_5(function1, (Function1<? super NLETrackSlot, Unit>) 1235));
                }
                break;
        }
    }

    @Override // X.InterfaceC381940EyG
    public final void LIZIZ(EnumC382100EyW enumC382100EyW, List<String> list, String str, String str2, Function1<? super List<C381550Exd>, Unit> function1) {
        C381670Exp c381670ExpLJIIIIZZ;
        EnumC382100EyW enumC382100EyW2 = EnumC382100EyW.IMAGE;
        if (enumC382100EyW == enumC382100EyW2) {
            C381640Exm c381640ExmLJII = LJII();
            if (c381640ExmLJII != null) {
                c381640ExmLJII.LIZIZ(enumC382100EyW2, list, str, str2, new AwS584S0100000_5(function1, (Function1<? super NLETrackSlot, Unit>) 1236));
                return;
            }
            return;
        }
        EnumC382100EyW enumC382100EyW3 = EnumC382100EyW.VIDEO;
        if (enumC382100EyW != enumC382100EyW3 || (c381670ExpLJIIIIZZ = LJIIIIZZ()) == null) {
            return;
        }
        c381670ExpLJIIIIZZ.LIZIZ(enumC382100EyW3, list, str, str2, new AwS584S0100000_5(function1, (Function1<? super NLETrackSlot, Unit>) 1237));
    }
}
