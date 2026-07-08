package X;

import com.bytedance.android.livesdk.CampaignProgressChannel;
import com.bytedance.android.livesdk.gift.model.GiftCampaignProgress;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftStrategyData;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fUC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafV2$requestGiftListAndGiftGallery$1$deferredGiftList$1", f = "GiftPanelLeafV2.kt", l = {5509}, m = "invokeSuspend")
public final class C1129020fUC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends GiftPage>>, Object> {
    public int LL;
    public final /* synthetic */ C1128710fTh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129020fUC(C1128710fTh c1128710fTh, InterfaceC1364105Vn<? super C1129020fUC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1128710fTh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1129020fUC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0fUZ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftPanelLeafV2@f893.requestGiftListAndGiftGallery$1$deferredGiftList$1");
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
            final C1128710fTh c1128710fTh = this.LLILLJJLI;
            this.LL = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            ?? r2 = new AbstractC1132980faa() { // from class: X.0fUZ
                @Override // X.AbstractC1132980faa
                public final void LIZIZ(List<Gift> list) {
                }

                @Override // X.AbstractC1132980faa
                public final void LIZLLL() {
                }

                @Override // X.AbstractC1132980faa
                public final void LIZ(int i2, String str) {
                    c1128710fTh.LJJLL(i2, str);
                }

                @Override // X.AbstractC1132980faa
                public final void LIZJ(List list, GiftsInfo giftsInfo, GiftStrategyData giftStrategyData, long j, int i2) {
                    GiftCampaignProgress giftCampaignProgress;
                    GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ;
                    DataChannel dataChannel;
                    C20441214yg.LJIIIZ("TagGiftGallery", "giftList completed");
                    if (giftsInfo != null && (giftCampaignProgress = giftsInfo.giftCampaignProgress) != null && (giftLeafRootViewModelLJJLIIIJJIZ = c1128710fTh.LJJLIIIJJIZ()) != null && (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ.LL) != null) {
                        dataChannel.zW(CampaignProgressChannel.class, giftCampaignProgress);
                    }
                    InterfaceC20236714Gf<List<? extends GiftPage>> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(list);
                    interfaceC20236714Gf.resumeWith(list);
                }
            };
            C20441214yg.LJIIIZ("TagGiftGallery", "giftList started");
            c1128710fTh.LJJJLZIJ(3, r2);
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GiftPanelLeafV2@f893.requestGiftListAndGiftGallery$1$deferredGiftList$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.requestGiftListAndGiftGallery$1$deferredGiftList$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends GiftPage>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
