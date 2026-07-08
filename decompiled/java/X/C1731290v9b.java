package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS121S0400000_26;
import kotlin.jvm.internal.AwS7S0400100_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0v9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods.EcLiveBillboardDisplayMethod$handle$1", f = "EcLiveBillboardDisplayMethod.kt", l = {54, 98}, m = "invokeSuspend")
public final class C1731290v9b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public RootData LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC1731320v9e LLILLL;
    public final /* synthetic */ C1731300v9c LLILZ;
    public final /* synthetic */ CompletionBlock<InterfaceC1731340v9g> LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1731290v9b(InterfaceC1731320v9e interfaceC1731320v9e, C1731300v9c c1731300v9c, CompletionBlock<InterfaceC1731340v9g> completionBlock, Context context, long j, InterfaceC1364105Vn<? super C1731290v9b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1731320v9e;
        this.LLILZ = c1731300v9c;
        this.LLILZIL = completionBlock;
        this.LLILZLL = context;
        this.LLIZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1731290v9b(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        RootData rootData;
        TemplateField next;
        TemplateFieldProduct templateFieldProduct;
        String str;
        Object objLJII = obj;
        C1C7U.LIZ("EcLiveBillboardDisplayMethod@410c.handle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJII);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcLiveBillboardDisplayMethod@410c.handle$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rootData = this.LL;
            C155000ia.LIZIZ(objLJII);
        } else {
            C155000ia.LIZIZ(objLJII);
            rootData = new RootData(this.LLILLL.getTrackParams().getAuthorId(), this.LLILLL.getTrackParams().getRoomId(), Intrinsics.LJFF(this.LLILLL.getTrackParams().isNewUser(), C2286608xc.LJ(1)), 24);
            C1730290v7z c1730290v7z = C1730290v7z.LIZ;
            String str2 = rootData.roomId;
            String str3 = rootData.authorId;
            String templateCacheKey = this.LLILLL.getTemplateCacheKey();
            String activityId = this.LLILLL.getActivityId();
            this.LL = rootData;
            this.LLILLJJLI = 1;
            objLJII = c1730290v7z.LJII(str2, str3, templateCacheKey, activityId, null, true, this);
            if (objLJII == objLJFF) {
                C1C7U.LIZIZ("EcLiveBillboardDisplayMethod@410c.handle$1");
                return objLJFF;
            }
        }
        TemplateItem templateItem = (TemplateItem) objLJII;
        C212391189t c212391189t = C212391189t.LIZ;
        String templateCacheKey2 = this.LLILLL.getTemplateCacheKey();
        c212391189t.getClass();
        C212391189t.LIZIZ(templateCacheKey2, null, null);
        if (templateItem == null) {
            this.LLILZ.LIZJ(this.LLILLL.getTrackParams().getEnterFrom(), this.LLILLL.getActivityId(), null, this.LLILZIL, "billboard template cache is null");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EcLiveBillboardDisplayMethod@410c.handle$1");
            return unit2;
        }
        String activityId2 = this.LLILLL.getActivityId();
        if (activityId2 == null || activityId2.length() == 0) {
            C1730290v7z.LIZ.getClass();
            if (templateItem.getType() == 8 || templateItem.getType() == 9) {
                this.LLILZ.LIZJ(this.LLILLL.getTrackParams().getEnterFrom(), this.LLILLL.getActivityId(), C2286608xc.LJ(templateItem.getType()), this.LLILZIL, "activity id is null");
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("EcLiveBillboardDisplayMethod@410c.handle$1");
                return unit3;
            }
        }
        if (templateItem.gy().length() != 0) {
            C1730290v7z.LIZ.getClass();
            Iterator<TemplateField> it2 = templateItem.T5().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.fieldName, "product_image")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TemplateField templateField = next;
            if (templateField == null || ((templateFieldProduct = templateField.fieldData.fieldProduct) != null && (str = templateFieldProduct.productImage) != null && str.length() != 0)) {
                C1730010v7X c1730010v7X = new C1730010v7X();
                Context context = this.LLILZLL;
                String enterFrom = this.LLILLL.getTrackParams().getEnterFrom();
                AwS7S0400100_26 awS7S0400100_26 = new AwS7S0400100_26((CompletionBlock) this.LLILZIL, (CompletionBlock<InterfaceC1731340v9g>) this.LLILZ, (C1731300v9c) this.LLILLL, (InterfaceC1731320v9e) templateItem, (TemplateItem) this.LLIZ, 1L);
                AwS121S0400000_26 awS121S0400000_26 = new AwS121S0400000_26(this.LLILZ, (C1731300v9c) this.LLILLL, (InterfaceC1731320v9e) templateItem, (TemplateItem) this.LLILZIL, (CompletionBlock<InterfaceC1731340v9g>) 10);
                this.LL = null;
                this.LLILLJJLI = 2;
                Object objLIZLLL = c1730010v7X.LIZLLL(context, templateItem, Collections.singletonList(templateItem), rootData, true, enterFrom, awS7S0400100_26, awS121S0400000_26, this);
                if (objLIZLLL != C099R.LJFF()) {
                    objLIZLLL = Unit.LIZ;
                }
                if (objLIZLLL == objLJFF) {
                    C1C7U.LIZIZ("EcLiveBillboardDisplayMethod@410c.handle$1");
                    return objLJFF;
                }
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("EcLiveBillboardDisplayMethod@410c.handle$1");
                return unit4;
            }
        }
        this.LLILZ.LIZJ(this.LLILLL.getTrackParams().getEnterFrom(), this.LLILLL.getActivityId(), C2286608xc.LJ(templateItem.getType()), this.LLILZIL, "image is empty");
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("EcLiveBillboardDisplayMethod@410c.handle$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
