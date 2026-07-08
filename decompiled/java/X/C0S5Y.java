package X;

import com.ss.android.ugc.aweme.cla.et.newet.SeeTranslationButtonShowEvent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S5Y, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C0S5Y extends C2217421BqW implements Function1<InterfaceC665370Q7z, Unit> {
    public C0S5Y(TranslationStatusViewModel translationStatusViewModel) {
        super(1, translationStatusViewModel, TranslationStatusViewModel.class, "sendSeeTranslationButtonShow", "sendSeeTranslationButtonShow(Lcom/bytedance/provider/VScope;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC665370Q7z interfaceC665370Q7z) {
        String str;
        InterfaceC665370Q7z interfaceC665370Q7z2 = interfaceC665370Q7z;
        TranslationStatusViewModel translationStatusViewModel = (TranslationStatusViewModel) this.receiver;
        VideoItemParams item = translationStatusViewModel.getItem();
        if (item != null) {
            C2788016c c2788016cLIZ = C715660S5k.LIZ(item.getAweme());
            EnumC114900c7 enumC114900c7 = EnumC114900c7.TRANSLATION_LOG;
            C291590Bbp.LIZ.getClass();
            boolean z = true;
            if (!((Boolean) C291590Bbp.LIZIZ.getValue()).booleanValue()) {
                z = false;
            }
            C207071161d c207071161d = new C207071161d(enumC114900c7, z, 12);
            String str2 = item.mEventType;
            int awemeType = item.getAweme().getAwemeType();
            String aid = item.getAweme().getAid();
            if (C746760TRa.LIZ().LJLILLLLZI()) {
                str = "on";
            } else {
                str = "off";
            }
            C207069161b.LIZJ(SeeTranslationButtonShowEvent.class, interfaceC665370Q7z2, c207071161d, Collections.singletonList(new C2737014d(str2, awemeType, aid, Integer.valueOf(c2788016cLIZ.LIZIZ), Integer.valueOf(c2788016cLIZ.LIZJ), translationStatusViewModel.LLILZ, "feed", str, c2788016cLIZ.LIZ)));
        }
        return Unit.LIZ;
    }
}
