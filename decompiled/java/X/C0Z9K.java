package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Z9K, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public interface C0Z9K extends ILightInteractionPlatformService {
    C20663815tU LJIIJJI(InnerPushMessage innerPushMessage, String str, boolean z, Map<String, String> map, View.OnClickListener onClickListener, Function2<? super View, ? super LightInteractionCommonResource, Unit> function2);

    void LJIILJJIL(InnerPushMessage innerPushMessage, String str);

    boolean LJIJJ(InnerPushMessage innerPushMessage);
}
