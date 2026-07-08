package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11AQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11AQ extends C09AY implements Function2<Integer, Float, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C11AM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11AQ(int i, C11AM c11am) {
        super(2);
        this.LL = i;
        this.LLILLJJLI = c11am;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Float f) {
        int iIntValue = num.intValue();
        f.floatValue();
        if (iIntValue < this.LL) {
            C11A9 c11a9 = (C11A9) this.LLILLJJLI.findSceneByTag("count_down");
            if (c11a9 != null) {
                C11AF c11af = c11a9.LLJIJIL;
                if (c11af == null) {
                    c11af = null;
                }
                c11af.setProgress(iIntValue);
            }
        } else {
            C19456911Ah c19456911AhLJFF = this.LLILLJJLI.LLJILLL.LJFF();
            if (c19456911AhLJFF != null) {
                c19456911AhLJFF.LJ();
            }
            this.LLILLJJLI.LLJJJIL = false;
        }
        return Unit.LIZ;
    }
}
