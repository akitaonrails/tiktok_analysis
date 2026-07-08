package Y;

import X.C14GT;
import X.C1724380uyS;
import X.C20154213tU;
import X.C20236614Ge;
import android.app.Dialog;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pipo.ocr.ocr.OcrResultViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AObserverS232S0100000_30 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
        }
    }

    public AObserverS232S0100000_30(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS232S0100000_30 aObserverS232S0100000_30, Object obj) {
        if (obj != null) {
            DialogFragment dialogFragment = (DialogFragment) aObserverS232S0100000_30.l0;
            if (dialogFragment.mShowsDialog) {
                View viewRequireView = dialogFragment.requireView();
                if (viewRequireView.getParent() == null) {
                    Dialog dialog = ((DialogFragment) aObserverS232S0100000_30.l0).mDialog;
                    if (dialog != null) {
                        dialog.setContentView(viewRequireView);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$1(Y.AObserverS232S0100000_30 r6, java.lang.Object r7) {
        /*
            java.lang.String r7 = (java.lang.String) r7
            r5 = 0
            if (r7 == 0) goto L3f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r3 = r7.length()
            r2 = 0
        Lf:
            if (r2 >= r3) goto L21
            char r1 = r7.charAt(r2)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 == 0) goto L1e
            r4.append(r1)
        L1e:
            int r2 = r2 + 1
            goto Lf
        L21:
            java.lang.String r1 = r4.toString()
            if (r1 == 0) goto L3f
            int r0 = r1.length()
            if (r0 == 0) goto L3f
            int r1 = r1.length()
            r0 = 12
            if (r0 > r1) goto L3f
            r0 = 19
            if (r0 < r1) goto L3f
            X.13tU r1 = new X.13tU
            r1.<init>(r5)
            goto L4a
        L3f:
            java.lang.String r0 = "pipo_payin_ocr_invalid_card"
            java.lang.String r0 = X.C1724380uyS.LIZ(r0)
            X.13tU r1 = new X.13tU
            r1.<init>(r5, r0)
        L4a:
            java.lang.Object r0 = r6.l0
            com.bytedance.pipo.ocr.ocr.OcrResultViewModel r0 = (com.bytedance.pipo.ocr.ocr.OcrResultViewModel) r0
            androidx.lifecycle.MediatorLiveData<X.13tU> r0 = r0.LLILZ
            r0.postValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS232S0100000_30.onChanged$1(Y.AObserverS232S0100000_30, java.lang.Object):void");
    }

    public static final void onChanged$2(AObserverS232S0100000_30 aObserverS232S0100000_30, Object obj) {
        String str = (String) obj;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            if (string != null && string.length() != 0) {
                int length2 = string.length();
                if (length2 != 2) {
                    if (length2 != 4) {
                        ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLILZIL.postValue(new C20154213tU(false, C1724380uyS.LIZ("pipo_payin_ocr_invalid_date")));
                        return;
                    }
                    try {
                        int i2 = CastIntegerProtector.parseInt(string.substring(2, 4));
                        String str2 = new SimpleDateFormat("yyMM").format(new Date());
                        if (str2 != null) {
                            if (i2 > CastIntegerProtector.parseInt(str2.substring(0, 2)) + 15) {
                                ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLILZIL.postValue(new C20154213tU(false, C1724380uyS.LIZ("pipo_payin_ocr_year_limitation")));
                                return;
                            } else {
                                ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLILZIL.postValue(new C20154213tU(0));
                                return;
                            }
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                try {
                    int i3 = CastIntegerProtector.parseInt(string.substring(0, 2));
                    if (1 <= i3 && 12 >= i3) {
                        ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLILZIL.postValue(new C20154213tU(false, C1724380uyS.LIZ("pipo_payin_ocr_invalid_date")));
                        return;
                    } else {
                        ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLILZIL.postValue(new C20154213tU(false, C1724380uyS.LIZ("pipo_payin_ocr_month_limitation")));
                        return;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return;
                }
            }
        }
        ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLILZIL.postValue(new C20154213tU(0));
    }

    public static final void onChanged$3(AObserverS232S0100000_30 aObserverS232S0100000_30, Object obj) {
        ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLILZLL.postValue(new C20154213tU(0));
    }

    public static final void onChanged$4(AObserverS232S0100000_30 aObserverS232S0100000_30, Object obj) {
        boolean z;
        boolean z2;
        C20154213tU c20154213tU = (C20154213tU) obj;
        C20154213tU value = ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLILZIL.getValue();
        boolean z3 = false;
        if (value != null) {
            z = value.LIZ;
        } else {
            z = false;
        }
        C20154213tU value2 = ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLILZLL.getValue();
        if (value2 != null) {
            z2 = value2.LIZ;
        } else {
            z2 = false;
        }
        MediatorLiveData<Boolean> mediatorLiveData = ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLIZ;
        if (c20154213tU.LIZ && z && z2) {
            z3 = true;
        }
        mediatorLiveData.postValue(Boolean.valueOf(z3));
    }

    public static final void onChanged$5(AObserverS232S0100000_30 aObserverS232S0100000_30, Object obj) {
        boolean z;
        boolean z2;
        C20154213tU c20154213tU = (C20154213tU) obj;
        C20154213tU value = ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLILZ.getValue();
        boolean z3 = false;
        if (value != null) {
            z = value.LIZ;
        } else {
            z = false;
        }
        C20154213tU value2 = ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLILZLL.getValue();
        if (value2 != null) {
            z2 = value2.LIZ;
        } else {
            z2 = false;
        }
        MediatorLiveData<Boolean> mediatorLiveData = ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLIZ;
        if (c20154213tU.LIZ && z && z2) {
            z3 = true;
        }
        mediatorLiveData.postValue(Boolean.valueOf(z3));
    }

    public static final void onChanged$6(AObserverS232S0100000_30 aObserverS232S0100000_30, Object obj) {
        boolean z;
        boolean z2;
        C20154213tU c20154213tU = (C20154213tU) obj;
        C20154213tU value = ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLILZIL.getValue();
        boolean z3 = false;
        if (value != null) {
            z = value.LIZ;
        } else {
            z = false;
        }
        C20154213tU value2 = ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLILZ.getValue();
        if (value2 != null) {
            z2 = value2.LIZ;
        } else {
            z2 = false;
        }
        MediatorLiveData<Boolean> mediatorLiveData = ((OcrResultViewModel) aObserverS232S0100000_30.l0).LLIZ;
        if (c20154213tU.LIZ && z && z2) {
            z3 = true;
        }
        mediatorLiveData.postValue(Boolean.valueOf(z3));
    }

    public static final void onChanged$7(AObserverS232S0100000_30 aObserverS232S0100000_30, Object obj) {
        C14GT c14gt = (C14GT) aObserverS232S0100000_30.l0;
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue <= 0) {
            ((Rect) c14gt.LLJI.getValue()).set((Rect) c14gt.LLJ.getValue());
        } else if (((Number) c14gt.LLILLJJLI.getValue()).intValue() - iIntValue > ((Rect) c14gt.LLJI.getValue()).top) {
            ((Rect) c14gt.LLJI.getValue()).bottom = ((Number) c14gt.LLILLJJLI.getValue()).intValue() - iIntValue;
        }
        C20236614Ge c20236614Ge = c14gt.LLILZ;
        if (c20236614Ge == null) {
            c20236614Ge = null;
        }
        c20236614Ge.e0(c20236614Ge.LLILLJJLI, (Rect) c14gt.LLJI.getValue());
    }

    public static final void onChanged$8(AObserverS232S0100000_30 aObserverS232S0100000_30, Object obj) {
        ((Function1) aObserverS232S0100000_30.l0).invoke(obj);
    }
}
