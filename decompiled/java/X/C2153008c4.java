package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoiceDraftManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08c4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinVoiceRecordViewModel$onCleared$1", f = "BulletinVoiceRecordViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2153008c4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinVoiceDraftManager.DraftMeta LL;
    public final /* synthetic */ BulletinVoiceDraftManager LLILLJJLI;
    public final /* synthetic */ C2152808c2 LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2153008c4(BulletinVoiceDraftManager.DraftMeta draftMeta, BulletinVoiceDraftManager bulletinVoiceDraftManager, C2152808c2 c2152808c2, boolean z, InterfaceC1364105Vn<? super C2153008c4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftMeta;
        this.LLILLJJLI = bulletinVoiceDraftManager;
        this.LLILLL = c2152808c2;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2153008c4(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinVoiceRecordViewModel@b0e5.onCleared$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            BulletinVoiceDraftManager.DraftMeta draftMeta = this.LL;
            if (draftMeta != null) {
                this.LLILLJJLI.LJIIIIZZ(draftMeta);
            }
            this.LLILLL.LJ();
            this.LLILLL.LIZJ();
            this.LLILLL.LJIILIIL();
            if (this.LLILZ) {
                this.LLILLL.LIZIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VoiceRecordVM onCleared cleanup error: ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinVoiceRecordViewModel@b0e5.onCleared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
