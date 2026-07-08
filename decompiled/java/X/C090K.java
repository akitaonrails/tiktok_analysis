package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.090K, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineEffectHandler$buildV2VVideoInputExtra$2", f = "AIGCOfflineEffectHandler.kt", l = {}, m = "invokeSuspend")
public final class C090K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C090K(String str, String str2, InterfaceC1364105Vn<? super C090K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C090K(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        VEUtils.VEVideoFileInfo videoFileInfo;
        C1C7U.LIZ("AIGCOfflineEffectHandler@7df1.buildV2VVideoInputExtra$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        jSONObject.put("type", "video");
        if (str == null) {
            str = "";
        }
        jSONObject.put("resource_key", str);
        if (str2 != null && str2.length() > 0) {
            C844470XAv.LIZ.getClass();
            String strLIZ = C09N5.LIZ(C844470XAv.LIZ(), UriProtector.parse(str2));
            if (strLIZ != null && (videoFileInfo = VEUtils.getVideoFileInfo(strLIZ)) != null) {
                jSONObject.put("video_width", videoFileInfo.width);
                jSONObject.put("video_height", videoFileInfo.height);
                jSONObject.put("video_duration", videoFileInfo.duration / LSPassThroughRecordSizeConfig.DEFAULT);
            }
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        C1C7U.LIZIZ("AIGCOfflineEffectHandler@7df1.buildV2VVideoInputExtra$2");
        return strJ3;
    }
}
