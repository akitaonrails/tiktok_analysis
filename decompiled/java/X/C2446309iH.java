package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.09iH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2446309iH implements Handler.Callback {
    public final Function0<Unit> LL;
    public final Function0<Unit> LLILLJJLI;
    public long LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1606));
    public final BPEAHandler LLIZ = new BPEAHandler(Looper.getMainLooper(), this);
    public final AtomicBoolean LLIZLLLIL = new AtomicBoolean(false);

    public final C1ECA LIZ() {
        return (C1ECA) this.LLILLL.getValue();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 100) {
            long j = this.LLILZ + ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            this.LLILZ = j;
            LIZ().getClass();
            if (j >= C1ECA.LIZLLL()) {
                this.LL.invoke();
                return true;
            }
            C786410Ut5.LJLJJI(100, 1000L, this.LLIZ);
            return false;
        }
        if (i == 101) {
            long j2 = this.LLILZIL + ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            this.LLILZIL = j2;
            LIZ().getClass();
            if (j2 >= ((Number) C1ECA.LJII.getValue()).intValue()) {
                this.LLILLJJLI.invoke();
                this.LLILZLL = true;
                return true;
            }
            C786410Ut5.LJLJJI(101, 1000L, this.LLIZ);
            return false;
        }
        return false;
    }

    public C2446309iH(AwS547S0100000_3 awS547S0100000_3, AwS547S0100000_3 awS547S0100000_32) {
        this.LL = awS547S0100000_3;
        this.LLILLJJLI = awS547S0100000_32;
    }
}
