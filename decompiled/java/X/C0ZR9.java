package X;

import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZR9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZR9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0ZRF LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZR9(C0ZRF c0zrf, String str, C869590Y9l c869590Y9l, String str2, long j) {
        super(0);
        this.LL = c0zrf;
        this.LLILLJJLI = str;
        this.LLILLL = c869590Y9l;
        this.LLILZ = str2;
        this.LLILZIL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C869590Y9l c869590Y9l;
        C0ZRF c0zrf = this.LL;
        if (!Intrinsics.LJFF(c0zrf, C0ZRH.LIZ)) {
            if (!(c0zrf instanceof C898980ZOm)) {
                throw new C1954807lC();
            }
            String str = this.LLILLJJLI;
            IMVoiceMessageUtil.LIZ.getClass();
            if (Intrinsics.LJFF(str, IMVoiceMessageUtil.LIZLLL)) {
                C898980ZOm c898980ZOm = (C898980ZOm) this.LL;
                C869590Y9l c869590Y9l2 = this.LLILLL;
                List<C869590Y9l> listVi2 = c898980ZOm.LIZ.vi2();
                Iterator<C869590Y9l> it2 = listVi2.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!Intrinsics.LJFF(it2.next().getUuid(), c869590Y9l2.getUuid())) {
                        i++;
                    } else if (i != -1 && (c869590Y9l = (C869590Y9l) C13LP.LJJJLZIJ(i - 1, listVi2)) != null && c869590Y9l.getMsgType() == 1813 && C0ZDX.LJJJJIZL(c869590Y9l2) == C0ZDX.LJJJJIZL(c869590Y9l) && (C0ZRA.LIZIZ(c869590Y9l) instanceof C0ZRG)) {
                        C0ZRA.LIZLLL(this.LLILZ, this.LLILZIL, c869590Y9l, this.LL);
                    } else {
                        C0ZRA.LIZ = false;
                    }
                }
            } else {
                C0ZRA.LIZ = false;
            }
        }
        return Unit.LIZ;
    }
}
