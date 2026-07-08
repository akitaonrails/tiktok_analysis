package X;

import com.ss.android.ugc.aweme.im.quickchat.ui.assem.QuickDMEmojiAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.assem.QuickDMEmojiAbility$getEmojiBtnStateFlow$1", f = "IMQuickMessageInputVM.kt", l = {242}, m = "invokeSuspend")
public final class C441950HUr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ QuickDMEmojiAbility LLILLJJLI;
    public final /* synthetic */ InterfaceC332260D0u<InterfaceC441910HUn> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441950HUr(QuickDMEmojiAbility quickDMEmojiAbility, InterfaceC332260D0u<InterfaceC441910HUn> interfaceC332260D0u, InterfaceC1364105Vn<? super C441950HUr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = quickDMEmojiAbility;
        this.LLILLL = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C441950HUr(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickDMEmojiAbility@6d1f.getEmojiBtnStateFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C515901zh c515901zhLJIIIIZZ = C09IC.LJIIIIZZ(this.LLILLJJLI.LLILLJJLI.Kv(), this.LLILLJJLI.LLILLL.LJIILLIIL(), this.LLILLJJLI.LLILZ.getPanelType(), new C441920HUo(this.LLILLL, null));
            this.LL = 1;
            if (C09IC.LJI(c515901zhLJIIIIZZ, this) == objLJFF) {
                C1C7U.LIZIZ("QuickDMEmojiAbility@6d1f.getEmojiBtnStateFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickDMEmojiAbility@6d1f.getEmojiBtnStateFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
