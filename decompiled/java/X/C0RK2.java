package X;

import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RK2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RK2 extends C09AY implements Function1<C0RTB, Unit> {
    public final /* synthetic */ BaseCellTriggerComponent<C03H5> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RK2(BaseCellTriggerComponent<C03H5> baseCellTriggerComponent) {
        super(1);
        this.LL = baseCellTriggerComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTB c0rtb) {
        C0RTB c0rtb2 = c0rtb;
        c0rtb2.LLJIJIL = C1163440gNi.LIZLLL;
        c0rtb2.LLJILJIL = this.LL.LJJIJL();
        c0rtb2.LLJI = this.LL.LJJIJL().getId();
        c0rtb2.LLILZIL = C694070RKj.LIZIZ;
        c0rtb2.LLILLL = this.LL.getType();
        Pair[] pairArr = new Pair[1];
        BaseCellTriggerComponent<C03H5> baseCellTriggerComponent = this.LL;
        baseCellTriggerComponent.getClass();
        Object objLJFF = C723850SaN.LJFF(baseCellTriggerComponent, "category");
        if (objLJFF == null) {
            objLJFF = "";
        }
        pairArr[0] = new Pair("category", objLJFF);
        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Map<String, Object> mapHp = this.LL.hp();
        if (mapHp == null) {
            mapHp = C2097608Jq.LJ();
        }
        mapLJIIJ.putAll(mapHp);
        c0rtb2.LLIZLLLIL = mapLJIIJ;
        return Unit.LIZ;
    }
}
