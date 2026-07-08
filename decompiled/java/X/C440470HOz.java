package X;

import Y.ARunnableS75S0200000_6;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0HOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440470HOz extends C09AY implements InterfaceC1631620sYq<UIAssem, Boolean, InterfaceC440230HOb<? extends List<? extends C440440HOw>>, Unit> {
    public final /* synthetic */ MixStudioHomePageAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C440470HOz(MixStudioHomePageAssem mixStudioHomePageAssem) {
        super(3);
        this.LL = mixStudioHomePageAssem;
    }

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, Boolean bool, InterfaceC440230HOb<? extends List<? extends C440440HOw>> interfaceC440230HOb) {
        boolean z;
        int i;
        boolean zBooleanValue = bool.booleanValue();
        InterfaceC440230HOb<? extends List<? extends C440440HOw>> interfaceC440230HOb2 = interfaceC440230HOb;
        TuxIconView tuxIconView = this.LL.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView != null) {
            if (zBooleanValue && !(interfaceC440230HOb2.getState().getValue() instanceof C1372505Yt)) {
                z = true;
                i = 0;
            } else {
                z = false;
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxIconView);
            if (z) {
                C0HSG.LIZ.getClass();
                if (!C0HSG.LIZIZ().getBoolean("history_button_tooltip_shown", false)) {
                    C0HSG.LIZIZ().storeBoolean("history_button_tooltip_shown", true);
                    SpannableString spannableString = new SpannableString(tuxIconView.getContext().getString(2131835874));
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(C1383370m6R.LJFF(R.attr.a0r)), 0, spannableString.length(), 18);
                    HandlerHook.viewPost(tuxIconView, new ARunnableS75S0200000_6(tuxIconView, spannableString, 51));
                }
            }
        }
        return Unit.LIZ;
    }
}
