package X;

import com.bytedance.android.livesdk.common.StreamFeatureManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableUrlListSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamFeature;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.video.AdvancePushStreamManager$advancePushStream$1", f = "AdvancePushStreamManager.kt", l = {}, m = "invokeSuspend")
public final class C773020UUa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C773020UUa(InterfaceC1364105Vn<? super C773020UUa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C773020UUa(interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Long lLJFF;
        Long lLJFF2;
        StreamUrl streamUrl;
        StreamUrl streamUrl2;
        List<StreamFeature> list;
        C1C7U.LIZ("AdvancePushStreamManager@e819.advancePushStream$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU c259800zU = new C259800zU();
        ?? Gg0 = DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        c259800zU.element = Gg0;
        C776270Ucj c776270Ucj = C776270Ucj.LIZ;
        c776270Ucj.LJ((Room) Gg0);
        String str = null;
        list = null;
        List<String> list2 = null;
        str = null;
        C1273890jFr c1273890jFrLJIIJJI = c776270Ucj.LJIIJJI(true, null, false);
        if (c1273890jFrLJIIJJI != null) {
            C0UOT c0uot = C0UOT.LIZ;
            Room room = (Room) c259800zU.element;
            c0uot.getClass();
            try {
                StreamFeatureManager streamFeatureManager = StreamFeatureManager.LL;
                if (room != null) {
                    list = room.streamFeatures;
                } else {
                    list = null;
                }
                streamFeatureManager.getClass();
                c1273890jFrLJIIJJI.LJIJJLI(StreamFeatureManager.LIZIZ(list));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("live_stream_count_down", 1);
            C0UUZ.LIZ(jSONObject);
            AbstractC1273900jFs abstractC1273900jFs = c1273890jFrLJIIJJI.LJI;
            if (abstractC1273900jFs != null) {
                abstractC1273900jFs.LJJIZ("live_stream_count_down_sei", true, false, "1610666009", 1, jSONObject);
            }
            C0UOT.LIZ.getClass();
            C0UOT.LIZIZ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start new advance push stream time=");
            sbLIZ.append(System.currentTimeMillis());
            C20441214yg.LIZIZ("songsong", C2188811AlT.LIZIZ(sbLIZ));
            c1273890jFrLJIIJJI.D3(CertProviderManagerKt.findCert("bpea-461", 1476788233));
            Room room2 = (Room) c259800zU.element;
            if (room2 != null) {
                lLJFF = C2286608xc.LJFF(room2.getId());
            } else {
                lLJFF = null;
            }
            Room room3 = (Room) c259800zU.element;
            if (room3 != null) {
                lLJFF2 = C2286608xc.LJFF(room3.getOwnerUserId());
            } else {
                lLJFF2 = null;
            }
            C0UM8.LIZ(null, lLJFF, lLJFF2, 1);
            if (LiveStreamEnableUrlListSetting.INSTANCE.enable()) {
                Room room4 = (Room) c259800zU.element;
                if (room4 != null && (streamUrl2 = room4.getStreamUrl()) != null) {
                    list2 = streamUrl2.pushUrlList;
                }
                c1273890jFrLJIIJJI.LJJIFFI(list2, true);
            } else {
                Room room5 = (Room) c259800zU.element;
                if (room5 != null && (streamUrl = room5.getStreamUrl()) != null) {
                    str = streamUrl.LIZLLL;
                }
                c1273890jFrLJIIJJI.LJJI(str, true);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdvancePushStreamManager@e819.advancePushStream$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C773020UUa(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
