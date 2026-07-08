package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.TiktokLiveLocationBubbleSetting;
import com.bytedance.android.livesdk.locationservice.LocationServiceNotionSheet;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ik0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475020Ik0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(boolean z, boolean z2, DataChannel dataChannel) {
        String str;
        String str2;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_location_setting_toggle");
        if (z) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        c474500IjALIZ.LJIILJJIL(str);
        if (z2) {
            str2 = "toggle_on";
        } else {
            str2 = "toggle_off";
        }
        c474500IjALIZ.LJJII(str2, "toggle_status");
        if (z) {
            str3 = "anchor";
        } else {
            str3 = "viewer";
        }
        c474500IjALIZ.LJJII(str3, "user_type");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [T, X.0Ijx] */
    public static final void LIZ(final boolean z, View view, C16F5 c16f5, final CompoundButton compoundButton, View view2, final FragmentManager fragmentManager, final C20484615Do c20484615Do, final DataChannel dataChannel) {
        boolean z2;
        Boolean boolValueOf;
        String strLJIJI;
        int length;
        if (view == null) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        if (!z && TiktokLiveLocationBubbleSetting.getValue().enable) {
            c259800zU.element = new C474990Ijx();
        }
        Context context = view.getContext();
        if (view2 == null && z && (compoundButton instanceof C20743716Ff) && LiveHostSettingsUIConfig.enable()) {
            z2 = true;
        } else {
            z2 = false;
        }
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            boolValueOf = Boolean.valueOf(iHostAppContext.isLocationPermissionGranted(view.getContext()));
        } else {
            boolValueOf = null;
        }
        if (z) {
            strLJIJI = C497740JfY.LJIJI(2131855684);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131855691);
        }
        String strLJIJI2 = C497740JfY.LJIJI(2131850525);
        if (strLJIJI != null) {
            length = strLJIJI.length();
        } else {
            length = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIJI);
        sbLIZ.append(' ');
        sbLIZ.append(strLJIJI2);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        C1119920fFW.LJ(context, spannableString, length, spannableString.length(), 17, 8, 500);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezs, context)), length, spannableString.length(), 17);
        final boolean z3 = z2;
        C786410Ut5.p2(spannableString, new AbstractC1098790ehR() { // from class: X.0Ik2
            @Override // X.AbstractC431510Gw1
            public final void LIZ() {
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
            }

            @Override // X.AbstractC1098790ehR
            public final void LIZIZ(View view3) {
                String str;
                Long lValueOf;
                String str2;
                String str3;
                LiveMode liveMode;
                FragmentManager fragmentManager2 = fragmentManager;
                Boolean boolValueOf2 = null;
                if (fragmentManager2 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_anchor", z);
                    C19322110iZ.LIZLLL(fragmentManager2, LocationServiceNotionSheet.class, "location_service", null, bundle);
                } else {
                    C20484615Do c20484615Do2 = c20484615Do;
                    if (c20484615Do2 != null) {
                        c20484615Do2.LJIIIZ(LocationServiceNotionSheet.class, "location_service", null, null);
                    }
                }
                if (z3) {
                    CompoundButton compoundButton2 = compoundButton;
                    if (!(compoundButton2 instanceof C20743716Ff)) {
                        compoundButton2 = null;
                    }
                    DataChannel dataChannel2 = dataChannel;
                    if (C500260Jjc.LJJIJLIJ()) {
                        str = "live_take_page";
                    } else {
                        str = "live_take_detail";
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_setting_panel_component");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII("click_more", "action_type");
                    c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                    if (dataChannel2 != null) {
                        lValueOf = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel2));
                    } else {
                        lValueOf = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf, "room_id");
                    c474500IjALIZ.LJJII("region_label", "setting_type");
                    c474500IjALIZ.LJJII(str, "event_page");
                    if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) != null) {
                        str2 = liveMode.logStreamingType;
                    } else {
                        str2 = null;
                    }
                    c474500IjALIZ.LJJII(str2, "live_type");
                    if (compoundButton2 != null) {
                        boolValueOf2 = Boolean.valueOf(C500260Jjc.LJJJJIZL(compoundButton2));
                    }
                    if (C500260Jjc.LJJJI(boolValueOf2)) {
                        if (compoundButton2 != null && compoundButton2.isChecked()) {
                            str3 = "on";
                        } else {
                            str3 = "off";
                        }
                        c474500IjALIZ.LJJII(str3, "state");
                    }
                    c474500IjALIZ.LIZ();
                }
            }
        }, length, spannableString.length(), 17);
        if (c16f5 != null) {
            c16f5.setLinksClickable(true);
            c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            c16f5.setHighlightColor(0);
            c16f5.setText(spannableString);
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C474980Ijw(z, dataChannel, boolValueOf, view, compoundButton, c16f5, view2, z2, c259800zU, null), 2);
    }
}
