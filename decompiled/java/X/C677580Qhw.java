package X;

import com.ss.android.ugc.aweme.ecommerce.arch.ChunkMetaStruct;
import com.ss.android.ugc.aweme.ecommerce.arch.EComSearchBffResp;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Qhw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.BaseMixRefreshRepo$doWorkPrivate$5$4$onNext$3$6", f = "BaseMixRefreshRepo.kt", l = {671}, m = "invokeSuspend")
public final class C677580Qhw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1422405hW LLILLL;
    public final /* synthetic */ MixPageViewModel LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ AbstractC677500Qho LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677580Qhw(C1422405hW c1422405hW, MixPageViewModel mixPageViewModel, C118300cf c118300cf, AbstractC677500Qho abstractC677500Qho, long j, long j2, InterfaceC1364105Vn<? super C677580Qhw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1422405hW;
        this.LLILZ = mixPageViewModel;
        this.LLILZIL = c118300cf;
        this.LLILZLL = abstractC677500Qho;
        this.LLIZ = j;
        this.LLIZLLLIL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C677580Qhw c677580Qhw = new C677580Qhw(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c677580Qhw.LLILLJJLI = obj;
        return c677580Qhw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        String str;
        Object objLIZLLL;
        C1C7U.LIZ("BaseMixRefreshRepo@8c91.doWorkPrivate$5$4$onNext$3$6");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<? extends AbstractC677840QiM> list = this.LLILLL.LIZIZ;
            final ArrayList arrayList = new ArrayList();
            Iterator<? extends AbstractC677840QiM> it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC677870QiP abstractC677870QiP = it2.next().LL;
                if (abstractC677870QiP != null && (str = abstractC677870QiP.LIZJ) != null) {
                    arrayList.add(str);
                }
            }
            C118300cf c118300cf = this.LLILZIL;
            final AbstractC677500Qho abstractC677500Qho = this.LLILZLL;
            final MixPageViewModel mixPageViewModel = this.LLILZ;
            final C1422405hW c1422405hW = this.LLILLL;
            final long j = this.LLIZ;
            final long j2 = this.LLIZLLLIL;
            final int i2 = c118300cf.element;
            int size = arrayList.size();
            if (2 <= size) {
                size = 2;
            }
            List<String> listSubList = arrayList.subList(0, size);
            C677610Qhz c677610Qhz = abstractC677500Qho.LJIIIIZZ;
            if (c677610Qhz != null) {
                c677610Qhz.LJI(i2, listSubList);
            }
            C1540620qC4 c1540620qC4VQ2 = mixPageViewModel.vQ2();
            InterfaceC1540710qCD interfaceC1540710qCD = new InterfaceC1540710qCD() { // from class: X.0Qhv
                @Override // X.InterfaceC1540710qCD
                public final void Ka(C1540660qC8 c1540660qC8) {
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    AFwS196S0000000_10 aFwS196S0000000_10 = AFwS196S0000000_10.get$arr$(511);
                    c2341109Fh.getClass();
                    C2341109Fh.LJIIIIZZ(aFwS196S0000000_10);
                    C2341109Fh.LIZIZ(new AwS554S0100000_10(arrayList, (List<String>) 1018));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MixLynxPageGroupLoadFail:");
                    sbLIZ.append(c1540660qC8.LIZIZ);
                    Throwable th = new Throwable(C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1631620sYq<C1422405hW, C677410Qhf, Integer, Unit> interfaceC1631620sYq = abstractC677500Qho.LIZJ;
                    if (interfaceC1631620sYq != null) {
                        interfaceC1631620sYq.invoke(null, new C677410Qhf(1003, th), null);
                    }
                }

                @Override // X.InterfaceC1540710qCD
                public final void RJ(long j3) {
                    String str2;
                    ChunkMetaStruct chunkMetaStruct;
                    C677970QiZ c677970QiZ;
                    InterfaceC677960QiY interfaceC677960QiY;
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    AFwS196S0000000_10 aFwS196S0000000_10 = AFwS196S0000000_10.get$arr$(512);
                    c2341109Fh.getClass();
                    C2341109Fh.LIZIZ(aFwS196S0000000_10);
                    C2341109Fh.LIZIZ(AFwS196S0000000_10.get$arr$(513));
                    C677400Qhe c677400Qhe = abstractC677500Qho.LIZIZ;
                    if (c677400Qhe != null && (c677970QiZ = c677400Qhe.LJ) != null && (interfaceC677960QiY = c677970QiZ.LIZIZ) != null) {
                        interfaceC677960QiY.onFirstFrameRendered();
                    }
                    mixPageViewModel.xQ2(C678010Qid.LIZ);
                    AbstractC677500Qho abstractC677500Qho2 = abstractC677500Qho;
                    abstractC677500Qho2.LIZ.LLJLIL = 1;
                    C677610Qhz c677610Qhz2 = abstractC677500Qho2.LJIIIIZZ;
                    if (c677610Qhz2 != null) {
                        int i3 = i2;
                        EComSearchBffResp eComSearchBffResp = c1422405hW.LIZ;
                        Integer num = null;
                        if (eComSearchBffResp != null && (chunkMetaStruct = eComSearchBffResp.chunkMeta) != null) {
                            str2 = chunkMetaStruct.chunkName;
                        } else {
                            str2 = null;
                            if (eComSearchBffResp != null) {
                            }
                            c677610Qhz2.LJFF(i3, str2, num, j3, j, j2);
                        }
                        ChunkMetaStruct chunkMetaStruct2 = eComSearchBffResp.chunkMeta;
                        if (chunkMetaStruct2 != null) {
                            num = chunkMetaStruct2.productPackType;
                        }
                        c677610Qhz2.LJFF(i3, str2, num, j3, j, j2);
                    }
                }
            };
            C01GW<C1537720q7O> c01gw = C1540620qC4.LJJJJIZL;
            c1540620qC4VQ2.LJJIIZ(listSubList, interfaceC1540710qCD, null);
            C1DEK c1dek = this.LLILZ.LLILZLL;
            C1396805dO c1396805dO = new C1396805dO(this.LLILLL, false, 0, null, 126);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (c1dek.LJIJI(c1396805dO, this) == objLJFF) {
                C1C7U.LIZIZ("BaseMixRefreshRepo@8c91.doWorkPrivate$5$4$onNext$3$6");
                return objLJFF;
            }
        }
        this.LLILZ.xQ2(C678000Qic.LIZ);
        this.LLILZ.LLJIJIL.postValue(this.LLILLL);
        if (((Boolean) C1866810ygB.LIZJ.getValue()).booleanValue()) {
            if (((Boolean) C1866810ygB.LIZ.getValue()).booleanValue()) {
                objLIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C677660Qi4(this.LLILZ, null), 3);
            } else {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                AFwS196S0000000_10 aFwS196S0000000_10 = AFwS196S0000000_10.get$arr$(516);
                c2341109Fh.getClass();
                C2341109Fh.LIZIZ(aFwS196S0000000_10);
                objLIZLLL = Unit.LIZ;
            }
        } else {
            objLIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C677670Qi5(this.LLILZ, null), 3);
        }
        C1C7U.LIZIZ("BaseMixRefreshRepo@8c91.doWorkPrivate$5$4$onNext$3$6");
        return objLIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
