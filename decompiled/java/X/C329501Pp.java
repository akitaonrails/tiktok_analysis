package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01Pp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C329501Pp extends C09AY implements Function1<Map<String, ? extends String>, Unit> {
    public final /* synthetic */ PreviewBulletinEditWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329501Pp(PreviewBulletinEditWidget previewBulletinEditWidget) {
        super(1);
        this.LL = previewBulletinEditWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends String> map) {
        long jLongValue;
        Long lLJIILIIL;
        Map<String, ? extends String> map2 = map;
        PreviewBulletinEditWidget previewBulletinEditWidget = this.LL;
        previewBulletinEditWidget.getClass();
        String str = map2.get("board_id");
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        String str2 = map2.get("show_entrance");
        if (str2 == null) {
            str2 = "preview";
        }
        previewBulletinEditWidget.LLJ = str2;
        String str3 = map2.get("previous_page");
        if (str3 == null) {
            str3 = "scheme";
        }
        if (jLongValue != 0) {
            AnonymousClass0956 anonymousClass0956 = previewBulletinEditWidget.LLJJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            previewBulletinEditWidget.LLJJ = C23250099c.LIZLLL(previewBulletinEditWidget.LLJILLL, C0PEM.LIZ, null, new C329401Po(jLongValue, previewBulletinEditWidget, str3, null), 2);
        } else {
            AnonymousClass0956 anonymousClass09562 = previewBulletinEditWidget.LLJJ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
        }
        return Unit.LIZ;
    }
}
