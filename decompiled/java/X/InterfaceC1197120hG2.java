package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hG2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public interface InterfaceC1197120hG2 {
    String LIZLLL();

    String LJJIZ();

    void LJJLL(Aweme aweme, String str, String str2, boolean z, String str3, C2344009Gk c2344009Gk, PageFinder pageFinder, Function1<? super C2344009Gk, Unit> function1);

    String LLIL(int i);

    void LLJJIJI(InterfaceC665370Q7z interfaceC665370Q7z, FcpStandardPreloadProtocol fcpStandardPreloadProtocol);

    void LLJJJJ(Aweme aweme, String str, String str2, String str3, boolean z, boolean z2, String str4, C2344009Gk c2344009Gk, Function1<? super C2344009Gk, Unit> function1);

    Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> LLJJJJLIIL(Aweme aweme, String str);

    void LLLFFI(int i, int i2, int i3, int i4, int i5, int i6);

    void LLLIL(InterfaceC665370Q7z interfaceC665370Q7z, FcpStandardPreloadProtocol fcpStandardPreloadProtocol);

    void LLLILZLLLI(Aweme aweme, String str, String str2, boolean z);

    void LLLIZZ(Aweme aweme);

    void LLLLIIL(Context context, View view, Aweme aweme, String str, String str2, C2344009Gk c2344009Gk, boolean z, String str3, String str4, String str5, boolean z2, EnumC1188920h2o enumC1188920h2o, String str6, Function1<? super C2344009Gk, Unit> function1);

    void LLZ();
}
