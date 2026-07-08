package X;

import android.content.Intent;
import android.os.SystemClock;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L8H, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity$startCompressAndWait$1$2$1", f = "NLECutCompressActivity.kt", l = {176}, m = "invokeSuspend")
public final class C0L8H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C537930L7v LLILLJJLI;
    public final /* synthetic */ NLECutCompressActivity LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ CutSource LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L8H(C537930L7v c537930L7v, NLECutCompressActivity nLECutCompressActivity, long j, long j2, CutSource cutSource, InterfaceC1364105Vn<? super C0L8H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c537930L7v;
        this.LLILLL = nLECutCompressActivity;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = cutSource;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L8H(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("NLECutCompressActivity@cdc7.startCompressAndWait$1$2$1");
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
            if (this.LLILLJJLI != null && this.LLILLL.LLILZLL == 0) {
                long jUptimeMillis = SystemClock.uptimeMillis() - this.LLILZIL;
                long j = this.LLILLL.LLILLL;
                if (jUptimeMillis < j) {
                    this.LL = 1;
                    if (AnonymousClass0958.LIZIZ(j - jUptimeMillis, this) == objLJFF) {
                        C1C7U.LIZIZ("NLECutCompressActivity@cdc7.startCompressAndWait$1$2$1");
                        return objLJFF;
                    }
                }
            } else {
                if (!this.LLILLL.isFinishing()) {
                    NLECutCompressActivity nLECutCompressActivity = this.LLILLL;
                    Intent intent = new Intent();
                    NLECutCompressActivity nLECutCompressActivity2 = this.LLILLL;
                    CutSource cutSource = this.LLILZLL;
                    long j2 = this.LLILZIL;
                    intent.putExtra("cut_compress_start_time", nLECutCompressActivity2.getIntent().getLongExtra("cut_compress_start_time", 0L));
                    intent.putExtra("cut_compress_error", nLECutCompressActivity2.LLIZ);
                    intent.putExtra("cut_compress_code", nLECutCompressActivity2.LLILZLL);
                    intent.putExtra("cut_compress_source", cutSource.value);
                    intent.putExtra("cut_compress_time", SystemClock.uptimeMillis() - j2);
                    C2204961BRm.Q(nLECutCompressActivity, 0, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFgmb9Whbo/CkiLJOHSBUISPwzAVQHmh5RRRicpvNEKzGPvXPQ/ICg==", null));
                    this.LLILLL.finish();
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("NLECutCompressActivity@cdc7.startCompressAndWait$1$2$1");
                return unit;
            }
        }
        C537930L7v c537930L7v = this.LLILLJJLI;
        Intent intent2 = new Intent();
        c537930L7v.LIZ(intent2);
        intent2.putExtra("cut_compress_time", SystemClock.uptimeMillis() - this.LLILZIL);
        intent2.putExtra("cut_compress_progress", this.LLILLL.LLILZIL);
        intent2.putExtra("cut_template_aspect_ratio", this.LLILLL.LLJIJIL);
        intent2.putExtra("cut_template_width", this.LLILLL.LLJILJIL);
        intent2.putExtra("cut_template_height", this.LLILLL.LLJILJILJ);
        NLECutCompressActivity nLECutCompressActivity3 = this.LLILLL;
        if (nLECutCompressActivity3.LLJ) {
            nLECutCompressActivity3.LLLLLZL(intent2);
        } else {
            nLECutCompressActivity3.LLIZLLLIL = intent2;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("NLECutCompressActivity@cdc7.startCompressAndWait$1$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
