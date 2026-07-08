package X;

import android.text.Spanned;
import android.util.Size;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1859220yTw {
    Set<String> LIZ();

    Set<String> LIZIZ();

    void LIZJ(TakoPlaceholderSource takoPlaceholderSource, C689590R3d c689590R3d, Message message, boolean z, C1859060yTg c1859060yTg);

    InterfaceC1587906Jp LIZLLL(TakoPlaceholderSource takoPlaceholderSource, String str, View view, TakoCardAbility takoCardAbility, int i);

    Size LJ(InterfaceC1859630yUb interfaceC1859630yUb, View view, Spanned spanned, boolean z);

    String LJFF(TakoPlaceholderSource takoPlaceholderSource);

    Function0<ReusedUIAssem<?>> LJI(InterfaceC1587906Jp interfaceC1587906Jp);
}
