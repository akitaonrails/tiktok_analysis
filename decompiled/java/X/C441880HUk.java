package X;

import Y.AgS197S0200000_6;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerFeatureIconAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.ChatroomInputButtonKt$assembleStickerFeatureIcon$1", f = "ChatroomInputButton.kt", l = {397}, m = "invokeSuspend")
public final class C441880HUk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IEmojiBtnAbility LLILLJJLI;
    public final /* synthetic */ InterfaceC332260D0u<C434100H0m> LLILLL;
    public final /* synthetic */ IStickerFeatureIconAbility LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441880HUk(IEmojiBtnAbility iEmojiBtnAbility, InterfaceC332260D0u<C434100H0m> interfaceC332260D0u, IStickerFeatureIconAbility iStickerFeatureIconAbility, InterfaceC1364105Vn<? super C441880HUk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iEmojiBtnAbility;
        this.LLILLL = interfaceC332260D0u;
        this.LLILZ = iStickerFeatureIconAbility;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C441880HUk(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatroomInputButtonKt@5cca.assembleStickerFeatureIcon$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<InterfaceC441910HUn> c05ydW90 = this.LLILLJJLI.W90();
            AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(this.LLILLL, this.LLILZ, 19);
            this.LL = 1;
            if (c05ydW90.collect(agS197S0200000_6, this) == objLJFF) {
                C1C7U.LIZIZ("ChatroomInputButtonKt@5cca.assembleStickerFeatureIcon$1");
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
