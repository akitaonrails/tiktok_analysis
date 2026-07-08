package X;

import android.R;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.friendstab.ui.input.FriendsTextPublishKeyboardFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0mPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395330mPj {
    public static final List<C1389910mGz> LIZ = new ArrayList();

    public static boolean LIZIZ() {
        return ((Boolean) C0AIH.LIZ.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.ss.android.ugc.aweme.friendstab.ui.input.FriendsTextPublishKeyboardFragment] */
    public static void LIZ(C19EG c19eg, String str) {
        int childCount;
        View childAt;
        if (c19eg == null) {
            return;
        }
        FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
        ViewGroup viewGroup = (ViewGroup) c19eg.findViewById(R.id.content);
        if (viewGroup != null) {
            childCount = viewGroup.getChildCount();
        } else {
            childCount = 0;
        }
        boolean z = false;
        int i = -1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (viewGroup != null && (childAt = viewGroup.getChildAt(i2)) != null && childAt.getId() == com.zhiliaoapp.musically.R.id.imy) {
                i = i2;
                z = true;
            }
        }
        if (z && viewGroup != null) {
            C786410Ut5.LJJLIL(i, viewGroup);
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = supportFragmentManager.LJJJJZI("single_keyboard_text_publish");
        View viewFindViewById = c19eg.findViewById(com.zhiliaoapp.musically.R.id.imy);
        if (c259800zU.element != 0) {
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIIZILJ((Fragment) c259800zU.element);
            c19ehLJIIJ.LJIIJ();
        }
        if (viewFindViewById == null) {
            FrameLayout frameLayout = new FrameLayout(c19eg);
            frameLayout.setId(com.zhiliaoapp.musically.R.id.imy);
            if (viewGroup != null) {
                viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        C1395370mPn c1395370mPn = FriendsTextPublishKeyboardFragment.LLJJJ;
        C1395350mPl c1395350mPl = new C1395350mPl("homepage_friends", str, "text_publish");
        c1395370mPn.getClass();
        c259800zU.element = new FriendsTextPublishKeyboardFragment(c1395350mPl);
        AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(c259800zU, (C259800zU<Fragment>) 309);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.a1b);
        GradientDrawable gradientDrawable = (GradientDrawable) c384050F3z.LIZ(c19eg);
        Integer numLIZJ = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a1b, c19eg);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = null;
        tuxSheet.LLJJJ = null;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJLILLLLZIIL = false;
        tuxSheet2.LLJI = numLIZJ;
        tuxSheet2.LLJIJIL = gradientDrawable;
        awS600S0100000_21.invoke(c1390920mIc);
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
        if (c19egLIZIZ != null) {
            tuxSheet3.show(c19egLIZIZ.getSupportFragmentManager(), "single_keyboard_text_publish");
        }
    }
}
