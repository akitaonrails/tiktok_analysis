package X;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eMB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1085610eMB extends C2217421BqW implements Function1<C946210ajL, Unit> {
    public C1085610eMB(C1085620eMC c1085620eMC) {
        super(1, c1085620eMC, C1085620eMC.class, "onClipEvent", "onClipEvent(Lcom/bytedance/android/live/linkmic/LivePublicScreenClipEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C946210ajL c946210ajL) {
        C946210ajL c946210ajL2 = c946210ajL;
        C1085620eMC c1085620eMC = (C1085620eMC) this.receiver;
        c1085620eMC.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClipEvent => ");
        sbLIZ.append(c946210ajL2.LIZ);
        sbLIZ.append(" , size = ");
        sbLIZ.append(c946210ajL2.LIZ.size());
        C20441214yg.LIZIZ("maskhollow", C2188811AlT.LIZIZ(sbLIZ));
        View view = c1085620eMC.LJ;
        if (view != null && (view instanceof C1099820ej6)) {
            List<Rect> list = c946210ajL2.LIZ;
            float f = c946210ajL2.LIZIZ;
            List<Rect> list2 = c1085620eMC.LJFF;
            if (list2.size() == list.size()) {
                int size = list2.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (!Intrinsics.LJFF(ListProtector.get(list2, i), ListProtector.get(list, i))) {
                            break;
                        }
                        i++;
                    } else if (c1085620eMC.LJI != f) {
                        break;
                    }
                }
                c1085620eMC.LJFF = list;
                c1085620eMC.LJI = f;
                ((C1099820ej6) view).LIZ(c1085620eMC.LIZ(c946210ajL2.LIZ), c946210ajL2.LIZIZ);
                c1085620eMC.LIZIZ = null;
            } else {
                c1085620eMC.LJFF = list;
                c1085620eMC.LJI = f;
                ((C1099820ej6) view).LIZ(c1085620eMC.LIZ(c946210ajL2.LIZ), c946210ajL2.LIZIZ);
                c1085620eMC.LIZIZ = null;
            }
        }
        return Unit.LIZ;
    }
}
