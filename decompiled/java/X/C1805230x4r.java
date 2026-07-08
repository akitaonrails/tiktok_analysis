package X;

import Y.ACListenerS88S1100000_27;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRoomRechargeAgreementConfigSetting;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0x4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805230x4r {
    public final Context LIZ;
    public final ViewGroup LIZIZ;
    public final View LIZJ;

    public C1805230x4r(Context context, ViewGroup viewGroup) {
        this.LIZ = context;
        this.LIZIZ = viewGroup;
        LiveRoomRechargeAgreementConfigSetting liveRoomRechargeAgreementConfigSetting = LiveRoomRechargeAgreementConfigSetting.INSTANCE;
        LiveRechargeAgreementConfig value = liveRoomRechargeAgreementConfigSetting.getValue();
        value = value == null ? liveRoomRechargeAgreementConfigSetting.getDEFAULT() : value;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gcx, viewGroup, true);
        this.LIZJ = viewTd;
        TextView textView = (TextView) viewTd.findViewById(R.id.z8x);
        String str = value.agreementForGlobal;
        String strLJIJI = C497740JfY.LJIJI(2131842816);
        String strLJIJI2 = C497740JfY.LJIJI(2131842653);
        String strJ4 = C786410Ut5.j4(strLJIJI, Arrays.copyOf(new Object[]{strLJIJI2}, 1));
        SpannableString spannableString = new SpannableString(strJ4);
        try {
            C786410Ut5.p2(spannableString, new C0U3S(str, context), a0.LJJJ(strJ4, strLJIJI2, 0, false, 6), a0.LJJJ(strJ4, strLJIJI2, 0, false, 6) + strLJIJI2.length(), 17);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (textView != null) {
            textView.setText(spannableString);
            textView.setHighlightColor(C20736316Cj.LIZIZ(R.attr.exe, this.LIZ));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        LiveRoomRechargeAgreementConfigSetting liveRoomRechargeAgreementConfigSetting2 = LiveRoomRechargeAgreementConfigSetting.INSTANCE;
        LiveRechargeAgreementConfig value2 = liveRoomRechargeAgreementConfigSetting2.getValue();
        value2 = value2 == null ? liveRoomRechargeAgreementConfigSetting2.getDEFAULT() : value2;
        if (value2.isShowRechargeLawInRegion) {
            C16F5 c16f5 = (C16F5) this.LIZJ.findViewById(R.id.zly);
            C16F5 c16f52 = (C16F5) this.LIZJ.findViewById(R.id.tv_second_agreement_for_region);
            String str2 = ((LiveRechargeAgreementConfig.AgreementForRegion) ListProtector.get(value2.agreementsForRegion, 0)).lawUrl;
            if (c16f5 != null) {
                c16f5.setText(((LiveRechargeAgreementConfig.AgreementForRegion) ListProtector.get(value2.agreementsForRegion, 0)).lawName);
                C786410Ut5.l8(c16f5, new ACListenerS88S1100000_27(this, str2, 2));
            }
            String str3 = ((LiveRechargeAgreementConfig.AgreementForRegion) ListProtector.get(value2.agreementsForRegion, 1)).lawUrl;
            if (c16f52 != null) {
                c16f52.setText(((LiveRechargeAgreementConfig.AgreementForRegion) ListProtector.get(value2.agreementsForRegion, 1)).lawName);
                C786410Ut5.l8(c16f52, new ACListenerS88S1100000_27(this, str3, 3));
            }
        }
    }
}
