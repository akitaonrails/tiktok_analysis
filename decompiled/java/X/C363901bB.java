package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01bB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl$fetchGeckoImageResource$1", f = "SocialAvatarServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C363901bB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, C364901bL, String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C363901bB(String str, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1631620sYq interfaceC1631620sYq) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C363901bB c363901bB = new C363901bB(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
        c363901bB.LL = obj;
        return c363901bB;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [T, java.io.File] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1533790q13 c1533790q13LIZIZ;
        C1533490q0Z c1533490q0Z;
        Boolean boolValueOf;
        C1533810q15 c1533810q15;
        String strLIZLLL;
        C1C7U.LIZ("SocialAvatarServiceImpl@45de.fetchGeckoImageResource$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        int i = C2187451AjH.LIZ;
        C364601bI.LIZ.getClass();
        boolean zLIZIZ = C364601bI.LIZIZ();
        C259800zU c259800zU = new C259800zU();
        if (zLIZIZ) {
            c259800zU.element = C364601bI.LIZ(this.LLILLJJLI);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ISocialAvatarService preloadGeckoResource, isResourceExist is ");
        sbLIZ.append(zLIZIZ);
        sbLIZ.append(", localFile is ");
        sbLIZ.append(c259800zU.element);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c259800zU.element != 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C364001bC(this.LLILLL, c259800zU, null), 2);
        } else {
            Forest forestLIZ = C0T1N.LIZ();
            RequestParams requestParams = new RequestParams(null, 1, null);
            String str = this.LLILLJJLI;
            requestParams.channel = "tiktok_social_user_relation_res";
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("social_avatar/");
            sbLIZ2.append(str);
            requestParams.bundle = C2188811AlT.LIZIZ(sbLIZ2);
            requestParams.waitGeckoUpdate = true;
            C1533910q1F c1533910q1FCreateSyncRequest = forestLIZ.createSyncRequest("", requestParams);
            if (c1533910q1FCreateSyncRequest != null) {
                c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ();
            } else {
                c1533790q13LIZIZ = null;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ISocialAvatarService fetchGeckoImageResource get response request as ");
            if (c1533790q13LIZIZ != null) {
                c1533490q0Z = c1533790q13LIZIZ.LIZ;
            } else {
                c1533490q0Z = null;
            }
            sbLIZ3.append(c1533490q0Z);
            sbLIZ3.append(", isSucceed as ");
            if (c1533790q13LIZIZ != null) {
                boolValueOf = Boolean.valueOf(c1533790q13LIZIZ.LIZIZ);
            } else {
                boolValueOf = null;
            }
            sbLIZ3.append(boolValueOf);
            sbLIZ3.append(", errorInfo as ");
            if (c1533790q13LIZIZ != null) {
                c1533810q15 = c1533790q13LIZIZ.LIZLLL;
            } else {
                c1533810q15 = null;
            }
            sbLIZ3.append(c1533810q15);
            sbLIZ3.append(", filePath is ");
            if (c1533790q13LIZIZ != null) {
                strLIZLLL = c1533790q13LIZIZ.LIZLLL();
            } else {
                strLIZLLL = null;
            }
            sbLIZ3.append(strLIZLLL);
            C2188811AlT.LIZIZ(sbLIZ3);
            C1DFH c1dfh2 = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C364101bD(c1533790q13LIZIZ, this.LLILLL, this.LLILLJJLI, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarServiceImpl@45de.fetchGeckoImageResource$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
