package X;

import com.ss.android.ugc.aweme.msg.qrcode.QRGroupCreationMessageVM;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0oHD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466930oHD extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;
    public Object l0;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1466930oHD(InterfaceC23272099y interfaceC23272099y, Object obj, int i) {
        super(interfaceC23272099y);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJ$0(C1466930oHD c1466930oHD, CoroutineContext coroutineContext, Throwable th) {
        QRGroupCreationMessageVM qRGroupCreationMessageVM = (QRGroupCreationMessageVM) c1466930oHD.l0;
        EnumC1411170mpH enumC1411170mpH = EnumC1411170mpH.LOAD_FAIL;
        qRGroupCreationMessageVM.getClass();
        qRGroupCreationMessageVM.setState(new AwS608S0100000_29(enumC1411170mpH, 548));
    }

    public static final void LJJ$1(C1466930oHD c1466930oHD, CoroutineContext coroutineContext, Throwable th) {
        C0CHQ.LIZ().isDebugConfigOpen();
        C1435140nRw c1435140nRw = (C1435140nRw) c1466930oHD.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("independent add watermark internal error, message: ");
        sbLIZ.append(C13SZ.LIZIZ(th));
        c1435140nRw.LJIILL(new C1435160nRy(C2188811AlT.LIZIZ(sbLIZ)));
    }
}
