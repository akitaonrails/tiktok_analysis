package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyJoinGroupResult;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965600bEc extends C09AY implements Function2<String, C965950bFB, CancelApplyJoinGroupResult> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ C954800axC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965600bEc(C966020bFI c966020bFI, C954800axC c954800axC) {
        super(2);
        this.LL = c966020bFI;
        this.LLILLJJLI = c954800axC;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CancelApplyJoinGroupResult invoke(String str, C965950bFB c965950bFB) {
        List<InterfaceC965500bES> listLJLJL;
        String str2 = str;
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            C954800axC c954800axC = this.LLILLJJLI;
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJIIL(c954800axC, str2);
                }
            }
        }
        this.LL.LJIILLIIL();
        return new CancelApplyJoinGroupResult(str2);
    }
}
