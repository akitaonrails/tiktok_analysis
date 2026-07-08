package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bGS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966740bGS extends C09AY implements Function2<String, C965950bFB, CancelInviteResult> {
    public C966740bGS() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final CancelInviteResult invoke(String str, C965950bFB c965950bFB) {
        C1AZW.LJIIJ(12, C494940Jb2.LIZ(), "cancelInvite success", null, null);
        return new CancelInviteResult(null, str);
    }
}
