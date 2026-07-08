package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0oGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466650oGl implements Handler.Callback {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                return handleMessage$0(this, message);
            case 1:
                return handleMessage$1(this, message);
            default:
                return false;
        }
    }

    public C1466650oGl(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean handleMessage$0(C1466650oGl c1466650oGl, Message message) {
        C1463860oCG c1463860oCG;
        if (message.what == 100) {
            C1463670oBx c1463670oBx = (C1463670oBx) c1466650oGl.l0;
            if (c1463670oBx.LJI == null) {
                return true;
            }
            Iterator it2 = ((ArrayList) c1463670oBx.LJJIII).iterator();
            while (true) {
                c1463860oCG = null;
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1464120oCg interfaceC1464120oCg = (InterfaceC1464120oCg) it2.next();
                C1463860oCG c1463860oCG2 = c1463670oBx.LJI;
                if (c1463860oCG2 != null) {
                    c1463860oCG = c1463860oCG2;
                }
                interfaceC1464120oCg.LIZ((int) (((C389960FQs) c1463860oCG.getPlayerApi()).getCurrentPosition() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            }
            C1463860oCG c1463860oCG3 = ((C1463670oBx) c1466650oGl.l0).LJI;
            if (c1463860oCG3 != null) {
                c1463860oCG = c1463860oCG3;
            }
            if (((C389960FQs) c1463860oCG.getPlayerApi()).state() == NLEPlayerState.STARTED) {
                C786410Ut5.LJLJJI(100, 100L, ((C1463670oBx) c1466650oGl.l0).LIZIZ());
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean handleMessage$1(X.C1466650oGl r6, android.os.Message r7) {
        /*
            int r1 = r7.what
            r4 = 1
            if (r1 == r4) goto L80
            r0 = 2
            if (r1 == r0) goto L75
            r0 = 3
            if (r1 != r0) goto L74
            java.lang.Object r5 = r6.l0
            X.0nal r5 = (X.C1440610nal) r5
            r5.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = r5.LJI
            long r6 = r6 - r0
            int r0 = r5.LIZIZ
            long r1 = (long) r0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L71
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r5.LIZLLL
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6 = r0 ^ 1
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "cancel current task because of timeout, current="
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.append(r0)
            java.lang.String r0 = ", lastNotifyTime="
            r2.append(r0)
            long r0 = r5.LJI
            r2.append(r0)
            java.lang.String r0 = ", timeoutDuration="
            r2.append(r0)
            int r0 = r5.LIZIZ
            r2.append(r0)
            java.lang.String r0 = ", result="
            r2.append(r0)
            r0 = r6 ^ 1
            r2.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r2)
            X.0WiJ r1 = X.C830690WiJ.LIZIZ
            java.lang.String r0 = "PublishHeartbeatManager"
            X.C201955140j.LIZLLL(r1, r0, r2)
            long r2 = r5.LJI
            int r0 = r5.LIZIZ
            long r0 = (long) r0
            long r2 = r2 + r0
            r5.LJI = r2
            if (r6 == 0) goto L74
        L71:
            r5.LIZ()
        L74:
            return r4
        L75:
            java.lang.Object r2 = r6.l0
            X.0nal r2 = (X.C1440610nal) r2
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJI = r0
            return r4
        L80:
            java.lang.Object r2 = r6.l0
            X.0nal r2 = (X.C1440610nal) r2
            r2.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJI = r0
            r2.LIZ()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1466650oGl.handleMessage$1(X.0oGl, android.os.Message):boolean");
    }
}
