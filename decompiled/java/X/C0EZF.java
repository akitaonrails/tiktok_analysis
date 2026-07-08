package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Stack;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.internal.AwS66S0301000_5;

/* JADX INFO: renamed from: X.0EZF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZF implements C0EZA {
    public final InterfaceC1455860nzM LIZ;
    public Point LIZIZ;
    public int LIZJ;
    public final C560530Lyd<Pair<Integer, Integer>> LIZLLL = new C560530Lyd<>();
    public long LJ = -1;
    public final C560530Lyd<Boolean> LJFF = new C560530Lyd<>();
    public final InterfaceC1452170ntP LJI;
    public InterfaceC19755712Rf LJII;

    @Override // X.C0EZA
    public final void LJI() {
    }

    @Override // X.C0EZA
    public final Point LIZ() {
        Point pointLIZLLL;
        InterfaceC19755712Rf interfaceC19755712Rf = this.LJII;
        if (interfaceC19755712Rf == null || (pointLIZLLL = interfaceC19755712Rf.LIZLLL()) == null) {
            return null;
        }
        pointLIZLLL.getX();
        pointLIZLLL.setY(pointLIZLLL.getY() + 100);
        int y = pointLIZLLL.getY();
        int i = this.LIZJ;
        if (y > i) {
            pointLIZLLL.setY(i);
        }
        LJII(null, null);
        this.LIZLLL.LJIIJ(new Pair<>(Integer.valueOf(pointLIZLLL.getX()), Integer.valueOf(this.LIZJ)));
        this.LJFF.LJIIJ(Boolean.FALSE);
        return pointLIZLLL;
    }

    @Override // X.C0EZA
    public final void LIZLLL() {
        this.LJFF.LJIIJ(Boolean.TRUE);
    }

    @Override // X.C0EZA
    public final void LJ() {
        InterfaceC1452170ntP interfaceC1452170ntP = this.LJI;
        if (interfaceC1452170ntP == null) {
            return;
        }
        Point point = this.LIZIZ;
        if (point == null) {
            long j = this.LJ;
            int iLLL = (j == -1 || j >= ((long) this.LIZJ)) ? interfaceC1452170ntP.LLL() : (int) j;
            if (iLLL < 50) {
                iLLL = 0;
            }
            InterfaceC19755712Rf interfaceC19755712Rf = this.LJII;
            this.LIZIZ = interfaceC19755712Rf != null ? interfaceC19755712Rf.LJ(iLLL) : null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prepareSeekBarWhenRecording2 setPoint-->start:");
            sbLIZ.append(iLLL);
            sbLIZ.append(" nowPosition:");
            sbLIZ.append(this.LJ);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        InterfaceC19755712Rf interfaceC19755712Rf2 = this.LJII;
        this.LIZIZ = interfaceC19755712Rf2 != null ? interfaceC19755712Rf2.LJ(point.getY()) : null;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("prepareSeekBarWhenRecording1 setPoint-->start:");
        Point point2 = this.LIZIZ;
        if (point2 == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        sbLIZ2.append(point2.getY());
        sbLIZ2.append(" nowPosition:");
        sbLIZ2.append(this.LJ);
        C2188811AlT.LIZIZ(sbLIZ2);
        C560530Lyd<Pair<Integer, Integer>> c560530Lyd = this.LIZLLL;
        Point point3 = this.LIZIZ;
        if (point3 != null) {
            c560530Lyd.LJIIJ(new Pair<>(Integer.valueOf(point3.getY()), Integer.valueOf(this.LIZJ)));
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.C0EZA
    public final Stack<Point> LJFF() {
        Stack<Point> stack;
        InterfaceC19755712Rf interfaceC19755712Rf = this.LJII;
        return (interfaceC19755712Rf == null || (stack = interfaceC19755712Rf.getStack()) == null) ? new Stack<>() : stack;
    }

    public C0EZF(InterfaceC1455860nzM interfaceC1455860nzM) {
        this.LIZ = interfaceC1455860nzM;
        this.LIZJ = 1;
        InterfaceC1452170ntP value = interfaceC1455860nzM.g().getValue();
        this.LJI = value;
        if (value != null) {
            this.LIZJ = value.getDuration();
        }
    }

    @Override // X.C0EZA
    public final void LIZJ(boolean z) {
        if (!z) {
            this.LJFF.LJIIJ(Boolean.FALSE);
        }
    }

    public final void LJII(Integer num, Integer num2) {
        if (num != null) {
            int iIntValue = num.intValue();
            Point point = this.LIZIZ;
            if (point != null) {
                point.setX(iIntValue);
            }
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            Point point2 = this.LIZIZ;
            if (point2 != null) {
                point2.setY(iIntValue2);
            }
        }
        if (num == null && num2 == null) {
            this.LIZIZ = null;
        }
    }

    @Override // X.C0EZA
    public final void LIZIZ(int i, boolean z, C0EZE c0eze, Cert cert, final VideoPublishEditModel videoPublishEditModel) {
        final long x;
        int y;
        Integer numValueOf;
        if (c0eze != null) {
            if (z) {
                Point point = this.LIZIZ;
                if (point != null) {
                    point.setY(this.LIZJ);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pauseSeekBar1-->curPoint?.y:");
                Point point2 = this.LIZIZ;
                if (point2 != null) {
                    numValueOf = Integer.valueOf(point2.getY());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                c0eze.LIZLLL(cert);
            } else {
                C1524705y1.LIZJ(new AwS66S0301000_5(c0eze, cert, this, i, 3));
            }
            final String strLIZ = c0eze.LIZ();
            Point point3 = this.LIZIZ;
            if (point3 != null) {
                x = point3.getX();
            } else {
                x = 0;
            }
            Point point4 = this.LIZIZ;
            if (point4 != null) {
                y = point4.getY();
            } else {
                y = this.LIZJ;
            }
            final long j = y;
            if (j > x) {
                C15O7.LIZJ(new Callable() { // from class: X.0DuO
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Integer numValueOf2;
                        C348100Dkm c348100DkmLIZIZ;
                        NLEEditor nLEEditor;
                        C1C7U.LIZ("RecordStackDataHandler@4b49.pauseSeekBar$1$2");
                        InterfaceC1452170ntP interfaceC1452170ntP = this.LL.LJI;
                        if (interfaceC1452170ntP == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null) {
                            numValueOf2 = null;
                        } else {
                            VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                            String str = strLIZ;
                            long j2 = j;
                            long j3 = x;
                            C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.DUB);
                            c347650Dk3.LIZIZ = str;
                            c347650Dk3.LIZLLL = 0L;
                            c347650Dk3.LJ = j2 - j3;
                            c347650Dk3.LJFF = j3;
                            c347650Dk3.LJI = j2;
                            AudioRecorderParam veAudioRecorderParam = videoPublishEditModel2.getVeAudioRecorderParam();
                            c347650Dk3.LJIIIZ = veAudioRecorderParam != null ? veAudioRecorderParam.getRecordVolume() : 1.0f;
                            numValueOf2 = Integer.valueOf(C349300Dmi.LIZ(nLEEditor, c347650Dk3, videoPublishEditModel2));
                        }
                        C1C7U.LIZIZ("RecordStackDataHandler@4b49.pauseSeekBar$1$2");
                        return numValueOf2;
                    }
                });
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("quick click from ");
            sbLIZ2.append(x);
            sbLIZ2.append(" to ");
            sbLIZ2.append(j);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }
}
