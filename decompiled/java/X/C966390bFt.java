package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelResult;
import kotlin.jvm.functions.Function2;
import webcast.data.multilive_biz.BizLeaveResponse;

/* JADX INFO: renamed from: X.0bFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966390bFt extends C09AY implements Function2<String, C965950bFB, LeaveChannelResult> {
    public C966390bFt() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final LeaveChannelResult invoke(String str, C965950bFB c965950bFB) {
        return new LeaveChannelResult(null, str, 1L, (BizLeaveResponse) C966250bFf.LIZ(c965950bFB.LIZIZ, BizLeaveResponse.class));
    }
}
