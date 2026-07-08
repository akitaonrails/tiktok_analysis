package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.CreatorLastNewMessageResponse;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.CreatorMessageApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel$onRefresh$2$creatorAsync$1", f = "SellerMessageListViewModel.kt", l = {248}, m = "invokeSuspend")
public final class C1751340vfw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1751370vfz>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;

    public C1751340vfw(InterfaceC1364105Vn<? super C1751340vfw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1751340vfw(interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, X.0vfz] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        C1C7U.LIZ("SellerMessageListViewModel@16a7.onRefresh$2$creatorAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = new C259800zU();
            if (C0BLW.LIZIZ) {
                this.LL = c259800zU;
                this.LLILLJJLI = 1;
                obj = CreatorMessageApi.LIZ.LIZ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SellerMessageListViewModel@16a7.onRefresh$2$creatorAsync$1");
                    return objLJFF;
                }
            }
            T t = c259800zU.element;
            C1C7U.LIZIZ("SellerMessageListViewModel@16a7.onRefresh$2$creatorAsync$1");
            return t;
        }
        CreatorLastNewMessageResponse creatorLastNewMessageResponse = (CreatorLastNewMessageResponse) obj;
        if (creatorLastNewMessageResponse != null && Intrinsics.LJFF(creatorLastNewMessageResponse.showEntrance, true)) {
            String str = creatorLastNewMessageResponse.title;
            String str2 = creatorLastNewMessageResponse.avatarUrl;
            String str3 = creatorLastNewMessageResponse.schema;
            c259800zU.element = new C1751370vfz(creatorLastNewMessageResponse.needBold, creatorLastNewMessageResponse.lastMessageTime, str, str2, str3, creatorLastNewMessageResponse.lastMessage);
        }
        T t2 = c259800zU.element;
        C1C7U.LIZIZ("SellerMessageListViewModel@16a7.onRefresh$2$creatorAsync$1");
        return t2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1751370vfz> interfaceC1364105Vn) {
        return new C1751340vfw(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
