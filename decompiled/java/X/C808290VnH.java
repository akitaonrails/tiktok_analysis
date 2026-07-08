package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.im.contacts.impl.data.base.IMContactDatabase;
import com.ss.android.ugc.aweme.im.contacts.impl.model.SharePermission;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0VnH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808290VnH {
    public static final Object LIZ = new Object();
    public static C2202371BHn LIZIZ;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0VnM] */
    public static final InterfaceC2202381BHo LIZ() {
        C2202371BHn c2202371BHn = LIZIZ;
        if (c2202371BHn == null) {
            synchronized (LIZ) {
                try {
                    c2202371BHn = LIZIZ;
                    if (c2202371BHn == null) {
                        C0VQO c0vqo = IMContactDatabase.LL;
                        Context contextLIZ = C894660Z7w.LIZ();
                        c0vqo.getClass();
                        c2202371BHn = new C2202371BHn(new InterfaceC2202381BHo(C0VQO.LIZJ(contextLIZ, true).LIZJ()) { // from class: X.0VnM
                            public final InterfaceC808350VnN LIZ;

                            @Override // X.InterfaceC2202381BHo
                            public final int LIZLLL() {
                                return this.LIZ.LIZLLL();
                            }

                            @Override // X.InterfaceC2202381BHo
                            public final List<IMUser> LJI() {
                                List<C2201931BFv> listLJI = this.LIZ.LJI();
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJI, 10));
                                Iterator<C2201931BFv> it2 = listLJI.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(C2201921BFu.LIZ(it2.next()));
                                }
                                return arrayList;
                            }

                            {
                                this.LIZ = interfaceC808350VnN;
                            }

                            @Override // X.InterfaceC2202381BHo
                            public final MAFIMUser LJ(long j) {
                                C2201931BFv c2201931BFvLJ = this.LIZ.LJ(j);
                                if (c2201931BFvLJ != null) {
                                    return C2201921BFu.LIZIZ(c2201931BFvLJ);
                                }
                                return null;
                            }

                            @Override // X.InterfaceC2202381BHo
                            public final List<MAFIMUser> LJFF(int i) {
                                List<C2201931BFv> listLJFF = this.LIZ.LJFF(i);
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJFF, 10));
                                Iterator<C2201931BFv> it2 = listLJFF.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(C2201921BFu.LIZIZ(it2.next()));
                                }
                                return arrayList;
                            }

                            @Override // X.InterfaceC2202381BHo
                            public final List<IMUser> LJII(List<Long> list) {
                                List<C2201931BFv> listLJII = this.LIZ.LJII(list);
                                if (listLJII != null) {
                                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
                                    Iterator<C2201931BFv> it2 = listLJII.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(C2201921BFu.LIZ(it2.next()));
                                    }
                                    return arrayList;
                                }
                                return null;
                            }

                            @Override // X.InterfaceC2202381BHo
                            public final IMUser LJIIJ(Long l) {
                                if (l == null) {
                                    return null;
                                }
                                C2201931BFv c2201931BFvLJIIJ = this.LIZ.LJIIJ(l.longValue());
                                if (c2201931BFvLJIIJ == null) {
                                    return null;
                                }
                                return C2201921BFu.LIZ(c2201931BFvLJIIJ);
                            }

                            @Override // X.InterfaceC2202381BHo
                            public final Object LIZ(List<SharePermission> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("insertOrReplaceIMUser list size ");
                                Integer numLJ = null;
                                if (list != null) {
                                    numLJ = C2286608xc.LJ(list.size());
                                }
                                sbLIZ.append(numLJ);
                                C2188811AlT.LIZIZ(sbLIZ);
                                if (!list.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (SharePermission sharePermission : list) {
                                        if (sharePermission.getUserId() > 0) {
                                            arrayList.add(sharePermission);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(C808360VnO.LIZ((SharePermission) it2.next()));
                                    }
                                    this.LIZ.LIZ(arrayList2);
                                }
                                return Unit.LIZ;
                            }

                            @Override // X.InterfaceC2202381BHo
                            public final Object LIZIZ(Long l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("delete ");
                                sbLIZ.append(l);
                                C2188811AlT.LIZIZ(sbLIZ);
                                if (l != null) {
                                    this.LIZ.LIZIZ(l.longValue());
                                }
                                return Unit.LIZ;
                            }

                            @Override // X.InterfaceC2202381BHo
                            public final Object LIZJ(List<Long> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("deleteList ");
                                sbLIZ.append(list);
                                C2188811AlT.LIZIZ(sbLIZ);
                                this.LIZ.LIZJ(list);
                                return Unit.LIZ;
                            }

                            @Override // X.InterfaceC2202381BHo
                            public final Object LJIIIIZZ(Long l, InterfaceC1364105Vn<? super SharePermission> interfaceC1364105Vn) {
                                if (l == null) {
                                    return null;
                                }
                                C796740VNg c796740VNgLJIIJJI = this.LIZ.LJIIJJI(l.longValue());
                                if (c796740VNgLJIIJJI == null) {
                                    return null;
                                }
                                SharePermission sharePermission = new SharePermission();
                                sharePermission.setUserId(c796740VNgLJIIJJI.LIZ);
                                sharePermission.setUserShareStatus(c796740VNgLJIIJJI.LIZIZ);
                                sharePermission.setTtnShareStatus(c796740VNgLJIIJJI.LIZJ);
                                sharePermission.setUpdateTime(c796740VNgLJIIJJI.LIZLLL);
                                sharePermission.setExtra(c796740VNgLJIIJJI.LJ);
                                return sharePermission;
                            }

                            @Override // X.InterfaceC2202381BHo
                            public final Object LJIIIZ(SharePermission sharePermission, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                                if (sharePermission.getUserId() != 0) {
                                    this.LIZ.LJIIIZ(C808360VnO.LIZ(sharePermission));
                                }
                                return Unit.LIZ;
                            }

                            @Override // X.InterfaceC2202381BHo
                            public final Object LJIIJJI(SharePermission sharePermission, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                                if (sharePermission != null) {
                                    this.LIZ.LJIIIIZZ(C808360VnO.LIZ(sharePermission));
                                }
                                return Unit.LIZ;
                            }
                        });
                        LIZIZ = c2202371BHn;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c2202371BHn;
    }
}
