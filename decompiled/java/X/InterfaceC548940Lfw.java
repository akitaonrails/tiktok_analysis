package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.airemix.api.model.AIRemixAwemeEntranceModel;
import com.ss.android.ugc.airemix.model.AIRemixMobContextModel;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Lfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC548940Lfw {
    Object LIZ(String str, InterfaceC1364105Vn<? super AIRemixAwemeEntranceModel> interfaceC1364105Vn);

    Object LIZIZ(String str, InterfaceC1364105Vn interfaceC1364105Vn);

    C2252321DDq LIZJ(Activity activity, String str, LifecycleCoroutineScope lifecycleCoroutineScope, String str2, String str3, String str4, AIRemixMobContextModel aIRemixMobContextModel, Function0 function0, Function0 function02, Function2 function2, Function1 function1, Function0 function03);

    void LIZLLL(long j, Activity activity);

    C05YD<C0LN4<String>> LJ(String str, String str2, String str3);

    C2252321DDq LJFF(Context context, InterfaceC497601wk interfaceC497601wk, String str, String str2, String str3, String str4, boolean z, Function2 function2, Function1 function1, String str5, Function0 function0);

    Object LJI(Context context, AIGCDraft aIGCDraft, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LJII(Activity activity, long j, int i);

    void LJIIIIZZ(AIGCDraft aIGCDraft);

    AIRemixAwemeEntranceModel LJIIIZ(String str);
}
