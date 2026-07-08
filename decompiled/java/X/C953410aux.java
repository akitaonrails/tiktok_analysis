package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.HideNoticeBoardWhenUseTemplate;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;

/* JADX INFO: renamed from: X.0aux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953410aux extends C09AY implements Function0<DataChannel> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ConvertNoticeboardMaterialInfo LLILZ;
    public final /* synthetic */ C953100auS LLILZIL;
    public final /* synthetic */ C953400auw LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C953410aux(long j, String str, String str2, ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo, C953100auS c953100auS, C953400auw c953400auw) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = convertNoticeboardMaterialInfo;
        this.LLILZIL = c953100auS;
        this.LLILZLL = c953400auw;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DataChannel invoke() {
        C953230auf c953230auf = C953230auf.LIZ;
        long j = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = this.LLILZ;
        C953100auS c953100auS = this.LLILZIL;
        c953230auf.getClass();
        C953230auf.LJIL(j, str, str2, convertNoticeboardMaterialInfo, c953100auS);
        DataChannel dataChannel = this.LLILZLL.LIZ.getDataChannel();
        if (dataChannel == null) {
            return null;
        }
        dataChannel.FQ2(HideNoticeBoardWhenUseTemplate.class);
        return dataChannel;
    }
}
