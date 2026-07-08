package X;

import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.SimpleStoryBulletPayload;
import com.ss.android.ugc.aweme.story.model.StoryBulletListResponse;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CxV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.gallery.ViewerListCache$Companion$writeBulletToKeva$1", f = "ViewerListCache.kt", l = {}, m = "invokeSuspend")
public final class C330510CxV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryBulletListResponse LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330510CxV(StoryBulletListResponse storyBulletListResponse, String str, InterfaceC1364105Vn<? super C330510CxV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyBulletListResponse;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330510CxV(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C330520CxW c330520CxW;
        C1C7U.LIZ("ViewerListCache$Companion@33d.writeBulletToKeva$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1227904rF.LIZ.getClass();
            Gson gsonLIZLLL = C1227904rF.LIZLLL();
            if (C328170Ctj.LIZ.simpleUserCacheEnabled) {
                String name = SimpleStoryBulletPayload.class.getName();
                StoryBulletListResponse storyBulletListResponse = this.LL;
                c330520CxW = new C330520CxW(name, new SimpleStoryBulletPayload(storyBulletListResponse.total, storyBulletListResponse.hasMore, storyBulletListResponse.nextCursor, C1389550mGP.LIZ(storyBulletListResponse.interactionUserList), storyBulletListResponse.LL));
            } else {
                StoryBulletListResponse storyBulletListResponse2 = this.LL;
                c330520CxW = new C330520CxW(storyBulletListResponse2.LLILLJJLI, storyBulletListResponse2);
            }
            n nVar = new n();
            nVar.LJJIIJ("clazz", c330520CxW.LIZ);
            nVar.LJJIII(C2286608xc.LJFF(System.currentTimeMillis()), "ts");
            nVar.LJJIFFI("data", gsonLIZLLL.LJIJJLI(c330520CxW.LIZIZ));
            C330530CxX.LJIIIIZZ.getValue().storeString(this.LLILLJJLI, gsonLIZLLL.LJIILJJIL(nVar));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            HashMap map = new HashMap();
            String str = this.LLILLJJLI;
            map.put("author_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            map.put("item_id", str);
            Npth.reportBizException("ViewerListCache", e, message, map);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ViewerListCache$Companion@33d.writeBulletToKeva$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
