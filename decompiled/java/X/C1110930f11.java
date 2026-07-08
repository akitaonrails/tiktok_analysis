package X;

import Y.ACListenerS53S0400000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.widget.SimpleLiveTextView;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.WaveAlgorithmData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mr0.r0;
import wh6.AbS507S0200000_17;

/* JADX INFO: renamed from: X.0f11, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110930f11<MODEL extends r0<? extends AbstractC1136060ffY>> extends C1111050f1D<MODEL> {
    public final TextView LLJJJIL;
    public final TextView LLJJJJ;
    public final View LLJJJJJIL;
    public final View LLJJJJLIIL;

    @Override // X.C1111050f1D, X.AbstractC1111020f1A
    public final void onViewDetachedFromWindow() {
        ViewGroup viewGroup;
        super.onViewDetachedFromWindow();
        View view = this.itemView;
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        C19748612Om.LIZIZ(viewGroup);
    }

    @Override // X.C1111050f1D
    public final boolean R5(MODEL model) {
        C1109770ez9 c1109770ez9;
        C234700vR c234700vRLJLJJLL;
        if (!super.R5(model) || (c1109770ez9 = this.LL) == null || !c1109770ez9.LJI || (c234700vRLJLJJLL = model.LJLJJLL()) == null || !c234700vRLJLJJLL.LIZIZ) {
            return false;
        }
        return true;
    }

    public final void U5(MODEL model, List<Object> list) {
        boolean z;
        C19ME c19me;
        ViewGroup viewGroup;
        MemberMessage memberMessage;
        C19ME c19me2;
        C19ME c19me3;
        C19ME c19me4;
        C19ME c19me5;
        C19ME c19me6;
        C19ME c19me7;
        C234700vR c234700vRLJLJJLL = model.LJLJJLL();
        if (c234700vRLJLJJLL != null && c234700vRLJLJJLL.LIZ) {
            z = true;
        } else {
            z = false;
        }
        User user = null;
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.LLJ.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me7 = (C19ME) layoutParams) != null) {
                c19me7.bottomToBottom = -1;
                SimpleLiveTextView simpleLiveTextView = this.LLJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(simpleLiveTextView);
                simpleLiveTextView.setLayoutParams(c19me7);
            }
            ViewGroup.LayoutParams layoutParams2 = this.LLJJJJ.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (c19me6 = (C19ME) layoutParams2) != null) {
                c19me6.topToBottom = R.id.text;
                C786410Ut5.g6(this.LLJJJJ, c19me6);
            }
            ViewGroup.LayoutParams layoutParams3 = this.LLJJJJJIL.getLayoutParams();
            if ((layoutParams3 instanceof C19ME) && (c19me5 = (C19ME) layoutParams3) != null) {
                c19me5.topToTop = -1;
                c19me5.bottomToBottom = R.id.k55;
                c19me5.setMarginEnd((int) C497740JfY.LIZIZ(1.0f));
                ((ViewGroup.MarginLayoutParams) c19me5).bottomMargin = (int) C497740JfY.LIZIZ(1.0f);
                c19me5.startToStart = -1;
                c19me5.endToEnd = R.id.k55;
                C786410Ut5.W5(this.LLJJJJJIL, c19me5);
            }
            if (model.LJLLLLLL() != null && !this.LLJI.getDrawAnchorMark()) {
                C786410Ut5.LJLLLLLL(0, this.LLJJJJJIL);
                this.LLJI.setCutoutRadius((int) C497740JfY.LIZIZ(8.0f));
                this.LLJI.setCutoutStartOffset((int) C497740JfY.LIZIZ(12.0f));
                this.LLJI.setCutoutTopOffset((int) C497740JfY.LIZIZ(12.0f));
            } else {
                C786410Ut5.LJLLLLLL(4, this.LLJJJJJIL);
                this.LLJI.setCutoutRadius(0.0f);
                this.LLJI.setCutoutStartOffset(0.0f);
                this.LLJI.setCutoutTopOffset(0.0f);
            }
            C786410Ut5.LLIL(this.LLJJJJ, 0);
            C1109770ez9 c1109770ez9 = this.LL;
            if (c1109770ez9 != null && c1109770ez9.LJI) {
                TextView textView = this.LLJJJJ;
                textView.setText(textView.getContext().getResources().getString(2131842640, C21627319kV.LIZJ().LJFF(C0KVU.LIZ(model.getUser()))));
            } else {
                TextView textView2 = this.LLJJJJ;
                Resources resources = textView2.getContext().getResources();
                Object[] objArr = new Object[1];
                C21627319kV c21627319kVLIZJ = C21627319kV.LIZJ();
                C1109770ez9 c1109770ez92 = this.LL;
                if (c1109770ez92 != null) {
                    user = c1109770ez92.LJIIIIZZ;
                }
                objArr[0] = c21627319kVLIZJ.LJFF(C0KVU.LIZ(user));
                textView2.setText(resources.getString(2131842643, objArr));
            }
            C786410Ut5.LLIL(this.LLJJJIL, 8);
            return;
        }
        ViewGroup.LayoutParams layoutParams4 = this.LLJ.getLayoutParams();
        if ((layoutParams4 instanceof C19ME) && (c19me4 = (C19ME) layoutParams4) != null) {
            c19me4.bottomToBottom = 0;
            SimpleLiveTextView simpleLiveTextView2 = this.LLJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(simpleLiveTextView2);
            simpleLiveTextView2.setLayoutParams(c19me4);
        }
        ViewGroup.LayoutParams layoutParams5 = this.LLJJJJ.getLayoutParams();
        if ((layoutParams5 instanceof C19ME) && (c19me3 = (C19ME) layoutParams5) != null) {
            c19me3.topToBottom = 0;
            C786410Ut5.g6(this.LLJJJJ, c19me3);
        }
        C786410Ut5.LJLLLLLL(4, this.LLJJJJJIL);
        C786410Ut5.LLIL(this.LLJJJJ, 8);
        this.LLJI.setCutoutRadius(0.0f);
        C1109770ez9 c1109770ez93 = this.LL;
        if (c1109770ez93 != null && c1109770ez93.LJI) {
            ViewGroup.LayoutParams layoutParams6 = this.LLJJJJJIL.getLayoutParams();
            if ((layoutParams6 instanceof C19ME) && (c19me2 = (C19ME) layoutParams6) != null) {
                c19me2.topToTop = R.id.yrg;
                c19me2.bottomToBottom = R.id.yrg;
                c19me2.setMarginEnd(0);
                ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = 0;
                c19me2.startToStart = R.id.yrg;
                c19me2.endToEnd = -1;
                C786410Ut5.W5(this.LLJJJJJIL, c19me2);
            }
            C234700vR c234700vRLJLJJLL2 = model.LJLJJLL();
            if (c234700vRLJLJJLL2 != null && c234700vRLJLJJLL2.LIZIZ && !R5(model)) {
                MESSAGE message = model.LJIL;
                if (!(message instanceof MemberMessage) || (memberMessage = (MemberMessage) message) == null || memberMessage.action != 46) {
                    Iterator<Object> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (next instanceof C1110980f16) {
                            if (next != null) {
                                View view = this.itemView;
                                if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                                    C21460718yj c21460718yj = new C21460718yj(1);
                                    c21460718yj.LLILZLL.add(this.LLJJJIL);
                                    c21460718yj.LLILLL = 200L;
                                    C19748612Om.LIZ(viewGroup, c21460718yj);
                                }
                            }
                        }
                    }
                    C786410Ut5.LLIL(this.LLJJJIL, 0);
                    C234700vR c234700vRLJLJJLL3 = model.LJLJJLL();
                    if (c234700vRLJLJJLL3 == null || c234700vRLJLJJLL3.LJI != -1) {
                        return;
                    }
                    c234700vRLJLJJLL3.LJI = SystemClock.uptimeMillis();
                    return;
                }
            }
            C786410Ut5.LLIL(this.LLJJJIL, 8);
            return;
        }
        ViewGroup.LayoutParams layoutParams7 = this.LLJJJJJIL.getLayoutParams();
        if ((layoutParams7 instanceof C19ME) && (c19me = (C19ME) layoutParams7) != null) {
            c19me.topToTop = -1;
            c19me.bottomToBottom = R.id.k55;
            c19me.setMarginEnd((int) C497740JfY.LIZIZ(1.0f));
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) C497740JfY.LIZIZ(1.0f);
            c19me.startToStart = -1;
            c19me.endToEnd = R.id.k55;
            C786410Ut5.W5(this.LLJJJJJIL, c19me);
        }
        C786410Ut5.LLIL(this.LLJJJIL, 8);
    }

    @Override // X.C1111050f1D, X.AbstractC1111060f1E
    public final void P5(C1109770ez9 c1109770ez9, MODEL model, List<Object> list) throws Throwable {
        Object next;
        C234700vR c234700vRLJLJJLL;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.P5(c1109770ez9, model, list);
        View view = this.itemView;
        if ((view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null) {
            C19748612Om.LIZIZ(viewGroup2);
        }
        Iterator<Object> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1110990f17) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next != null) {
            View view2 = this.itemView;
            if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
                C21463018z6 c21463018z6 = new C21463018z6();
                C21459418yW c21459418yW = new C21459418yW();
                c21459418yW.LLILZLL.add(this.LLJ);
                c21459418yW.LLILLL = 200L;
                c21463018z6.LJJJ(c21459418yW);
                C21464118zH c21464118zH = new C21464118zH();
                c21464118zH.LLILZLL.add(this.LLJJJJ);
                c21464118zH.LLILLL = 200L;
                c21463018z6.LJJJ(c21464118zH);
                C21460718yj c21460718yj = new C21460718yj(1);
                c21460718yj.LLILZLL.add(this.LLJJJJJIL);
                c21460718yj.LLILLL = 200L;
                c21463018z6.LJJJ(c21460718yj);
                C19748612Om.LIZ(viewGroup, c21463018z6);
            }
        }
        if (!c1109770ez9.LJI || !c1109770ez9.LJFF() || ((c234700vRLJLJJLL = model.LJLJJLL()) != null && c234700vRLJLJJLL.LIZ)) {
            C786410Ut5.T7(this.LLJJJIL, null);
        } else {
            C786410Ut5.T7(this.LLJJJIL, new ACListenerS53S0400000_17(this, c1109770ez9, model, list, 3));
        }
        if (c1109770ez9.LJFF()) {
            C786410Ut5.I7(new AbS507S0200000_17(model, c1109770ez9, 6), this.LLJJJJ);
        }
        U5(model, list);
    }

    public final void V5(C1109770ez9 c1109770ez9, MODEL model, List<Object> list) {
        int i;
        String str;
        Long lValueOf;
        ViewGroup viewGroup;
        LiveMode liveMode;
        WaveAlgorithmData waveAlgorithmData;
        InterfaceC1110630f0X interfaceC1110630f0X = c1109770ez9.LJIIJJI;
        long jLLIIJI = model.LLIIJI();
        long messageId = model.getMessageId();
        C234700vR c234700vRLJLJJLL = model.LJLJJLL();
        if (c234700vRLJLJJLL != null) {
            i = c234700vRLJLJJLL.LJ;
        } else {
            i = 0;
        }
        interfaceC1110630f0X.LJIIJ(i, jLLIIJI, messageId);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_wave");
        c474500IjALIZ.LJIJJLI(c1109770ez9.LJIIIZ);
        c474500IjALIZ.LJJII(Long.valueOf(model.LLIIJI()), "to_user_id");
        c474500IjALIZ.LJJII(Long.valueOf(model.getMessageId()), "msg_id");
        C234700vR c234700vRLJLJJLL2 = model.LJLJJLL();
        if (c234700vRLJLJJLL2 != null && c234700vRLJLJJLL2.LIZLLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "is_follow");
        c474500IjALIZ.LJJII("wave", Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(model.LLJJJ(), "admin_type");
        C234700vR c234700vRLJLJJLL3 = model.LJLJJLL();
        if (c234700vRLJLJJLL3 != null && (waveAlgorithmData = c234700vRLJLJJLL3.LJFF) != null) {
            c474500IjALIZ.LJJII(waveAlgorithmData.algorithmVersion, "algorithm_version");
            c474500IjALIZ.LJJII(Integer.valueOf(waveAlgorithmData.isAlgHit ? 1 : 0), "is_alg_hit");
            c474500IjALIZ.LJJII(waveAlgorithmData.predictScore, "predict_score");
            c474500IjALIZ.LJJII(Integer.valueOf(waveAlgorithmData.isRewatch ? 1 : 0), "is_rewatch");
        }
        C234700vR c234700vRLJLJJLL4 = model.LJLJJLL();
        String str2 = null;
        if (c234700vRLJLJJLL4 != null) {
            lValueOf = Long.valueOf(SystemClock.uptimeMillis() - c234700vRLJLJJLL4.LJI);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "click_interval");
        c474500IjALIZ.LJJII(Integer.valueOf(model.LJLJJI() ? 1 : 0), "is_mark");
        DataChannel dataChannel = c1109770ez9.LJIIIZ;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            str2 = liveMode.logStreamingType;
        }
        c474500IjALIZ.LJJ(str2);
        c474500IjALIZ.LIZ();
        View view = this.itemView;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C21463018z6 c21463018z6 = new C21463018z6();
            C21459418yW c21459418yW = new C21459418yW();
            c21459418yW.LLILZLL.add(this.LLJ);
            c21459418yW.LLILLL = 200L;
            c21463018z6.LJJJ(c21459418yW);
            C21464118zH c21464118zH = new C21464118zH();
            c21464118zH.LLILZLL.add(this.LLJJJJ);
            c21464118zH.LLILLL = 200L;
            c21463018z6.LJJJ(c21464118zH);
            C21460718yj c21460718yj = new C21460718yj(2);
            c21460718yj.LLILZLL.add(this.LLJJJIL);
            c21460718yj.LLILLL = 200L;
            c21463018z6.LJJJ(c21460718yj);
            C21460718yj c21460718yj2 = new C21460718yj(1);
            c21460718yj2.LLILZLL.add(this.LLJJJJJIL);
            c21460718yj2.LLILLL = 200L;
            c21463018z6.LJJJ(c21460718yj2);
            C21459418yW c21459418yW2 = new C21459418yW();
            c21459418yW2.LLILZLL.add(this.LLJJJJJIL);
            c21459418yW2.LLILLL = 200L;
            c21463018z6.LJJJ(c21459418yW2);
            AbstractC21463118z7 abstractC21463118z7 = new AbstractC21463118z7() { // from class: X.0f1C
                @Override // X.AbstractC21463118z7
                public final void LIZLLL(C1489080oqw c1489080oqw) {
                }

                @Override // X.AbstractC21463118z7
                public final void LJI(C1489080oqw c1489080oqw) {
                }

                @Override // X.AbstractC21463118z7
                public final boolean LJIJJLI(C1489080oqw c1489080oqw, C1489080oqw c1489080oqw2) {
                    return true;
                }

                @Override // X.AbstractC21463118z7
                public final Animator LJIIJ(ViewGroup viewGroup2, C1489080oqw c1489080oqw, C1489080oqw c1489080oqw2) {
                    ArrayList<View> arrayList = this.LLILZLL;
                    if (arrayList != null) {
                        Iterator<View> it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            View next = it2.next();
                            View view2 = next;
                            if (view2 != null && view2.getId() == R.id.jxd) {
                                if (next != null) {
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.setDuration(900L);
                                    Property property = View.ROTATION;
                                    Keyframe keyframeOfFloat = Keyframe.ofFloat(0.22222222f, 35.0f);
                                    keyframeOfFloat.setInterpolator(C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
                                    Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.44444445f, -10.0f);
                                    keyframeOfFloat2.setInterpolator(C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
                                    Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.6666667f, 10.0f);
                                    keyframeOfFloat3.setInterpolator(C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
                                    Keyframe keyframeOfFloat4 = Keyframe.ofFloat(1.0f, 0.0f);
                                    keyframeOfFloat4.setInterpolator(new OvershootInterpolator());
                                    animatorSet.playTogether(ObjectAnimator.ofPropertyValuesHolder(next, PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, -10.0f), keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4)));
                                    return animatorSet;
                                }
                            }
                        }
                    }
                    return null;
                }
            };
            abstractC21463118z7.LLILZLL.add(this.LLJJJJLIIL);
            abstractC21463118z7.LLILLJJLI = 200L;
            c21463018z6.LJJJ(abstractC21463118z7);
            C19748612Om.LIZ(viewGroup, c21463018z6);
        }
        C234700vR c234700vRLJLJJLL5 = model.LJLJJLL();
        if (c234700vRLJLJJLL5 != null) {
            c234700vRLJLJJLL5.LIZ = true;
        }
        U5(model, list);
    }

    public C1110930f11(View view, AbstractC1113530f5D abstractC1113530f5D, boolean z, boolean z2, boolean z3) {
        super(view, abstractC1113530f5D, false, z, z2, z3);
        TextView textView = (TextView) view.findViewById(R.id.yrg);
        this.LLJJJIL = textView;
        this.LLJJJJ = (TextView) view.findViewById(R.id.yrf);
        this.LLJJJJJIL = view.findViewById(R.id.ywj);
        this.LLJJJJLIIL = view.findViewById(R.id.jxd);
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.du_, textView.getContext());
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.ezq, textView.getContext()));
            c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(16.0f), (int) C497740JfY.LIZIZ(16.0f));
        } else {
            c20743516FdLIZLLL = null;
        }
        textView.setCompoundDrawablesRelative(c20743516FdLIZLLL, null, null, null);
    }

    @Override // X.C1111050f1D
    public final void T5(String str, EnumC1110950f13 enumC1110950f13, C1109770ez9 c1109770ez9, MODEL model, List<Object> list) {
        super.T5(str, enumC1110950f13, c1109770ez9, model, list);
        if (str != null && C1110940f12.LIZ[enumC1110950f13.ordinal()] == 1 && Intrinsics.LJFF(str, "wave") && c1109770ez9.LJI && c1109770ez9.LJFF()) {
            C234700vR c234700vRLJLJJLL = model.LJLJJLL();
            if (c234700vRLJLJJLL != null && c234700vRLJLJJLL.LIZ) {
                return;
            }
            V5(c1109770ez9, model, list);
        }
    }
}
