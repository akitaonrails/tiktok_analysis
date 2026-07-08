package X;

import android.net.Uri;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import j27.s;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0q5Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536590q5Z extends LynxViewClient {
    public static InterfaceC1536620q5c LLJ;
    public final InterfaceC1541990qEH LL;
    public final String LLILLJJLI = "DefaultLynxViewClient";
    public Uri LLILLL;
    public final C1537910q7h LLILZ;
    public AbstractC1537870q7d LLILZIL;
    public C1537480q70 LLILZLL;
    public final IResourceServiceX LLIZ;
    public C0V2A LLIZLLLIL;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIIIZZ() {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h == null || (copyOnWriteArrayList = c1537910q7h.LJJJIL) == null) {
            return;
        }
        Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ() {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h == null || (copyOnWriteArrayList = c1537910q7h.LJJJIL) == null) {
            return;
        }
        Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJ();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL() {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        this.LL.LJIJJLI();
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h == null || (copyOnWriteArrayList = c1537910q7h.LJJJIL) == null) {
            return;
        }
        Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILJJIL();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILLIIL() {
        this.LL.a1();
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ() {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h == null || (copyOnWriteArrayList = c1537910q7h.LJJJIL) == null) {
            return;
        }
        Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LJIJ();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIFFI() {
        EnumC1067640dtC type;
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJJIFFI();
            }
        }
        AbstractC1537870q7d abstractC1537870q7d = this.LLILZIL;
        if (abstractC1537870q7d != null) {
            C1537910q7h c1537910q7h2 = this.LLILZ;
            if (c1537910q7h2 == null || (type = c1537910q7h2.getType()) == null) {
                type = EnumC1067640dtC.UNKNOWN;
            }
            abstractC1537870q7d.LJLJJLL(type);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZI() {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h == null || (copyOnWriteArrayList = c1537910q7h.LJJJIL) == null) {
            return;
        }
        Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIIZI();
        }
    }

    public static String LJJIJ(String str) {
        return new Uri.Builder().scheme("asset").authority("").path(str).build().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01c1  */
    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC1294040jmM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1536590q5Z.LIZIZ(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d A[Catch: all -> 0x00b2, TryCatch #1 {all -> 0x00b2, blocks: (B:5:0x0007, B:21:0x0038, B:29:0x005d, B:31:0x0065, B:33:0x006f, B:35:0x0075, B:37:0x0079, B:46:0x00ae, B:45:0x00a3, B:14:0x001b, B:16:0x0025, B:18:0x002f, B:20:0x0033, B:22:0x003f, B:24:0x004b, B:26:0x004f, B:28:0x0055, B:38:0x007c, B:40:0x008f, B:42:0x0095, B:43:0x009e), top: B:68:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.lynx.tasm.LynxError r6) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1536590q5Z.LJFF(com.lynx.tasm.LynxError):void");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILIIL(String str) {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJIILIIL(str);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(C1299240juk c1299240juk) {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJIILL(c1299240juk);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIZILJ(String str) {
        Uri uri;
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIZILJ(str);
            }
        }
        if (str != null) {
            uri = UriProtector.parse(str);
        } else {
            uri = null;
        }
        this.LLILLL = uri;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJJLI(LynxError lynxError) {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJIJJLI(lynxError);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIL(LynxError lynxError) {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJIL(lynxError);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJ(LynxError lynxError) {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJJ(lynxError);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJII(C1318050kP5 c1318050kP5) {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJJII(c1318050kP5);
            }
        }
        try {
            String str = c1318050kP5.LIZJ;
            C189200o6 c189200o6M1boximpl = null;
            HybridSchemaParam hybridSchemaParam = null;
            Object c098200Yq = null;
            c189200o6M1boximpl = null;
            if (str != null && str.length() > 0) {
                if (this.LLIZLLLIL == null) {
                    try {
                        this.LLIZLLLIL = new C0V2A(str, true);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("FpsTracer failed to initialize : ");
                        sbLIZ.append(e.getMessage());
                        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, this.LLILLJJLI);
                    }
                }
                C0V2A c0v2a = this.LLIZLLLIL;
                if (c0v2a != null) {
                    c0v2a.LJFF();
                }
                try {
                    InterfaceC1536620q5c interfaceC1536620q5c = LLJ;
                    if (interfaceC1536620q5c != null) {
                        C1537910q7h c1537910q7h2 = this.LLILZ;
                        if (c1537910q7h2 != null) {
                            hybridSchemaParam = c1537910q7h2.LJJIIJ;
                        }
                        interfaceC1536620q5c.LIZ(new C1536610q5b(str, hybridSchemaParam));
                        c098200Yq = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C1490740otc c1490740otc2 = C1490740otc.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("FpsMonitor failed to initialize : ");
                    sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                    c1490740otc2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), EnumC1490770otf.E, this.LLILLJJLI);
                }
                c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
            }
            C189200o6.m2constructorimpl(c189200o6M1boximpl);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIII(C1318050kP5 c1318050kP5) {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJJIII(c1318050kP5);
            }
        }
        C0V2A c0v2a = this.LLIZLLLIL;
        if (c0v2a != null) {
            c0v2a.LJI();
        }
        String str = c1318050kP5.LIZJ;
        if (str != null && str.length() > 0) {
            Unit unit = null;
            if (1 != 0) {
                try {
                    InterfaceC1536620q5c interfaceC1536620q5c = LLJ;
                    if (interfaceC1536620q5c != null) {
                        interfaceC1536620q5c.stop();
                        unit = Unit.LIZ;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(Map<String, Object> map) {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().onTimingSetup(map);
            }
        }
    }

    public C1536590q5Z(InterfaceC1541990qEH interfaceC1541990qEH, C1537910q7h c1537910q7h, IResourceServiceX iResourceServiceX) {
        this.LL = interfaceC1541990qEH;
        this.LLILZ = c1537910q7h;
        this.LLIZ = iResourceServiceX;
    }

    @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
    public final void LJ(String str, String str2, int i) {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJ(str, str2, i);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(String str, Map map, Map map2) {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LJJIIZ(str, map, map2);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC1294040jmM
    public final void LIZJ(s sVar, String str, float f, float f2, C1316330kMJ c1316330kMJ) {
        CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList;
        C1537910q7h c1537910q7h = this.LLILZ;
        if (c1537910q7h != null && (copyOnWriteArrayList = c1537910q7h.LJJJIL) != null) {
            Iterator<LynxViewClient> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(sVar, str, f, f2, c1316330kMJ);
            }
        }
    }
}
