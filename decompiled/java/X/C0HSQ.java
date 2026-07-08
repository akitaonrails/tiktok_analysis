package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareActionAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: renamed from: X.0HSQ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C0HSQ extends C2217421BqW implements Function0<Unit> {
    public C0HSQ(Object obj) {
        super(0, obj, MixStudioShareActionAssem.class, "addToStory", "addToStory()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0HSR c0hsr;
        C0HSR c0hsr2;
        EnumC441640HTm enumC441640HTm;
        MixStudioShareActionAssem mixStudioShareActionAssem = (MixStudioShareActionAssem) this.receiver;
        Context context = mixStudioShareActionAssem.getContext();
        if (context != null) {
            MixStudioShareViewModel mixStudioShareViewModelJo = mixStudioShareActionAssem.Jo();
            C0HSS c0hss = (C0HSS) mixStudioShareViewModelJo.LL.getValue();
            String str = null;
            if (c0hss != null) {
                C454570Hs7 c454570Hs7 = new C454570Hs7();
                StickerItem stickerItem = c0hss.LLILLJJLI;
                C0HSR c0hsr3 = c0hss.LLILLL;
                c454570Hs7.LIZ(context, stickerItem, c0hsr3.LIZ, c0hsr3.LIZIZ);
                StickerBase stickerBase = c0hss.LLILLJJLI.stickerBase;
                if (stickerBase != null) {
                    Long l = stickerBase.id;
                    Integer num = stickerBase.stickerType;
                    if (l != null && num != null) {
                        int iIntValue = num.intValue();
                        long jLongValue = l.longValue();
                        C0HQV c0hqv = C0HQV.LIZ;
                        AwS372S0200000_6 awS372S0200000_6 = new AwS372S0200000_6(mixStudioShareViewModelJo, c0hss, 97);
                        c0hqv.getClass();
                        C0HQV.LJ(iIntValue, jLongValue, awS372S0200000_6);
                    }
                }
                C0HQV c0hqv2 = C0HQV.LIZ;
                StickerItem stickerItem2 = c0hss.LLILLJJLI;
                c0hqv2.getClass();
                C0HQV.LIZ(stickerItem2);
            }
            mixStudioShareActionAssem.Jo().vQ2();
            C0HSS c0hssHo = mixStudioShareActionAssem.Ho();
            if (c0hssHo != null && (enumC441640HTm = c0hssHo.LL) != null) {
                C440370HOp c440370HOp = C440370HOp.LIZ;
                C0HT1 c0ht1 = C0HT1.ADD_TO_STORY;
                c440370HOp.getClass();
                C440370HOp.LJ(enumC441640HTm, c0ht1);
            }
            C440370HOp c440370HOp2 = C440370HOp.LIZ;
            C0HSS c0hssHo2 = mixStudioShareActionAssem.Ho();
            String str2 = (c0hssHo2 == null || (c0hsr2 = c0hssHo2.LLILLL) == null) ? null : c0hsr2.LIZ;
            C0HSS c0hssHo3 = mixStudioShareActionAssem.Ho();
            if (c0hssHo3 != null && (c0hsr = c0hssHo3.LLILLL) != null) {
                str = c0hsr.LIZIZ;
            }
            c440370HOp2.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("enter_method", str);
            C20684815ws.LJIILLIIL("share_to_story_click", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }
}
