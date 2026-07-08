package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.understanding.ContentPipelineContext;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingResult;
import com.ss.android.ugc.aweme.music.understanding.api.ContentUnderstandingResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.understanding.tasks.RequestTask$run$1$1", f = "RequestTask.kt", l = {86}, m = "invokeSuspend")
public final class C2250908rr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ContentUnderstandingResult.ZipBundle LLILZ;
    public final /* synthetic */ ContentPipelineContext LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250908rr(String str, ContentUnderstandingResult.ZipBundle zipBundle, ContentPipelineContext contentPipelineContext, String str2, int i, int i2, int i3, InterfaceC1364105Vn<? super C2250908rr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = zipBundle;
        this.LLILZIL = contentPipelineContext;
        this.LLILZLL = str2;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
        this.LLJ = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2250908rr(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jElapsedRealtime;
        String str;
        Object objLIZ = obj;
        C1C7U.LIZ("RequestTask@c43b.run$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jElapsedRealtime = this.LL;
                try {
                    C155000ia.LIZIZ(objLIZ);
                    C2257408su.LIZ(this.LLILZIL.pipelineTag, (ContentUnderstandingResponse) objLIZ, null, SystemClock.elapsedRealtime() - jElapsedRealtime);
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    C201955140j.LJIIJ(C1673840tew.LIZIZ, "Async upload error", e);
                    C2257408su.LIZ(this.LLILZIL.pipelineTag, null, e, SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                String str2 = this.LLILLL;
                String zipFilePath = this.LLILZ.getZipFilePath();
                String fileType = this.LLILZ.getFileType();
                ContentUnderstandingRequest contentUnderstandingRequest = this.LLILZIL.request;
                String str3 = contentUnderstandingRequest.contentType;
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = contentUnderstandingRequest.contentSource;
                if (str5 != null) {
                    str4 = str5;
                }
                String str6 = this.LLILZLL;
                int i2 = this.LLIZ;
                int i3 = this.LLIZLLLIL;
                int i4 = this.LLJ;
                C2257908sz c2257908sz = contentUnderstandingRequest.mobData;
                if (c2257908sz != null) {
                    try {
                        str = c2257908sz.LIZ;
                    } catch (Exception e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        C201955140j.LJIIJ(C1673840tew.LIZIZ, "Async upload error", e);
                        C2257408su.LIZ(this.LLILZIL.pipelineTag, null, e, SystemClock.elapsedRealtime() - jElapsedRealtime);
                    }
                } else {
                    str = null;
                }
                this.LL = jElapsedRealtime;
                this.LLILLJJLI = 1;
                objLIZ = C2251908s1.LIZ(str2, zipFilePath, fileType, str3, str4, str6, null, i2, i3, i4, str, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("RequestTask@c43b.run$1$1");
                    return objLJFF;
                }
                C2257408su.LIZ(this.LLILZIL.pipelineTag, (ContentUnderstandingResponse) objLIZ, null, SystemClock.elapsedRealtime() - jElapsedRealtime);
            } catch (Exception e3) {
                e = e3;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RequestTask@c43b.run$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
