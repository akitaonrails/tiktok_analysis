package X;

import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.utils.VideoModeUtils$resizeBitmapForVideoMode$1$3", f = "VideoModeUtils.kt", l = {}, m = "invokeSuspend")
public final class C2346909Hn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MvCreateVideoData LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2346909Hn(MvCreateVideoData mvCreateVideoData, Function0<Unit> function0, InterfaceC1364105Vn<? super C2346909Hn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mvCreateVideoData;
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2346909Hn(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("VideoModeUtils@afd2.resizeBitmapForVideoMode$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int iLIZ = (int) C2347109Hp.LIZ.LIZ();
        int size = this.LL.selectMediaList.size();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", iLIZ);
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("pictureCount", Integer.valueOf(size));
        C1637890six.LIZJ("aweme_photomv_generate_duration", jSONObject, c543670LTx.LJ());
        this.LLILLJJLI.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoModeUtils@afd2.resizeBitmapForVideoMode$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
