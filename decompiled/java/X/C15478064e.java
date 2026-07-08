package X;

import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tako.share.panel.TakoSharePackage;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.064e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl$shareLocalMediaToDM$2$5", f = "TakoServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C15478064e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<DialogC1389620mGW> LL;
    public final /* synthetic */ SharePackage LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ MediaModel LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ TakoSharePackage LLILZLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15478064e(C259800zU<DialogC1389620mGW> c259800zU, SharePackage sharePackage, String str, MediaModel mediaModel, String str2, TakoSharePackage takoSharePackage, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C15478064e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = sharePackage;
        this.LLILLL = str;
        this.LLILZ = mediaModel;
        this.LLILZIL = str2;
        this.LLILZLL = takoSharePackage;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15478064e(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TakoSharePackage takoSharePackage;
        String string;
        String str;
        Map<String, String> map;
        String str2;
        String str3;
        C1C7U.LIZ("TakoServiceImpl@d56d.shareLocalMediaToDM$2$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DialogC1389620mGW dialogC1389620mGW = this.LL.element;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        SharePackage sharePackage = this.LLILLJJLI;
        if (sharePackage instanceof TakoSharePackage) {
            takoSharePackage = (TakoSharePackage) sharePackage;
        } else {
            takoSharePackage = null;
        }
        C13DA c13da = new C13DA();
        if (takoSharePackage != null) {
            Map<String, String> map2 = takoSharePackage.commonParams;
            if (map2 != null && (str3 = map2.get("process_id")) != null) {
                c13da.put("tako_process_id", str3);
            }
            String str4 = takoSharePackage.mobMessageId;
            if (str4 != null && str4.length() > 0) {
                c13da.put("tako_message_id", str4);
            }
        }
        Map mapBuild = c13da.build();
        C13DA c13da2 = new C13DA();
        if (takoSharePackage != null && (map = takoSharePackage.commonParams) != null && (str2 = map.get("enter_from")) != null) {
            c13da2.put("enter_from", str2);
        }
        c13da2.put("message_type", "tako_prompts_share_optimize");
        c13da2.put("message_scene", "tako_prompts_share_optimize");
        if (!mapBuild.isEmpty()) {
            c13da2.put("dynamic_card_mob_map", C08JS.LIZLLL(mapBuild));
        }
        Map mapBuild2 = c13da2.build();
        String str5 = this.LLILLL;
        List listSingletonList = Collections.singletonList(this.LLILZ);
        String str6 = this.LLILZIL;
        if (str6 == null || (string = a0.LJLIIIL(str6).toString()) == null || string.length() <= 0) {
            string = null;
        }
        if (this.LLILZLL.isVideoMedia) {
            str = "private_video";
        } else {
            str = "private_image";
        }
        C1440005kM.LIZ(new IMMediaPublishEvent.DMAlbumMediaPublishEvent(str5, listSingletonList, mapBuild2, null, QuoteMode.None.INSTANCE, null, null, string, str));
        Function1<Boolean, Unit> function1 = this.LLIZ;
        if (function1 != null) {
            function1.invoke(true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoServiceImpl@d56d.shareLocalMediaToDM$2$5");
        return unit;
    }
}
