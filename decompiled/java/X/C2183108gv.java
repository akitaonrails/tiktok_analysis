package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinVoiceRecordViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08gv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinVoiceRecordViewModel$onReady$2$1", f = "BulletinVoiceRecordViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2183108gv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2151408bo LL;
    public final /* synthetic */ BulletinVoiceRecordViewModel LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2183108gv(C2151408bo c2151408bo, BulletinVoiceRecordViewModel bulletinVoiceRecordViewModel, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C2183108gv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2151408bo;
        this.LLILLJJLI = bulletinVoiceRecordViewModel;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2183108gv(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinVoiceRecordViewModel@b0e5.onReady$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL != null && this.LLILLJJLI.LLILZIL.getValue() == EnumC194439115h.INITIAL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VoiceRecordVM: draft restored fakeId=");
            sbLIZ.append(this.LL.LIZ);
            sbLIZ.append(" duration=");
            sbLIZ.append(this.LL.LIZJ);
            sbLIZ.append("ms waveSize=");
            sbLIZ.append(this.LL.LIZLLL.size());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            BulletinVoiceRecordViewModel bulletinVoiceRecordViewModel = this.LLILLJJLI;
            C2151408bo c2151408bo = this.LL;
            bulletinVoiceRecordViewModel.LLJJJ = c2151408bo.LIZ;
            bulletinVoiceRecordViewModel.LLJJJJ = c2151408bo.LIZIZ;
            C2183208gw c2183208gw = bulletinVoiceRecordViewModel.LLJJIII;
            c2183208gw.LIZ = "draft";
            c2183208gw.LIZJ = c2151408bo.LIZJ;
            C2226908nz c2226908nz = bulletinVoiceRecordViewModel.LLJIJIL;
            List<Float> list = c2151408bo.LIZLLL;
            synchronized (c2226908nz.LIZ) {
                try {
                    ((ArrayList) c2226908nz.LIZ).clear();
                    ((ArrayList) c2226908nz.LIZIZ).clear();
                    ((ArrayList) c2226908nz.LIZ).addAll(list);
                    c2226908nz.LIZJ.setValue(C13LP.LLIIII(c2226908nz.LIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C2184408h8 c2184408h8 = this.LLILLJJLI.LLJILJILJ;
            long j = this.LL.LIZJ;
            c2184408h8.LJ = 1000000 * j;
            c2184408h8.LIZ.setValue(Long.valueOf(j));
            c2184408h8.LJIIIIZZ = -1;
            if (this.LL.LIZJ >= C2183908h3.LIZ().maxRecordingDurationMs) {
                this.LLILLJJLI.LLJ.setValue(true);
            }
            this.LLILLJJLI.FQ2(EnumC194439115h.PAUSED);
            this.LLILLL.invoke(true);
        } else {
            this.LLILLL.invoke(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinVoiceRecordViewModel@b0e5.onReady$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
