package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZQM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.IMMediaRefactorUtils$buildPhoto2Sticker$1$1", f = "IMMediaRefactorUtils.kt", l = {355, 358}, m = "invokeSuspend")
public final class C0ZQM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Photo2StickerViewModel LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ C869590Y9l LLILZIL;
    public final /* synthetic */ InterfaceC889250YuZ LLILZLL;
    public final /* synthetic */ C0ZSY LLIZ;
    public final /* synthetic */ Activity LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZQM(Photo2StickerViewModel photo2StickerViewModel, View view, C869590Y9l c869590Y9l, InterfaceC889250YuZ interfaceC889250YuZ, C0ZSY c0zsy, Activity activity, InterfaceC1364105Vn<? super C0ZQM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = photo2StickerViewModel;
        this.LLILZ = view;
        this.LLILZIL = c869590Y9l;
        this.LLILZLL = interfaceC889250YuZ;
        this.LLIZ = c0zsy;
        this.LLIZLLLIL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0ZQM c0zqm = new C0ZQM(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c0zqm.LLILLJJLI = obj;
        return c0zqm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Object objMo242getMediaModelFromPhotoMessage0E7RQCE;
        C1C7U.LIZ("IMMediaRefactorUtils@4f43.buildPhoto2Sticker$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMMediaRefactorUtils@4f43.buildPhoto2Sticker$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
            objMo242getMediaModelFromPhotoMessage0E7RQCE = ((C189200o6) obj).m10unboximpl();
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            Photo2StickerViewModel photo2StickerViewModel = this.LLILLL;
            Context context = this.LLILZ.getContext();
            C869590Y9l c869590Y9l = this.LLILZIL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            objMo242getMediaModelFromPhotoMessage0E7RQCE = photo2StickerViewModel.mo242getMediaModelFromPhotoMessage0E7RQCE(context, c869590Y9l, this);
            if (objMo242getMediaModelFromPhotoMessage0E7RQCE == objLJFF) {
                C1C7U.LIZIZ("IMMediaRefactorUtils@4f43.buildPhoto2Sticker$1$1");
                return objLJFF;
            }
        }
        if (!C2296808zG.LJI(interfaceC497601wk)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IMMediaRefactorUtils@4f43.buildPhoto2Sticker$1$1");
            return unit2;
        }
        this.LLILZLL.hide();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
        C0ZQN c0zqn = new C0ZQN(objMo242getMediaModelFromPhotoMessage0E7RQCE, this.LLILLL, this.LLIZ, this.LLIZLLLIL, this.LLILZ, null);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pqLLIILII, c0zqn) == objLJFF) {
            C1C7U.LIZIZ("IMMediaRefactorUtils@4f43.buildPhoto2Sticker$1$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("IMMediaRefactorUtils@4f43.buildPhoto2Sticker$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
