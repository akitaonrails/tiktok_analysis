package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeRequestMessageActionHandler$handle$2", f = "KaraokeRequestMessageActionHandler.kt", l = {87}, m = "invokeSuspend")
public final class C765280U0g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C765320U0k LLILLJJLI;
    public final /* synthetic */ C0U0N LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765280U0g(C765320U0k c765320U0k, C0U0N c0u0n, InterfaceC1364105Vn<? super C765280U0g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c765320U0k;
        this.LLILLL = c0u0n;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C765280U0g(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        C1C7U.LIZ("KaraokeRequestMessageActionHandler@773c.handle$2");
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
            C097O c097o = this.LLILLJJLI.LIZ;
            C0U0N c0u0n = this.LLILLL;
            if (c0u0n instanceof C765390U0r) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RequestMessage: reqCount: ");
                C765390U0r c765390U0r = (C765390U0r) c0u0n;
                sbLIZ.append(c765390U0r.LIZIZ);
                sbLIZ.append(", songListSize: ");
                sbLIZ.append(c765390U0r.LIZLLL.size());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else if (c0u0n instanceof C765310U0j) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("RequestForSelfMessage: type: ");
                C765310U0j c765310U0j = (C765310U0j) c0u0n;
                sbLIZ2.append(c765310U0j.LIZIZ);
                sbLIZ2.append(", songListSize: ");
                sbLIZ2.append(c765310U0j.LIZLLL.size());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else if (c0u0n instanceof C338701Td) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("QueueListMessage: type: ");
                C338701Td c338701Td = (C338701Td) c0u0n;
                sbLIZ3.append(c338701Td.LIZ.type);
                sbLIZ3.append(", songListSize: ");
                sbLIZ3.append(c338701Td.LIZ.songList.size());
                sbLIZ3.append(", totalCount: ");
                sbLIZ3.append(c338701Td.LIZ.totalQueueCount);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                strLIZIZ = "";
            }
            C764840TzO c764840TzO = new C764840TzO(strLIZIZ, this.LLILLL);
            this.LL = 1;
            if (c097o.LIZ(c764840TzO, this) == objLJFF) {
                C1C7U.LIZIZ("KaraokeRequestMessageActionHandler@773c.handle$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeRequestMessageActionHandler@773c.handle$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
