package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.image.bottombar.CommentImageEditBottomBarComponent$saveTask$2", f = "CommentImageEditBottomBarComponent.kt", l = {303}, m = "invokeSuspend")
public final class C0NTK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1451860nsu LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C259800zU<InterfaceC1155720gBG> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NTK(C1451860nsu c1451860nsu, boolean z, C259800zU<InterfaceC1155720gBG> c259800zU, InterfaceC1364105Vn<? super C0NTK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1451860nsu;
        this.LLILLL = z;
        this.LLILZ = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NTK(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T t;
        C1C7U.LIZ("CommentImageEditBottomBarComponent@a28c.saveTask$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                t = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1451860nsu c1451860nsu = this.LLILLJJLI;
            Activity activity = c1451860nsu.getActivity();
            VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI.v5().videoPublishEditModel;
            boolean z = this.LLILLL;
            this.LL = 1;
            Object objN5 = c1451860nsu.N5(activity, videoPublishEditModel, z, this);
            t = objN5;
            if (objN5 == objLJFF) {
                C1C7U.LIZIZ("CommentImageEditBottomBarComponent@a28c.saveTask$2");
                return objLJFF;
            }
        }
        this.LLILZ.element = t;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentImageEditBottomBarComponent@a28c.saveTask$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
