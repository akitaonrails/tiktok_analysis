package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.agegraduation.AgeGraduationViewModel;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.common.model.ImChatNoticeModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.067f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.agegraduation.AgeGraduationViewModel$fetchTopNotice$1", f = "AgeGraduationViewModel.kt", l = {66}, m = "invokeSuspend")
public final class C15557067f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AgeGraduationViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15557067f(AgeGraduationViewModel ageGraduationViewModel, String str, InterfaceC1364105Vn<? super C15557067f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ageGraduationViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15557067f(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object chatNotice = obj;
        C1C7U.LIZ("AgeGraduationViewModel@d670.fetchTopNotice$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(chatNotice);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(chatNotice);
            if (this.LLILLJJLI.LLILZ) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AgeGraduationViewModel@d670.fetchTopNotice$1");
                return unit;
            }
            this.LLILLJJLI.LLILZ = true;
            TikTokImApi tikTokImApi = this.LLILLJJLI.LLILLL;
            int enumValue = C19212010Ec.LIZJ.LIZJ().getEnumValue();
            this.LL = 1;
            chatNotice = tikTokImApi.getChatNotice(true, "", "", "", 0, "inbox", -1, EnumC15556067e.PUSH_STATUS_UNKNOWN.getStatus(), false, EnumC15554067c.APP_STATUS_UNKNOWN.getStatus(), false, false, -1, enumValue, "", "", this);
            if (chatNotice == objLJFF) {
                C1C7U.LIZIZ("AgeGraduationViewModel@d670.fetchTopNotice$1");
                return objLJFF;
            }
        }
        ImChatNoticeModel imChatNoticeModel = (ImChatNoticeModel) chatNotice;
        List<IMNoticeMsgStruct> list = imChatNoticeModel.noticeMsgStructArr;
        if (list != null && !list.isEmpty()) {
            Iterator<IMNoticeMsgStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().noticeCode, "graduation_banner")) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.LLILLJJLI.LLJIJIL.put(this.LLILLL, Boolean.valueOf(z));
        C1231704rr c1231704rr = C1734106qh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationViewModel fetchTopNotice isOlderThan18 = ");
        sbLIZ.append(z);
        sbLIZ.append(" result = ");
        sbLIZ.append(imChatNoticeModel);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        AgeGraduationViewModel ageGraduationViewModel = this.LLILLJJLI;
        if (z) {
            ageGraduationViewModel.LLJ.postValue(new C15558067g(true));
        } else {
            ageGraduationViewModel.LLJ.postValue(null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AgeGraduationViewModel@d670.fetchTopNotice$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
