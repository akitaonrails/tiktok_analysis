package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E4B, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E4B implements InterfaceC359970E9j, Observer<Integer> {
    public final C0E48 LL;

    @Override // X.InterfaceC359970E9j
    public final boolean LIZ() {
        return false;
    }

    public C0E4B(C0E48 c0e48) {
        this.LL = c0e48;
    }

    @Override // X.InterfaceC359970E9j
    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
        C0E4A.LIZIZ(this.LL, "after_enter_ep");
        LiveDataBus liveDataBus = LiveDataBus.getInstance();
        Class cls = Integer.TYPE;
        liveDataBus.with("key_mainViewModel", cls).removeObserver(this);
        LiveDataBus.getInstance().with("key_mainViewModel", cls).observe(lifecycleOwner, this);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Integer num) {
        Integer first;
        Integer first2;
        Integer first3;
        Integer second;
        Integer first4;
        Integer second2;
        Integer second3;
        Integer first5;
        Pair<Integer, Integer> pair;
        if (num.intValue() == 0) {
            C0E48 c0e48 = this.LL;
            if (C0E4A.LIZ() && C0E4A.LIZ && c0e48 != null) {
                Pair<Integer, Integer> canvasSize = c0e48.getCanvasSize();
                Integer second4 = null;
                if (canvasSize != null) {
                    first = canvasSize.getFirst();
                } else {
                    first = null;
                }
                Pair<Integer, Integer> pair2 = C0E4A.LIZIZ;
                if (pair2 != null) {
                    first2 = pair2.getFirst();
                } else {
                    first2 = null;
                }
                if (Intrinsics.LJFF(first, first2)) {
                    if (canvasSize != null) {
                        second2 = canvasSize.getSecond();
                    } else {
                        second2 = null;
                    }
                    Pair<Integer, Integer> pair3 = C0E4A.LIZIZ;
                    if (pair3 != null) {
                        second3 = pair3.getSecond();
                    } else {
                        second3 = null;
                    }
                    if (Intrinsics.LJFF(second2, second3)) {
                        float[] fArrLLJLLIL = c0e48.getPlayer().LLJLLIL();
                        if (fArrLLJLLIL != null) {
                            int i = (int) fArrLLJLLIL[2];
                            int i2 = (int) fArrLLJLLIL[3];
                            Pair<Integer, Integer> pair4 = C0E4A.LIZJ;
                            if (pair4 != null && i == pair4.getFirst().intValue() && (pair = C0E4A.LIZJ) != null && i2 == pair.getSecond().intValue()) {
                                C0E4A.LIZIZ(c0e48, "delay");
                                C0E4A.LIZ = false;
                                return;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("fitToDisplayInIDLE abort, currentDisplay(");
                            sbLIZ.append(i);
                            sbLIZ.append('-');
                            sbLIZ.append(i2);
                            sbLIZ.append(")but record ");
                            Pair<Integer, Integer> pair5 = C0E4A.LIZJ;
                            if (pair5 != null) {
                                first5 = pair5.getFirst();
                            } else {
                                first5 = null;
                            }
                            sbLIZ.append(first5);
                            sbLIZ.append('-');
                            Pair<Integer, Integer> pair6 = C0E4A.LIZJ;
                            if (pair6 != null) {
                                second4 = pair6.getSecond();
                            }
                            sbLIZ.append(second4);
                            C2188811AlT.LIZIZ(sbLIZ);
                            return;
                        }
                        return;
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fitToDisplayInIDLE abort, currentCanvasSize(");
                if (canvasSize != null) {
                    first3 = canvasSize.getFirst();
                } else {
                    first3 = null;
                }
                sbLIZ2.append(first3);
                sbLIZ2.append('-');
                if (canvasSize != null) {
                    second = canvasSize.getSecond();
                } else {
                    second = null;
                }
                sbLIZ2.append(second);
                sbLIZ2.append("), but record");
                Pair<Integer, Integer> pair7 = C0E4A.LIZIZ;
                if (pair7 != null) {
                    first4 = pair7.getFirst();
                } else {
                    first4 = null;
                }
                sbLIZ2.append(first4);
                sbLIZ2.append('-');
                Pair<Integer, Integer> pair8 = C0E4A.LIZIZ;
                if (pair8 != null) {
                    second4 = pair8.getSecond();
                }
                sbLIZ2.append(second4);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
    }
}
