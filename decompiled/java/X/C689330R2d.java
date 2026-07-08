package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.user.TakoUserAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.user.vm.TakoUserCardVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0R2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.user.TakoUserAssem$asyncUpdateUserMessage$1", f = "TakoUserAssem.kt", l = {}, m = "invokeSuspend")
public final class C689330R2d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoUserAssem LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C689330R2d(TakoUserAssem takoUserAssem, User user, boolean z, InterfaceC1364105Vn<? super C689330R2d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoUserAssem;
        this.LLILLJJLI = user;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C689330R2d(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Message messageYy1;
        String str;
        IMessageAbility iMessageAbility;
        Message messageDL1;
        List<TakoUserItem> list;
        C1C7U.LIZ("TakoUserAssem@ce3a.asyncUpdateUserMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TakoUserAssem takoUserAssem = this.LL;
        User user = this.LLILLJJLI;
        boolean z = this.LLILLL;
        synchronized (takoUserAssem) {
            takoUserAssem.LLJLLL++;
            if (z) {
                TakoUserCardVM.LL = System.currentTimeMillis();
                TakoUserCardVM.LLILLJJLI.put(user.getUid(), user);
            } else if (System.currentTimeMillis() - TakoUserCardVM.LL > Mp4ScreenVideoLoadTimeout.CONTROL) {
                TakoUserCardVM.LLILLJJLI.put(user.getUid(), user);
            }
            TakoCardAbility takoCardAbilityUp = takoUserAssem.up();
            if (takoCardAbilityUp != null && (messageYy1 = takoCardAbilityUp.Yy1()) != null && (str = messageYy1.msgId) != null && (iMessageAbility = (IMessageAbility) takoUserAssem.LLJLIL.getValue()) != null && (messageDL1 = iMessageAbility.DL1(str)) != null) {
                ArrayList arrayList = new ArrayList();
                TakoMixFeed takoMixFeedLJIIIZ = messageDL1.LJIIIZ();
                if (takoMixFeedLJIIIZ != null && (list = takoMixFeedLJIIIZ.userList) != null) {
                    for (TakoUserItem takoUserItem : list) {
                        if (Intrinsics.LJFF(String.valueOf(takoUserItem.userId), user.getUid())) {
                            arrayList.add(TakoUserAssem.yp(takoUserItem, user));
                        } else {
                            arrayList.add(takoUserItem);
                        }
                    }
                }
                TakoMixFeed takoMixFeedLJIIIZ2 = messageDL1.LJIIIZ();
                if (takoMixFeedLJIIIZ2 != null) {
                    takoMixFeedLJIIIZ2.userList = arrayList;
                }
                IMessageAbility iMessageAbility2 = (IMessageAbility) takoUserAssem.LLJLIL.getValue();
                if (iMessageAbility2 != null) {
                    iMessageAbility2.ua2(messageDL1, false, false);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoUserAssem@ce3a.asyncUpdateUserMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
