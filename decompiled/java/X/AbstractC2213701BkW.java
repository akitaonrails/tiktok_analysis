package X;

import com.tiktok.ttm.TTMParamData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1BkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2213701BkW implements InterfaceC830900Wie {
    public static final /* synthetic */ int LJIIJ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public List<? extends InterfaceC830810WiV> LJFF;
    public WeakReference<C830870Wib> LJI;
    public AbstractC2213721BkY LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public final C2213711BkX LIZLLL = new C2213711BkX(this);
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final List<AbstractC2213871Bkn> LJII = new ArrayList();

    @Override // X.InterfaceC830900Wie
    public boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC830900Wie
    public boolean LIZLLL() {
        this.LJIIIZ = false;
        if (!this.LJ.compareAndSet(false, true)) {
            return true;
        }
        List<? extends InterfaceC830810WiV> list = this.LJFF;
        if (list != null) {
            Iterator<? extends InterfaceC830810WiV> it2 = list.iterator();
            while (it2.hasNext()) {
                ((C830820WiW) it2.next()).LIZJ(this);
            }
        }
        AbstractC2213721BkY abstractC2213721BkYLJII = LJII();
        while (true) {
            long j = abstractC2213721BkYLJII.LIZIZ.get();
            if (j == 0) {
                break;
            }
            if (abstractC2213721BkYLJII.LIZJ.get() != 0) {
                Thread.yield();
            } else if (abstractC2213721BkYLJII.LIZIZ.compareAndSet(j, 0L)) {
                abstractC2213721BkYLJII.LIZLLL(j);
                break;
            }
        }
        return true;
    }

    public abstract String LJIIIIZZ();

    public abstract C2213641BkQ LJIIJ(TTMParamData tTMParamData);

    public final AbstractC2213721BkY LJII() {
        AbstractC2213721BkY abstractC2213721BkY = this.LJIIIIZZ;
        if (abstractC2213721BkY != null) {
            return abstractC2213721BkY;
        }
        return null;
    }

    @Override // X.InterfaceC830900Wie
    public final AbstractC2213721BkY LIZIZ() {
        return LJII();
    }

    @Override // X.InterfaceC830900Wie
    public final String LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC830900Wie
    public void LJ(InterfaceC805220ViK interfaceC805220ViK) {
        this.LIZLLL.LIZ((C2213641BkQ) interfaceC805220ViK);
    }

    public void LJFF(C830870Wib c830870Wib) {
        this.LJI = new WeakReference<>(c830870Wib);
    }

    public final TTMParamData LJI(TTMParamData tTMParamData) {
        C2213681BkU c2213681BkU;
        AbstractC830880Wic abstractC830880Wic;
        C830870Wib c830870Wib;
        for (AbstractC2213871Bkn abstractC2213871Bkn : (ArrayList) this.LJII) {
            if (abstractC2213871Bkn.LIZ == EnumC2213801Bkg.CAI_ACTION_TYPE_NATIVE_HARDCODE_CALLBACK) {
                InterfaceC829710Wgj interfaceC829710WgjLIZIZ = null;
                if ((abstractC2213871Bkn instanceof C2213681BkU) && (c2213681BkU = (C2213681BkU) abstractC2213871Bkn) != null && (abstractC830880Wic = c2213681BkU.LIZIZ) != null) {
                    WeakReference<C830870Wib> weakReference = this.LJI;
                    if (weakReference != null) {
                        c830870Wib = weakReference.get();
                    } else {
                        c830870Wib = null;
                    }
                    TTMParamData tTMParamDataLIZIZ = abstractC830880Wic.LIZIZ(c830870Wib, this.LIZIZ, new AnonymousClass1696(tTMParamData.getActualParamData()));
                    if (tTMParamDataLIZIZ != null) {
                        InterfaceC829710Wgj interfaceC829710Wgj = (InterfaceC829710Wgj) tTMParamData.getActualParamData();
                        if (interfaceC829710Wgj != null && (interfaceC829710WgjLIZIZ = interfaceC829710Wgj.LIZIZ()) != null) {
                            interfaceC829710WgjLIZIZ.LIZJ(tTMParamDataLIZIZ.getActualParamData());
                        }
                        return new TTMParamData(interfaceC829710WgjLIZIZ);
                    }
                    return tTMParamData;
                }
                return tTMParamData;
            }
        }
        return tTMParamData;
    }

    public void LJIIIZ(List list, AbstractC830880Wic abstractC830880Wic) {
        Iterator it2 = ((ArrayList) this.LJII).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AbstractC2213871Bkn abstractC2213871Bkn = (AbstractC2213871Bkn) it2.next();
            if (abstractC2213871Bkn.LIZ == EnumC2213801Bkg.CAI_ACTION_TYPE_NATIVE_HARDCODE_CALLBACK) {
                ((C2213681BkU) abstractC2213871Bkn).LIZIZ = abstractC830880Wic;
                break;
            }
        }
        if (!((ArrayList) this.LJII).isEmpty()) {
            this.LJFF = list;
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((C830820WiW) ((InterfaceC830810WiV) it3.next())).LIZLLL.add(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e7 A[Catch: all -> 0x00ef, TryCatch #1 {all -> 0x00ef, blocks: (B:14:0x004f, B:16:0x0058, B:17:0x005a, B:24:0x0066, B:25:0x0068, B:27:0x006c, B:28:0x0072, B:30:0x0080, B:34:0x008a, B:35:0x008c, B:41:0x0096, B:42:0x009a, B:46:0x00a1, B:47:0x00a3, B:51:0x00aa, B:52:0x00b6, B:56:0x00bf, B:57:0x00c1, B:61:0x00cc, B:63:0x00d0, B:65:0x00d8, B:66:0x00da, B:70:0x00e1, B:71:0x00e3, B:73:0x00e7, B:74:0x00e9), top: B:81:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2213641BkQ LJIIJJI(com.tiktok.ttm.TTMParamData r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2213701BkW.LJIIJJI(com.tiktok.ttm.TTMParamData, boolean):X.1BkQ");
    }

    public AbstractC2213701BkW(String str, String str2, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
    }
}
