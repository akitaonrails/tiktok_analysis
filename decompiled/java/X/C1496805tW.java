package X;

import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05tW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1496805tW extends C2217421BqW implements Function1<ThoughtInfo, Unit> {
    public C1496805tW(SingleTitleBarCenterAssem singleTitleBarCenterAssem) {
        super(1, singleTitleBarCenterAssem, SingleTitleBarCenterAssem.class, "mobThoughtBubbleClick", "mobThoughtBubbleClick(Lcom/ss/android/ugc/aweme/social/thought/api/model/ThoughtInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ThoughtInfo thoughtInfo) {
        ((SingleTitleBarCenterAssem) this.receiver).Ep(thoughtInfo);
        return Unit.LIZ;
    }
}
