package X;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.model.ShortTouchPreviewSetting;
import com.bytedance.android.livesdk.model.message.ext.ECShortItemRefreshMessage;
import com.bytedance.android.livesdk.model.message.ext.ShortItemRefreshEntity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.EcAnchorApi;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.RefreshShortTouchResponse;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api.ShortTouch;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vQG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onMessage$9", f = "ECDuringLiveBroadcasterWidget.kt", l = {663}, m = "invokeSuspend")
public final class C1741620vQG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ IMessage LLILZ;
    public final /* synthetic */ C180M LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741620vQG(String str, String str2, IMessage iMessage, C180M c180m, InterfaceC1364105Vn<? super C1741620vQG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = iMessage;
        this.LLILZIL = c180m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1741620vQG(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<String> list;
        Integer numLJ;
        long jIntValue;
        RefreshShortTouchResponse refreshShortTouchResponse;
        List<ShortTouch> list2;
        Uri uri;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner;
        Object objLIZJ = obj;
        C1C7U.LIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$9");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZJ);
            AnonymousClass1880 anonymousClass1880 = EcAnchorApi.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            ShortItemRefreshEntity shortItemRefreshEntity = ((ECShortItemRefreshMessage) this.LLILZ).entity;
            if (shortItemRefreshEntity != null) {
                list = shortItemRefreshEntity.refreshItems;
            } else {
                list = null;
            }
            C180M c180m = this.LLILZIL;
            if (shortItemRefreshEntity != null) {
                numLJ = C2286608xc.LJ(shortItemRefreshEntity.interval);
            } else {
                numLJ = null;
            }
            int iIntValue = ((Number) this.LLILZIL.LLJJJJJIL.getValue()).intValue();
            c180m.getClass();
            if (numLJ != null) {
                jIntValue = numLJ.intValue();
            } else {
                jIntValue = 0;
            }
            long jLJIIJJI = C13LZ.LJIIJJI(AbstractC19994813Le.Default, new C354710DvR(0L, jIntValue)) + ((long) iIntValue);
            this.LL = 1;
            objLIZJ = anonymousClass1880.LIZJ(jLJIIJJI, str, str2, list, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$9");
                return objLJFF;
            }
        }
        BaseResponse baseResponse = (BaseResponse) objLIZJ;
        if (baseResponse != null && (refreshShortTouchResponse = (RefreshShortTouchResponse) baseResponse.getData()) != null && (list2 = refreshShortTouchResponse.shortTouchItems) != null) {
            C180M c180m2 = this.LLILZIL;
            InterfaceC1087010eOR interfaceC1087010eORLJIIJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJIIJ();
            if (interfaceC1087010eORLJIIJ != null) {
                for (ShortTouch shortTouch : list2) {
                    Context context = c180m2.LLILZ;
                    EnumC1101860emO enumC1101860emO = EnumC1101860emO.NAME;
                    String strValueOf = String.valueOf(shortTouch.name);
                    Uri uri2 = UriProtector.parse(shortTouch.uri);
                    String strValueOf2 = String.valueOf(shortTouch.name);
                    ShortTouchPreviewSetting shortTouchPreviewSetting = shortTouch.previewSetting;
                    if (shortTouchPreviewSetting != null && shortTouchPreviewSetting.previewSchema != null) {
                        uri = UriProtector.parse(shortTouchPreviewSetting.previewSchema);
                    } else {
                        uri = null;
                    }
                    InterfaceC21213717zz interfaceC21213717zz = c180m2.LLILLJJLI;
                    if (interfaceC21213717zz != null && (lifecycleOwner = interfaceC21213717zz.getLifecycleOwner()) != null) {
                        lifecycle = lifecycleOwner.getLifecycle();
                    } else {
                        lifecycle = null;
                    }
                    interfaceC1087010eORLJIIJ.be(context, enumC1101860emO, strValueOf, uri2, strValueOf2, uri, true, lifecycle);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$9");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
