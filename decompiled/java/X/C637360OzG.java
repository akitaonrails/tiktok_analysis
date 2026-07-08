package X;

import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$INoticeWidgetAbility;
import com.ss.android.ugc.aweme.notification.view.guidepush.BulletBoardGuideWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C637360OzG extends C2217421BqW implements Function0<Unit> {
    public C637360OzG(Object obj) {
        super(0, obj, BulletBoardGuideWidget.class, "clearWidget", "clearWidget()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BulletBoardGuideWidget bulletBoardGuideWidget = (BulletBoardGuideWidget) this.receiver;
        bulletBoardGuideWidget.LLIZLLLIL = null;
        bulletBoardGuideWidget.Co(C1889340zGW.LIZ);
        InboxAbilityCenter$INoticeWidgetAbility inboxAbilityCenter$INoticeWidgetAbility = (InboxAbilityCenter$INoticeWidgetAbility) C1558520qew.LIZ(C1558520qew.LJIIL(bulletBoardGuideWidget), InboxAbilityCenter$INoticeWidgetAbility.class, null);
        if (inboxAbilityCenter$INoticeWidgetAbility != null) {
            inboxAbilityCenter$INoticeWidgetAbility.Wx(false);
        }
        return Unit.LIZ;
    }
}
