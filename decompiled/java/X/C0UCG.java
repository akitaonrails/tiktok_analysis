package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS55S0001000_12;

/* JADX INFO: renamed from: X.0UCG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UCG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UCG(int i, int i2, long j, Integer num, String str, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = num;
        this.LLILZLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_sticker_panel_download");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(this.LL, "tab");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILLJJLI), "use_time");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILLL), "download_status");
        c474500IjALIZ.LJJII(C500260Jjc.LJIJ(DataChannelGlobal.LLILZ) ? "1" : CardStruct.IStatusCode.DEFAULT, "is_anchor");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZ), "list_size");
        AwS55S0001000_12 awS55S0001000_12 = new AwS55S0001000_12(this.LLILLL, 4);
        Integer num = this.LLILZIL;
        c474500IjALIZ.LJJIIZ(Integer.valueOf(num != null ? num.intValue() : -1), "error_code", awS55S0001000_12);
        AwS55S0001000_12 awS55S0001000_122 = new AwS55S0001000_12(this.LLILLL, 5);
        String str = this.LLILZLL;
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJIIZ(str, "error_description", awS55S0001000_122);
        c474500IjALIZ.LJJI(true);
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
