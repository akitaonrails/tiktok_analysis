package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.model.KaraokeSong;
import com.bytedance.android.livesdk.model.message.KaraokeQueueMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01TZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.KaraokeMessageHelper$processQueueMessage$1", f = "KaraokeMessageHelper.kt", l = {}, m = "invokeSuspend")
public final class C01TZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ KaraokeQueueMessage LL;
    public final /* synthetic */ C01TY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01TZ(KaraokeQueueMessage karaokeQueueMessage, C01TY c01ty, InterfaceC1364105Vn<? super C01TZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = karaokeQueueMessage;
        this.LLILLJJLI = c01ty;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01TZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        KaraokeViewModel karaokeViewModel;
        KaraokeViewModel karaokeViewModel2;
        C1C7U.LIZ("KaraokeMessageHelper@2a72.processQueueMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        KaraokeQueueMessage karaokeQueueMessage = this.LL;
        int i = karaokeQueueMessage.type;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (karaokeViewModel2 = this.LLILLJJLI.LLILLJJLI) != null) {
                            karaokeViewModel2.cR2(new C765230U0b());
                        }
                    } else {
                        KaraokeSong karaokeSong = karaokeQueueMessage.song;
                        if (karaokeSong != null) {
                            long j = karaokeSong.id;
                            KaraokeViewModel karaokeViewModel3 = this.LLILLJJLI.LLILLJJLI;
                            if (karaokeViewModel3 != null) {
                                karaokeViewModel3.cR2(new C765400U0s(j));
                            }
                        }
                    }
                } else {
                    KaraokeSong karaokeSong2 = karaokeQueueMessage.song;
                    if (karaokeSong2 != null) {
                        long j2 = karaokeSong2.id;
                        KaraokeViewModel karaokeViewModel4 = this.LLILLJJLI.LLILLJJLI;
                        if (karaokeViewModel4 != null) {
                            karaokeViewModel4.cR2(new C765220U0a(j2));
                        }
                    }
                }
            } else {
                C0U22 c0u22LIZ = C005H.LIZ(karaokeQueueMessage.song, null);
                if (!c0u22LIZ.LJIIJJI() && (karaokeViewModel = this.LLILLJJLI.LLILLJJLI) != null) {
                    karaokeViewModel.cR2(new C0U0Y(c0u22LIZ));
                }
            }
        } else {
            KaraokeViewModel karaokeViewModel5 = this.LLILLJJLI.LLILLJJLI;
            if (karaokeViewModel5 != null) {
                karaokeViewModel5.cR2(new C0U0X(C005H.LIZ(karaokeQueueMessage.song, null)));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeMessageHelper@2a72.processQueueMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
