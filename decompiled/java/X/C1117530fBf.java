package X;

import com.bytedance.android.livesdk.share.ShareSettingsDialog;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117530fBf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ShareSettingsDialog LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1117530fBf(ShareSettingsDialog shareSettingsDialog, boolean z, long j) {
        super(0);
        this.LL = shareSettingsDialog;
        this.LLILLJJLI = z;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.PR().setChecked(this.LLILLJJLI);
        DataChannelGlobal.LLILZ.JQ2(C1148120fz0.class, Long.valueOf(this.LLILLL));
        return Unit.LIZ;
    }
}
