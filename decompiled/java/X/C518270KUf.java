package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioSingleFormAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518270KUf extends C09AY implements Function0<Map<String, ? extends String>> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ PcsServiceBioSingleFormAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C518270KUf(String str, PcsServiceBioSingleFormAssem pcsServiceBioSingleFormAssem) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = pcsServiceBioSingleFormAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("no_header", "1");
        pairArr[1] = new Pair("follow_app_theme", this.LL);
        pairArr[2] = new Pair("pcs_params", this.LLILLJJLI.up().wQ2(true, this.LLILLJJLI.LLJJJJJIL == EnumC518250KUd.LOAD_FROM_CACHE));
        pairArr[3] = new Pair("iab_click_time", String.valueOf(System.currentTimeMillis()));
        Map<String, ? extends String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        DataChannel dataChannel = (DataChannel) DataChannelGlobal.LLILZ.gg0(C1148300fzI.class);
        if (dataChannel != null) {
            C0JMI.LIZ(dataChannel, mapLJIIJ);
        }
        return mapLJIIJ;
    }
}
