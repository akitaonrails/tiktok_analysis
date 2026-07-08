package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.airemix.api.model.AIRemixAwemeEntranceModel;
import com.ss.android.ugc.airemix.api.service.AIRemixLaunchParam;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: renamed from: X.0M6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC563090M6p {
    AIRemixLaunchParam LIZ(Bundle bundle);

    Object LIZIZ(Aweme aweme, InterfaceC1364105Vn<? super AIRemixAwemeEntranceModel> interfaceC1364105Vn);

    boolean LIZJ();

    String LIZLLL(String str);

    void LJ(Context context);

    AIRemixLaunchParam LJFF(Map<String, ? extends Object> map);

    void LJI(Context context, AIRemixLaunchParam aIRemixLaunchParam);
}
