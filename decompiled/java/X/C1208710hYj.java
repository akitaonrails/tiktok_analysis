package X;

import Y.AfS154S0200000_18;
import android.view.View;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208710hYj extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(C1208710hYj c1208710hYj, View view) {
        boolean z;
        ((C1171530gal) c1208710hYj.l0).LIZ().LJ("FeedAddToFavoritesPopToast doClick isCacheEmpty true");
        C1206780hVc.LIZ("click favorite toast");
        C20684815ws.LJIJI("click_collection_banner", new Pair(((C1171530gal) c1208710hYj.l0).LLILLJJLI, "enter_from"), new Pair("click_fav_button", "enter_method"), new Pair(((C1171530gal) c1208710hYj.l0).LL, "group_id"));
        C1171300gaO c1171300gaO = new C1171340gaS().LLILLL;
        C1171530gal c1171530gal = (C1171530gal) c1208710hYj.l0;
        boolean z2 = c1171530gal.LLILLL;
        if (c1171530gal.LL != null) {
            z = true;
        } else {
            z = false;
        }
        c1171300gaO.u0(0L, null, true, null, null, C1171750gb7.LIZ(), z2, z).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS154S0200000_18((C19EG) c1208710hYj.l1, (C1171530gal) c1208710hYj.l0, 4), new C09JN() { // from class: X.0gaj
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.showToastWithoutContentView$4$doClick$2");
                C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.showToastWithoutContentView$4$doClick$2");
            }
        });
    }

    public static final void LIZ$1(C1208710hYj c1208710hYj, View view) {
        C20684815ws.LJIJI("favourite_notice_click", new Pair(((C1171910gbN) c1208710hYj.l0).LIZJ, "enter_from"), new Pair("favourite_post_tab", "toast_type"), new Pair(((C1171910gbN) c1208710hYj.l0).LIZ, "group_id"), new Pair(((C1171910gbN) c1208710hYj.l0).LIZIZ, "author_id"));
        ((C1171910gbN) c1208710hYj.l0).LIZ((C19EG) c1208710hYj.l1, 1035, "click_toast").open();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1208710hYj(Object obj, Object obj2, int i) {
        super(500L);
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
