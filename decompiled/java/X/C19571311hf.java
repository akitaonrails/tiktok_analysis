package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS307S0300000_30;

/* JADX INFO: renamed from: X.11hf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19571311hf extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ C20303414cS LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function2<File, String, Unit> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19571311hf(C20303414cS c20303414cS, boolean z, AwS307S0300000_30 awS307S0300000_30, String str) {
        super(1);
        this.LL = c20303414cS;
        this.LLILLJJLI = z;
        this.LLILLL = awS307S0300000_30;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        long j;
        final C1533790q13 c1533790q132 = c1533790q13;
        final C20303414cS c20303414cS = this.LL;
        ConstraintLayout constraintLayout = c20303414cS.LL;
        final Function2<File, String, Unit> function2 = this.LLILLL;
        final String str = this.LLILZ;
        Runnable runnable = new Runnable() { // from class: X.11he
            /* JADX WARN: Multi-variable type inference failed */
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
            public final void LIZ() {
                C20303414cS c20303414cS2 = c20303414cS;
                Function2<File, String, Unit> function22 = function2;
                C1533790q13 c1533790q133 = c1533790q132;
                String str2 = str;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C20303114cP.LIZ;
                c20303414cS2.LLILZLL.LIZLLL();
                C786410Ut5.LJLLLLLL(8, c20303414cS2.LLILZLL);
                Object obj = null;
                if (c1533790q133.LIZIZ) {
                    AbstractC1534220q1k<?> abstractC1534220q1kLIZ = c1533790q133.LIZ();
                    Object obj2 = abstractC1534220q1kLIZ != null ? abstractC1534220q1kLIZ.LIZLLL : null;
                    if (!(obj2 instanceof File) || obj2 == null) {
                        String strLIZLLL = c1533790q133.LIZLLL();
                        if (strLIZLLL != null) {
                            C0VSJ c0vsj = new C0VSJ(strLIZLLL);
                            if (c0vsj.exists()) {
                                obj = c0vsj;
                            }
                        }
                    } else {
                        obj = obj2;
                    }
                }
                function22.invoke(obj, str2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MessageNotificationPermissionFragmentKt@5cb9.loadGeckoResource$5$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MessageNotificationPermissionFragmentKt@5cb9.loadGeckoResource$5$1");
            }
        };
        if (this.LLILLJJLI) {
            j = 500;
        } else {
            j = 0;
        }
        HandlerHook.viewPostDelay(constraintLayout, runnable, j);
        return Unit.LIZ;
    }
}
