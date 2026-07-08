package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import com.ss.android.ugc.aweme.publish.detail.EffectPublishOldFuncAssem;
import com.ss.android.ugc.aweme.publish.detail.EffectPublishPkgSizeMonitorAssem;
import kotlin.Pair;
import kotlin.jvm.internal.AwS392S0200000_26;

/* JADX INFO: renamed from: X.0wJK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775760wJK extends C19IN {
    public final int $t;
    public Object l0;

    @Override // X.C19IN
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775760wJK(EffectPublishOldFuncAssem effectPublishOldFuncAssem, int i) {
        super(800, true);
        this.$t = i;
        this.l0 = effectPublishOldFuncAssem;
    }

    public static final void LIZ$0(C1775760wJK c1775760wJK, View view) {
        EffectPublishPkgSizeMonitorAssem effectPublishPkgSizeMonitorAssem = (EffectPublishPkgSizeMonitorAssem) c1775760wJK.l0;
        AssemVMLazy assemVMLazy = effectPublishPkgSizeMonitorAssem.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = EffectPublishPkgSizeMonitorAssem.LLJJJ;
        C1737910vKH.LIZ("ame_publish_pkgexceed_reedit_click", C2097608Jq.LJIIIIZZ(new Pair("package_size", String.valueOf(((C1736830vIX) assemVMLazy.getValue().getState()).LLJJIII)), new Pair("max_size", String.valueOf(effectPublishPkgSizeMonitorAssem.hp()))));
        ((EffectEditVM) ((EffectPublishPkgSizeMonitorAssem) c1775760wJK.l0).LLJJIII.getValue()).HQ2();
    }

    public static final void LIZ$1(C1775760wJK c1775760wJK, View view) {
        EffectPublishOldFuncAssem effectPublishOldFuncAssem = (EffectPublishOldFuncAssem) c1775760wJK.l0;
        effectPublishOldFuncAssem.getClass();
        C201955140j.LJIILL(C830690WiJ.LIZIZ, "AmeEffectPublisher", "OldFuncAssem handleSubmit");
        C19EG c19egLIZ = C724240Sb0.LIZ(effectPublishOldFuncAssem);
        if (c19egLIZ != null) {
            int i = C1735710vGj.LIZ[effectPublishOldFuncAssem.hp().mode.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    effectPublishOldFuncAssem.ip().GQ2(C0XF1.LIZLLL(c19egLIZ));
                    return;
                }
                throw new C1954807lC();
            }
            C1397580mTM c1397580mTM = new C1397580mTM(c19egLIZ);
            c1397580mTM.LJI(c19egLIZ.getString(2131833778));
            c1397580mTM.LIZ(2131833777);
            C985403tE.LIZ(c1397580mTM, new AwS392S0200000_26(effectPublishOldFuncAssem, c19egLIZ, 81));
            new C1397510mTF(c1397580mTM).LJ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775760wJK(EffectPublishPkgSizeMonitorAssem effectPublishPkgSizeMonitorAssem, int i) {
        super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
        this.$t = i;
        this.l0 = effectPublishPkgSizeMonitorAssem;
    }
}
