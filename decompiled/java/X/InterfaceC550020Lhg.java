package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCameoDisplayInfo;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS32S0600000_14;

/* JADX INFO: renamed from: X.0Lhg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC550020Lhg {
    void LIZ(String str, Map<String, String> map);

    void LIZIZ(int i, int i2, Intent intent, Fragment fragment);

    InterfaceC901690ZYx LIZJ(String str, List list, AFwS239S0000000_8 aFwS239S0000000_8, AwS32S0600000_14 awS32S0600000_14, Map map);

    void LIZLLL(Integer num, String str, String str2, String str3);

    void LJ(Context context, IAITheaterCreationLauncher.EnterParams enterParams, AIGCCameoDisplayInfo aIGCCameoDisplayInfo, Function0<Unit> function0);

    boolean LJFF(String str);

    String LJI(AIGCSocialModel aIGCSocialModel);

    void LJII(LifecycleCoroutineScope lifecycleCoroutineScope, Context context, String str, String str2, boolean z, String str3, List<String> list);
}
