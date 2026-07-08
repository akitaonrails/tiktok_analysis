package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bEV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965530bEV extends C09AY implements Function1<C967640bHu, Throwable> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C954610awt LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965530bEV(C966020bFI c966020bFI, boolean z, C954610awt c954610awt) {
        super(1);
        this.LL = c966020bFI;
        this.LLILLJJLI = z;
        this.LLILLL = c954610awt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Throwable invoke(C967640bHu c967640bHu) {
        List<InterfaceC965500bES> listLJLJL;
        C501470JlZ c501470JlZLIZIZ = C966250bFf.LIZIZ(c967640bHu, "");
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            boolean z = this.LLILLJJLI;
            C954610awt c954610awt = this.LLILLL;
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (z) {
                    if (interfaceC965500bES != null) {
                        interfaceC965500bES.LIZLLL(c954610awt, c501470JlZLIZIZ);
                    }
                } else if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJIIJJI(c954610awt, c501470JlZLIZIZ);
                }
            }
        }
        return c501470JlZLIZIZ;
    }
}
