package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Hqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC453710Hqj {
    public static final C457770HxH LIZ = C457770HxH.LIZ;

    boolean LIZ();

    Long LIZIZ(InterfaceC444050Hb9 interfaceC444050Hb9);

    AbstractC1493005su LIZJ(Long l);

    void LIZLLL(View view, StickerTemplate stickerTemplate, String str, String str2, String str3, boolean z, String str4, Function1<? super InterfaceC1364105Vn<? super String>, ? extends Object> function1, Map<String, String> map, C447760Hh8 c447760Hh8, String str5, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, SessionInfo sessionInfo);

    void LJ(View view, C451030HmP c451030HmP, String str, Integer num, C447760Hh8 c447760Hh8, Map map, Integer num2, boolean z, Function0 function0, Function0 function02, Function0 function03, SessionInfo sessionInfo);

    void LJFF(int i, C1163440gNi c1163440gNi, UIAssem uIAssem, C449650HkB c449650HkB);

    List<EnumC449720HkI> LJI();

    void LJII(View view, StickerItem stickerItem, String str, String str2, Integer num, String str3, boolean z, String str4, Function1 function1, Map map, Integer num2, boolean z2, Function0 function0, Function0 function02, Function0 function03);

    void LJIIIIZZ(View view, SetSticker setSticker, String str, String str2, String str3, Integer num, Map<String, String> map, Integer num2, Function0<Unit> function0);

    C0I06 LJIIIZ();

    List<SetSticker> LJIIJ(String str);

    void LJIIJJI(C19EG c19eg, C454850HsZ c454850HsZ, C450000Hkk c450000Hkk, Function1 function1);

    void LJIIL();

    AbstractC1492605sq LJIILIIL(Integer num, Long l);

    void LJIILJJIL(BasePanelContainerAssem basePanelContainerAssem);

    void LJIILL(View view, StickerTemplate stickerTemplate, String str, String str2, Function1<? super InterfaceC1364105Vn<? super String>, ? extends Object> function1, boolean z, Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02, SessionInfo sessionInfo);
}
