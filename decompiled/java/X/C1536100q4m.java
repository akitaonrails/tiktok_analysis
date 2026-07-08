package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536100q4m extends C09AY implements Function0<Unit> {
    public final /* synthetic */ File LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1536080q4k LLILLL;
    public final /* synthetic */ byte[] LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536100q4m(File file, String str, C1536080q4k c1536080q4k, byte[] bArr) {
        super(0);
        this.LL = file;
        this.LLILLJJLI = str;
        this.LLILLL = c1536080q4k;
        this.LLILZ = bArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        try {
            C0VSV c0vsv = new C0VSV(new C0VSJ(this.LL, this.LLILLJJLI));
            try {
                c0vsv.write(this.LLILZ);
                C2107108Nh.LIZ(c0vsv, null);
                AtomicInteger atomicInteger = this.LLILLL.LJI;
                if (atomicInteger != null && atomicInteger.decrementAndGet() == 0) {
                    this.LLILLL.LJI = null;
                    this.LLILLL.LIZLLL.LIZJ().mkdirs();
                    this.LL.renameTo(this.LLILLL.LIZLLL.LIZJ());
                    C1536030q4f c1536030q4f = C1536030q4f.LIZ;
                    AbstractC1536120q4o abstractC1536120q4o = this.LLILLL.LIZLLL;
                    c1536030q4f.getClass();
                    C1536030q4f.LJFF(abstractC1536120q4o);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(c0vsv, th);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            this.LLILLL.LJI = null;
            C1532760pzO.LIZIZ(C1536180q4u.LIZJ, "JsCodeCacheOperation", "onResponse", "record failed", th4, null, 32);
        }
        return Unit.LIZ;
    }
}
