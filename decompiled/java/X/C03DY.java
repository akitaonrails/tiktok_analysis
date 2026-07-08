package X;

import Y.AsS0S0102000_1;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import g1c.AjS60S0100000_1;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03DY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03DY extends AbstractC7925037r {
    public final Boolean LLILZIL;
    public final Context LLILZLL;
    public final OrderSubmitAssemViewModel LLIZ;
    public RecyclerView LLIZLLLIL;
    public TuxTextView LLJ;
    public SmartImageView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public View LLJILLL;
    public C039W LLJJ;
    public final C956303oX LLJJI;

    public final View getUsOspUserTrustLineFromXml() {
        View view = this.LLJILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.us_osp_user_trust_line);
        this.LLJILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getUsOspUserTrustPanelSubTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_osp_user_trust_panel_sub_title);
            this.LLJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getUsOspUserTrustPanelSuffixIconXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_osp_user_trust_panel_suffix_icon);
            this.LLJI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getUsOspUserTrustPanelTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_osp_user_trust_panel_title);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getUsOspUserTrustPanelViewAllFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_osp_user_trust_panel_view_all);
            this.LLJILJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getUsOspUserTrustPanelViewIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_osp_user_trust_panel_view_icon);
            this.LLJILJILJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final RecyclerView getUsOspUserTrustRecyclerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_osp_user_trust_recycler);
            this.LLIZLLLIL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final void setUsOspUserTrustLineFromXml(View view) {
        this.LLJILLL = view;
    }

    public final void setUsOspUserTrustPanelSubTitleFromXml(TuxTextView tuxTextView) {
        this.LLJIJIL = tuxTextView;
    }

    public final void setUsOspUserTrustPanelSuffixIconXml(SmartImageView smartImageView) {
        this.LLJI = smartImageView;
    }

    public final void setUsOspUserTrustPanelTitleFromXml(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    public final void setUsOspUserTrustPanelViewAllFromXml(TuxTextView tuxTextView) {
        this.LLJILJIL = tuxTextView;
    }

    public final void setUsOspUserTrustPanelViewIconFromXml(TuxIconView tuxIconView) {
        this.LLJILJILJ = tuxIconView;
    }

    public final void setUsOspUserTrustRecyclerFromXml(RecyclerView recyclerView) {
        this.LLIZLLLIL = recyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.039W] */
    public C03DY(ExposeUserRightPanel exposeUserRightPanel, String str, BillStarlingText billStarlingText, Boolean bool, HashMap map, Context context, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        final List<ExposeUserRight> list;
        String str2;
        Image icon;
        C03IT imageUrlModel;
        super(exposeUserRightPanel, str, map, context, null, 0);
        this.LLILZIL = bool;
        this.LLILZLL = context;
        this.LLIZ = orderSubmitAssemViewModel;
        C956303oX c956303oX = new C956303oX(context, C0H9H.LIZIZ(12), C0H9H.LIZIZ(10), getClickListener$ecommerce_transaction_release());
        this.LLJJI = c956303oX;
        C03XA c03xa = C03XA.LIZ;
        Context context2 = getContext();
        c03xa.getClass();
        C03XA.LIZJ(context2, R.layout.apz, this, true);
        if (exposeUserRightPanel != null && (list = exposeUserRightPanel.exposeUserRights) != null) {
            this.LLJJ = new AbstractC21673619ry<C039X>(list) { // from class: X.039W
                public final List<ExposeUserRight> LL;

                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return this.LL.size();
                }

                {
                    this.LL = list;
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    C03C0 c03c0;
                    Image imageRequireImage;
                    ExposeUserRight exposeUserRight = (ExposeUserRight) C7727030b.LIZ(i, this.LL);
                    if (exposeUserRight != null) {
                        View view = viewHolder.itemView;
                        if ((view instanceof C03C0) && (c03c0 = (C03C0) view) != null) {
                            C03DY c03dy = this.LLILLJJLI;
                            if (Intrinsics.LJFF(c03dy.LLILZIL, Boolean.TRUE)) {
                                c03c0.getUserRightItemTextFromXml().setTuxFont(81);
                            }
                            C0H1U.LJIIL(c03c0.getUserRightItemTextFromXml(), exposeUserRight.name, true);
                            Icon icon2 = exposeUserRight.icon;
                            if (icon2 != null && (imageRequireImage = icon2.requireImage(c03c0.getContext())) != null) {
                                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                                C03IT thumbFirstImageUrlModel = imageRequireImage.toThumbFirstImageUrlModel();
                                c1326790kdB.getClass();
                                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
                                c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.c7, c03c0.getContext()));
                                c1331670kl3LIZLLL.LJJI(c03c0.getUserRightIconFromXml());
                                C786410Ut5.h3(c1331670kl3LIZLLL);
                            }
                            C1748720vbi.LJFF(c03c0, new C049X(), new AwS545S0100000_1(exposeUserRight, 1672), new AwS580S0100000_1(exposeUserRight, 802));
                            C786410Ut5.I7(new AjS20S0300000_1(c03dy, exposeUserRight, c03c0, 42), c03c0);
                        }
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    final C03C0 c03c0 = new C03C0(viewGroup.getContext());
                    RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(c03c0) { // from class: X.039X
                    };
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
                                stringBuffer.append(C039X.class.getName());
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
                    C20612085q.LIZ = C039X.class.getName();
                    return viewHolder;
                }
            };
            getUsOspUserTrustRecyclerFromXml().setLayoutManager(new LinearLayoutManager(context, 0, false));
            getUsOspUserTrustRecyclerFromXml().addItemDecoration(c956303oX);
            getUsOspUserTrustRecyclerFromXml().setAdapter(this.LLJJ);
            Icon icon2 = exposeUserRightPanel.icon;
            if (icon2 != null) {
                if (C960203pA.LIZIZ(getContext())) {
                    icon = icon2.getIconDark();
                } else {
                    icon = icon2.getIcon();
                }
                if (icon != null && (imageUrlModel = icon.toImageUrlModel()) != null) {
                    C12ES.LJIILL(0, getUsOspUserTrustPanelSuffixIconXml());
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
                    c1331670kl3LIZLLL.LJJ(getUsOspUserTrustPanelSuffixIconXml());
                    C786410Ut5.h3(c1331670kl3LIZLLL);
                }
                String strLIZIZ = exposeUserRightPanel.title;
                TuxTextView usOspUserTrustPanelTitleFromXml = getUsOspUserTrustPanelTitleFromXml();
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(" · ");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                C0H1U.LJIIL(usOspUserTrustPanelTitleFromXml, strLIZIZ, true);
            } else {
                C0H1U.LIZIZ(getUsOspUserTrustPanelSuffixIconXml());
                C0H1U.LJIIL(getUsOspUserTrustPanelTitleFromXml(), exposeUserRightPanel.title, true);
            }
            C0H1U.LJIIL(getUsOspUserTrustPanelSubTitleFromXml(), exposeUserRightPanel.description, true);
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                TuxIconView usOspUserTrustPanelViewIconFromXml = getUsOspUserTrustPanelViewIconFromXml();
                C12ES.LJIILL(0, usOspUserTrustPanelViewIconFromXml);
                C786410Ut5.I7(new AjS60S0100000_1(this, 119), usOspUserTrustPanelViewIconFromXml);
                C0H1U.LIZIZ(getUsOspUserTrustPanelViewAllFromXml());
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, getContext());
                if (numLIZJ != null) {
                    getUsOspUserTrustLineFromXml().setBackgroundColor(numLIZJ.intValue());
                }
            } else {
                C0H1U.LIZIZ(getUsOspUserTrustPanelViewIconFromXml());
                TuxTextView usOspUserTrustPanelViewAllFromXml = getUsOspUserTrustPanelViewAllFromXml();
                if (billStarlingText != null) {
                    str2 = billStarlingText.text;
                } else {
                    str2 = null;
                }
                C0H1U.LJIIL(usOspUserTrustPanelViewAllFromXml, str2, true);
                C786410Ut5.I7(new AjS60S0100000_1(this, 118), getUsOspUserTrustPanelViewAllFromXml());
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a01, getContext());
                if (numLIZJ2 != null) {
                    getUsOspUserTrustLineFromXml().setBackgroundColor(numLIZJ2.intValue());
                }
            }
            if (Intrinsics.LJFF(orderSubmitAssemViewModel.n, "one_step_checkout")) {
                View usOspUserTrustLineFromXml = getUsOspUserTrustLineFromXml();
                if (usOspUserTrustLineFromXml != null) {
                    C03DZ.LIZIZ(usOspUserTrustLineFromXml);
                }
            } else {
                View usOspUserTrustLineFromXml2 = getUsOspUserTrustLineFromXml();
                if (usOspUserTrustLineFromXml2 != null) {
                    C12ES.LJIILL(0, usOspUserTrustLineFromXml2);
                }
            }
            getUsOspUserTrustRecyclerFromXml().addOnItemTouchListener(new InterfaceC21676019sM() { // from class: X.03oW
                public float LL;
                public float LLILLJJLI;
                public final int LLILLL;

                @Override // X.InterfaceC21676019sM
                public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
                }

                @Override // X.InterfaceC21676019sM
                public final void LJIIZILJ(boolean z) {
                }

                {
                    this.LLILLL = ViewConfiguration.get(this.LLILZ.LLILZLL).getScaledTouchSlop();
                }

                @Override // X.InterfaceC21676019sM
                public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        this.LL = motionEvent.getX();
                        this.LLILLJJLI = motionEvent.getY();
                    }
                    if (motionEvent.getAction() == 1) {
                        float fAbs = Math.abs(motionEvent.getX() - this.LL);
                        float fAbs2 = Math.abs(motionEvent.getY() - this.LLILLJJLI);
                        int i = this.LLILLL;
                        if (fAbs <= i && fAbs2 <= i) {
                            C956303oX c956303oX2 = this.LLILZ.LLJJI;
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            c956303oX2.getClass();
                            int childCount = recyclerView.getChildCount() - 1;
                            for (int i2 = 0; i2 < childCount; i2++) {
                                View childAt = recyclerView.getChildAt(i2);
                                int right = childAt.getRight();
                                float strokeWidth = c956303oX2.LLILLL + right + c956303oX2.LLILZLL.getStrokeWidth() + c956303oX2.LLILLL;
                                int top = childAt.getTop() + c956303oX2.LLILZ;
                                int bottom = childAt.getBottom() - c956303oX2.LLILZ;
                                if (right <= x && x <= strokeWidth) {
                                    float f = top;
                                    if (y <= bottom && f <= y) {
                                        Function1<String, Unit> function1 = c956303oX2.LLILZIL;
                                        if (function1 != null) {
                                            function1.invoke("other");
                                        }
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
            });
            getUsOspUserTrustRecyclerFromXml().addOnScrollListener(new AsS0S0102000_1(this, 2));
        }
    }
}
