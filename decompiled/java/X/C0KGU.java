package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.BottomSubscribeComponent;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KGU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KGU extends C09AY implements Function2<UIAssem, EnumC513810KDb, Unit> {
    public final /* synthetic */ BottomSubscribeComponent LL;
    public final /* synthetic */ C259800zU<Function1<C0KIP, Unit>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KGU(BottomSubscribeComponent bottomSubscribeComponent, C259800zU<Function1<C0KIP, Unit>> c259800zU) {
        super(2);
        this.LL = bottomSubscribeComponent;
        this.LLILLJJLI = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, EnumC513810KDb enumC513810KDb) {
        UIAssem uIAssem2 = uIAssem;
        boolean zLJIIJ = C513940KDo.LJIIJ(enumC513810KDb);
        C0HZQ c0hzq = this.LL.LLJJIJIL;
        if (c0hzq != null) {
            c0hzq.setClickable(!zLJIIJ);
        }
        BottomSubscribeComponent bottomSubscribeComponent = this.LL;
        C16FS c16fs = bottomSubscribeComponent.LLJJIJIIJIL;
        if (c16fs != null) {
            c16fs.setClickable(!zLJIIJ);
            if (zLJIIJ) {
                C16FS c16fs2 = bottomSubscribeComponent.LLJJIJIIJIL;
                if (c16fs2 != null) {
                    c16fs2.LJ();
                }
                C736680Sv4.LJIIIIZZ(uIAssem2, this.LL.kp(), new C2217381BqS() { // from class: X.0KIJ
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C0KGF) obj).LLIZLLLIL;
                    }
                }, null, new C514870KHd(this.LLILLJJLI), 6);
            } else {
                C16FS c16fs3 = bottomSubscribeComponent.LLJJIJIIJIL;
                if (c16fs3 != null) {
                    c16fs3.LJIIL();
                }
            }
        } else if (zLJIIJ) {
            C736680Sv4.LJIIIIZZ(uIAssem2, this.LL.kp(), new C2217381BqS() { // from class: X.0KIJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0KGF) obj).LLIZLLLIL;
                }
            }, null, new C514870KHd(this.LLILLJJLI), 6);
        }
        return Unit.LIZ;
    }
}
