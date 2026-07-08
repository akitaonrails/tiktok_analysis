package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0101000_1;
import r4b.g;

/* JADX INFO: renamed from: X.04Eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1065404Eq extends AbstractC2172971A2l<Object, AbstractC1065704Et<?>> {
    public C1064604Ei LLILLJJLI;

    public C1065404Eq() {
        super(new C1065604Es());
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return LLLFZ(i).getClass().hashCode();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        AbstractC1065704Et abstractC1065704Et = (AbstractC1065704Et) viewHolder;
        if (abstractC1065704Et != null) {
            abstractC1065704Et.I5(i, LLLFZ(i));
        }
        C786410Ut5.I7(new AjS10S0101000_1(this, i, 3), abstractC1065704Et.itemView);
        abstractC1065704Et.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: X.04Ep
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C1065404Eq c1065404Eq;
                C1064604Ei c1064604Ei;
                if (motionEvent.getAction() == 0 && (c1064604Ei = (c1065404Eq = this.LL).LLILLJJLI) != null) {
                    int i2 = i;
                    c1065404Eq.LLLFZ(i2);
                    c1064604Ei.M2(i2);
                    return false;
                }
                return false;
            }
        });
        C1064604Ei c1064604Ei = this.LLILLJJLI;
        if (c1064604Ei != null) {
            LLLFZ(i);
            c1064604Ei.LJJLIIIJ(i, abstractC1065704Et);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        if (i == C2172401A0g.class.hashCode()) {
            viewHolder = new AbstractC1065704Et<C2172401A0g>(viewGroup) { // from class: X.1A0d
                public final FrameLayout LL;
                public final TuxTextView LLILLJJLI;
                public final TuxTextView LLILLL;
                public final SmartImageView LLILZ;
                public final TuxTextView LLILZIL;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(C954703oH.LIZ(viewGroup.getContext(), R.layout.ayx, viewGroup, false));
                    C01GW c01gw = C954703oH.LIZ;
                    this.LL = (FrameLayout) this.itemView.findViewById(R.id.vsz);
                    this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.vh2);
                    this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.vgy);
                    this.LLILZ = (SmartImageView) this.itemView.findViewById(R.id.vgw);
                    this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.jsh);
                }

                @Override // X.AbstractC1065704Et
                public final void I5(int i2, Object obj) {
                    int radio;
                    int iLJIJJ;
                    C2172401A0g c2172401A0g = (C2172401A0g) obj;
                    g gVar = c2172401A0g.LJI;
                    C2172431A0j c2172431A0j = c2172401A0g.LJII;
                    FrameLayout frameLayout = this.LL;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.setMarginEnd(gVar.LJJJJIZL());
                    C786410Ut5.a6(frameLayout, layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = this.LLILZ.getLayoutParams();
                    int iLLIFFJFJJ = gVar.LLIFFJFJJ();
                    if (gVar.LJJIJLIJ()) {
                        radio = (int) (iLLIFFJFJJ / c2172401A0g.LIZ.getRadio());
                    } else {
                        radio = iLLIFFJFJJ;
                    }
                    layoutParams2.width = iLLIFFJFJJ;
                    layoutParams2.height = radio;
                    C786410Ut5.G6(this.LLILZ, layoutParams2);
                    C1066100dqi c1066100dqi = new C1066100dqi();
                    c1066100dqi.LIZJ = "sku_detail";
                    c1066100dqi.LIZ(i2);
                    c1066100dqi.LIZJ(c2172401A0g.LIZ.toThumbFirstImageUrlModel());
                    C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                    Image image = c2172401A0g.LIZ;
                    c1326790kdB.getClass();
                    C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(image);
                    c1331670kl3LJ.LJJ = EnumC1338240kve.CENTER_CROP;
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LJ = gVar.LLJJ();
                    c1331670kl3LJ.LJJI = new C1331730kl9(c1331750klB);
                    c1331670kl3LJ.LJJIIZI(C1308910kAL.LJ(R.attr.bv, this.itemView.getContext()));
                    c1331670kl3LJ.LJJ(this.LLILZ);
                    c1331670kl3LJ.LJIIJ(new C463050IDv(c1066100dqi, 8));
                    this.LLILLJJLI.setText(c2172401A0g.LIZIZ);
                    if (c2172401A0g.LIZJ != null) {
                        C786410Ut5.LJLLLLLL(0, this.LLILLL);
                        this.LLILLL.setText(c2172401A0g.LIZJ);
                        C426750GoL.LJIIL(this.LL, Integer.valueOf(C2172431A0j.LIZIZ().LIZ), Integer.valueOf(C2172431A0j.LIZIZ().LIZIZ), Integer.valueOf(C2172431A0j.LIZIZ().LIZJ), Integer.valueOf(C2172431A0j.LIZIZ().LIZLLL), 16);
                        this.LLILLJJLI.setTuxFont(91);
                    } else {
                        C426750GoL.LJIIL(this.LL, Integer.valueOf(c2172431A0j.LIZ().LIZ), Integer.valueOf(c2172431A0j.LIZ().LIZIZ), Integer.valueOf(c2172431A0j.LIZ().LIZJ), Integer.valueOf(c2172431A0j.LIZ().LIZLLL), 16);
                        this.LLILLJJLI.setTuxFont(91);
                    }
                    if (c2172401A0g.LJ) {
                        if (c2172401A0g.LIZLLL) {
                            iLJIJJ = gVar.LJJ();
                        } else {
                            iLJIJJ = gVar.LJIIJJI();
                        }
                    } else if (c2172401A0g.LIZLLL) {
                        iLJIJJ = gVar.LJIJJLI();
                    } else {
                        iLJIJJ = gVar.LJIJJ();
                    }
                    this.LL.setBackgroundResource(iLJIJJ);
                    this.LLILLJJLI.getPaint().setFlags(0);
                    if (c2172401A0g.LJ) {
                        if (c2172401A0g.LIZLLL) {
                            Context context = this.itemView.getContext();
                            gVar.LJIIIZ();
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                            if (numLIZJ != null) {
                                int iIntValue = numLIZJ.intValue();
                                this.LLILLJJLI.setTextColor(iIntValue);
                                this.LLILLL.setTextColor(iIntValue);
                            }
                            TuxTextView tuxTextView = this.LLILLL;
                            c2172431A0j.getClass();
                            tuxTextView.setTuxFont(72);
                            C786410Ut5.u5(this.LLILZ, 1.0f);
                        } else {
                            Integer numLIZJ2 = C1308910kAL.LIZJ(gVar.LJFF(), this.itemView.getContext());
                            if (numLIZJ2 != null) {
                                int iIntValue2 = numLIZJ2.intValue();
                                this.LLILLJJLI.setTextColor(iIntValue2);
                                this.LLILLL.setTextColor(iIntValue2);
                            }
                            TuxTextView tuxTextView2 = this.LLILLL;
                            c2172431A0j.getClass();
                            tuxTextView2.setTuxFont(72);
                            C786410Ut5.u5(this.LLILZ, 0.5f);
                            if (gVar.LLIIL()) {
                                this.LLILLJJLI.getPaint().setFlags(16);
                            }
                        }
                    } else {
                        if (c2172401A0g.LIZLLL) {
                            Context context2 = this.itemView.getContext();
                            gVar.LJIL();
                            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context2);
                            if (numLIZJ3 != null) {
                                int iIntValue3 = numLIZJ3.intValue();
                                this.LLILLJJLI.setTextColor(iIntValue3);
                                this.LLILLL.setTextColor(iIntValue3);
                            }
                            C786410Ut5.u5(this.LLILZ, 1.0f);
                        } else {
                            Integer numLIZJ4 = C1308910kAL.LIZJ(gVar.LJI(), this.itemView.getContext());
                            if (numLIZJ4 != null) {
                                int iIntValue4 = numLIZJ4.intValue();
                                this.LLILLJJLI.setTextColor(iIntValue4);
                                this.LLILLL.setTextColor(iIntValue4);
                            }
                            C786410Ut5.u5(this.LLILZ, 0.5f);
                            if (gVar.LLIIL()) {
                                this.LLILLJJLI.getPaint().setFlags(16);
                            }
                        }
                        TuxTextView tuxTextView3 = this.LLILLL;
                        c2172431A0j.getClass();
                        tuxTextView3.setTuxFont(72);
                    }
                    C1749180vcS c1749180vcS = C1749180vcS.LIZ;
                    Context context3 = this.itemView.getContext();
                    TuxTextView tuxTextView4 = this.LLILZIL;
                    SalePropTag salePropTag = c2172401A0g.LJFF;
                    int paddingTop = this.LL.getPaddingTop();
                    int paddingRight = this.LL.getPaddingRight();
                    int iLJIIZILJ = gVar.LJIIZILJ();
                    int iLJIIJ = gVar.LJIIJ();
                    c1749180vcS.getClass();
                    C1749180vcS.LIZ(context3, tuxTextView4, salePropTag, paddingTop, paddingRight, iLJIIZILJ, iLJIIJ);
                    this.LLILLJJLI.getPaint().setAntiAlias(true);
                }
            };
        } else if (i == C2172341A0a.class.hashCode()) {
            viewHolder = new AbstractC1065704Et<C2172341A0a>(viewGroup) { // from class: X.1A0c
                public final FrameLayout LL;
                public final SmartImageView LLILLJJLI;
                public final TuxTextView LLILLL;
                public final TuxTextView LLILZ;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(C954703oH.LIZ(viewGroup.getContext(), R.layout.ayw, viewGroup, false));
                    C01GW c01gw = C954703oH.LIZ;
                    this.LL = (FrameLayout) this.itemView.findViewById(R.id.vgr);
                    this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.vgv);
                    this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.vh1);
                    this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.jsh);
                }

                @Override // X.AbstractC1065704Et
                public final void I5(int i2, Object obj) {
                    int iLJIJJ;
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    C2172341A0a c2172341A0a = (C2172341A0a) obj;
                    Context context = this.itemView.getContext();
                    g gVar = c2172341A0a.LJFF;
                    FrameLayout frameLayout = this.LL;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.setMarginEnd(gVar.LJJJJIZL());
                    C786410Ut5.a6(frameLayout, layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = this.LLILLJJLI.getLayoutParams();
                    int iLJLJJI = gVar.LJLJJI();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        marginLayoutParams.setMarginStart(iLJLJJI);
                        marginLayoutParams.topMargin = iLJLJJI;
                        marginLayoutParams.bottomMargin = iLJLJJI;
                    }
                    C786410Ut5.G6(this.LLILLJJLI, layoutParams2);
                    C1066100dqi c1066100dqi = new C1066100dqi();
                    c1066100dqi.LIZJ = "sku_detail";
                    c1066100dqi.LIZ(i2);
                    c1066100dqi.LIZJ(c2172341A0a.LIZ.toThumbFirstImageUrlModel());
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LJ = gVar.LLJJ();
                    c1331750klB.LIZJ = C960203pA.LIZ(R.attr.ng, context);
                    C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
                    C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                    Image image = c2172341A0a.LIZ;
                    c1326790kdB.getClass();
                    C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(image);
                    c1331670kl3LJ.LJJ = EnumC1338240kve.CENTER_CROP;
                    c1331670kl3LJ.LJJI = c1331730kl9;
                    c1331670kl3LJ.LJJIIZI(C1308910kAL.LJ(R.attr.bv, this.itemView.getContext()));
                    c1331670kl3LJ.LJJ(this.LLILLJJLI);
                    c1331670kl3LJ.LJIIJ(new C463050IDv(c1066100dqi, 6));
                    this.LLILLL.setText(c2172341A0a.LIZIZ);
                    if (c2172341A0a.LIZLLL) {
                        if (c2172341A0a.LIZJ) {
                            iLJIJJ = gVar.LJJ();
                        } else {
                            iLJIJJ = gVar.LJIIJJI();
                        }
                    } else if (c2172341A0a.LIZJ) {
                        iLJIJJ = gVar.LJIJJLI();
                    } else {
                        iLJIJJ = gVar.LJIJJ();
                    }
                    this.LL.setBackgroundResource(iLJIJJ);
                    this.LLILLL.getPaint().setFlags(0);
                    if (c2172341A0a.LIZLLL) {
                        if (c2172341A0a.LIZJ) {
                            Context context2 = this.itemView.getContext();
                            gVar.LJIIIZ();
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context2);
                            if (numLIZJ != null) {
                                this.LLILLL.setTextColor(numLIZJ.intValue());
                            }
                            C786410Ut5.u5(this.LLILLJJLI, 1.0f);
                        } else {
                            Integer numLIZJ2 = C1308910kAL.LIZJ(gVar.LJFF(), this.itemView.getContext());
                            if (numLIZJ2 != null) {
                                this.LLILLL.setTextColor(numLIZJ2.intValue());
                            }
                            C786410Ut5.u5(this.LLILLJJLI, 0.5f);
                            if (gVar.LLIIL()) {
                                this.LLILLL.getPaint().setFlags(16);
                            }
                        }
                    } else if (c2172341A0a.LIZJ) {
                        Context context3 = this.itemView.getContext();
                        gVar.LJIL();
                        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context3);
                        if (numLIZJ3 != null) {
                            this.LLILLL.setTextColor(numLIZJ3.intValue());
                        }
                        C786410Ut5.u5(this.LLILLJJLI, 1.0f);
                    } else {
                        Integer numLIZJ4 = C1308910kAL.LIZJ(gVar.LJI(), this.itemView.getContext());
                        if (numLIZJ4 != null) {
                            this.LLILLL.setTextColor(numLIZJ4.intValue());
                        }
                        C786410Ut5.u5(this.LLILLJJLI, 0.5f);
                        if (gVar.LLIIL()) {
                            this.LLILLL.getPaint().setFlags(16);
                        }
                    }
                    C1749180vcS c1749180vcS = C1749180vcS.LIZ;
                    Context context4 = this.itemView.getContext();
                    TuxTextView tuxTextView = this.LLILZ;
                    SalePropTag salePropTag = c2172341A0a.LJ;
                    int paddingTop = this.LL.getPaddingTop();
                    int paddingRight = this.LL.getPaddingRight();
                    int iLJIIZILJ = gVar.LJIIZILJ();
                    int iLJIIJ = gVar.LJIIJ();
                    c1749180vcS.getClass();
                    C1749180vcS.LIZ(context4, tuxTextView, salePropTag, paddingTop, paddingRight, iLJIIZILJ, iLJIIJ);
                    this.LLILLL.getPaint().setAntiAlias(true);
                }
            };
        } else if (i == C2172351A0b.class.hashCode()) {
            viewHolder = new AbstractC1065704Et<C2172351A0b>(viewGroup) { // from class: X.1A0f
                public final TuxTextView LL;
                public final TuxTextView LLILLJJLI;
                public final FrameLayout LLILLL;
                public final TuxTextView LLILZ;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(C954703oH.LIZ(viewGroup.getContext(), R.layout.azi, viewGroup, false));
                    C01GW c01gw = C954703oH.LIZ;
                    this.LL = (TuxTextView) this.itemView.findViewById(R.id.cid);
                    this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.cic);
                    this.LLILLL = (FrameLayout) this.itemView.findViewById(R.id.vsz);
                    this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.jsh);
                }

                @Override // X.AbstractC1065704Et
                public final void I5(int i2, Object obj) {
                    int iLJJIIJ;
                    C2172351A0b c2172351A0b = (C2172351A0b) obj;
                    g gVar = c2172351A0b.LJII;
                    C2172441A0k c2172441A0k = c2172351A0b.LJIIIIZZ;
                    this.itemView.getContext();
                    this.LL.setText(c2172351A0b.LIZ);
                    this.LL.setTuxFont(gVar.LLILII());
                    if (c2172351A0b.LIZIZ != null) {
                        C786410Ut5.LJLLLLLL(0, this.LLILLJJLI);
                        this.LLILLJJLI.setText(c2172351A0b.LIZIZ);
                        C426750GoL.LJIIL(this.LLILLL, Integer.valueOf(C2172441A0k.LIZIZ().LIZ), Integer.valueOf(C2172441A0k.LIZIZ().LIZIZ), Integer.valueOf(C2172441A0k.LIZIZ().LIZJ), Integer.valueOf(C2172441A0k.LIZIZ().LIZLLL), 16);
                        this.LL.setTuxFont(71);
                    } else {
                        C426750GoL.LJIIL(this.LLILLL, Integer.valueOf(c2172441A0k.LIZ().LIZ), Integer.valueOf(c2172441A0k.LIZ().LIZIZ), Integer.valueOf(c2172441A0k.LIZ().LIZJ), Integer.valueOf(c2172441A0k.LIZ().LIZLLL), 16);
                        this.LL.setTuxFont(71);
                    }
                    if (c2172351A0b.LIZLLL) {
                        if (c2172351A0b.LIZJ) {
                            iLJJIIJ = gVar.LJJLJ();
                        } else {
                            iLJJIIJ = gVar.LJLJL();
                        }
                    } else if (c2172351A0b.LIZJ) {
                        iLJJIIJ = gVar.LJJJZ();
                    } else {
                        iLJJIIJ = gVar.LJJIIJ();
                    }
                    this.LLILLL.setBackgroundResource(iLJJIIJ);
                    this.LL.getPaint().setFlags(0);
                    if (c2172351A0b.LIZLLL) {
                        if (c2172351A0b.LIZJ) {
                            Context context = this.itemView.getContext();
                            gVar.LJIIIZ();
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                            if (numLIZJ != null) {
                                int iIntValue = numLIZJ.intValue();
                                this.LL.setTextColor(iIntValue);
                                this.LLILLJJLI.setTextColor(iIntValue);
                            }
                            TuxTextView tuxTextView = this.LLILLJJLI;
                            c2172441A0k.getClass();
                            tuxTextView.setTuxFont(72);
                        } else {
                            Integer numLIZJ2 = C1308910kAL.LIZJ(gVar.LJFF(), this.itemView.getContext());
                            if (numLIZJ2 != null) {
                                int iIntValue2 = numLIZJ2.intValue();
                                this.LL.setTextColor(iIntValue2);
                                this.LLILLJJLI.setTextColor(iIntValue2);
                            }
                            if (gVar.LLIIL()) {
                                this.LL.getPaint().setFlags(16);
                            }
                            TuxTextView tuxTextView2 = this.LLILLJJLI;
                            c2172441A0k.getClass();
                            tuxTextView2.setTuxFont(71);
                        }
                    } else {
                        if (c2172351A0b.LIZJ) {
                            Context context2 = this.itemView.getContext();
                            gVar.LJIL();
                            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context2);
                            if (numLIZJ3 != null) {
                                int iIntValue3 = numLIZJ3.intValue();
                                this.LL.setTextColor(iIntValue3);
                                this.LLILLJJLI.setTextColor(iIntValue3);
                            }
                        } else {
                            Integer numLIZJ4 = C1308910kAL.LIZJ(gVar.LJI(), this.itemView.getContext());
                            if (numLIZJ4 != null) {
                                int iIntValue4 = numLIZJ4.intValue();
                                this.LL.setTextColor(iIntValue4);
                                this.LLILLJJLI.setTextColor(iIntValue4);
                            }
                            if (gVar.LLIIL()) {
                                this.LL.getPaint().setFlags(16);
                            }
                        }
                        TuxTextView tuxTextView3 = this.LLILLJJLI;
                        c2172441A0k.getClass();
                        tuxTextView3.setTuxFont(71);
                    }
                    int iLIZLLL = (C958103op.LIZLLL() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2);
                    if (iLIZLLL > 0) {
                        this.LL.setMaxWidth(iLIZLLL);
                    }
                    this.LLILLL.setMinimumWidth(0);
                    if (gVar.LJJLIIIJL() > 0) {
                        this.LLILLL.setMinimumWidth(gVar.LJJLIIIJL());
                        this.LLILLL.requestLayout();
                    }
                    if (gVar.LLIIIJ() > 0) {
                        this.LLILLL.setMinimumHeight(gVar.LLIIIJ());
                        this.LLILLL.requestLayout();
                    }
                    C1749180vcS c1749180vcS = C1749180vcS.LIZ;
                    Context context3 = this.itemView.getContext();
                    TuxTextView tuxTextView4 = this.LLILZ;
                    SalePropTag salePropTag = c2172351A0b.LJ;
                    int paddingTop = this.LLILLL.getPaddingTop();
                    int paddingRight = this.LLILLL.getPaddingRight();
                    int iLJIIZILJ = gVar.LJIIZILJ();
                    int iLJIIJ = gVar.LJIIJ();
                    c1749180vcS.getClass();
                    C1749180vcS.LIZ(context3, tuxTextView4, salePropTag, paddingTop, paddingRight, iLJIIZILJ, iLJIIJ);
                    this.LL.getPaint().setAntiAlias(true);
                }
            };
        } else if (i == C1064804Ek.class.hashCode()) {
            viewHolder = new AbstractC1065704Et<C1064804Ek>(viewGroup) { // from class: X.0GqM
                public final C427630Gpl LL;

                {
                    ViewGroup viewGroup2;
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    super(new FrameLayout(viewGroup.getContext()));
                    C786410Ut5.W5(this.itemView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
                    ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                    }
                    C427630Gpl c427630Gpl = new C427630Gpl(this.itemView.getContext());
                    this.LL = c427630Gpl;
                    View view = this.itemView;
                    if ((view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null) {
                        viewGroup2.addView(c427630Gpl);
                        viewGroup2.setClipChildren(false);
                    }
                }

                @Override // X.AbstractC1065704Et
                public final void I5(int i2, Object obj) {
                    C427630Gpl c427630Gpl = this.LL;
                    obj.getClass();
                    C428010GqN c428010GqN = new C428010GqN(null, null, null, i2, null, false, false, false);
                    c427630Gpl.getClass();
                    c427630Gpl.setUiData(c428010GqN);
                    C1066100dqi c1066100dqi = new C1066100dqi();
                    c1066100dqi.LIZJ = "sku_detail";
                    c1066100dqi.LIZ(i2);
                    c1066100dqi.LIZJ(null);
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(null);
                    c1331670kl3LJ.LJJI = c427630Gpl.LLILZIL;
                    c1331670kl3LJ.LJJ = EnumC1338240kve.CENTER_CROP;
                    c1331670kl3LJ.LIZLLL("SkcItemView");
                    C384050F3z c384050F3z = new C384050F3z();
                    Float fValueOf = Float.valueOf(4.0f);
                    c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(fValueOf));
                    c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(fValueOf));
                    c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(fValueOf));
                    c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(fValueOf));
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
                    c1331670kl3LJ.LJJIIZI(c384050F3z.LIZ(c427630Gpl.getContext()));
                    c1331670kl3LJ.LJJ(c427630Gpl.LL);
                    c1331670kl3LJ.LJIIJ(new C463040IDu(c1066100dqi, c427630Gpl, 3));
                    c427630Gpl.invalidate();
                    C428010GqN c428010GqNM28getUiData = c427630Gpl.m28getUiData();
                    if (c428010GqNM28getUiData != null) {
                        c427630Gpl.setUiData(new C428010GqN(c428010GqNM28getUiData.LIZ, c428010GqNM28getUiData.LIZIZ, c428010GqNM28getUiData.LIZJ, c428010GqNM28getUiData.LIZLLL, c428010GqNM28getUiData.LJ, c428010GqNM28getUiData.LJFF, false, c428010GqNM28getUiData.LJII));
                        C786410Ut5.LJLLLLLL(8, c427630Gpl.LLILLL);
                        if (c428010GqNM28getUiData.LJFF) {
                            c427630Gpl.setForeground(null);
                            return;
                        }
                        if (c427630Gpl.LLJIJIL == null) {
                            c427630Gpl.LLJIJIL = Bitmap.createBitmap(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), Bitmap.Config.ARGB_8888);
                        }
                        Bitmap bitmap = c427630Gpl.LLJIJIL;
                        if (bitmap == null) {
                            return;
                        }
                        Canvas canvas = new Canvas(bitmap);
                        canvas.drawPath(c427630Gpl.LLJ, c427630Gpl.LLILZLL);
                        canvas.drawPath(c427630Gpl.LLJI, c427630Gpl.LLILZLL);
                        canvas.drawPath(c427630Gpl.LLIZLLLIL, c427630Gpl.LLIZ);
                        c427630Gpl.setForeground(new BitmapDrawable(bitmap));
                    }
                }
            };
        } else if (i == C2172411A0h.class.hashCode()) {
            viewHolder = new AbstractC1065704Et<C2172411A0h>(viewGroup) { // from class: X.1A0e
                public final FrameLayout LL;
                public final SmartImageView LLILLJJLI;
                public final TuxTextView LLILLL;
                public final C0GRZ LLILZ;
                public final TuxTextView LLILZIL;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(C954703oH.LIZ(viewGroup.getContext(), R.layout.ayu, viewGroup, false));
                    C01GW c01gw = C954703oH.LIZ;
                    this.LL = (FrameLayout) this.itemView.findViewById(R.id.q7e);
                    this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.q7t);
                    this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.q83);
                    this.LLILZ = (C0GRZ) this.itemView.findViewById(R.id.q7l);
                    this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.jsh);
                }

                @Override // X.AbstractC1065704Et
                public final void I5(int i2, Object obj) {
                    int iLJIJJ;
                    C2172411A0h c2172411A0h = (C2172411A0h) obj;
                    g gVar = c2172411A0h.LJII;
                    C2172421A0i c2172421A0i = c2172411A0h.LJIIIIZZ;
                    FrameLayout frameLayout = this.LL;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.LLIFFJFJJ(), gVar.LLIFFJFJJ());
                    layoutParams.setMarginEnd(gVar.LJJJJIZL());
                    C786410Ut5.a6(frameLayout, layoutParams);
                    C1066100dqi c1066100dqi = new C1066100dqi();
                    c1066100dqi.LIZJ = "sku_detail";
                    c1066100dqi.LIZ(i2);
                    c1066100dqi.LIZJ(c2172411A0h.LIZ.toThumbFirstImageUrlModel());
                    ViewGroup.LayoutParams layoutParams2 = this.LLILLJJLI.getLayoutParams();
                    layoutParams2.width = gVar.LLJJJIL();
                    layoutParams2.height = gVar.LLJJJIL();
                    C786410Ut5.G6(this.LLILLJJLI, layoutParams2);
                    C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                    Image image = c2172411A0h.LIZ;
                    c1326790kdB.getClass();
                    C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(image);
                    c1331670kl3LJ.LJJ = EnumC1338240kve.CENTER_CROP;
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LJ = gVar.LLJJ();
                    c1331670kl3LJ.LJJI = new C1331730kl9(c1331750klB);
                    c1331670kl3LJ.LJJIIZI(C1308910kAL.LJ(R.attr.bv, this.itemView.getContext()));
                    c1331670kl3LJ.LJJ(this.LLILLJJLI);
                    c1331670kl3LJ.LJIIJ(new C463050IDv(c1066100dqi, 7));
                    if (c2172411A0h.LIZIZ != null) {
                        C786410Ut5.LJLLLLLL(0, this.LLILLL);
                        this.LLILLL.setText(c2172411A0h.LIZIZ);
                        C426750GoL.LJIIL(this.LL, Integer.valueOf(C2172421A0i.LIZIZ().LIZ), Integer.valueOf(C2172421A0i.LIZIZ().LIZIZ), Integer.valueOf(C2172421A0i.LIZIZ().LIZJ), Integer.valueOf(C2172421A0i.LIZIZ().LIZLLL), 16);
                    } else {
                        C426750GoL.LJIIL(this.LL, Integer.valueOf(c2172421A0i.LIZ().LIZ), Integer.valueOf(c2172421A0i.LIZ().LIZIZ), Integer.valueOf(c2172421A0i.LIZ().LIZJ), Integer.valueOf(c2172421A0i.LIZ().LIZLLL), 16);
                    }
                    if (c2172411A0h.LIZLLL) {
                        if (c2172411A0h.LIZJ) {
                            iLJIJJ = gVar.LJJ();
                        } else {
                            iLJIJJ = gVar.LJIIJJI();
                        }
                    } else if (c2172411A0h.LIZJ) {
                        iLJIJJ = gVar.LJIJJLI();
                    } else {
                        iLJIJJ = gVar.LJIJJ();
                    }
                    this.LL.setBackgroundResource(iLJIJJ);
                    if (c2172411A0h.LIZLLL) {
                        if (c2172411A0h.LIZJ) {
                            TuxTextView tuxTextView = this.LLILLL;
                            gVar.LJIIIZ();
                            tuxTextView.setTextColorRes(R.attr.a1h);
                            TuxTextView tuxTextView2 = this.LLILLL;
                            c2172421A0i.getClass();
                            tuxTextView2.setTuxFont(72);
                        } else {
                            this.LLILLL.setTextColorRes(gVar.LJFF());
                            TuxTextView tuxTextView3 = this.LLILLL;
                            c2172421A0i.getClass();
                            tuxTextView3.setTuxFont(71);
                        }
                    } else {
                        if (c2172411A0h.LIZJ) {
                            TuxTextView tuxTextView4 = this.LLILLL;
                            gVar.LJIL();
                            tuxTextView4.setTextColorRes(R.attr.a1h);
                        } else {
                            this.LLILLL.setTextColorRes(gVar.LJI());
                        }
                        TuxTextView tuxTextView5 = this.LLILLL;
                        c2172421A0i.getClass();
                        tuxTextView5.setTuxFont(71);
                    }
                    if (c2172411A0h.LIZJ) {
                        C786410Ut5.u5(this.LLILLJJLI, 1.0f);
                        C786410Ut5.LJLLLLLL(8, this.LLILZ);
                        gVar.LJJLIL();
                    } else {
                        SmartImageView smartImageView = this.LLILLJJLI;
                        gVar.LJJJJJ();
                        C786410Ut5.u5(smartImageView, 0.5f);
                        C786410Ut5.LJLLLLLL(0, this.LLILZ);
                        this.LLILZ.setLineOffset(C0H9H.LIZ(3));
                        this.LLILZ.setLineWidth(gVar.LLJ());
                    }
                    C1749180vcS c1749180vcS = C1749180vcS.LIZ;
                    Context context = this.itemView.getContext();
                    TuxTextView tuxTextView6 = this.LLILZIL;
                    SalePropTag salePropTag = c2172411A0h.LJ;
                    int paddingTop = this.LL.getPaddingTop();
                    int paddingRight = this.LL.getPaddingRight();
                    int iLJIIZILJ = gVar.LJIIZILJ();
                    int iLJIIJ = gVar.LJIIJ();
                    c1749180vcS.getClass();
                    C1749180vcS.LIZ(context, tuxTextView6, salePropTag, paddingTop, paddingRight, iLJIIZILJ, iLJIIJ);
                    this.itemView.setContentDescription(c2172411A0h.LJI);
                }
            };
        } else {
            viewHolder = new AbstractC1065704Et<C2172351A0b>(viewGroup) { // from class: X.1A0f
                public final TuxTextView LL;
                public final TuxTextView LLILLJJLI;
                public final FrameLayout LLILLL;
                public final TuxTextView LLILZ;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(C954703oH.LIZ(viewGroup.getContext(), R.layout.azi, viewGroup, false));
                    C01GW c01gw = C954703oH.LIZ;
                    this.LL = (TuxTextView) this.itemView.findViewById(R.id.cid);
                    this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.cic);
                    this.LLILLL = (FrameLayout) this.itemView.findViewById(R.id.vsz);
                    this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.jsh);
                }

                @Override // X.AbstractC1065704Et
                public final void I5(int i2, Object obj) {
                    int iLJJIIJ;
                    C2172351A0b c2172351A0b = (C2172351A0b) obj;
                    g gVar = c2172351A0b.LJII;
                    C2172441A0k c2172441A0k = c2172351A0b.LJIIIIZZ;
                    this.itemView.getContext();
                    this.LL.setText(c2172351A0b.LIZ);
                    this.LL.setTuxFont(gVar.LLILII());
                    if (c2172351A0b.LIZIZ != null) {
                        C786410Ut5.LJLLLLLL(0, this.LLILLJJLI);
                        this.LLILLJJLI.setText(c2172351A0b.LIZIZ);
                        C426750GoL.LJIIL(this.LLILLL, Integer.valueOf(C2172441A0k.LIZIZ().LIZ), Integer.valueOf(C2172441A0k.LIZIZ().LIZIZ), Integer.valueOf(C2172441A0k.LIZIZ().LIZJ), Integer.valueOf(C2172441A0k.LIZIZ().LIZLLL), 16);
                        this.LL.setTuxFont(71);
                    } else {
                        C426750GoL.LJIIL(this.LLILLL, Integer.valueOf(c2172441A0k.LIZ().LIZ), Integer.valueOf(c2172441A0k.LIZ().LIZIZ), Integer.valueOf(c2172441A0k.LIZ().LIZJ), Integer.valueOf(c2172441A0k.LIZ().LIZLLL), 16);
                        this.LL.setTuxFont(71);
                    }
                    if (c2172351A0b.LIZLLL) {
                        if (c2172351A0b.LIZJ) {
                            iLJJIIJ = gVar.LJJLJ();
                        } else {
                            iLJJIIJ = gVar.LJLJL();
                        }
                    } else if (c2172351A0b.LIZJ) {
                        iLJJIIJ = gVar.LJJJZ();
                    } else {
                        iLJJIIJ = gVar.LJJIIJ();
                    }
                    this.LLILLL.setBackgroundResource(iLJJIIJ);
                    this.LL.getPaint().setFlags(0);
                    if (c2172351A0b.LIZLLL) {
                        if (c2172351A0b.LIZJ) {
                            Context context = this.itemView.getContext();
                            gVar.LJIIIZ();
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                            if (numLIZJ != null) {
                                int iIntValue = numLIZJ.intValue();
                                this.LL.setTextColor(iIntValue);
                                this.LLILLJJLI.setTextColor(iIntValue);
                            }
                            TuxTextView tuxTextView = this.LLILLJJLI;
                            c2172441A0k.getClass();
                            tuxTextView.setTuxFont(72);
                        } else {
                            Integer numLIZJ2 = C1308910kAL.LIZJ(gVar.LJFF(), this.itemView.getContext());
                            if (numLIZJ2 != null) {
                                int iIntValue2 = numLIZJ2.intValue();
                                this.LL.setTextColor(iIntValue2);
                                this.LLILLJJLI.setTextColor(iIntValue2);
                            }
                            if (gVar.LLIIL()) {
                                this.LL.getPaint().setFlags(16);
                            }
                            TuxTextView tuxTextView2 = this.LLILLJJLI;
                            c2172441A0k.getClass();
                            tuxTextView2.setTuxFont(71);
                        }
                    } else {
                        if (c2172351A0b.LIZJ) {
                            Context context2 = this.itemView.getContext();
                            gVar.LJIL();
                            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context2);
                            if (numLIZJ3 != null) {
                                int iIntValue3 = numLIZJ3.intValue();
                                this.LL.setTextColor(iIntValue3);
                                this.LLILLJJLI.setTextColor(iIntValue3);
                            }
                        } else {
                            Integer numLIZJ4 = C1308910kAL.LIZJ(gVar.LJI(), this.itemView.getContext());
                            if (numLIZJ4 != null) {
                                int iIntValue4 = numLIZJ4.intValue();
                                this.LL.setTextColor(iIntValue4);
                                this.LLILLJJLI.setTextColor(iIntValue4);
                            }
                            if (gVar.LLIIL()) {
                                this.LL.getPaint().setFlags(16);
                            }
                        }
                        TuxTextView tuxTextView3 = this.LLILLJJLI;
                        c2172441A0k.getClass();
                        tuxTextView3.setTuxFont(71);
                    }
                    int iLIZLLL = (C958103op.LIZLLL() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2);
                    if (iLIZLLL > 0) {
                        this.LL.setMaxWidth(iLIZLLL);
                    }
                    this.LLILLL.setMinimumWidth(0);
                    if (gVar.LJJLIIIJL() > 0) {
                        this.LLILLL.setMinimumWidth(gVar.LJJLIIIJL());
                        this.LLILLL.requestLayout();
                    }
                    if (gVar.LLIIIJ() > 0) {
                        this.LLILLL.setMinimumHeight(gVar.LLIIIJ());
                        this.LLILLL.requestLayout();
                    }
                    C1749180vcS c1749180vcS = C1749180vcS.LIZ;
                    Context context3 = this.itemView.getContext();
                    TuxTextView tuxTextView4 = this.LLILZ;
                    SalePropTag salePropTag = c2172351A0b.LJ;
                    int paddingTop = this.LLILLL.getPaddingTop();
                    int paddingRight = this.LLILLL.getPaddingRight();
                    int iLJIIZILJ = gVar.LJIIZILJ();
                    int iLJIIJ = gVar.LJIIJ();
                    c1749180vcS.getClass();
                    C1749180vcS.LIZ(context3, tuxTextView4, salePropTag, paddingTop, paddingRight, iLJIIZILJ, iLJIIJ);
                    this.LL.getPaint().setAntiAlias(true);
                }
            };
        }
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }
}
