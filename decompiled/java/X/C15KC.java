package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15KC, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.localmusic.LocalMusicProvider$Companion$scanLocalMusicTask$1$2", f = "LocalMusicProvider.kt", l = {}, m = "invokeSuspend")
public final class C15KC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ ArrayList<MusicModel> LLILLJJLI;
    public final /* synthetic */ InterfaceC196862120m LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15KC(Context context, ArrayList<MusicModel> arrayList, InterfaceC196862120m interfaceC196862120m, InterfaceC1364105Vn<? super C15KC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = arrayList;
        this.LLILLL = interfaceC196862120m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15KC(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LocalMusicProvider$Companion@897a.scanLocalMusicTask$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IAVInfoService iAVInfoServiceInfoService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().infoService();
        Context context = this.LL;
        final ArrayList<MusicModel> arrayList = this.LLILLJJLI;
        IAVInfoService.IFilterMedia<Integer> iFilterMedia = new IAVInfoService.IFilterMedia<Integer>() { // from class: X.15KD
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IFilterMedia
            public final boolean filter(Integer num) {
                int duration = ((MusicModel) ListProtector.get(arrayList, num.intValue())).getDuration();
                if (duration >= 1000 && duration <= 1200000) {
                    return true;
                }
                return false;
            }
        };
        final InterfaceC196862120m interfaceC196862120m = this.LLILLL;
        iAVInfoServiceInfoService.audioLegal(context, arrayList, iFilterMedia, new IAVInfoService.IGetInfoCallback<List<? extends MusicModel>>() { // from class: X.15KA
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final void finish(List<? extends MusicModel> list) {
                List<? extends MusicModel> list2 = list;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cnt:");
                sbLIZ.append(list2.size());
                C2344809Gs.LIZLLL(3, "Local Sound filter result", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC196862120m interfaceC196862120m2 = interfaceC196862120m;
                if (interfaceC196862120m2 != null) {
                    interfaceC196862120m2.onSuccess(list2);
                }
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LocalMusicProvider$Companion@897a.scanLocalMusicTask$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
