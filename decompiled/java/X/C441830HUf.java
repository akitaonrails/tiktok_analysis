package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.ChatroomInputButtonKt$assembleMixStudioLoading$1", f = "ChatroomInputButton.kt", l = {255}, m = "invokeSuspend")
public final class C441830HUf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IEmojiBtnAbility LLILLJJLI;
    public final /* synthetic */ MixStudioStatusRepository LLILLL;
    public final /* synthetic */ MixStudioEntranceControl LLILZ;
    public final /* synthetic */ InterfaceC332260D0u<C342950DcT> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441830HUf(IEmojiBtnAbility iEmojiBtnAbility, MixStudioStatusRepository mixStudioStatusRepository, MixStudioEntranceControl mixStudioEntranceControl, InterfaceC332260D0u<C342950DcT> interfaceC332260D0u, InterfaceC1364105Vn<? super C441830HUf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iEmojiBtnAbility;
        this.LLILLL = mixStudioStatusRepository;
        this.LLILZ = mixStudioEntranceControl;
        this.LLILZIL = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C441830HUf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatroomInputButtonKt@5cca.assembleMixStudioLoading$1");
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
            C414301jJ c414301jJ = new C414301jJ(this.LLILLJJLI.W90(), this.LLILLL.getTaskStatus(), new C441820HUe(this.LLILZ, null));
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILZIL, 141);
            this.LL = 1;
            if (c414301jJ.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("ChatroomInputButtonKt@5cca.assembleMixStudioLoading$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatroomInputButtonKt@5cca.assembleMixStudioLoading$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
