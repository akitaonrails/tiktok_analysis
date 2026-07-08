package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel$addPictureFile$1$1", f = "SceneryPictureViewModel.kt", l = {229}, m = "invokeSuspend")
public final class C492810JUh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SceneryPictureViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ LiveSubMediaModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492810JUh(SceneryPictureViewModel sceneryPictureViewModel, Context context, LiveSubMediaModel liveSubMediaModel, InterfaceC1364105Vn<? super C492810JUh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sceneryPictureViewModel;
        this.LLILLL = context;
        this.LLILZ = liveSubMediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C492810JUh(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SceneryPictureViewModel@1920.addPictureFile$1$1");
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
            SceneryPictureViewModel sceneryPictureViewModel = this.LLILLJJLI;
            Context context = this.LLILLL;
            LiveSubMediaModel liveSubMediaModel = this.LLILZ;
            this.LL = 1;
            obj = sceneryPictureViewModel.vQ2(context, liveSubMediaModel, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SceneryPictureViewModel@1920.addPictureFile$1$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            SceneryPictureViewModel sceneryPictureViewModel2 = this.LLILLJJLI;
            sceneryPictureViewModel2.getClass();
            sceneryPictureViewModel2.withState(new C1818550xQL(sceneryPictureViewModel2, bitmap));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SceneryPictureViewModel@1920.addPictureFile$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
