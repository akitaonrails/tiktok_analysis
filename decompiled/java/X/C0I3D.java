package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.recallmessage.ReEditViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.RecallMessageReusedUISlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I3D, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.RecallMessageReusedUISlotAssem$restoreReplyStateIfNeeded$1", f = "RecalledMessageViewHolder.kt", l = {328}, m = "invokeSuspend")
public final class C0I3D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecallMessageReusedUISlotAssem LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;
    public final /* synthetic */ C0I20 LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I3D(RecallMessageReusedUISlotAssem recallMessageReusedUISlotAssem, C869590Y9l c869590Y9l, C0I20 c0i20, long j, InterfaceC1364105Vn<? super C0I3D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recallMessageReusedUISlotAssem;
        this.LLILLL = c869590Y9l;
        this.LLILZ = c0i20;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0I3D(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("RecallMessageReusedUISlotAssem@77c2.restoreReplyStateIfNeeded$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        C869590Y9l c869590Y9l = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C0I3E c0i3e = new C0I3E(this.LLILLJJLI, this.LLILZIL, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c0i3e);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("RecallMessageReusedUISlotAssem@77c2.restoreReplyStateIfNeeded$1");
                    return objLJFF;
                }
            }
            C869590Y9l c869590Y9lVQ2 = (C869590Y9l) obj;
            if (c869590Y9lVQ2 == null) {
                this.LLILLJJLI.up();
                c869590Y9lVQ2 = ReEditViewModel.vQ2(this.LLILLL);
            }
            c869590Y9l = c869590Y9lVQ2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (c869590Y9l == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RecallMessageReusedUISlotAssem@77c2.restoreReplyStateIfNeeded$1");
            return unit;
        }
        this.LLILZ.qH1(new C454980Hsm(c869590Y9l, C0I3C.LONG_CLICK));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecallMessageReusedUISlotAssem@77c2.restoreReplyStateIfNeeded$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
