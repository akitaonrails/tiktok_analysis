package X;

import android.content.Context;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragment;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragmentParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS484S0200000_19;
import njp.a;

/* JADX INFO: renamed from: X.0i3V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragment$handleOpenInvitePeoplePanel$1", f = "FanGroupChooseGroupFragment.kt", l = {683}, m = "invokeSuspend")
public final class C1227790i3V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ FanGroupChooseGroupFragmentParam LLILZ;
    public final /* synthetic */ FanGroupChooseGroupFragment LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1227790i3V(Context context, long j, FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam, FanGroupChooseGroupFragment fanGroupChooseGroupFragment, InterfaceC1364105Vn<? super C1227790i3V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = j;
        this.LLILZ = fanGroupChooseGroupFragmentParam;
        this.LLILZIL = fanGroupChooseGroupFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1227790i3V(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FanGroupChooseGroupFragment@28bb.handleOpenInvitePeoplePanel$1");
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
            C1227000i2E c1227000i2E = C1227000i2E.LIZ;
            Context context = this.LLILLJJLI;
            long j = this.LLILLL;
            FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam = this.LLILZ;
            String str = fanGroupChooseGroupFragmentParam.enterFrom;
            String str2 = fanGroupChooseGroupFragmentParam.enterMethod;
            boolean z = fanGroupChooseGroupFragmentParam.isFullScreen;
            Float f = fanGroupChooseGroupFragmentParam.panelHeightRatio;
            AwS484S0200000_19 awS484S0200000_19 = new AwS484S0200000_19(this.LLILZIL, fanGroupChooseGroupFragmentParam, 12);
            this.LL = 1;
            if (c1227000i2E.LIZ(context, j, str, str2, z, f, awS484S0200000_19, this) == objLJFF) {
                C1C7U.LIZIZ("FanGroupChooseGroupFragment@28bb.handleOpenInvitePeoplePanel$1");
                return objLJFF;
            }
        }
        boolean z2 = this.LLILZ.isFullScreen;
        FanGroupChooseGroupFragment fanGroupChooseGroupFragment = this.LLILZIL;
        C1616906Ut.LIZ(z2, fanGroupChooseGroupFragment, fanGroupChooseGroupFragment.getActivity());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FanGroupChooseGroupFragment@28bb.handleOpenInvitePeoplePanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
