package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bET, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965510bET extends C09AY implements Function1<C967640bHu, Throwable> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ C954590awr LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965510bET(C966020bFI c966020bFI, C954590awr c954590awr) {
        super(1);
        this.LL = c966020bFI;
        this.LLILLJJLI = c954590awr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Throwable invoke(C967640bHu c967640bHu) {
        PerceptionMessage perceptionMessage;
        List<InterfaceC965500bES> listLJLJL;
        C967640bHu c967640bHu2 = c967640bHu;
        C501470JlZ c501470JlZLIZIZ = C966250bFf.LIZIZ(c967640bHu2, "");
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            C954590awr c954590awr = this.LLILLJJLI;
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (interfaceC965500bES != null) {
                    interfaceC965500bES.LJIJJLI(c954590awr, c501470JlZLIZIZ);
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
