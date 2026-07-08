package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixBasicInfoModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixCardModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixDslModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixTabInfoModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixTabModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z6J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883010z6J extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1882980z6G LL;
    public final /* synthetic */ MixDslModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883010z6J(C1882980z6G c1882980z6G, MixDslModel mixDslModel) {
        super(0);
        this.LL = c1882980z6G;
        this.LLILLJJLI = mixDslModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<MixTabModel> list;
        List<MixCardModel> list2;
        List<MixTabModel> list3;
        List<MixCardModel> list4;
        C1883060z6O c1883060z6OLJJ = this.LL.LJJ();
        MixDslModel mixDslModel = this.LLILLJJLI;
        c1883060z6OLJJ.LLILZIL = mixDslModel;
        MixBasicInfoModel mixBasicInfoModel = mixDslModel.basicInfo;
        int size = 0;
        if (mixBasicInfoModel != null && (list4 = mixBasicInfoModel.cards) != null) {
            int i = 0;
            for (MixCardModel mixCardModel : list4) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                MixCardModel mixCardModel2 = mixCardModel;
                mixCardModel2.LIZIZ = i;
                InterfaceC1883030z6L interfaceC1883030z6LLIZ = c1883060z6OLJJ.LLILLL.LJIILIIL().LIZ(c1883060z6OLJJ.LL, mixCardModel2);
                if (interfaceC1883030z6LLIZ != null) {
                    ((ArrayList) c1883060z6OLJJ.LLILZ).add(interfaceC1883030z6LLIZ);
                    interfaceC1883030z6LLIZ.LJIJI(c1883060z6OLJJ.LLJ);
                    interfaceC1883030z6LLIZ.onCreate();
                }
                i = i2;
            }
        }
        MixTabInfoModel mixTabInfoModel = mixDslModel.tabInfo;
        c1883060z6OLJJ.LLILZLL = Boolean.valueOf(((mixTabInfoModel == null || (list3 = mixTabInfoModel.tabs) == null) ? 0 : list3.size()) > 1);
        MixTabInfoModel mixTabInfoModel2 = mixDslModel.tabInfo;
        if (mixTabInfoModel2 != null && (list = mixTabInfoModel2.tabs) != null && (!list.isEmpty())) {
            int i3 = 0;
            for (MixTabModel mixTabModel : mixDslModel.tabInfo.tabs) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                mixTabModel.LIZ = i3;
                i3 = i4;
            }
            Context context = c1883060z6OLJJ.LL;
            C1883080z6Q c1883080z6Q = c1883060z6OLJJ.LLJ;
            MixTabInfoModel mixTabInfoModel3 = mixDslModel.tabInfo;
            InterfaceC1883090z6R interfaceC1883090z6R = c1883060z6OLJJ.LLILLL;
            MixBasicInfoModel mixBasicInfoModel2 = mixDslModel.basicInfo;
            if (mixBasicInfoModel2 != null && (list2 = mixBasicInfoModel2.cards) != null) {
                size = list2.size();
            }
            C1883550z7B c1883550z7B = new C1883550z7B(context, c1883080z6Q, mixTabInfoModel3, interfaceC1883090z6R, size);
            ((ArrayList) c1883060z6OLJJ.LLILZ).add(c1883550z7B);
            c1883550z7B.LLILLJJLI = c1883060z6OLJJ.LLJ;
            c1883550z7B.onCreate();
        }
        List<InterfaceC1883040z6M> list5 = this.LL.LJJ().LLILZ;
        C1882980z6G c1882980z6G = this.LL;
        for (InterfaceC1883040z6M interfaceC1883040z6M : (ArrayList) list5) {
            interfaceC1883040z6M.LJII(c1882980z6G.LJJI());
            interfaceC1883040z6M.LJIILJJIL(c1882980z6G.LJJI());
        }
        return Unit.LIZ;
    }
}
