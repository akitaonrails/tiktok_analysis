package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.tiktok.anchor.StickerAnchorMaker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mNU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1393940mNU extends C2217421BqW implements Function1<C2344009Gk, Unit> {
    public C1393940mNU(AbstractC1066890drz abstractC1066890drz) {
        super(1, abstractC1066890drz, StickerAnchorMaker.class, "addPropResourceId", "addPropResourceId(Lcom/ss/android/ugc/aweme/app/event/EventMapBuilder;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2344009Gk c2344009Gk) {
        String strLIZLLL;
        C2344009Gk c2344009Gk2 = c2344009Gk;
        AnchorCommonStruct anchorCommonStruct = ((AbstractC1066890drz) this.receiver).LLIZ;
        if (anchorCommonStruct != null && (strLIZLLL = C1212100heC.LIZLLL(anchorCommonStruct)) != null) {
            c2344009Gk2.LJFF("prop_resource_id", strLIZLLL);
        }
        return Unit.LIZ;
    }
}
