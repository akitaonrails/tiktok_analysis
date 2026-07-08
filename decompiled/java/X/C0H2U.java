package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntities;
import irm.AkS2S1300000_6;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: renamed from: X.0H2U, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H2U {
    public static void LIZ(C427760Gpy c427760Gpy, SourceFromEntities sourceFromEntities) {
        String str = sourceFromEntities.wording;
        if (str == null) {
            str = "";
        }
        int totalAvatarNum = sourceFromEntities.getTotalAvatarNum();
        int displayAvatarNum = sourceFromEntities.getDisplayAvatarNum();
        C665180Q7g.LIZ.getClass();
        LIZIZ(null, c427760Gpy, str, totalAvatarNum, displayAvatarNum, C665180Q7g.LIZLLL(sourceFromEntities), C07C0.LIZ());
    }

    public static void LIZJ(View view, C434640H2o c434640H2o, String str, Function0 function0) {
        if (c434640H2o != null) {
            C786410Ut5.I7(new AkS2S1300000_6(function0, c434640H2o, str, view, 0), view);
        } else if (((Boolean) C272510Am9.LIZ.getValue()).booleanValue()) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0H2V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            }, view);
        } else {
            view.setClickable(false);
        }
    }

    public static void LIZIZ(TuxTextView tuxTextView, C427760Gpy c427760Gpy, String str, int i, int i2, List list, boolean z) {
        int i3;
        int i4 = i;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        if (c427760Gpy != null) {
            int i5 = i2 + 1;
            if (i4 != i5) {
                i5 = i2;
            }
            if (i5 < 1) {
                i3 = 1;
            } else {
                i3 = i5;
            }
            c427760Gpy.setMaxImageNum(i3);
            if (i4 < 1) {
                i4 = 1;
            }
            c427760Gpy.setTotalCount(i4);
            int i6 = 0;
            int i7 = 0;
            for (Object obj : C13LP.LL(list, i5)) {
                int i8 = i7 + 1;
                if (i7 >= 0) {
                    C427720Gpu c427720Gpu = (C427720Gpu) obj;
                    C427760Gpy.LIZ(c427760Gpy, i7, new C03IT(Collections.singletonList(c427720Gpu.LIZ)), "", null, new C0ID0(0), z, new AwS372S0200000_6(c427720Gpu, c427760Gpy, 19), 248);
                    i7 = i8;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (i2 <= 0) {
                i6 = 8;
            }
            C786410Ut5.LJLLLLLL(i6, c427760Gpy);
        }
    }
}
