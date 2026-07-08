package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0MHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$createSingleImagePrepareTaskFlow$2", f = "ForwardOnThisDayEnvironment.kt", l = {}, m = "invokeSuspend")
public final class C565840MHe extends C09AX implements Function2<C0MMG, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Pair<? extends C0MMG, ? extends CanvasVideoData>>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreativeModel LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C565840MHe(CreativeModel creativeModel, CreativeInfo creativeInfo, InterfaceC1364105Vn<? super C565840MHe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creativeModel;
        this.LLILLL = creativeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C565840MHe c565840MHe = new C565840MHe(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c565840MHe.LL = obj;
        return c565840MHe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ForwardOnThisDayEnvironment@5609.createSingleImagePrepareTaskFlow$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0MMG c0mmg = (C0MMG) this.LL;
        boolean zLIZ = C566780MKu.LIZ(this.LLILLJJLI);
        C0MKJ c0mkj = C0MKJ.LIZ;
        CreativeInfo creativeInfo = this.LLILLL;
        c0mkj.getClass();
        b bVarLJ = C09IC.LJ(new C0MLW(creativeInfo, zLIZ, c0mmg, null));
        C1C7U.LIZIZ("ForwardOnThisDayEnvironment@5609.createSingleImagePrepareTaskFlow$2");
        return bVarLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0MMG c0mmg, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Pair<? extends C0MMG, ? extends CanvasVideoData>>> interfaceC1364105Vn) {
        return ((a) create(c0mmg, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
