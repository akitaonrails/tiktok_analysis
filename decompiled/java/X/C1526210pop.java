package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526210pop extends C09AY implements Function0<List<? extends C801490VcJ>> {
    public final /* synthetic */ C1527670prB LL;
    public final /* synthetic */ C1526010poV LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1526210pop(C1527670prB c1527670prB, C1526010poV c1526010poV) {
        super(0);
        this.LL = c1527670prB;
        this.LLILLJJLI = c1526010poV;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C801490VcJ> invoke() {
        List<C801490VcJ> arrayList;
        try {
            arrayList = this.LL.LJJZ().LIZIZ(this.LLILLJJLI.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.getClass();
            C1527890prX.LIZIZ(Intrinsics.LJIIJJI(Log.getStackTraceString(th), "[DBServiceImplV4] "));
            C1526300poy.LIZLLL("exception when queryLocalSyncCursorInfo", th);
            arrayList = new ArrayList<>();
        }
        C1526010poV c1526010poV = this.LLILLJJLI;
        ArrayList arrayList2 = new ArrayList();
        for (C801490VcJ c801490VcJ : arrayList) {
            C801490VcJ c801490VcJ2 = c801490VcJ;
            if (c801490VcJ2.LJ == EnumC1527250pqV.Device || C1525640pnu.LIZ(c801490VcJ2.LIZJ, c1526010poV.LIZIZ)) {
                arrayList2.add(c801490VcJ);
            }
        }
        return arrayList2;
    }
}
