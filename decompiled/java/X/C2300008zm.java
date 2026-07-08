package X;

import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.avatar.ChangAvatarActionStage$loadResourceAndPublish$1$infoStickerJob$1", f = "ChangAvatarActionStage.kt", l = {218}, m = "invokeSuspend")
public final class C2300008zm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends TextStickerData.Pair<? extends C348460DlM, ? extends StickerItemModel>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1465460oEq LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2300008zm(C1465460oEq c1465460oEq, InterfaceC1364105Vn<? super C2300008zm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1465460oEq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2300008zm c2300008zm = new C2300008zm(this.LLILLL, interfaceC1364105Vn);
        c2300008zm.LLILLJJLI = obj;
        return c2300008zm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChangAvatarActionStage@89ff.loadResourceAndPublish$1$infoStickerJob$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1465460oEq c1465460oEq = this.LLILLL;
            this.LL = 1;
            c1465460oEq.getClass();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            ChangeAvatarModel changeAvatarModel = c1465460oEq.LIZIZ.creativeModel.changeAvatarModel;
            if (!changeAvatarModel.isFromSocialAvatar && !changeAvatarModel.skipDecorativeInfoStickers) {
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C2299908zl(c1465460oEq, c23260099m, null), 3);
            } else {
                C13BV c13bv = C13BV.INSTANCE;
                C189200o6.m2constructorimpl(c13bv);
                c23260099m.resumeWith(c13bv);
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChangAvatarActionStage@89ff.loadResourceAndPublish$1$infoStickerJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ChangAvatarActionStage@89ff.loadResourceAndPublish$1$infoStickerJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends TextStickerData.Pair<? extends C348460DlM, ? extends StickerItemModel>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
