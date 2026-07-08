package X;

import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ncq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew$mobNormalBubbleShowIfNeed$1$1", f = "UpvoteVideoAssemNew.kt", l = {}, m = "invokeSuspend")
public final class C597980Ncq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ UpvoteVideoAssemNew LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597980Ncq(long j, long j2, UpvoteVideoAssemNew upvoteVideoAssemNew, InterfaceC1364105Vn<? super C597980Ncq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = upvoteVideoAssemNew;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597980Ncq(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("UpvoteVideoAssemNew@1483.mobNormalBubbleShowIfNeed$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        long j = this.LL;
        long j2 = this.LLILLJJLI;
        UpvoteVideoAssemNew upvoteVideoAssemNew = this.LLILLL;
        jSONObject.put("time_interval", j - j2);
        Boolean bool = upvoteVideoAssemNew.LLLJ;
        if (bool != null) {
            int i = 1;
            if (!Intrinsics.LJFF(bool, true)) {
                i = -1;
            }
            jSONObject.put("has_cache", i);
        }
        C20684815ws.LJIJ("repost_bubble_show_cost", jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UpvoteVideoAssemNew@1483.mobNormalBubbleShowIfNeed$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
