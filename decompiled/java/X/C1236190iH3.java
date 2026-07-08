package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0iH3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1236190iH3 extends C2217421BqW implements Function2<CollectionDetailModel, Boolean, Unit> {
    public C1236190iH3(Object obj) {
        super(2, obj, C1236240iH8.class, "hidePopCard", "hidePopCard(Lcom/ss/android/ugc/aweme/model/CollectionDetailModel;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CollectionDetailModel collectionDetailModel, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((C1236240iH8) this.receiver).LJJI(collectionDetailModel, zBooleanValue);
        return Unit.LIZ;
    }
}
