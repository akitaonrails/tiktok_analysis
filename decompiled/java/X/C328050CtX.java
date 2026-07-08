package X;

import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment$setTryModePushParamsIO$1", f = "LiveBroadcastPreviewFragment.kt", l = {1133}, m = "invokeSuspend")
public final class C328050CtX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveBroadcastPreviewFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328050CtX(LiveBroadcastPreviewFragment liveBroadcastPreviewFragment, InterfaceC1364105Vn<? super C328050CtX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveBroadcastPreviewFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328050CtX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBroadcastPreviewFragment@146.setTryModePushParamsIO$1");
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
            C327950CtN c327950CtNLJFF = C771670UOv.LJFF();
            if (c327950CtNLJFF != null) {
                this.LL = 1;
                obj = C2296808zG.LJ(new C327450CsZ(c327950CtNLJFF, null, false, false), this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.setTryModePushParamsIO$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.setTryModePushParamsIO$1");
            return unit;
        }
        C328040CtW c328040CtW = (C328040CtW) obj;
        if (c328040CtW != null) {
            this.LLILLJJLI.oS(c328040CtW);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.setTryModePushParamsIO$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
