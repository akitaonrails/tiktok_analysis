package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.153h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204579153h extends AbstractRunnableC20737316Ct {
    public final Function1<String, Unit> LLJJJJLIIL;
    public final Function0<Unit> LLJJL;
    public final Function1<Exception, Unit> LLJJLIIIJLLLLLLLZ;
    public final Function2<String, InterfaceC204578153g, Unit> LLJL;
    public final Function1<InterfaceC204578153g, Unit> LLJLIL;

    @Override // X.AbstractRunnableC20737316Ct
    public final void LJJIJIL() {
        Function1<String, Unit> function1 = this.LLJJJJLIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WebSocket服务器已启动，端口: ");
        sbLIZ.append(this.LLJIJIL.getPort());
        function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJL.invoke();
        synchronized (this.LLIZLLLIL) {
            try {
                long nanos = TimeUnit.SECONDS.toNanos(0);
                this.LLILZLL = nanos;
                if (nanos <= 0) {
                    this.LLILLJJLI.trace("Connection lost timer stopped");
                    LJIJ();
                    return;
                }
                if (this.LLIZ) {
                    this.LLILLJJLI.trace("Connection lost timer restarted");
                    try {
                        for (InterfaceC204578153g interfaceC204578153g : new ArrayList(LJIJJ())) {
                            if (interfaceC204578153g instanceof C16D0) {
                                C16D0 c16d0 = (C16D0) interfaceC204578153g;
                                c16d0.getClass();
                                c16d0.LLJJIJI = System.nanoTime();
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LLILLJJLI.error("Exception during connection lost restart", (Throwable) e);
                    }
                    LJIJJLI();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractRunnableC20737316Ct
    public final void LJJIJ(Exception exc) {
        Function1<String, Unit> function1 = this.LLJJJJLIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("发生错误: Exep: ");
        sbLIZ.append(exc.getClass().getName());
        sbLIZ.append(", message: ");
        sbLIZ.append(exc.getMessage());
        function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJLIIIJLLLLLLLZ.invoke(exc);
    }

    public final void LJJJJ(String str) {
        for (InterfaceC204578153g interfaceC204578153g : LJIJJ()) {
            if (interfaceC204578153g.isOpen()) {
                interfaceC204578153g.LIZ(str);
            }
        }
    }

    @Override // X.AbstractRunnableC20737316Ct
    public final void LJJIIZI(InterfaceC204578153g interfaceC204578153g, String str) {
        Function1<String, Unit> function1 = this.LLJJJJLIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("客户端已断开: ");
        sbLIZ.append(interfaceC204578153g.LIZLLL());
        sbLIZ.append(", 原因: ");
        sbLIZ.append(str);
        function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractRunnableC20737316Ct
    public final void LJJIJIIJI(String str, InterfaceC204578153g interfaceC204578153g) {
        this.LLJL.invoke(str, interfaceC204578153g);
    }

    @Override // X.AbstractRunnableC20737316Ct
    public final void LJJIJIIJIL(InterfaceC204578153g interfaceC204578153g, C16DX c16dx) {
        Function1<String, Unit> function1 = this.LLJJJJLIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("客户端已连接: ");
        sbLIZ.append(interfaceC204578153g.LIZLLL());
        function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLIL.invoke(interfaceC204578153g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C204579153h(int i, Function1<? super String, Unit> function1, Function0<Unit> function0, Function1<? super Exception, Unit> function12, Function2<? super String, ? super InterfaceC204578153g, Unit> function2, Function1<? super InterfaceC204578153g, Unit> function13) {
        super(new InetSocketAddress(i));
        this.LLJJJJLIIL = function1;
        this.LLJJL = function0;
        this.LLJJLIIIJLLLLLLLZ = function12;
        this.LLJL = function2;
        this.LLJLIL = function13;
    }
}
