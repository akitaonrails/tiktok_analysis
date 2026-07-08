package X;

import Y.ARunnableS106S0100000_6;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0syq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.addyours.EditAddYoursStickerComponent$showUserCanModifyAYTopicGuideOnCreate$1$1", f = "EditAddYoursStickerComponent.kt", l = {330, 331}, m = "invokeSuspend")
public final class C1647740syq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C390150FRl LL;
    public C19643011tE LLILLJJLI;
    public C390150FRl LLILLL;
    public int LLILZ;
    public final /* synthetic */ C390150FRl LLILZIL;
    public final /* synthetic */ C19643011tE LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647740syq(C390150FRl c390150FRl, C19643011tE c19643011tE, InterfaceC1364105Vn<? super C1647740syq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c390150FRl;
        this.LLILZLL = c19643011tE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1647740syq(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C390150FRl c390150FRl;
        C19643011tE c19643011tE;
        C390150FRl c390150FRl2;
        AddYoursStickerModel addYoursStickerModelLJLI;
        C1C7U.LIZ("EditAddYoursStickerComponent@cc62.showUserCanModifyAYTopicGuideOnCreate$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c390150FRl = this.LLILLL;
                    c19643011tE = this.LLILLJJLI;
                    c390150FRl2 = this.LL;
                    C155000ia.LIZIZ(obj);
                    addYoursStickerModelLJLI = c390150FRl2.LJLI();
                    C0FSZ c0fsz = null;
                    if (!(addYoursStickerModelLJLI instanceof AddYoursStickerModel) && addYoursStickerModelLJLI != null) {
                        if (!addYoursStickerModelLJLI.getNeedRemindUserCanChangeTopic()) {
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("EditAddYoursStickerComponent@cc62.showUserCanModifyAYTopicGuideOnCreate$1$1");
                            return unit;
                        }
                        addYoursStickerModelLJLI.setNeedRemindUserCanChangeTopic(false);
                        if (C299960BpK.LIZIZ) {
                            if (C299960BpK.LIZJ) {
                                c0fsz = new C0FSZ() { // from class: X.0sym
                                    @Override // X.C0FSZ
                                    public final void LIZ(TuxTextView tuxTextView) {
                                        C388980FMy.LIZ.getClass();
                                        HandlerHook.viewPostDelay(tuxTextView, new ARunnableS106S0100000_6((Object) tuxTextView, 144), 1000L);
                                    }
                                };
                            }
                            InterfaceC391240FVq interfaceC391240FVqH2 = c19643011tE.H2();
                            if (interfaceC391240FVqH2 != null) {
                                interfaceC391240FVqH2.LLILII(true, C1664590tQ1.LJII(c19643011tE).getResources().getString(2131833182), c390150FRl.getStickerId(), C0FSX.BOTTOM, null, null, C2286608xc.LJ(2600), null, c0fsz);
                            }
                        }
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("EditAddYoursStickerComponent@cc62.showUserCanModifyAYTopicGuideOnCreate$1$1");
                        return unit2;
                    }
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("EditAddYoursStickerComponent@cc62.showUserCanModifyAYTopicGuideOnCreate$1$1");
                    return unit3;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c390150FRl = this.LLILLL;
            c19643011tE = this.LLILLJJLI;
            c390150FRl2 = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            c390150FRl = this.LLILZIL;
            c19643011tE = this.LLILZLL;
            this.LL = c390150FRl;
            this.LLILLJJLI = c19643011tE;
            this.LLILLL = c390150FRl;
            this.LLILZ = 1;
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("EditAddYoursStickerComponent@cc62.showUserCanModifyAYTopicGuideOnCreate$1$1");
                return objLJFF;
            }
            c390150FRl2 = c390150FRl;
        }
        this.LL = c390150FRl2;
        this.LLILLJJLI = c19643011tE;
        this.LLILLL = c390150FRl;
        this.LLILZ = 2;
        if (c390150FRl.LJIJJ(false, this) == objLJFF) {
            C1C7U.LIZIZ("EditAddYoursStickerComponent@cc62.showUserCanModifyAYTopicGuideOnCreate$1$1");
            return objLJFF;
        }
        addYoursStickerModelLJLI = c390150FRl2.LJLI();
        C0FSZ c0fsz2 = null;
        if (!(addYoursStickerModelLJLI instanceof AddYoursStickerModel)) {
        }
        Unit unit32 = Unit.LIZ;
        C1C7U.LIZIZ("EditAddYoursStickerComponent@cc62.showUserCanModifyAYTopicGuideOnCreate$1$1");
        return unit32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
