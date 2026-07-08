package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.AccessibilitySettingsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1927907gr extends C2217421BqW implements Function1<C07V0, Unit> {
    public C1927907gr(Object obj) {
        super(1, obj, AccessibilitySettingsVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/content/cell/AccessibilitySettingsCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C07V0 c07v0) {
        C07V0 c07v02 = c07v0;
        AccessibilitySettingsVM accessibilitySettingsVM = (AccessibilitySettingsVM) this.receiver;
        accessibilitySettingsVM.getClass();
        if (c07v02 instanceof C1872307Uz) {
            accessibilitySettingsVM.vQ2(((C1872307Uz) c07v02).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
