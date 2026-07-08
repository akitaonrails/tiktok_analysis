package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.model.message.linkcore.InviteResponse;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bF1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965850bF1 extends C09AY implements Function2<String, C965950bFB, InviteResult> {
    public C965850bF1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final InviteResult invoke(String str, C965950bFB c965950bFB) {
        return new InviteResult(null, str, (InviteResponse) C966250bFf.LIZ(c965950bFB.LIZ, InviteResponse.class));
    }
}
