package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsPinCardMarginTestSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0ev7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1107270ev7 extends C1107300evA {
    public C16F5 LLJJIJIIJIL;
    public C16F5 LLJJIJIL;
    public C1324720kZq LLJJJ;
    public C1324720kZq LLJJJIL;
    public ViewGroup LLJJJJ;
    public ConstraintLayout LLJJJJJIL;
    public C1107290ev9 LLJJJJLIIL;

    @Override // X.InterfaceC1108000ewI
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.C1107300evA
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.C1107300evA
    public final void LJIIL() {
        this.LLILLL.put("metrics", String.valueOf(this.LLILLJJLI.highlightTextNum));
        super.LJIIL();
    }

    @Override // X.C1107300evA
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        View view = this.LLILZLL;
        if (view != null) {
            this.LLJJIJIIJIL = (C16F5) view.findViewById(R.id.cdw);
            this.LLJJIJIL = (C16F5) view.findViewById(R.id.cfu);
            this.LLJJJ = (C1324720kZq) view.findViewById(R.id.nwn);
            this.LLJJJIL = (C1324720kZq) view.findViewById(R.id.vav);
            this.LLJJJJJIL = (ConstraintLayout) view.findViewById(R.id.eqx);
            this.LLJJJJ = (ViewGroup) view.findViewById(R.id.keh);
        }
        if (LivePcsPinCardMarginTestSetting.INSTANCE.getValue() > 0) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
    }

    @Override // X.C1107300evA
    public final boolean LJIIJ() {
        return LJIIIZ() || this.LLILZ.isAdmin();
    }

    public static Spannable LJIILJJIL(Spannable spannable) {
        int i;
        if (spannable == null) {
            return new SpannableStringBuilder("");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        try {
            Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.faz);
            if (drawableLJIIJ != null) {
                spannableStringBuilder.append((CharSequence) "  ");
                int iLIZIZ = (int) C497740JfY.LIZIZ(12);
                drawableLJIIJ.setBounds(0, 0, iLIZIZ, iLIZIZ);
                if (Build.VERSION.SDK_INT >= 29) {
                    i = 2;
                } else {
                    i = 1;
                }
                C786410Ut5.q2(spannableStringBuilder, new ImageSpan(drawableLJIIJ, i), 0, 2, 17);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) spannable);
                return spannableStringBuilder;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        spannableStringBuilder.append((CharSequence) spannable);
        return spannableStringBuilder;
    }

    @Override // X.InterfaceC1107200ev0
    public void LIZIZ(SubPinCard subPinCard) {
        Spannable spannableLIZ;
        C1107290ev9 c1107290ev9 = this.LLJJJJLIIL;
        if (c1107290ev9 == null) {
            return;
        }
        long j = subPinCard.highlightTextNum;
        SubPinCard subPinCard2 = this.LLILLJJLI;
        if (j <= subPinCard2.highlightTextNum) {
            return;
        }
        subPinCard2.highlightTextNum = j;
        c1107290ev9.LJIIIZ = (int) subPinCard.highlightTextNum;
        this.LLILLL.put("metrics", String.valueOf(j));
        C1107290ev9 c1107290ev92 = this.LLJJJJLIIL;
        if (c1107290ev92 != null) {
            spannableLIZ = c1107290ev92.LIZ();
        } else {
            spannableLIZ = null;
        }
        if (this.LLILLJJLI.type == 6) {
            Spannable spannableLJIILJJIL = LJIILJJIL(spannableLIZ);
            C16F5 c16f5 = this.LLJ;
            if (c16f5 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) c1107290ev9.LJ);
                spannableStringBuilder.append((CharSequence) " · ");
                spannableStringBuilder.append((CharSequence) spannableLJIILJJIL);
                c16f5.setText(spannableStringBuilder);
            }
        } else {
            C16F5 c16f52 = this.LLJJIJIIJIL;
            if (c16f52 != null) {
                c16f52.setText(LJIILJJIL(spannableLIZ));
            }
            C16F5 c16f53 = this.LLJJIJIIJIL;
            if (c16f53 != null) {
                C500260Jjc.LLFFF(c16f53);
            }
            C19MB c19mb = new C19MB();
            c19mb.LJII(this.LLJJJJJIL);
            c19mb.LJI(R.id.jkq, 3);
            c19mb.LJI(R.id.jkq, 4);
            c19mb.LJI(R.id.title, 3);
            c19mb.LJI(R.id.title, 4);
            c19mb.LJIIIIZZ(R.id.jkq, 3, 0, 3);
            c19mb.LJJIIJZLJL(R.id.jkq, 3, (int) C497740JfY.LIZIZ(8));
            c19mb.LJIIIIZZ(R.id.title, 3, R.id.jkq, 4);
            c19mb.LJJIIJZLJL(R.id.title, 3, (int) C497740JfY.LIZIZ(2));
            c19mb.LIZIZ(this.LLJJJJJIL);
        }
        View view = this.LLILZLL;
        if (view != null) {
            HandlerHook.viewPost(view, new RunnableC1087180eOi(this));
        }
    }

    @Override // X.InterfaceC771240UNe
    public View LIZLLL(Context context) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(C1834150xpV.LJIIIIZZ(context)), R.layout.hg3, null, false);
        this.LLILZLL = viewTd;
        return viewTd;
    }

    @Override // X.InterfaceC1107200ev0
    public final boolean LJI(SubPinCard subPinCard) {
        if (!this.LLJJ) {
            return false;
        }
        SubPinCard subPinCard2 = this.LLILLJJLI;
        if (subPinCard2.id != subPinCard.id || subPinCard2.lastPinTimestamp != subPinCard.lastPinTimestamp) {
            return false;
        }
        return true;
    }

    @Override // X.C1107300evA
    public void LJIILIIL(C1107290ev9 c1107290ev9) {
        Context context;
        boolean z;
        boolean z2;
        ViewGroup.LayoutParams layoutParams;
        Context context2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2;
        C0JMF c0jmf = C0JMF.LIZ;
        SubPinCard subPinCard = this.LLILLJJLI;
        c0jmf.getClass();
        c1107290ev9.LJIIIZ = (int) subPinCard.highlightTextNum;
        ImageModel imageModel = (ImageModel) C13LP.LJJJLL(subPinCard.icons);
        if (imageModel == null) {
            imageModel = subPinCard.image;
        }
        c1107290ev9.LJIIJ = imageModel;
        View view = this.LLILZLL;
        Context context3 = null;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.ey9, context);
        if (this.LLILLJJLI.type == 9) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJJJLIIL = c1107290ev9;
        super.LJIILIIL(c1107290ev9);
        if (this.LLILLJJLI.type == 6) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C1324720kZq c1324720kZq = this.LLJJJ;
            if (c1324720kZq != null && (layoutParams2 = c1324720kZq.getLayoutParams()) != null) {
                layoutParams2.width = (int) C497740JfY.LIZIZ(52);
                C1324720kZq c1324720kZq2 = this.LLJJJ;
                if (c1324720kZq2 != null) {
                    C786410Ut5.u6(c1324720kZq2, layoutParams2);
                }
            }
            ViewGroup viewGroup = this.LLJJJJ;
            if (viewGroup != null) {
                layoutParams = viewGroup.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.width = (int) C497740JfY.LIZIZ(63);
                marginLayoutParams.height = (int) C497740JfY.LIZIZ(71);
                marginLayoutParams.bottomMargin = (int) C497740JfY.LIZIZ(5);
                ViewGroup viewGroup2 = this.LLJJJJ;
                if (viewGroup2 != null) {
                    C786410Ut5.X5(marginLayoutParams, viewGroup2);
                }
            }
            C1324610kZf url = C1819620xS4.LIZ().setUrl(c1107290ev9.LJIIIIZZ);
            url.LJIJI(Float.valueOf(C497740JfY.LIZIZ(6)));
            int iLIZIZ2 = (int) C497740JfY.LIZIZ(52);
            int iLIZIZ3 = (int) C497740JfY.LIZIZ(68);
            url.LJ = iLIZIZ2;
            url.LJFF = iLIZIZ3;
            View view2 = this.LLILZLL;
            if (view2 != null) {
                context2 = view2.getContext();
            } else {
                context2 = null;
            }
            url.LJIIJJI = new ColorDrawable(C20736316Cj.LIZIZ(R.attr.a03, context2));
            url.LJJI(this.LLJJJ);
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c1107290ev9.LJIIJ);
            c1324610kZfLJIIIZ.LJIJI(Float.valueOf(C497740JfY.LIZIZ(8)));
            float f = 28;
            int iLIZIZ4 = (int) C497740JfY.LIZIZ(f);
            int iLIZIZ5 = (int) C497740JfY.LIZIZ(f);
            c1324610kZfLJIIIZ.LJ = iLIZIZ4;
            c1324610kZfLJIIIZ.LJFF = iLIZIZ5;
            View view3 = this.LLILZLL;
            if (view3 != null) {
                context3 = view3.getContext();
            }
            c1324610kZfLJIIIZ.LJIIJJI = new ColorDrawable(C20736316Cj.LIZIZ(R.attr.a03, context3));
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            if (z) {
                float fLIZIZ = C497740JfY.LIZIZ(1);
                c1324610kZfLJIIIZ.LJJIIJ = iLIZIZ;
                c1324610kZfLJIIIZ.LJJIII = fLIZIZ;
            }
            c1324610kZfLJIIIZ.LJJI(this.LLJJJIL);
            C500260Jjc.LLFFF(this.LLJJJIL);
        } else {
            C1324610kZf c1324610kZfLJIIIZ2 = C1819620xS4.LIZ().LJIIIZ(c1107290ev9.LJIIJ);
            c1324610kZfLJIIIZ2.LJIJI(Float.valueOf(C497740JfY.LIZIZ(8)));
            View view4 = this.LLILZLL;
            if (view4 != null) {
                context3 = view4.getContext();
            }
            c1324610kZfLJIIIZ2.LJIIJJI = new ColorDrawable(C20736316Cj.LIZIZ(R.attr.a03, context3));
            float f2 = 68;
            int iLIZIZ6 = (int) C497740JfY.LIZIZ(f2);
            int iLIZIZ7 = (int) C497740JfY.LIZIZ(f2);
            c1324610kZfLJIIIZ2.LJ = iLIZIZ6;
            c1324610kZfLJIIIZ2.LJFF = iLIZIZ7;
            if (z) {
                float fLIZIZ2 = C497740JfY.LIZIZ(1);
                c1324610kZfLJIIIZ2.LJJIIJ = iLIZIZ;
                c1324610kZfLJIIIZ2.LJJIII = fLIZIZ2;
            }
            c1324610kZfLJIIIZ2.LJJI(this.LLJJJ);
        }
        if (this.LLILLJJLI.type == 6) {
            C16F5 c16f5 = this.LLJJIJIL;
            if (c16f5 != null) {
                c16f5.setText(c1107290ev9.LJIIJJI);
            }
            C16F5 c16f52 = this.LLJJIJIL;
            if (c16f52 != null) {
                C500260Jjc.LLFFF(c16f52);
            }
            C16F5 c16f53 = this.LLJJIJIIJIL;
            if (c16f53 != null) {
                C500260Jjc.LJIILIIL(c16f53);
            }
            Spannable spannableLIZ = c1107290ev9.LIZ();
            if (spannableLIZ != null && C500260Jjc.LJJIJ(spannableLIZ)) {
                Spannable spannableLJIILJJIL = LJIILJJIL(c1107290ev9.LIZ());
                C16F5 c16f54 = this.LLJ;
                if (c16f54 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) c1107290ev9.LJ);
                    spannableStringBuilder.append((CharSequence) " · ");
                    spannableStringBuilder.append((CharSequence) spannableLJIILJJIL);
                    c16f54.setText(spannableStringBuilder);
                }
            } else {
                C16F5 c16f55 = this.LLJ;
                if (c16f55 != null) {
                    c16f55.setText(c1107290ev9.LJ);
                }
            }
        } else {
            C16F5 c16f56 = this.LLJJIJIL;
            if (c16f56 != null) {
                C500260Jjc.LLFFF(c16f56);
            }
            Spannable spannableLIZ2 = c1107290ev9.LIZ();
            if (spannableLIZ2 != null && C500260Jjc.LJJIJ(spannableLIZ2)) {
                C16F5 c16f57 = this.LLJJIJIIJIL;
                if (c16f57 != null) {
                    c16f57.setText(LJIILJJIL(c1107290ev9.LIZ()));
                }
                C16F5 c16f58 = this.LLJJIJIIJIL;
                if (c16f58 != null) {
                    C500260Jjc.LLFFF(c16f58);
                }
            } else {
                C16F5 c16f59 = this.LLJJIJIIJIL;
                if (c16f59 != null) {
                    C500260Jjc.LJIILIIL(c16f59);
                }
                C19MB c19mb = new C19MB();
                c19mb.LJII(this.LLJJJJJIL);
                c19mb.LJIIZILJ(0, 0, new int[]{R.id.jkq, R.id.title});
                c19mb.LJJIIZI(R.id.jkq, 2);
                c19mb.LIZIZ(this.LLJJJJJIL);
            }
        }
        View view5 = this.LLILZLL;
        if (view5 != null) {
            HandlerHook.viewPost(view5, new RunnableC1087180eOi(this));
        }
    }

    public C1107270ev7(EnumC1107860ew4 enumC1107860ew4, SubPinCard subPinCard, Map<String, String> map, InterfaceC1107340evE interfaceC1107340evE, LifecycleOwner lifecycleOwner) {
        super(enumC1107860ew4, subPinCard, map, interfaceC1107340evE, lifecycleOwner);
    }
}
