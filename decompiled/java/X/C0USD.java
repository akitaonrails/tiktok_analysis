package X;

import android.net.Uri;
import com.bytedance.android.livesdk.broadcast.preview.onetap.OneTapGoLiveManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0USD, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0USD extends C2217421BqW implements Function2<Uri, Integer, Unit> {
    public C0USD(Object obj) {
        super(2, obj, OneTapGoLiveManager.class, "handleGoLive", "handleGoLive(Landroid/net/Uri;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Uri uri, Integer num) {
        int iIntValue = num.intValue();
        ((OneTapGoLiveManager) this.receiver).LJIILIIL(uri, iIntValue);
        return Unit.LIZ;
    }
}
