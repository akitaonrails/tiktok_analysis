package X;

import android.text.TextUtils;
import cj7.b;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEFileUtils;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ANr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.asve.recorder.media.VEMediaController$startRecordMp4Async$1", f = "VEMediaController.kt", l = {}, m = "invokeSuspend")
public final class C2178491ANr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ b LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ double LLILLL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2178491ANr(b bVar, String str, double d, Function1<? super Integer, Unit> function1, boolean z, InterfaceC1364105Vn<? super C2178491ANr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bVar;
        this.LLILLJJLI = str;
        this.LLILLL = d;
        this.LLILZ = function1;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2178491ANr(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLJJJ;
        C1C7U.LIZ("VEMediaController@68c.startRecordMp4Async$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VERecorder vERecorder = this.LL.LIZ;
        String str = this.LLILLJJLI;
        float f = (float) this.LLILLL;
        vERecorder.getClass();
        C2484209oO.LJI("VERecorder", "startRecord in mp4 mode...");
        k kVar = vERecorder.LIZIZ;
        kVar.getClass();
        if (TextUtils.isEmpty(str)) {
            C2484209oO.LJIIIIZZ("TERecorder", "Mp4 file path is null or empty.");
            iLJJJ = -100;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(VEFileUtils.getFilePathWithoutExtension(str));
            sbLIZ.append(".mp4");
            iLJJJ = kVar.LJJJ(true, f, C2188811AlT.LIZIZ(sbLIZ));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("speed", f);
            jSONObject.put("resultCode", iLJJJ);
            ud7.b.LIZIZ("vesdk_event_recorder_start_record_async", "business", jSONObject, true);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLILZ.invoke(C2286608xc.LJ(iLJJJ));
        if (this.LLILZIL) {
            if (iLJJJ == 0) {
                InterfaceC2240011Clr interfaceC2240011Clr = this.LL.LJFF;
                if (interfaceC2240011Clr != null) {
                    interfaceC2240011Clr.LJIILIIL();
                }
            } else {
                InterfaceC2240011Clr interfaceC2240011Clr2 = this.LL.LJFF;
                if (interfaceC2240011Clr2 != null) {
                    interfaceC2240011Clr2.LIZ(iLJJJ, "");
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VEMediaController@68c.startRecordMp4Async$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
