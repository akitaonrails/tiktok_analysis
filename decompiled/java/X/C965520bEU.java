package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bEU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965520bEU extends C09AY implements Function1<C967640bHu, Throwable> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ C954600aws LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965520bEU(C966020bFI c966020bFI, C954600aws c954600aws) {
        super(1);
        this.LL = c966020bFI;
        this.LLILLJJLI = c954600aws;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Throwable invoke(C967640bHu c967640bHu) {
        PerceptionMessage perceptionMessage;
        List<InterfaceC965500bES> listLJLJL;
        C967640bHu c967640bHu2 = c967640bHu;
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            C954600aws c954600aws = this.LLILLJJLI;
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJII(c954600aws, C966250bFf.LIZIZ(c967640bHu2, ""));
                }
            }
        }
        this.LL.getClass();
        byte[] bArr = c967640bHu2.LIZJ;
        if (bArr != null && (perceptionMessage = (PerceptionMessage) C966250bFf.LIZ(bArr, PerceptionMessage.class)) != null) {
            return new MultiCoHostViolationException(perceptionMessage);
        }
        return null;
    }
}
