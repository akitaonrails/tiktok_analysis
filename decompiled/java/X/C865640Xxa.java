package X;

import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingPersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingTransientExt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS54S1300000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Xxa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationExtensionManager$upsertSettingBizExt$$inlined$scopedIO$1", f = "DefaultConversationExtensionManager.kt", l = {73}, m = "invokeSuspend")
public final class C865640Xxa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C0Y8T>>, Object> {
    public int LL;
    public final /* synthetic */ C0Y01 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ BizConvSettingPersistentExt LLILZ;
    public final /* synthetic */ BizConvSettingTransientExt LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865640Xxa(InterfaceC1364105Vn interfaceC1364105Vn, C0Y01 c0y01, String str, BizConvSettingPersistentExt bizConvSettingPersistentExt, BizConvSettingTransientExt bizConvSettingTransientExt) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0y01;
        this.LLILLL = str;
        this.LLILZ = bizConvSettingPersistentExt;
        this.LLILZIL = bizConvSettingTransientExt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865640Xxa(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<C0Y8T>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultConversationExtensionManager@ecdd.upsertSettingBizExt$$inlined$scopedIO$1");
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
            AwS54S1300000_14 awS54S1300000_14 = new AwS54S1300000_14(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, 1);
            this.LL = 1;
            obj = C867000Xzm.LIZ(this, awS54S1300000_14);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultConversationExtensionManager@ecdd.upsertSettingBizExt$$inlined$scopedIO$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultConversationExtensionManager@ecdd.upsertSettingBizExt$$inlined$scopedIO$1");
        return obj;
    }
}
