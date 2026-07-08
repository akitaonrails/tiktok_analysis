package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.shortcut.ShortcutAddGuideDialogTask$showPopup$7$imageTask$1", f = "ShortcutAddGuideDialogTask.kt", l = {136}, m = "invokeSuspend")
public final class C435340H5g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ C20661615t8 LLILLJJLI;
    public final /* synthetic */ C688120Qyw LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435340H5g(C20661615t8 c20661615t8, C688120Qyw c688120Qyw, InterfaceC1364105Vn<? super C435340H5g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20661615t8;
        this.LLILLL = c688120Qyw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C435340H5g(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShortcutAddGuideDialogTask@b7d6.showPopup$7$imageTask$1");
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
            String strLJIIL = this.LLILLJJLI.LJIIL(C960203pA.LIZIZ(this.LLILLL.LIZ));
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C1331660kl2.LJIIIZ(strLJIIL).LJJII(new C511301yx(c2252611DEt, 1));
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShortcutAddGuideDialogTask@b7d6.showPopup$7$imageTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ShortcutAddGuideDialogTask@b7d6.showPopup$7$imageTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
