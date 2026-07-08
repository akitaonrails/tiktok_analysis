package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0YmU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.page.handle.ChatListPageHandle$loadMore$1", f = "ChatListPageHandle.kt", l = {}, m = "invokeSuspend")
public final class C884240YmU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C884270YmX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884240YmU(C884270YmX c884270YmX, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c884270YmX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884240YmU(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLJFF;
        C1C7U.LIZ("ChatListPageHandle@454a.loadMore$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!Intrinsics.LJFF(this.LL, "auto_load_one_more_page")) {
            C884270YmX c884270YmX = this.LLILLJJLI;
            c884270YmX.LJJIJ = c884270YmX.LJIIL().size() + this.LLILLJJLI.LIZ.LJIIL().LJFF;
        }
        C884270YmX c884270YmX2 = this.LLILLJJLI;
        List<Pair<InterfaceC884250YmV, InterfaceC878560YdK>> list = c884270YmX2.LIZIZ;
        String str = this.LL;
        for (Pair<InterfaceC884250YmV, InterfaceC878560YdK> pair : list) {
            InterfaceC884250YmV first = pair.getFirst();
            InterfaceC878560YdK second = pair.getSecond();
            C877600Ybm c877600Ybm = c884270YmX2.LJJIIZ.LIZIZ;
            if (!c884270YmX2.LIZ.LJIIL().LJII) {
                iLJFF = second.LJFF();
            } else {
                int i = c884270YmX2.LJJIIZI;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            iLJFF = -1;
                        } else {
                            iLJFF = 5000;
                        }
                    } else {
                        iLJFF = LSPassThroughRecordSizeConfig.DEFAULT;
                    }
                } else {
                    iLJFF = 100;
                }
            }
            first.LJI(second, c877600Ybm, iLJFF, str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListPageHandle@454a.loadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
