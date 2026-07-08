package X;

import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterViewModel;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05tU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem$subscribeToThoughtBubbleProvider$1$1", f = "SingleTitleBarCenterAssem.kt", l = {}, m = "invokeSuspend")
public final class C1496605tU extends C09AX implements Function2<ThoughtInfo, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ SingleTitleBarCenterAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1496605tU(C013C c013c, SingleTitleBarCenterAssem singleTitleBarCenterAssem, InterfaceC1364105Vn<? super C1496605tU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = singleTitleBarCenterAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1496605tU c1496605tU = new C1496605tU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1496605tU.LL = obj;
        return c1496605tU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleTitleBarCenterAssem@32f.subscribeToThoughtBubbleProvider$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ThoughtInfo thoughtInfo = (ThoughtInfo) this.LL;
        C013C c013c = this.LLILLJJLI;
        if (c013c.element && thoughtInfo == null) {
            c013c.element = false;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SingleTitleBarCenterAssem@32f.subscribeToThoughtBubbleProvider$1$1");
            return unit;
        }
        c013c.element = false;
        SingleTitleBarCenterViewModel singleTitleBarCenterViewModelSp = this.LLILLL.sp();
        if (!C343820Dds.LIZ()) {
            singleTitleBarCenterViewModelSp.setState(AFwS229S0000000_2.get$arr$(698));
        } else {
            C1639906bV c1639906bVVQ2 = singleTitleBarCenterViewModelSp.vQ2(C1639906bV.LIZ(singleTitleBarCenterViewModelSp.getState(), null, null, null, false, null, false, thoughtInfo, null, null, 895), false);
            if (!Intrinsics.LJFF(c1639906bVVQ2, singleTitleBarCenterViewModelSp.getState())) {
                singleTitleBarCenterViewModelSp.setState(new AwS581S0100000_2(c1639906bVVQ2, 484));
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SingleTitleBarCenterAssem@32f.subscribeToThoughtBubbleProvider$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ThoughtInfo thoughtInfo, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(thoughtInfo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
