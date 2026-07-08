package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nsw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM$ensureHeadStash$3", f = "OfflineModeListVM.kt", l = {335}, m = "invokeSuspend")
public final class C607960Nsw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C607950Nsv>>, Object> {
    public int LL;
    public final /* synthetic */ OfflineModeListVM LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607960Nsw(OfflineModeListVM offlineModeListVM, int i, InterfaceC1364105Vn<? super C607960Nsw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = offlineModeListVM;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C607960Nsw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Video video;
        List<BitRate> listLLD;
        List<BitRate> bitRate;
        C1C7U.LIZ("OfflineModeListVM@46f2.ensureHeadStash$3");
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
            InterfaceC624740Oeu interfaceC624740Oeu = (InterfaceC624740Oeu) this.LLILLJJLI.DQ2().getOperator();
            this.LL = 1;
            obj = interfaceC624740Oeu.LJLIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OfflineModeListVM@46f2.ensureHeadStash$3");
                return objLJFF;
            }
        }
        List<Aweme> listLL = C13LP.LL(((C607970Nsx) obj).LIZ, this.LLILLL);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
        for (Aweme aweme : listLL) {
            if (aweme.getVideo() != null && (video = aweme.getVideo()) != null) {
                Video video2 = aweme.getVideo();
                if (video2 != null && (bitRate = video2.getBitRate()) != null) {
                    listLLD = C13LP.LLD(1, bitRate);
                } else {
                    listLLD = null;
                }
                video.setBitRate(listLLD);
            }
            arrayList.add(new C607950Nsv(aweme));
        }
        this.LLILLJJLI.LLJILJILJ = arrayList;
        C1C7U.LIZIZ("OfflineModeListVM@46f2.ensureHeadStash$3");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C607950Nsv>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
