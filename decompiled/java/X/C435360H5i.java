package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS617S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.0H5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.shortcut.ShortcutAddGuideDialogTask$showPopup$7$iconTask$1", f = "ShortcutAddGuideDialogTask.kt", l = {137}, m = "invokeSuspend")
public final class C435360H5i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ C20661615t8 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435360H5i(C20661615t8 c20661615t8, InterfaceC1364105Vn<? super C435360H5i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20661615t8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C435360H5i(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShortcutAddGuideDialogTask@b7d6.showPopup$7$iconTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C20661615t8 c20661615t8 = this.LLILLJJLI;
            this.LL = 1;
            c20661615t8.getClass();
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C816050Vzn c816050VznLIZLLL = ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LIZLLL(c20661615t8.LLILLL);
            if (c816050VznLIZLLL != null) {
                c816050VznLIZLLL.LJ(new AwS617S0100000_3(c2252611DEt, 34));
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShortcutAddGuideDialogTask@b7d6.showPopup$7$iconTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ShortcutAddGuideDialogTask@b7d6.showPopup$7$iconTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
