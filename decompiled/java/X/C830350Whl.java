package X;

import android.content.Context;
import com.ss.android.ugc.profile.business.ur.ui.CropActivity;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Whl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830350Whl extends C09AY implements Function2<Boolean, Long, Unit> {
    public final /* synthetic */ C259800zU<Pair<String, Integer>> LL;
    public final /* synthetic */ CropActivity LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ CountDownLatch LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C830350Whl(C259800zU<Pair<String, Integer>> c259800zU, CropActivity cropActivity, Context context, CountDownLatch countDownLatch) {
        super(2);
        this.LL = c259800zU;
        this.LLILLJJLI = cropActivity;
        this.LLILLL = context;
        this.LLILZ = countDownLatch;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, kotlin.Pair] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Long l) {
        boolean z;
        boolean zBooleanValue = bool.booleanValue();
        long jLongValue = l.longValue();
        this.LL.element = this.LLILLJJLI.LLZZZIL();
        C1232140iAW c1232140iAW = C1232140iAW.LIZ;
        long jLJFF = C0WYJ.LJFF(this.LLILLL);
        String first = this.LL.element.getFirst();
        if (first != null && first.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Context context = this.LLILLL;
        Long lValueOf = Long.valueOf(jLongValue);
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        Boolean boolValueOf2 = Boolean.valueOf(!z);
        c1232140iAW.getClass();
        C1232140iAW.LIZJ(context, "checkAndHandleSaveFile clean finish", lValueOf, boolValueOf, jLJFF, boolValueOf2);
        this.LLILZ.countDown();
        return Unit.LIZ;
    }
}
