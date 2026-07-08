package X;

import com.ss.android.ugc.aweme.aigc.NoticeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LOx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C542370LOx {
    public static final C542370LOx LIZ = new C542370LOx();

    public static NoticeService LIZ() {
        return (NoticeService) C547350LdN.LIZIZ(PluggableExtentionKt.pluggableSpi$default(NoticeService.class, false, false, false, 14, null), "notice", new NoticeService() { // from class: X.0LOw
            @Override // com.ss.android.ugc.aweme.aigc.NoticeService
            public final void LIZ(C542230LOj c542230LOj, String str, String str2, String str3) {
            }

            @Override // com.ss.android.ugc.aweme.aigc.NoticeService
            public final void LIZIZ(Function1<? super C542260LOm, Unit> function1) {
            }

            @Override // com.ss.android.ugc.aweme.aigc.NoticeService
            public final void onEventV3(String str, Map<String, String> map) {
            }
        });
    }
}
