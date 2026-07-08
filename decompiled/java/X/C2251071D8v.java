package X;

import Y.ALAdapterS28S0100000_35;
import Y.AUListenerS281S0100000_35;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.wavepublish.utils.mapper.PublishProgressMapperConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2251071D8v implements InterfaceC1840230xzJ {
    public final InterfaceC1434300nQa LIZ;
    public final String LIZIZ;
    public final Function2<Integer, C1434900nRY, Unit> LIZJ;
    public C1405220mfg LIZLLL;
    public final C2251031D8r LJ;
    public PublishModel LJFF;
    public ValueAnimator LJI;
    public volatile int LJIIIZ;
    public volatile int LJIIJ;
    public volatile boolean LJIIJJI;
    public ValueAnimator LJIILIIL;
    public volatile int LJIILJJIL;
    public volatile boolean LJIILL;
    public volatile boolean LJIILLIIL;
    public int LJIIZILJ;
    public C2183941Adc LJIJ;
    public volatile Object LJII = Unit.LIZ;
    public volatile float LJIIIIZZ = -1.0f;
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(10));

    public boolean LIZLLL() {
        return false;
    }

    public boolean LJ() {
        return false;
    }

    public PublishProgressMapperConfig LJFF() {
        return null;
    }

    public long LJII() {
        return 0L;
    }

    public long LJIIIIZZ() {
        return 0L;
    }

    public long LJIIIZ() {
        return 500L;
    }

    public long LJIIJ() {
        return 8L;
    }

    public float LJIIJJI() {
        return 0.5f;
    }

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LJIILIIL;
        if (valueAnimator != null) {
            C201955140j.LIZLLL(C830690WiJ.LIZIZ, "PublishProgressCalculator", "cancelUploadTargetAnimation");
            this.LJIILL = false;
            this.LJIILLIIL = false;
            this.LJIIZILJ++;
            C01TT.LIZLLL(new AwS436S0200000_35(valueAnimator, this, 0));
        }
    }

    public final void LIZIZ() {
        if (this.LJI != null) {
            return;
        }
        C201955140j.LIZLLL(C830690WiJ.LIZIZ, "PublishProgressCalculator", "enableSimulateProgress");
        this.LJIIJJI = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(LJII());
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS281S0100000_35(this, 1));
        valueAnimatorOfFloat.addListener(new ALAdapterS28S0100000_35(this, 0));
        this.LJI = valueAnimatorOfFloat;
        C01TT.LIZLLL(new AwS579S0100000_35(this, 18));
    }

    public final void LIZJ() {
        if (this.LJIILIIL != null) {
            return;
        }
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableUploadTargetAnimation, duration=");
        sbLIZ.append(LJIIIIZZ());
        C201955140j.LIZLLL(c830690WiJ, "PublishProgressCalculator", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIILL = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(LJIIJJI(), 1.0f);
        valueAnimatorOfFloat.setDuration(LJIIIIZZ());
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS281S0100000_35(this, 2));
        valueAnimatorOfFloat.addListener(new ALAdapterS28S0100000_35(this, 1));
        this.LJIILIIL = valueAnimatorOfFloat;
        C01TT.LIZLLL(new AwS579S0100000_35(this, 19));
    }

    public final C1431640nMI LJI() {
        return (C1431640nMI) this.LJIIL.getValue();
    }

    @Override // X.InterfaceC1840230xzJ
    public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
        Object next;
        if (this.LIZLLL == null && (abstractC556190Lrd instanceof C556240Lri)) {
            C556240Lri c556240Lri = (C556240Lri) abstractC556190Lrd;
            Iterator<Object> it2 = c556240Lri.LIZLLL.LIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next == null || (next instanceof C1405220mfg)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            this.LIZLLL = (C1405220mfg) next;
            Iterator<Object> it3 = c556240Lri.LIZLLL.LIZ.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (next2 instanceof C1434970nRf) {
                    if (next2 != null) {
                        this.LJFF = ((C1434970nRf) next2).LIZ;
                    }
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
        }
        if ((abstractC556190Lrd instanceof C556200Lre) && (((C556200Lre) abstractC556190Lrd).LIZJ instanceof C1411860mqO)) {
            LJIILIIL(((C1411860mqO) ((C556200Lre) abstractC556190Lrd).LIZJ).LIZ, abstractC556190Lrd.LIZ);
        } else if (abstractC556190Lrd instanceof C556250Lrj) {
            LJIILIIL(1.0f, abstractC556190Lrd.LIZ);
        }
        if (Intrinsics.LJFF(abstractC556190Lrd.LIZ, this.LIZIZ)) {
            boolean z = abstractC556190Lrd instanceof C556250Lrj;
            if (!z && !(abstractC556190Lrd instanceof C556230Lrh) && !(abstractC556190Lrd instanceof C556220Lrg)) {
                if ((abstractC556190Lrd instanceof C556240Lri) || (abstractC556190Lrd instanceof C556180Lrc)) {
                    PublishProgressMapperConfig publishProgressMapperConfigLJFF = LJFF();
                    if (publishProgressMapperConfigLJFF != null && publishProgressMapperConfigLJFF.getEnabled()) {
                        PublishProgressMapperConfig publishProgressMapperConfigLJFF2 = LJFF();
                        if (publishProgressMapperConfigLJFF2 != null) {
                            C2183941Adc c2183941Adc = this.LJIJ;
                            if (c2183941Adc != null) {
                                AnonymousClass0956 anonymousClass0956 = c2183941Adc.LJII;
                                if (anonymousClass0956 != null) {
                                    anonymousClass0956.LIZIZ(null);
                                }
                                c2183941Adc.LJII = null;
                            }
                            C2183941Adc c2183941Adc2 = new C2183941Adc(publishProgressMapperConfigLJFF2, new AwS614S0100000_35(this, 34));
                            this.LJIJ = c2183941Adc2;
                            C1405220mfg c1405220mfg = this.LIZLLL;
                            if (c1405220mfg != null && !c1405220mfg.LIZIZ) {
                                C1405220mfg c1405220mfg2 = this.LIZLLL;
                                if (c1405220mfg2 != null) {
                                    c1405220mfg2.LIZJ(new AwS612S0100000_33(c2183941Adc2, 2));
                                    return;
                                }
                                return;
                            }
                            c2183941Adc2.LIZ();
                            return;
                        }
                        return;
                    }
                    if (LIZLLL()) {
                        C1405220mfg c1405220mfg3 = this.LIZLLL;
                        if (c1405220mfg3 != null && !c1405220mfg3.LIZIZ) {
                            C1405220mfg c1405220mfg4 = this.LIZLLL;
                            if (c1405220mfg4 != null) {
                                c1405220mfg4.LIZJ(new AwS614S0100000_35(this, 35));
                            }
                        } else {
                            LIZIZ();
                        }
                    }
                    if (!LJ()) {
                        return;
                    }
                    C1405220mfg c1405220mfg5 = this.LIZLLL;
                    if (c1405220mfg5 != null && !c1405220mfg5.LIZIZ) {
                        C1405220mfg c1405220mfg6 = this.LIZLLL;
                        if (c1405220mfg6 == null) {
                            return;
                        }
                        c1405220mfg6.LIZJ(new AwS614S0100000_35(this, 36));
                        return;
                    }
                    LIZJ();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator = this.LJI;
            if (valueAnimator != null) {
                C201955140j.LIZLLL(C830690WiJ.LIZIZ, "PublishProgressCalculator", "cancelSimulationProgress");
                this.LJIIJJI = false;
                C01TT.LIZLLL(new AwS436S0200000_35(valueAnimator, this, 2));
            }
            LIZ();
            if (this.LJIJ == null) {
                return;
            }
            if (z) {
                this.LJIIIZ = this.LJIIJ;
                LJIIL(this.LJII, this.LJIIIIZZ, this.LJIIJ, true);
            }
            C2183941Adc c2183941Adc3 = this.LJIJ;
            if (c2183941Adc3 != null) {
                AnonymousClass0956 anonymousClass09562 = c2183941Adc3.LJII;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                c2183941Adc3.LJII = null;
            }
            this.LJIJ = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(float r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2251071D8v.LJIILIIL(float, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2251071D8v(ArrayList<C1437500nVk> arrayList, InterfaceC1434300nQa interfaceC1434300nQa, String str, Function2<? super Integer, ? super C1434900nRY, Unit> function2) {
        this.LIZ = interfaceC1434300nQa;
        this.LIZIZ = str;
        this.LIZJ = function2;
        this.LJ = new C2251031D8r(arrayList);
    }

    public final void LJIIL(Object obj, float f, int i, boolean z) {
        boolean z2;
        String string;
        C1405220mfg c1405220mfg = this.LIZLLL;
        if (c1405220mfg != null) {
            z2 = c1405220mfg.LIZIZ;
        } else {
            z2 = false;
        }
        this.LIZJ.invoke(Integer.valueOf(i), new C1434900nRY(obj, z2, this.LJFF, f, z, this.LJIIIZ));
        if (obj == EnumC1434770nRL.COMPILE) {
            string = "STEP_SYNTHETISE";
        } else if (obj == EnumC1434770nRL.AUTH_KEY) {
            string = "QUERY_URL";
        } else if (obj == EnumC1434770nRL.UPLOAD) {
            string = "UPLOAD";
        } else if (obj == EnumC1434770nRL.COVER_TEXT_UPLOAD) {
            string = "UPLOAD_COVER_TEXT";
        } else if (obj == EnumC1434770nRL.CREATE_AWEME) {
            string = "CREATE_AWEME";
        } else {
            string = obj.toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current step is: ");
        sbLIZ.append(string);
        sbLIZ.append(" and it's progress is: ");
        sbLIZ.append(f);
        sbLIZ.append(" overall progress is: ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("simulate upload ");
            sbLIZ2.append(0);
            sbLIZ2.append(", ");
            sbLIZ2.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LIZ.LIZJ();
        C1405310mfp.LIZLLL("ProgressBarUnification", strLIZIZ);
    }
}
