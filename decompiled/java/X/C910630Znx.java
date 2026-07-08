package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;
import com.ss.android.ugc.aweme.im.sdk.unreadindicator.SingleChatUnreadIndicatorViewModel;
import com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS593S0100000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Znx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.unreadindicator.SingleChatUnreadIndicatorViewModel$setUnreadUI$1", f = "SingleChatUnreadIndicatorViewModel.kt", l = {31, LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C910630Znx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SingleChatUnreadIndicatorViewModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ List<C910680Zo2> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910630Znx(SingleChatUnreadIndicatorViewModel singleChatUnreadIndicatorViewModel, int i, long j, List<C910680Zo2> list, InterfaceC1364105Vn<? super C910630Znx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = singleChatUnreadIndicatorViewModel;
        this.LLILLL = i;
        this.LLILZ = j;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C910630Znx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC910600Znu enumC910600Znu;
        Object objMN1 = obj;
        C1C7U.LIZ("SingleChatUnreadIndicatorViewModel@423a.setUnreadUI$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objMN1);
                    this.LLILLJJLI.setState(new AwS593S0100000_14(this.LLILZIL, (List<C0YAE>) 330));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SingleChatUnreadIndicatorViewModel@423a.setUnreadUI$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objMN1);
        } else {
            C155000ia.LIZIZ(objMN1);
            InterfaceC910720Zo6 interfaceC910720Zo6 = this.LLILLJJLI.LLILZ.getState().LLILZ;
            if (interfaceC910720Zo6 == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("SingleChatUnreadIndicatorViewModel@423a.setUnreadUI$1");
                return unit2;
            }
            if (C1527905yX.LIZIZ(interfaceC910720Zo6.getUnreadCount()) > this.LLILLL) {
                enumC910600Znu = EnumC910600Znu.MESSAGE;
            } else {
                enumC910600Znu = EnumC910600Znu.REACTION;
            }
            UnreadHandler unreadHandlerWQ2 = this.LLILLJJLI.wQ2(enumC910600Znu);
            long j = this.LLILZ;
            MessageListScrollAbility messageListScrollAbility = this.LLILLJJLI.LLILLL;
            this.LL = 1;
            objMN1 = unreadHandlerWQ2.mN1(j, interfaceC910720Zo6, messageListScrollAbility, this);
            if (objMN1 == objLJFF) {
                C1C7U.LIZIZ("SingleChatUnreadIndicatorViewModel@423a.setUnreadUI$1");
                return objLJFF;
            }
        }
        if (objMN1 != null) {
            Boolean.valueOf(this.LLILZIL.add((C910680Zo2) objMN1));
        }
        if (this.LLILZIL.isEmpty()) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("SingleChatUnreadIndicatorViewModel@423a.setUnreadUI$1");
            return unit3;
        }
        this.LL = 2;
        if (AnonymousClass0958.LIZIZ(700L, this) == objLJFF) {
            C1C7U.LIZIZ("SingleChatUnreadIndicatorViewModel@423a.setUnreadUI$1");
            return objLJFF;
        }
        this.LLILLJJLI.setState(new AwS593S0100000_14(this.LLILZIL, (List<C0YAE>) 330));
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SingleChatUnreadIndicatorViewModel@423a.setUnreadUI$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
