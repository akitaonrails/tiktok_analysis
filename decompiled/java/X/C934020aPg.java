package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService;
import com.bytedance.android.livesdk.dataChannel.RustArchEnableEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS29S0001000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0aPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934020aPg {
    public static final C934020aPg LIZ;
    public static final List<TextView> LIZIZ;

    static {
        C934020aPg c934020aPg = new C934020aPg();
        LIZ = c934020aPg;
        LIZIZ = new ArrayList();
        if (C952600ate.LIZ) {
            DataChannelGlobal.LLILZ.DQ2(RustArchEnableEvent.class, c934020aPg, AFwS250S0000000_15.get$arr$(263));
        }
    }

    public static void LIZIZ(int i) {
        if (!C952600ate.LIZ) {
            return;
        }
        C500260Jjc.LJJJLIIL(LIZIZ, new AwS29S0001000_15(i, 14));
    }

    public static void LIZJ(int i, boolean z) {
        int i2;
        List<TextView> list = LIZIZ;
        ArrayList<TextView> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (Intrinsics.LJFF(((View) obj).getTag(), Integer.valueOf(i))) {
                arrayList.add(obj);
            }
        }
        for (TextView textView : arrayList) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LLIL(textView, i2);
        }
        C20441214yg.LIZIZ("rust_TipBehavior", "on rust arch tip changed: [" + i + "] -> " + z);
    }

    public static void LIZ(int i, View view, boolean z) {
        ViewGroup viewGroup;
        float f;
        List listLJJLIIIJILLIZJL;
        ViewGroup viewGroup2;
        if (!C952600ate.LIZ) {
            return;
        }
        ViewParent parent = null;
        if (view != null) {
            parent = view.getParent();
        }
        if ((parent instanceof FrameLayout) && (viewGroup = (ViewGroup) parent) != null) {
            View viewFindViewWithTag = viewGroup.findViewWithTag(Integer.valueOf(i));
            View view2 = viewFindViewWithTag;
            if (viewFindViewWithTag == null) {
                C20743416Fc c20743416Fc = new C20743416Fc(view.getContext());
                c20743416Fc.setTextAppearance(R.style.a72);
                c20743416Fc.setText("®");
                c20743416Fc.setTag(Integer.valueOf(i));
                C786410Ut5.LLJJJJLIIL(c20743416Fc, 4);
                ((ArrayList) LIZIZ).add(c20743416Fc);
                view2 = c20743416Fc;
            }
            if (C500260Jjc.LJIJ(DataChannelGlobal.LLILZ) && z) {
                f = 8.0f;
            } else {
                f = 3.0f;
            }
            float f2 = -C497740JfY.LIZIZ(f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view2);
            view2.setTranslationY(f2);
            if (i == 4) {
                float fLIZIZ = C497740JfY.LIZIZ(3.0f);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view2);
                view2.setTranslationX(fLIZIZ);
            }
            if (Intrinsics.LJFF(view2.getParent(), viewGroup)) {
                return;
            }
            ViewParent parent2 = view2.getParent();
            if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                C786410Ut5.LJJJLZIJ(view2, viewGroup2);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getLayoutParams());
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.gravity = 51;
            viewGroup.addView(view2, layoutParams);
            ILinkCoreService iLinkCoreService = (ILinkCoreService) C1161920gLG.LIZJ(ILinkCoreService.class);
            view.getContext();
            String strVM2 = iLinkCoreService.vM2();
            if (strVM2 == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strVM2, new String[]{"_@_"}, 0, 6)) == null) {
                listLJJLIIIJILLIZJL = C13BV.INSTANCE;
            }
            if (listLJJLIIIJILLIZJL.size() < 2) {
                return;
            }
            C934020aPg c934020aPg = LIZ;
            boolean z2 = Boolean.parseBoolean((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
            c934020aPg.getClass();
            LIZJ(4, z2);
            LIZJ(2, Boolean.parseBoolean((String) ListProtector.get(listLJJLIIIJILLIZJL, 1)));
            return;
        }
        C20441214yg.LJIIL("rust_TipBehavior", "bind rust arch tip failed");
    }
}
