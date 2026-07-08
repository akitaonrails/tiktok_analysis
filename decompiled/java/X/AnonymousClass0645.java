package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0645, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.C2PAAIGCManager$retryTasksFromKeva$1$1$1$1", f = "C2PAAIGCManager.kt", l = {308}, m = "invokeSuspend")
public final class AnonymousClass0645 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C140D LLILLJJLI;
    public final /* synthetic */ MediaModel LLILLL;
    public final /* synthetic */ CreativeInfo LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0645(C140D c140d, MediaModel mediaModel, CreativeInfo creativeInfo, String str, InterfaceC1364105Vn<? super AnonymousClass0645> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c140d;
        this.LLILLL = mediaModel;
        this.LLILZ = creativeInfo;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0645(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("C2PAAIGCManager@54f1.retryTasksFromKeva$1$1$1$1");
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
            C140D c140d = this.LLILLJJLI;
            MediaModel mediaModel = this.LLILLL;
            CreativeInfo creativeInfo = this.LLILZ;
            String str = this.LLILZIL;
            this.LL = 1;
            c140d.getClass();
            if (c140d.LJIILJJIL(mediaModel, creativeInfo, C140D.LJIIZILJ(), str, this) == objLJFF) {
                C1C7U.LIZIZ("C2PAAIGCManager@54f1.retryTasksFromKeva$1$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("C2PAAIGCManager@54f1.retryTasksFromKeva$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
