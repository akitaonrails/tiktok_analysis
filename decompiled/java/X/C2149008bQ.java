package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinUploadAuthKeyResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoiceUploadTask$upload$2$result$1", f = "BulletinVoiceUploadTask.kt", l = {121}, m = "invokeSuspend")
public final class C2149008bQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C2150108bb>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ BulletinUploadAuthKeyResponse LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2149008bQ(String str, BulletinUploadAuthKeyResponse bulletinUploadAuthKeyResponse, InterfaceC1364105Vn<? super C2149008bQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = bulletinUploadAuthKeyResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2149008bQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2150108bb c2150108bb;
        C1C7U.LIZ("BulletinVoiceUploadTask@63ae.upload$2$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1B55 c1b55 = C1B55.LIZ;
                String str = this.LLILLJJLI;
                BulletinUploadAuthKeyResponse bulletinUploadAuthKeyResponse = this.LLILLL;
                this.LL = 1;
                c1b55.getClass();
                obj = C1B55.LIZIZ(str, bulletinUploadAuthKeyResponse, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BulletinVoiceUploadTask@63ae.upload$2$result$1");
                    return objLJFF;
                }
            }
            c2150108bb = (C2150108bb) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinVoiceUploadTask error: ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            c2150108bb = new C2150108bb("", false, C2286608xc.LJFF(-300L), e.getMessage());
        }
        C1C7U.LIZIZ("BulletinVoiceUploadTask@63ae.upload$2$result$1");
        return c2150108bb;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C2150108bb> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
