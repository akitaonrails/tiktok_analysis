package X;

import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.dynamic.card.api.DynamicCardService;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.06vl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1765506vl extends C09AY implements Function0<C1765406vk> {
    public C1765506vl() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.06vk] */
    @Override // kotlin.jvm.functions.Function0
    public final C1765406vk invoke() {
        return new InterfaceC1765906vp() { // from class: X.06vk
            @Override // X.InterfaceC1765906vp
            public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LIZ() {
                List<Class<? extends AbstractC1549150qPp<?, ?>>> listLJIL;
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                c13dvLIZIZ.addAll(C1697810uHb.LJIIJJI(C906820Zho.class, C1879280z0I.class, C601820Nj2.class));
                DynamicCardService.LIZ.getClass();
                c13dvLIZIZ.addAll(C1765306vj.LIZIZ.getValue().LIZIZ());
                IStreakService.LJJIIZ.getClass();
                c13dvLIZIZ.add(C06LY.LIZ().c0());
                IStreakPetService.LIZ.getClass();
                c13dvLIZIZ.addAll(C1586906Jf.LIZ().LJJIJIL());
                IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
                if (iMGroupChatApiLIZ == null || (listLJIL = iMGroupChatApiLIZ.LJIL()) == null) {
                    C1618506Vj.LIZJ(null, AFwS229S0000000_2.get$arr$(923));
                } else {
                    c13dvLIZIZ.addAll(listLJIL);
                }
                c13dvLIZIZ.addAll(C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJJI());
                IChatCustomizeHelper.LIZ.getClass();
                IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
                if (iChatCustomizeHelperLIZ != null && iChatCustomizeHelperLIZ.isSupportCustomization()) {
                    c13dvLIZIZ.add(C906870Zht.class);
                }
                return C1697820uHc.LIZ(c13dvLIZIZ);
            }
        };
    }
}
