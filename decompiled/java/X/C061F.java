package X;

import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.061F, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.service.IMInboxBatchActionServiceImpl$batchMobChatListFeedbackByConvList$1", f = "IMInboxBatchActionServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C061F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ List<C0Y8T> LLILLL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C061F(InterfaceC879010Ye3 interfaceC879010Ye3, String str, String str2, List list, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = list;
        this.LLILZ = interfaceC879010Ye3;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        boolean z = this.LLILLJJLI;
        C061F c061f = new C061F(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLILLL, interfaceC1364105Vn, z);
        c061f.LL = obj;
        return c061f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMInboxBatchActionServiceImpl@e929.batchMobChatListFeedbackByConvList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList<C0Y8T> arrayList = new ArrayList();
        if (!this.LLILLJJLI) {
            List<C0Y8T> list = this.LLILLL;
            InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILZ;
            String str = this.LLILZIL;
            String str2 = this.LLILZLL;
            for (C0Y8T c0y8t : list) {
                AnonymousClass0617 anonymousClass0617 = new AnonymousClass0617(C0YM2.TIKTOK_SOCIAL_IM, c0y8t.getConversationId());
                IChatListEngine.LIZ.getClass();
                C879540Yeu<?> c879540YeuLJII = C884160YmM.LIZ().LJII(anonymousClass0617, interfaceC879010Ye3);
                if (c879540YeuLJII != null) {
                    C885310YoD.LIZ.getClass();
                    C885310YoD.LJJIFFI(c879540YeuLJII, interfaceC879010Ye3, str, "multiple", str2, null);
                } else {
                    arrayList.add(c0y8t);
                }
            }
        } else {
            Boolean.valueOf(arrayList.addAll(this.LLILLL));
        }
        String str3 = this.LLILZIL;
        InterfaceC879010Ye3 interfaceC879010Ye32 = this.LLILZ;
        String str4 = this.LLILZLL;
        boolean z = this.LLILLJJLI;
        for (C0Y8T c0y8t2 : arrayList) {
            C885310YoD.LIZ.getClass();
            C885310YoD.LJJI(str3, "multiple", interfaceC879010Ye32, c0y8t2, str4, null, z);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMInboxBatchActionServiceImpl@e929.batchMobChatListFeedbackByConvList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
