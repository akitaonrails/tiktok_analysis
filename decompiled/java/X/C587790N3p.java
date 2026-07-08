package X;

import android.os.SystemClock;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0N3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587790N3p extends C09AY implements Function2<File, Throwable, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ EnumC587690N3f LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C587790N3p(long j, EnumC587690N3f enumC587690N3f) {
        super(2);
        this.LL = j;
        this.LLILLJJLI = enumC587690N3f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(File file, Throwable th) {
        int i;
        Throwable th2 = th;
        C0N3Z c0n3z = C0N3Z.LIZ;
        if (th2 == null) {
            i = 1;
        } else {
            i = 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LL;
        EnumC587690N3f enumC587690N3f = this.LLILLJJLI;
        EnumC587710N3h enumC587710N3h = EnumC587710N3h.DISK;
        c0n3z.getClass();
        C0N3Z.LIZJ(i, 0, jElapsedRealtime, enumC587710N3h, enumC587690N3f, th2);
        return Unit.LIZ;
    }
}
