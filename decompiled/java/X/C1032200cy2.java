package X;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cy2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032200cy2 implements InterfaceC1032630cyj, WeakHandler.IHandler {
    public final double LL;
    public final Function0<Unit> LLILLJJLI;
    public final WeakHandler LLILLL = new WeakHandler(Looper.getMainLooper(), this);
    public boolean LLILZ;
    public boolean LLILZIL;
    public long LLILZLL;

    @Override // X.InterfaceC1032630cyj
    public final void start() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start invoked, started=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", completed=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", closeDurationSeconds=");
        sbLIZ.append(this.LL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILZ || this.LLILZIL) {
            return;
        }
        this.LLILZ = true;
        this.LLILLL.removeMessages(2001);
        this.LLILLL.sendEmptyMessageDelayed(2001, 500L);
    }

    @Override // X.InterfaceC1032630cyj
    public final void stop() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop invoked, started=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", completed=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", elapsedMs=");
        sbLIZ.append(this.LLILZLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LLILZ || this.LLILZIL) {
            return;
        }
        this.LLILZ = false;
        this.LLILLL.removeMessages(2001);
    }

    @Override // X.InterfaceC1032630cyj
    public final boolean LIZ() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Object objValueOf;
        if (message != null && message.what == 2001) {
            long j = this.LLILZLL + 500;
            this.LLILZLL = j;
            double d = this.LL;
            double d2 = LSPassThroughRecordSizeConfig.DEFAULT;
            double d3 = (d * d2) - j;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tick, elapsedMs=");
            sbLIZ.append(this.LLILZLL);
            sbLIZ.append(", remainMs=");
            if (d3 > 0.0d) {
                objValueOf = Double.valueOf(d3);
            } else {
                objValueOf = 0;
            }
            sbLIZ.append(objValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LLILZLL >= this.LL * d2) {
                if (!this.LLILZIL) {
                    this.LLILZIL = true;
                    this.LLILZ = false;
                    this.LLILLL.removeMessages(2001);
                    this.LLILLJJLI.invoke();
                    return;
                }
                return;
            }
            this.LLILLL.removeMessages(2001);
            this.LLILLL.sendEmptyMessageDelayed(2001, 500L);
        }
    }

    public C1032200cy2(double d, Function0<Unit> function0) {
        this.LL = d;
        this.LLILLJJLI = function0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init with closeDurationSeconds=");
        sbLIZ.append(d);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
