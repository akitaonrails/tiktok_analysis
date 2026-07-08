package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.model.GetStickerParam;
import com.ss.android.ugc.aweme.im.sticker.api.model.GetStickerRequest;
import com.ss.android.ugc.aweme.im.sticker.api.model.GetStickerResp;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.MixStudioFlowController;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareFragment;
import com.ss.android.ugc.aweme.stickerstore.api.StickerApiV2;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.MixStudioFlowController$launchMixStudioSharePanel$1", f = "MixStudioFlowController.kt", l = {330}, m = "invokeSuspend")
public final class C441590HTh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ MixStudioFlowController LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ FragmentManager LLIZ;
    public final /* synthetic */ EnumC441640HTm LLIZLLLIL;
    public final /* synthetic */ C0HSR LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441590HTh(Integer num, Long l, String str, MixStudioFlowController mixStudioFlowController, Context context, FragmentManager fragmentManager, EnumC441640HTm enumC441640HTm, C0HSR c0hsr, InterfaceC1364105Vn<? super C441590HTh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = num;
        this.LLILLL = l;
        this.LLILZ = str;
        this.LLILZIL = mixStudioFlowController;
        this.LLILZLL = context;
        this.LLIZ = fragmentManager;
        this.LLIZLLLIL = enumC441640HTm;
        this.LLJ = c0hsr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C441590HTh(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        long jLongValue;
        StickerItem stickerItem;
        C1C7U.LIZ("MixStudioFlowController@3326.launchMixStudioSharePanel$1");
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
            StickerApiV2 stickerApiV2LIZIZ = C452670Hp3.LIZIZ();
            Integer num = this.LLILLJJLI;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLJ = C2286608xc.LJ(iIntValue);
            Long l = this.LLILLL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            GetStickerRequest getStickerRequest = new GetStickerRequest(Collections.singletonList(new GetStickerParam(numLJ, C2286608xc.LJFF(jLongValue), this.LLILZ)), C454510Hs1.LIZ());
            this.LL = 1;
            obj = stickerApiV2LIZIZ.LJIILJJIL(getStickerRequest, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixStudioFlowController@3326.launchMixStudioSharePanel$1");
                return objLJFF;
            }
        }
        List<StickerItem> stickers = ((GetStickerResp) obj).getStickers();
        if (stickers != null && (stickerItem = (StickerItem) C13LP.LJJJLL(stickers)) != null) {
            MixStudioFlowController mixStudioFlowController = this.LLILZIL;
            Context context = this.LLILZLL;
            FragmentManager fragmentManager = this.LLIZ;
            EnumC441640HTm enumC441640HTm = this.LLIZLLLIL;
            C0HSR c0hsr = this.LLJ;
            mixStudioFlowController.getClass();
            new MixStudioShareFragment().UR(context, fragmentManager, stickerItem, enumC441640HTm, c0hsr);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MixStudioFlowController@3326.launchMixStudioSharePanel$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioFlowController@3326.launchMixStudioSharePanel$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
