package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HSI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment$fetchMixStudioStatus$1$1", f = "BaseChatRootFragment.kt", l = {}, m = "invokeSuspend")
public final class C0HSI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ FriendsIDInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HSI(C19EG c19eg, String str, FriendsIDInfo friendsIDInfo, InterfaceC1364105Vn<? super C0HSI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = friendsIDInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HSI(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<String> list;
        C1C7U.LIZ("BaseChatRootFragment@beaf.fetchMixStudioStatus$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MixStudioLauncher mixStudioLauncher = (MixStudioLauncher) PluggableExtentionKt.pluggableSpi$default(MixStudioLauncher.class, false, false, false, 14, null);
        if (mixStudioLauncher != null) {
            C19EG c19eg = this.LL;
            String str = this.LLILLJJLI;
            EnumC441640HTm enumC441640HTm = EnumC441640HTm.SOCIAL_AVATAR_STICKER_PANEL;
            C0HQ4 c0hq4 = MixStudioLauncher.IdAndElementConfiguration.Companion;
            String strLIZIZ = C461720I8s.LIZIZ();
            FriendsIDInfo friendsIDInfo = this.LLILLL;
            if (friendsIDInfo != null) {
                list = friendsIDInfo.friendUidList;
            } else {
                list = null;
            }
            c0hq4.getClass();
            mixStudioLauncher.LIZ(c19eg, str, enumC441640HTm, "chat", null, new MixStudioLauncher.IdAndElementConfiguration(C0HQ4.LIZ(strLIZIZ, list), new MixStudioLauncher.DefaultIdConfig((String) null, 0, 0, 9), null), new MixStudioLauncher.GenerationConfiguration(false, false));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseChatRootFragment@beaf.fetchMixStudioStatus$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
