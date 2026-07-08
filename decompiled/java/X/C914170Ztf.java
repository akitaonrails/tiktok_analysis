package X;

import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Ztf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914170Ztf extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    public static final void LJJ$0(C914170Ztf c914170Ztf, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$3(C914170Ztf c914170Ztf, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$4(C914170Ztf c914170Ztf, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$6(C914170Ztf c914170Ztf, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$8(C914170Ztf c914170Ztf, CoroutineContext coroutineContext, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
            case 2:
                C1AF0.LJFF(th, "MessageListSubmitListAbilityImpl[MessageEventProtocol]");
                break;
            case 3:
                LJJ$3(this, coroutineContext, th);
                break;
            case 4:
                LJJ$4(this, coroutineContext, th);
                break;
            case 5:
                LJJ$5(this, coroutineContext, th);
                break;
            case 6:
                LJJ$6(this, coroutineContext, th);
                break;
            case 7:
                C1AF0.LJ(th);
                break;
            case 8:
                LJJ$8(this, coroutineContext, th);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJ$9(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914170Ztf(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$1(C914170Ztf c914170Ztf, CoroutineContext coroutineContext, Throwable th) {
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MessageList Rendered Exception ");
            sbLIZ.append(th.getMessage());
            iMALogApiLIZ.LIZ(6, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ));
        }
        IMALogApi iMALogApiLIZ2 = C0Z53.LIZ();
        if (iMALogApiLIZ2 != null) {
            iMALogApiLIZ2.LIZJ("MessageList Rendered Exception", th);
        }
        C1AF0.LJFF(th, "MessagePowerListAssem[MessageEventProtocol]");
    }

    public static final void LJJ$5(C914170Ztf c914170Ztf, CoroutineContext coroutineContext, Throwable th) {
        HashMap map = new HashMap();
        map.put("error_msg", "report error");
        map.put("error_desc", th);
        C0W8I.LIZ.getClass();
        C0W8I.LJ("send_msg_error", "im_error_event", map);
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            iMALogApiLIZ.logException(new RuntimeException(th));
        }
    }

    public static final void LJJ$9(C914170Ztf c914170Ztf, CoroutineContext coroutineContext, Throwable th) {
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            iMALogApiLIZ.logException(th);
        }
    }
}
