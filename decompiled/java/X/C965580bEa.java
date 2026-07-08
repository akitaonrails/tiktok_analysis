package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupResult;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965580bEa extends C09AY implements Function2<String, C965950bFB, PermitApplyGroupResult> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C954610awt LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965580bEa(C966020bFI c966020bFI, boolean z, C954610awt c954610awt) {
        super(2);
        this.LL = c966020bFI;
        this.LLILLJJLI = z;
        this.LLILLL = c954610awt;
    }

    @Override // kotlin.jvm.functions.Function2
    public final PermitApplyGroupResult invoke(String str, C965950bFB c965950bFB) {
        List<InterfaceC965500bES> listLJLJL;
        String str2 = str;
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            boolean z = this.LLILLJJLI;
            C954610awt c954610awt = this.LLILLL;
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (z) {
                    if (interfaceC965500bES != null) {
                        interfaceC965500bES.LIZIZ(c954610awt, str2);
                    }
                } else if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJIILLIIL(c954610awt, str2);
                }
            }
        }
        return new PermitApplyGroupResult(str2);
    }
}
