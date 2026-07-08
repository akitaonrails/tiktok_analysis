package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01bA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarGeckoResourceUtil$preloadGeckoResource$1$1", f = "SocialAvatarGeckoResourceUtil.kt", l = {}, m = "invokeSuspend")
public final class C363801bA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, File, String, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C363801bA(InterfaceC1631620sYq<? super Boolean, ? super File, ? super String, Unit> interfaceC1631620sYq, InterfaceC1364105Vn<? super C363801bA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C363801bA c363801bA = new C363801bA(this.LLILLJJLI, interfaceC1364105Vn);
        c363801bA.LL = obj;
        return c363801bA;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [T, java.io.File] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1533790q13 c1533790q13LIZIZ;
        C1533490q0Z c1533490q0Z;
        Boolean boolValueOf;
        C1533810q15 c1533810q15;
        String strLIZLLL;
        C1C7U.LIZ("SocialAvatarGeckoResourceUtil@a43d.preloadGeckoResource$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        int i = C2187451AjH.LIZ;
        Forest forestLIZ = C0T1N.LIZ();
        C364601bI.LIZ.getClass();
        boolean zLIZIZ = C364601bI.LIZIZ();
        C259800zU c259800zU = new C259800zU();
        if (zLIZIZ) {
            c259800zU.element = C364601bI.LIZ("social_avatar_intro_sheet_avatars");
        }
        if (c259800zU.element != 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C334101Rj(this.LLILLJJLI, c259800zU, null), 2);
        } else {
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.channel = "tiktok_social_user_relation_res";
            requestParams.bundle = "social_avatar/social_avatar_intro_sheet_avatars.png";
            requestParams.waitGeckoUpdate = false;
            C1533910q1F c1533910q1FCreateSyncRequest = forestLIZ.createSyncRequest("", requestParams);
            if (c1533910q1FCreateSyncRequest != null) {
                c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ();
            } else {
                c1533790q13LIZIZ = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SocialAvatarGeckoResourceUtil get response request as ");
            if (c1533790q13LIZIZ != null) {
                c1533490q0Z = c1533790q13LIZIZ.LIZ;
            } else {
                c1533490q0Z = null;
            }
            sbLIZ.append(c1533490q0Z);
            sbLIZ.append(", isSucceed as ");
            if (c1533790q13LIZIZ != null) {
                boolValueOf = Boolean.valueOf(c1533790q13LIZIZ.LIZIZ);
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            sbLIZ.append(", errorInfo as ");
            if (c1533790q13LIZIZ != null) {
                c1533810q15 = c1533790q13LIZIZ.LIZLLL;
            } else {
                c1533810q15 = null;
            }
            sbLIZ.append(c1533810q15);
            sbLIZ.append(", filePath is ");
            if (c1533790q13LIZIZ != null) {
                strLIZLLL = c1533790q13LIZIZ.LIZLLL();
            } else {
                strLIZLLL = null;
            }
            sbLIZ.append(strLIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
            C1DFH c1dfh2 = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C363501b7(c1533790q13LIZIZ, this.LLILLJJLI, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarGeckoResourceUtil@a43d.preloadGeckoResource$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
