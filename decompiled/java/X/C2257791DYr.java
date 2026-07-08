package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.bddatefmt.BDDateFormat;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257791DYr extends C12KZ {
    public int LLILZLL;
    public int LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public Long LLJI;
    public Function1<? super Long, Unit> LLJIJIL;
    public AbstractC2257761DYo LLJILJIL;

    public final long getCurrentTime() {
        Long l = this.LLJI;
        return l != null ? l.longValue() : this.LLIZLLLIL;
    }

    public final void setCurrentTime(long j) {
        int i = this.LLILZLL;
        if (i == 3 || i == 4) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            calendar.set(11, calendar.getActualMinimum(11));
            calendar.set(12, calendar.getActualMinimum(12));
            this.LLIZLLLIL = calendar.getTimeInMillis();
            calendar.set(11, calendar.getActualMaximum(11));
            calendar.set(12, calendar.getActualMaximum(12));
            this.LLJ = calendar.getTimeInMillis();
        }
        LIZLLL(-1, j);
    }

    public final void setGranularity(int i) {
        long jLongValue;
        this.LLIZ = i;
        Long l = this.LLJI;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = this.LLIZLLLIL;
        }
        LIZLLL(-1, jLongValue);
    }

    @Override // X.C12KZ
    public void setMaxAxisOffset(int i) {
        Iterator<C12KV> it2 = getColumnPickers$tux_theme_release().iterator();
        while (it2.hasNext()) {
            it2.next().setMaxAxisOffset$tux_theme_release(i);
        }
    }

    public final void setOnTimePickedListener(Function1<? super Long, Unit> function1) {
        this.LLJIJIL = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.1DYq] */
    public final void setPickerVariant(int i) {
        AbstractC2257761DYo c1dz1;
        this.LLILZLL = i;
        switch (i) {
            case 0:
                c1dz1 = new C1DZ1();
                break;
            case 1:
                c1dz1 = new C1DZ0() { // from class: X.1DZ3
                    @Override // X.C1DZ0
                    public final BDDateFormat LJIILJJIL() {
                        return new BDDateFormat("LL-Y");
                    }
                };
                break;
            case 2:
                c1dz1 = new AbstractC2257761DYo() { // from class: X.1DYw
                    public C12KV LIZJ;
                    public C12KV LIZLLL;
                    public String LJ;
                    public String LJFF;

                    @Override // X.AbstractC2257761DYo
                    public final void LIZ(C12KZ c12kz) {
                        String str = null;
                        TypedArray typedArrayObtainStyledAttributes = c12kz.getContext().obtainStyledAttributes(null, R$styleable.TuxWheelPicker, R.attr.z9, 0);
                        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_wheelPickerHourString);
                        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_wheelPickerMinuteString);
                        String strXd3 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_hourPickerContentDescription);
                        String str2 = "";
                        if (strXd3 == null) {
                            strXd3 = "";
                        }
                        this.LJ = strXd3;
                        String strXd4 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_minutePickerContentDescription);
                        if (strXd4 != null) {
                            str2 = strXd4;
                        }
                        this.LJFF = str2;
                        typedArrayObtainStyledAttributes.recycle();
                        C786410Ut5.LJJJJLL(c12kz);
                        c12kz.LIZIZ();
                        C12KV c12kvLIZ = c12kz.LIZ();
                        c12kz.LIZJ(strXd);
                        c12kz.LIZIZ();
                        C12KV c12kvLIZ2 = c12kz.LIZ();
                        c12kz.LIZJ(strXd2);
                        c12kz.LIZIZ();
                        this.LIZJ = c12kvLIZ;
                        this.LIZLLL = c12kvLIZ2;
                        String str3 = this.LJ;
                        if (str3 == null) {
                            str3 = null;
                        }
                        c12kvLIZ.setContentDescription(str3);
                        C12KV c12kv = this.LIZLLL;
                        if (c12kv == null) {
                            c12kv = null;
                        }
                        String str4 = this.LJFF;
                        if (str4 != null) {
                            str = str4;
                        }
                        c12kv.setContentDescription(str);
                    }

                    @Override // X.AbstractC2257761DYo
                    public final void LJIIJJI(C2257781DYq c2257781DYq) {
                        C12KV c12kv = this.LIZJ;
                        C12KV c12kv2 = null;
                        if (c12kv == null) {
                            c12kv = null;
                        }
                        c12kv.setLevel(0);
                        C12KV c12kv3 = this.LIZJ;
                        if (c12kv3 == null) {
                            c12kv3 = null;
                        }
                        c12kv3.setCallback(c2257781DYq);
                        C12KV c12kv4 = this.LIZLLL;
                        if (c12kv4 == null) {
                            c12kv4 = null;
                        }
                        c12kv4.setLevel(1);
                        C12KV c12kv5 = this.LIZLLL;
                        if (c12kv5 != null) {
                            c12kv2 = c12kv5;
                        }
                        c12kv2.setCallback(c2257781DYq);
                    }

                    @Override // X.AbstractC2257761DYo
                    public final long LJIILIIL(int i2, long j, Object obj) {
                        long j2 = C538540LAe.LLJJJIL;
                        long j3 = j / j2;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                long j4 = 60;
                                return (((j3 / j4) * j4) + ((Number) obj).longValue()) * j2;
                            }
                            return j;
                        }
                        return (((long) (((Number) obj).intValue() * 60)) + (j3 % ((long) 60))) * j2;
                    }

                    @Override // X.AbstractC2257761DYo
                    public final long LJII(int i2, long j, long j2, long j3) {
                        return AbstractC2257761DYo.LJI(C538540LAe.LLJJJIL, i2, j, j2, j3);
                    }

                    @Override // X.AbstractC2257761DYo
                    public final void LIZIZ(int i2, int i3, long j, long j2, long j3) {
                        long j4 = C538540LAe.LLJJJIL;
                        long j5 = j / j4;
                        long j6 = 60;
                        long j7 = j5 / j6;
                        long j8 = j5 % j6;
                        long j9 = j2 / j4;
                        long j10 = j9 / j6;
                        long j11 = j9 % j6;
                        long j12 = j3 / j4;
                        long j13 = j12 / j6;
                        long j14 = j12 % j6;
                        if (i2 < 0) {
                            C12KV c12kv = this.LIZJ;
                            if (c12kv == null) {
                                c12kv = null;
                            }
                            C354710DvR c354710DvR = new C354710DvR(j7, j10);
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c354710DvR, 10));
                            Iterator<Long> it2 = c354710DvR.iterator();
                            while (((C1932707hd) it2).LLILLL) {
                                long jNextLong = ((AbstractC1902407ck) it2).nextLong();
                                arrayList.add(new C12KY(Integer.valueOf((int) jNextLong), String.valueOf(jNextLong)));
                            }
                            c12kv.LIZLLL(arrayList, null);
                            C12KV c12kv2 = this.LIZJ;
                            if (c12kv2 == null) {
                                c12kv2 = null;
                            }
                            c12kv2.setCurrentFocusItem$tux_theme_release(Integer.valueOf((int) j13));
                        } else if (i2 >= 1) {
                            return;
                        }
                        if (j13 != j7) {
                            j8 = 0;
                        }
                        int i4 = (int) j8;
                        if (j13 != j10) {
                            j11 = 59;
                        }
                        Pair pairLJIIL = AbstractC2257761DYo.LJIIL(i3, i4, (int) j11, (int) j14);
                        C1846520y9S c1846520y9S = (C1846520y9S) pairLJIIL.getFirst();
                        int iIntValue = ((Number) pairLJIIL.getSecond()).intValue();
                        C12KV c12kv3 = this.LIZLLL;
                        if (c12kv3 == null) {
                            c12kv3 = null;
                        }
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(c1846520y9S, 10));
                        Iterator<Integer> it3 = c1846520y9S.iterator();
                        while (it3.hasNext()) {
                            int iNextInt = ((AbstractC2098408Jy) it3).nextInt();
                            arrayList2.add(new C12KY(Integer.valueOf(iNextInt), String.valueOf(iNextInt)));
                        }
                        C12KV c12kv4 = null;
                        c12kv3.LIZLLL(arrayList2, null);
                        C12KV c12kv5 = this.LIZLLL;
                        if (c12kv5 != null) {
                            c12kv4 = c12kv5;
                        }
                        c12kv4.setCurrentFocusItem$tux_theme_release(Integer.valueOf(iIntValue));
                    }
                };
                break;
            case 3:
                c1dz1 = new C2257861DYy();
                break;
            case 4:
                c1dz1 = new C2257871DYz();
                break;
            case 5:
                c1dz1 = new AbstractC2257761DYo() { // from class: X.1DYv
                    public C12KV LIZJ;

                    @Override // X.AbstractC2257761DYo
                    public final void LIZ(C12KZ c12kz) {
                        TypedArray typedArrayObtainStyledAttributes = c12kz.getContext().obtainStyledAttributes(null, R$styleable.TuxWheelPicker, R.attr.z9, 0);
                        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_minutePickerContentDescription);
                        if (strXd == null) {
                            strXd = "";
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        C786410Ut5.LJJJJLL(c12kz);
                        c12kz.LIZIZ();
                        C12KV c12kvLIZ = c12kz.LIZ();
                        c12kz.LIZIZ();
                        this.LIZJ = c12kvLIZ;
                        c12kvLIZ.setContentDescription(strXd);
                    }

                    @Override // X.AbstractC2257761DYo
                    public final void LJIIJJI(C2257781DYq c2257781DYq) {
                        C12KV c12kv = this.LIZJ;
                        C12KV c12kv2 = null;
                        if (c12kv == null) {
                            c12kv = null;
                        }
                        c12kv.setLevel(0);
                        C12KV c12kv3 = this.LIZJ;
                        if (c12kv3 != null) {
                            c12kv2 = c12kv3;
                        }
                        c12kv2.setCallback(c2257781DYq);
                    }

                    @Override // X.AbstractC2257761DYo
                    public final long LJIILIIL(int i2, long j, Object obj) {
                        return ((Number) obj).intValue() * C538540LAe.LLJJJIL;
                    }

                    @Override // X.AbstractC2257761DYo
                    public final long LJII(int i2, long j, long j2, long j3) {
                        return AbstractC2257761DYo.LJI(C538540LAe.LLJJJIL, i2, j, j2, j3);
                    }

                    @Override // X.AbstractC2257761DYo
                    public final void LIZIZ(int i2, int i3, long j, long j2, long j3) {
                        long j4 = C538540LAe.LLJJJIL;
                        long j5 = j / j4;
                        long j6 = j2 / j4;
                        long j7 = j3 / j4;
                        if (i2 < 0) {
                            Pair pairLJIIL = AbstractC2257761DYo.LJIIL(i3, (int) j5, (int) j6, (int) j7);
                            C1846520y9S c1846520y9S = (C1846520y9S) pairLJIIL.getFirst();
                            int iIntValue = ((Number) pairLJIIL.getSecond()).intValue();
                            C12KV c12kv = this.LIZJ;
                            C12KV c12kv2 = null;
                            if (c12kv == null) {
                                c12kv = null;
                            }
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c1846520y9S, 10));
                            Iterator<Integer> it2 = c1846520y9S.iterator();
                            while (it2.hasNext()) {
                                int iNextInt = ((AbstractC2098408Jy) it2).nextInt();
                                arrayList.add(new C12KY(Integer.valueOf(iNextInt), C2215091Bml.LIZ(iNextInt, EnumC21173917tZ.MINUTE)));
                            }
                            c12kv.LIZLLL(arrayList, null);
                            C12KV c12kv3 = this.LIZJ;
                            if (c12kv3 != null) {
                                c12kv2 = c12kv3;
                            }
                            c12kv2.setCurrentFocusItem$tux_theme_release(Integer.valueOf(iIntValue));
                        }
                    }
                };
                break;
            case 6:
                c1dz1 = new AbstractC2257761DYo() { // from class: X.1DYx
                    public C12KV LIZJ;
                    public C12KV LIZLLL;
                    public String LJ;
                    public String LJFF;

                    @Override // X.AbstractC2257761DYo
                    public final void LIZ(C12KZ c12kz) {
                        String str = null;
                        TypedArray typedArrayObtainStyledAttributes = c12kz.getContext().obtainStyledAttributes(null, R$styleable.TuxWheelPicker, R.attr.z9, 0);
                        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_wheelPickerMinuteString);
                        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_wheelPickerSecondString);
                        String strXd3 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_minutePickerContentDescription);
                        String str2 = "";
                        if (strXd3 == null) {
                            strXd3 = "";
                        }
                        this.LJ = strXd3;
                        String strXd4 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWheelPicker__tux_secondPickerContentDescription);
                        if (strXd4 != null) {
                            str2 = strXd4;
                        }
                        this.LJFF = str2;
                        typedArrayObtainStyledAttributes.recycle();
                        C786410Ut5.LJJJJLL(c12kz);
                        c12kz.LIZIZ();
                        C12KV c12kvLIZ = c12kz.LIZ();
                        c12kz.LIZJ(strXd);
                        c12kz.LIZIZ();
                        C12KV c12kvLIZ2 = c12kz.LIZ();
                        c12kz.LIZJ(strXd2);
                        c12kz.LIZIZ();
                        this.LIZJ = c12kvLIZ;
                        this.LIZLLL = c12kvLIZ2;
                        String str3 = this.LJ;
                        if (str3 == null) {
                            str3 = null;
                        }
                        c12kvLIZ.setContentDescription(str3);
                        C12KV c12kv = this.LIZLLL;
                        if (c12kv == null) {
                            c12kv = null;
                        }
                        String str4 = this.LJFF;
                        if (str4 != null) {
                            str = str4;
                        }
                        c12kv.setContentDescription(str);
                    }

                    @Override // X.AbstractC2257761DYo
                    public final void LJIIJJI(C2257781DYq c2257781DYq) {
                        C12KV c12kv = this.LIZJ;
                        C12KV c12kv2 = null;
                        if (c12kv == null) {
                            c12kv = null;
                        }
                        c12kv.setLevel(0);
                        C12KV c12kv3 = this.LIZJ;
                        if (c12kv3 == null) {
                            c12kv3 = null;
                        }
                        c12kv3.setCallback(c2257781DYq);
                        C12KV c12kv4 = this.LIZLLL;
                        if (c12kv4 == null) {
                            c12kv4 = null;
                        }
                        c12kv4.setLevel(1);
                        C12KV c12kv5 = this.LIZLLL;
                        if (c12kv5 != null) {
                            c12kv2 = c12kv5;
                        }
                        c12kv2.setCallback(c2257781DYq);
                    }

                    @Override // X.AbstractC2257761DYo
                    public final long LJIILIIL(int i2, long j, Object obj) {
                        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                        long j3 = j / j2;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                long j4 = 60;
                                return (((j3 / j4) * j4) + ((Number) obj).longValue()) * j2;
                            }
                            return j;
                        }
                        return (((long) (((Number) obj).intValue() * 60)) + (j3 % ((long) 60))) * j2;
                    }

                    @Override // X.AbstractC2257761DYo
                    public final long LJII(int i2, long j, long j2, long j3) {
                        return AbstractC2257761DYo.LJI(LSPassThroughRecordSizeConfig.DEFAULT, i2, j, j2, j3);
                    }

                    @Override // X.AbstractC2257761DYo
                    public final void LIZIZ(int i2, int i3, long j, long j2, long j3) {
                        long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
                        long j5 = j / j4;
                        long j6 = 60;
                        long j7 = j5 / j6;
                        long j8 = j5 % j6;
                        long j9 = j2 / j4;
                        long j10 = j9 / j6;
                        long j11 = j9 % j6;
                        long j12 = j3 / j4;
                        long j13 = j12 / j6;
                        long j14 = j12 % j6;
                        if (i2 < 0) {
                            C12KV c12kv = this.LIZJ;
                            if (c12kv == null) {
                                c12kv = null;
                            }
                            C354710DvR c354710DvR = new C354710DvR(j7, j10);
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c354710DvR, 10));
                            Iterator<Long> it2 = c354710DvR.iterator();
                            while (((C1932707hd) it2).LLILLL) {
                                long jNextLong = ((AbstractC1902407ck) it2).nextLong();
                                arrayList.add(new C12KY(Integer.valueOf((int) jNextLong), String.valueOf(jNextLong)));
                            }
                            c12kv.LIZLLL(arrayList, null);
                            C12KV c12kv2 = this.LIZJ;
                            if (c12kv2 == null) {
                                c12kv2 = null;
                            }
                            c12kv2.setCurrentFocusItem$tux_theme_release(Integer.valueOf((int) j13));
                        } else if (i2 >= 1) {
                            return;
                        }
                        if (j13 != j7) {
                            j8 = 0;
                        }
                        int i4 = (int) j8;
                        if (j13 != j10) {
                            j11 = 59;
                        }
                        Pair pairLJIIL = AbstractC2257761DYo.LJIIL(i3, i4, (int) j11, (int) j14);
                        C1846520y9S c1846520y9S = (C1846520y9S) pairLJIIL.getFirst();
                        int iIntValue = ((Number) pairLJIIL.getSecond()).intValue();
                        C12KV c12kv3 = this.LIZLLL;
                        if (c12kv3 == null) {
                            c12kv3 = null;
                        }
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(c1846520y9S, 10));
                        Iterator<Integer> it3 = c1846520y9S.iterator();
                        while (it3.hasNext()) {
                            int iNextInt = ((AbstractC2098408Jy) it3).nextInt();
                            arrayList2.add(new C12KY(Integer.valueOf(iNextInt), String.valueOf(iNextInt)));
                        }
                        C12KV c12kv4 = null;
                        c12kv3.LIZLLL(arrayList2, null);
                        C12KV c12kv5 = this.LIZLLL;
                        if (c12kv5 != null) {
                            c12kv4 = c12kv5;
                        }
                        c12kv4.setCurrentFocusItem$tux_theme_release(Integer.valueOf(iIntValue));
                    }
                };
                break;
            case 7:
                c1dz1 = new C1DZ0() { // from class: X.1DZ4
                    @Override // X.C1DZ0
                    public final BDDateFormat LJIILJJIL() {
                        return new BDDateFormat("MMM D (ddd)");
                    }
                };
                break;
            default:
                c1dz1 = new C1DZ1();
                break;
        }
        this.LLJILJIL = c1dz1;
        c1dz1.LIZ(this);
        setTouchDelegate(new C19737112Kb(this));
        AbstractC2257761DYo abstractC2257761DYo = this.LLJILJIL;
        AbstractC2257761DYo abstractC2257761DYo2 = abstractC2257761DYo;
        if (abstractC2257761DYo == null) {
            abstractC2257761DYo2 = 0;
        }
        abstractC2257761DYo2.LJIIJJI(new C12KW() { // from class: X.1DYq
            @Override // X.C12KW
            public final void LIZ(int i2, int i3, Object obj) {
                long jLongValue;
                C2257791DYr c2257791DYr = this.LIZ;
                Long l = c2257791DYr.LLJI;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = c2257791DYr.LLIZLLLIL;
                }
                AbstractC2257761DYo abstractC2257761DYo3 = c2257791DYr.LLJILJIL;
                AbstractC2257761DYo abstractC2257761DYo4 = null;
                if (abstractC2257761DYo3 == null) {
                    abstractC2257761DYo3 = null;
                }
                long jLJIILIIL = abstractC2257761DYo3.LJIILIIL(i2, jLongValue, obj);
                AbstractC2257761DYo abstractC2257761DYo5 = c2257791DYr.LLJILJIL;
                if (abstractC2257761DYo5 != null) {
                    abstractC2257761DYo4 = abstractC2257761DYo5;
                }
                abstractC2257761DYo4.LJIIIIZZ(jLJIILIIL);
                c2257791DYr.LIZLLL(i2, jLJIILIIL);
            }
        });
    }

    public C2257791DYr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.z9);
        this.LLIZLLLIL = Long.MIN_VALUE;
        this.LLJ = Long.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxWheelPicker, R.attr.z9, 0);
        this.LLILZLL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxWheelPicker_tux_pickerVariant, 0);
        this.LLIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxWheelPicker_tux_pickerGranularity, 0);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        setPickerVariant(this.LLILZLL);
    }

    public final void LIZLLL(int i, long j) {
        long j2 = this.LLIZLLLIL;
        if (j2 == Long.MIN_VALUE && this.LLJ == Long.MAX_VALUE) {
            return;
        }
        long j3 = this.LLJ;
        if (j > j3) {
            j = j3;
        }
        if (j >= j2) {
            j2 = j;
        }
        this.LLJI = Long.valueOf(j2);
        AbstractC2257761DYo abstractC2257761DYo = this.LLJILJIL;
        AbstractC2257761DYo abstractC2257761DYo2 = null;
        if (abstractC2257761DYo == null) {
            abstractC2257761DYo = null;
        }
        abstractC2257761DYo.LIZIZ(i, this.LLIZ, this.LLIZLLLIL, this.LLJ, j2);
        Long l = this.LLJI;
        if (l != null) {
            long jLongValue = l.longValue();
            int i2 = this.LLIZ;
            if (i2 != 0) {
                AbstractC2257761DYo abstractC2257761DYo3 = this.LLJILJIL;
                if (abstractC2257761DYo3 != null) {
                    abstractC2257761DYo2 = abstractC2257761DYo3;
                }
                this.LLJI = Long.valueOf(abstractC2257761DYo2.LJII(i2, this.LLIZLLLIL, this.LLJ, jLongValue));
            }
        }
        Long l2 = this.LLJI;
        if (l2 != null) {
            long jLongValue2 = l2.longValue();
            Function1<? super Long, Unit> function1 = this.LLJIJIL;
            if (function1 != null) {
                function1.invoke(Long.valueOf(jLongValue2));
            }
        }
    }

    public final void LJ(long j, long j2) {
        long jLongValue;
        int i = this.LLILZLL;
        if (i != 3 && i != 4) {
            this.LLIZLLLIL = j;
            this.LLJ = j2;
            if (j2 < j) {
                this.LLJ = j;
                this.LLIZLLLIL = j2;
            }
        }
        Long l = this.LLJI;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = this.LLIZLLLIL;
        }
        LIZLLL(-1, jLongValue);
    }
}
