package X;

import Y.ARunnableS98S0200000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinVoiceRecordAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.08oC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinVoiceRecordAssem$observeViewModel$5", f = "BulletinVoiceRecordAssem.kt", l = {577}, m = "invokeSuspend")
public final class C2228208oC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinVoiceRecordAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2228208oC(BulletinVoiceRecordAssem bulletinVoiceRecordAssem, InterfaceC1364105Vn<? super C2228208oC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinVoiceRecordAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2228208oC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinVoiceRecordAssem@4687.observeViewModel$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDq = this.LLILLJJLI.tp().LLILZLL;
            final BulletinVoiceRecordAssem bulletinVoiceRecordAssem = this.LLILLJJLI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.115e
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    boolean z;
                    boolean z2;
                    int iIntValue;
                    int iIntValue2;
                    boolean z3;
                    Pair pair;
                    C443120HZe c443120HZe;
                    boolean z4;
                    List listLLIIII;
                    boolean z5;
                    Pair pair2;
                    C443120HZe c443120HZe2;
                    EnumC620000OTm enumC620000OTm;
                    EnumC194439115h enumC194439115h = (EnumC194439115h) obj2;
                    BulletinVoiceRecordAssem bulletinVoiceRecordAssem2 = bulletinVoiceRecordAssem;
                    EnumC194439115h enumC194439115h2 = bulletinVoiceRecordAssem2.LLLILZ;
                    EnumC194439115h enumC194439115h3 = EnumC194439115h.RECORDING;
                    int i2 = 1;
                    if (enumC194439115h != enumC194439115h3 && enumC194439115h != EnumC194439115h.PAUSED && enumC194439115h != EnumC194439115h.PREVIEW) {
                        z = false;
                    } else {
                        z = true;
                        C0OWM c0owm = bulletinVoiceRecordAssem2.op().getState().LLILLJJLI;
                        C0OWM c0owm2 = C0OWM.HIDE;
                        if (c0owm != c0owm2) {
                            bulletinVoiceRecordAssem2.op().setState(new AwS588S0100000_9(c0owm2, 536));
                        }
                    }
                    String string = null;
                    float f = 1.0f;
                    switch (C194440115i.LIZIZ[enumC194439115h.ordinal()]) {
                        case 1:
                        case 2:
                            TextView textView = bulletinVoiceRecordAssem2.LLJJLIIIJLLLLLLLZ;
                            if (textView != null) {
                                C0DTR.LIZIZ(textView);
                            }
                            bulletinVoiceRecordAssem2.lp();
                            C194442115k c194442115k = bulletinVoiceRecordAssem2.LLJL;
                            if (c194442115k != null) {
                                c194442115k.LIZIZ();
                            }
                            TextView textView2 = bulletinVoiceRecordAssem2.LLLILZJ;
                            if (textView2 != null) {
                                C0DTR.LIZIZ(textView2);
                            }
                            bulletinVoiceRecordAssem2.LLLIL = false;
                            bulletinVoiceRecordAssem2.tp().LLJIJIL.LJ = null;
                            C194434115c c194434115c = bulletinVoiceRecordAssem2.LLJLL;
                            if (c194434115c != null) {
                                c194434115c.LJIIIZ();
                                ValueAnimator valueAnimator = c194434115c.LLIZ;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                c194434115c.LLIZ = null;
                            }
                            break;
                        case 3:
                            TextView textView3 = bulletinVoiceRecordAssem2.LLJJLIIIJLLLLLLLZ;
                            if (textView3 != null) {
                                C0DTR.LIZIZ(textView3);
                            }
                            if (enumC194439115h2 != EnumC194439115h.PAUSED && enumC194439115h2 != EnumC194439115h.PREVIEW) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            C2226908nz c2226908nz = bulletinVoiceRecordAssem2.tp().LLJIJIL;
                            synchronized (c2226908nz.LIZ) {
                                try {
                                    listLLIIII = C13LP.LLIIII(c2226908nz.LIZ);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            if (z4) {
                                C194434115c c194434115c2 = bulletinVoiceRecordAssem2.LLJLL;
                                if (c194434115c2 != null) {
                                    int size = listLLIIII.size();
                                    if (size >= c194434115c2.LJFF()) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    Float fValueOf = Float.valueOf(1.0f);
                                    if (z5) {
                                        pair2 = new Pair(fValueOf, fValueOf);
                                    } else {
                                        pair2 = new Pair(fValueOf, Float.valueOf(0.5f));
                                    }
                                    float fFloatValue = ((Number) pair2.getFirst()).floatValue();
                                    float fFloatValue2 = ((Number) pair2.getSecond()).floatValue();
                                    Float fValueOf2 = Float.valueOf(1.0f);
                                    if (z5) {
                                        c443120HZe2 = new C443120HZe(Float.valueOf(0.8f), fValueOf2, Boolean.TRUE);
                                    } else {
                                        int width = (c194434115c2.getWidth() - c194434115c2.getPaddingStart()) - c194434115c2.getPaddingEnd();
                                        if (width < 1) {
                                            width = 1;
                                        }
                                        float f2 = width;
                                        if (size >= 1) {
                                            i2 = size;
                                        }
                                        float f3 = f2 / (i2 * C194434115c.LLJJJJ);
                                        if (f3 >= 1.0f) {
                                            f = f3;
                                        }
                                        c443120HZe2 = new C443120HZe(Float.valueOf(f), fValueOf2, Boolean.FALSE);
                                    }
                                    float fFloatValue3 = ((Number) c443120HZe2.getFirst()).floatValue();
                                    float fFloatValue4 = ((Number) c443120HZe2.getSecond()).floatValue();
                                    boolean zBooleanValue = ((Boolean) c443120HZe2.getThird()).booleanValue();
                                    ValueAnimator valueAnimator2 = c194434115c2.LLIZ;
                                    if (valueAnimator2 != null) {
                                        fFloatValue = c194434115c2.LLILZ;
                                    }
                                    if (valueAnimator2 != null) {
                                        fFloatValue3 = c194434115c2.LLILZIL;
                                    }
                                    c194434115c2.setMode(0);
                                    c194434115c2.setRecordingScalePivotCenter(zBooleanValue);
                                    c194434115c2.LJIIIIZZ(1.0f, 0.0f, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, new AwS573S0100000_29(c194434115c2, 900));
                                }
                            } else {
                                C194434115c c194434115c3 = bulletinVoiceRecordAssem2.LLJLL;
                                if (c194434115c3 != null) {
                                    ValueAnimator valueAnimator3 = c194434115c3.LLIZ;
                                    if (valueAnimator3 != null) {
                                        valueAnimator3.cancel();
                                    }
                                    c194434115c3.LLIZ = null;
                                    c194434115c3.setMode(0);
                                    c194434115c3.setRecordingAlpha(1.0f);
                                    c194434115c3.setPlaybackAlpha(0.0f);
                                    c194434115c3.setPlaybackWidthRatio(1.0f);
                                    c194434115c3.setRecordingWidthScale(1.0f);
                                    c194434115c3.setRecordingScalePivotCenter(false);
                                }
                            }
                            if (listLLIIII.isEmpty()) {
                                C194434115c c194434115c4 = bulletinVoiceRecordAssem2.LLJLL;
                                if (c194434115c4 != null) {
                                    c194434115c4.LJIIIZ();
                                    ((ArrayList) c194434115c4.LLJILJILJ).clear();
                                    c194434115c4.LLJILLL = 0L;
                                    c194434115c4.invalidate();
                                }
                            } else {
                                C194434115c c194434115c5 = bulletinVoiceRecordAssem2.LLJLL;
                                if (c194434115c5 != null) {
                                    HandlerHook.viewPost(c194434115c5, new ARunnableS98S0200000_29(c194434115c5, listLLIIII, 19));
                                }
                            }
                            C194434115c c194434115c6 = bulletinVoiceRecordAssem2.LLJLL;
                            if (c194434115c6 != null) {
                                bulletinVoiceRecordAssem2.tp().LLJIJIL.LJ = c194434115c6;
                            }
                            bulletinVoiceRecordAssem2.LLLIL = false;
                            C2229008oK c2229008oK = bulletinVoiceRecordAssem2.LLLIIIL;
                            if (c2229008oK != null) {
                                bulletinVoiceRecordAssem2.sp().LIZJ(c2229008oK);
                            }
                            EnumC194441115j enumC194441115j = (EnumC194441115j) bulletinVoiceRecordAssem2.tp().LLIZLLLIL.getValue();
                            bulletinVoiceRecordAssem2.hp(enumC194441115j);
                            bulletinVoiceRecordAssem2.Qp(enumC194441115j);
                            String strMp = bulletinVoiceRecordAssem2.mp(((Number) bulletinVoiceRecordAssem2.tp().LLJILLL.getValue()).longValue());
                            TextView textView4 = bulletinVoiceRecordAssem2.LLJLLIL;
                            if (textView4 != null) {
                                textView4.setText(strMp);
                            }
                            TextView textView5 = bulletinVoiceRecordAssem2.LLLI;
                            if (textView5 != null) {
                                textView5.setText(strMp);
                            }
                            bulletinVoiceRecordAssem2.LLJLLL = strMp;
                            break;
                        case 4:
                        case 5:
                            bulletinVoiceRecordAssem2.lp();
                            TextView textView6 = bulletinVoiceRecordAssem2.LLLILZJ;
                            if (textView6 != null) {
                                C0DTR.LIZIZ(textView6);
                            }
                            bulletinVoiceRecordAssem2.tp().LLJIJIL.LJ = null;
                            if (enumC194439115h2 == enumC194439115h3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            FrameLayout frameLayout = bulletinVoiceRecordAssem2.LLJLILLLLZIIL;
                            if (frameLayout != null) {
                                C12ES.LJIILL(0, frameLayout);
                            }
                            FrameLayout frameLayout2 = bulletinVoiceRecordAssem2.LLLFF;
                            if (frameLayout2 != null) {
                                C0DTR.LIZIZ(frameLayout2);
                            }
                            if (((Boolean) bulletinVoiceRecordAssem2.tp().LLJI.getValue()).booleanValue()) {
                                C194442115k c194442115k2 = bulletinVoiceRecordAssem2.LLJL;
                                if (c194442115k2 != null) {
                                    c194442115k2.LIZIZ();
                                }
                            } else {
                                bulletinVoiceRecordAssem2.Gp(EnumC194437115f.CONTINUE);
                            }
                            bulletinVoiceRecordAssem2.Ap();
                            C194434115c c194434115c7 = bulletinVoiceRecordAssem2.LLJLL;
                            if (c194434115c7 != null) {
                                c194434115c7.setFillWidth(true);
                            }
                            List<Float> listCQ2 = bulletinVoiceRecordAssem2.tp().CQ2();
                            if (z2) {
                                C194434115c c194434115c8 = bulletinVoiceRecordAssem2.LLJLL;
                                if (c194434115c8 != null) {
                                    c194434115c8.LLIZLLLIL = listCQ2;
                                    if (c194434115c8.getWidth() > 0 && (!listCQ2.isEmpty())) {
                                        c194434115c8.LLJJIII = C194434115c.LJII(c194434115c8.LJI(listCQ2.size()), listCQ2);
                                    }
                                    if ((!((ArrayList) c194434115c8.LLJILJILJ).isEmpty()) && ((ArrayList) c194434115c8.LLJILJILJ).size() >= c194434115c8.LJFF()) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    Float fValueOf3 = Float.valueOf(1.0f);
                                    if (z3) {
                                        pair = new Pair(fValueOf3, fValueOf3);
                                    } else {
                                        pair = new Pair(Float.valueOf(0.5f), fValueOf3);
                                    }
                                    float fFloatValue5 = ((Number) pair.getFirst()).floatValue();
                                    float fFloatValue6 = ((Number) pair.getSecond()).floatValue();
                                    Float fValueOf4 = Float.valueOf(1.0f);
                                    if (z3) {
                                        c443120HZe = new C443120HZe(fValueOf4, Float.valueOf(0.8f), Boolean.TRUE);
                                    } else {
                                        int width2 = (c194434115c8.getWidth() - c194434115c8.getPaddingStart()) - c194434115c8.getPaddingEnd();
                                        if (width2 < 1) {
                                            width2 = 1;
                                        }
                                        float f4 = width2;
                                        int size2 = ((ArrayList) c194434115c8.LLJILJILJ).size();
                                        if (size2 >= 1) {
                                            i2 = size2;
                                        }
                                        float f5 = f4 / (i2 * C194434115c.LLJJJJ);
                                        if (f5 >= 1.0f) {
                                            f = f5;
                                        }
                                        c443120HZe = new C443120HZe(fValueOf4, Float.valueOf(f), Boolean.FALSE);
                                    }
                                    float fFloatValue7 = ((Number) c443120HZe.getFirst()).floatValue();
                                    float fFloatValue8 = ((Number) c443120HZe.getSecond()).floatValue();
                                    boolean zBooleanValue2 = ((Boolean) c443120HZe.getThird()).booleanValue();
                                    ValueAnimator valueAnimator4 = c194434115c8.LLIZ;
                                    if (valueAnimator4 != null) {
                                        fFloatValue5 = c194434115c8.LLILZ;
                                    }
                                    if (valueAnimator4 != null) {
                                        fFloatValue7 = c194434115c8.LLILZIL;
                                    }
                                    c194434115c8.setRecordingScalePivotCenter(zBooleanValue2);
                                    c194434115c8.LJIIIIZZ(0.0f, 1.0f, fFloatValue5, fFloatValue6, fFloatValue7, fFloatValue8, new AwS573S0100000_29(c194434115c8, 901));
                                }
                            } else {
                                C194434115c c194434115c9 = bulletinVoiceRecordAssem2.LLJLL;
                                if (c194434115c9 != null) {
                                    ValueAnimator valueAnimator5 = c194434115c9.LLIZ;
                                    if (valueAnimator5 != null) {
                                        valueAnimator5.cancel();
                                    }
                                    c194434115c9.LLIZ = null;
                                    c194434115c9.LLIZLLLIL = listCQ2;
                                    if (c194434115c9.getWidth() > 0 && (!listCQ2.isEmpty())) {
                                        c194434115c9.LLJJIII = C194434115c.LJII(c194434115c9.LJI(listCQ2.size()), listCQ2);
                                    }
                                    c194434115c9.setMode(1);
                                    c194434115c9.setRecordingAlpha(0.0f);
                                    c194434115c9.setPlaybackAlpha(1.0f);
                                    c194434115c9.setPlaybackWidthRatio(1.0f);
                                    c194434115c9.setRecordingWidthScale(1.0f);
                                    c194434115c9.setRecordingScalePivotCenter(false);
                                    ((ArrayList) c194434115c9.LLJILJILJ).clear();
                                    c194434115c9.LLJILLL = 0L;
                                }
                            }
                            C194434115c c194434115c10 = bulletinVoiceRecordAssem2.LLJLL;
                            if (c194434115c10 != null) {
                                c194434115c10.setProgress(0.0f);
                            }
                            Context context = bulletinVoiceRecordAssem2.getContext();
                            if (context != null) {
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                                if (numLIZJ != null) {
                                    iIntValue = numLIZJ.intValue();
                                } else {
                                    iIntValue = -16777216;
                                }
                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, context);
                                if (numLIZJ2 != null) {
                                    iIntValue2 = numLIZJ2.intValue();
                                } else {
                                    iIntValue2 = -3355444;
                                }
                                C194434115c c194434115c11 = bulletinVoiceRecordAssem2.LLJLL;
                                if (c194434115c11 != null) {
                                    c194434115c11.LLJJIJIL = iIntValue;
                                    c194434115c11.LLJJJ = iIntValue2;
                                    c194434115c11.invalidate();
                                }
                            }
                            TuxIconView tuxIconView = bulletinVoiceRecordAssem2.LLL;
                            if (tuxIconView != null) {
                                C12ES.LJIILL(0, tuxIconView);
                            }
                            View view = bulletinVoiceRecordAssem2.LLLF;
                            if (view != null) {
                                C0DTR.LIZIZ(view);
                            }
                            TuxIconView tuxIconView2 = bulletinVoiceRecordAssem2.LLJZIJLIL;
                            if (tuxIconView2 != null) {
                                C12ES.LJIILL(0, tuxIconView2);
                            }
                            TuxIconView tuxIconView3 = bulletinVoiceRecordAssem2.LLJZ;
                            if (tuxIconView3 != null) {
                                C12ES.LJIILL(0, tuxIconView3);
                            }
                            bulletinVoiceRecordAssem2.Ep(7);
                            bulletinVoiceRecordAssem2.Tp();
                            TextView textView7 = bulletinVoiceRecordAssem2.LLJLLIL;
                            if (textView7 != null) {
                                textView7.setText(bulletinVoiceRecordAssem2.mp(((Number) bulletinVoiceRecordAssem2.tp().LLJILLL.getValue()).longValue()));
                            }
                            if (((Boolean) bulletinVoiceRecordAssem2.tp().LLJI.getValue()).booleanValue()) {
                                TextView textView8 = bulletinVoiceRecordAssem2.LLJJLIIIJLLLLLLLZ;
                                if (textView8 != null) {
                                    Resources resources = textView8.getResources();
                                    if (resources != null) {
                                        string = resources.getString(2131828181);
                                    }
                                    textView8.setText(string);
                                }
                                BulletinVoiceRecordAssem.ip(bulletinVoiceRecordAssem2.LLJJLIIIJLLLLLLLZ, false);
                                TextView textView9 = bulletinVoiceRecordAssem2.LLJJLIIIJLLLLLLLZ;
                                if (textView9 != null) {
                                    C12ES.LJIILL(0, textView9);
                                }
                            } else {
                                TextView textView10 = bulletinVoiceRecordAssem2.LLJJLIIIJLLLLLLLZ;
                                if (textView10 != null) {
                                    C0DTR.LIZIZ(textView10);
                                }
                            }
                            break;
                        case 6:
                            bulletinVoiceRecordAssem2.lp();
                            C194442115k c194442115k3 = bulletinVoiceRecordAssem2.LLJL;
                            if (c194442115k3 != null) {
                                c194442115k3.LIZIZ();
                            }
                            TextView textView11 = bulletinVoiceRecordAssem2.LLLILZJ;
                            if (textView11 != null) {
                                C0DTR.LIZIZ(textView11);
                            }
                            bulletinVoiceRecordAssem2.LLLIL = false;
                            bulletinVoiceRecordAssem2.tp().LLJIJIL.LJ = null;
                            C194434115c c194434115c12 = bulletinVoiceRecordAssem2.LLJLL;
                            if (c194434115c12 != null) {
                                c194434115c12.LJIIIZ();
                                ValueAnimator valueAnimator6 = c194434115c12.LLIZ;
                                if (valueAnimator6 != null) {
                                    valueAnimator6.cancel();
                                }
                                c194434115c12.LLIZ = null;
                            }
                            C2229008oK c2229008oK2 = bulletinVoiceRecordAssem2.LLLIIIL;
                            if (c2229008oK2 != null) {
                                bulletinVoiceRecordAssem2.sp().LIZIZ(c2229008oK2);
                            }
                            break;
                        default:
                            throw new C1954807lC();
                    }
                    if (z) {
                        enumC620000OTm = EnumC620000OTm.VOICE;
                    } else {
                        enumC620000OTm = EnumC620000OTm.INPUT;
                    }
                    if (bulletinVoiceRecordAssem2.op().getState().LLILLL != enumC620000OTm) {
                        bulletinVoiceRecordAssem2.op().setState(new AwS588S0100000_9(enumC620000OTm, 539));
                    }
                    bulletinVoiceRecordAssem2.LLLILZ = enumC194439115h;
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c2252321DDq.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinVoiceRecordAssem@4687.observeViewModel$5");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
