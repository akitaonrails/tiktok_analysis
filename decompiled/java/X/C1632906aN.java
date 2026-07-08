package X;

import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06aN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1632906aN extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1632906aN(Object obj) {
        super(1, obj, GroupChatNoticeAssem.class, "setMessageListVisibility", "setMessageListVisibility(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((GroupChatNoticeAssem) this.receiver).Bp(bool.booleanValue());
        return Unit.LIZ;
    }
}
