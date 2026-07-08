package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.common.model.QRCodeGroupChatLayout;
import com.ss.android.ugc.aweme.msg.qrcode.QRGroupCreationMessageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.12Pz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19752512Pz extends C2217421BqW implements Function2<QRCodeGroupChatLayout, Activity, Unit> {
    public C19752512Pz(QRGroupCreationMessageVM qRGroupCreationMessageVM) {
        super(2, qRGroupCreationMessageVM, QRGroupCreationMessageVM.class, "doShowQRCodePanel", "doShowQRCodePanel(Lcom/ss/android/ugc/aweme/im/common/model/QRCodeGroupChatLayout;Landroid/app/Activity;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(QRCodeGroupChatLayout qRCodeGroupChatLayout, Activity activity) {
        ((QRGroupCreationMessageVM) this.receiver).wQ2(qRCodeGroupChatLayout, activity);
        return Unit.LIZ;
    }
}
