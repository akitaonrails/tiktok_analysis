package X;

import com.ss.android.ugc.tiktok.anchor.StickerAnchorMaker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mNh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1394070mNh extends C2217421BqW implements Function1<C2344009Gk, Unit> {
    public C1394070mNh(AbstractC1066890drz abstractC1066890drz) {
        super(1, abstractC1066890drz, StickerAnchorMaker.class, "addPropResourceList", "addPropResourceList(Lcom/ss/android/ugc/aweme/app/event/EventMapBuilder;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2344009Gk c2344009Gk) {
        C2344009Gk c2344009Gk2 = c2344009Gk;
        String str = (String) ((StickerAnchorMaker) this.receiver).LLJJ.getValue();
        if (str != null) {
            c2344009Gk2.LJFF("prop_resource_list", str);
        }
        return Unit.LIZ;
    }
}
