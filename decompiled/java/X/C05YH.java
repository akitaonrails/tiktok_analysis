package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05YH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.fragment.ImportDeviceSoundsFragment$batchReadC2PALocalSounds$2$1$asyncTask$1", f = "ImportDeviceSoundsFragment.kt", l = {172}, m = "invokeSuspend")
public final class C05YH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AIGCInfo>, Object> {
    public int LL;
    public final /* synthetic */ MediaModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05YH(MediaModel mediaModel, InterfaceC1364105Vn<? super C05YH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05YH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImportDeviceSoundsFragment@5e82.batchReadC2PALocalSounds$2$1$asyncTask$1");
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
            C140D c140d = C140D.LIZ;
            MediaModel mediaModel = this.LLILLJJLI;
            this.LL = 1;
            obj = C140D.LJJIJIIJIL(c140d, mediaModel, 0L, this, 6);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ImportDeviceSoundsFragment@5e82.batchReadC2PALocalSounds$2$1$asyncTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ImportDeviceSoundsFragment@5e82.batchReadC2PALocalSounds$2$1$asyncTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AIGCInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
