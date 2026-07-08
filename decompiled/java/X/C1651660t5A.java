package X;

import Y.ARunnableS22S0201000_16;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t5A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651660t5A extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<C1650980t44> LL;
    public boolean LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    public C1651660t5A(List<? extends C1650980t44> list) {
        ArrayList arrayList = new ArrayList();
        this.LL = arrayList;
        this.LLILLJJLI = true;
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        arrayList.addAll(list);
    }

    public final void LLLI(List<? extends C1650980t44> list) {
        final ArrayList arrayList = new ArrayList(this.LL);
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).addAll(list);
        final List<C1650980t44> list2 = this.LL;
        C21342318fd.LIZ(new AbstractC21342018fa(arrayList, list2) { // from class: X.0t5C
            public final List<C1650980t44> LIZ;
            public final List<C1650980t44> LIZIZ;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = arrayList;
                this.LIZIZ = list2;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                if (((C1650980t44) ListProtector.get(this.LIZ, i)).LLJJIJIL == ((C1650980t44) ListProtector.get(this.LIZIZ, i2)).LLJJIJIL && Intrinsics.LJFF(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2))) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                if (((C1650980t44) ListProtector.get(this.LIZ, i)).LL == ((C1650980t44) ListProtector.get(this.LIZIZ, i2)).LL) {
                    return true;
                }
                return false;
            }
        }, true).LIZJ(this);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3;
        float f;
        AbstractC1645550svJ abstractC1645550svJ;
        Activity activityLIZ;
        InterfaceC1651650t59 interfaceC1651650t59;
        C1650980t44 c1650980t44 = (C1650980t44) ListProtector.get(this.LL, i);
        C1651640t58 c1651640t58 = (C1651640t58) viewHolder;
        final SmartImageView smartImageView = c1651640t58.LL;
        if (c1650980t44.LL == 1) {
            c1650980t44.LLJILJILJ = new InterfaceC1650740t3g() { // from class: X.0t9m
                @Override // X.InterfaceC1650740t3g
                public final void LIZ() {
                    C1651660t5A c1651660t5A = this.LIZ;
                    SmartImageView smartImageView2 = smartImageView;
                    c1651660t5A.getClass();
                    if (smartImageView2 != null) {
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(smartImageView2, "alpha", 1.0f, 0.5f);
                        objectAnimatorOfFloat.setDuration(60L);
                        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                        final ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(smartImageView2, "alpha", 0.5f, 1.0f);
                        objectAnimatorOfFloat2.setDuration(60L);
                        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                        C21616319ij c21616319ij = AbstractC21616419ik.LJIILL;
                        final C21616519il c21616519ilLLLFZ = C1651660t5A.LLLFZ(smartImageView2, c21616319ij, 1.0f, 0.9f);
                        final C21616519il c21616519ilLLLFZ2 = C1651660t5A.LLLFZ(smartImageView2, c21616319ij, 0.9f, 1.0f);
                        C21616919ip c21616919ip = AbstractC21616419ik.LJIILLIIL;
                        final C21616519il c21616519ilLLLFZ3 = C1651660t5A.LLLFZ(smartImageView2, c21616919ip, 1.0f, 0.9f);
                        final C21616519il c21616519ilLLLFZ4 = C1651660t5A.LLLFZ(smartImageView2, c21616919ip, 0.9f, 1.0f);
                        c21616519ilLLLFZ.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0t9o
                            @Override // X.InterfaceC1427630nFp
                            public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f2, float f3) {
                                c21616519ilLLLFZ2.LJIIIZ();
                            }
                        });
                        c21616519ilLLLFZ3.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0t9p
                            @Override // X.InterfaceC1427630nFp
                            public final void LIZ(AbstractC21616419ik abstractC21616419ik, boolean z, float f2, float f3) {
                                c21616519ilLLLFZ4.LJIIIZ();
                            }
                        });
                        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0t9n
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                c21616519ilLLLFZ.LJIIIIZZ();
                                c21616519ilLLLFZ3.LJIIIIZZ();
                                C786410Ut5.Pd(objectAnimatorOfFloat2);
                            }
                        });
                        c21616519ilLLLFZ.LJIIIZ();
                        c21616519ilLLLFZ3.LJIIIZ();
                        C786410Ut5.Pd(objectAnimatorOfFloat);
                    }
                }
            };
        }
        ImageUrlModel imageUrlModel = c1650980t44.LLILZIL;
        if (imageUrlModel != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModel);
            c1331670kl3LJIIIIZZ.LJJIIZ(c1650980t44.LLILLJJLI);
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        } else if (c1650980t44.LLILLL != -1) {
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            int i4 = c1650980t44.LLILZ;
            if (i4 == 0) {
                i4 = R.attr.ee;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZJ = layoutParams.height - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            int i5 = layoutParams.width;
            if (c1650980t44.LL == 0) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            c419910GdJ.LIZIZ = i5 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
            c419910GdJ.LIZ = c1650980t44.LLILLL;
            c419910GdJ.LJ = Integer.valueOf(i4);
            c419910GdJ.LJFF = true;
            smartImageView.setImageDrawable(c419910GdJ.LIZ(smartImageView.getContext()));
            if (c1650980t44.LL == 0) {
                C426750GoL.LJIIL(smartImageView, Integer.valueOf(this.LLILZ), Integer.valueOf(this.LLILLL), Integer.valueOf(this.LLILZ), Integer.valueOf(this.LLILLL), 16);
            } else {
                C426750GoL.LJIIL(smartImageView, Integer.valueOf(this.LLILLL), Integer.valueOf(this.LLILLL), Integer.valueOf(this.LLILLL), Integer.valueOf(this.LLILLL), 16);
            }
        } else {
            smartImageView.setImageResource(c1650980t44.LLILLJJLI);
        }
        if (c1650980t44.LLILZLL) {
            i3 = 255;
        } else {
            i3 = 127;
        }
        smartImageView.setImageAlpha(i3);
        TextView textView = c1651640t58.LLILLL;
        View view = viewHolder.itemView;
        if (c1650980t44.LLILZLL) {
            f = 1.0f;
        } else {
            f = 0.49803922f;
        }
        C786410Ut5.S4(f, textView);
        int i6 = 0;
        if (c1650980t44.LLJJI <= 0) {
            C786410Ut5.LLIL(textView, 8);
            view.setContentDescription(null);
        } else {
            C786410Ut5.LLIL(textView, 0);
            textView.setText(c1650980t44.LLJJI);
            view.setContentDescription(view.getContext().getText(c1650980t44.LLJJI));
        }
        if (c1650980t44.LLJILLL && (interfaceC1651650t59 = c1650980t44.LLJJIII) != null) {
            interfaceC1651650t59.LIZ(smartImageView);
        }
        if (c1650980t44.LL == 6 && this.LLILLJJLI && (activityLIZ = C0FNT.LIZ(smartImageView.getContext())) != null) {
            this.LLILLJJLI = false;
            int i7 = C1651690t5D.LIZ.LIZ.getInt("duet_layout_tool_bar_bubble_hint", 0);
            if (i7 < 1 && smartImageView.getParent() != null && !activityLIZ.isFinishing()) {
                C450720Hlu c450720Hlu = new C450720Hlu(activityLIZ);
                c450720Hlu.LLILLJJLI.LIZIZ = smartImageView;
                c450720Hlu.LJIIJ(2131832496);
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
                c1391600mJi.LIZLLL = EnumC1235690iGF.START;
                HandlerHook.viewPostDelay(smartImageView, new ARunnableS22S0201000_16(i7, c450720Hlu.LIZIZ(), activityLIZ, 2), 500L);
            }
        }
        C1651640t58 c1651640t582 = (C1651640t58) viewHolder;
        TuxIconView tuxIconView = c1651640t582.LLILZ;
        if (!c1650980t44.LLJ) {
            i6 = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i6);
        if (c1650980t44.LL == 4) {
            InterfaceC1651630t57 interfaceC1651630t57 = c1650980t44.LLJIJIL;
            if ((interfaceC1651630t57 instanceof AbstractC1645550svJ) && (abstractC1645550svJ = (AbstractC1645550svJ) interfaceC1651630t57) != null) {
                abstractC1645550svJ.LIZLLL(c1651640t582.LLILLJJLI, c1650980t44);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1651640t58 c1651640t58 = new C1651640t58(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cc8, viewGroup, false));
        try {
            View view = c1651640t58.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1651640t58.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1651640t58.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1651640t58.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1651640t58.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1651640t58.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1651640t58.class.getName();
        return c1651640t58;
    }

    public static final C21616519il LLLFZ(SmartImageView smartImageView, AbstractC21615419ia abstractC21615419ia, float f, float f2) {
        C21616519il c21616519il = new C21616519il(smartImageView, abstractC21615419ia, f2);
        c21616519il.LJJ.LIZIZ(300.0f);
        c21616519il.LJJ.LIZ(0.594f);
        c21616519il.LJI(f);
        c21616519il.LIZ = 0.0f;
        return c21616519il;
    }
}
