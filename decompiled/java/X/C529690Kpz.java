package X;

import Y.ARunnableS108S0100000_8;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Kpz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529690Kpz extends RecyclerView.ViewHolder {
    public String LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final C1322110kVd LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxIconView LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;
    public final View LLJI;
    public final View LLJIJIL;
    public final View LLJILJIL;
    public final ContextThemeWrapper LLJILJILJ;
    public final /* synthetic */ C529680Kpy LLJILLL;

    public final long I5(int i) {
        if (!C580130Mp9.LIZ(this.LLJILLL.LLILLJJLI) && i >= 0 && i < this.LLJILLL.LLILLJJLI.size() && ListProtector.get(this.LLJILLL.LLILLJJLI, i) != null) {
            return ((CutSameVideoImageExtraData) ListProtector.get(this.LLJILLL.LLILLJJLI, i)).extraDuration;
        }
        return 0L;
    }

    public final void L5(int i) {
        if (i == this.LLJILLL.LLJILLL.LLILZ) {
            if (this.LLIZLLLIL.getVisibility() != 0) {
                C786410Ut5.T4(this.LLIZLLLIL, 0.0f);
                C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL);
                this.LLIZLLLIL.animate().alpha(1.0f).setDuration(150L).start();
                return;
            }
            return;
        }
        if (this.LLIZLLLIL.getVisibility() != 0) {
            return;
        }
        this.LLIZLLLIL.animate().alpha(0.0f).setDuration(100L).withEndAction(new ARunnableS108S0100000_8(this, 51)).start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C529690Kpz(final C529680Kpy c529680Kpy, ViewGroup viewGroup) {
        int iIntValue;
        FrameLayout.LayoutParams layoutParams;
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cz2, viewGroup, false));
        this.LLJILLL = c529680Kpy;
        this.LLILZ = true;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(viewGroup.getContext(), R.style.y0);
        this.LLJILJILJ = contextThemeWrapper;
        this.LLILZIL = (C1322110kVd) this.itemView.findViewById(R.id.video_cover);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.gcl);
        this.LLILZLL = tuxTextView;
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.fky);
        TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.loe);
        this.LLIZ = tuxIconView2;
        View viewFindViewById = this.itemView.findViewById(R.id.rp6);
        this.LLIZLLLIL = viewFindViewById;
        this.LLJ = this.itemView.findViewById(R.id.fkz);
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.itemView.findViewById(R.id.video_cover_layout);
        this.LLJI = this.itemView.findViewById(R.id.j4o);
        View viewFindViewById2 = this.itemView.findViewById(R.id.xge);
        this.LLJIJIL = viewFindViewById2;
        this.LLJILJIL = this.itemView.findViewById(R.id.o1o);
        View view = this.itemView;
        roundedFrameLayout.setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        tuxTextView.setGravity(17);
        ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 17;
        }
        viewFindViewById2.setBackgroundResource(R.drawable.fhk);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, contextThemeWrapper);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, contextThemeWrapper);
        tuxTextView.setTextColor(numLIZJ2 != null ? numLIZJ2.intValue() : -1);
        viewFindViewById.setBackground(C426580Go4.LIZJ(iIntValue, 0, (int) C11VU.LIZIZ(2.0f, view.getContext()), (int) C11VU.LIZIZ(6.0f, view.getContext())));
        C339190DRl.LIZIZ(viewFindViewById);
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, contextThemeWrapper);
        if (numLIZJ3 != null) {
            tuxIconView2.setTintColor(numLIZJ3.intValue());
        }
        View view2 = this.itemView;
        final C530520KrK c530520KrK = c529680Kpy.LLJILLL;
        C786410Ut5.I7(new C19IN() { // from class: X.0Kq1
            @Override // X.C19IN
            public final void LIZ(View view3) {
                int adapterPosition = this.LLILZLL.getAdapterPosition();
                if (adapterPosition != -1) {
                    Function1<Integer, Boolean> canClickItemPredicate = c530520KrK.getCanClickItemPredicate();
                    if (canClickItemPredicate != null && canClickItemPredicate.invoke(Integer.valueOf(adapterPosition)).booleanValue()) {
                        return;
                    }
                    c530520KrK.getClass();
                    C530520KrK.LIZJ(view3);
                    Function2<? super Integer, ? super Boolean, Unit> function2 = c529680Kpy.LLJILJIL;
                    if (function2 != null) {
                        function2.invoke(Integer.valueOf(adapterPosition), Boolean.TRUE);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0, 3);
            }
        }, view2);
        final C530520KrK c530520KrK2 = c529680Kpy.LLJILLL;
        C786410Ut5.a9(tuxIconView, new C19IN() { // from class: X.0Kq0
            @Override // X.C19IN
            public final void LIZ(View view3) {
                Boolean boolInvoke;
                int adapterPosition = this.LLILZLL.getAdapterPosition();
                if (adapterPosition != -1 && adapterPosition < c529680Kpy.LL.size()) {
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("VideoTemplateCame_deleteImgViewUgc intercept= ");
                    Function1<Integer, Boolean> canDeleteItemPredicate = c530520KrK2.getCanDeleteItemPredicate();
                    if (canDeleteItemPredicate != null) {
                        boolInvoke = canDeleteItemPredicate.invoke(Integer.valueOf(adapterPosition));
                    } else {
                        boolInvoke = null;
                    }
                    sbLIZ.append(boolInvoke);
                    C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                    TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) ListProtector.get(c529680Kpy.LL, adapterPosition);
                    if (!c529680Kpy.LLLLIIIILLL(tikTokMediaModel)) {
                        Function1<Integer, Boolean> canDeleteItemPredicate2 = c530520KrK2.getCanDeleteItemPredicate();
                        if (canDeleteItemPredicate2 != null && !canDeleteItemPredicate2.invoke(Integer.valueOf(adapterPosition)).booleanValue()) {
                            return;
                        }
                        c529680Kpy.LLLIL(tikTokMediaModel);
                        C529680Kpy c529680Kpy2 = c529680Kpy;
                        Function1<? super Integer, Unit> function1 = c529680Kpy2.LLJILJILJ;
                        if (function1 != null) {
                            function1.invoke(Integer.valueOf(c529680Kpy2.LLJIJIL));
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0, 3);
            }
        });
    }
}
