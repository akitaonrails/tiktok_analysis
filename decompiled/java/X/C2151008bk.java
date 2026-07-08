package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinVoiceRecordViewModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinVoiceRecordViewModel$onReady$2", f = "BulletinVoiceRecordViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2151008bk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinVoiceRecordViewModel LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2151008bk(BulletinVoiceRecordViewModel bulletinVoiceRecordViewModel, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C2151008bk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinVoiceRecordViewModel;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2151008bk c2151008bk = new C2151008bk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c2151008bk.LL = obj;
        return c2151008bk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2151408bo c2151408boHQ2;
        C1C7U.LIZ("BulletinVoiceRecordViewModel@b0e5.onReady$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        try {
            C2152808c2 c2152808c2ZQ2 = this.LLILLJJLI.zQ2();
            c2152808c2ZQ2.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - ((long) 3600000);
            C0VSJ c0vsj = new C0VSJ(c2152808c2ZQ2.LIZ(), "process");
            c0vsj.mkdirs();
            File[] fileArrListFiles = c0vsj.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.lastModified() < jCurrentTimeMillis) {
                        file.delete();
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VoiceRecordVM: onReady IO cleanStaleProcessFiles error: ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            c2151408boHQ2 = this.LLILLJJLI.HQ2();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C0OPX.LJIIIIZZ("VoiceRecordVM: onReady IO tryRestoreDraftInternal error: " + e2.getMessage());
            c2151408boHQ2 = null;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C2183108gv(c2151408boHQ2, this.LLILLJJLI, this.LLILLL, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinVoiceRecordViewModel@b0e5.onReady$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
