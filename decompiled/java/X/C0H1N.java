package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0H1N, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H1N extends C603820NmG<String, AnonymousClass0957<? extends Bitmap>> {
    public final C1DEV LJI;

    public C0H1N() {
        super(32);
        this.LJI = C2191201ApK.LIZ();
    }

    @Override // X.C603820NmG
    public final void LIZIZ(Object obj, Object obj2, Object obj3) {
        AnonymousClass0957 anonymousClass0957 = (AnonymousClass0957) obj2;
        if (!C1E7C.LIZ() && anonymousClass0957.isCompleted()) {
            try {
                Bitmap bitmap = (Bitmap) anonymousClass0957.LIZLLL();
                if (bitmap != null && !bitmap.isRecycled()) {
                    C786410Ut5.LJJJJ(bitmap);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
