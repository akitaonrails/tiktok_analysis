package X;

import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.061G, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.service.IMInboxBatchActionServiceImpl$batchMobChatListFeedbackByConvIdList$1", f = "IMInboxBatchActionServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C061G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C061G(InterfaceC879010Ye3 interfaceC879010Ye3, String str, String str2, List list, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = interfaceC879010Ye3;
        this.LLILZ = list;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        boolean z = this.LLILLJJLI;
        C061G c061g = new C061G(this.LLILLL, this.LLILZIL, this.LLILZLL, this.LLILZ, interfaceC1364105Vn, z);
        c061g.LL = obj;
        return c061g;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC879010Ye3 interfaceC879010Ye3;
        C1C7U.LIZ("IMInboxBatchActionServiceImpl@e929.batchMobChatListFeedbackByConvIdList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList();
        if (!this.LLILLJJLI && (interfaceC879010Ye3 = this.LLILLL) != null) {
            List<String> list = this.LLILZ;
            String str = this.LLILZIL;
            String str2 = this.LLILZLL;
            for (String str3 : list) {
                AnonymousClass0617 anonymousClass0617 = new AnonymousClass0617(C0YM2.TIKTOK_SOCIAL_IM, str3);
                IChatListEngine.LIZ.getClass();
                C879540Yeu<?> c879540YeuLJII = C884160YmM.LIZ().LJII(anonymousClass0617, interfaceC879010Ye3);
                if (c879540YeuLJII != null) {
                    C885310YoD.LIZ.getClass();
                    C885310YoD.LJJIFFI(c879540YeuLJII, interfaceC879010Ye3, str, "multiple", str2, null);
                } else {
                    arrayList.add(str3);
                }
            }
        } else {
            Boolean.valueOf(arrayList.addAll(this.LLILZ));
        }
        List<C0Y8T> listLJIJJ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIJJ(arrayList);
        String str4 = this.LLILZIL;
        InterfaceC879010Ye3 interfaceC879010Ye32 = this.LLILLL;
        String str5 = this.LLILZLL;
        boolean z = this.LLILLJJLI;
        for (C0Y8T c0y8t : listLJIJJ) {
            C885310YoD.LIZ.getClass();
            C885310YoD.LJJI(str4, "multiple", interfaceC879010Ye32, c0y8t, str5, null, z);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMInboxBatchActionServiceImpl@e929.batchMobChatListFeedbackByConvIdList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
