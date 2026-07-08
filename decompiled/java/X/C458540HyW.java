package X;

import Y.AgS165S0300000_6;
import android.widget.TextSwitcher;
import com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordTipAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordTipAssem$onActualViewCreated$1", f = "RecordTipAssem.kt", l = {75, 76}, m = "invokeSuspend")
public final class C458540HyW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecordTipAssem LLILLJJLI;
    public final /* synthetic */ TextSwitcher LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C458540HyW(RecordTipAssem recordTipAssem, TextSwitcher textSwitcher, InterfaceC1364105Vn<? super C458540HyW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recordTipAssem;
        this.LLILLL = textSwitcher;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C458540HyW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordTipAssem@3f7d.onActualViewCreated$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            RecordTipAssem recordTipAssem = this.LLILLJJLI;
            recordTipAssem.getClass();
            int i2 = C458510HyT.LIZ[((C458250Hy3) C459000HzG.LIZIZ(recordTipAssem).getValue()).LIZJ.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    RecordTipAssem recordTipAssem2 = this.LLILLJJLI;
                    TextSwitcher textSwitcher = this.LLILLL;
                    this.LL = 2;
                    recordTipAssem2.getClass();
                    Object objCollect = C09IC.LJIILL(new C463000IDq(C459000HzG.LIZIZ(recordTipAssem2), 53)).collect(new AgS165S0300000_6(new C259800zU(), recordTipAssem2, textSwitcher, 5), this);
                    if (objCollect != C099R.LJFF()) {
                        objCollect = Unit.LIZ;
                    }
                    if (objCollect == objLJFF) {
                        C1C7U.LIZIZ("RecordTipAssem@3f7d.onActualViewCreated$1");
                        return objLJFF;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                RecordTipAssem recordTipAssem3 = this.LLILLJJLI;
                TextSwitcher textSwitcher2 = this.LLILLL;
                this.LL = 1;
                recordTipAssem3.getClass();
                Object objCollect2 = C09IC.LJIILL(new C463000IDq(C459000HzG.LIZIZ(recordTipAssem3), 54)).collect(new AgS165S0300000_6(new C259800zU(), recordTipAssem3, textSwitcher2, 6), this);
                if (objCollect2 != C099R.LJFF()) {
                    objCollect2 = Unit.LIZ;
                }
                if (objCollect2 == objLJFF) {
                    C1C7U.LIZIZ("RecordTipAssem@3f7d.onActualViewCreated$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordTipAssem@3f7d.onActualViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
