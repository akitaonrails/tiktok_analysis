package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.comment.easteregg.model.SurpriseResourceResponse;
import com.ss.android.ugc.aweme.comment.model.CommentSurprise;
import com.ss.android.ugc.aweme.comment.model.SurpriseResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0582, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.easteregg.util.CommentSurpriseCacheManager$fetchCommentSurprisePreloadData$1$2$1", f = "CommentSurpriseCacheManager.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0582 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SurpriseResourceResponse LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0582(SurpriseResourceResponse surpriseResourceResponse, InterfaceC1364105Vn<? super AnonymousClass0582> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = surpriseResourceResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0582(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        int iIntValue;
        Integer num;
        Long l;
        C1C7U.LIZ("CommentSurpriseCacheManager@bb43.fetchCommentSurprisePreloadData$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (CommentSurprise commentSurprise : this.LL.commentSurprises) {
            LruCache<String, CommentSurprise> lruCache = AnonymousClass0562.LIZ;
            Integer num2 = commentSurprise.surpriseType;
            SurpriseResource surpriseResource = commentSurprise.surpriseResource;
            if (surpriseResource != null && (l = surpriseResource.activityId) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Long lLJFF = C2286608xc.LJFF(jLongValue);
            SurpriseResource surpriseResource2 = commentSurprise.surpriseResource;
            if (surpriseResource2 != null && (num = surpriseResource2.effectId) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            AnonymousClass0562.LIZ.put(AnonymousClass0562.LIZ(num2, C2286608xc.LJ(iIntValue), lLJFF), commentSurprise);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentSurpriseCacheManager@bb43.fetchCommentSurprisePreloadData$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
