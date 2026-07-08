package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09U4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.UDPSocketPlatformMisc$startReceiveLoop$job$1", f = "UDPSocketPlatformMisc.kt", l = {}, m = "invokeSuspend")
public final class C09U4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C09U5 LLILLJJLI;
    public final /* synthetic */ C09U3 LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09U4(C09U5 c09u5, C09U3 c09u3, int i, InterfaceC1364105Vn<? super C09U4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09u5;
        this.LLILLL = c09u3;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C09U4 c09u4 = new C09U4(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c09u4.LL = obj;
        return c09u4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strD0;
        Integer num;
        C1C7U.LIZ("UDPSocketPlatformMisc@e2cc.startReceiveLoop$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        DatagramPacket datagramPacket = new DatagramPacket(new byte[9216], 9216);
        while (true) {
            if (this.LLILLJJLI.LIZ.isClosed() || !C2296808zG.LJI(interfaceC497601wk)) {
                break;
            }
            try {
                datagramPacket.setLength(9216);
                this.LLILLJJLI.LIZ.receive(datagramPacket);
            } catch (SocketException e) {
                TryCatchGuardChecker.doCheck(e);
                if (this.LLILLL.LJ.containsKey(C2286608xc.LJ(this.LLILZ))) {
                    C09U3 c09u3 = this.LLILLL;
                    int i = this.LLILZ;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "socket receive failed";
                    }
                    c09u3.LJJZZI(i, -2, message);
                }
            } catch (SocketTimeoutException e2) {
                TryCatchGuardChecker.doCheck(e2);
                if (!this.LLILLL.LJ.containsKey(C2286608xc.LJ(this.LLILZ))) {
                    this.LLILLL.LJJZ(this.LLILZ, this.LLILLJJLI);
                    break;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (this.LLILLL.LJ.containsKey(C2286608xc.LJ(this.LLILZ))) {
                    C1304110k2b.LIZ("receive message failed", th);
                    C09U3 c09u32 = this.LLILLL;
                    int i2 = this.LLILZ;
                    String message2 = th.getMessage();
                    if (message2 == null) {
                        message2 = "receive failed";
                    }
                    c09u32.LJJZZI(i2, -2, message2);
                }
            }
            if (!this.LLILLL.LJ.containsKey(C2286608xc.LJ(this.LLILZ))) {
                this.LLILLL.LJJZ(this.LLILZ, this.LLILLJJLI);
                break;
            }
            if (!this.LLILLJJLI.LIZLLL || (num = this.LLILLJJLI.LIZJ) == null || datagramPacket.getPort() == num.intValue()) {
                int length = datagramPacket.getLength();
                byte[] data = datagramPacket.getData();
                int offset = datagramPacket.getOffset();
                int offset2 = datagramPacket.getOffset() + length;
                C1691430u7J.LIZ(offset2, data.length);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(data, offset, offset2);
                C09U3 c09u33 = this.LLILLL;
                int i3 = this.LLILZ;
                InetAddress address = datagramPacket.getAddress();
                if (address == null || (strD0 = C2204961BRm.d0(address, new C0WZX("dzBzEgAjS8/YVFkiQFyFazRzjkQWGhg/xMmInCmbDBgXSP3lHXwHkAK6sfEdvDiihSyN29ZGdFZNIJDd1G1tFdbkFC6B3uPJ6l9ESg==", null))) == null) {
                    strD0 = "";
                }
                c09u33.LJJZZIII(i3, bArrCopyOfRange, strD0, datagramPacket.getPort(), this.LLILLJJLI.LIZ.getLocalPort(), length);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UDPSocketPlatformMisc@e2cc.startReceiveLoop$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
