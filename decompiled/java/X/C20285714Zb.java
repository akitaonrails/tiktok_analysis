package X;

import android.view.View;
import com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import kotlin.jvm.internal.AwS26S0100001_30;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Zb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20285714Zb {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Integer] */
    public static void LIZ(C20286814Zm c20286814Zm, float f, boolean z) {
        final CellAdaptionComponentAbility cellAdaptionComponentAbility;
        int iIntValue;
        AdaptionPaddingValues adaptionPaddingValuesNs0;
        T tValueOf = 0;
        tValueOf = 0;
        if (c20286814Zm != null) {
            cellAdaptionComponentAbility = c20286814Zm.LJIIIIZZ;
        } else {
            cellAdaptionComponentAbility = null;
        }
        final AwS26S0100001_30 awS26S0100001_30 = new AwS26S0100001_30(c20286814Zm, f, 8);
        final C259800zU c259800zU = new C259800zU();
        if (cellAdaptionComponentAbility != null && (adaptionPaddingValuesNs0 = cellAdaptionComponentAbility.Ns0()) != null) {
            tValueOf = Integer.valueOf(adaptionPaddingValuesNs0.getTop());
        }
        c259800zU.element = tValueOf;
        if (z) {
            c259800zU.element = 0;
        }
        Integer num = (Integer) c259800zU.element;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        awS26S0100001_30.invoke(Integer.valueOf(iIntValue));
        if (cellAdaptionComponentAbility != null) {
            cellAdaptionComponentAbility.aW0(new InterfaceC20561815d2<VideoAdaptionResult>() { // from class: X.14Zc
                @Override // X.InterfaceC20561815d2
                public final void LIZ(C0RAA c0raa) {
                    Integer numValueOf;
                    AdaptionPaddingValues adaptionPaddingValuesNs02 = cellAdaptionComponentAbility.Ns0();
                    if (adaptionPaddingValuesNs02 != null && (numValueOf = Integer.valueOf(adaptionPaddingValuesNs02.getTop())) != null && !Intrinsics.LJFF(numValueOf, c259800zU.element)) {
                        awS26S0100001_30.invoke(numValueOf);
                    }
                }
            }, false);
        }
    }

    public static void LIZIZ(View view, C20286814Zm c20286814Zm, int i, int i2) {
        ScreenAdaptionResult screenAdaptionResult;
        AwS574S0100000_30 awS574S0100000_30;
        int height;
        int i3;
        if (c20286814Zm != null && (awS574S0100000_30 = c20286814Zm.LJII) != null) {
            screenAdaptionResult = (ScreenAdaptionResult) awS574S0100000_30.invoke();
            if (screenAdaptionResult != null) {
                int screenInsetByTop = screenAdaptionResult.getScreenInsetByTop();
                C1914407eg.LIZ.getClass();
                int iLIZ = screenInsetByTop + C1914407eg.LIZ();
                if (view != null) {
                    height = view.getHeight();
                } else {
                    height = 0;
                }
                if (C0HCN.LIZJ()) {
                    i3 = 108;
                } else {
                    i3 = 160;
                }
                int i4 = (int) ((((double) ((i2 - iLIZ) - i)) * 0.26d) + ((double) iLIZ));
                float fLIZIZ = (((height / 2.0f) - i4) - 0) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))) / 2);
                if (view != null) {
                    C0H1U.LJIIJ(i4, view);
                }
                LIZ(c20286814Zm, fLIZIZ, false);
                return;
            }
        } else {
            screenAdaptionResult = null;
        }
        AbstractC1879030yzt.LIZ(new AwS556S0100000_12(screenAdaptionResult, 835));
    }
}
