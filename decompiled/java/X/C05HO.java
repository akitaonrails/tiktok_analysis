package X;

import com.mammon.audiosdk.enums.SAMICoreVopState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05HO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelColumnView$initInstantCloneManage$2$1", f = "TTSPanelColumnView.kt", l = {354}, m = "invokeSuspend")
public final class C05HO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C194329111b LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05HO(C194329111b c194329111b, InterfaceC1364105Vn<? super C05HO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c194329111b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05HO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TTSPanelColumnView@49d6.initInstantCloneManage$2$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C1320205Eq c1320205Eq = new C1320205Eq(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1320205Eq);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TTSPanelColumnView@49d6.initInstantCloneManage$2$1");
                return objLJFF;
            }
        }
        if (((Number) obj).intValue() == SAMICoreVopState.COMPLETED.getValue()) {
            C194329111b c194329111b = this.LLILLJJLI;
            c194329111b.getClass();
            C1397580mTM c1397580mTM = new C1397580mTM(c194329111b.getContext());
            c1397580mTM.LJII = false;
            c1397580mTM.LJI(c194329111b.getContext().getString(2131858334));
            c1397580mTM.LIZIZ(c194329111b.getContext().getString(2131858333));
            C985403tE.LIZ(c1397580mTM, new AwS581S0100000_2(c194329111b, 346));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSPanelColumnView@49d6.initInstantCloneManage$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
