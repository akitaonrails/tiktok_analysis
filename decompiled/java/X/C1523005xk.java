package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.ImportDeviceSoundsFragment;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.fragment.ImportDeviceSoundsFragment$batchReadC2PALocalSounds$2", f = "ImportDeviceSoundsFragment.kt", l = {176}, m = "invokeSuspend")
public final class C1523005xk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AIGCInfo>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ImportDeviceSoundsFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1523005xk(ImportDeviceSoundsFragment importDeviceSoundsFragment, InterfaceC1364105Vn<? super C1523005xk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = importDeviceSoundsFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1523005xk c1523005xk = new C1523005xk(this.LLILLL, interfaceC1364105Vn);
        c1523005xk.LLILLJJLI = obj;
        return c1523005xk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZJ = obj;
        C1C7U.LIZ("ImportDeviceSoundsFragment@5e82.batchReadC2PALocalSounds$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZJ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (!C275770ArP.LIZ()) {
                C1C7U.LIZIZ("ImportDeviceSoundsFragment@5e82.batchReadC2PALocalSounds$2");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (MusicModel musicModel : this.LLILLL.LLJJJIL) {
                MediaModel mediaModel = new MediaModel(UUID.randomUUID().toString());
                mediaModel.LJIILL(musicModel.getLocalPath());
                musicModel.setAigcInfo(new AIGCInfo(0, null, null, mediaModel.id, null, Boolean.valueOf(mediaModel.LJIIJ()), null, null, null, null, null, null, null, false, false, null, false, 131031, null));
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C05YH(mediaModel, null), 3));
            }
            C140D.LIZ.getClass();
            long jLongValue = ((Number) C140D.LJFF.getValue()).longValue();
            C05X6 c05x6 = new C05X6(arrayList, null);
            this.LL = 1;
            objLIZJ = C099A.LIZJ(jLongValue, c05x6, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("ImportDeviceSoundsFragment@5e82.batchReadC2PALocalSounds$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ImportDeviceSoundsFragment@5e82.batchReadC2PALocalSounds$2");
        return objLIZJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends AIGCInfo>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
