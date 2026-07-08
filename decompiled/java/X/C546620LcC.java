package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;

/* JADX INFO: renamed from: X.0LcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546620LcC implements InterfaceC546480Lby<AwemeDraft> {
    public final InterfaceC546090LbL LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function1<AbstractC546580Lc8, Unit> LIZLLL;
    public final Function2<Boolean, String, Unit> LJ;
    public final Function2<Boolean, String, Unit> LJFF;
    public final Function1<EnumC546700LcK, Unit> LJI;
    public final InterfaceC1631630sYr<Boolean, Long, Integer, String, Unit> LJII;
    public NLEEditor LJIIIIZZ;

    @Override // X.InterfaceC546480Lby
    public final Object LIZ(Object obj, AbstractC23140094w abstractC23140094w) throws Throwable {
        AIGCCreationModel aIGCCreationModelInvoke;
        C546040LbG c546040LbGLIZIZ;
        Function1<CreativeModel, AIGCCreationModel> function1;
        AwemeDraft awemeDraft = (AwemeDraft) obj;
        C546230LbZ c546230LbZLIZ = C546330Lbj.LIZ(this.LIZ);
        if (c546230LbZLIZ != null && (c546040LbGLIZIZ = c546230LbZLIZ.LIZIZ()) != null && (function1 = c546040LbGLIZIZ.LJ) != null) {
            aIGCCreationModelInvoke = function1.invoke(awemeDraft.LIZ);
        } else {
            aIGCCreationModelInvoke = null;
        }
        if (aIGCCreationModelInvoke == null) {
            C546820LcW.LIZIZ.LIZ("DraftAIGCRestoreHandler", "ignore draft restore: no aigcCreationModel");
            Function1<AbstractC546580Lc8, Unit> function12 = this.LIZLLL;
            if (function12 != null) {
                function12.invoke(C546590Lc9.LIZ);
            }
            return Unit.LIZ;
        }
        if (!C546670LcH.LIZIZ(aIGCCreationModelInvoke.ZG())) {
            C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ignore draft restore: ");
            sbLIZ.append(aIGCCreationModelInvoke.ZG().getStatus());
            c547140Ld2.LIZ("DraftAIGCRestoreHandler", C2188811AlT.LIZIZ(sbLIZ));
            Function1<AbstractC546580Lc8, Unit> function13 = this.LIZLLL;
            if (function13 != null) {
                function13.invoke(new C546570Lc7(aIGCCreationModelInvoke.ZG().getStatus()));
            }
            return Unit.LIZ;
        }
        Function1<AbstractC546580Lc8, Unit> function14 = this.LIZLLL;
        if (function14 != null) {
            function14.invoke(C546600LcA.LIZ);
        }
        Object objLJI = C23250099c.LJI(abstractC23140094w, C0PEM.LIZJ, new C546630LcD(this, awemeDraft, aIGCCreationModelInvoke, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r13, com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C546620LcC.LIZIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft, com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel, X.05Vn):java.lang.Object");
    }

    public C546620LcC(C0LOK c0lok, AwS409S0200000_8 awS409S0200000_8, AwS409S0200000_8 awS409S0200000_82, AwS587S0100000_8 awS587S0100000_8, AwS622S0100000_8 awS622S0100000_8, AwS622S0100000_8 awS622S0100000_82, AwS587S0100000_8 awS587S0100000_82, C546560Lc6 c546560Lc6) {
        this.LIZ = c0lok;
        this.LIZIZ = awS409S0200000_8;
        this.LIZJ = awS409S0200000_82;
        this.LIZLLL = awS587S0100000_8;
        this.LJ = awS622S0100000_8;
        this.LJFF = awS622S0100000_82;
        this.LJI = awS587S0100000_82;
        this.LJII = c546560Lc6;
    }
}
