package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import okio.ByteString;

/* JADX INFO: renamed from: X.0I1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.SendMessageVM$realSendMessage$5", f = "SendMessageVM.kt", l = {383}, m = "invokeSuspend")
public final class C459830I1l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ BaseContent LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ C259800zU<ByteString> LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;
    public final /* synthetic */ ByteString LLIZLLLIL;
    public final /* synthetic */ ReferenceInfo LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C459830I1l(String str, BaseContent baseContent, Map<String, String> map, C259800zU<ByteString> c259800zU, Map<String, String> map2, Map<String, String> map3, ByteString byteString, ReferenceInfo referenceInfo, InterfaceC1364105Vn<? super C459830I1l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = baseContent;
        this.LLILZ = map;
        this.LLILZIL = c259800zU;
        this.LLILZLL = map2;
        this.LLIZ = map3;
        this.LLIZLLLIL = byteString;
        this.LLJ = referenceInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C459830I1l(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        C1C7U.LIZ("SendMessageVM@2f1e.realSendMessage$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            IIMCoreProxyService.LIZ.getClass();
            IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
            if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                C0YP2 c0yp2 = new C0YP2(new C1265504xJ(this.LLILLJJLI), C877840YcA.LIZ(this.LLILLL), new C459930I1v(C051M.LJ(this.LLILLL, false)), null, null, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLILZIL.element, C901060ZWm.LJ(this.LLILZ), null, this.LLJ, 13336);
                this.LL = 1;
                if (c0yozLJFF.LJFF(c0yp2, new C0IC5(null, 3), this) == objLJFF) {
                    C1C7U.LIZIZ("SendMessageVM@2f1e.realSendMessage$5");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SendMessageVM@2f1e.realSendMessage$5");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SendMessageVM@2f1e.realSendMessage$5");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
