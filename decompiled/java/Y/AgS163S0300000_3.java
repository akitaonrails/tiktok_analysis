package Y;

import X.C09AE;
import X.C2227608o6;
import X.C23250099c;
import X.C259800zU;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinVoiceRecordAssem;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public class AgS163S0300000_3 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$0(AgS163S0300000_3 agS163S0300000_3, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str = (String) obj;
        C09AE c09ae = (C09AE) ((C259800zU) agS163S0300000_3.l0).element;
        T tLIZLLL = 0;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C259800zU c259800zU = (C259800zU) agS163S0300000_3.l0;
        if (str != null) {
            tLIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) agS163S0300000_3.l1, null, null, new C2227608o6((BulletinVoiceRecordAssem) agS163S0300000_3.l2, str, null), 3);
        }
        c259800zU.element = tLIZLLL;
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v1 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public static final java.lang.Object emit$1(Y.AgS163S0300000_3 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C09IN
            if (r0 == 0) goto L64
            r4 = r8
            X.09IN r4 = (X.C09IN) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L6a
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r0 = r6.l0
            X.09ID r0 = (X.C09ID) r0
            kotlin.jvm.functions.Function1<T, java.lang.Object> r0 = r0.LLILLJJLI
            java.lang.Object r2 = r0.invoke(r7)
            java.lang.Object r0 = r6.l1
            X.00zU r0 = (X.C259800zU) r0
            T r1 = r0.element
            X.09AU r0 = X.C09AV.LIZ
            if (r1 == r0) goto L51
            java.lang.Object r0 = r6.l0
            X.09ID r0 = (X.C09ID) r0
            kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r0 = r0.LLILLL
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L51
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L51:
            java.lang.Object r0 = r6.l1
            X.00zU r0 = (X.C259800zU) r0
            r0.element = r2
            java.lang.Object r0 = r6.l2
            X.01Wf r0 = (X.InterfaceC346701Wf) r0
            r4.LLILLL = r5
            java.lang.Object r0 = r0.emit(r7, r4)
            if (r0 != r3) goto L22
            return r3
        L64:
            X.09IN r4 = new X.09IN
            r4.<init>(r6, r8)
            goto L12
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS163S0300000_3.emit$1(Y.AgS163S0300000_3, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS163S0300000_3(Object obj, C259800zU<C09AE> c259800zU, InterfaceC497601wk interfaceC497601wk, BulletinVoiceRecordAssem bulletinVoiceRecordAssem) {
        this.$t = bulletinVoiceRecordAssem;
        this.l0 = obj;
        this.l1 = c259800zU;
        this.l2 = interfaceC497601wk;
    }
}
