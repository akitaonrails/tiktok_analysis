package X;

import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01PN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel$processDownload$1", f = "BaseEffectViewModel.kt", l = {37, 41, 45, 49}, m = "invokeSuspend")
public final class C01PN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ BaseEffectViewModel<Object> LLILLL;
    public final /* synthetic */ Object LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01PN(int i, BaseEffectViewModel<Object> baseEffectViewModel, Object obj, InterfaceC1364105Vn<? super C01PN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = baseEffectViewModel;
        this.LLILZ = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01PN(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseEffectViewModel@cfbf.processDownload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            int i2 = this.LLILLJJLI;
            if (i2 != -3) {
                if (i2 != -2) {
                    if (i2 != -1) {
                        C2252331DDr c2252331DDr = this.LLILLL.LLILLL;
                        C226600u8 c226600u8 = new C226600u8(i2, this.LLILZ);
                        this.LL = 4;
                        if (c2252331DDr.emit(c226600u8, this) == objLJFF) {
                            C1C7U.LIZIZ("BaseEffectViewModel@cfbf.processDownload$1");
                            return objLJFF;
                        }
                    } else {
                        C2252331DDr c2252331DDr2 = this.LLILLL.LLILLL;
                        C226300u5 c226300u5 = new C226300u5(this.LLILZ);
                        this.LL = 1;
                        if (c2252331DDr2.emit(c226300u5, this) == objLJFF) {
                            C1C7U.LIZIZ("BaseEffectViewModel@cfbf.processDownload$1");
                            return objLJFF;
                        }
                    }
                } else {
                    C2252331DDr c2252331DDr3 = this.LLILLL.LLILLL;
                    C01PO c01po = new C01PO(this.LLILZ);
                    this.LL = 2;
                    if (c2252331DDr3.emit(c01po, this) == objLJFF) {
                        C1C7U.LIZIZ("BaseEffectViewModel@cfbf.processDownload$1");
                        return objLJFF;
                    }
                }
            } else {
                C2252331DDr c2252331DDr4 = this.LLILLL.LLILLL;
                C226400u6 c226400u6 = new C226400u6(this.LLILZ);
                this.LL = 3;
                if (c2252331DDr4.emit(c226400u6, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseEffectViewModel@cfbf.processDownload$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseEffectViewModel@cfbf.processDownload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
