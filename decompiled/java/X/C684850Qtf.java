package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.pov.ISearchPovCardAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video.SearchVideoDocItemCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qtf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684850Qtf extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ SearchVideoDocItemCell LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C684850Qtf(SearchVideoDocItemCell searchVideoDocItemCell, String str) {
        super(2);
        this.LL = searchVideoDocItemCell;
        this.LLILLJJLI = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        Integer numValueOf;
        Aweme aweme;
        ISearchPovCardAbility iSearchPovCardAbility;
        ISearchPovCardAbility iSearchPovCardAbility2;
        if (this.LL.itemView == view && Intrinsics.LJFF(this.LLILLJJLI, str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("expose item, index is ");
            C684840Qte c684840Qte = (C684840Qte) this.LL.getItem();
            if (c684840Qte != null) {
                numValueOf = Integer.valueOf(c684840Qte.LLILLJJLI);
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            C684840Qte c684840Qte2 = (C684840Qte) this.LL.getItem();
            if (c684840Qte2 != null && (aweme = c684840Qte2.LL) != null) {
                SearchVideoDocItemCell searchVideoDocItemCell = this.LL;
                InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(searchVideoDocItemCell);
                if (interfaceC665370Q7zLIZ != null && (iSearchPovCardAbility2 = (ISearchPovCardAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, ISearchPovCardAbility.class, null)) != null) {
                    iSearchPovCardAbility2.Uz2(aweme, "video");
                }
                InterfaceC665370Q7z interfaceC665370Q7zLIZ2 = C1196320hEk.LIZ(searchVideoDocItemCell);
                if (interfaceC665370Q7zLIZ2 != null && (iSearchPovCardAbility = (ISearchPovCardAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ2, ISearchPovCardAbility.class, null)) != null) {
                    iSearchPovCardAbility.aO2(aweme);
                }
            }
        }
        return Unit.LIZ;
    }
}
