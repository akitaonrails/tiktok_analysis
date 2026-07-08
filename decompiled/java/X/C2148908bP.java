package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinUploadAuthKeyResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoiceUploadTask$upload$2", f = "BulletinVoiceUploadTask.kt", l = {119}, m = "invokeSuspend")
public final class C2148908bP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C2150108bb>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ BulletinUploadAuthKeyResponse LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2148908bP(String str, BulletinUploadAuthKeyResponse bulletinUploadAuthKeyResponse, InterfaceC1364105Vn<? super C2148908bP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = bulletinUploadAuthKeyResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2148908bP c2148908bP = new C2148908bP(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2148908bP.LLILLL = obj;
        return c2148908bP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        boolean zLIZIZ;
        C1C7U.LIZ("BulletinVoiceUploadTask@63ae.upload$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                j = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLL;
            j = C2149108bR.LIZ().uploadTimeoutMs;
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            if (!zLIZIZ) {
                C0OPX.LJIIIIZZ("BulletinVoiceUploadTask: offline before start");
                C2150108bb c2150108bb = new C2150108bb("", false, C2286608xc.LJFF(-302L), 8);
                C1C7U.LIZIZ("BulletinVoiceUploadTask@63ae.upload$2");
                return c2150108bb;
            }
            C2149008bQ c2149008bQ = new C2149008bQ(this.LLILZ, this.LLILZIL, null);
            this.LLILLL = obj2;
            this.LL = j;
            this.LLILLJJLI = 1;
            obj = C099A.LIZJ(j, c2149008bQ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinVoiceUploadTask@63ae.upload$2");
                return objLJFF;
            }
        }
        if (obj == null) {
            String str = this.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinVoiceUploadTask: timed out after ");
            sbLIZ.append(j);
            sbLIZ.append("ms, fakeId=");
            sbLIZ.append(str);
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            obj = new C2150108bb("", false, C2286608xc.LJFF(-301L), 8);
        }
        C1C7U.LIZIZ("BulletinVoiceUploadTask@63ae.upload$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C2150108bb> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
