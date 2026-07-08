package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupResult;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bEZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965570bEZ extends C09AY implements Function2<String, C965950bFB, ReplyInviteGroupResult> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C954620awu LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965570bEZ(C966020bFI c966020bFI, boolean z, C954620awu c954620awu) {
        super(2);
        this.LL = c966020bFI;
        this.LLILLJJLI = z;
        this.LLILLL = c954620awu;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ReplyInviteGroupResult invoke(String str, C965950bFB c965950bFB) {
        List<InterfaceC965500bES> listLJLJL;
        String str2 = str;
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            boolean z = this.LLILLJJLI;
            C954620awu c954620awu = this.LLILLL;
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (z) {
                    if (interfaceC965500bES != null) {
                        interfaceC965500bES.LJIIZILJ(c954620awu, str2);
                    }
                } else if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJIJI(c954620awu, str2);
                }
            }
        }
        return new ReplyInviteGroupResult(str2);
    }
}
