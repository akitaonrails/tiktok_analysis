package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.understanding.ContentPipelineContext;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.api.ContentUnderstandingResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.understanding.tasks.LocalEmbUnderstandingTask$run$1", f = "LocalEmbUnderstandingTask.kt", l = {75}, m = "invokeSuspend")
public final class C2250608ro extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ContentPipelineContext LLILLJJLI;
    public final /* synthetic */ C2250308rl LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250608ro(ContentPipelineContext contentPipelineContext, C2250308rl c2250308rl, long j, InterfaceC1364105Vn<? super C2250608ro> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = contentPipelineContext;
        this.LLILLL = c2250308rl;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2250608ro(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        String str;
        Object objLIZ = obj;
        C1C7U.LIZ("LocalEmbUnderstandingTask@7eb0.run$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                ContentUnderstandingRequest contentUnderstandingRequest = this.LLILLJJLI.request;
                C2257908sz c2257908sz = contentUnderstandingRequest.mobData;
                int i4 = 0;
                if (c2257908sz != null) {
                    i = c2257908sz.LJFF;
                } else {
                    i = 0;
                }
                if (c2257908sz != null) {
                    i2 = c2257908sz.LJII;
                } else {
                    i2 = 0;
                }
                if (c2257908sz != null) {
                    i4 = c2257908sz.LJI;
                }
                int i5 = i - i2;
                C2250308rl c2250308rl = this.LLILLL;
                String str2 = c2250308rl.LIZ;
                String str3 = contentUnderstandingRequest.contentType;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = contentUnderstandingRequest.contentSource;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = c2250308rl.LIZIZ;
                String strLIZ = c2250308rl.LIZ();
                C2257908sz c2257908sz2 = this.LLILLJJLI.request.mobData;
                if (c2257908sz2 != null) {
                    str = c2257908sz2.LIZ;
                } else {
                    str = null;
                }
                this.LL = 1;
                objLIZ = C2251908s1.LIZ(str2, "", "", str3, str4, str5, strLIZ, i5, i4, i2, str, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("LocalEmbUnderstandingTask@7eb0.run$1");
                    return objLJFF;
                }
            }
            C2257508sv.LIZIZ(C2250708rp.LIZ, (ContentUnderstandingResponse) objLIZ, null, SystemClock.elapsedRealtime() - this.LLILZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C201955140j.LJIIJ(C1673840tew.LIZIZ, "LocalEmbUnderstandingTask async upload error", th);
            C2257508sv.LIZIZ(C2250708rp.LIZ, null, th, SystemClock.elapsedRealtime() - this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LocalEmbUnderstandingTask@7eb0.run$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
