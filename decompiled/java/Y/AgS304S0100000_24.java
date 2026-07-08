package Y;

import X.C2286608xc;
import X.InterfaceC1364105Vn;
import X.InterfaceC1611890s31;
import X.InterfaceC346701Wf;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.viewmodel.SeriesPanelSquareViewModel;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.series.innerfeed.viewmodel.SeriesInnerFeedViewModel;
import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public class AgS304S0100000_24 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS304S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(AgS304S0100000_24 agS304S0100000_24, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) obj;
        if (collectionDetailModel != null) {
            SeriesInnerFeedViewModel seriesInnerFeedViewModel = (SeriesInnerFeedViewModel) agS304S0100000_24.l0;
            seriesInnerFeedViewModel.setState(new AwS603S0100000_24(collectionDetailModel, 245));
            ((InterfaceC1611890s31) seriesInnerFeedViewModel.GQ2().getOperator()).LJJLIL(C2286608xc.LJ(collectionDetailModel.tabRange), C2286608xc.LJ(collectionDetailModel.collectionVideoNum));
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS304S0100000_24 agS304S0100000_24, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) obj;
        if (collectionDetailModel != null) {
            ((SeriesDetailVideoListViewModel) agS304S0100000_24.l0).setState(new AwS603S0100000_24(collectionDetailModel, 550));
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS304S0100000_24 agS304S0100000_24, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) obj;
        if (collectionDetailModel != null) {
            ((SeriesPanelSquareViewModel) agS304S0100000_24.l0).setState(new AwS603S0100000_24(collectionDetailModel, 589));
        }
        return Unit.LIZ;
    }
}
