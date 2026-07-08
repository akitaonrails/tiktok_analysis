package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.ui.viewholder.DynamicViewHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PUS, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PUS implements InterfaceC648220Pbg {
    public final C648160Pba LL;
    public C0PU6 LLILLJJLI;

    @Override // X.InterfaceC648220Pbg
    public final void LIZ() {
    }

    @Override // X.InterfaceC648220Pbg
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC648220Pbg
    public final void LIZJ() {
    }

    @Override // X.InterfaceC648220Pbg
    public final void bind() {
        IECommerceService iECommerceService;
        Context contextLIZ;
        View view;
        ClickSearchViewModel clickSearchViewModelLIZ;
        String str;
        View view2;
        ISearchContextAbility iSearchContextAbilityLIZ;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        DynamicPatch dynamicPatchLIZIZ = C647320PaE.LIZIZ(this.LL);
        c649470Pdh.getClass();
        if (C649470Pdh.LJIJJLI(dynamicPatchLIZIZ) && (clickSearchViewModelLIZ = this.LL.LJII.LIZ()) != null) {
            C0PU6 c0pu6LIZ = this.LLILLJJLI;
            if (c0pu6LIZ == null) {
                c0pu6LIZ = C0PUA.LIZ(clickSearchViewModelLIZ);
            }
            this.LLILLJJLI = c0pu6LIZ;
            DynamicViewHolder dynamicViewHolderLIZLLL = C647320PaE.LIZLLL(this.LL);
            if (dynamicViewHolderLIZLLL == null || (view2 = dynamicViewHolderLIZLLL.itemView) == null || (iSearchContextAbilityLIZ = C0Q3E.LIZ(view2)) == null || (c0pcyPh1 = iSearchContextAbilityLIZ.Ph1()) == null || (c0prc = (C0PRC) c0pcyPh1.LIZJ()) == null || (str = c0prc.LLIZLLLIL) == null) {
                str = "";
            }
            C0PU6 c0pu6 = this.LLILLJJLI;
            if (c0pu6 != null) {
                c0pu6.LIZ(-1, null, str);
            }
        }
        Map<String, Object> mapLIZ = this.LL.LJ.LIZ();
        if (mapLIZ == null || !Intrinsics.LJFF(mapLIZ.get("rank"), 0) || !C649470Pdh.LJIJJLI(C647320PaE.LIZIZ(this.LL)) || (iECommerceService = (IECommerceService) PluggableExtentionKt.pluggableSpi$default(IECommerceService.class, false, false, false, 14, null)) == null) {
            return;
        }
        DynamicViewHolder dynamicViewHolderLIZLLL2 = C647320PaE.LIZLLL(this.LL);
        if (dynamicViewHolderLIZLLL2 == null || (view = dynamicViewHolderLIZLLL2.itemView) == null || (contextLIZ = view.getContext()) == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        iECommerceService.prefetchPdpResource("", contextLIZ, 6, true, null);
    }

    public C0PUS(C648160Pba c648160Pba) {
        this.LL = c648160Pba;
    }
}
