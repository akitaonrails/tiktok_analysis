package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectQRCode;
import com.ss.ugc.effectplatform.model.PlatformEffect;
import com.ss.ugc.effectplatform.model.net.ScanQRCodeResponse;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Of, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20002713Of extends C13OD<ScanQRCodeResponse.DataNode, ScanQRCodeResponse> {
    public final C13RD LIZ;
    public final EffectQRCode LIZIZ;
    public final String LIZJ;

    @Override // X.C13OD
    public final C0XSU buildRequest() {
        String str;
        HashMap map = new HashMap();
        String str2 = this.LIZ.LIZIZ;
        if (str2 != null) {
            map.put("sdk_version", str2);
        }
        C13R7 c13r7 = this.LIZ.LJIJI;
        if (c13r7 != null) {
            C20002813Og c20002813Og = (C20002813Og) c13r7.LIZ.convertJsonToObj(this.LIZIZ.getQrCodeText(), C20002813Og.class);
            if (c20002813Og != null && (str = c20002813Og.LIZ) != null) {
                String strEncode = URLEncoder.encode(str);
                if (strEncode == null) {
                    strEncode = "";
                }
                map.put("sec_id", strEncode);
            }
        }
        String str3 = this.LIZ.LJIIJ;
        if (str3 != null) {
            map.put("aid", str3);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJJIIJZLJL);
        this.LIZ.getClass();
        sbLIZ.append("/effect/api");
        sbLIZ.append("/tidyEffect/secId");
        return new C0XSU(C1535105zh.LIZ(map, C2188811AlT.LIZIZ(sbLIZ)), null, C0XSV.GET, null, null, false, null, null, 1018);
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        return (C13OE) c13r7.LIZ.convertJsonToObj(str, ScanQRCodeResponse.class);
    }

    public C20002713Of(C13RD c13rd, EffectQRCode effectQRCode, String str) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str, null);
        this.LIZ = c13rd;
        this.LIZIZ = effectQRCode;
        this.LIZJ = str;
    }

    @Override // X.C13OD
    public final void onSuccess(long j, long j2, long j3, C13OE c13oe) {
        PlatformEffect platformEffect;
        Effect effect;
        ScanQRCodeResponse.DataNode data = ((ScanQRCodeResponse) c13oe).getData();
        if (data != null && (platformEffect = data.effect) != null && (effect = platformEffect.toEffect(data.url_prefix)) != null) {
            effect.setId(u.LJJIFFI(u.LJJIFFI(effect.getId(), "\"", "_", false), "/", "_", false));
            C13LD c13ld = C13LD.LIZ;
            String str = this.LIZ.LJII;
            List listSingletonList = Collections.singletonList(effect);
            c13ld.getClass();
            C13LD.LJIIIZ(str, listSingletonList);
            runOnMainThread(new AwS431S0200000_30(this, effect, 58));
        }
    }
}
