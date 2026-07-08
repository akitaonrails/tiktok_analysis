package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.protocols.StoryReactionProtocolKt$buildStoreStickerFavouriteAction$1$1", f = "StoryReactionProtocol.kt", l = {233}, m = "invokeSuspend")
public final class C454610HsB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C454610HsB(View view, Long l, C869590Y9l c869590Y9l, String str, Integer num, String str2, InterfaceC1364105Vn<? super C454610HsB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = l;
        this.LLILZ = c869590Y9l;
        this.LLILZIL = str;
        this.LLILZLL = num;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C454610HsB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        int value;
        int i;
        C1C7U.LIZ("StoryReactionProtocolKt@148c.buildStoreStickerFavouriteAction$1$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C454640HsE c454640HsE = IMStickerApi.LIZ;
            View view = this.LLILLJJLI;
            IMStickerApi iMStickerApiLIZ = c454640HsE.LIZ();
            if (iMStickerApiLIZ == null) {
                if (C457760HxG.LIZJ()) {
                    HandlerHook.viewPost(view, new RunnableC1413105g1(view));
                }
                iMStickerApiLIZ = C453610HqZ.LIZIZ;
            }
            InterfaceC447740Hh6 imStickerStoreService = iMStickerApiLIZ.getImStickerStoreService();
            Long l = this.LLILLL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            StickerTemplate stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(this.LLILZ, StickerTemplate.class);
            if (stickerTemplate != null) {
                value = stickerTemplate.stickerCreateScene;
            } else {
                value = C0IBD.StickerCreateScene_Unknown.getValue();
            }
            StickerTemplate stickerTemplate2 = (StickerTemplate) C0Z2Z.LIZ(this.LLILZ, StickerTemplate.class);
            if (stickerTemplate2 != null) {
                i = stickerTemplate2.stickerVariant;
            } else {
                StickerVariant.Companion.getClass();
                i = 0;
            }
            View view2 = this.LLILLJJLI;
            String str = this.LLILZIL;
            int iIntValue = this.LLILZLL.intValue();
            String str2 = this.LLIZ;
            Integer numLJ = C2286608xc.LJ(i);
            this.LL = 1;
            if (imStickerStoreService.LJJIIZ("reaction_view_store_button", view2, jLongValue, str, iIntValue, str2, null, null, false, value, numLJ, null, EnumC441530HTb.TOP, false, this) == objLJFF) {
                C1C7U.LIZIZ("StoryReactionProtocolKt@148c.buildStoreStickerFavouriteAction$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryReactionProtocolKt@148c.buildStoreStickerFavouriteAction$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
