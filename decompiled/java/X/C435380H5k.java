package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.shortcut.InboxShortcutGuideTrigger$onInboxNodeShow$1$isLauncherShortcutExist$1", f = "InboxShortcutGuideTrigger.kt", l = {}, m = "invokeSuspend")
public final class C435380H5k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ InterfaceC435390H5l LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435380H5k(InterfaceC435390H5l interfaceC435390H5l, InterfaceC1364105Vn<? super C435380H5k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC435390H5l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C435380H5k(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxShortcutGuideTrigger@cc51.onInboxNodeShow$1$isLauncherShortcutExist$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL.LIZIZ());
        C1C7U.LIZIZ("InboxShortcutGuideTrigger@cc51.onInboxNodeShow$1$isLauncherShortcutExist$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
