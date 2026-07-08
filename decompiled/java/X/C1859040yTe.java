package X;

import android.text.Spanned;
import android.util.Size;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0yTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859040yTe implements InterfaceC1859220yTw {
    public final Set<String> LIZ = Collections.singleton("video-group");
    public final Set<String> LIZIZ = Collections.singleton("video-group");
    public final int LIZJ;

    public C1859040yTe() {
        C07QH.LIZ.getClass();
        this.LIZJ = C07QH.LIZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(182)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
    }

    @Override // X.InterfaceC1859220yTw
    public final Set<String> LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1859220yTw
    public final Set<String> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1859220yTw
    public final String LJFF(TakoPlaceholderSource takoPlaceholderSource) {
        Integer num;
        List<TakoVideoItem> list;
        if (takoPlaceholderSource != null && (num = takoPlaceholderSource.sourceType) != null && num.intValue() == 0 && (list = takoPlaceholderSource.itemList) != null && !list.isEmpty()) {
            return "video-group";
        }
        return null;
    }

    @Override // X.InterfaceC1859220yTw
    public final Function0<ReusedUIAssem<?>> LJI(InterfaceC1587906Jp interfaceC1587906Jp) {
        return AFwS216S0000000_27.get$arr$(333);
    }

    @Override // X.InterfaceC1859220yTw
    public final Size LJ(InterfaceC1859630yUb interfaceC1859630yUb, View view, Spanned spanned, boolean z) {
        C07QJ.LIZ.getClass();
        boolean zLIZIZ = C07QJ.LIZIZ();
        if (spanned.getSpanStart(interfaceC1859630yUb) == 0) {
            return new Size(C1859020yTc.LIZ(z, zLIZIZ), this.LIZJ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        }
        return new Size(C1859020yTc.LIZ(z, false), this.LIZJ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
    }

    @Override // X.InterfaceC1859220yTw
    public final void LIZJ(TakoPlaceholderSource takoPlaceholderSource, C689590R3d c689590R3d, Message message, boolean z, C1859060yTg c1859060yTg) {
        C1557890qdv c1557890qdv;
        int iIntValue;
        if (C07HI.LIZIZ) {
            Integer num = (Integer) ((LinkedHashMap) c1859060yTg.LIZIZ).get("video-group");
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c1859060yTg.LIZIZ.put("video-group", Integer.valueOf(iIntValue + 1));
            c689590R3d.LIZ = Integer.valueOf(iIntValue);
        }
        if (takoPlaceholderSource != null) {
            takoPlaceholderSource.LIZ = c689590R3d;
        }
        if (message != null && (c1557890qdv = message.LJIIZILJ) != null && !c1557890qdv.LIZ && z) {
            c1557890qdv.LIZIZ = true;
            c1557890qdv.LIZ = true;
        }
    }

    @Override // X.InterfaceC1859220yTw
    public final InterfaceC1587906Jp LIZLLL(TakoPlaceholderSource takoPlaceholderSource, String str, View view, TakoCardAbility takoCardAbility, int i) {
        List<TakoVideoItem> list;
        if (takoPlaceholderSource != null && (list = takoPlaceholderSource.itemList) != null) {
            return new C1858820yTI(list, str, i, takoPlaceholderSource);
        }
        return null;
    }
}
