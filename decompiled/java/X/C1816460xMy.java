package X;

import kotlin.jvm.functions.Function1;
import webcast.api.smb.InterceptReason;

/* JADX INFO: renamed from: X.0xMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816460xMy extends C09AY implements Function1<InterceptReason, CharSequence> {
    public C1816460xMy() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(InterceptReason interceptReason) {
        return interceptReason.reasonText;
    }
}
