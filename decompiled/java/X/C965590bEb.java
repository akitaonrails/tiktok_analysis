package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteJoinGroupResult;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bEb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965590bEb extends C09AY implements Function2<String, C965950bFB, CancelInviteJoinGroupResult> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ C954670awz LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965590bEb(C966020bFI c966020bFI, C954670awz c954670awz) {
        super(2);
        this.LL = c966020bFI;
        this.LLILLJJLI = c954670awz;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CancelInviteJoinGroupResult invoke(String str, C965950bFB c965950bFB) {
        List<InterfaceC965500bES> listLJLJL;
        String str2 = str;
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            C954670awz c954670awz = this.LLILLJJLI;
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJIIIIZZ(c954670awz, str2);
                }
            }
        }
        this.LL.LJIILLIIL();
        return new CancelInviteJoinGroupResult(str2);
    }
}
