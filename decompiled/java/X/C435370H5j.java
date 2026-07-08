package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0H5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.shortcut.InboxShortcutGuideTrigger$onInboxNodeShow$1$isLauncherShortcutSupported$1", f = "InboxShortcutGuideTrigger.kt", l = {}, m = "invokeSuspend")
public final class C435370H5j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C435370H5j(InterfaceC1364105Vn<? super C435370H5j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C435370H5j(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxShortcutGuideTrigger@cc51.onInboxNodeShow$1$isLauncherShortcutSupported$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LIZ());
        C1C7U.LIZIZ("InboxShortcutGuideTrigger@cc51.onInboxNodeShow$1$isLauncherShortcutSupported$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C435370H5j(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
