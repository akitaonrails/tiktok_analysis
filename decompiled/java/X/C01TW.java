package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.model.message.KaraokeYouSingReqMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.ReqSong;

/* JADX INFO: renamed from: X.01TW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.KaraokeMessageHelper$processYouSingReqMessage$1", f = "KaraokeMessageHelper.kt", l = {}, m = "invokeSuspend")
public final class C01TW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokeYouSingReqMessage LL;
    public final /* synthetic */ C01TY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01TW(KaraokeYouSingReqMessage karaokeYouSingReqMessage, C01TY c01ty, InterfaceC1364105Vn<? super C01TW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokeYouSingReqMessage;
        this.LLILLJJLI = c01ty;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01TW(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeMessageHelper@2a72.processYouSingReqMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<ReqSong> list = this.LL.songList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<ReqSong> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C005H.LIZIZ(it2.next(), null));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((C0U22) obj2).LJIIJJI()) {
                arrayList2.add(obj2);
            }
        }
        KaraokeViewModel karaokeViewModel = this.LLILLJJLI.LLILLJJLI;
        if (karaokeViewModel != null) {
            KaraokeYouSingReqMessage karaokeYouSingReqMessage = this.LL;
            karaokeViewModel.cR2(new C765310U0j(karaokeYouSingReqMessage.type, arrayList2, (int) karaokeYouSingReqMessage.totalReqCount, karaokeYouSingReqMessage.reqTimestampSeconds));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeMessageHelper@2a72.processYouSingReqMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
