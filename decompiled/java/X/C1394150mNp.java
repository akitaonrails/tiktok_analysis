package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1394150mNp extends C2217421BqW implements Function1<NewFaceStickerBean, Boolean> {
    public C1394150mNp(Object obj) {
        super(1, obj, C1394550mOT.class, "isAIMEStyleEffect", "isAIMEStyleEffect(Lcom/ss/android/ugc/aweme/sticker/model/NewFaceStickerBean;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(NewFaceStickerBean newFaceStickerBean) {
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        NewFaceStickerBean newFaceStickerBean2 = newFaceStickerBean;
        this.receiver.getClass();
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        boolean z = true;
        if (iAITheaterFeatureServiceLIZ == null || (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) == null || !interfaceC558600LvWLIZIZ.isFeatureEnabled() || (!a0.LJJIIZI(newFaceStickerBean2.extra, "coveruri", false) && !a0.LJJIIZI(newFaceStickerBean2.extra, "coverthumburi", false) && newFaceStickerBean2.effectSource != 103)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
