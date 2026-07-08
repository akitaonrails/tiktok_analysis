package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.TemplateFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bLY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969900bLY implements InterfaceC953300aum {
    public int LIZ;
    public final /* synthetic */ TemplateFragment LIZIZ;

    @Override // X.InterfaceC953300aum
    public final void onCancelSuccess() {
        Function0<Unit> function0;
        InterfaceC945610aiN interfaceC945610aiNLIZ;
        C953100auS c953100auS;
        this.LIZIZ.LLJ.notifyItemChanged(this.LIZ);
        C969920bLa c969920bLa = this.LIZIZ.LL;
        EnumC952890au7 enumC952890au7 = (c969920bLa == null || (c953100auS = c969920bLa.LIZLLL) == null) ? null : c953100auS.LIZJ;
        if (C934890aR5.LIZ() && enumC952890au7 != EnumC952890au7.PREVIEW_SETTING && enumC952890au7 != EnumC952890au7.PREVIEW_BOARD_ICON && enumC952890au7 != EnumC952890au7.PREVIEW_PLAYBOOK && enumC952890au7 != EnumC952890au7.PREVIEW_TOOLBAR_PLAYBOOK && (interfaceC945610aiNLIZ = C944400agQ.LIZ()) != null) {
            interfaceC945610aiNLIZ.LJFF(null);
        }
        if (!C934890aR5.LIZ() || (function0 = this.LIZIZ.LLJILJIL) == null) {
            return;
        }
        function0.invoke();
    }

    public C969900bLY(TemplateFragment templateFragment) {
        this.LIZIZ = templateFragment;
    }
}
