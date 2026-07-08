package X;

import com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings.CommonDispatchConfigModel;
import com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings.CustomNetConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057050dc7 extends C09AY implements Function0<CustomNetConfig> {
    public C1057050dc7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final CustomNetConfig invoke() {
        return ((CommonDispatchConfigModel) C1057040dc6.LIZIZ.getValue()).customNetState;
    }
}
