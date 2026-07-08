package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS439S0200000_3;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: renamed from: X.09IB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09IB {
    public static final C09IB LIZ = new C09IB();

    public static void LIZIZ(Effect effect, List list) {
        if (list.isEmpty()) {
            DiyPropParser.LJIILJJIL(C1622320sJq.LIZIZ, effect, new Bitmap[0], null);
            return;
        }
        int[] iArrLJI = DiyPropParser.LJI(effect);
        AwS617S0100000_3 awS617S0100000_3 = new AwS617S0100000_3(effect, 22);
        if (list.isEmpty()) {
            awS617S0100000_3.invoke(C09I6.UNKNOWN, C13BV.INSTANCE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        awS617S0100000_3.invoke(C09I6.START, arrayList);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C09I1(list, iArrLJI, arrayList, awS617S0100000_3, null), 2);
    }

    public static void LIZ(Effect effect, String str, AbstractC1622310sJp abstractC1622310sJp) {
        if (str.length() == 0) {
            DiyPropParser.LJIILJJIL(abstractC1622310sJp, effect, new Bitmap[0], null);
        } else {
            C09I4.LIZ(str, DiyPropParser.LJI(effect), new AwS439S0200000_3(abstractC1622310sJp, effect, 1));
        }
    }
}
