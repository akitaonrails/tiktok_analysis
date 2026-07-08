package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.event.SkuRoutingLeadConversionEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xX8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822760xX8 extends C09AY implements InterfaceC1631620sYq<String, JSONObject, Map<String, ? extends String>, Unit> {
    public final /* synthetic */ C1822770xX9 LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822760xX8(C1822770xX9 c1822770xX9, String str) {
        super(3);
        this.LL = c1822770xX9;
        this.LLILLJJLI = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, JSONObject jSONObject, Map<String, ? extends String> map) {
        String str2;
        Map<String, ? extends String> map2 = map;
        if (Intrinsics.LJFF(str, "instant_page_perf") && map2 != null && (str2 = map2.get("perf_data")) != null) {
            C1822770xX9 c1822770xX9 = this.LL;
            String str3 = this.LLILLJJLI;
            try {
                String string = JSONObjectProtectorUtils.getString(new JSONObject(str2), "event_name");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1316684629:
                            if (string.equals("SubmitSuccess")) {
                                DataChannelGlobal.LLILZ.FQ2(SkuRoutingLeadConversionEvent.class, EnumC1122660fJw.FORM);
                                c1822770xX9.LIZJ.LJ(c1822770xX9.LJI);
                            }
                            break;
                        case -1074710092:
                            if (string.equals("ExitFormStatus")) {
                                if (c1822770xX9.LJFF) {
                                    c1822770xX9.LIZJ.LIZJ(c1822770xX9.LJI);
                                } else {
                                    c1822770xX9.LIZ();
                                }
                            }
                            break;
                        case -83780746:
                            if (string.equals("SubmitFail")) {
                                c1822770xX9.LIZJ.LIZIZ(1004, c1822770xX9.LJ, c1822770xX9.LJI);
                            }
                            break;
                        case 764230728:
                            if (string.equals("RenderFinished")) {
                                InterfaceC1823490xYJ interfaceC1823490xYJ = c1822770xX9.LIZ;
                                if (interfaceC1823490xYJ != null) {
                                    interfaceC1823490xYJ.LIZ();
                                }
                                C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_form_open_count");
                                c1822770xX9.LIZIZ[c1822770xX9.LJII].LJ(c1822770xX9.LJI);
                            }
                            break;
                        case 1438635637:
                            if (string.equals("SubmitResult")) {
                                c1822770xX9.LIZ();
                                C1822790xXB c1822790xXB = c1822770xX9.LIZJ;
                                c1822790xXB.LIZLLL(c1822790xXB.hashCode(), str3, c1822770xX9.LJI);
                                c1822770xX9.LJFF = true;
                                C1103300eoi c1103300eoi = C1103300eoi.LIZLLL;
                                c1103300eoi.LIZLLL(1, "smb_viewer_form_send_count");
                                c1103300eoi.LIZLLL(1, "smb_viewer_form_send_count_app_session");
                            }
                            break;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Unit.LIZ;
    }
}
