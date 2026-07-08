package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0zkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907770zkF {
    public static final C1907770zkF LIZ = new C1907770zkF();
    public static final Map<Integer, AbstractC1907870zkP> LIZIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ = linkedHashMap;
        linkedHashMap.put(46, new AbstractC1907870zkP() { // from class: X.0zkJ
            @Override // X.AbstractC1907870zkP
            public final InterfaceC1259970itP LIZIZ() {
                return new InterfaceC1259970itP() { // from class: X.0zkG
                    @Override // X.InterfaceC1259970itP
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZLLL() {
                        C844470XAv.LIZ.getClass();
                        return C844470XAv.LIZ().getString(2131838279);
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZIZ() {
                        return C1907730zkB.LIZ();
                    }

                    @Override // X.InterfaceC1259970itP
                    public final List<BaseNotice> LIZJ(List<BaseNotice> list) {
                        ArrayList arrayList = new ArrayList();
                        for (BaseNotice baseNotice : list) {
                            if (baseNotice.announcement == null && baseNotice.textNotice == null) {
                                if (baseNotice.templateNotice != null) {
                                    arrayList.add(baseNotice);
                                }
                            } else {
                                arrayList.add(baseNotice);
                            }
                        }
                        return arrayList;
                    }

                    @Override // X.InterfaceC1259970itP
                    public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup) {
                        return new C1907930zkV(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aag, viewGroup, false), LIZ());
                    }

                    @Override // X.InterfaceC1259970itP
                    public final void LIZ(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i, boolean z) {
                        if (viewHolder instanceof C1907930zkV) {
                            ((C1907930zkV) viewHolder).P5(baseNotice);
                        }
                    }
                };
            }
        });
        linkedHashMap.put(47, new AbstractC1907870zkP() { // from class: X.0zkK
            @Override // X.AbstractC1907870zkP
            public final InterfaceC1259970itP LIZIZ() {
                return new InterfaceC1259970itP() { // from class: X.0zkH
                    @Override // X.InterfaceC1259970itP
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZLLL() {
                        C844470XAv.LIZ.getClass();
                        return C844470XAv.LIZ().getString(2131838286);
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZIZ() {
                        return C1907730zkB.LIZ();
                    }

                    @Override // X.InterfaceC1259970itP
                    public final List<BaseNotice> LIZJ(List<BaseNotice> list) {
                        ArrayList arrayList = new ArrayList();
                        for (BaseNotice baseNotice : list) {
                            if (baseNotice.announcement == null && baseNotice.textNotice == null) {
                                if (baseNotice.templateNotice != null) {
                                    arrayList.add(baseNotice);
                                }
                            } else {
                                arrayList.add(baseNotice);
                            }
                        }
                        return arrayList;
                    }

                    @Override // X.InterfaceC1259970itP
                    public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup) {
                        return new C1907920zkU(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aag, viewGroup, false), LIZ());
                    }

                    @Override // X.InterfaceC1259970itP
                    public final void LIZ(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i, boolean z) {
                        if (viewHolder instanceof C1907920zkU) {
                            ((C1907920zkU) viewHolder).N5(baseNotice);
                        }
                    }
                };
            }
        });
        linkedHashMap.put(21, new AbstractC1907870zkP() { // from class: X.0zkC
            @Override // X.AbstractC1907870zkP
            public final InterfaceC1259970itP LIZIZ() {
                return new InterfaceC1259970itP() { // from class: X.0zk8
                    @Override // X.InterfaceC1259970itP
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZLLL() {
                        C844470XAv.LIZ.getClass();
                        return C844470XAv.LIZ().getString(R.string.kgy);
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZIZ() {
                        return C1907730zkB.LIZ();
                    }

                    @Override // X.InterfaceC1259970itP
                    public final List<BaseNotice> LIZJ(List<BaseNotice> list) {
                        ArrayList arrayList = new ArrayList();
                        for (BaseNotice baseNotice : list) {
                            if (baseNotice.adHelperNotice != null) {
                                arrayList.add(baseNotice);
                            }
                        }
                        return arrayList;
                    }

                    @Override // X.InterfaceC1259970itP
                    public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup) {
                        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aaf, viewGroup, false);
                        getClass();
                        return new C1907680zk6(viewTd);
                    }

                    @Override // X.InterfaceC1259970itP
                    public final void LIZ(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i, boolean z) {
                        if (viewHolder instanceof C1907680zk6) {
                            ((C1907680zk6) viewHolder).N5(baseNotice);
                        }
                    }
                };
            }
        });
        linkedHashMap.put(62, new AbstractC1907870zkP() { // from class: X.0zkO
            @Override // X.AbstractC1907870zkP
            public final InterfaceC1259970itP LIZIZ() {
                return new InterfaceC1259970itP() { // from class: X.0zkI
                    @Override // X.InterfaceC1259970itP
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZLLL() {
                        C844470XAv.LIZ.getClass();
                        return C844470XAv.LIZ().getString(2131835737);
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZIZ() {
                        return C1907730zkB.LIZ();
                    }

                    @Override // X.InterfaceC1259970itP
                    public final List<BaseNotice> LIZJ(List<BaseNotice> list) {
                        ArrayList arrayList = new ArrayList();
                        for (BaseNotice baseNotice : list) {
                            if (baseNotice.tcmNotice != null) {
                                arrayList.add(baseNotice);
                            } else if (baseNotice.templateNotice != null) {
                                arrayList.add(baseNotice);
                            }
                        }
                        return arrayList;
                    }

                    @Override // X.InterfaceC1259970itP
                    public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup) {
                        return new C1907910zkT(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aag, viewGroup, false), LIZ());
                    }

                    @Override // X.InterfaceC1259970itP
                    public final void LIZ(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i, boolean z) {
                        if (viewHolder instanceof C1907910zkT) {
                            ((C1907910zkT) viewHolder).N5(baseNotice);
                        }
                    }
                };
            }
        });
        linkedHashMap.put(81, new AbstractC1907870zkP() { // from class: X.0zkE
            @Override // X.AbstractC1907870zkP
            public final InterfaceC1259970itP LIZIZ() {
                return new InterfaceC1259970itP() { // from class: X.0zkA
                    @Override // X.InterfaceC1259970itP
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZLLL() {
                        C844470XAv.LIZ.getClass();
                        return C844470XAv.LIZ().getString(2131845532);
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZIZ() {
                        return C1907730zkB.LIZ();
                    }

                    @Override // X.InterfaceC1259970itP
                    public final List<BaseNotice> LIZJ(List<BaseNotice> list) {
                        ArrayList arrayList = new ArrayList();
                        for (BaseNotice baseNotice : list) {
                            if (baseNotice.promoteNotice != null) {
                                arrayList.add(baseNotice);
                            } else if (baseNotice.templateNotice != null) {
                                arrayList.add(baseNotice);
                            }
                        }
                        return arrayList;
                    }

                    @Override // X.InterfaceC1259970itP
                    public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup) {
                        return new C1907620zk0(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aag, viewGroup, false), LIZ());
                    }

                    @Override // X.InterfaceC1259970itP
                    public final void LIZ(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i, boolean z) {
                        if (viewHolder instanceof C1907620zk0) {
                            ((C1907620zk0) viewHolder).N5(baseNotice);
                        }
                    }
                };
            }
        });
        linkedHashMap.put(82, new AbstractC1907870zkP() { // from class: X.0zkD
            @Override // X.AbstractC1907870zkP
            public final InterfaceC1259970itP LIZIZ() {
                return new InterfaceC1259970itP() { // from class: X.0zk9
                    @Override // X.InterfaceC1259970itP
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZLLL() {
                        C844470XAv.LIZ.getClass();
                        return C844470XAv.LIZ().getString(2131828214);
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZIZ() {
                        return C1907730zkB.LIZ();
                    }

                    @Override // X.InterfaceC1259970itP
                    public final List<BaseNotice> LIZJ(List<BaseNotice> list) {
                        ArrayList arrayList = new ArrayList();
                        for (BaseNotice baseNotice : list) {
                            if (baseNotice.businessAccountNotice != null) {
                                arrayList.add(baseNotice);
                            } else if (baseNotice.templateNotice != null) {
                                arrayList.add(baseNotice);
                            }
                        }
                        return arrayList;
                    }

                    @Override // X.InterfaceC1259970itP
                    public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup) {
                        return new C1907630zk1(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aae, viewGroup, false), LIZ());
                    }

                    @Override // X.InterfaceC1259970itP
                    public final void LIZ(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i, boolean z) {
                        if (viewHolder instanceof C1907630zk1) {
                            ((C1907630zk1) viewHolder).N5(baseNotice);
                        }
                    }
                };
            }
        });
        linkedHashMap.put(88, new AbstractC1907870zkP() { // from class: X.0zkD
            @Override // X.AbstractC1907870zkP
            public final InterfaceC1259970itP LIZIZ() {
                return new InterfaceC1259970itP() { // from class: X.0zk9
                    @Override // X.InterfaceC1259970itP
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZLLL() {
                        C844470XAv.LIZ.getClass();
                        return C844470XAv.LIZ().getString(2131828214);
                    }

                    @Override // X.InterfaceC1259970itP
                    public final String LIZIZ() {
                        return C1907730zkB.LIZ();
                    }

                    @Override // X.InterfaceC1259970itP
                    public final List<BaseNotice> LIZJ(List<BaseNotice> list) {
                        ArrayList arrayList = new ArrayList();
                        for (BaseNotice baseNotice : list) {
                            if (baseNotice.businessAccountNotice != null) {
                                arrayList.add(baseNotice);
                            } else if (baseNotice.templateNotice != null) {
                                arrayList.add(baseNotice);
                            }
                        }
                        return arrayList;
                    }

                    @Override // X.InterfaceC1259970itP
                    public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup) {
                        return new C1907630zk1(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aae, viewGroup, false), LIZ());
                    }

                    @Override // X.InterfaceC1259970itP
                    public final void LIZ(RecyclerView.ViewHolder viewHolder, BaseNotice baseNotice, int i, boolean z) {
                        if (viewHolder instanceof C1907630zk1) {
                            ((C1907630zk1) viewHolder).N5(baseNotice);
                        }
                    }
                };
            }
        });
    }
}
