package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RhF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702630RhF extends C09AY implements Function1<InterfaceC699620RcO, Unit> {
    public final /* synthetic */ List<InterfaceC1393560mMs> LL;
    public final /* synthetic */ Set<InterfaceC1393560mMs> LLILLJJLI;
    public final /* synthetic */ InterfaceC702640RhG LLILLL;
    public final /* synthetic */ List<AnchorCommonStruct> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<AnchorCommonStruct> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ AnchorCommonStruct LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C702630RhF(List<InterfaceC1393560mMs> list, Set<? extends InterfaceC1393560mMs> set, InterfaceC702640RhG interfaceC702640RhG, List<AnchorCommonStruct> list2, String str, List<AnchorCommonStruct> list3, String str2, AnchorCommonStruct anchorCommonStruct) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = set;
        this.LLILLL = interfaceC702640RhG;
        this.LLILZ = list2;
        this.LLILZIL = str;
        this.LLILZLL = list3;
        this.LLIZ = str2;
        this.LLIZLLLIL = anchorCommonStruct;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC699620RcO interfaceC699620RcO) {
        String componentKey;
        Boolean bool;
        String str;
        Map<String, ? extends Object> mapLIZJ;
        InterfaceC699620RcO interfaceC699620RcO2 = interfaceC699620RcO;
        for (InterfaceC1393560mMs interfaceC1393560mMs : this.LL) {
            AnchorCommonStruct anchorCommonStructData = interfaceC1393560mMs.data();
            if (anchorCommonStructData != null && (componentKey = anchorCommonStructData.getComponentKey()) != null) {
                boolean zContains = this.LLILLJJLI.contains(interfaceC1393560mMs);
                Boolean bool2 = Boolean.TRUE;
                String strLIZIZ = null;
                if (zContains) {
                    bool = Boolean.FALSE;
                    str = "density check failed";
                    InterfaceC702640RhG interfaceC702640RhG = this.LLILLL;
                    if (interfaceC702640RhG != null) {
                        strLIZIZ = interfaceC702640RhG.LIZIZ(componentKey);
                    }
                    mapLIZJ = C2097908Jt.LIZJ(new Pair("outreach_strategy", strLIZIZ));
                } else {
                    bool = null;
                    str = null;
                    mapLIZJ = null;
                }
                interfaceC699620RcO2.LIZLLL(componentKey, "STANDARD", bool2, null, null, null, null, null, bool, str, mapLIZJ, null, null, null, null);
            }
        }
        for (AnchorCommonStruct anchorCommonStruct : this.LLILZ) {
            String componentKey2 = anchorCommonStruct.getComponentKey();
            Boolean bool3 = Boolean.FALSE;
            interfaceC699620RcO2.LIZLLL(componentKey2, "STANDARD", bool3, "active check failed", C2097608Jq.LJIIIIZZ(new Pair("biz_active", bool3), new Pair("can_apply_slot", Boolean.TRUE)), null, null, null, null, null, null, null, null, null, null);
            interfaceC699620RcO2.LJ(anchorCommonStruct.getComponentKey(), "STANDARD", false, "decision failed", false, "inner_anchor", Collections.singletonList(this.LLILZIL), null, null, null);
        }
        List<AnchorCommonStruct> list = this.LLILZLL;
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZLLLIL;
        ArrayList<AnchorCommonStruct> arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct3 : list) {
            if (!Intrinsics.LJFF(anchorCommonStruct3, anchorCommonStruct2)) {
                arrayList.add(anchorCommonStruct3);
            }
        }
        for (AnchorCommonStruct anchorCommonStruct4 : arrayList) {
            interfaceC699620RcO2.LIZLLL(anchorCommonStruct4.getComponentKey(), "STANDARD", Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, null, null);
            interfaceC699620RcO2.LJ(anchorCommonStruct4.getComponentKey(), "STANDARD", false, "decision failed", true, "inner_anchor", Collections.singletonList(this.LLIZ), "low_priority", null, null);
        }
        String str2 = this.LLILZIL;
        if (str2 != null) {
            interfaceC699620RcO2.LJ(str2, "STANDARD", true, "decision success", true, "inner_anchor", Collections.singletonList(str2), null, null, null);
        }
        return Unit.LIZ;
    }
}
