package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioContentAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518280KUg extends C09AY implements Function0<Map<String, ? extends String>> {
    public final /* synthetic */ PcsServiceBioContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C518280KUg(PcsServiceBioContentAssem pcsServiceBioContentAssem) {
        super(0);
        this.LL = pcsServiceBioContentAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        Map<String, ? extends String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("pcs_params", this.LL.ip().wQ2(false, this.LL.ip().LLIZLLLIL)), new Pair("iab_click_time", String.valueOf(System.currentTimeMillis())));
        DataChannel dataChannel = (DataChannel) DataChannelGlobal.LLILZ.gg0(C1148300fzI.class);
        if (dataChannel != null) {
            C0JMI.LIZ(dataChannel, mapLJIIJ);
        }
        return mapLJIIJ;
    }
}
