package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareActionAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HT0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C0HT0 extends C2217421BqW implements Function0<Unit> {
    public C0HT0(Object obj) {
        super(0, obj, MixStudioShareActionAssem.class, "report", "report()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0HSR c0hsr;
        C0HSR c0hsr2;
        EnumC441640HTm enumC441640HTm;
        String strValueOf;
        String str;
        MixStudioShareActionAssem mixStudioShareActionAssem = (MixStudioShareActionAssem) this.receiver;
        mixStudioShareActionAssem.getClass();
        C19EG c19egLIZ = C724240Sb0.LIZ(mixStudioShareActionAssem);
        if (c19egLIZ != null) {
            C0HSS c0hss = (C0HSS) mixStudioShareActionAssem.Jo().LL.getValue();
            String str2 = null;
            if (c0hss != null) {
                StickerItem stickerItem = c0hss.LLILLJJLI;
                StickerBase stickerBase = stickerItem.stickerBase;
                if (stickerBase == null || stickerBase.id == null) {
                    strValueOf = String.valueOf(stickerItem.setId);
                    str = CardStruct.IStatusCode.DEFAULT;
                } else {
                    strValueOf = String.valueOf(stickerBase != null ? stickerBase.id : null);
                    str = "1";
                }
                ComplianceServiceProvider.LJJ().LIZIZ(c19egLIZ, new Uri.Builder().appendQueryParameter("object_id", strValueOf).appendQueryParameter("report_type", "sticker").appendQueryParameter("sticker_type", String.valueOf(EnumC451180Hme.AIMOJI_STICKER_STATIC.getType())).appendQueryParameter("is_sticker_id", str).appendQueryParameter("owner_id", String.valueOf(c0hss.LLILLJJLI.userInfo)).appendQueryParameter("enter_from", c0hss.LLILLL.LIZ).appendQueryParameter("enter_method", c0hss.LLILLL.LIZIZ));
            }
            mixStudioShareActionAssem.Jo().vQ2();
            C0HSS c0hssHo = mixStudioShareActionAssem.Ho();
            if (c0hssHo != null && (enumC441640HTm = c0hssHo.LL) != null) {
                C440370HOp c440370HOp = C440370HOp.LIZ;
                C0HT1 c0ht1 = C0HT1.REPORT;
                c440370HOp.getClass();
                C440370HOp.LJ(enumC441640HTm, c0ht1);
            }
            C440370HOp c440370HOp2 = C440370HOp.LIZ;
            C0HSS c0hssHo2 = mixStudioShareActionAssem.Ho();
            String str3 = (c0hssHo2 == null || (c0hsr2 = c0hssHo2.LLILLL) == null) ? null : c0hsr2.LIZ;
            C0HSS c0hssHo3 = mixStudioShareActionAssem.Ho();
            if (c0hssHo3 != null && (c0hsr = c0hssHo3.LLILLL) != null) {
                str2 = c0hsr.LIZIZ;
            }
            c440370HOp2.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str3);
            c2344009Gk.LJIIIIZZ("enter_method", str2);
            C20684815ws.LJIILLIIL("click_report", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }
}
