package X;

import android.graphics.Rect;
import android.view.TextureView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JNX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerVideoLayout$tryResizeView$1$onGlobalLayout$1$1", f = "PlayerVideoLayout.kt", l = {103}, m = "invokeSuspend")
public final class C0JNX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0JNZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JNX(C0JNZ c0jnz, InterfaceC1364105Vn<? super C0JNX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0jnz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JNX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int left;
        int top;
        int right;
        C1C7U.LIZ("PlayerVideoLayout@b176.tryResizeView$1$onGlobalLayout$1$1");
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
            C05YC<Rect> c05yc = this.LLILLJJLI.getPlayerChannel().LJIILIIL;
            TextureView videoTexture = this.LLILLJJLI.getVideoTexture();
            int bottom = 0;
            if (videoTexture != null) {
                left = videoTexture.getLeft();
            } else {
                left = 0;
            }
            TextureView videoTexture2 = this.LLILLJJLI.getVideoTexture();
            if (videoTexture2 != null) {
                top = videoTexture2.getTop();
            } else {
                top = 0;
            }
            TextureView videoTexture3 = this.LLILLJJLI.getVideoTexture();
            if (videoTexture3 != null) {
                right = videoTexture3.getRight();
            } else {
                right = 0;
            }
            TextureView videoTexture4 = this.LLILLJJLI.getVideoTexture();
            if (videoTexture4 != null) {
                bottom = videoTexture4.getBottom();
            }
            Rect rect = new Rect(left, top, right, bottom);
            this.LL = 1;
            if (c05yc.emit(rect, this) == objLJFF) {
                C1C7U.LIZIZ("PlayerVideoLayout@b176.tryResizeView$1$onGlobalLayout$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerVideoLayout@b176.tryResizeView$1$onGlobalLayout$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
