package X;

import com.bytedance.im.core.proto.GetMediaStatusRequestBody;
import com.bytedance.im.core.proto.GetMediaStatusResponseBody;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xsb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.message.media.DefaultMediaAbility$checkMediaStatus$1", f = "DefaultMediaAbility.kt", l = {74}, m = "invokeSuspend")
public final class C862550Xsb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<GetMediaStatusRequestBody.MediaKey> $mediaList;
    public final /* synthetic */ Function1<Map<String, GetMediaStatusResponseBody.MediaStatusInfo>, Unit> $onResult;
    public int label;
    public final /* synthetic */ C0YHQ this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C862550Xsb(C0YHQ c0yhq, List<GetMediaStatusRequestBody.MediaKey> list, Function1<? super Map<String, GetMediaStatusResponseBody.MediaStatusInfo>, Unit> function1, InterfaceC1364105Vn<? super C862550Xsb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.this$0 = c0yhq;
        this.$mediaList = list;
        this.$onResult = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862550Xsb(this.this$0, this.$mediaList, this.$onResult, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        C1C7U.LIZ("DefaultMediaAbility@ef21.checkMediaStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0YH8 c0yh8 = (C0YH8) this.this$0.LJ.getValue();
            List<GetMediaStatusRequestBody.MediaKey> list = this.$mediaList;
            this.label = 1;
            objLIZ = c0yh8.LIZ(list, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("DefaultMediaAbility@ef21.checkMediaStatus$1");
                return objLJFF;
            }
        }
        Function1<Map<String, GetMediaStatusResponseBody.MediaStatusInfo>, Unit> function1 = this.$onResult;
        Map mapLJ = C2097608Jq.LJ();
        if (C189200o6.m7isFailureimpl(objLIZ)) {
            objLIZ = mapLJ;
        }
        function1.invoke((Map<String, GetMediaStatusResponseBody.MediaStatusInfo>) objLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultMediaAbility@ef21.checkMediaStatus$1");
        return unit;
    }
}
