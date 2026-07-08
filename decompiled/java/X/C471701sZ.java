package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01sZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.guideuploadcard.ResourcesPreloadStat$preloadGecko$1", f = "ResourcesPreloadStat.kt", l = {}, m = "invokeSuspend")
public final class C471701sZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0HBZ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C471701sZ(C0HBZ c0hbz, InterfaceC1364105Vn<? super C471701sZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0hbz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C471701sZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1533790q13 c1533790q13LIZIZ;
        String strLIZLLL;
        String strLIZLLL2;
        C1533910q1F c1533910q1FCreateSyncRequest;
        C1C7U.LIZ("ResourcesPreloadStat@d1f2.preloadGecko$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmapDecodeFile = null;
        try {
            Forest forest = (Forest) this.LL.LIZIZ.getValue();
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.channel = "tiktok_social_friends_interaction_res";
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("story_feed_post_guide");
            sbLIZ.append(File.separator);
            sbLIZ.append("background.png");
            requestParams.bundle = C2188811AlT.LIZIZ(sbLIZ);
            requestParams.waitGeckoUpdate = true;
            requestParams.resourceScene = EnumC1533980q1M.OTHER;
            requestParams.enableCDNCache = true;
            requestParams.enableMemoryCache = true;
            requestParams.enableRequestReuse = true;
            c1533910q1FCreateSyncRequest = forest.createSyncRequest("", requestParams);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (c1533910q1FCreateSyncRequest != null) {
            c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ();
        } else {
            c1533790q13LIZIZ = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetch gecko resource filePath:");
        if (c1533790q13LIZIZ != null) {
            strLIZLLL = c1533790q13LIZIZ.LIZLLL();
        } else {
            strLIZLLL = null;
        }
        sbLIZ2.append(strLIZLLL);
        C2188811AlT.LIZIZ(sbLIZ2);
        C0HBZ c0hbz = this.LL;
        if (c1533790q13LIZIZ == null) {
            strLIZLLL2 = null;
        } else {
            try {
                strLIZLLL2 = c1533790q13LIZIZ.LIZLLL();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        bitmapDecodeFile = BitmapFactory.decodeFile(strLIZLLL2, options);
        c0hbz.LIZJ = bitmapDecodeFile;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ResourcesPreloadStat@d1f2.preloadGecko$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
