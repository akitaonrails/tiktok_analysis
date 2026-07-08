package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HvH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.interfaces.DefaultRecordInputAbilityImpl$stopRecordMessageAndSend$1", f = "IRecordInputAbility.kt", l = {790}, m = "invokeSuspend")
public final class C456530HvH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C458200Hxy LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C458200Hxy LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ C0HVB LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456530HvH(C458200Hxy c458200Hxy, Context context, C0HVB c0hvb, InterfaceC1364105Vn<? super C456530HvH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c458200Hxy;
        this.LLILZIL = context;
        this.LLILZLL = c0hvb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C456530HvH(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C458200Hxy c458200Hxy;
        Context context;
        C1C7U.LIZ("DefaultRecordInputAbilityImpl@7bf5.stopRecordMessageAndSend$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                context = (Context) this.LLILLJJLI;
                c458200Hxy = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c458200Hxy = this.LLILZ;
            context = this.LLILZIL;
            this.LL = c458200Hxy;
            this.LLILLJJLI = context;
            this.LLILLL = 1;
            obj = c458200Hxy.LJJIJL(context, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultRecordInputAbilityImpl@7bf5.stopRecordMessageAndSend$1");
                return objLJFF;
            }
        }
        C458370HyF c458370HyF = (C458370HyF) obj;
        if (c458370HyF == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DefaultRecordInputAbilityImpl@7bf5.stopRecordMessageAndSend$1");
            return unit;
        }
        c458200Hxy.LJJIL(context, c458370HyF, this.LLILZLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DefaultRecordInputAbilityImpl@7bf5.stopRecordMessageAndSend$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
