package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hpj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.VoiceChanger$prefetchVoiceChange$1$isSuccess$1", f = "VoiceChanger.kt", l = {502}, m = "invokeSuspend")
public final class C1219250hpj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C19536511c3 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219250hpj(C19536511c3 c19536511c3, String str, InterfaceC1364105Vn<? super C1219250hpj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19536511c3;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219250hpj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceChanger@2446.prefetchVoiceChange$1$isSuccess$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C19536811c6 c19536811c6 = (C19536811c6) this.LLILLJJLI.LJIIJ.getValue();
            final C19536511c3 c19536511c3 = this.LLILLJJLI;
            final String str = this.LLILLL;
            InterfaceC19535711bv<C19536911c7> interfaceC19535711bv = new InterfaceC19535711bv<C19536911c7>() { // from class: X.11ba
                @Override // X.InterfaceC19535711bv
                public final void LIZ(C1222820hvU c1222820hvU, C19535011bo c19535011bo) {
                    C19536911c7 c19536911c7 = (C19536911c7) c19535011bo;
                    if (c1222820hvU.LIZ == 2) {
                        C19533711bb.LIZ(0, "pipeline_state_code");
                        C19533911bd.LIZ.put("total_duration", String.valueOf(c19536911c7.LIZ.LIZLLL));
                        C19533711bb.LIZIZ(c19536911c7);
                    }
                }

                @Override // X.InterfaceC19535711bv
                public final void LIZIZ(C1222820hvU c1222820hvU, C19535011bo c19535011bo) {
                    C19536511c3 c19536511c32 = c19536511c3;
                    String str2 = str;
                    c19536511c32.LIZJ.getVideoLength();
                    if (c1222820hvU.LIZ == 2) {
                        ConcurrentHashMap<String, String> concurrentHashMap = C19533911bd.LIZ;
                        concurrentHashMap.clear();
                        concurrentHashMap.put("export_upload_type", str2);
                        C19533711bb.LIZ(0, "error_code");
                        concurrentHashMap.put("error_msg", "");
                        C19533711bb.LIZ(0, "pipeline_state_code");
                        C19533711bb.LIZ(0, "pipeline_error_stage");
                        concurrentHashMap.put("upload_cache", String.valueOf(0.0d));
                        C19533711bb.LIZ(0, "origin_file_length");
                        C19533711bb.LIZ(0, "upload_file_length");
                    }
                }

                @Override // X.InterfaceC19535711bv
                public final void LIZJ(C1222820hvU c1222820hvU, C19535011bo c19535011bo) {
                    C19536911c7 c19536911c7 = (C19536911c7) c19535011bo;
                    if (c1222820hvU.LIZ == 2) {
                        C19533711bb.LIZ(-2, "pipeline_state_code");
                        C19533911bd.LIZ.put("total_duration", String.valueOf(c19536911c7.LIZ.LIZLLL));
                        C19533711bb.LIZIZ(c19536911c7);
                    }
                }
            };
            this.LL = 1;
            obj = c19536811c6.LIZIZ(c19536811c6.LIZLLL(), interfaceC19535711bv, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VoiceChanger@2446.prefetchVoiceChange$1$isSuccess$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VoiceChanger@2446.prefetchVoiceChange$1$isSuccess$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
