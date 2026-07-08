package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01sk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3PanelCell$bindThumbnail$1", f = "SearchKeyframeOptDir3PanelAssem.kt", l = {124}, m = "invokeSuspend")
public final class C472801sk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ C473201so LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C472801sk(Bitmap bitmap, C473201so c473201so, InterfaceC1364105Vn<? super C472801sk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bitmap;
        this.LLILLL = c473201so;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C472801sk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchKeyframeOptDir3PanelCell@db90.bindThumbnail$1");
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
            C099G c099gLIZ = C397801ge.LIZ(this.LLILLJJLI, this.LLILLL.LL);
            this.LL = 1;
            obj = c099gLIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchKeyframeOptDir3PanelCell@db90.bindThumbnail$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.LLILLL.LL.setImageBitmap(bitmap);
        } else {
            this.LLILLL.LL.setImageDrawable(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchKeyframeOptDir3PanelCell@db90.bindThumbnail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
