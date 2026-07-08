package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05xP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssemV2$onImClick$1$1", f = "VideoRelationBtnAssemV2.kt", l = {}, m = "invokeSuspend")
public final class C1520905xP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ User LL;
    public final /* synthetic */ VideoItemParams LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1520905xP(User user, VideoItemParams videoItemParams, InterfaceC1364105Vn<? super C1520905xP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = user;
        this.LLILLJJLI = videoItemParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1520905xP(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoRelationBtnAssemV2@ebe.onImClick$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1252250igx imSayHiService = C1336205Ku.LIZ(false).getImSayHiService();
        String uid = this.LL.getUid();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_method", "maf_video");
        String accurateRecType = this.LL.getAccurateRecType();
        String str = "";
        if (accurateRecType == null) {
            accurateRecType = "";
        }
        pairArr[1] = new Pair("rec_type", accurateRecType);
        String str2 = this.LLILLJJLI.mEventType;
        if (str2 != null) {
            str = str2;
        }
        pairArr[2] = new Pair("enter_from", str);
        imSayHiService.LJIIIZ(uid, C2097608Jq.LJIIJ(pairArr));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoRelationBtnAssemV2@ebe.onImClick$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
