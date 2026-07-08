package X;

import Y.ACListenerS165S0100000_31;
import Y.ALAdapterS12S0110000_31;
import Y.AUListenerS278S0100000_31;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.15IO, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C15IO extends RecyclerView.ViewHolder {
    public static int LLLILZ;
    public SmartImageView LL;
    public ImageView LLILLJJLI;
    public ImageView LLILLL;
    public ImageView LLILZ;
    public TextView LLILZIL;
    public TextView LLILZLL;
    public TuxIconView LLIZ;
    public TuxIconView LLIZLLLIL;
    public ImageView LLJ;
    public ViewGroup LLJI;
    public TuxIconView LLJIJIL;
    public ImageView LLJILJIL;
    public ViewGroup LLJILJILJ;
    public TextView LLJILLL;
    public ViewGroup LLJJ;
    public ViewGroup LLJJI;
    public ViewGroup LLJJIII;
    public ViewGroup LLJJIJI;
    public View LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public RecyclerView LLJJJ;
    public TextView LLJJJIL;
    public TextView LLJJJJ;
    public TextView LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public Context LLJL;
    public int LLJLIL;
    public MusicModel LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public C0HZQ LLLFFI;
    public ViewGroup LLLFZ;
    public C15HQ LLLI;
    public C15HO LLLII;
    public InterfaceC670550QRx LLLIIII;
    public C20495515Ht LLLIIIIL;
    public String LLLIIIL;
    public String LLLIIL;
    public final C20094413jq LLLIILIL;
    public InterfaceC20494515Hj<C15HP> LLLIL;

    public final void L5() {
        MusicModel musicModel = this.LLJLILLLLZIIL;
        if (musicModel == null) {
            return;
        }
        if (this.LLJJLIIIJLLLLLLLZ || C142I.LIZ(musicModel, this.LLJL, true)) {
            InterfaceC20494515Hj<C15HP> interfaceC20494515Hj = this.LLLIL;
            if (interfaceC20494515Hj != null) {
                interfaceC20494515Hj.LLIIL(new C15HP(this.LLJJLIIIJLLLLLLLZ ? "unfollow_type" : "follow_type", this.LLJLL, this.LLJLLIL, this.LLJLILLLLZIIL));
            }
            this.LLJJLIIIJLLLLLLLZ = !this.LLJJLIIIJLLLLLLLZ;
            C15IS.LIZ(this.LLIZ, this.LLLIIIIL);
        }
    }

    public final boolean N5() {
        MusicModel musicModel = this.LLJLILLLLZIIL;
        return (musicModel == null || musicModel.getMusic() == null || !this.LLJLILLLLZIIL.getMusic().isCanNotReuse()) ? false : true;
    }

    public final void R5() {
        C15IS.LIZIZ(this.LLIZ, !this.LLJJLIIIJLLLLLLLZ ? 1 : 0);
        S5(this.LLIZ, this.LLJJLIIIJLLLLLLLZ ? this.LLLIIIL : this.LLLIIL);
    }

    /* JADX WARN: Type inference failed for: r0v105, types: [X.15Ht] */
    public C15IO(View view) {
        super(view);
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
        c1397760mTe.LIZJ = null;
        this.LLLIILIL = c1397760mTe.LIZ();
        this.LLJL = this.itemView.getContext();
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.ld7);
        if (C12VA.LIZ().LJIIJ.invoke().booleanValue()) {
            SmartImageView smartImageView = this.LL;
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C341940Daq.LIZ(4);
            smartImageView.setCircleOptions(new C1331730kl9(c1331750klB));
        }
        this.LLILLJJLI = (ImageView) this.itemView.findViewById(R.id.lqe);
        this.LLILLL = (ImageView) this.itemView.findViewById(R.id.lp5);
        this.LLILZ = (ImageView) this.itemView.findViewById(R.id.lvt);
        this.LLILZIL = (TextView) this.itemView.findViewById(R.id.zym);
        this.LLILZLL = (TextView) this.itemView.findViewById(R.id.tv_singer);
        this.LLIZ = (TuxIconView) this.itemView.findViewById(R.id.lox);
        this.LLIZLLLIL = (TuxIconView) this.itemView.findViewById(R.id.lnu);
        this.LLJ = (ImageView) this.itemView.findViewById(R.id.lp1);
        this.LLJI = (ViewGroup) this.itemView.findViewById(R.id.njf);
        this.LLJIJIL = (TuxIconView) this.itemView.findViewById(R.id.lyx);
        this.LLJILJIL = (ImageView) this.itemView.findViewById(R.id.loz);
        this.itemView.findViewById(R.id.tv_use_to_shoot);
        this.LLJILJILJ = (ViewGroup) this.itemView.findViewById(R.id.tpu);
        this.LLJILLL = (TextView) this.itemView.findViewById(R.id.tv_use_to_shoot_bottom);
        this.LLJJ = (ViewGroup) this.itemView.findViewById(R.id.tpt);
        this.LLJJI = (ViewGroup) this.itemView.findViewById(R.id.nfe);
        this.LLJJIII = (ViewGroup) this.itemView.findViewById(R.id.to1);
        this.LLJJIJI = (ViewGroup) this.itemView.findViewById(R.id.nj0);
        this.LLJJIJIIJIL = this.itemView.findViewById(R.id.vw_space);
        this.LLJJIJIL = (TextView) this.itemView.findViewById(R.id.zy9);
        this.LLJJJ = (RecyclerView) this.itemView.findViewById(R.id.ox3);
        this.LLJJJIL = (TextView) this.itemView.findViewById(R.id.zyg);
        this.LLJJJJ = (TextView) this.itemView.findViewById(R.id.tv_promo_tag);
        this.LLJJJJJIL = (TextView) this.itemView.findViewById(R.id.zwt);
        this.LLJJJJLIIL = this.itemView.findViewById(R.id.tp6);
        this.LLJJL = this.itemView.findViewById(R.id.vbh);
        this.LLLFFI = (C0HZQ) this.itemView.findViewById(R.id.fsg);
        this.LLLFZ = (ViewGroup) this.itemView.findViewById(R.id.fsh);
        this.LLLIIL = C20642515q3.LJI(2131823192);
        this.LLLIIIL = C20642515q3.LJI(2131823197);
        View viewFindViewById = this.itemView.findViewById(R.id.lp1);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31((C15IP) this, 114), viewFindViewById);
        }
        View viewFindViewById2 = this.itemView.findViewById(R.id.lox);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31((C15IP) this, 115), viewFindViewById2);
        }
        View viewFindViewById3 = this.itemView.findViewById(R.id.njf);
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31((C15IP) this, 116), viewFindViewById3);
        }
        View viewFindViewById4 = this.itemView.findViewById(R.id.nfe);
        if (viewFindViewById4 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31((C15IP) this, 118), viewFindViewById4);
        }
        View viewFindViewById5 = this.itemView.findViewById(R.id.tpu);
        if (viewFindViewById5 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31((C15IP) this, 120), viewFindViewById5);
        }
        View viewFindViewById6 = this.itemView.findViewById(R.id.loz);
        if (viewFindViewById6 != null) {
            if (viewFindViewById6 instanceof TuxIconView) {
                ((TuxIconView) viewFindViewById6).setIconRes(R.raw.icon_scissors);
            }
            C786410Ut5.I7(new ACListenerS165S0100000_31((C15IP) this, 121), viewFindViewById6);
        }
        View viewFindViewById7 = this.itemView.findViewById(R.id.lnu);
        if (viewFindViewById7 != null) {
            C786410Ut5.I7(new ACListenerS165S0100000_31((C15IP) this, 122), viewFindViewById7);
        }
        final C15IP c15ip = (C15IP) this;
        C786410Ut5.LLLLLLZZ(c15ip.LLJIJIL, 0);
        if (LLLILZ <= 0) {
            this.LLJI.measure(View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            LLLILZ = (int) (this.LLJI.getMeasuredWidth() + C12ES.LIZJ(8.0f, this.LLJL));
        }
        this.LLLIIIIL = new C15IT() { // from class: X.15Ht
            @Override // X.C15IT
            public final void LIZ() {
                C15IO c15io = c15ip;
                c15io.getClass();
                C1440005kM.LIZ(new C629770On1(c15io.LLJLILLLLZIIL, c15io.LLJJLIIIJLLLLLLLZ ? 1 : 0));
            }

            @Override // X.C15IT
            public final void onStateChange(int i) {
                if (i == 1) {
                    c15ip.R5();
                }
            }
        };
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "smaller_apply_button_in_music_library", true) == 1) {
            this.LLJIJIL.setIconRes(R.raw.icon_tick_fill_small);
        }
    }

    public final void I5(boolean z) {
        this.LLILZ.clearAnimation();
        MusicModel musicModel = this.LLJLILLLLZIIL;
        if (musicModel != null && musicModel.isUnreadableMusic()) {
            C786410Ut5.LJZI(8, this.LLILZ);
            return;
        }
        if (z) {
            MusicModel musicModel2 = this.LLJLILLLLZIIL;
            if (musicModel2 == null) {
                return;
            }
            if (musicModel2.isLocalMusic()) {
                this.LLILZ.setImageResource(R.drawable.c0x);
                return;
            } else {
                if (this.LLJLILLLLZIIL.getMusicType() != 1 && this.LLJLILLLLZIIL.getMusicType() != 2) {
                    return;
                }
                C786410Ut5.LJZI(0, this.LLILZ);
                this.LLILZ.setImageResource(R.drawable.c0x);
                return;
            }
        }
        C786410Ut5.LJZI(0, this.LLILZ);
        this.LLILZ.setImageResource(R.drawable.c0b);
    }

    public final void onClick(View view) {
        C15HQ c15hq = this.LLLI;
        if (c15hq != null && (this instanceof C15IP)) {
            c15hq.LIZ((C15IP) this, view, this.LLJLILLLLZIIL, this.LLJLIL);
        }
    }

    public final void S5(View view, String str) {
        if (view == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("soundTitleOrSound", this.LLILZIL.getText().toString());
        view.setContentDescription(C1356620lPI.LIZ(str, map));
    }

    public final void P5(long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        ValueAnimator duration = ValueAnimator.ofInt(i3, i4).setDuration(200);
        duration.addUpdateListener(new AUListenerS278S0100000_31(this, 19));
        duration.addListener(new ALAdapterS12S0110000_31(this, z, 2));
        AlphaAnimation alphaAnimation = new AlphaAnimation(i, i2);
        TranslateAnimation translateAnimation = new TranslateAnimation(i5, i6, 0.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setFillAfter(true);
        animationSet.setDuration(100);
        animationSet.setStartOffset(j);
        this.LLJI.startAnimation(animationSet);
        duration.start();
    }
}
