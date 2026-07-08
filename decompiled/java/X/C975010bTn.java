package X;

import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0bTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975010bTn extends C09AY implements InterfaceC1631630sYr<EnumC919170a1j, Boolean, String, Boolean, Unit> {
    public final /* synthetic */ C974990bTl LL;
    public final /* synthetic */ InterfaceC1631630sYr<EnumC919170a1j, Boolean, String, Boolean, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C975010bTn(C974990bTl c974990bTl, InterfaceC1631630sYr<? super EnumC919170a1j, ? super Boolean, ? super String, ? super Boolean, Unit> interfaceC1631630sYr) {
        super(4);
        this.LL = c974990bTl;
        this.LLILLJJLI = interfaceC1631630sYr;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(EnumC919170a1j enumC919170a1j, Boolean bool, String str, Boolean bool2) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        LinkDialog linkDialog = this.LL.LIZIZ;
        if (linkDialog != null) {
            linkDialog.setOnDismissListener(null);
        }
        this.LLILLJJLI.invoke(enumC919170a1j, Boolean.valueOf(zBooleanValue), str, Boolean.valueOf(zBooleanValue2));
        return Unit.LIZ;
    }
}
