package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v7W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730000v7W {
    public static boolean LIZ(TemplateItem templateItem, InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof TemplateItem) {
            TemplateItem templateItem2 = (TemplateItem) interfaceC1891350zJl;
            if (templateItem.getType() == templateItem2.getType() && Intrinsics.LJFF(templateItem.getSubType(), templateItem2.getSubType()) && templateItem.b0() == templateItem2.b0() && templateItem.Sm() == templateItem2.Sm() && Intrinsics.LJFF(templateItem.gy(), templateItem2.gy()) && Intrinsics.LJFF(templateItem.kv(), templateItem2.kv()) && Intrinsics.LJFF(templateItem.S3(), templateItem2.S3()) && Intrinsics.LJFF(templateItem.Cc(), templateItem2.Cc()) && templateItem.PK() == templateItem2.PK() && Intrinsics.LJFF(templateItem.getActivityInfo(), templateItem2.getActivityInfo()) && Intrinsics.LJFF(templateItem.vI(), templateItem2.vI()) && Intrinsics.LJFF(templateItem.T5(), templateItem2.T5()) && Intrinsics.LJFF(templateItem.tc(), templateItem2.tc())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZIZ(TemplateItem templateItem, InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof TemplateItem) && Intrinsics.LJFF(templateItem.getTemplateId(), ((TemplateItem) interfaceC1891350zJl).getTemplateId())) {
            return true;
        }
        return false;
    }
}
