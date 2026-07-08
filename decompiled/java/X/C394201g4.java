package X;

import com.bytedance.android.live.effect.bulletin.LiveBoardsViewModel;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.download.PCSBoardEffectDownloader$fetchAndDownload$1$1$1", f = "PCSBoardEffectDownloader.kt", l = {59, 77, 86, 100, 105}, m = "invokeSuspend")
public final class C394201g4 extends C09AX implements Function2<AbstractC401801hI<? extends LiveEffect>, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346701Wf<C387101ev> LLILLL;
    public final /* synthetic */ LiveBoardsViewModel LLILZ;
    public final /* synthetic */ C395101gD LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C394201g4(InterfaceC346701Wf<? super C387101ev> interfaceC346701Wf, LiveBoardsViewModel liveBoardsViewModel, C395101gD c395101gD, InterfaceC1364105Vn<? super C394201g4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346701Wf;
        this.LLILZ = liveBoardsViewModel;
        this.LLILZIL = c395101gD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C394201g4 c394201g4 = new C394201g4(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c394201g4.LLILLJJLI = obj;
        return c394201g4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC401801hI abstractC401801hI;
        Object next;
        C1C7U.LIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                abstractC401801hI = (AbstractC401801hI) this.LLILLJJLI;
                                C155000ia.LIZIZ(obj);
                                C392601fo.LJII(new C392701fp(new C386801es(-1005, String.valueOf(((C396401gQ) abstractC401801hI).LIZIZ))), null);
                                C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
                                return true;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C155000ia.LIZIZ(obj);
                        C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
                        return true;
                    }
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
                    return true;
                }
                C155000ia.LIZIZ(obj);
                C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
                return true;
            }
            C155000ia.LIZIZ(obj);
            C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
            return true;
        }
        C155000ia.LIZIZ(obj);
        abstractC401801hI = (AbstractC401801hI) this.LLILLJJLI;
        if (abstractC401801hI instanceof C396001gM) {
            C396001gM c396001gM = (C396001gM) abstractC401801hI;
            if (!Intrinsics.LJFF(c396001gM.LIZ, "liveboards_2")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("wrong category is ");
                sbLIZ.append(c396001gM.LIZ);
                C392601fo.LJII(new C392701fp(new C386801es(-1006, C2188811AlT.LIZIZ(sbLIZ))), null);
                InterfaceC346701Wf<C387101ev> interfaceC346701Wf = this.LLILLL;
                C387101ev c387101ev = new C387101ev(-1, null);
                this.LL = 1;
                if (interfaceC346701Wf.emit(c387101ev, this) == objLJFF) {
                    C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
                    return objLJFF;
                }
                C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
                return true;
            }
            Iterator it2 = c396001gM.LIZIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((LiveEffect) next).getName(), "LiveBoard_3")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LiveEffect liveEffect = (LiveEffect) next;
            if (liveEffect == null) {
                liveEffect = (LiveEffect) C13LP.LJJLIIIJL(c396001gM.LIZIZ);
            }
            C392601fo.LJII(C393401fw.LIZ, null);
            if (liveEffect != null) {
                if (!C766720U5u.LJIILLIIL(liveEffect)) {
                    BaseEffectViewModel.vQ2(this.LLILZ, liveEffect, null, 30);
                    C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
                    return false;
                }
                if (C766720U5u.LJIILLIIL(liveEffect)) {
                    this.LLILZIL.LIZ = liveEffect;
                    C784830UqX.LIZIZ(liveEffect);
                    LiveEffect liveEffect2 = this.LLILZIL.LIZ;
                    if (liveEffect2 != null) {
                        liveEffect2.LJJLIL(true);
                    }
                    InterfaceC346701Wf<C387101ev> interfaceC346701Wf2 = this.LLILLL;
                    C387101ev c387101ev2 = new C387101ev(1, liveEffect);
                    this.LL = 2;
                    if (interfaceC346701Wf2.emit(c387101ev2, this) == objLJFF) {
                        C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
                        return objLJFF;
                    }
                }
            }
            C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
            return true;
        }
        if (abstractC401801hI instanceof C01PO) {
            C395101gD c395101gD = this.LLILZIL;
            C01PO c01po = (C01PO) abstractC401801hI;
            LiveEffect liveEffect3 = (LiveEffect) c01po.LIZ;
            c395101gD.LIZ = liveEffect3;
            C784830UqX.LIZIZ(liveEffect3);
            LiveEffect liveEffect4 = this.LLILZIL.LIZ;
            if (liveEffect4 != null) {
                liveEffect4.LJJLIL(true);
            }
            InterfaceC346701Wf<C387101ev> interfaceC346701Wf3 = this.LLILLL;
            C387101ev c387101ev3 = new C387101ev(1, (LiveEffect) c01po.LIZ);
            this.LL = 3;
            if (interfaceC346701Wf3.emit(c387101ev3, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
                return objLJFF;
            }
            C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
            return true;
        }
        if (abstractC401801hI instanceof C226400u6) {
            C392601fo.LJII(new C392701fp(new C386801es(-1006, "Download effect ItemDownloadError")), null);
            InterfaceC346701Wf<C387101ev> interfaceC346701Wf4 = this.LLILLL;
            C387101ev c387101ev4 = new C387101ev(-1, (LiveEffect) ((C226400u6) abstractC401801hI).LIZ);
            this.LL = 4;
            if (interfaceC346701Wf4.emit(c387101ev4, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
                return objLJFF;
            }
            C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
            return true;
        }
        if (abstractC401801hI instanceof C396401gQ) {
            InterfaceC346701Wf<C387101ev> interfaceC346701Wf5 = this.LLILLL;
            C387101ev c387101ev5 = new C387101ev(-1, null);
            this.LLILLJJLI = abstractC401801hI;
            this.LL = 5;
            if (interfaceC346701Wf5.emit(c387101ev5, this) == objLJFF) {
                C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
                return objLJFF;
            }
            C392601fo.LJII(new C392701fp(new C386801es(-1005, String.valueOf(((C396401gQ) abstractC401801hI).LIZIZ))), null);
            C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
            return true;
        }
        C1C7U.LIZIZ("PCSBoardEffectDownloader@226.fetchAndDownload$1$1$1");
        return false;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC401801hI<? extends LiveEffect> abstractC401801hI, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(abstractC401801hI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
