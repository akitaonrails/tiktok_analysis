package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel$scheduleDefaultSelectionPlayIfNeeded$1", f = "MusicGiftDetailViewModel.kt", l = {1236}, m = "invokeSuspend")
public final class C592870NNd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MusicGiftDetailViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592870NNd(MusicGiftDetailViewModel musicGiftDetailViewModel, long j, long j2, InterfaceC1364105Vn<? super C592870NNd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musicGiftDetailViewModel;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592870NNd(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftDetailViewModel@deb0.scheduleDefaultSelectionPlayIfNeeded$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.scheduleDefaultSelectionPlayIfNeeded$1");
                return objLJFF;
            }
        }
        MusicGiftDetailViewModel musicGiftDetailViewModel = this.LLILLJJLI;
        musicGiftDetailViewModel.LLJJIII = null;
        long j = musicGiftDetailViewModel.LLJILJIL;
        long j2 = this.LLILLL;
        if (j == j2) {
            long j3 = musicGiftDetailViewModel.LLJILLL;
            long j4 = this.LLILZ;
            if (j3 == j4 && !MusicGiftDetailViewModel.KQ2(musicGiftDetailViewModel.LLL, j2, j4)) {
                this.LLILLJJLI.TQ2();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.scheduleDefaultSelectionPlayIfNeeded$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.scheduleDefaultSelectionPlayIfNeeded$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
