package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.message.media.usecase.SendMediaMessageUseCaseV2$startSendingProcess$1", f = "SendMediaMessageUseCaseV2.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C873510YOn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC873790YPp $emitter;
    public final /* synthetic */ C873500YOm $input;
    public int label;
    public final /* synthetic */ C873570YOt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873510YOn(C873570YOt c873570YOt, C873500YOm c873500YOm, InterfaceC873790YPp interfaceC873790YPp, InterfaceC1364105Vn<? super C873510YOn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.this$0 = c873570YOt;
        this.$input = c873500YOm;
        this.$emitter = interfaceC873790YPp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C873510YOn(this.this$0, this.$input, this.$emitter, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMediaMessageUseCaseV2@e361.startSendingProcess$1");
        Object objLJFF = C099R.LJFF();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C873570YOt c873570YOt = this.this$0;
            C873500YOm c873500YOm = this.$input;
            InterfaceC873790YPp interfaceC873790YPp = this.$emitter;
            this.label = 1;
            if (c873570YOt.LIZ(c873500YOm, interfaceC873790YPp, this) == objLJFF) {
                C1C7U.LIZIZ("SendMediaMessageUseCaseV2@e361.startSendingProcess$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendMediaMessageUseCaseV2@e361.startSendingProcess$1");
        return unit;
    }
}
