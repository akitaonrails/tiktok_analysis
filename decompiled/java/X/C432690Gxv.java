package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordTrashBinAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Gxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordTrashBinAssem$onViewCreated$3$3", f = "RecordTrashBinAssem.kt", l = {}, m = "invokeSuspend")
public final class C432690Gxv extends C09AX implements InterfaceC1631630sYr<Boolean, Boolean, Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ boolean LLILLJJLI;
    public /* synthetic */ boolean LLILLL;
    public final /* synthetic */ RecordTrashBinAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432690Gxv(RecordTrashBinAssem recordTrashBinAssem, InterfaceC1364105Vn<? super C432690Gxv> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZ = recordTrashBinAssem;
    }

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), interfaceC1364105Vn);
    }

    public final Object invoke(boolean z, boolean z2, boolean z3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C432690Gxv c432690Gxv = new C432690Gxv(this.LLILZ, interfaceC1364105Vn);
        c432690Gxv.LL = z;
        c432690Gxv.LLILLJJLI = z2;
        c432690Gxv.LLILLL = z3;
        return c432690Gxv.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordTrashBinAssem@1bc3.onViewCreated$3$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        boolean z2 = this.LLILLJJLI;
        boolean z3 = this.LLILLL;
        if (!z2) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RecordTrashBinAssem@1bc3.onViewCreated$3$3");
            return unit;
        }
        if (z3 && !z && !((ValueAnimator) this.LLILZ.LLJJIJI.getValue()).isRunning()) {
            C786410Ut5.Pd((ObjectAnimator) this.LLILZ.LLJJIJI.getValue());
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecordTrashBinAssem@1bc3.onViewCreated$3$3");
        return unit2;
    }
}
