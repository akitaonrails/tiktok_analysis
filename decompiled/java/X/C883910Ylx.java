package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Ylx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.social.bridge.SocialInboxChatListBridge$notifySelectionChange$1", f = "SocialInboxChatListBridge.kt", l = {}, m = "invokeSuspend")
public final class C883910Ylx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C878950Ydx LL;
    public final /* synthetic */ FilterTabType LLILLJJLI;
    public final /* synthetic */ Set<EnumC880480YgQ> LLILLL;
    public final /* synthetic */ C883920Yly LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C883910Ylx(C878950Ydx c878950Ydx, FilterTabType filterTabType, Set<? extends EnumC880480YgQ> set, C883920Yly c883920Yly, InterfaceC1364105Vn<? super C883910Ylx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c878950Ydx;
        this.LLILLJJLI = filterTabType;
        this.LLILLL = set;
        this.LLILZ = c883920Yly;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C883910Ylx(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialInboxChatListBridge@b126.notifySelectionChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C878950Ydx c878950Ydx = this.LL;
        if (c878950Ydx.LLILLL == this.LLILLJJLI && Intrinsics.LJFF(c878950Ydx.LLILZ, this.LLILLL)) {
            C309160C9y.LIZ();
            InterfaceC884020Ym8 interfaceC884020Ym8 = this.LLILZ.LJ;
            if (interfaceC884020Ym8 != null) {
                interfaceC884020Ym8.X0("select_same_page_refresh");
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialInboxChatListBridge@b126.notifySelectionChange$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialInboxChatListBridge@b126.notifySelectionChange$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
