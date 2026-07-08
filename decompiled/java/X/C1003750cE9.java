package X;

import android.app.Activity;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.component.nativeendlayercomponent.model.NativeEndLayerDataModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS67S1000000_16;

/* JADX INFO: renamed from: X.0cE9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003750cE9 {
    public static final void LIZ(ViewOnClickListenerC1003740cE8 viewOnClickListenerC1003740cE8, String str) {
        Fragment fragment;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        System.currentTimeMillis();
        FrameLayout frameLayout = viewOnClickListenerC1003740cE8.LLJZIJLIL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        InterfaceC1034470d1h interfaceC1034470d1h = viewOnClickListenerC1003740cE8.LLLIIL;
        if (interfaceC1034470d1h == null) {
            return;
        }
        interfaceC1034470d1h.LLLIL(str);
        Object obj = viewOnClickListenerC1003740cE8.LLLIIL;
        if ((obj instanceof Fragment) && (fragment = (Fragment) obj) != null) {
            Activity activity = viewOnClickListenerC1003740cE8.getActivity();
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LJIIZILJ(fragment);
                c19ehLJIIJ.LJIIJ();
            }
        }
        viewOnClickListenerC1003740cE8.LLLIIL = null;
        C1003810cEF c1003810cEF = viewOnClickListenerC1003740cE8.LLLF;
        if (c1003810cEF != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1003810cEF, null);
            c1003810cEF.removeAllViews();
        }
    }

    public static final void LIZIZ(ViewOnClickListenerC1003740cE8 viewOnClickListenerC1003740cE8, String str) {
        viewOnClickListenerC1003740cE8.LLILLL.LJIJ(new C991660bue(viewOnClickListenerC1003740cE8.LL.type), viewOnClickListenerC1003740cE8);
        C1003720cE6 c1003720cE6 = (C1003720cE6) viewOnClickListenerC1003740cE8.LLLILZLLLI.getValue();
        c1003720cE6.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) c1003720cE6.LIZLLL.getValue(), new AwS67S1000000_16(str, 48));
        LIZ(viewOnClickListenerC1003740cE8, "endlayer_close_dealloc");
    }

    public static final void LIZJ(ViewOnClickListenerC1003740cE8 viewOnClickListenerC1003740cE8, int i) {
        String str;
        AnoleLogInfo anoleLogInfo;
        String str2;
        AnoleLogInfo anoleLogInfo2;
        viewOnClickListenerC1003740cE8.LLILLL.LJIJ(new C989550brF(new C1003790cED()), viewOnClickListenerC1003740cE8);
        InterfaceC1014270cV7 interfaceC1014270cV7 = viewOnClickListenerC1003740cE8.LLILLL;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(EnumC1005330cGh.ENTER_FROM.getRName(), Integer.valueOf(i)), new Pair(EnumC1005330cGh.REPORT_CLICK.getRName(), Boolean.FALSE));
        String rName = EnumC1005330cGh.FIXED_REFER.getRName();
        NativeEndLayerDataModel nativeEndLayerDataModelLJJ = viewOnClickListenerC1003740cE8.LJJ();
        String str3 = "";
        if (nativeEndLayerDataModelLJJ == null || (anoleLogInfo2 = nativeEndLayerDataModelLJJ.logInfo) == null || (str = anoleLogInfo2.refer) == null) {
            str = "";
        }
        mapLJIIJ.put(rName, str);
        String rName2 = EnumC1005330cGh.FIXED_TAG.getRName();
        NativeEndLayerDataModel nativeEndLayerDataModelLJJ2 = viewOnClickListenerC1003740cE8.LJJ();
        if (nativeEndLayerDataModelLJJ2 != null && (anoleLogInfo = nativeEndLayerDataModelLJJ2.logInfo) != null && (str2 = anoleLogInfo.tag) != null) {
            str3 = str2;
        }
        mapLJIIJ.put(rName2, str3);
        mapLJIIJ.put(EnumC1005330cGh.COMPONENT_TYPE.getRName(), EnumC1008920cMU.NATIVE_END_LAYER.getType());
        interfaceC1014270cV7.LJIJ(new C991670buf(mapLJIIJ), viewOnClickListenerC1003740cE8);
        LIZ(viewOnClickListenerC1003740cE8, "jump_target_dealloc");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(X.ViewOnClickListenerC1003740cE8 r7, com.ss.android.ugc.aweme.component.nativeendlayercomponent.model.NativeEndLayerDataModel r8) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1003750cE9.LJ(X.0cE8, com.ss.android.ugc.aweme.component.nativeendlayercomponent.model.NativeEndLayerDataModel):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04bb  */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(final X.ViewOnClickListenerC1003740cE8 r26, com.ss.android.ugc.aweme.component.nativeendlayercomponent.model.NativeEndLayerDataModel r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1003750cE9.LIZLLL(X.0cE8, com.ss.android.ugc.aweme.component.nativeendlayercomponent.model.NativeEndLayerDataModel, boolean):void");
    }
}
