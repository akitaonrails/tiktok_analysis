package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoicePublishPipeline$runStart$encodeDeferred$1", f = "BulletinVoicePublishPipeline.kt", l = {232}, m = "invokeSuspend")
public final class C2150608bg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Boolean>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ File LLILLL;
    public final /* synthetic */ File LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2150608bg(File file, File file2, InterfaceC1364105Vn<? super C2150608bg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = file;
        this.LLILZ = file2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2150608bg c2150608bg = new C2150608bg(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2150608bg.LLILLJJLI = obj;
        return c2150608bg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("BulletinVoicePublishPipeline@9c99.runStart$encodeDeferred$1");
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
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VoicePublishPipeline: encoding ");
                sbLIZ.append(this.LLILLL.getName());
                sbLIZ.append(" → ");
                sbLIZ.append(this.LLILZ.getName());
                sbLIZ.append(", wavBytes=");
                sbLIZ.append(this.LLILLL.length());
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                File file = this.LLILLL;
                File file2 = this.LLILZ;
                long j = C2183908h3.LIZ().encodeTimeoutMs;
                C1388405c2 c1388405c2 = new C1388405c2(file, file2, null);
                this.LL = 1;
                obj = C099A.LIZJ(j, c1388405c2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.runStart$encodeDeferred$1");
                    return objLJFF;
                }
            }
            c098200Yq = (Boolean) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("BulletinVoicePublishPipeline@9c99.runStart$encodeDeferred$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
