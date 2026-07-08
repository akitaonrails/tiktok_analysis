package X;

import Y.AfS119S0300000_33;
import Y.AfS166S0200000_33;
import com.bytedance.android.livesdk.gift.viewerwishes.api.ViewerWishesApi;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.viewer_picks.model.ListOrdersParams;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksOrder;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.1AHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176871AHl {
    public static final C01GW<Long> LJI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(65));
    public static final C01GW<Long> LJII = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(66));
    public final DataChannel LIZ;
    public long LIZJ;
    public boolean LJ;
    public Long LJFF;
    public List<ViewerPicksOrder> LIZIZ = new ArrayList();
    public long LIZLLL = 2;

    public C2176871AHl(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZ(EnumC20674115v9 enumC20674115v9, Function1<? super List<ViewerPicksOrder>, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
        long j;
        long j2;
        C2176881AHm c2176881AHm;
        C1125770fOx c1125770fOx;
        ViewerPicksInfo viewerPicksInfo;
        if (this.LJ) {
            function02.invoke();
            return;
        }
        this.LJ = true;
        if (enumC20674115v9 == EnumC20674115v9.LOAD_MORE) {
            j = this.LIZLLL;
        } else {
            this.LIZLLL = 2L;
            j = 1;
        }
        ListOrdersParams listOrdersParams = new ListOrdersParams();
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (c2176881AHm = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) != null && (c1125770fOx = c2176881AHm.LIZIZ) != null && (viewerPicksInfo = c1125770fOx.LIZIZ) != null) {
            j2 = viewerPicksInfo.viewerPicksId;
        } else {
            j2 = 0;
        }
        listOrdersParams.viewerPicksId = j2;
        listOrdersParams.pageNumber = j;
        listOrdersParams.pageSize = C2176861AHk.LIZ();
        C480460Ism.LIZ().getClass();
        ((ViewerWishesApi) C480460Ism.LIZLLL(ViewerWishesApi.class)).getViewerWishesListOrders(listOrdersParams).LJIILIIL(new C0UO0()).LJJLL(new AfS119S0300000_33(enumC20674115v9, this, function1, 3), new AfS166S0200000_33(function0, this, 0));
    }
}
