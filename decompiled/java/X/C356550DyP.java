package X;

import Y.AgS286S0100000_5;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0DyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.MagicDataLogicComponent$observeTaskStatus$1$1", f = "MagicDataLogicComponent.kt", l = {937}, m = "emit")
public final class C356550DyP extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C356720Dyg LLILLL;
    public Object LLILZ;
    public NLETrackSlot LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ AgS286S0100000_5<T> LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C356550DyP(AgS286S0100000_5<? super T> agS286S0100000_5, InterfaceC1364105Vn<? super C356550DyP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = agS286S0100000_5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MagicDataLogicComponent@f4bf.observeTaskStatus$1$1$emit$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZ$1 = this.LLIZ.LIZ$1(null, this);
        C1C7U.LIZIZ("MagicDataLogicComponent@f4bf.observeTaskStatus$1$1$emit$1");
        return objLIZ$1;
    }
}
