package Y;

import X.AbstractActivityC559670LxF;
import X.AbstractBinderC539770LEx;
import X.AbstractC568240MQk;
import X.C0MRN;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C537930L7v;
import X.C559870LxZ;
import X.InterfaceC559900Lxc;
import X.InterfaceC568180MQe;
import android.content.Intent;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui_impl.newplayer.NewCutPlayerActivity;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.CreationOnThisDayPreviewScene;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AObjectS527S0100000_8 implements Function2 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS527S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS527S0100000_8 aObjectS527S0100000_8, Object obj, Object obj2) {
        ((Function2) aObjectS527S0100000_8.l0).invoke(Long.valueOf(((Number) obj).longValue()), Long.valueOf(((Number) obj2).longValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS527S0100000_8 aObjectS527S0100000_8, Object obj, Object obj2) {
        C0MRN c0mrn;
        InterfaceC568180MQe interfaceC568180MQe = ((CreationOnThisDayPreviewScene) aObjectS527S0100000_8.l0).LLLL;
        if (interfaceC568180MQe != null) {
            interfaceC568180MQe.WH2();
        }
        AbstractC568240MQk abstractC568240MQkLLLLLLIL = ((CreationOnThisDayPreviewScene) aObjectS527S0100000_8.l0).LLLLLLIL();
        if ((abstractC568240MQkLLLLLLIL instanceof C0MRN) && (c0mrn = (C0MRN) abstractC568240MQkLLLLLLIL) != null) {
            c0mrn.LLLLJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS527S0100000_8 aObjectS527S0100000_8, Object obj, Object obj2) throws Throwable {
        NewCutPlayerActivity newCutPlayerActivity = (NewCutPlayerActivity) aObjectS527S0100000_8.l0;
        int iIntValue = ((Integer) obj2).intValue();
        String str = NewCutPlayerActivity._pnsPageId;
        if (newCutPlayerActivity.LLJ == 0) {
            AbstractBinderC539770LEx abstractBinderC539770LEx = newCutPlayerActivity.LLILLJJLI;
            if (abstractBinderC539770LEx != null) {
                abstractBinderC539770LEx.report(1016, String.valueOf(iIntValue + 1), null, null, null, null, null);
            }
            Intent intent = new Intent("com.ss.android.ugc.cut_ui.CLIP");
            intent.setPackage(newCutPlayerActivity.getPackageName());
            intent.putExtras(newCutPlayerActivity.getIntent());
            intent.putExtra("click_pos", iIntValue + 1);
            intent.addFlags(536870912);
            ArrayList<MediaItem> arrayList = newCutPlayerActivity.LLJJJIL;
            if (arrayList != null) {
                new C537930L7v(new ArrayList(Collections.singletonList(obj)), arrayList, null, 4).LIZ(intent);
            }
            boolean z = false;
            if (C2204961BRm.LJJJJZ(newCutPlayerActivity.getPackageManager(), intent, 0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFgmb6S4b57X2SBR7QP2wU0FyX82MgIzObV6JIo/", null)).size() > 0) {
                z = true;
            }
            if (z) {
                newCutPlayerActivity.LLJJIJIIJIL = true;
                AbstractActivityC559670LxF.LLLLLZL(newCutPlayerActivity, intent, 1001);
                InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onClipStart : ");
                sbLIZ.append(obj);
                C559870LxZ.LIZ("cutui.CutPlayerActivity", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                InterfaceC559900Lxc interfaceC559900Lxc2 = C559870LxZ.LIZ;
                C559870LxZ.LIZ("cutui.CutPlayerActivity", "can not launchClip");
            }
        }
        return Unit.LIZ;
    }
}
