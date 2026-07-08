package X;

import com.tiktok.ef.absettings.api.IABSettingsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C311740CJw extends C2217421BqW implements Function0<Unit> {
    public C311740CJw(Object obj) {
        super(0, obj, IABSettingsApi.FetchCallback.class, "onBeforeSaveToDB", "onBeforeSaveToDB()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((IABSettingsApi.FetchCallback) this.receiver).onBeforeSaveToDB();
        return Unit.LIZ;
    }
}
