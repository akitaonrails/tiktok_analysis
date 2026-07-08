package X;

import android.app.Dialog;
import android.content.Context;
import com.ss.android.ugc.aweme.notification.utils.SharePhotoModeHelper;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0znE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909620znE extends C09AY implements Function1<SharePhotoModeHelper.SharePhotoModeInfo, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Dialog LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1909620znE(Context context, String str, String str2, String str3, String str4, DialogC1389620mGW dialogC1389620mGW) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = dialogC1389620mGW;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SharePhotoModeHelper.SharePhotoModeInfo sharePhotoModeInfo) {
        SharePhotoModeHelper.SharePhotoModeInfo sharePhotoModeInfo2 = sharePhotoModeInfo;
        if (sharePhotoModeInfo2 != null) {
            Context context = this.LL;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            String str4 = this.LLILZIL;
            Dialog dialog = this.LLILZLL;
            C1EE2 c1ee2 = C1EE2.LIZIZ;
            List<String> list = sharePhotoModeInfo2.photoUrls;
            String str5 = sharePhotoModeInfo2.title;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            String str7 = sharePhotoModeInfo2.description;
            if (str7 != null) {
                str6 = str7;
            }
            c1ee2.LJJI(sharePhotoModeInfo2.coverIndex, context, str, str2, str5, str6, str3, str4, list, new AwS572S0100000_28(dialog, 343));
        } else {
            C786410Ut5.LIZIZ(this.LLILZLL);
        }
        return Unit.LIZ;
    }
}
