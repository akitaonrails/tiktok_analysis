package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinUploadAuthKeyResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08b4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoicePublishPipeline$scheduleBackgroundRefresh$1", f = "BulletinVoicePublishPipeline.kt", l = {598}, m = "invokeSuspend")
public final class C2146808b4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1899107cD LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2146808b4(String str, C1899107cD c1899107cD, long j, InterfaceC1364105Vn<? super C2146808b4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c1899107cD;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2146808b4 c2146808b4 = new C2146808b4(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2146808b4.LLILLJJLI = obj;
        return c2146808b4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("BulletinVoicePublishPipeline@9c99.scheduleBackgroundRefresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Integer numLJ = null;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    long j = this.LLILZIL;
                    long j2 = C2149108bR.LIZ().authKeyTimeoutMs;
                    C2146908b5 c2146908b5 = new C2146908b5(j, null);
                    this.LL = 1;
                    obj = C099A.LIZJ(j2, c2146908b5, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.scheduleBackgroundRefresh$1");
                        return objLJFF;
                    }
                }
                c098200Yq = (BulletinUploadAuthKeyResponse) obj;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            BulletinUploadAuthKeyResponse bulletinUploadAuthKeyResponse = (BulletinUploadAuthKeyResponse) c098200Yq;
            if (bulletinUploadAuthKeyResponse != null && bulletinUploadAuthKeyResponse.statusCode == 0) {
                C2083108Eb.LIZ(this.LLILLL, bulletinUploadAuthKeyResponse);
                C0OPX.LJII("VoicePublishPipeline: auth key bg refresh ok");
            } else {
                StringBuilder sb = new StringBuilder("VoicePublishPipeline: auth key bg refresh skipped write, statusCode=");
                if (bulletinUploadAuthKeyResponse != null) {
                    numLJ = C2286608xc.LJ(bulletinUploadAuthKeyResponse.statusCode);
                }
                sb.append(numLJ);
                C0OPX.LJII(sb.toString());
            }
            C2083108Eb.LIZIZ.remove(this.LLILZ);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.scheduleBackgroundRefresh$1");
            return unit;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C2083108Eb.LIZIZ.remove(this.LLILZ);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
