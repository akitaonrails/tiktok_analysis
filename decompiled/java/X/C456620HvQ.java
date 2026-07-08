package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.interfaces.DefaultRecordInputAbilityImpl$reachedStopAndSaveRecording$1", f = "IRecordInputAbility.kt", l = {758}, m = "invokeSuspend")
public final class C456620HvQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C458200Hxy LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456620HvQ(C458200Hxy c458200Hxy, Context context, InterfaceC1364105Vn<? super C456620HvQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c458200Hxy;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C456620HvQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultRecordInputAbilityImpl@7bf5.reachedStopAndSaveRecording$1");
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
            InterfaceC458220Hy0 interfaceC458220Hy0LJJIIJZLJL = this.LLILLJJLI.LJJIIJZLJL();
            Context context = this.LLILLL;
            this.LLILLJJLI.getClass();
            long jLJJII = C458200Hxy.LJJII();
            AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(this.LLILLJJLI, 415);
            this.LL = 1;
            obj = interfaceC458220Hy0LJJIIJZLJL.LJI(context, jLJJII, awS585S0100000_6, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultRecordInputAbilityImpl@7bf5.reachedStopAndSaveRecording$1");
                return objLJFF;
            }
        }
        C458370HyF c458370HyF = (C458370HyF) obj;
        C458200Hxy c458200Hxy = this.LLILLJJLI;
        c458200Hxy.LJJIIJZLJL = c458370HyF;
        c458200Hxy.LJJIJIIJI(new AwS585S0100000_6(c458370HyF, 414));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultRecordInputAbilityImpl@7bf5.reachedStopAndSaveRecording$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
