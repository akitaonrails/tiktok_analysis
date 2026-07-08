package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchNestedAutoplayCardHelper;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DWE, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DWE implements InterfaceC21676519sR {
    public final HashMap<View, InterfaceC652740Piy> LL;
    public final /* synthetic */ SearchNestedAutoplayCardHelper LLILLJJLI;
    public final /* synthetic */ C259800zU<SearchServiceCenter$AutoPlayAbility> LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(RecyclerView.ViewHolder viewHolder) {
        if (!(viewHolder instanceof InterfaceC713360RyY)) {
            return;
        }
        InterfaceC652740Piy interfaceC652740Piy = null;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(C1558420qem.LIZIZ((InterfaceC713360RyY) viewHolder), SearchServiceCenter$AutoPlayAbility.class, null);
        if (searchServiceCenter$AutoPlayAbility != null && (!Intrinsics.LJFF(searchServiceCenter$AutoPlayAbility, this.LLILLL.element))) {
            SearchNestedAutoplayCardHelper searchNestedAutoplayCardHelper = this.LLILLJJLI;
            InterfaceC652740Piy interfaceC652740Piy2 = this.LL.get(viewHolder.itemView);
            if (interfaceC652740Piy2 != null) {
                interfaceC652740Piy = interfaceC652740Piy2;
            }
            C19719512Dh.LIZJ(searchNestedAutoplayCardHelper.LIZIZ()).remove(interfaceC652740Piy);
            C652820Pj6 c652820Pj6 = new C652820Pj6(searchServiceCenter$AutoPlayAbility.getDetectView(), new AwS579S0100000_35(viewHolder, 145), new AwS579S0100000_35(searchServiceCenter$AutoPlayAbility, 146));
            this.LL.put(viewHolder.itemView, c652820Pj6);
            searchNestedAutoplayCardHelper.LIZIZ().put(c652820Pj6, searchServiceCenter$AutoPlayAbility);
            searchNestedAutoplayCardHelper.LIZ();
        }
    }

    @Override // X.InterfaceC21676519sR
    public final void g5(View view) {
        RecyclerView.ViewHolder childViewHolder = this.LLILLJJLI.LL.getChildViewHolder(view);
        if (childViewHolder != null) {
            LIZ(childViewHolder);
        }
    }

    @Override // X.InterfaceC21676519sR
    public final void m3(View view) {
        InterfaceC652740Piy interfaceC652740Piy = this.LL.get(view);
        if (interfaceC652740Piy != null) {
            this.LLILLJJLI.LIZIZ().remove(interfaceC652740Piy);
        }
    }

    public C1DWE(ReusedUIAssem reusedUIAssem, final SearchNestedAutoplayCardHelper searchNestedAutoplayCardHelper, C259800zU c259800zU) {
        this.LLILLJJLI = searchNestedAutoplayCardHelper;
        this.LLILLL = c259800zU;
        try {
            C1558520qew.LJI(reusedUIAssem, SearchPlayerScope.class, new SearchServiceCenter$AutoPlayAbility.DeferredLoadNotifierAbility() { // from class: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchNestedAutoplayCardHelper$3$1
                @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility.DeferredLoadNotifierAbility
                public final void Vy0(View view) {
                    SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
                    View detectView;
                    SearchNestedAutoplayCardHelper searchNestedAutoplayCardHelper2 = searchNestedAutoplayCardHelper;
                    if (searchNestedAutoplayCardHelper2.LLILZLL && (searchServiceCenter$AutoPlayAbility = searchNestedAutoplayCardHelper2.LLILZIL) != null && (detectView = searchServiceCenter$AutoPlayAbility.getDetectView()) != null && detectView.isAttachedToWindow()) {
                        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2 = searchNestedAutoplayCardHelper.LLILZIL;
                        if (searchServiceCenter$AutoPlayAbility2 != null) {
                            searchServiceCenter$AutoPlayAbility2.J0();
                            return;
                        }
                        return;
                    }
                    RecyclerView.ViewHolder viewHolderFindContainingViewHolder = searchNestedAutoplayCardHelper.LL.findContainingViewHolder(view);
                    if (viewHolderFindContainingViewHolder == null) {
                        return;
                    }
                    this.LIZ(viewHolderFindContainingViewHolder);
                }
            }, SearchServiceCenter$AutoPlayAbility.DeferredLoadNotifierAbility.class, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LL = new HashMap<>();
    }
}
