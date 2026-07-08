package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.NavigationText;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KBL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KBL extends C09AY implements Function2<C514600KGc, Pair<? extends String, ? extends List<SubscriptionProductDetailWithTemplateInfo>>, Unit> {
    public final /* synthetic */ C0KBK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KBL(C0KBK c0kbk) {
        super(2);
        this.LL = c0kbk;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C514600KGc c514600KGc, Pair<? extends String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> pair) {
        TemplateListData templateListData;
        String first;
        NavigationText navigationText;
        String str;
        List<NavigationText> list;
        NavigationText next;
        C0KH1 c0kh1;
        C514600KGc c514600KGc2 = c514600KGc;
        Pair<? extends String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> pair2 = pair;
        String str2 = null;
        if (c514600KGc2 != null && (c0kh1 = c514600KGc2.LIZLLL) != null) {
            templateListData = c0kh1.LIZ;
        } else {
            templateListData = null;
        }
        if (pair2 == null || (first = pair2.getFirst()) == null) {
            first = "";
        }
        if (templateListData != null && (list = templateListData.navigationTextList) != null) {
            Iterator<NavigationText> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.packageId, first)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            navigationText = next;
        } else {
            navigationText = null;
        }
        C16F5 c16f5 = this.LL.LL;
        if (c16f5 != null) {
            if (navigationText != null) {
                str = navigationText.content;
            } else {
                str = null;
            }
            c16f5.setText(str);
        }
        C16F5 c16f52 = this.LL.LLILLJJLI;
        if (c16f52 != null) {
            if (navigationText != null) {
                str2 = navigationText.title;
            }
            c16f52.setText(str2);
        }
        return Unit.LIZ;
    }
}
