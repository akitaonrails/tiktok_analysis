package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterEntranceXmlOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12OB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12OB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C12OA LL;
    public final /* synthetic */ C12O8 LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12OB(C12OA c12oa, C12O8 c12o8, int i) {
        super(0);
        this.LL = c12oa;
        this.LLILLJJLI = c12o8;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object next;
        C12O8 c12o8;
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannelLJI = this.LL.LJI();
        c1102070emj.getClass();
        if (C1102070emj.LJIIIIZZ(dataChannelLJI, 4, 0, 0)) {
            C12OA c12oa = this.LL;
            C12OI c12oi = c12oa.LJIIL;
            if (c12oi != null) {
                int i = this.LLILLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("current consume: ");
                sbLIZ.append(c12oi.getScene());
                C20441214yg.LIZIZ("MainFrame#LC", C2188811AlT.LIZIZ(sbLIZ));
                C1102070emj.LJIIL(c12oa.LJI(), i, c12oi.LIZ);
            }
            List<C12OI> list = this.LL.LJIILIIL;
            C12O8 c12o82 = this.LLILLJJLI;
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.LJFF(((C12OI) next).LIZIZ, c12o82)) {
                    break;
                }
            }
            C12OI c12oi2 = (C12OI) next;
            if (c12oi2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("change to new Scene: ");
                sbLIZ2.append(c12oi2.getScene());
                C20441214yg.LIZIZ("MainFrame#LC", C2188811AlT.LIZIZ(sbLIZ2));
                ((ArrayList) this.LL.LJIILIIL).remove(c12oi2);
                this.LL.LJIIL = c12oi2;
            }
            if (LiveCenterEntranceXmlOptSetting.INSTANCE.enable() || LiveCenterUIStyleOptimizationSetting.INSTANCE.enable()) {
                if (c12oi2 == null && (c12o8 = this.LLILLJJLI) != null) {
                    this.LL.getClass();
                    if (C12OA.LJIIJ(c12o8)) {
                        this.LL.LJIIL = new C12OI(this.LLILLJJLI, AFwS273S0000000_29.get$arr$(365));
                    }
                }
                C12OA c12oa2 = this.LL;
                C12O8 c12o83 = this.LLILLJJLI;
                c12oa2.getClass();
                if (C12OA.LJIIJ(c12o83)) {
                    this.LL.LJJIIJ(true);
                }
            }
        }
        C12O8 c12o84 = this.LLILLJJLI;
        if (c12o84 != null) {
            c12o84.LJIILJJIL();
        }
        return Unit.LIZ;
    }
}
