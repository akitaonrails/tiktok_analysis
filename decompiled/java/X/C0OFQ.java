package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OFQ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0OFQ extends C2217421BqW implements InterfaceC1631620sYq<String, Object, EnumC614120O6w, Unit> {
    public C0OFQ(Object obj) {
        super(3, obj, PostModeFavoriteViewModel.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, Object obj, EnumC614120O6w enumC614120O6w) {
        Boolean bool;
        PostModeFavoriteViewModel postModeFavoriteViewModel = (PostModeFavoriteViewModel) this.receiver;
        Aweme aweme = postModeFavoriteViewModel.LL;
        String aid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        if (Intrinsics.LJFF(str, aid) && obj != null && (obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (enumC614120O6w == EnumC614120O6w.Mutation) {
                postModeFavoriteViewModel.setState(new AwS24S0010000_9(zBooleanValue, 14));
            }
        }
        return Unit.LIZ;
    }
}
