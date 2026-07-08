package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.longpress.LongPressServiceImpl$getSharePanelTopUserInfo$2", f = "LongPressServiceImpl.kt", l = {282}, m = "invokeSuspend")
public final class C1344805Oc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends UrlModel>>, Object> {
    public int LL;

    public C1344805Oc(InterfaceC1364105Vn<? super C1344805Oc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1344805Oc(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UrlModel displayAvatar;
        Object objLIZLLL = obj;
        C1C7U.LIZ("LongPressServiceImpl@1400.getSharePanelTopUserInfo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        List listLL = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZLLL);
            } else {
                C155000ia.LIZIZ(objLIZLLL);
                IInternalShareApi.LIZ.getClass();
                InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
                this.LL = 1;
                objLIZLLL = interfaceC1364710lcLLIZIZ.LIZLLL(0, false, false, true, 60, false, true, null, false, this);
                if (objLIZLLL == objLJFF) {
                    C1C7U.LIZIZ("LongPressServiceImpl@1400.getSharePanelTopUserInfo$2");
                    return objLJFF;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (IMContact iMContact : (List) objLIZLLL) {
                if ((iMContact instanceof IMUser) || (iMContact instanceof IMConversation)) {
                    displayAvatar = iMContact.getDisplayAvatar();
                } else {
                    displayAvatar = null;
                }
                if (displayAvatar != null) {
                    arrayList.add(displayAvatar);
                }
            }
            listLL = C13LP.LL(arrayList, 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("LongPressServiceImpl@1400.getSharePanelTopUserInfo$2");
        return listLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends UrlModel>> interfaceC1364105Vn) {
        return new C1344805Oc(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
