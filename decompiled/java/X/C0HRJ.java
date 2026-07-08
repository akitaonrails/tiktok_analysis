package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.iddropdown.MixStudioIdDropdownViewModel;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0HRJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HRJ extends C09AY implements Function1<C0HRK, Unit> {
    public final /* synthetic */ C0HRL LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C443120HZe<Integer, String, C05YD<C0HOM<? extends C440440HOw>>> LLILLL;
    public final /* synthetic */ MixStudioIdDropdownViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0HRJ(C0HRL c0hrl, boolean z, C443120HZe<Integer, String, ? extends C05YD<? extends C0HOM<? extends C440440HOw>>> c443120HZe, MixStudioIdDropdownViewModel mixStudioIdDropdownViewModel) {
        super(1);
        this.LL = c0hrl;
        this.LLILLJJLI = z;
        this.LLILLL = c443120HZe;
        this.LLILZ = mixStudioIdDropdownViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0HRK c0hrk) {
        C0HRK c0hrk2 = c0hrk;
        C0HQC c0hqc = (C0HQC) ListProtector.get(this.LL.LIZIZ, c0hrk2.LLILLL);
        Set<? extends C443120HZe<Integer, String, ? extends C05YD<? extends C0HOM<? extends C440440HOw>>>> setLLIIIZ = C13LP.LLIIIZ(c0hrk2.LL);
        if (this.LLILLJJLI) {
            setLLIIIZ.add(this.LLILLL);
        } else {
            setLLIIIZ.remove(this.LLILLL);
        }
        this.LLILZ.setState(new AwS585S0100000_6(c0hqc.LIZJ.invoke(setLLIIIZ, this.LLILLL), (C0HQE<? extends Set<? extends C443120HZe<Integer, String, ? extends C05YD<? extends C0HOM<? extends C440440HOw>>>>, Integer>) 306));
        return Unit.LIZ;
    }
}
