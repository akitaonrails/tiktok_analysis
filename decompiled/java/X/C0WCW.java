package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0WCW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WCW {
    public final Context LIZ;
    public final InterfaceC819450WCp LIZIZ;
    public final C0WCP LIZJ;
    public final InterfaceC819440WCo LIZLLL;
    public final Executor LJ;
    public final C0WCM LJFF;
    public final C0WC2 LJI;
    public final C0WC2 LJII;
    public final InterfaceC819420WCm LJIIIIZZ;

    public final void LIZ(final AbstractC818550W9d abstractC818550W9d, int i) {
        C819300WCa c819300WCaLIZ;
        InterfaceC819390WCj interfaceC819390WCj = this.LIZIZ.get(abstractC818550W9d.LIZIZ());
        new C819300WCa(EnumC819320WCc.OK, 0L);
        final long jMax = 0;
        while (((Boolean) this.LJFF.LIZIZ(new C0WCL() { // from class: X.0WCe
            @Override // X.C0WCL
            public final Object execute() {
                C0WCW c0wcw = this.LIZ;
                return Boolean.valueOf(c0wcw.LIZJ.LJLI(abstractC818550W9d));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.LJFF.LIZIZ(new C0WCL() { // from class: X.0WCf
                @Override // X.C0WCL
                public final Object execute() {
                    C0WCW c0wcw = this.LIZ;
                    return c0wcw.LIZJ.LJJZZI(abstractC818550W9d);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (interfaceC819390WCj == null) {
                C1894007bO.LIZ("Uploader");
                c819300WCaLIZ = new C819300WCa(EnumC819320WCc.FATAL_ERROR, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C0WC9) it2.next()).LIZ());
                }
                if (abstractC818550W9d.LIZJ() != null) {
                    C0WCM c0wcm = this.LJFF;
                    final InterfaceC819420WCm interfaceC819420WCm = this.LJIIIIZZ;
                    Objects.requireNonNull(interfaceC819420WCm);
                    Object objLIZIZ = c0wcm.LIZIZ(new C0WCL() { // from class: X.0WCn
                        @Override // X.C0WCL
                        public final Object execute() {
                            return interfaceC819420WCm.LJFF();
                        }
                    });
                    C819250WBv c819250WBv = new C819250WBv();
                    c819250WBv.LJFF = new HashMap();
                    c819250WBv.LIZLLL = Long.valueOf(this.LJI.getTime());
                    c819250WBv.LJ = Long.valueOf(this.LJII.getTime());
                    c819250WBv.LIZLLL("GDT_CLIENT_METRICS");
                    C814570VxP c814570VxP = new C814570VxP("proto");
                    objLIZIZ.getClass();
                    C819900WEi c819900WEi = AbstractC819890WEh.LIZ;
                    c819900WEi.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c819900WEi.LIZ(byteArrayOutputStream, objLIZIZ);
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    c819250WBv.LIZJ(new C0WCB(c814570VxP, byteArrayOutputStream.toByteArray()));
                    arrayList.add(interfaceC819390WCj.LIZIZ(c819250WBv.LIZIZ()));
                }
                C819360WCg c819360WCg = new C819360WCg();
                c819360WCg.LIZ = arrayList;
                c819360WCg.LIZIZ = abstractC818550W9d.LIZJ();
                String strLIZIZ = "";
                if (c819360WCg.LIZ == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("");
                    sbLIZ.append(" events");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                if (strLIZIZ.isEmpty()) {
                    c819300WCaLIZ = interfaceC819390WCj.LIZ(new C819470WCr(c819360WCg.LIZ, c819360WCg.LIZIZ));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Missing required properties:");
                    sbLIZ2.append(strLIZIZ);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            if (c819300WCaLIZ.LIZ == EnumC819320WCc.TRANSIENT_ERROR) {
                this.LJFF.LIZIZ(new C0WCL() { // from class: X.0WCU
                    @Override // X.C0WCL
                    public final Object execute() {
                        C0WCW c0wcw = this.LIZ;
                        Iterable<C0WC9> iterable2 = iterable;
                        AbstractC818550W9d abstractC818550W9d2 = abstractC818550W9d;
                        long j = jMax;
                        c0wcw.LIZJ.LLII(iterable2);
                        c0wcw.LIZJ.LLFZ(c0wcw.LJI.getTime() + j, abstractC818550W9d2);
                        return null;
                    }
                });
                this.LIZLLL.LIZIZ(abstractC818550W9d, i + 1, true);
                return;
            }
            this.LJFF.LIZIZ(new C0WCL() { // from class: X.0WCi
                @Override // X.C0WCL
                public final Object execute() {
                    C0WCW c0wcw = this.LIZ;
                    c0wcw.LIZJ.LJJJJI(iterable);
                    return null;
                }
            });
            EnumC819320WCc enumC819320WCc = c819300WCaLIZ.LIZ;
            if (enumC819320WCc == EnumC819320WCc.OK) {
                jMax = Math.max(jMax, c819300WCaLIZ.LIZIZ);
                if (abstractC818550W9d.LIZJ() != null) {
                    this.LJFF.LIZIZ(new C0WCL() { // from class: X.0WCl
                        @Override // X.C0WCL
                        public final Object execute() {
                            this.LIZ.LJIIIIZZ.LIZ();
                            return null;
                        }
                    });
                }
            } else if (enumC819320WCc == EnumC819320WCc.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    String strLJI = ((C0WC9) it3.next()).LIZ().LJI();
                    if (!map.containsKey(strLJI)) {
                        map.put(strLJI, 1);
                    } else {
                        map.put(strLJI, Integer.valueOf(((Integer) map.get(strLJI)).intValue() + 1));
                    }
                }
                this.LJFF.LIZIZ(new C0WCL() { // from class: X.0WCZ
                    @Override // X.C0WCL
                    public final Object execute() {
                        C0WCW c0wcw = this.LIZ;
                        Map map2 = map;
                        c0wcw.getClass();
                        Iterator it4 = map2.entrySet().iterator();
                        while (it4.hasNext()) {
                            c0wcw.LJIIIIZZ.LIZLLL(((Integer) r5.getValue()).intValue(), EnumC819310WCb.INVALID_PAYLOD, (String) ((Map.Entry) it4.next()).getKey());
                        }
                        return null;
                    }
                });
            }
        }
        this.LJFF.LIZIZ(new C0WCL() { // from class: X.0WCV
            @Override // X.C0WCL
            public final Object execute() {
                C0WCW c0wcw = this.LIZ;
                c0wcw.LIZJ.LLFZ(c0wcw.LJI.getTime() + jMax, abstractC818550W9d);
                return null;
            }
        });
    }

    public C0WCW(Context context, InterfaceC819450WCp interfaceC819450WCp, C0WCP c0wcp, InterfaceC819440WCo interfaceC819440WCo, Executor executor, C0WCM c0wcm, C0WC2 c0wc2, C0WC2 c0wc22, InterfaceC819420WCm interfaceC819420WCm) {
        this.LIZ = context;
        this.LIZIZ = interfaceC819450WCp;
        this.LIZJ = c0wcp;
        this.LIZLLL = interfaceC819440WCo;
        this.LJ = executor;
        this.LJFF = c0wcm;
        this.LJI = c0wc2;
        this.LJII = c0wc22;
        this.LJIIIIZZ = interfaceC819420WCm;
    }
}
