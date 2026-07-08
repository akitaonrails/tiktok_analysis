package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCreateItemResponse;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OKR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinPublishManager$publishItem$response$1", f = "BulletinPublishManager.kt", l = {1728}, m = "invokeSuspend")
public final class C0OKR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BulletinCreateItemResponse>, Object> {
    public int LL;
    public final /* synthetic */ BulletinBaseItem LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ C0OP0 LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OKR(BulletinBaseItem bulletinBaseItem, Map<String, ? extends Object> map, C259800zU<String> c259800zU, C0OP0 c0op0, String str, String str2, String str3, InterfaceC1364105Vn<? super C0OKR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinBaseItem;
        this.LLILLL = map;
        this.LLILZ = c259800zU;
        this.LLILZIL = c0op0;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OKR(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        List<String> list;
        String strLJ;
        C0OOO c0ooo;
        Aweme aweme;
        String aid;
        C0OOP c0oop;
        C0OOP c0oop2;
        Object objFetchBulletinCreateItem = obj;
        C1C7U.LIZ("BulletinPublishManager@9c10.publishItem$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objFetchBulletinCreateItem);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objFetchBulletinCreateItem);
            NotificationApi.Api apiLIZ = NotificationApi.LIZ();
            int iOrdinal = this.LLILLJJLI.LIZLLL().ordinal();
            BulletinBaseItem bulletinBaseItem = this.LLILLJJLI;
            boolean z = bulletinBaseItem instanceof C0OOP;
            Long lLJIILIIL = null;
            if (z && (c0oop2 = (C0OOP) bulletinBaseItem) != null) {
                str = c0oop2.LLJILJIL;
            } else {
                str = null;
            }
            if (z && (c0oop = (C0OOP) bulletinBaseItem) != null) {
                list = c0oop.LLJILJILJ;
            } else {
                list = null;
            }
            String strLJ2 = JsonParseUtils.LJ(list);
            Map<String, Object> map = this.LLILLL;
            if (map != null) {
                strLJ = JsonParseUtils.LJ(Collections.singletonList(map));
            } else {
                strLJ = null;
            }
            BulletinBaseItem bulletinBaseItem2 = this.LLILLJJLI;
            if ((bulletinBaseItem2 instanceof C0OOO) && (c0ooo = (C0OOO) bulletinBaseItem2) != null && (aweme = c0ooo.LLJI) != null && (aid = aweme.getAid()) != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(aid);
            }
            String str2 = this.LLILZ.element;
            int type = this.LLILZIL.getType();
            String str3 = this.LLILZLL;
            String str4 = this.LLIZ;
            String str5 = this.LLIZLLLIL;
            this.LL = 1;
            objFetchBulletinCreateItem = apiLIZ.fetchBulletinCreateItem(iOrdinal, str3, str, strLJ, strLJ2, lLJIILIIL, str2, str4, type, str5, this);
            if (objFetchBulletinCreateItem == objLJFF) {
                C1C7U.LIZIZ("BulletinPublishManager@9c10.publishItem$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BulletinPublishManager@9c10.publishItem$response$1");
        return objFetchBulletinCreateItem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BulletinCreateItemResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
