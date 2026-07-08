package X;

import android.content.Context;
import android.widget.RelativeLayout;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS145S0101000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0EdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368880EdC extends RelativeLayout implements InterfaceC358560E3y {
    public final C358530E3v LL;
    public final C368390EcP LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final ArrayList<C351480DqE> LLILZLL;
    public final int LLIZ;
    public C370920EgU LLIZLLLIL;
    public final AwS619S0100000_5 LLJ;
    public final List<C368950EdJ> LLJI;
    public final List<NLETrackSlot> LLJIJIL;
    public InterfaceC369080EdW LLJILJIL;
    public int LLJILJILJ;
    public final C369070EdV LLJILLL;

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368880EdC.LJ():void");
    }

    @Override // X.InterfaceC358560E3y
    public int getCurScrollX() {
        InterfaceC369080EdW interfaceC369080EdW = this.LLJILJIL;
        if (interfaceC369080EdW != null) {
            return interfaceC369080EdW.LJII();
        }
        return 0;
    }

    @Override // X.InterfaceC358560E3y
    public C358550E3x getFrameData() {
        return new C358550E3x(C360610EBv.LIZJ(), C360610EBv.LIZJ);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0EdV] */
    public C368880EdC(Context context) {
        super(context, null, 0);
        this.LL = new C358530E3v(context, this);
        C368390EcP c368390EcPLIZ = C368130Ebz.LIZ(context);
        this.LLILLJJLI = c368390EcPLIZ;
        this.LLILLL = c368390EcPLIZ.LJFF;
        this.LLILZ = c368390EcPLIZ.LJII;
        this.LLILZIL = c368390EcPLIZ.LJI;
        this.LLILZLL = new ArrayList<>();
        this.LLIZ = C0FU0.LIZ(3.0f);
        this.LLJ = new AwS619S0100000_5(this, 53);
        this.LLJI = new ArrayList();
        this.LLJIJIL = new ArrayList();
        this.LLJILJILJ = 1001;
        this.LLJILLL = new InterfaceC369180Edg() { // from class: X.0EdV
            @Override // X.InterfaceC369180Edg
            public final void LLILIL(int i) {
            }

            @Override // X.InterfaceC369180Edg
            public final void LJLLILLLL(int i) {
                InterfaceC369080EdW interfaceC369080EdW = this.LL.LLJILJIL;
                if (interfaceC369080EdW != null) {
                    interfaceC369080EdW.LJLLILLLL(i);
                }
            }

            @Override // X.InterfaceC369180Edg
            public final void LJIIZILJ(boolean z, int i, int i2, boolean z2, boolean z3) {
                InterfaceC369080EdW interfaceC369080EdW = this.LL.LLJILJIL;
                if (interfaceC369080EdW != null) {
                    interfaceC369080EdW.LJIIZILJ(z, i, i2, z2, z3);
                }
            }
        };
        setClipChildren(false);
    }

    @Override // X.InterfaceC358560E3y
    public final void LIZ(int i) {
        C354270Duj.LIZJ(0L, new AwS145S0101000_5(i, this, 5));
    }

    public final void setMultiHighlightTrackListener(InterfaceC369080EdW interfaceC369080EdW) {
        this.LLJILJIL = interfaceC369080EdW;
    }

    public final boolean LIZLLL(int i, C368890EdD c368890EdD) {
        Pair<Long, Long> pair;
        C368890EdD c368890EdD2;
        List<C368940EdI> checkBoxInfoList$editor_trackpanel_release;
        C368940EdI c368940EdI;
        C368940EdI c368940EdI2 = (C368940EdI) C13LP.LJJLIIIJL(c368890EdD.getCheckBoxInfoList$editor_trackpanel_release());
        if (c368940EdI2 == null || (pair = c368940EdI2.LIZIZ) == null) {
            return false;
        }
        C368950EdJ c368950EdJ = (C368950EdJ) C13LP.LJJJLZIJ(i + 1, this.LLJI);
        if (c368950EdJ == null || (c368890EdD2 = c368950EdJ.LIZIZ) == null || (checkBoxInfoList$editor_trackpanel_release = c368890EdD2.getCheckBoxInfoList$editor_trackpanel_release()) == null || (c368940EdI = (C368940EdI) C13LP.LJJJLL(checkBoxInfoList$editor_trackpanel_release)) == null || c368940EdI.LIZIZ.getFirst().longValue() - pair.getSecond().longValue() >= this.LLILLL) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(Long l, C368950EdJ c368950EdJ, C368890EdD c368890EdD) {
        float fLIZJ;
        Pair<Long, Long> pair;
        Long second;
        int iLIZ;
        C368400EcQ c368400EcQ;
        C368890EdD c368890EdD2;
        List<C368940EdI> checkBoxInfoList$editor_trackpanel_release;
        C368940EdI c368940EdI;
        long jLIZ;
        int iIndexOf = ((ArrayList) this.LLJI).indexOf(c368950EdJ);
        if (iIndexOf != -1) {
            boolean z = true;
            int i = iIndexOf + 1;
            C368950EdJ c368950EdJ2 = (C368950EdJ) C13LP.LJJJLZIJ(i, this.LLJI);
            long jLongValue = 0;
            if (c368950EdJ2 != null && (c368940EdI = (C368940EdI) C13LP.LJJJLL(c368950EdJ2.LIZIZ.getCheckBoxInfoList$editor_trackpanel_release())) != null) {
                long jLongValue2 = c368940EdI.LIZIZ.getFirst().longValue();
                NLETrackSlot mainTrackSlot$editor_trackpanel_release = c368950EdJ2.LIZ.getMainTrackSlot$editor_trackpanel_release();
                if (mainTrackSlot$editor_trackpanel_release != null) {
                    jLIZ = C352310DrZ.LIZ(mainTrackSlot$editor_trackpanel_release.getStartTime());
                } else {
                    jLIZ = 0;
                }
                fLIZJ = (jLongValue2 - jLIZ) * C360610EBv.LIZJ();
            } else {
                fLIZJ = 0.0f;
            }
            if (fLIZJ < this.LLILLL) {
                C368950EdJ c368950EdJ3 = (C368950EdJ) C13LP.LJJJLZIJ(i, this.LLJI);
                C368940EdI c368940EdI2 = null;
                if (c368950EdJ3 != null && (c368890EdD2 = c368950EdJ3.LIZIZ) != null && (checkBoxInfoList$editor_trackpanel_release = c368890EdD2.getCheckBoxInfoList$editor_trackpanel_release()) != null) {
                    c368940EdI2 = (C368940EdI) C13LP.LJJJLL(checkBoxInfoList$editor_trackpanel_release);
                }
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    C368940EdI c368940EdI3 = (C368940EdI) C13LP.LJJLIIIJL(c368890EdD.getCheckBoxInfoList$editor_trackpanel_release());
                    if (c368940EdI3 != null && (pair = c368940EdI3.LIZIZ) != null && (second = pair.getSecond()) != null) {
                        jLongValue = second.longValue();
                    }
                }
                NLETrackSlot mainTrackSlot$editor_trackpanel_release2 = c368890EdD.getMainTrackSlot$editor_trackpanel_release();
                if (mainTrackSlot$editor_trackpanel_release2 != null) {
                    iLIZ = C352310DrZ.LIZ(mainTrackSlot$editor_trackpanel_release2.getEndTime());
                } else {
                    iLIZ = 0;
                }
                long j = ((long) iLIZ) - jLongValue;
                if (c368940EdI2 != null && (c368400EcQ = c368940EdI2.LIZ) != null) {
                    if (fLIZJ + j <= this.LLILLL) {
                        z = false;
                    }
                    c368400EcQ.LJ(z);
                }
            }
        }
    }

    public final void LIZJ(Long l, C368950EdJ c368950EdJ, C368890EdD c368890EdD) {
        float fLIZJ;
        Pair<Long, Long> pair;
        Long first;
        int iLIZ;
        C368400EcQ c368400EcQ;
        C368890EdD c368890EdD2;
        List<C368940EdI> checkBoxInfoList$editor_trackpanel_release;
        C368940EdI c368940EdI;
        long jLIZ;
        int iIndexOf = ((ArrayList) this.LLJI).indexOf(c368950EdJ);
        if (iIndexOf != -1) {
            C368950EdJ c368950EdJ2 = (C368950EdJ) C13LP.LJJJLZIJ(iIndexOf - 1, this.LLJI);
            long jLongValue = 0;
            if (c368950EdJ2 != null && (c368940EdI = (C368940EdI) C13LP.LJJLIIIJL(c368950EdJ2.LIZIZ.getCheckBoxInfoList$editor_trackpanel_release())) != null) {
                long jLongValue2 = c368940EdI.LIZIZ.getSecond().longValue();
                NLETrackSlot mainTrackSlot$editor_trackpanel_release = c368950EdJ2.LIZ.getMainTrackSlot$editor_trackpanel_release();
                if (mainTrackSlot$editor_trackpanel_release != null) {
                    jLIZ = C352310DrZ.LIZ(mainTrackSlot$editor_trackpanel_release.getEndTime());
                } else {
                    jLIZ = 0;
                }
                fLIZJ = (jLIZ - jLongValue2) * C360610EBv.LIZJ();
            } else {
                fLIZJ = 0.0f;
            }
            if (fLIZJ < this.LLILLL) {
                boolean z = true;
                C368950EdJ c368950EdJ3 = (C368950EdJ) C13LP.LJJJLZIJ(iIndexOf - 1, this.LLJI);
                C368940EdI c368940EdI2 = null;
                if (c368950EdJ3 != null && (c368890EdD2 = c368950EdJ3.LIZIZ) != null && (checkBoxInfoList$editor_trackpanel_release = c368890EdD2.getCheckBoxInfoList$editor_trackpanel_release()) != null) {
                    c368940EdI2 = (C368940EdI) C13LP.LJJLIIIJL(checkBoxInfoList$editor_trackpanel_release);
                }
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    C368940EdI c368940EdI3 = (C368940EdI) C13LP.LJJJLL(c368890EdD.getCheckBoxInfoList$editor_trackpanel_release());
                    if (c368940EdI3 != null && (pair = c368940EdI3.LIZIZ) != null && (first = pair.getFirst()) != null) {
                        jLongValue = first.longValue();
                    }
                }
                NLETrackSlot mainTrackSlot$editor_trackpanel_release2 = c368890EdD.getMainTrackSlot$editor_trackpanel_release();
                if (mainTrackSlot$editor_trackpanel_release2 != null) {
                    iLIZ = C352310DrZ.LIZ(mainTrackSlot$editor_trackpanel_release2.getStartTime());
                } else {
                    iLIZ = 0;
                }
                long j = jLongValue - ((long) iLIZ);
                if (c368940EdI2 != null && (c368400EcQ = c368940EdI2.LIZ) != null) {
                    if (fLIZJ + j <= this.LLILLL) {
                        z = false;
                    }
                    c368400EcQ.LIZLLL(z);
                }
            }
        }
    }
}
