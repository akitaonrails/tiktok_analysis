package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.PlaySubtitleConfigController$getConfig$1", f = "PlaySubtitleConfigController.kt", l = {}, m = "invokeSuspend")
public final class C715800S5y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C715800S5y(Aweme aweme, InterfaceC1364105Vn<? super C715800S5y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C715800S5y(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        ArrayList arrayList;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        C1C7U.LIZ("PlaySubtitleConfigController@5709.getConfig$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20702615zk.LIZ.getClass();
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) C20702615zk.LIZJ.getValue();
        StringBuilder sb = new StringBuilder("SubConfigController, getConfig, aweme: ");
        Aweme aweme = this.LL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sb.append(aid);
        sb.append(" captionList: ");
        Aweme aweme2 = this.LL;
        if (aweme2 != null && (video = aweme2.getVideo()) != null && (captionModel = video.getCaptionModel()) != null && (list = captionModel.captionList) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<CaptionItemModel> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().languageCode);
            }
        } else {
            arrayList = null;
        }
        sb.append(arrayList);
        sb.append(", diagnosticInfo: ");
        C20703515zt c20703515zt = C20703515zt.LIZ;
        Aweme aweme3 = this.LL;
        c20703515zt.getClass();
        C161N c161n = C20703515zt.LIZIZ;
        String[] strArrLL = c161n.LL();
        String strLLIIZ = c161n.LLIIZ();
        StringBuilder sb2 = new StringBuilder("dntList: ");
        ArrayList arrayList2 = new ArrayList(strArrLL.length);
        for (String str : strArrLL) {
            arrayList2.add(str);
        }
        sb2.append(arrayList2);
        sb2.append(", targetLang: ");
        sb2.append(strLLIIZ);
        sb2.append(" captionTranslationEnabled: ");
        sb2.append(C20703515zt.LIZIZ.LJIILL(aweme3, null, null));
        sb2.append(", disableCaptionInLiteModeV2: ");
        sb2.append(C20703515zt.LIZLLL(aweme3));
        sb2.append(", isCaptionUserSettingOn: ");
        sb2.append(C20703515zt.LJIL(aweme3));
        sb2.append(", shouldHideForeignOriginalSubtitle: ");
        sb2.append(C20703515zt.LJJIJ(aweme3, null));
        sb2.append(", shouldHideBurnedInSubtitle: ");
        sb2.append(C20703515zt.LJJIIZI(aweme3, null));
        sb.append(sb2.toString());
        abstractC1604130rqV.LJ(sb.toString());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlaySubtitleConfigController@5709.getConfig$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
