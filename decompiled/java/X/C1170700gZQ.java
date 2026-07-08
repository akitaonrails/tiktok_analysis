package X;

import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0gZQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1170700gZQ extends C2217421BqW implements InterfaceC1631620sYq<String, Object, EnumC614120O6w, Unit> {
    public C1170700gZQ(Object obj) {
        super(3, obj, CollectionContentFragment.class, "onCollectionStateChange", "onCollectionStateChange(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, Object obj, EnumC614120O6w enumC614120O6w) {
        ((CollectionContentFragment) this.receiver).zS(str, obj, enumC614120O6w);
        return Unit.LIZ;
    }
}
