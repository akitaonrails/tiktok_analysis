package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorDetailDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.14iZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20341314iZ extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PlaybookAnchorDetailDialog LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20341314iZ(C20382714pF c20382714pF, PlaybookAnchorDetailDialog playbookAnchorDetailDialog, AwS575S0100000_31 awS575S0100000_31) {
        super(1);
        this.LL = playbookAnchorDetailDialog;
        this.LLILLJJLI = awS575S0100000_31;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        PlaybookAnchorDetailDialog playbookAnchorDetailDialog = this.LL;
        Function0<Unit> function0 = this.LLILLJJLI;
        playbookAnchorDetailDialog.close(1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clickRemove result:");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LIZIZ("PlaybookAnchorDetailDialog", C2188811AlT.LIZIZ(sbLIZ));
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
