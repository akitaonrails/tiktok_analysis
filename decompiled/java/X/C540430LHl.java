package X;

import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.ui.ImageEditRootScene$nextToPublish$2", f = "ImageEditRootScene.kt", l = {2672}, m = "invokeSuspend")
public final class C540430LHl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ImageEditRootScene LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540430LHl(ImageEditRootScene imageEditRootScene, InterfaceC1364105Vn<? super C540430LHl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = imageEditRootScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C540430LHl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageEditRootScene@a14e.nextToPublish$2");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C540420LHk c540420LHk = new C540420LHk(this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c540420LHk) == objLJFF) {
                C1C7U.LIZIZ("ImageEditRootScene@a14e.nextToPublish$2");
                return objLJFF;
            }
        }
        ImageEditRootScene imageEditRootScene = this.LLILLJJLI;
        InterfaceC559500Lwy interfaceC559500Lwy = imageEditRootScene.LLLLLJIL;
        if (interfaceC559500Lwy != null) {
            interfaceC559500Lwy.wQ1();
        }
        imageEditRootScene.LLLZZIL(new AwS552S0100000_8(imageEditRootScene, 933), true, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditRootScene@a14e.nextToPublish$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
