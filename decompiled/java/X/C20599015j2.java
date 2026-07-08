package X;

import com.ss.android.ugc.aweme.assem.ToolsActivityAssem;
import com.ss.android.ugc.aweme.base.MainDialogAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15j2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20599015j2 extends C09AY implements Function1<Boolean, Void> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ ToolsActivityAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20599015j2(C19EG c19eg, ToolsActivityAssem toolsActivityAssem) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = toolsActivityAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Void invoke(Boolean bool) {
        String landingTab;
        boolean z;
        boolean z2;
        boolean zBooleanValue = bool.booleanValue();
        if (!((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig().isRecording()) {
            RecordConfig recordConfig = (RecordConfig) this.LL.getIntent().getSerializableExtra("EXTRA_AV_RECORD_CONFIG");
            if (recordConfig != null) {
                landingTab = recordConfig.getLandingTab();
            } else {
                landingTab = null;
            }
            if (Intrinsics.LJFF(landingTab, "editor_tab") && ((Boolean) C280410Ayt.LIZ.getValue()).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            boolean booleanExtra = this.LL.getIntent().getBooleanExtra("is_ep_deeplink", false);
            if (!z && !booleanExtra) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (zBooleanValue) {
                if (!z2) {
                    this.LLILLJJLI.LL = true;
                    if (C297720Bli.LIZ()) {
                        MainDialogAbility mainDialogAbilityHo = this.LLILLJJLI.ho();
                        if (mainDialogAbilityHo != null) {
                            mainDialogAbilityHo.QD();
                        }
                    } else {
                        ((MainDialogAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this.LLILLJJLI), MainDialogAbility.class)).QD();
                        return null;
                    }
                }
            } else {
                if (z2) {
                }
                this.LLILLJJLI.fo(this.LL.getIntent(), this.LL.getIntent().getBooleanExtra("enter_record_from_other_platform", false));
                if (C298240BmY.LIZ() && !C298170BmR.LIZ() && !z2) {
                    ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().deleteUselessCheckPointFile();
                    return null;
                }
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().saveCheckPointToDraft(this.LL, 32);
            this.LLILLJJLI.fo(this.LL.getIntent(), this.LL.getIntent().getBooleanExtra("enter_record_from_other_platform", false));
            if (C298240BmY.LIZ()) {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().deleteUselessCheckPointFile();
                return null;
            }
        }
        return null;
    }
}
