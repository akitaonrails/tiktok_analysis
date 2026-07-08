package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.IconLabelGroupLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.IconLabelHorizontalCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.IconLabelItem;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS68S0100000_22;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0n6N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421770n6N {
    public static final /* synthetic */ int LIZ = 0;

    public static AbstractC1421780n6O LIZ(final Context context, IconLabelGroupLayout iconLabelGroupLayout, InterfaceC1421750n6L interfaceC1421750n6L) {
        AbstractC1421780n6O abstractC1421780n6O;
        if (iconLabelGroupLayout instanceof IconLabelGroupLayout.Horizontal) {
            abstractC1421780n6O = new AbstractC1421780n6O(context) { // from class: X.0n6J
                public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
                public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                public static final int LLIZLLLIL = R.attr.a02;
                public final TuxTextView LLILLJJLI;
                public final ViewOnAttachStateChangeListenerC20604515jv LLILLL;
                public final View LLILZ;
                public boolean LLILZIL;

                {
                    super(context, null);
                    C954703oH.LIZ(context, R.layout.asb, this, true);
                    setOrientation(1);
                    this.LLILLJJLI = (TuxTextView) findViewById(R.id.ehr);
                    findViewById(R.id.eho);
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) findViewById(R.id.ehq);
                    this.LLILLL = viewOnAttachStateChangeListenerC20604515jv;
                    this.LLILZ = findViewById(R.id.ehl);
                    if (viewOnAttachStateChangeListenerC20604515jv != null) {
                        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
                        C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
                        if (state != null) {
                            state.LIZLLL = C0Q4Y.BUFFER;
                        }
                        if (viewOnAttachStateChangeListenerC20604515jv != null) {
                            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(IconLabelHorizontalCell.class);
                            viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
                        }
                    }
                    C786410Ut5.I7(new AjS68S0100000_22(this, 3), this);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
                @Override // X.AbstractC1421780n6O, X.InterfaceC1421820n6S
                public void setData(IconLabelGroupLayout iconLabelGroupLayout2) {
                    IconLabelGroupLayout.Horizontal horizontal;
                    C20600815jK<InterfaceC1891350zJl> state;
                    ?? arrayList;
                    if ((iconLabelGroupLayout2 instanceof IconLabelGroupLayout.Horizontal) && (horizontal = (IconLabelGroupLayout.Horizontal) iconLabelGroupLayout2) != null) {
                        TuxTextView tuxTextView = this.LLILLJJLI;
                        if (tuxTextView != null) {
                            C03C8.LIZJ(tuxTextView, horizontal.title, "pdp_icon_label_horizontal_view", null);
                        }
                        if (!this.LLILZIL) {
                            this.LLILZIL = true;
                            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILLL;
                            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                                viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR(LLILZLL, LLIZ, C1308910kAL.LIZJ(LLIZLLLIL, viewOnAttachStateChangeListenerC20604515jv.getContext())) { // from class: X.03oa
                                    public final int LL;
                                    public final int LLILLJJLI;
                                    public final Integer LLILLL;
                                    public final int LLILZ;
                                    public final Paint LLILZIL;

                                    {
                                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                        this.LL = i;
                                        this.LLILLJJLI = i;
                                        this.LLILLL = num;
                                        this.LLILZ = iLIZIZ;
                                        Paint paint = new Paint();
                                        paint.setStyle(Paint.Style.FILL);
                                        this.LLILZIL = paint;
                                    }

                                    @Override // X.C0DXR
                                    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams;
                                        Integer num = this.LLILLL;
                                        if (num != null) {
                                            this.LLILZIL.setColor(num.intValue());
                                        }
                                        int childCount = recyclerView.getChildCount() - 1;
                                        for (int i = 0; i < childCount; i++) {
                                            View childAt = recyclerView.getChildAt(i);
                                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                            if ((layoutParams instanceof RecyclerView.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                                canvas.drawRect(childAt.getRight() + marginLayoutParams.rightMargin + this.LLILZ, childAt.getTop() + this.LLILLJJLI, this.LL + r7, childAt.getBottom() - this.LLILLJJLI, this.LLILZIL);
                                            }
                                        }
                                    }

                                    @Override // X.C0DXR
                                    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                                        AbstractC21673619ry adapter = recyclerView.getAdapter();
                                        if (adapter != null) {
                                            int itemCount = adapter.getItemCount();
                                            if (childAdapterPosition != -1 && childAdapterPosition != itemCount - 1) {
                                                rect.right = this.LL + (this.LLILZ * 2);
                                            }
                                        }
                                    }
                                });
                                viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new C10313041n(new AwS601S0100000_22(this, 56)));
                            }
                        }
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLILLL;
                        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                            List<IconLabelItem> list = horizontal.items;
                            if (list != null) {
                                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                                for (IconLabelItem iconLabelItem : list) {
                                    iconLabelItem.onButtonShow = new AwS601S0100000_22(this, 57);
                                    iconLabelItem.onButtonClick = new AwS601S0100000_22(this, 58);
                                    iconLabelItem.maxWidthRules = horizontal.maxWidthRules;
                                    iconLabelItem.maxDisplayLines = Integer.valueOf(horizontal.maxDisplayLines);
                                    arrayList.add(iconLabelItem);
                                }
                            } else {
                                arrayList = C13BV.INSTANCE;
                            }
                            state.LJIILL(arrayList, null);
                        }
                        View view = this.LLILZ;
                        if (view != null) {
                            C786410Ut5.I7(new AjS68S0100000_22(this, 1), view);
                        }
                        C1421670n6D.LIZIZ(this, new AwS566S0100000_22(horizontal, 76), new AwS601S0100000_22(this, 59));
                    }
                }
            };
        } else if (iconLabelGroupLayout instanceof IconLabelGroupLayout.HorizontalGrid) {
            abstractC1421780n6O = new AbstractC1421780n6O(context) { // from class: X.0n6Q
                {
                    super(context, null);
                    C954703oH.LIZ(context, R.layout.asa, this, true);
                    setOrientation(0);
                    setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                    C786410Ut5.I7(new AjS68S0100000_22(this, 2), this);
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x01fc  */
                /* JADX WARN: Type inference failed for: r6v0 */
                /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r6v5 */
                @Override // X.AbstractC1421780n6O, X.InterfaceC1421820n6S
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void setData(com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.IconLabelGroupLayout r25) {
                    /*
                        Method dump skipped, instruction units count: 516
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1421800n6Q.setData(com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.IconLabelGroupLayout):void");
                }
            };
        } else if (iconLabelGroupLayout instanceof IconLabelGroupLayout.Vertical) {
            abstractC1421780n6O = new AbstractC1421780n6O(context) { // from class: X.0n6M
                public final TuxTextView LLILLJJLI;
                public final C426160GnO LLILLL;
                public final LinkedList<View> LLILZ;

                {
                    super(context, null);
                    this.LLILZ = new LinkedList<>();
                    C954703oH.LIZ(context, R.layout.asd, this, true);
                    setOrientation(1);
                    this.LLILLJJLI = (TuxTextView) findViewById(R.id.ehx);
                    findViewById(R.id.ehs);
                    this.LLILLL = (C426160GnO) findViewById(R.id.ehu);
                    C786410Ut5.I7(new AjS68S0100000_22(this, 4), this);
                }

                @Override // X.AbstractC1421780n6O, X.InterfaceC1421820n6S
                public void setData(IconLabelGroupLayout iconLabelGroupLayout2) {
                    IconLabelGroupLayout.Vertical vertical;
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    Image icon;
                    if ((iconLabelGroupLayout2 instanceof IconLabelGroupLayout.Vertical) && (vertical = (IconLabelGroupLayout.Vertical) iconLabelGroupLayout2) != null) {
                        TuxTextView tuxTextView = this.LLILLJJLI;
                        if (tuxTextView != null) {
                            C03C8.LIZJ(tuxTextView, vertical.title, "pdp_icon_label_vertical_view", null);
                        }
                        List<IconLabelItem> list = vertical.items;
                        int i = vertical.maxDisplayLines;
                        C426160GnO c426160GnO = this.LLILLL;
                        if (c426160GnO != null) {
                            LinkedList<View> linkedList = this.LLILZ;
                            while (c426160GnO.getChildCount() > 0) {
                                View childAt = c426160GnO.getChildAt(0);
                                C786410Ut5.LJJJLZIJ(childAt, c426160GnO);
                                if (childAt instanceof View) {
                                    linkedList.add(childAt);
                                }
                            }
                        }
                        C426160GnO c426160GnO2 = this.LLILLL;
                        if (c426160GnO2 != null) {
                            c426160GnO2.setMaxTagLines(i);
                            if (list != null) {
                                for (final IconLabelItem iconLabelItem : list) {
                                    C426160GnO c426160GnO3 = this.LLILLL;
                                    View viewTd = (View) C19719612Di.LJJIIZI(this.LLILZ);
                                    if (viewTd == null) {
                                        viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.asc, c426160GnO3, false);
                                    }
                                    ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
                                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                                        marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                    }
                                    marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                                    C786410Ut5.W5(viewTd, marginLayoutParams);
                                    TuxTextView tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.ehw);
                                    SmartImageView smartImageView = (SmartImageView) viewTd.findViewById(R.id.ehv);
                                    Icon icon2 = iconLabelItem.icon;
                                    if (icon2 != null) {
                                        C786410Ut5.LLFF(0, smartImageView);
                                        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                                        if (C1744700vVE.LJ(getContext(), null)) {
                                            icon = icon2.getIconDark();
                                        } else {
                                            icon = icon2.getIcon();
                                        }
                                        c1326790kdB.getClass();
                                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon);
                                        c1331670kl3LIZLLL.LJJ(smartImageView);
                                        C786410Ut5.h3(c1331670kl3LIZLLL);
                                    } else {
                                        C786410Ut5.LLFF(8, smartImageView);
                                    }
                                    ECRichText eCRichText = iconLabelItem.description;
                                    if (eCRichText != null) {
                                        C786410Ut5.LLLLZLL(tuxTextView2, 0);
                                        C03C8.LIZJ(tuxTextView2, eCRichText, "pdp_icon_label_vertical_view", null);
                                    } else {
                                        C786410Ut5.LLLLZLL(tuxTextView2, 8);
                                    }
                                    C1421670n6D.LIZIZ(viewTd, new AwS566S0100000_22(iconLabelItem, 891), new AwS388S0200000_22(this, iconLabelItem, 213));
                                    C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0n6P
                                        @Override // X.AbstractViewOnClickListenerC420730Ged
                                        public final void LIZ(View view) {
                                            InterfaceC1421750n6L actionListener;
                                            if (view != null && (actionListener = getActionListener()) != null) {
                                                actionListener.onButtonClick(iconLabelItem.daInfo);
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(700L);
                                        }
                                    }, viewTd);
                                    C426160GnO c426160GnO4 = this.LLILLL;
                                    if (c426160GnO4 != null) {
                                        c426160GnO4.addView(viewTd);
                                    }
                                }
                            }
                        }
                        C1421670n6D.LIZIZ(this, new AwS566S0100000_22(vertical, 77), new AwS601S0100000_22(this, 60));
                    }
                }
            };
        } else {
            throw new C1954807lC();
        }
        abstractC1421780n6O.setListener(interfaceC1421750n6L);
        abstractC1421780n6O.setData(iconLabelGroupLayout);
        return abstractC1421780n6O;
    }
}
