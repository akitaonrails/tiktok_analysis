package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xmt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.ui.actions.InboxSortOrderDebugAction$doAction$1$1", f = "ActionSheetItemsNew.kt", l = {}, m = "invokeSuspend")
public final class C859010Xmt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C877470YbZ LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859010Xmt(C877470YbZ c877470YbZ, String str, InterfaceC1364105Vn<? super C859010Xmt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c877470YbZ;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859010Xmt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSortOrderDebugAction@c5b8.doAction$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C0DHG.LIZ() && C1388190mED.LIZ(this.LL.LL) != null) {
            C632670Orh.LIZIZ(this.LL.LL, new C19719212De(1898207437, new C1054000dXC(this.LLILLJJLI), true));
        } else {
            C1397580mTM c1397580mTM = new C1397580mTM(this.LL.LL);
            c1397580mTM.LJI("debug info for RD");
            c1397580mTM.LIZIZ(this.LLILLJJLI);
            c1397580mTM.LJII = true;
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSortOrderDebugAction@c5b8.doAction$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
