package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS195S1100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246020iWu {
    public static final void LIZ(View view) {
        if (C500260Jjc.LJJJJIZL(view)) {
            return;
        }
        C500260Jjc.LLFFF(view);
        if (view != null) {
            C12C5.LIZIZ(view, 0L, 0.0f, null, 7);
        }
    }

    public static final String LIZIZ(long j) {
        int i = (int) j;
        return C786410Ut5.k4(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
    }

    public static final void LIZJ(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("popup_type", "auto_post");
        linkedHashMap.put("enter_from", str);
        if (str2.length() > 0) {
            linkedHashMap.put("click_type", str2);
        }
        linkedHashMap.put("action_type", str3);
        C485260J1g.LIZ.getClass();
        C20684815ws.LJIILLIIL("livesdk_live_anchor_highlight_element_popup", linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.intro.TuxPanel] */
    public static final void LIZLLL(final String str, Context context, FragmentManager fragmentManager, Function0<Unit> function0) {
        final C259800zU c259800zU = new C259800zU();
        C1391960mKI c1391960mKI = new C1391960mKI();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.f625yd;
        c1391960mKI.LIZLLL = c0hti.LIZ(context);
        c1391960mKI.LJI = 3;
        c1391960mKI.LJII = C497740JfY.LJIJI(2131851289);
        c1391960mKI.LJIIIZ = C13LQ.LJJLL(new C1391890mKB[]{new C1391890mKB(C497740JfY.LJIJI(2131851287), Integer.valueOf(R.raw.icon_playlist_2), null, 4), new C1391890mKB(C497740JfY.LJIJI(2131851288), Integer.valueOf(R.raw.icon_post), null, 4)});
        c1391960mKI.LIZ = true;
        c1391960mKI.LIZIZ(C497740JfY.LJIJI(2131851286), new AwS195S1100000_19((Function0) function0, (Function0<Unit>) str, (String) 4));
        ?? r1 = c1391960mKI.LIZ().LIZ;
        r1.LLJI = true;
        r1.LLIZLLLIL = true;
        r1.LLILZIL = new DialogInterface.OnDismissListener() { // from class: X.0iWd
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractC439520HLi abstractC439520HLi;
                AbstractC439520HLi abstractC439520HLi2;
                String str2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tuxPanel dismiss, reason: ");
                TuxPanel tuxPanel = c259800zU.element;
                C439540HLk c439540HLk = null;
                if (tuxPanel != null) {
                    abstractC439520HLi = tuxPanel.LLJILLL;
                } else {
                    abstractC439520HLi = null;
                }
                sbLIZ.append(abstractC439520HLi);
                C20441214yg.LIZIZ("AutoPostLivingUtils", C2188811AlT.LIZIZ(sbLIZ));
                TuxPanel tuxPanel2 = c259800zU.element;
                if (tuxPanel2 != null) {
                    abstractC439520HLi2 = tuxPanel2.LLJILLL;
                } else {
                    abstractC439520HLi2 = null;
                }
                if (Intrinsics.LJFF(abstractC439520HLi2, C439530HLj.LIZ)) {
                    str2 = "cancel";
                } else {
                    TuxPanel tuxPanel3 = c259800zU.element;
                    if (tuxPanel3 != null) {
                        c439540HLk = tuxPanel3.LLJJ;
                    }
                    if (Intrinsics.LJFF(c439540HLk, C439540HLk.LIZ)) {
                        str2 = "blank";
                    } else {
                        str2 = "";
                    }
                }
                if (str2.length() > 0) {
                    C1246020iWu.LIZJ(str, str2, "click");
                }
            }
        };
        c259800zU.element = r1;
        r1.show(fragmentManager, "AutoPostLivingGuideSheet");
        LIZJ(str, "", "show");
    }
}
