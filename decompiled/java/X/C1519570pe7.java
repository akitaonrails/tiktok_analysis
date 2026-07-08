package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.TraceInfo;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pe7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519570pe7 {
    public final ConcurrentLinkedDeque<C1519560pe6> LIZ = new ConcurrentLinkedDeque<>();
    public final ConcurrentLinkedDeque<C1519580pe8> LIZIZ = new ConcurrentLinkedDeque<>();
    public final String LIZJ = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();

    public final void LIZ() {
        C1519560pe6 c1519560pe6PollLast;
        if (this.LIZIZ.size() > 0) {
            this.LIZIZ.peekLast();
        } else {
            if (this.LIZ.size() <= 0 || (c1519560pe6PollLast = this.LIZ.pollLast()) == null) {
                return;
            }
            c1519560pe6PollLast.LIZ.LIZIZ(null);
            this.LIZ.remove(c1519560pe6PollLast);
        }
    }

    public final void LIZJ() {
        Iterator<C1519560pe6> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ.LIZIZ(null);
        }
        this.LIZ.clear();
        this.LIZIZ.clear();
    }

    public final void LIZIZ(InterfaceC497601wk interfaceC497601wk, ECommerceMessage eCommerceMessage, Function0<Unit> function0) {
        long jIntValue;
        long j;
        long j2;
        if (eCommerceMessage.pinCardDelayTime == 0) {
            Iterator<C1519560pe6> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ.LIZIZ(null);
            }
            this.LIZ.clear();
        }
        for (C1519560pe6 c1519560pe6 : this.LIZ) {
            TraceInfo traceInfo = eCommerceMessage.traceInfo;
            if (traceInfo != null) {
                j = traceInfo.operateTime;
            } else {
                j = 0;
            }
            TraceInfo traceInfo2 = c1519560pe6.LIZIZ.traceInfo;
            if (traceInfo2 != null) {
                j2 = traceInfo2.operateTime;
            } else {
                j2 = 0;
            }
            if (j < j2) {
                return;
            }
        }
        System.currentTimeMillis();
        C01GW c01gw = C0AA3.LIZ;
        if (((Number) c01gw.getValue()).intValue() == -1) {
            jIntValue = eCommerceMessage.pinCardDelayTime;
            if (jIntValue > 0) {
            }
            function0.invoke();
            this.LIZIZ.add(new C1519580pe8());
        }
        jIntValue = ((Number) c01gw.getValue()).intValue();
        if (jIntValue != 0) {
            long j3 = CastLongProtector.parseLong(this.LIZJ) % jIntValue;
            if (j3 != 0) {
                this.LIZ.add(new C1519560pe6(C23250099c.LIZLLL(interfaceC497601wk, C2126308Ur.LJFF, null, new C1519550pe5(j3, function0, this, eCommerceMessage, null), 2), eCommerceMessage));
                return;
            }
        }
        function0.invoke();
        this.LIZIZ.add(new C1519580pe8());
    }
}
