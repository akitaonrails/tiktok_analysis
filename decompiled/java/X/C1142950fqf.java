package X;

import Y.ARunnableS0S0101202_17;
import Y.ARunnableS6S0102000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchEnigmaAnimationTimingSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchScoreTrackSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0fqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142950fqf extends View {
    public static final /* synthetic */ int LLJJJIL = 0;
    public final C01GW LL;
    public InterfaceC1685420txc<? super Float, ? super Float, ? super Integer, ? super Long, ? super Long, Unit> LLILLJJLI;
    public Function2<? super Integer, ? super float[], Unit> LLILLL;
    public Function2<? super C976480bWA, ? super C976480bWA, Unit> LLILZ;
    public Function1<? super Boolean, Float> LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public ValueAnimator LLJIJIL;
    public float LLJILJIL;
    public final float[] LLJILJILJ;
    public final float[] LLJILLL;
    public boolean LLJJ;
    public final List<Integer> LLJJI;
    public final List<Integer> LLJJIII;
    public final float[] LLJJIJI;
    public final List<RectF> LLJJIJIIJIL;
    public float LLJJIJIL;
    public Path LLJJJ;

    private final Paint getPaint() {
        return (Paint) this.LL.getValue();
    }

    public static int LJII() {
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        int i = 0;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        int iIntValue = -1;
        if (interfaceC973730bRjYf2 == null || (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) == null || (value = mutableLiveDataLJJJJIZL.getValue()) == null) {
            return -1;
        }
        boolean zNt = C915980Zwa.LJFF().Nt();
        Iterator<C976480bWA> it2 = value.iterator();
        int i2 = -1;
        while (true) {
            Object next = null;
            if (!it2.hasNext()) {
                if (i2 >= 0 || zNt || !SettingsManager.INSTANCE.getBooleanValue("live_match_victory_lap_leader_fallback_enable", true)) {
                    return i2;
                }
                C531650Kt9 it3 = C1697810uHb.LJIIIZ(value).iterator();
                if (it3.LLILLL) {
                    next = it3.next();
                    if (it3.LLILLL) {
                        long j = ((C976480bWA) ListProtector.get(value, ((Number) next).intValue())).LIZIZ;
                        do {
                            Object next2 = it3.next();
                            long j2 = ((C976480bWA) ListProtector.get(value, ((Number) next2).intValue())).LIZIZ;
                            if (j < j2) {
                                next = next2;
                                j = j2;
                            }
                        } while (it3.LLILLL);
                    }
                }
                Integer num = (Integer) next;
                if (num != null && (iIntValue = num.intValue()) >= 0) {
                    C976480bWA c976480bWA = (C976480bWA) ListProtector.get(value, iIntValue);
                    c976480bWA.LIZLLL = 1L;
                    c976480bWA.LJ = 1L;
                    C20441214yg.LIZIZ("LiveMatchIndividualProgressBar", "resolveFirstRankIndex fallback by score, index = " + iIntValue + ", teamId = " + c976480bWA.LIZ + ", score = " + c976480bWA.LIZIZ);
                }
                return iIntValue;
            }
            C976480bWA next3 = it2.next();
            int i3 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            C976480bWA c976480bWA2 = next3;
            if (zNt) {
                if (c976480bWA2.LJ == 1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("user list by order first rank index = ");
                    sbLIZ.append(c976480bWA2.LIZ);
                    C20441214yg.LIZIZ("LiveMatchIndividualProgressBar", C2188811AlT.LIZIZ(sbLIZ));
                    i2 = i;
                }
            } else if (c976480bWA2.LIZLLL == 1) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("user list by order first rank index = ");
                sbLIZ2.append(c976480bWA2.LIZ);
                C20441214yg.LIZIZ("LiveMatchIndividualProgressBar", C2188811AlT.LIZIZ(sbLIZ2));
                i2 = i;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Team ID = ");
            sbLIZ3.append(c976480bWA2.LIZ);
            sbLIZ3.append(", True Rank = ");
            sbLIZ3.append(c976480bWA2.LIZLLL);
            sbLIZ3.append(", visible rank = ");
            sbLIZ3.append(c976480bWA2.LJ);
            C20441214yg.LIZIZ("LiveMatchIndividualProgressBar", C2188811AlT.LIZIZ(sbLIZ3));
            i = i3;
        }
    }

    public final void LJIIIZ() {
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        int size;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 == null || (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) == null || (value = mutableLiveDataLJJJJIZL.getValue()) == null || (size = value.size()) < 2 || size > 4) {
            return;
        }
        int i = this.LLIZLLLIL;
        if (1 > i || i >= size) {
            this.LLIZLLLIL = size;
            int iLJII = LJII();
            this.LLJ = iLJII;
            if (C915980Zwa.LJFF().co0()) {
                try {
                    LIZJ(iLJII, this.LLIZLLLIL);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateProgressForReveal: error = ");
                    sbLIZ.append(e);
                    C20441214yg.LJIIIZ("LiveMatchIndividualProgressBar", C2188811AlT.LIZIZ(sbLIZ));
                }
                LJIIIIZZ(1160L, C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
            }
        }
    }

    public final float getAnimationProgress() {
        return this.LLJILJIL;
    }

    public final float[] getDividerPosition() {
        return this.LLJJIJI;
    }

    public final int getValidTeamSize() {
        return this.LLIZLLLIL;
    }

    public static boolean LIZLLL(int i) {
        if (i >= 0 && i <= 3) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ERROR index, ");
        sbLIZ.append(i);
        C20441214yg.LJ("LiveMatchIndividualProgressBar", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public final float LJ(int i) {
        if (!LIZLLL(i)) {
            return 0.0f;
        }
        return this.LLJJIJI[(i * 2) + 1];
    }

    public final float LJFF(int i) {
        Boolean boolValueOf;
        int iLIZIZ;
        float fFloatValue;
        if (C970370bMJ.LJ()) {
            return this.LLJJIJIL * 0.1f;
        }
        InterfaceC975810bV5 interfaceC975810bV5LIZLLL = C915980Zwa.LJI().LIZLLL();
        if (interfaceC975810bV5LIZLLL != null) {
            boolValueOf = Boolean.valueOf(interfaceC975810bV5LIZLLL.LJ());
        } else {
            boolValueOf = null;
        }
        boolean z = true;
        if (C500260Jjc.LJJJI(boolValueOf) && C970370bMJ.LJIIJ()) {
            iLIZIZ = (int) C497740JfY.LIZIZ(22.0f);
        } else {
            iLIZIZ = 0;
        }
        float f = this.LLJJIJIL * 0.1f;
        Function1<? super Boolean, Float> function1 = this.LLILZIL;
        if (function1 != null) {
            if (i != 0) {
                z = false;
            }
            fFloatValue = function1.invoke(Boolean.valueOf(z)).floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        return Math.max(f, fFloatValue) + iLIZIZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        float f;
        float height;
        LinearGradient linearGradient;
        int iIntValue;
        int iIntValue2;
        super.onDraw(canvas);
        int i = this.LLIZLLLIL;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (this.LLIZLLLIL - 1) - i2;
            if (this.LLIZ && !this.LLILZLL) {
                z = true;
            } else {
                z = false;
            }
            RectF rectF = (RectF) ListProtector.get(this.LLJJIJIIJIL, i3);
            if (!LIZLLL(i3)) {
                f = 0.0f;
            } else {
                f = this.LLJJIJI[i3 * 2];
            }
            if (i3 == 1 && z) {
                height = getHeight();
            } else {
                height = 0.0f;
            }
            rectF.set(f - height, 0.0f, LJ(i3), getHeight());
            if (this.LLILZLL) {
                linearGradient = new LinearGradient(((RectF) ListProtector.get(this.LLJJIJIIJIL, i3)).left, ((RectF) ListProtector.get(this.LLJJIJIIJIL, i3)).top, ((RectF) ListProtector.get(this.LLJJIJIIJIL, i3)).right, ((RectF) ListProtector.get(this.LLJJIJIIJIL, i3)).bottom, ((Number) ListProtector.get(this.LLJJIII, i3)).intValue(), ((Number) ListProtector.get(this.LLJJIII, i3 + 1)).intValue(), Shader.TileMode.CLAMP);
            } else {
                float f2 = ((RectF) ListProtector.get(this.LLJJIJIIJIL, i3)).left;
                float f3 = ((RectF) ListProtector.get(this.LLJJIJIIJIL, i3)).top;
                float f4 = ((RectF) ListProtector.get(this.LLJJIJIIJIL, i3)).right;
                float f5 = ((RectF) ListProtector.get(this.LLJJIJIIJIL, i3)).bottom;
                if (!LIZLLL(i3)) {
                    iIntValue = 0;
                } else {
                    iIntValue = ((Number) ListProtector.get(this.LLJJI, i3 * 2)).intValue();
                }
                if (!LIZLLL(i3)) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = ((Number) ListProtector.get(this.LLJJI, (i3 * 2) + 1)).intValue();
                }
                linearGradient = new LinearGradient(f2, f3, f4, f5, iIntValue, iIntValue2, Shader.TileMode.CLAMP);
            }
            getPaint().setShader(linearGradient);
            if (i3 == 0 && z) {
                Path pathLIZ = C0GW9.LIZ(this.LLJJJ, LJ(i3), getHeight(), 25.0f, 25.0f);
                this.LLJJJ = pathLIZ;
                canvas.drawPath(pathLIZ, getPaint());
            } else {
                canvas.drawRect((RectF) ListProtector.get(this.LLJJIJIIJIL, i3), getPaint());
            }
        }
    }

    public final void setCanPlayRevealAnimation(boolean z) {
        this.LLJI = z;
    }

    public final void setDividerPositionUpdateCallback(Function2<? super Integer, ? super float[], Unit> function2) {
        this.LLILLL = function2;
    }

    public final void setFirstRankPositionUpdateCallback(InterfaceC1685420txc<? super Float, ? super Float, ? super Integer, ? super Long, ? super Long, Unit> interfaceC1685420txc) {
        this.LLILLJJLI = interfaceC1685420txc;
    }

    public final void setGetScoreTextMeasuredWidthCallback(Function1<? super Boolean, Float> function1) {
        this.LLILZIL = function1;
    }

    public final void setIsBoosting(boolean z) {
        this.LLIZ = z;
        if (!z) {
            this.LLJJJ = null;
        }
        invalidate();
    }

    public final void setRivalSmoke(boolean z) {
        int i;
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        this.LLILZLL = z;
        if (z) {
            i = -1;
        } else {
            i = this.LLJ;
        }
        int size = 0;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) != null && (value = mutableLiveDataLJJJJIZL.getValue()) != null) {
            size = value.size();
        }
        if (C915980Zwa.LJFF().Nt()) {
            LIZIZ(i, size);
        }
    }

    public final void setTeamMatchScoreUpdateCallback(Function2<? super C976480bWA, ? super C976480bWA, Unit> function2) {
        this.LLILZ = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142950fqf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = 0;
        this.LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(422));
        this.LLJ = -1;
        this.LLJI = true;
        this.LLJILJILJ = new float[8];
        this.LLJILLL = new float[8];
        this.LLJJI = C1697810uHb.LJIILJJIL(Integer.valueOf(C497740JfY.LIZLLL(R.attr.esz, getContext())), Integer.valueOf(C497740JfY.LIZLLL(R.attr.esy, getContext())), Integer.valueOf(C497740JfY.LIZLLL(R.attr.et3, getContext())), Integer.valueOf(C497740JfY.LIZLLL(R.attr.et4, getContext())), Integer.valueOf(C497740JfY.LIZLLL(R.attr.et7, getContext())), Integer.valueOf(C497740JfY.LIZLLL(R.attr.et6, getContext())), Integer.valueOf(C497740JfY.LIZLLL(R.attr.et1, getContext())), Integer.valueOf(C497740JfY.LIZLLL(R.attr.et0, getContext())));
        this.LLJJIII = C1697810uHb.LJIILJJIL(Integer.valueOf(C497740JfY.LIZLLL(R.attr.esz, getContext())), Integer.valueOf(C497740JfY.LIZLLL(R.attr.esx, getContext())), Integer.valueOf(C497740JfY.LIZLLL(R.attr.et2, getContext())), Integer.valueOf(C497740JfY.LIZLLL(R.attr.et5, getContext())), Integer.valueOf(C497740JfY.LIZLLL(R.attr.et0, getContext())));
        this.LLJJIJI = new float[8];
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJIJIL = C465640INu.LIZIZ(context);
        new Path();
        do {
            ListProtector.add(this.LLJJIJIIJIL, i, new RectF());
            i++;
        } while (i < 4);
    }

    public final void LIZ(int i, int i2) {
        if (!C915980Zwa.LJFF().co0()) {
            return;
        }
        this.LLJ = i;
        if (this.LLJI) {
            HandlerHook.viewPostDelay(this, new ARunnableS6S0102000_17(this, i, i2, 1), LiveMatchEnigmaAnimationTimingSettings.INSTANCE.getScoreGrowAnimationDelay());
        } else {
            LIZIZ(i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1142950fqf.LIZIZ(int, int):void");
    }

    public final void LIZJ(final int i, int i2) {
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        boolean z;
        Long lValueOf;
        boolean z2;
        long j;
        int size;
        long j2;
        long switchFirstRankProgressBarUpdateDelay;
        float fMax;
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL2;
        List<C976480bWA> value2;
        Function2<? super C976480bWA, ? super C976480bWA, Unit> function2;
        long j3;
        long j4;
        if (i2 > 4) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("calculatePositionInternal ERROR!, validTeamSize = ");
            sbLIZ.append(i2);
            C20441214yg.LJ("LiveMatchIndividualProgressBar", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) != null && (value = mutableLiveDataLJJJJIZL.getValue()) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("calculatePositionInternal: firstRankIndex = ");
            sbLIZ2.append(i);
            sbLIZ2.append(", validTeamSize = ");
            sbLIZ2.append(i2);
            sbLIZ2.append(", matchTeamSize = ");
            sbLIZ2.append(value.size());
            C20441214yg.LIZIZ("LiveMatchIndividualProgressBar", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLIZLLLIL = i2;
            User.EnigmaInfo enigmaInfo = UserService.getInstance().user().LJIJJLI().enigmaInfo;
            if (enigmaInfo != null && enigmaInfo.isEnigmaMaskOn) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf22 != null) {
                lValueOf = Long.valueOf(interfaceC973730bRjYf22.LJJJJJ());
            } else {
                lValueOf = null;
            }
            if (C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.PUNISH_START) < 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Iterator<C976480bWA> it2 = value.iterator();
            long jLJI = 0;
            while (it2.hasNext()) {
                jLJI += LJI(it2.next(), z, lValueOf, z2);
            }
            if (LiveMatchScoreTrackSetting.INSTANCE.enableTrack()) {
                C975410bUR c975410bUR = C975400bUQ.LIZ;
                synchronized (c975410bUR) {
                    if (c975410bUR.LJIIJJI) {
                        c975410bUR.LIZLLL.clear();
                        for (int i3 = 0; i3 < i2; i3++) {
                            C976480bWA c976480bWA = (C976480bWA) C13LP.LJJJLZIJ(i3, value);
                            if (c976480bWA != null) {
                                j3 = c976480bWA.LIZ;
                            } else {
                                j3 = 0;
                            }
                            C976480bWA c976480bWA2 = (C976480bWA) C13LP.LJJJLZIJ(i3, value);
                            if (c976480bWA2 != null) {
                                j4 = c976480bWA2.LIZIZ;
                            } else {
                                j4 = 0;
                            }
                            c975410bUR.LIZLLL.put(Long.valueOf(j3), Long.valueOf(j4));
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("updateUIScoreBarScore: validTeamSize ");
                            sbLIZ3.append(i2);
                            sbLIZ3.append(", firstRankIndex ");
                            sbLIZ3.append(i);
                            sbLIZ3.append(", i ");
                            sbLIZ3.append(i3);
                            sbLIZ3.append(",  teamId ");
                            sbLIZ3.append(j3);
                            sbLIZ3.append(", teamScore ");
                            sbLIZ3.append(j4);
                            C20441214yg.LJIIIZ("MatchScoreAccuracyHelper", C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        c975410bUR.LJI = new LinkedHashMap<>(C975410bUR.LJIIIIZZ());
                    }
                }
            }
            if (i2 == 2) {
                Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, value);
                Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, value);
                if (objLJJJLZIJ != null && objLJJJLZIJ2 != null && (function2 = this.LLILZ) != null) {
                    function2.invoke(objLJJJLZIJ, objLJJJLZIJ2);
                }
            }
            EnumC964170bCJ enumC964170bCJRY = C915980Zwa.LJFF().RY(false);
            if (jLJI != 0 && ((i >= 0 || enumC964170bCJRY == EnumC964170bCJ.PUNISH_START || !C970370bMJ.LJ()) && !this.LLILZLL)) {
                float[] fArr = new float[i2];
                boolean zLh1 = C915980Zwa.LJFF().lh1();
                InterfaceC973730bRj interfaceC973730bRjYf23 = C915980Zwa.LJFF().yf2(false);
                if (interfaceC973730bRjYf23 != null && (mutableLiveDataLJJJJIZL2 = interfaceC973730bRjYf23.LJJJJIZL()) != null && (value2 = mutableLiveDataLJJJJIZL2.getValue()) != null) {
                    size = value2.size();
                } else {
                    size = 0;
                }
                int iMin = Math.min(i2, size);
                long j5 = jLJI;
                for (int i4 = 0; i4 < iMin; i4++) {
                    long jLJI2 = LJI((C976480bWA) ListProtector.get(value, i4), z, lValueOf, z2);
                    if (jLJI2 <= jLJI * 0.2f) {
                        fArr[i4] = LJFF(i4);
                        j5 -= jLJI2;
                    }
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("total score = ");
                sbLIZ4.append(jLJI);
                sbLIZ4.append(" size = ");
                sbLIZ4.append(i2);
                sbLIZ4.append(" remained score = ");
                sbLIZ4.append(j5);
                sbLIZ4.append(" \n width array = ");
                sbLIZ4.append(C13LQ.LJJIJLIJ(fArr, ",", null, 62));
                C20441214yg.LIZIZ("LiveMatchIndividualProgressBar", C2188811AlT.LIZIZ(sbLIZ4));
                float f = this.LLJJIJIL;
                float f2 = 0.0f;
                for (int i5 = 0; i5 < i2; i5++) {
                    f2 += fArr[i5];
                }
                float f3 = f - f2;
                int i6 = 0;
                int i7 = 0;
                float f4 = 0.0f;
                while (i6 < i2) {
                    float f5 = fArr[i6];
                    int i8 = i7 + 1;
                    int i9 = i2 - 1;
                    if (i7 == i9) {
                        float f6 = this.LLJJIJIL;
                        float f7 = 0.0f;
                        for (int i10 = 0; i10 < i2; i10++) {
                            f7 += fArr[i10];
                        }
                        fArr[i7] = f6 - f7;
                    } else if (f5 < 0.01f && j5 > 0 && i7 < value.size()) {
                        fArr[i7] = (LJI((C976480bWA) ListProtector.get(value, i7), z, lValueOf, z2) * ((long) f3)) / j5;
                    }
                    if (i7 == i9) {
                        float f8 = this.LLJJIJIL;
                        float f9 = 0.0f;
                        for (int i11 = 0; i11 < i2; i11++) {
                            f9 += fArr[i11];
                        }
                        fArr[i7] = (f8 - f9) + fArr[i7];
                    }
                    float[] fArr2 = this.LLJILLL;
                    int i12 = i7 * 2;
                    fArr2[i12] = f4;
                    f4 += fArr[i7];
                    fArr2[i12 + 1] = f4;
                    i6++;
                    i7 = i8;
                }
                if (zLh1 && !C970370bMJ.LJ()) {
                    float[] fArr3 = new float[i2];
                    for (int i13 = 0; i13 < i2; i13++) {
                        fArr3[i13] = LJFF(i13);
                    }
                    float f10 = 0.0f;
                    for (int i14 = 0; i14 < i2; i14++) {
                        f10 += fArr3[i14];
                    }
                    float f11 = this.LLJJIJIL;
                    if (f10 >= f11) {
                        float f12 = 0.0f;
                        if (f10 > 0.0f) {
                            f12 = f11 / f10;
                        }
                        for (int i15 = 0; i15 < i2; i15++) {
                            fArr[i15] = fArr3[i15] * f12;
                        }
                    } else {
                        float[] fArrCopyOf = Arrays.copyOf(fArr, i2);
                        boolean[] zArr = new boolean[i2];
                        float f13 = 0.0f;
                        boolean z3 = false;
                        for (int i16 = 0; i16 < i2; i16++) {
                            float f14 = fArrCopyOf[i16];
                            float f15 = fArr3[i16];
                            if (f14 < f15) {
                                fArr[i16] = f15;
                                f11 -= fArr3[i16];
                                z3 = true;
                                zArr[i16] = true;
                            } else {
                                f13 += f14;
                            }
                        }
                        if (z3) {
                            for (int i17 = 0; i17 < i2; i17++) {
                                if (!zArr[i17]) {
                                    if (f13 > 0.0f) {
                                        fMax = (fArrCopyOf[i17] / f13) * f11;
                                    } else {
                                        int i18 = 0;
                                        for (int i19 = 0; i19 < i2; i19++) {
                                            if (zArr[i19]) {
                                                i18++;
                                            }
                                        }
                                        fMax = f11 / Math.max(1, i2 - i18);
                                    }
                                    fArr[i17] = fMax;
                                }
                            }
                        }
                    }
                    float f16 = 0.0f;
                    for (int i20 = 0; i20 < i2; i20++) {
                        float[] fArr4 = this.LLJILLL;
                        int i21 = i20 * 2;
                        fArr4[i21] = f16;
                        f16 += fArr[i20];
                        fArr4[i21 + 1] = f16;
                    }
                }
                C20441214yg.LIZIZ("LiveMatchIndividualProgressBar", "divider list " + C13LQ.LJJIJLIJ(this.LLJILLL, ",", null, 62));
                C20441214yg.LIZIZ("LiveMatchIndividualProgressBar", "firstRankIndex = " + i);
                if (i >= 0) {
                    if (i >= value.size()) {
                        return;
                    }
                    long jLJI3 = LJI((C976480bWA) ListProtector.get(value, i), z, lValueOf, z2);
                    C976480bWA c976480bWA3 = (C976480bWA) C13LP.LJJJLZIJ(i, value);
                    if (c976480bWA3 != null) {
                        j2 = c976480bWA3.LIZJ;
                    } else {
                        j2 = 0;
                    }
                    float[] fArr5 = this.LLJILLL;
                    int i22 = i * 2;
                    float f18 = fArr5[i22];
                    float f19 = fArr5[i22 + 1];
                    if (jLJI3 > 0) {
                        ARunnableS0S0101202_17 aRunnableS0S0101202_17 = new ARunnableS0S0101202_17(this, f18, f19, i, jLJI3, j2, 1);
                        if (C970370bMJ.LJ() && !C915980Zwa.LJFF().Nt()) {
                            switchFirstRankProgressBarUpdateDelay = LiveMatchEnigmaAnimationTimingSettings.INSTANCE.getSwitchFirstRankProgressBarUpdateDelay();
                        } else {
                            switchFirstRankProgressBarUpdateDelay = 0;
                        }
                        HandlerHook.viewPostDelay(this, aRunnableS0S0101202_17, switchFirstRankProgressBarUpdateDelay);
                        return;
                    }
                    InterfaceC1685420txc<? super Float, ? super Float, ? super Integer, ? super Long, ? super Long, Unit> interfaceC1685420txc = this.LLILLJJLI;
                    if (interfaceC1685420txc == null) {
                        return;
                    }
                    interfaceC1685420txc.invoke(Float.valueOf(-1.0f), Float.valueOf(-1.0f), -1, 0L, Long.valueOf(j2));
                    return;
                }
                InterfaceC1685420txc<? super Float, ? super Float, ? super Integer, ? super Long, ? super Long, Unit> interfaceC1685420txc2 = this.LLILLJJLI;
                if (interfaceC1685420txc2 != null) {
                    interfaceC1685420txc2.invoke(Float.valueOf(-1.0f), Float.valueOf(-1.0f), -1, 0L, 0L);
                    return;
                }
                return;
            }
            float f20 = this.LLJJIJIL / i2;
            for (int i23 = 0; i23 < i2; i23++) {
                int i24 = i23 * 2;
                int i25 = i24 + 1;
                float[] fArr6 = this.LLJILLL;
                if (i25 < fArr6.length) {
                    float f21 = i23 * f20;
                    fArr6[i24] = f21;
                    fArr6[i25] = f21 + f20;
                }
            }
            if (i < i2 && i >= 0 && i < value.size()) {
                final long jLJI4 = LJI((C976480bWA) ListProtector.get(value, i), z, lValueOf, z2);
                C976480bWA c976480bWA4 = (C976480bWA) C13LP.LJJJLZIJ(i, value);
                if (c976480bWA4 != null) {
                    j = c976480bWA4.LIZJ;
                } else {
                    j = 0;
                }
                if (C970370bMJ.LJ() && !C915980Zwa.LJFF().Nt()) {
                    final long j6 = j;
                    HandlerHook.viewPostDelay(this, new Runnable() { // from class: X.0eJL
                        public final void LIZ() {
                            C1142950fqf c1142950fqf = this.LL;
                            InterfaceC1685420txc<? super Float, ? super Float, ? super Integer, ? super Long, ? super Long, Unit> interfaceC1685420txc3 = c1142950fqf.LLILLJJLI;
                            if (interfaceC1685420txc3 != null) {
                                interfaceC1685420txc3.invoke(Float.valueOf(c1142950fqf.LLJILLL[i * 2]), Float.valueOf(this.LL.LLJILLL[(i * 2) + 1]), Integer.valueOf(i), Long.valueOf(jLJI4), Long.valueOf(j6));
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LiveMatchProgressBar@da79.calculatePositionInternal$2");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LiveMatchProgressBar@da79.calculatePositionInternal$2");
                        }
                    }, LiveMatchEnigmaAnimationTimingSettings.INSTANCE.getSwitchFirstRankProgressBarUpdateDelay());
                } else {
                    InterfaceC1685420txc<? super Float, ? super Float, ? super Integer, ? super Long, ? super Long, Unit> interfaceC1685420txc3 = this.LLILLJJLI;
                    if (interfaceC1685420txc3 != null) {
                        int i26 = i * 2;
                        interfaceC1685420txc3.invoke(Float.valueOf(this.LLJILLL[i26]), Float.valueOf(this.LLJILLL[i26 + 1]), Integer.valueOf(i), Long.valueOf(jLJI4), Long.valueOf(j));
                    }
                }
            } else {
                InterfaceC1685420txc<? super Float, ? super Float, ? super Integer, ? super Long, ? super Long, Unit> interfaceC1685420txc4 = this.LLILLJJLI;
                if (interfaceC1685420txc4 != null) {
                    interfaceC1685420txc4.invoke(Float.valueOf(-1.0f), Float.valueOf(-1.0f), -1, 0L, 0L);
                }
            }
            C20441214yg.LIZIZ("LiveMatchIndividualProgressBar", "total score = " + jLJI + " size = " + i2 + "\n validTeamSize = " + i2 + "\n targetDividerPositions = " + C13LQ.LJJIJLIJ(this.LLJILLL, ",", null, 62));
        }
    }

    public final void LJIIIIZZ(long j, Interpolator interpolator) {
        ValueAnimator valueAnimator = this.LLJIJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float[] fArr = this.LLJJIJI;
        System.arraycopy(fArr, 0, this.LLJILJILJ, 0, fArr.length);
        this.LLJILJIL = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j);
        if (interpolator == null) {
            interpolator = C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f);
        }
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 7));
        valueAnimatorOfFloat.start();
        this.LLJIJIL = valueAnimatorOfFloat;
    }

    public static long LJI(C976480bWA c976480bWA, boolean z, Long l, boolean z2) {
        long j;
        if (C915980Zwa.LJFF().lh1()) {
            return c976480bWA.LIZIZ;
        }
        long j2 = 0;
        if (z) {
            long j3 = c976480bWA.LIZ;
            if (l != null && j3 == l.longValue()) {
                return c976480bWA.LIZIZ;
            }
            j = c976480bWA.LIZIZ;
            if (z2) {
                j2 = c976480bWA.LIZJ;
            }
        } else {
            j = c976480bWA.LIZIZ;
            if (z2) {
                j2 = c976480bWA.LIZJ;
            }
        }
        return j - j2;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        super.onLayout(z, i, i2, i3, i4);
        if (getWidth() != 0) {
            this.LLJJIJIL = getWidth();
            int size = 0;
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null && (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) != null && (value = mutableLiveDataLJJJJIZL.getValue()) != null) {
                size = value.size();
            }
            this.LLIZLLLIL = size;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayout, validTeamSize = ");
            sbLIZ.append(this.LLIZLLLIL);
            sbLIZ.append(", calculatePosition");
            C20441214yg.LIZIZ("LiveMatchIndividualProgressBar", C2188811AlT.LIZIZ(sbLIZ));
            LIZ(this.LLJ, this.LLIZLLLIL);
            invalidate();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onLayout, change = ");
        sbLIZ2.append(z);
        sbLIZ2.append(" screenWidth = ");
        sbLIZ2.append(this.LLJJIJIL);
        sbLIZ2.append(" ,left = ");
        sbLIZ2.append(i);
        sbLIZ2.append(", top = ");
        sbLIZ2.append(i2);
        sbLIZ2.append(", right = ");
        sbLIZ2.append(i3);
        sbLIZ2.append(", bottom = ");
        sbLIZ2.append(i4);
        C20441214yg.LJ("LiveMatchIndividualProgressBar", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
