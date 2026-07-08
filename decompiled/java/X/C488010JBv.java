package X;

import com.bytedance.android.livesdk.adminsetting.comment.filter.LiveFilterCommentSettingFragmentNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.comment.filter.LiveFilterCommentSettingFragmentNew$onViewStateRestored$1", f = "LiveFilterCommentSettingFragmentNew.kt", l = {209}, m = "invokeSuspend")
public final class C488010JBv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveFilterCommentSettingFragmentNew LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C488010JBv(LiveFilterCommentSettingFragmentNew liveFilterCommentSettingFragmentNew, InterfaceC1364105Vn<? super C488010JBv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveFilterCommentSettingFragmentNew;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C488010JBv(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveFilterCommentSettingFragmentNew@1abe.onViewStateRestored$1");
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
            C751260TdU c751260TdU = this.LLILLJJLI.LLJZIJLIL;
            if (c751260TdU != null) {
                this.LL = 1;
                if (c751260TdU.LJ(this) == objLJFF) {
                    C1C7U.LIZIZ("LiveFilterCommentSettingFragmentNew@1abe.onViewStateRestored$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveFilterCommentSettingFragmentNew@1abe.onViewStateRestored$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
