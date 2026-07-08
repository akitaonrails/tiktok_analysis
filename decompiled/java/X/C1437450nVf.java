package X;

import Y.AfS191S0100000_22;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437450nVf extends AbstractC1446660nkW {
    public C1434960nRe LJ;
    public C1405220mfg LJFF;
    public C1404570med LJI;
    public PublishModel LJII;
    public C1437460nVg LJIIIIZZ;

    @Override // X.AbstractC1446660nkW
    public final void LIZLLL(Object obj, C556300Lro c556300Lro, AbstractC556190Lrd abstractC556190Lrd) {
    }

    public C1437450nVf() {
        super(2, EnumC1434770nRL.UPLOAD);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0nVh] */
    @Override // X.AbstractC1446660nkW
    public final void LJ(Object obj, C1404610meh c1404610meh) {
        PublishModel publishModel;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            C1405220mfg c1405220mfg = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    this.LJ = (C1434960nRe) next;
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
                                                        C1404570med c1404570med = this.LJI;
                                                        if (c1404570med == null) {
                                                            c1404570med = null;
                                                        }
                                                        String str = c1404570med.LIZ;
                                                        PublishModel publishModel2 = this.LJII;
                                                        if (publishModel2 == null) {
                                                            publishModel = null;
                                                        } else {
                                                            publishModel = publishModel2;
                                                        }
                                                        String str2 = publishModel.shootWay;
                                                        if (publishModel2 == null) {
                                                            publishModel2 = null;
                                                        }
                                                        boolean zLIZJ = publishModel2.LIZJ();
                                                        C1405220mfg c1405220mfg2 = this.LJFF;
                                                        if (c1405220mfg2 == null) {
                                                            c1405220mfg2 = null;
                                                        }
                                                        C1437460nVg c1437460nVg = new C1437460nVg(str, str2, zLIZJ, c1405220mfg2.LIZIZ, new InterfaceC1437480nVi() { // from class: X.0nVh
                                                            @Override // X.InterfaceC1437480nVi
                                                            public final void LIZ() {
                                                            }

                                                            @Override // X.InterfaceC1437480nVi
                                                            public final void LIZIZ() {
                                                            }
                                                        });
                                                        this.LJIIIIZZ = c1437460nVg;
                                                        C1434960nRe c1434960nRe = this.LJ;
                                                        if (c1434960nRe == null) {
                                                            c1434960nRe = null;
                                                        }
                                                        c1437460nVg.LJIIIZ = c1434960nRe.LIZ.getCreationId();
                                                        C1437460nVg c1437460nVg2 = this.LJIIIIZZ;
                                                        if (c1437460nVg2 != null) {
                                                            C1434960nRe c1434960nRe2 = this.LJ;
                                                            if (c1434960nRe2 == null) {
                                                                c1434960nRe2 = null;
                                                            }
                                                            c1437460nVg2.LJIIJ = C1428470nHB.LJIILL(c1434960nRe2.LIZ);
                                                        }
                                                        C1437460nVg c1437460nVg3 = this.LJIIIIZZ;
                                                        if (c1437460nVg3 != null) {
                                                            C1434960nRe c1434960nRe3 = this.LJ;
                                                            if (c1434960nRe3 == null) {
                                                                c1434960nRe3 = null;
                                                            }
                                                            c1437460nVg3.LJIIJJI = C1428470nHB.LJIILIIL(c1434960nRe3.LIZ);
                                                        }
                                                        C1405220mfg c1405220mfg3 = this.LJFF;
                                                        if (c1405220mfg3 != null) {
                                                            c1405220mfg = c1405220mfg3;
                                                        }
                                                        c1405220mfg.LIZJ(new AwS601S0100000_22(this, 626));
                                                        C1437460nVg c1437460nVg4 = this.LJIIIIZZ;
                                                        if (c1437460nVg4 != null && c1437460nVg4.LJI > 0) {
                                                            c1437460nVg4.LJIIIIZZ = SystemClock.uptimeMillis();
                                                            c1437460nVg4.LJII = (C11JF) C11NZ.LJJJJLI(c1437460nVg4.LJI, TimeUnit.SECONDS).LJJLJLI(new AfS191S0100000_22(c1437460nVg4, 34));
                                                            return;
                                                        }
                                                        return;
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
    public final void LIZIZ(C556300Lro c556300Lro, Object obj, Object obj2) {
        C1437460nVg c1437460nVg;
        if (this.LJIIIIZZ == null) {
            C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sourceTag: ");
            sbLIZ.append(obj);
            sbLIZ.append(", info: ");
            sbLIZ.append(obj2);
            c1437510nVlLJJLIIIJ.LIZ("UploadSdkCustomReporter_onCustomEvent", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (obj2 instanceof C1434360nQg) {
            C1434360nQg c1434360nQg = (C1434360nQg) obj2;
            if (c1434360nQg.LIZ == 100 && !TextUtils.isEmpty(c1434360nQg.LIZJ)) {
                C201955140j.LIZIZ("ttmn", c1434360nQg.LIZJ);
            }
            if (c1434360nQg.LIZ == 101 && (c1437460nVg = this.LJIIIIZZ) != null) {
                int i = c1434360nQg.LIZIZ;
                String str = c1434360nQg.LIZJ;
                if (c1437460nVg.LJI > 0 && !c1437460nVg.LJIIL && str != null && str.length() != 0) {
                    if (c1437460nVg.LJFF.size() >= 20) {
                        c1437460nVg.LJFF.poll();
                    }
                    ConcurrentLinkedQueue<String> concurrentLinkedQueue = c1437460nVg.LJFF;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('[');
                    sbLIZ2.append(i);
                    sbLIZ2.append("][");
                    sbLIZ2.append(System.currentTimeMillis());
                    sbLIZ2.append(']');
                    sbLIZ2.append(str);
                    concurrentLinkedQueue.offer(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
        C1437460nVg c1437460nVg = this.LJIIIIZZ;
        if (c1437460nVg != null) {
            c1437460nVg.LIZ(EnumC1288180jcu.CANCEL);
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
        C1437460nVg c1437460nVg = this.LJIIIIZZ;
        if (c1437460nVg != null) {
            c1437460nVg.LIZ(EnumC1288180jcu.FAILED);
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
        C1437460nVg c1437460nVg = this.LJIIIIZZ;
        if (c1437460nVg != null) {
            c1437460nVg.LIZ(EnumC1288180jcu.SUCCESS);
        }
    }
}
