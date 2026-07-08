package X;

import com.bytedance.android.livesdk.impl.revenue.asr.LiveAsrHostWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1CkG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239021CkG extends C09AY implements InterfaceC1685420txc<Buffer, Integer, Integer, Integer, Long, Unit> {
    public final /* synthetic */ LiveAsrHostWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2239021CkG(LiveAsrHostWidget liveAsrHostWidget) {
        super(5);
        this.LL = liveAsrHostWidget;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(Buffer buffer, Integer num, Integer num2, Integer num3, Long l) {
        ByteBuffer byteBuffer;
        Buffer buffer2 = buffer;
        num.intValue();
        num2.intValue();
        num3.intValue();
        l.longValue();
        byte[] byteArray = null;
        if ((buffer2 instanceof ByteBuffer) && (byteBuffer = (ByteBuffer) buffer2) != null && this.LL.LLJ) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.LL.LLIZLLLIL > this.LL.LLJJJJ.audioProcessInterval) {
                LiveAsrHostWidget liveAsrHostWidget = this.LL;
                synchronized (liveAsrHostWidget.LLILLJJLI) {
                    try {
                        if (liveAsrHostWidget.LL.size() > 0) {
                            byteArray = liveAsrHostWidget.LL.toByteArray();
                        }
                        liveAsrHostWidget.LL.reset();
                        liveAsrHostWidget.E1(byteBuffer);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                if (byteArray != null) {
                    this.LL.A1(byteArray);
                }
                this.LL.LLIZLLLIL = jCurrentTimeMillis;
            } else {
                LiveAsrHostWidget liveAsrHostWidget2 = this.LL;
                synchronized (liveAsrHostWidget2.LLILLJJLI) {
                    try {
                        liveAsrHostWidget2.E1(byteBuffer);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
