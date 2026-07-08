package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ttnet.org.chromium.net.impl.JavaCronetEngine;
import com.ttnet.org.chromium.net.impl.w0;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0p5A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497900p5A extends w0 {
    public final Map<String, String> LIZ = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List<String> LIZIZ = new ArrayList();
    public final AtomicInteger LIZJ = new AtomicInteger(0);
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public String LJ;
    public C1497950p5F LJFF;
    public Executor LJI;
    public String LJII;
    public ReadableByteChannel LJIIIIZZ;
    public C1497220p44 LJIIIZ;
    public String LJIIJ;
    public HttpURLConnection LJIIJJI;
    public C1498000p5K LJIIL;

    @Override // com.ttnet.org.chromium.net.o0
    public final void LIZ(String str, String str2) {
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LIZIZ() {
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJII(long j) {
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJIIIIZZ(String str, String str2) {
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJIIIZ(int i) {
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJIIJJI(int i) {
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJIIL(long j) {
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJIILIIL(long j) {
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIIZILJ(int i) {
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIJ(int i) {
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIJI(int i) {
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIJJ(int i) {
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LIZLLL() {
        int andSet = this.LIZJ.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            new ARunnableS123S0100000_23(this, 63);
            throw null;
        }
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJFF() {
        LJJIFFI(3, 1, new ARunnableS123S0100000_23(this, 62));
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJIILJJIL() {
        LJJIFFI(0, 1, new ARunnableS123S0100000_23(this, 61));
    }

    public final void LJIL() {
        int i = this.LIZJ.get();
        if (i == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Request is already started. State is: ");
        sbLIZ.append(i);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJI() {
        if (this.LJFF == null || !this.LIZLLL.compareAndSet(false, true)) {
            return;
        }
        try {
            this.LJI.execute(new ARunnableS92S0200000_23(new InterfaceC1497890p59() { // from class: X.0p5E
                @Override // X.InterfaceC1497890p59
                public final void run() {
                    this.LIZ.LJFF.close();
                }
            }, this, 38));
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ttnet.org.chromium.net.o0
    public final void LJI(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (byteBuffer.hasRemaining()) {
                LJJIFFI(4, 5, new ARunnableS92S0200000_23(byteBuffer, this, 39));
                return;
            }
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIILLIIL(String str) {
        LJIL();
        if (str != null) {
            if (!"OPTIONS".equalsIgnoreCase(str) && !"GET".equalsIgnoreCase(str) && !"HEAD".equalsIgnoreCase(str) && !"POST".equalsIgnoreCase(str) && !"PUT".equalsIgnoreCase(str) && !"DELETE".equalsIgnoreCase(str) && !"TRACE".equalsIgnoreCase(str) && !"PATCH".equalsIgnoreCase(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid http method ");
                sbLIZ.append(str);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LJ = str;
            return;
        }
        throw new NullPointerException("Method is required.");
    }

    public final void LJJ(AbstractC1497730p4t abstractC1497730p4t) {
        int i;
        do {
            i = this.LIZJ.get();
            if (i != 0) {
                if (i == 6 || i == 7 || i == 8) {
                    return;
                }
            } else {
                throw new IllegalStateException("Can't enter error state before start");
            }
        } while (!this.LIZJ.compareAndSet(i, 6));
        new ARunnableS123S0100000_23(this, 63);
        throw null;
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIILL(String str, String str2) {
        LJIL();
        int i = 0;
        while (true) {
            if (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (cCharAt != ',' && cCharAt != '/' && cCharAt != '{' && cCharAt != '}') {
                    switch (cCharAt) {
                        case '\'':
                        case '(':
                        case ')':
                            break;
                        default:
                            switch (cCharAt) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case BaseNotice.CREATOR /* 62 */:
                                case '?':
                                case '@':
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                            break;
                                        default:
                                            if (!Character.isISOControl(cCharAt) && !Character.isWhitespace(cCharAt)) {
                                                i++;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                }
            } else if (!str2.contains("\r\n")) {
                if (((TreeMap) this.LIZ).containsKey(str)) {
                    ((TreeMap) this.LIZ).remove(str);
                }
                ((TreeMap) this.LIZ).put(str, str2);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid header ");
        sbLIZ.append(str);
        sbLIZ.append("=");
        sbLIZ.append(str2);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ttnet.org.chromium.net.impl.w0
    public final void LJIJJLI(AbstractC1498040p5O abstractC1498040p5O, final Executor executor) {
        if (abstractC1498040p5O != null) {
            if (((TreeMap) this.LIZ).containsKey("Content-Type")) {
                LJIL();
                if (this.LJ == null) {
                    this.LJ = "POST";
                }
                this.LJFF = new C1497950p5F(abstractC1498040p5O);
                this.LJI = new Executor(executor) { // from class: X.0p58
                    public final Executor LL;

                    {
                        this.LL = executor;
                    }

                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        RunnableC1497870p57 runnableC1497870p57 = new RunnableC1497870p57(runnable, C786410Ut5.u3());
                        this.LL.execute(runnableC1497870p57);
                        C1497780p4y c1497780p4y = runnableC1497870p57.LLILLL;
                        if (c1497780p4y == null) {
                            runnableC1497870p57.LLILLJJLI = null;
                            return;
                        }
                        throw c1497780p4y;
                    }
                };
                return;
            }
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
        throw new NullPointerException("Invalid UploadDataProvider.");
    }

    public final void LJJIFFI(int i, int i2, Runnable runnable) {
        if (!this.LIZJ.compareAndSet(i, i2)) {
            int i3 = this.LIZJ.get();
            if (i3 != 8 && i3 != 6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid state transition - expected ");
                sbLIZ.append(i);
                sbLIZ.append(" but was ");
                sbLIZ.append(i3);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return;
        }
        runnable.run();
    }

    public C1497900p5A(JavaCronetEngine javaCronetEngine, AbstractC1497700p4q abstractC1497700p4q, Executor executor, String str, boolean z, int i, boolean z2, int i2) {
        if (str != null) {
            if (abstractC1497700p4q != null) {
                throw new NullPointerException("Executor is required");
            }
            throw new NullPointerException("Listener is required");
        }
        throw new NullPointerException("URL is required");
    }
}
