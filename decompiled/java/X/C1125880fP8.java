package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.event.LiveCurrentGoalGlobalData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS114S0400000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS631S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fP8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125880fP8 extends FrameLayout implements C0T8B {
    public final C16F5 LL;
    public final C16F5 LLILLJJLI;
    public final C16FV LLILLL;

    @Override // X.C0T8B
    public final boolean h() {
        return false;
    }

    public final void setupLayout(GiftPanelBanner giftPanelBanner) {
        String str;
        Text text;
        Text text2;
        C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
        ImageModel imageModel = null;
        if (giftPanelBanner != null && (text2 = giftPanelBanner.displayText) != null) {
            str = text2.key;
        } else {
            str = null;
        }
        c1124870fNVLIZJ.getClass();
        String strLIZIZ = C1124870fNV.LIZIZ(str);
        if ((strLIZIZ == null || !C500260Jjc.LJJIIZ(strLIZIZ)) && (giftPanelBanner == null || (text = giftPanelBanner.displayText) == null || (strLIZIZ = text.defaultPattern) == null)) {
            strLIZIZ = "";
        }
        if (!Intrinsics.LJFF(strLIZIZ, this.LL.getText())) {
            this.LL.setText(strLIZIZ);
        }
        C16FV c16fv = this.LLILLL;
        if (giftPanelBanner != null) {
            imageModel = giftPanelBanner.leftIcon;
        }
        C1117830fC9.LIZLLL(c16fv, imageModel, c16fv.getMeasuredWidth(), this.LLILLL.getMeasuredHeight());
        C500260Jjc.LJLIIIL(500L, this, new C020W(giftPanelBanner, this, 6));
    }

    public C1125880fP8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.goj, this);
        this.LL = (C16F5) findViewById(R.id.z3g);
        this.LLILLJJLI = (C16F5) findViewById(R.id.z5m);
        this.LLILLL = (C16FV) findViewById(R.id.l6p);
    }

    public final void LIZIZ(long j, long j2, boolean z) {
        SpannableString spannableString;
        int iIntValue;
        int iIntValue2 = 0;
        if (C497740JfY.LJJ()) {
            spannableString = new SpannableString(C786410Ut5.k4(Locale.US, "%d/%d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j)}, 2)));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ny, getContext());
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            }
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue2), String.valueOf(j2).length() + 1, spannableString.toString().length(), 33);
        } else {
            spannableString = new SpannableString(C786410Ut5.k4(Locale.US, "%d/%d", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(j2)}, 2)));
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ny, getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), 0, String.valueOf(j).length(), 33);
        }
        this.LLILLJJLI.setText(spannableString);
        if (z) {
            String string = spannableString.toString();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_goal_gift_banner_show");
            c474500IjALIZ.LJIL();
            C2639010j.LIZ(c474500IjALIZ, string);
            c474500IjALIZ.LIZ();
        }
    }

    public final void LIZ(Long l, Fragment fragment, boolean z, Function0 function0) {
        C1125920fPC c1125920fPCLJ;
        if (fragment == null) {
            return;
        }
        CopyOnWriteArrayList<C1125840fP4> copyOnWriteArrayList = C1125820fP2.LIZ;
        if (l != null && (c1125920fPCLJ = C1125820fP2.LJ(l.longValue(), C1125820fP2.LJFF())) != null) {
            LIZIZ(c1125920fPCLJ.LIZIZ, c1125920fPCLJ.LIZJ, z);
        }
        if (C1125810fP1.LIZ()) {
            C1125820fP2.LIZ(fragment, l, new AwS561S0100000_17(function0, (Function0<Unit>) 313), new AwS631S0100000_17(this, 24));
            return;
        }
        AwS631S0100000_17 awS631S0100000_17 = new AwS631S0100000_17(this, 25);
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(function0, (Function0<Unit>) 314);
        C20441214yg.LJIIIZ("LiveGoalUtils", "listenProgressChange");
        DataChannelGlobal.LLILZ.zQ2(fragment);
        DataChannelGlobal.LLILZ.BQ2(fragment, fragment, LiveCurrentGoalGlobalData.class, new AwS114S0400000_17(fragment, l, awS561S0100000_17, awS631S0100000_17, 9));
    }
}
