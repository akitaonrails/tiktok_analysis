package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UUY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.video.AdvancePushStreamManager$notifyCustomSei$1", f = "AdvancePushStreamManager.kt", l = {}, m = "invokeSuspend")
public final class C0UUY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0UUY(InterfaceC1364105Vn<? super C0UUY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UUY(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("AdvancePushStreamManager@e819.notifyCustomSei$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1273890jFr c1273890jFrLJIIJJI = C776270Ucj.LIZ.LJIIJJI(true, null, false);
        if (c1273890jFrLJIIJJI != null) {
            C20441214yg.LIZIZ("songsong", "send hide sei");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("live_stream_count_down", (Object) null);
            C0UUZ.LIZ(jSONObject);
            AbstractC1273900jFs abstractC1273900jFs = c1273890jFrLJIIJJI.LJI;
            if (abstractC1273900jFs != null) {
                abstractC1273900jFs.LJJIZ("live_stream_count_down_sei", true, false, "1610666009", 1, jSONObject);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdvancePushStreamManager@e819.notifyCustomSei$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0UUY(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
