package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0644, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerSceneKotlinAdapterKt$videoEdit$1", f = "VideoEditContainerSceneKotlinAdapter.kt", l = {381}, m = "invokeSuspend")
public final class AnonymousClass0644 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ List<MediaModel> LLILLL;
    public final /* synthetic */ Intent LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass0644(C19EG c19eg, List<? extends MediaModel> list, Intent intent, Function0<Unit> function0, InterfaceC1364105Vn<? super AnonymousClass0644> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = list;
        this.LLILZ = intent;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0644(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoEditContainerSceneKotlinAdapterKt@e554.videoEdit$1");
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
            AnonymousClass0643 anonymousClass0643 = new AnonymousClass0643(this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, anonymousClass0643) == objLJFF) {
                C1C7U.LIZIZ("VideoEditContainerSceneKotlinAdapterKt@e554.videoEdit$1");
                return objLJFF;
            }
        }
        C0L7R c0l7rLIZ = C0CHQ.LIZ().LJJJJLL().LIZ(this.LLILLJJLI, 1000L, 3600000L, true, null);
        List<MediaModel> list = this.LLILLL;
        Intent intent = this.LLILZ;
        c0l7rLIZ.LIZIZ(list, intent, intent, null, this.LLILZIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoEditContainerSceneKotlinAdapterKt@e554.videoEdit$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
