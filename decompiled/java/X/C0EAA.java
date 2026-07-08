package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EAA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EAA extends C09AY implements Function1<C360210EAh, C360210EAh> {
    public final /* synthetic */ C0EA5 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Pair<Integer, Integer> LLILLL;
    public final /* synthetic */ C259800zU<ResourceItem> LLILZ;
    public final /* synthetic */ NLETrackSlot LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0EAA(C0EA5 c0ea5, int i, Pair<Integer, Integer> pair, C259800zU<ResourceItem> c259800zU, NLETrackSlot nLETrackSlot) {
        super(1);
        this.LL = c0ea5;
        this.LLILLJJLI = i;
        this.LLILLL = pair;
        this.LLILZ = c259800zU;
        this.LLILZIL = nLETrackSlot;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C360210EAh invoke(C360210EAh c360210EAh) {
        C375830EoP c375830EoP = new C375830EoP(C360160EAc.LIZ(this.LL.LJ.getState().LJ.LIZ, false, false, false, 3));
        C375830EoP c375830EoP2 = new C375830EoP(new C360150EAb(true, new C0EB2(this.LLILLJJLI, this.LLILLL.getFirst().intValue(), this.LLILLL.getSecond().intValue())));
        return C360210EAh.LIZ(c360210EAh, null, null, new C375830EoP(Boolean.TRUE), new C375830EoP(this.LLILZ.element), c375830EoP, c375830EoP2, new C375830EoP(Boolean.valueOf(C351220Dpo.LLFZ(this.LLILZIL))), null, false, null, false, false, 0, false, 16259);
    }
}
