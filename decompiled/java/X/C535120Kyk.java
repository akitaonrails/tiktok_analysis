package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoImageModel;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Kyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aitheater.AiTheaterContentDataSource$fetchAiContentList$1$1", f = "AiTheaterContentDataSource.kt", l = {71}, m = "invokeSuspend")
public final class C535120Kyk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC550750Lir LL;
    public int LLILLJJLI;
    public final /* synthetic */ C535100Kyi LLILLL;
    public final /* synthetic */ C09AJ<List<C535020Kya>> LLILZ;
    public final /* synthetic */ C534900KyO LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535120Kyk(C535100Kyi c535100Kyi, C09AJ<List<C535020Kya>> c09aj, C534900KyO c534900KyO, InterfaceC1364105Vn<? super C535120Kyk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c535100Kyi;
        this.LLILZ = c09aj;
        this.LLILZIL = c534900KyO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535120Kyk(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC550750Lir interfaceC550750LirG9;
        AccountUserService accountUserServiceLJIIJ;
        String curUserId;
        Object objLJIILIIL;
        String str;
        int iIntValue;
        C1C7U.LIZ("AiTheaterContentDataSource@d612.fetchAiContentList$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        int iIntValue2 = 0;
        if (i != 0) {
            if (i == 1) {
                interfaceC550750LirG9 = this.LL;
                C155000ia.LIZIZ(obj);
                objLJIILIIL = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            getClass();
            AITheaterProfileService.LIZ.getClass();
            AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
            if (aITheaterProfileServiceLIZ != null && (interfaceC550750LirG9 = aITheaterProfileServiceLIZ.g9()) != null) {
                IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && (curUserId = accountUserServiceLJIIJ.getCurUserId()) != null && curUserId.length() != 0) {
                    this.LL = interfaceC550750LirG9;
                    this.LLILLJJLI = 1;
                    objLJIILIIL = interfaceC550750LirG9.LJIILIIL(curUserId, false, null, this);
                    if (objLJIILIIL == objLJFF) {
                        C1C7U.LIZIZ("AiTheaterContentDataSource@d612.fetchAiContentList$1$1");
                        return objLJFF;
                    }
                } else {
                    C201955140j.LJIJJ(C552700Lm0.LIZIZ, "AiTheaterCDS", "uid is null or empty");
                    this.LLILZ.onComplete();
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AiTheaterContentDataSource@d612.fetchAiContentList$1$1");
                    return unit;
                }
            } else {
                C201955140j.LJIJJ(C552700Lm0.LIZIZ, "AiTheaterCDS", "AITheaterProfileRepository not found");
                this.LLILZ.onComplete();
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("AiTheaterContentDataSource@d612.fetchAiContentList$1$1");
                return unit2;
            }
        }
        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestCameoInfo result=");
        sbLIZ.append((Object) C189200o6.m9toStringimpl(objLJIILIIL));
        C201955140j.LIZLLL(c552700Lm0, "AiTheaterCDS", C2188811AlT.LIZIZ(sbLIZ));
        if (C189200o6.m7isFailureimpl(objLJIILIIL)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("requestCameoInfo failed: ");
            sbLIZ2.append(C189200o6.m5exceptionOrNullimpl(objLJIILIIL));
            C201955140j.LJIJJ(c552700Lm0, "AiTheaterCDS", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLILZ.onComplete();
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("AiTheaterContentDataSource@d612.fetchAiContentList$1$1");
            return unit3;
        }
        if (C189200o6.m7isFailureimpl(objLJIILIIL)) {
            objLJIILIIL = null;
        }
        if (!Intrinsics.LJFF(objLJIILIIL, true)) {
            C201955140j.LIZLLL(c552700Lm0, "AiTheaterCDS", "requestCameoInfo returned false, user has no cameo");
            this.LLILZ.onComplete();
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("AiTheaterContentDataSource@d612.fetchAiContentList$1$1");
            return unit4;
        }
        if (this.LLILZ.isDisposed()) {
            C201955140j.LIZLLL(c552700Lm0, "AiTheaterCDS", "disposed after requestCameoInfo");
            Unit unit5 = Unit.LIZ;
            C1C7U.LIZIZ("AiTheaterContentDataSource@d612.fetchAiContentList$1$1");
            return unit5;
        }
        InterfaceC549230LgP interfaceC549230LgPLIZLLL = interfaceC550750LirG9.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("currentCameoState=");
        sbLIZ3.append(interfaceC549230LgPLIZLLL);
        C201955140j.LIZLLL(c552700Lm0, "AiTheaterCDS", C2188811AlT.LIZIZ(sbLIZ3));
        if (interfaceC549230LgPLIZLLL instanceof C549290LgV) {
            C549290LgV c549290LgV = (C549290LgV) interfaceC549230LgPLIZLLL;
            AITheaterCameoImageModel aITheaterCameoImageModel = c549290LgV.LIZIZ;
            List<String> urlList = aITheaterCameoImageModel.getUrlList();
            if (urlList != null && (str = (String) C13LP.LJJJLL(urlList)) != null && str.length() != 0) {
                List<C535020Kya> list = this.LLILZIL.LIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C535020Kya> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LIZ);
                }
                HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList);
                String str2 = c549290LgV.LIZ;
                if (!hashSetLLIFFJFJJ.contains(str2) && !this.LLILZ.isDisposed()) {
                    Integer width = aITheaterCameoImageModel.getWidth();
                    if (width != null) {
                        iIntValue = width.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer height = aITheaterCameoImageModel.getHeight();
                    if (height != null) {
                        iIntValue2 = height.intValue();
                    }
                    this.LLILZ.onNext(Collections.singletonList(new C535020Kya(str2, str2, 4, 1, iIntValue, iIntValue2, null, str, true, null, null, null, System.currentTimeMillis(), 48320)));
                }
            } else {
                C201955140j.LJIJJ(c552700Lm0, "AiTheaterCDS", "cameoImage url is null or empty");
                this.LLILZ.onComplete();
                Unit unit6 = Unit.LIZ;
                C1C7U.LIZIZ("AiTheaterContentDataSource@d612.fetchAiContentList$1$1");
                return unit6;
            }
        }
        if (!this.LLILZ.isDisposed()) {
            this.LLILZ.onComplete();
        }
        Unit unit7 = Unit.LIZ;
        C1C7U.LIZIZ("AiTheaterContentDataSource@d612.fetchAiContentList$1$1");
        return unit7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
