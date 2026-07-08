package X;

import com.bytedance.android.livesdk.adminsetting.LiveFilterCommentSettingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveFilterCommentSettingFragment$onViewStateRestored$2", f = "LiveFilterCommentSettingFragment.kt", l = {158}, m = "invokeSuspend")
public final class C487990JBt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveFilterCommentSettingFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487990JBt(LiveFilterCommentSettingFragment liveFilterCommentSettingFragment, InterfaceC1364105Vn<? super C487990JBt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveFilterCommentSettingFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C487990JBt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveFilterCommentSettingFragment@3d0a.onViewStateRestored$2");
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
            C751260TdU c751260TdU = this.LLILLJJLI.LLILZ;
            if (c751260TdU != null) {
                this.LL = 1;
                if (c751260TdU.LJ(this) == objLJFF) {
                    C1C7U.LIZIZ("LiveFilterCommentSettingFragment@3d0a.onViewStateRestored$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveFilterCommentSettingFragment@3d0a.onViewStateRestored$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
