package X;

import com.ss.android.ugc.aweme.vibefeed.model.InlineMessageInfo;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedStatusResponse;
import com.ss.android.ugc.aweme.vibefeed.model.VibeReachResponse;
import com.ss.android.ugc.aweme.vibefeed.model.VibeStatDelta;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0P3H, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0P3H extends InterfaceC149400hg {
    Object R(String str, String str2, String str3, EnumC912680ZrG enumC912680ZrG, InterfaceC1364105Vn<? super VibeFeedStatusResponse> interfaceC1364105Vn);

    Object m(String str, String str2, String str3, List<VibeStatDelta> list, String str4, EnumC912680ZrG enumC912680ZrG, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object n0(String str, String str2, String str3, String str4, C0P3O c0p3o, InlineMessageInfo inlineMessageInfo, EnumC912680ZrG enumC912680ZrG, InterfaceC1364105Vn<? super VibeReachResponse> interfaceC1364105Vn);
}
