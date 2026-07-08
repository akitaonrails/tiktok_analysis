package X;

import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: renamed from: X.151W, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C151W implements InterfaceC777020Udw {
    public final /* synthetic */ C151V LIZ;

    @Override // X.InterfaceC777020Udw
    public final void LIZ() {
        BPEAHandler bPEAHandler = this.LIZ.LLILZIL;
        if (bPEAHandler != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            C786410Ut5.LJLJJL(bPEAHandler, messageObtain);
        }
    }

    public C151W(C151V c151v) {
        this.LIZ = c151v;
    }

    @Override // X.InterfaceC777020Udw
    public final void LIZIZ(long j, long j2, Object... objArr) {
        ByteBuffer byteBuffer;
        Integer num;
        Integer num2;
        Integer num3;
        C151V c151v = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameFrameHandler. onDataCollected, triggerTimestamp=");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        c151v.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        final C151V c151v2 = this.LIZ;
        AbstractC1273900jFs abstractC1273900jFs = c151v2.LLILLL;
        Object obj = objArr[0];
        Boolean bool = null;
        if (obj instanceof ByteBuffer) {
            byteBuffer = (ByteBuffer) obj;
        } else {
            byteBuffer = null;
        }
        Object obj2 = objArr[1];
        if (obj2 instanceof Integer) {
            num = (Integer) obj2;
        } else {
            num = null;
        }
        Object obj3 = objArr[2];
        if (obj3 instanceof Integer) {
            num2 = (Integer) obj3;
        } else {
            num2 = null;
        }
        Object obj4 = objArr[3];
        if (obj4 instanceof Integer) {
            num3 = (Integer) obj4;
        } else {
            num3 = null;
        }
        Object obj5 = objArr[4];
        if (obj5 instanceof Boolean) {
            bool = (Boolean) obj5;
        }
        if (byteBuffer != null && num != null && num2 != null && num3 != null && bool != null) {
            InterfaceC779640UiA interfaceC779640UiA = c151v2.LL.LIZIZ;
            if (interfaceC779640UiA != null && interfaceC779640UiA.LIZ()) {
                InterfaceC779640UiA interfaceC779640UiA2 = c151v2.LL.LIZIZ;
                if (interfaceC779640UiA2 != null) {
                    interfaceC779640UiA2.LJIIIIZZ(j, j2, byteBuffer, num.intValue(), num2.intValue(), num3.intValue(), abstractC1273900jFs, bool.booleanValue(), c151v2.LL.LJIIIIZZ.LIZJ, new InterfaceC204502150i() { // from class: X.151Y
                        @Override // X.InterfaceC204502150i
                        public final void LIZ() {
                            c151v2.getClass();
                            Map<String, Object> map2 = C1338270kvh.LIZ;
                            BPEAHandler bPEAHandler = c151v2.LLILZIL;
                            if (bPEAHandler != null) {
                                Message messageObtain = Message.obtain();
                                messageObtain.what = 1;
                                C786410Ut5.LJLJJL(bPEAHandler, messageObtain);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            BPEAHandler bPEAHandler = c151v2.LLILZIL;
            if (bPEAHandler == null) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            C786410Ut5.LJLJLJ(bPEAHandler, messageObtain, Mp4ScreenVideoLoadTimeout.CONTROL);
            return;
        }
        C20441214yg.LJ("GameBroadcastAIManagerTagV2", "doFrameInfer, value invalid, return!");
        BPEAHandler bPEAHandler2 = c151v2.LLILZIL;
        if (bPEAHandler2 == null) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 1;
        C786410Ut5.LJLJJL(bPEAHandler2, messageObtain2);
    }
}
