package X;

import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.ChatroomInputButtonKt$assembleMixStudioLoading$1$1", f = "ChatroomInputButton.kt", l = {}, m = "invokeSuspend")
public final class C441820HUe extends C09AX implements InterfaceC1631620sYq<InterfaceC441910HUn, AbstractC440540HPg, InterfaceC1364105Vn<? super C342950DcT>, Object> {
    public /* synthetic */ InterfaceC441910HUn LL;
    public /* synthetic */ AbstractC440540HPg LLILLJJLI;
    public final /* synthetic */ MixStudioEntranceControl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441820HUe(MixStudioEntranceControl mixStudioEntranceControl, InterfaceC1364105Vn<? super C441820HUe> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = mixStudioEntranceControl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C342950DcT c342950DcT;
        MixStudioEntranceControl mixStudioEntranceControl;
        MixStudioEntranceControl mixStudioEntranceControl2;
        C1C7U.LIZ("ChatroomInputButtonKt@5cca.assembleMixStudioLoading$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC441910HUn interfaceC441910HUn = this.LL;
        AbstractC440540HPg abstractC440540HPg = this.LLILLJJLI;
        if (Intrinsics.LJFF(interfaceC441910HUn, new C441860HUi(EnumC441840HUg.IMAGINE_LOADING))) {
            if ((abstractC440540HPg instanceof C441130HRn) && (mixStudioEntranceControl2 = this.LLILLL) != null && mixStudioEntranceControl2.LIZ()) {
                c342950DcT = new C342950DcT(true, EnumC342940DcS.COMPLETED);
            } else if (abstractC440540HPg instanceof C441120HRm) {
                c342950DcT = new C342950DcT(true, EnumC342940DcS.LOADING);
            } else if (C440560HPi.LIZ(abstractC440540HPg) && (mixStudioEntranceControl = this.LLILLL) != null && mixStudioEntranceControl.LIZ()) {
                c342950DcT = new C342950DcT(true, EnumC342940DcS.ERROR);
            } else {
                c342950DcT = new C342950DcT(2);
            }
        } else {
            c342950DcT = new C342950DcT(2);
        }
        C1C7U.LIZIZ("ChatroomInputButtonKt@5cca.assembleMixStudioLoading$1$1");
        return c342950DcT;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC441910HUn interfaceC441910HUn, AbstractC440540HPg abstractC440540HPg, InterfaceC1364105Vn<? super C342950DcT> interfaceC1364105Vn) {
        C441820HUe c441820HUe = new C441820HUe(this.LLILLL, interfaceC1364105Vn);
        c441820HUe.LL = interfaceC441910HUn;
        c441820HUe.LLILLJJLI = abstractC440540HPg;
        return c441820HUe.invokeSuspend(Unit.LIZ);
    }
}
