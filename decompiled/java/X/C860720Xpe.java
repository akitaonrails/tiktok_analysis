package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xpe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.post.SocialAvatarStickerView$showTapIntro$2", f = "SocialAvatarStickerView.kt", l = {146}, m = "invokeSuspend")
public final class C860720Xpe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ C19595711lb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860720Xpe(LifecycleOwner lifecycleOwner, C19595711lb c19595711lb, InterfaceC1364105Vn<? super C860720Xpe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = c19595711lb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860720Xpe(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarStickerView@cf22.showTapIntro$2");
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
            Lifecycle lifecycle = this.LLILLJJLI.getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C860730Xpf c860730Xpf = new C860730Xpf(this.LLILLL, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c860730Xpf, this) == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarStickerView@cf22.showTapIntro$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarStickerView@cf22.showTapIntro$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
