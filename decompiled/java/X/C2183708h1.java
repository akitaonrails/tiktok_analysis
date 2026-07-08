package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinVoiceRecordViewModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08h1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinVoiceRecordViewModel$handleMaxDurationReached$1", f = "BulletinVoiceRecordViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2183708h1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinVoiceRecordViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2183708h1(BulletinVoiceRecordViewModel bulletinVoiceRecordViewModel, InterfaceC1364105Vn<? super C2183708h1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinVoiceRecordViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2183708h1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("BulletinVoiceRecordViewModel@b0e5.handleMaxDurationReached$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LLILZIL.getValue() != EnumC194439115h.RECORDING) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BulletinVoiceRecordViewModel@b0e5.handleMaxDurationReached$1");
            return unit;
        }
        C2228508oF c2228508oF = this.LL.LLJJIJIL;
        if (c2228508oF != null) {
            c2228508oF.LIZIZ();
        }
        this.LL.LLJILJILJ.LIZ();
        C2228508oF c2228508oF2 = this.LL.LLJJIJIL;
        if (c2228508oF2 != null) {
            c2228508oF2.LJI();
        }
        BulletinVoiceRecordViewModel bulletinVoiceRecordViewModel = this.LL;
        bulletinVoiceRecordViewModel.LLJJIJIL = null;
        long jLongValue = ((Number) bulletinVoiceRecordViewModel.LLJILJILJ.LIZIZ.getValue()).longValue();
        BulletinVoiceRecordViewModel bulletinVoiceRecordViewModel2 = this.LL;
        long j = jLongValue - bulletinVoiceRecordViewModel2.LLJJJJJIL;
        long jLIZIZ = 0;
        if (j < 0) {
            j = 0;
        }
        bulletinVoiceRecordViewModel2.LLJJIII.LIZJ = jLongValue;
        bulletinVoiceRecordViewModel2.LLJ.setValue(true);
        this.LL.FQ2(EnumC194439115h.PAUSED);
        this.LL.LLJILJILJ.LIZJ.LIZJ(C2183608h0.LIZ);
        File file = this.LL.LLJJJJ;
        if (file != null) {
            jLIZIZ = C2183808h2.LIZIZ(C2183808h2.LIZ(), file);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceRecordVM: handleMaxDurationReached timerMs=");
        sbLIZ.append(jLongValue);
        sbLIZ.append(" wavMs=");
        sbLIZ.append(jLIZIZ);
        sbLIZ.append(" diff=");
        sbLIZ.append(jLongValue - jLIZIZ);
        sbLIZ.append("ms");
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        this.LL.DQ2(EnumC2228908oJ.AUTO_TERMINATE, j, jLongValue);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinVoiceRecordViewModel@b0e5.handleMaxDurationReached$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
