package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18GQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18GQ extends BPEAThread {
    public static final C18GQ LL = new C18GQ();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C21256718Gn());
    public static volatile boolean LLILLL;

    public C18GQ() {
        super("BtmSDK-ALog");
    }

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("ALogHandlerThreadV2@30db.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            LIZJ();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("ALogHandlerThreadV2@30db.run");
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
    public final void LIZJ() {
        Function0 function0;
        super.run();
        if ((!C18CK.LIZJ || C18IP.LIZ.LIZ() == null) && !C18GB.LIZ()) {
            return;
        }
        try {
            Thread.sleep(C18CS.LIZ.LIZLLL().LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C18CE.LIZ.LJFF(1498, "ALogHandlerThreadV2#run", null, e, false);
        }
        LLILLL = true;
        while (true) {
            try {
                InterfaceC1778290wNP interfaceC1778290wNP = (InterfaceC1778290wNP) ((LinkedBlockingDeque) LLILLJJLI.getValue()).take();
                if (interfaceC1778290wNP instanceof C1778280wNO) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strLIZIZ = "";
                    Long l = ((C1778280wNO) interfaceC1778290wNP).LIZJ;
                    if (l != null) {
                        long jLongValue = jCurrentTimeMillis - l.longValue();
                        if (jLongValue > 200) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("delayTime: ");
                            sbLIZ.append(jLongValue);
                            sbLIZ.append('\n');
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    Object obj = ((C1778280wNO) interfaceC1778290wNP).LIZIZ;
                    Object objInvoke = null;
                    if (C19719512Dh.LJFF(0, obj) && (function0 = (Function0) obj) != null) {
                        objInvoke = function0.invoke();
                    }
                    sbLIZ2.append(objInvoke);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    C18IH c18ihLIZ = C18IP.LIZ.LIZ();
                    if (c18ihLIZ != null) {
                        c18ihLIZ.i(((C1778280wNO) interfaceC1778290wNP).LIZ, strLIZIZ2);
                    }
                } else if (interfaceC1778290wNP instanceof C18GR) {
                    ((C18GR) interfaceC1778290wNP).LIZ.LJFF(((C18GR) interfaceC1778290wNP).LIZJ, ((C18GR) interfaceC1778290wNP).LIZIZ);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
