package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bEX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965550bEX extends C09AY implements Function1<C967640bHu, Throwable> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ C954800axC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965550bEX(C966020bFI c966020bFI, C954800axC c954800axC) {
        super(1);
        this.LL = c966020bFI;
        this.LLILLJJLI = c954800axC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Throwable invoke(C967640bHu c967640bHu) {
        List<InterfaceC965500bES> listLJLJL;
        C501470JlZ c501470JlZLIZIZ = C966250bFf.LIZIZ(c967640bHu, "");
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            C954800axC c954800axC = this.LLILLJJLI;
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJ(c954800axC, c501470JlZLIZIZ);
                }
            }
        }
        return c501470JlZLIZIZ;
    }
}
