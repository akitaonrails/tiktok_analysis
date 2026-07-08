package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0meU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404480meU extends AbstractC1446660nkW {
    public VideoPublishEditModel LJ;
    public C1405220mfg LJFF;
    public C1404570med LJI;
    public PublishModel LJII;
    public InterfaceC1434300nQa LJIIIIZZ;
    public C556300Lro LJIIIZ;
    public C556300Lro LJIIJ;
    public C556300Lro LJIIJJI;
    public boolean LJIIL;

    public C1404480meU() {
        super("DefaultWavePublisher", (List<? extends Object>) C1697810uHb.LJIIJJI(EnumC1434770nRL.COMPILE, EnumC1434770nRL.UPLOAD, EnumC1434770nRL.CREATE_AWEME));
    }

    public static int LJI() {
        if (C1404490meV.LIZ().enable) {
            return C1433730nPf.LJIILL();
        }
        C1436310nTp.LIZ.getClass();
        return Intrinsics.LJFF(C1436310nTp.LJFF.getValue(), Boolean.TRUE) ? C1433730nPf.LJIILL() + 1 : C1433730nPf.LJIILL();
    }

    public final void LJII() {
        C0CHQ.LIZ().getPublishService().LJIIL().LJJ(new AwS566S0100000_22(this, 807));
    }

    @Override // X.AbstractC1446660nkW, X.InterfaceC1840230xzJ
    public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
        super.onEvent(abstractC556190Lrd);
        Object obj = abstractC556190Lrd.LIZ;
        if (obj == EnumC1434770nRL.UPLOAD) {
            if (abstractC556190Lrd instanceof C556240Lri) {
                this.LJIIIZ = abstractC556190Lrd.LIZIZ;
            } else if (abstractC556190Lrd instanceof C556250Lrj) {
                this.LJIIJ = abstractC556190Lrd.LIZIZ;
            }
        } else if (obj == EnumC1434770nRL.CREATE_AWEME) {
            if (abstractC556190Lrd instanceof C556250Lrj) {
                this.LJIIJJI = abstractC556190Lrd.LIZIZ;
            }
        } else if (obj == EnumC1434770nRL.COMPILE && (abstractC556190Lrd instanceof C556250Lrj)) {
        }
        if (abstractC556190Lrd instanceof C556240Lri) {
            C0CHQ.LIZ().getPublishService().LJIIL().LJJ(new AwS566S0100000_22(abstractC556190Lrd, 806));
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LJ(Object obj, C1404610meh c1404610meh) {
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            C1405220mfg c1405220mfg = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    this.LJ = ((C1434960nRe) next).LIZ;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof C1434970nRf) {
                            if (next2 != null) {
                                this.LJII = ((C1434970nRf) next2).LIZ;
                                Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it4.next();
                                    if (next3 instanceof C1405220mfg) {
                                        if (next3 != null) {
                                            this.LJFF = (C1405220mfg) next3;
                                            Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it5.next();
                                                if (next4 instanceof C1404570med) {
                                                    if (next4 != null) {
                                                        this.LJI = (C1404570med) next4;
                                                        Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                                        while (true) {
                                                            if (!it6.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it6.next();
                                                            if (next5 instanceof InterfaceC1434300nQa) {
                                                                if (next5 != null) {
                                                                    this.LJIIIIZZ = (InterfaceC1434300nQa) next5;
                                                                    C1405220mfg c1405220mfg2 = this.LJFF;
                                                                    if (c1405220mfg2 != null) {
                                                                        c1405220mfg = c1405220mfg2;
                                                                    }
                                                                    c1405220mfg.LIZJ(new AwS601S0100000_22(this, 623));
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
        if (C1404490meV.LIZ().enable) {
            LJII();
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
        if (C1404490meV.LIZ().enable) {
            LJII();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:350:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021c  */
    @Override // X.AbstractC1446660nkW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.lang.Object r45, java.lang.Object r46, boolean r47, int r48, int r49) {
        /*
            Method dump skipped, instruction units count: 1957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1404480meU.LJFF(java.lang.Object, java.lang.Object, boolean, int, int):void");
    }
}
