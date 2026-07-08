package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bJ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C968400bJ8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LinkMicConfig LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C968400bJ8(LinkMicConfig linkMicConfig) {
        super(0);
        this.LL = linkMicConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.close();
        return Unit.LIZ;
    }
}
