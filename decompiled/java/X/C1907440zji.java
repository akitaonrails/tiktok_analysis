package X;

import android.view.View;
import com.ss.android.ugc.aweme.notification.sysnotice.cell.SystemNotificationCell;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0zji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1907440zji extends C2217421BqW implements InterfaceC1631620sYq<View, String, EnumC1907470zjl, Unit> {
    public C1907440zji(Object obj) {
        super(3, obj, SystemNotificationCell.class, "onClickWithRouter", "onClickWithRouter(Landroid/view/View;Ljava/lang/String;Lcom/ss/android/ugc/aweme/notification/view/template/NoticeCardPosition;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(View view, String str, EnumC1907470zjl enumC1907470zjl) {
        ((SystemNotificationCell) this.receiver).a6(view, str, enumC1907470zjl);
        return Unit.LIZ;
    }
}
