package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.emojibutton.DefaultEmojiBtnAbilityImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.emojibutton.DefaultEmojiBtnAbilityImpl$1", f = "DefaultEmojiBtnAbilityImpl.kt", l = {78}, m = "invokeSuspend")
public final class C441870HUj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IInputFieldAbility LLILLJJLI;
    public final /* synthetic */ DefaultEmojiBtnAbilityImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441870HUj(IInputFieldAbility iInputFieldAbility, DefaultEmojiBtnAbilityImpl defaultEmojiBtnAbilityImpl, InterfaceC1364105Vn<? super C441870HUj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iInputFieldAbility;
        this.LLILLL = defaultEmojiBtnAbilityImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C441870HUj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultEmojiBtnAbilityImpl@2979.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951Kv = this.LLILLJJLI.Kv();
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 147);
            this.LL = 1;
            if (anonymousClass0951Kv.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultEmojiBtnAbilityImpl@2979.<init>$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
