package X;

import android.app.Application;
import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Whk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830340Whk extends C09AY implements Function2<Boolean, Long, Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ CountDownLatch LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C830340Whk(C013C c013c, Bitmap bitmap, String str, String str2, CountDownLatch countDownLatch) {
        super(2);
        this.LL = c013c;
        this.LLILLJJLI = bitmap;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = countDownLatch;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Long l) {
        boolean zBooleanValue = bool.booleanValue();
        long jLongValue = l.longValue();
        this.LL.element = C830320Whi.LIZ.LIZJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, false);
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        Application applicationLIZ = C1202420hOa.LIZ();
        long jLJFF = C0WYJ.LJFF(C1202420hOa.LIZ());
        boolean z = this.LL.element;
        Long lValueOf = Long.valueOf(jLongValue);
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        Boolean boolValueOf2 = Boolean.valueOf(z);
        c1232140iAW.getClass();
        C1232140iAW.LIZJ(applicationLIZ, "checkAndHandleSaveFile clean finish", lValueOf, boolValueOf, jLJFF, boolValueOf2);
        this.LLILZIL.countDown();
        return Unit.LIZ;
    }
}
