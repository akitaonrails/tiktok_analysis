package X;

import Y.AfS181S0100000_12;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.favorites.business.collection.CollaborativeArchiveInfo;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageResponse;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gZY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170780gZY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C259800zU<CollectionManageRequest> LL;
    public final /* synthetic */ C1171530gal LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ CollectionDetail LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ List<String> LLIZ;
    public final /* synthetic */ C19EG LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1170780gZY(C259800zU<CollectionManageRequest> c259800zU, C1171530gal c1171530gal, String str, boolean z, CollectionDetail collectionDetail, boolean z2, List<String> list, C19EG c19eg) {
        super(0);
        this.LL = c259800zU;
        this.LLILLJJLI = c1171530gal;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = collectionDetail;
        this.LLILZLL = z2;
        this.LLIZ = list;
        this.LLIZLLLIL = c19eg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C11O8 c11o8LJJJLZIJ = new C1171340gaS().LLILLL.LLZLLIL(this.LL.element, this.LLILLJJLI.LLILLL).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        final String str = this.LLILLL;
        final boolean z = this.LLILZ;
        final C1171530gal c1171530gal = this.LLILLJJLI;
        final CollectionDetail collectionDetail = this.LLILZIL;
        final boolean z2 = this.LLILZLL;
        final List<String> list = this.LLIZ;
        final C19EG c19eg = this.LLIZLLLIL;
        c11o8LJJJLZIJ.LJJLL(new C09JN() { // from class: X.0gZV
            @Override // X.C09JN
            public final void accept(Object obj) {
                String string;
                Integer num;
                Integer num2;
                String str2;
                int iLIZIZ;
                int iLIZIZ2;
                String str3;
                C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.requestAddToCollection$execute$1$ignore$1");
                CollectionManageResponse collectionManageResponse = (CollectionManageResponse) obj;
                String str4 = str;
                if (str4 == null) {
                    if (z) {
                        str4 = "create";
                    } else {
                        str4 = "add";
                    }
                }
                C1170730gZT c1170730gZT = new C1170730gZT();
                C1171530gal c1171530gal2 = c1171530gal;
                c1170730gZT.LIZLLL = c1171530gal2.LLILLJJLI;
                c1170730gZT.LJIIZILJ = str4;
                c1170730gZT.LJIL = c1171530gal2.LL;
                c1170730gZT.LJJ = 1;
                CollectionDetail collectionDetail2 = collectionDetail;
                c1170730gZT.LJIJI = collectionDetail2.id;
                c1170730gZT.LJIJJ = collectionDetail2.name;
                Integer num3 = collectionDetail2.type;
                List<String> list2 = null;
                if (num3 != null) {
                    string = num3.toString();
                } else {
                    string = null;
                }
                c1170730gZT.LJJIFFI = string;
                CollectionDetail.Status status = collectionDetail.status;
                if (status != null) {
                    num = status.state;
                } else {
                    num = null;
                }
                c1170730gZT.LJIJJLI = C1172580gcS.LIZ(num);
                CollectionDetail.Status status2 = collectionDetail.status;
                if (status2 != null) {
                    num2 = status2.state;
                } else {
                    num2 = null;
                }
                c1170730gZT.LJIILLIIL(num2);
                c1170730gZT.LJIILJJIL();
                if (z2) {
                    C1440005kM.LIZ(new C742510TAr(new CollectionManageRequest(3, null, null, null, null, null, null, null, null, null, null, null), null));
                } else {
                    C1440005kM.LIZ(new C742510TAr(new CollectionManageRequest(1, null, null, null, null, null, null, null, null, null, null, null), null));
                }
                CollaborativeArchiveInfo collaborativeArchiveInfo = collectionManageResponse.collaborativeInfo;
                if (collaborativeArchiveInfo != null && collaborativeArchiveInfo.contentPbList != null) {
                    C1171530gal c1171530gal3 = c1171530gal;
                    C19EG c19eg2 = c19eg;
                    CollectionDetail collectionDetail3 = collectionDetail;
                    List<String> list3 = list;
                    c1171530gal3.getClass();
                    View viewFindViewById = c19eg2.getWindow().getDecorView().findViewById(R.id.viewpager);
                    View decorView = c19eg2.getWindow().getDecorView();
                    Rect rect = new Rect();
                    decorView.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    viewFindViewById.getGlobalVisibleRect(rect2);
                    if (Intrinsics.LJFF(c1171530gal3.LLILLJJLI, "graphic_detail")) {
                        iLIZIZ = rect.bottom - rect2.bottom;
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
                    } else {
                        iLIZIZ = (rect.bottom - rect2.bottom) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    }
                    C1389910mGz c1389910mGz = new C1389910mGz(c19eg2);
                    c1389910mGz.LJI(R.style.y0);
                    c1389910mGz.LIZ.LIZIZ = 0;
                    c1389910mGz.LJ(3000L);
                    c1389910mGz.LIZIZ(iLIZIZ + iLIZIZ2);
                    C1171960gbS c1171960gbS = new C1171960gbS(c1171530gal3.LL);
                    c1171960gbS.LIZLLL(c1389910mGz);
                    Context context = viewFindViewById.getContext();
                    Object[] objArr = new Object[1];
                    if (collectionDetail3 != null) {
                        str3 = collectionDetail3.name;
                    } else {
                        str3 = null;
                    }
                    objArr[0] = str3;
                    c1389910mGz.LJIIJ(context.getString(2131847951, objArr));
                    c1389910mGz.LJI(R.style.y0);
                    c1389910mGz.LIZ.LIZLLL = 2;
                    c1389910mGz.LJFF(2131847952);
                    c1389910mGz.LIZLLL(new AwS419S0200000_18(c1171530gal3, c1171960gbS, 33));
                    c1389910mGz.LIZ.LJIIIIZZ = new C1208700hYi(list3, c19eg2, c1171530gal3, 4);
                    c1389910mGz.LJIIJJI();
                }
                C1609306Rv c1609306Rv = C1609306Rv.LIZ;
                CollaborativeArchiveInfo collaborativeArchiveInfo2 = collectionManageResponse.collaborativeInfo;
                if (collaborativeArchiveInfo2 != null) {
                    list2 = collaborativeArchiveInfo2.contentPbList;
                }
                List<String> list4 = list;
                String str5 = collectionDetail.id;
                if (str5 == null) {
                    str5 = "";
                }
                if (z) {
                    str2 = "create_collection_panel";
                } else {
                    str2 = "add_to_collection_panel";
                }
                String str6 = c1171530gal.LLILLJJLI;
                c1609306Rv.getClass();
                C1609306Rv.LIZ(str5, str2, str6, list2, list4);
                C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.requestAddToCollection$execute$1$ignore$1");
            }
        }, new AfS181S0100000_12(c19eg, 128));
        return Unit.LIZ;
    }
}
