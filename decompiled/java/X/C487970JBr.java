package X;

import com.bytedance.android.livesdk.adminsetting.LiveFilterCommentSettingFragmentSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveFilterCommentSettingFragmentSheet$onViewStateRestored$1", f = "LiveFilterCommentSettingFragmentSheet.kt", l = {135}, m = "invokeSuspend")
public final class C487970JBr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveFilterCommentSettingFragmentSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487970JBr(LiveFilterCommentSettingFragmentSheet liveFilterCommentSettingFragmentSheet, InterfaceC1364105Vn<? super C487970JBr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveFilterCommentSettingFragmentSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C487970JBr(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveFilterCommentSettingFragmentSheet@3a88.onViewStateRestored$1");
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
            C751260TdU c751260TdU = this.LLILLJJLI.LLJZ;
            if (c751260TdU != null) {
                this.LL = 1;
                if (c751260TdU.LJ(this) == objLJFF) {
                    C1C7U.LIZIZ("LiveFilterCommentSettingFragmentSheet@3a88.onViewStateRestored$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveFilterCommentSettingFragmentSheet@3a88.onViewStateRestored$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
