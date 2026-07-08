package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.photo.ECDynamicPhotoStickerManager$requestDynamicPhotoStickersIfNeeded$1", f = "ECDynamicPhotoStickerManager.kt", l = {47}, m = "invokeSuspend")
public final class C506701yD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ Function1<String, Unit> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C506701yD(Aweme aweme, Function1<? super String, Unit> function1, String str, InterfaceC1364105Vn<? super C506701yD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = function1;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C506701yD(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECDynamicPhotoStickerManager@bdef.requestDynamicPhotoStickersIfNeeded$1");
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
            C21270718Lx c21270718Lx = C21270718Lx.LIZ;
            Aweme aweme = this.LLILLJJLI;
            this.LL = 1;
            obj = c21270718Lx.LJFF(aweme, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ECDynamicPhotoStickerManager@bdef.requestDynamicPhotoStickersIfNeeded$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.LLILLL.invoke(this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECDynamicPhotoStickerManager@bdef.requestDynamicPhotoStickersIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
