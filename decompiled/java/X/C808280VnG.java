package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.contacts.impl.data.base.IMContactDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0VnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808280VnG {
    public static final Object LIZ = new Object();
    public static C2202141BGq LIZIZ;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0VnK] */
    public static final C1BGN LIZ() {
        C2202141BGq c2202141BGq = LIZIZ;
        if (c2202141BGq == null) {
            synchronized (LIZ) {
                try {
                    c2202141BGq = LIZIZ;
                    if (c2202141BGq == null) {
                        C0VQO c0vqo = IMContactDatabase.LL;
                        Context contextLIZ = C894660Z7w.LIZ();
                        c0vqo.getClass();
                        c2202141BGq = new C2202141BGq(new C1BGN(C0VQO.LIZJ(contextLIZ, true).LIZIZ()) { // from class: X.0VnK
                            public final InterfaceC808330VnL LIZ;

                            {
                                this.LIZ = interfaceC808330VnL;
                            }

                            @Override // X.C1BGN
                            public final Object LIZ(List<IMUserBizInfo> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
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
                                    for (IMUserBizInfo iMUserBizInfo : list) {
                                        if (iMUserBizInfo.getUserId() > 0) {
                                            arrayList.add(iMUserBizInfo);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(C1BG3.LIZ((IMUserBizInfo) it2.next()));
                                    }
                                    this.LIZ.LIZ(arrayList2);
                                }
                                return Unit.LIZ;
                            }

                            @Override // X.C1BGN
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

                            @Override // X.C1BGN
                            public final Object LIZJ(List<Long> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("deleteList ");
                                sbLIZ.append(list);
                                C2188811AlT.LIZIZ(sbLIZ);
                                this.LIZ.LJ(list);
                                return Unit.LIZ;
                            }

                            @Override // X.C1BGN
                            public final Object LIZLLL(int i, InterfaceC1364105Vn<? super List<C1724806pC>> interfaceC1364105Vn) {
                                return this.LIZ.LJI(i);
                            }

                            @Override // X.C1BGN
                            public final Object LJ(Long l, InterfaceC1364105Vn<? super IMUserBizInfo> interfaceC1364105Vn) {
                                if (l != null) {
                                    C1BGM c1bgmLJFF = this.LIZ.LJFF(l.longValue());
                                    if (c1bgmLJFF != null) {
                                        return C1BG3.LIZIZ(c1bgmLJFF);
                                    }
                                    return null;
                                }
                                return null;
                            }

                            @Override // X.C1BGN
                            public final Object LJFF(IMUserBizInfo iMUserBizInfo, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                                if (iMUserBizInfo.getUserId() != 0) {
                                    this.LIZ.LIZJ(C1BG3.LIZ(iMUserBizInfo));
                                }
                                return Unit.LIZ;
                            }

                            @Override // X.C1BGN
                            public final Object LJI(List<Long> list, InterfaceC1364105Vn<? super List<IMUserBizInfo>> interfaceC1364105Vn) {
                                List<C1BGM> listLIZLLL = this.LIZ.LIZLLL(list);
                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
                                Iterator<C1BGM> it2 = listLIZLLL.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(C1BG3.LIZIZ(it2.next()));
                                }
                                return arrayList;
                            }
                        });
                        LIZIZ = c2202141BGq;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c2202141BGq;
    }
}
