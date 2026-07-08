package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ejK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099960ejK {
    public static final /* synthetic */ int LJI = 0;
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final DataChannel LIZJ;
    public final EnumC1099930ejH LIZLLL;
    public final C01GW LJ;
    public final EnumC1102980eoC LJFF;

    public final EnumC1094650eal LIZ() {
        return (EnumC1094650eal) this.LJ.getValue();
    }

    public C1099960ejK(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        EnumC1099930ejH enumC1099930ejH;
        EnumC1102980eoC enumC1102980eoC;
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = dataChannel;
        int i = C1094670ean.LIZ[C1094720eas.LIZ(dataChannel).LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                enumC1099930ejH = EnumC1099930ejH.LANDSCAPE_ICON;
            } else {
                throw new C1954807lC();
            }
        } else if (ToolBarButtonWithTextExperiment.hasText()) {
            enumC1099930ejH = EnumC1099930ejH.ICON_WITH_TEXT;
        } else {
            enumC1099930ejH = EnumC1099930ejH.ICON;
        }
        this.LIZLLL = enumC1099930ejH;
        this.LJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 597));
        if (!C500260Jjc.LJIIZILJ(dataChannel) && !Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.FALSE)) {
            LiveToolbarIconStyleSetting liveToolbarIconStyleSetting = LiveToolbarIconStyleSetting.INSTANCE;
            if (liveToolbarIconStyleSetting.isGrayStyle()) {
                enumC1102980eoC = EnumC1102980eoC.GRAY;
            } else if (liveToolbarIconStyleSetting.isColorfulStyle()) {
                enumC1102980eoC = EnumC1102980eoC.COLORFUL;
            } else if (liveToolbarIconStyleSetting.isHighlightStyle()) {
                enumC1102980eoC = EnumC1102980eoC.HIGHLIGHT;
            } else {
                enumC1102980eoC = EnumC1102980eoC.DEFAULT;
            }
        } else {
            enumC1102980eoC = EnumC1102980eoC.DEFAULT;
        }
        this.LJFF = enumC1102980eoC;
    }
}
