package X;

import com.ss.android.ugc.aweme.feed.popup.FeedPopupService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.15s2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20654815s2 extends AbstractC20655215s6 {
    public final Map<EnumC20654715s1, List<InterfaceC19297910ef>> LIZIZ = new LinkedHashMap();
    public final Map<EnumC20654715s1, List<InterfaceC12945054t>> LIZJ = new LinkedHashMap();
    public final C20654915s3 LIZLLL = new C20654915s3();

    @Override // X.AbstractC20655215s6
    public final String LIZJ() {
        return "callback_init";
    }

    @Override // X.AbstractC20655215s6
    public final void LIZIZ() {
        C20585815gu c20585815guLIZIZ;
        C20654915s3 c20654915s3 = this.LIZLLL;
        c20654915s3.LIZ = this;
        c20654915s3.LIZ(EnumC20654715s1.DEBUG_OUTREACH, EnumC19297710ed.DEBUG_FETCH_INIT);
        EnumC20654715s1 enumC20654715s1 = EnumC20654715s1.POPUP;
        c20654915s3.LIZ(enumC20654715s1, EnumC19297710ed.POPUP_FETCH_INIT);
        c20654915s3.LIZIZ(enumC20654715s1, EnumC12932054g.POPUP_TRIGGER_INIT);
        c20654915s3.LIZIZ(EnumC20654715s1.FEED_WIDGET, EnumC12932054g.NORMAL_PENDANT_INIT);
        c20654915s3.LIZ(EnumC20654715s1.IN_APP_PUSH, EnumC19297710ed.IN_APP_PUSH_INIT);
        c20654915s3.LIZIZ(EnumC20654715s1.OUT_APP_PUSH, EnumC12932054g.OUT_APP_PUSH_INIT);
        FeedPopupService feedPopupService = (FeedPopupService) PluggableExtentionKt.pluggableSpi$default(FeedPopupService.class, false, false, false, 14, null);
        if (feedPopupService == null || (c20585815guLIZIZ = feedPopupService.LIZIZ()) == null) {
            return;
        }
        C20554315bp.LIZIZ.LJIIJJI(enumC20654715s1, c20585815guLIZIZ);
    }

    public final void LIZLLL(EnumC20654715s1 enumC20654715s1) {
        List list = (List) ((LinkedHashMap) this.LIZIZ).get(enumC20654715s1);
        if (list != null && (!list.isEmpty())) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC637050Oyl abstractC637050OylInitFetchCallBack = ((InterfaceC19297910ef) it2.next()).initFetchCallBack();
                if (abstractC637050OylInitFetchCallBack != null) {
                    LIZ().LIZ().LIZIZ.put(enumC20654715s1, abstractC637050OylInitFetchCallBack);
                }
            }
        }
        this.LIZIZ.remove(enumC20654715s1);
        List list2 = (List) ((LinkedHashMap) this.LIZJ).get(enumC20654715s1);
        if (list2 != null && (!list2.isEmpty())) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                InterfaceC1273504yb interfaceC1273504ybInitTriggerCallBack = ((InterfaceC12945054t) it3.next()).initTriggerCallBack();
                if (interfaceC1273504ybInitTriggerCallBack != null) {
                    LIZ().LIZ().LIZJ.put(enumC20654715s1, interfaceC1273504ybInitTriggerCallBack);
                }
            }
        }
        this.LIZJ.remove(enumC20654715s1);
    }
}
