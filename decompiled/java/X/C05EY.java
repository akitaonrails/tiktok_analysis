package X;

import com.mammon.audiosdk.enums.SAMICoreVopState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05EY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantVoiceCloneView$landPageByCurrentState$1", f = "InstantVoiceCloneView.kt", l = {649, 656}, m = "invokeSuspend")
public final class C05EY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C11VM LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05EY(C11VM c11vm, boolean z, InterfaceC1364105Vn<? super C05EY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c11vm;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05EY(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("InstantVoiceCloneView@888c.landPageByCurrentState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLJJLI.LJ("record_page");
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("InstantVoiceCloneView@888c.landPageByCurrentState$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C05EX c05ex = new C05EX(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c05ex);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("InstantVoiceCloneView@888c.landPageByCurrentState$1");
                return objLJFF;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue == SAMICoreVopState.AGREEING.getValue()) {
            this.LLILLJJLI.LJ("agreement_page");
        } else if (iIntValue == SAMICoreVopState.RECORDING.getValue()) {
            if (!this.LLILLL) {
                C1DFB c1dfb2 = C0PEM.LIZJ;
                C05EW c05ew = new C05EW(null);
                this.LL = 2;
                if (C23250099c.LJI(this, c1dfb2, c05ew) == objLJFF) {
                    C1C7U.LIZIZ("InstantVoiceCloneView@888c.landPageByCurrentState$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.LJ("record_page");
        } else if (iIntValue == SAMICoreVopState.COMPLETED.getValue()) {
            this.LLILLJJLI.LJ("finish_page");
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InstantVoiceCloneView@888c.landPageByCurrentState$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
