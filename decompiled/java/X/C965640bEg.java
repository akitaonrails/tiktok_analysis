package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.model.message.linkcore.ApplyRequestResponse;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965640bEg extends C09AY implements Function2<String, C965950bFB, ApplyResult> {
    public C965640bEg() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ApplyResult invoke(String str, C965950bFB c965950bFB) {
        C965950bFB c965950bFB2 = c965950bFB;
        return new ApplyResult((BizApplyResponse) C966250bFf.LIZ(c965950bFB2.LIZIZ, BizApplyResponse.class), str, (ApplyRequestResponse) C966250bFf.LIZ(c965950bFB2.LIZ, ApplyRequestResponse.class));
    }
}
