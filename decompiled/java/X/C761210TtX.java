package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0TtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761210TtX {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(List list) {
        int i = 0;
        if (!list.isEmpty()) {
            String strLIZIZ = InterfaceC766480U4w.LIZIZ.LIZIZ();
            String strLIZIZ2 = InterfaceC766480U4w.LIZLLL.LIZIZ();
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                if (!TextUtils.equals(strLIZIZ2, ((LiveEffect) ListProtector.get(list, i2)).LLJLL())) {
                    if (TextUtils.equals(strLIZIZ, ((LiveEffect) ListProtector.get(list, i2)).LLJLL())) {
                        InterfaceC766480U4w.LIZLLL.LJFF(((LiveEffect) ListProtector.get(list, i2)).getResourceId());
                        InterfaceC766480U4w.LJ.LJFF(((LiveEffect) ListProtector.get(list, i2)).LLJI());
                    } else {
                        i2++;
                    }
                }
                if (i2 == 0) {
                    LIZ(0, list);
                }
                i = i2;
            }
            i2 = 0;
            LIZ(0, list);
            i = i2;
        }
        LIZ(i, list);
    }

    public static void LIZ(int i, List list) {
        if (i >= 0 && i < list.size()) {
            InterfaceC766480U4w.LIZ.LJFF(Integer.valueOf(i));
            InterfaceC766480U4w.LIZIZ.LJFF(((LiveEffect) ListProtector.get(list, i)).getResourceId());
            InterfaceC766480U4w.LIZLLL.LJFF(((LiveEffect) ListProtector.get(list, i)).getResourceId());
            InterfaceC766480U4w.LJ.LJFF(((LiveEffect) ListProtector.get(list, i)).LLJI());
            if (LiveBeautySwitchSetting.INSTANCE.inExperiment()) {
                C473410IhP.LIZIZ(RunnableC761200TtW.LL);
                return;
            }
            return;
        }
        InterfaceC766480U4w.LIZ.LJFF(0);
        InterfaceC766480U4w.LIZIZ.LJFF(CardStruct.IStatusCode.DEFAULT);
        InterfaceC766480U4w.LIZLLL.LJFF(CardStruct.IStatusCode.DEFAULT);
        InterfaceC766480U4w.LJ.LJFF("");
    }
}
