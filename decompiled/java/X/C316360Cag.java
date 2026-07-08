package X;

import com.ss.android.ugc.aweme.model.MentionCheckResult;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.util.MentionNetworkRequestHelper$fetchRecommendUserForMentionWithCache$2", f = "MentionNetworkRequestHelper.kt", l = {141, 142}, m = "invokeSuspend")
public final class C316360Cag extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends C317020Cbk, ? extends List<? extends MentionCheckResult>>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316360Cag(long j, InterfaceC1364105Vn<? super C316360Cag> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C316360Cag c316360Cag = new C316360Cag(this.LLIZ, interfaceC1364105Vn);
        c316360Cag.LLILZLL = obj;
        return c316360Cag;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<C317020Cbk, ? extends List<MentionCheckResult>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends C317020Cbk, ? extends List<? extends MentionCheckResult>>> interfaceC1364105Vn) {
        return invoke2(interfaceC497601wk, (InterfaceC1364105Vn<? super Pair<C317020Cbk, ? extends List<MentionCheckResult>>>) interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:35:0x0119, B:36:0x011c, B:38:0x0135, B:40:0x0139, B:44:0x0141, B:47:0x0147, B:49:0x014b, B:52:0x0153, B:54:0x0157, B:55:0x0159, B:59:0x0172, B:42:0x013d, B:31:0x00ff), top: B:78:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013d A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:35:0x0119, B:36:0x011c, B:38:0x0135, B:40:0x0139, B:44:0x0141, B:47:0x0147, B:49:0x014b, B:52:0x0153, B:54:0x0157, B:55:0x0159, B:59:0x0172, B:42:0x013d, B:31:0x00ff), top: B:78:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:35:0x0119, B:36:0x011c, B:38:0x0135, B:40:0x0139, B:44:0x0141, B:47:0x0147, B:49:0x014b, B:52:0x0153, B:54:0x0157, B:55:0x0159, B:59:0x0172, B:42:0x013d, B:31:0x00ff), top: B:78:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:35:0x0119, B:36:0x011c, B:38:0x0135, B:40:0x0139, B:44:0x0141, B:47:0x0147, B:49:0x014b, B:52:0x0153, B:54:0x0157, B:55:0x0159, B:59:0x0172, B:42:0x013d, B:31:0x00ff), top: B:78:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:35:0x0119, B:36:0x011c, B:38:0x0135, B:40:0x0139, B:44:0x0141, B:47:0x0147, B:49:0x014b, B:52:0x0153, B:54:0x0157, B:55:0x0159, B:59:0x0172, B:42:0x013d, B:31:0x00ff), top: B:78:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ae  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws X.C316370Cah {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C316360Cag.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
