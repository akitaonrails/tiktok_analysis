package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.model.CommerceAgentActionBarItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: renamed from: X.0e8A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076920e8A extends LinearLayout {
    public HorizontalScrollView LL;
    public LinearLayout LLILLJJLI;
    public TuxIconView LLILLL;
    public final Function1<? super String, Unit> LLILZ;
    public final Function0<Unit> LLILZIL;
    public final List<C1076890e87> LLILZLL;

    private final LinearLayout.LayoutParams getMarinEnd12LayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        return layoutParams;
    }

    public final List<C1076890e87> getBottomBars() {
        return this.LLILZLL;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean z2;
        boolean z3;
        super.onWindowFocusChanged(z);
        HorizontalScrollView horizontalScrollView = this.LL;
        if (horizontalScrollView != null) {
            List<C1076890e87> list = this.LLILZLL;
            ArrayList<AbstractC1076940e8C> arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                if (true ^ ((AbstractC421070GfB) obj).LLILZIL) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                for (AbstractC1076940e8C abstractC1076940e8C : arrayList) {
                    if (abstractC1076940e8C.isAttachedToWindow() && horizontalScrollView.isAttachedToWindow() && abstractC1076940e8C.getWidth() > 0 && abstractC1076940e8C.getHeight() > 0 && horizontalScrollView.getWidth() > 0 && horizontalScrollView.getHeight() > 0 && horizontalScrollView.getVisibility() == 0) {
                        int[] iArr = new int[2];
                        abstractC1076940e8C.getLocationOnScreen(iArr);
                        int i = iArr[0];
                        Rect rect = new Rect(i, iArr[1], abstractC1076940e8C.getWidth() + i, iArr[1] + abstractC1076940e8C.getHeight());
                        Rect rect2 = new Rect();
                        horizontalScrollView.getGlobalVisibleRect(rect2);
                        Rect rect3 = new Rect();
                        abstractC1076940e8C.getGlobalVisibleRect(rect3);
                        if (rect3.width() == abstractC1076940e8C.getWidth() && rect3.height() == abstractC1076940e8C.getHeight()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (rect.left >= rect2.left && rect.right <= rect2.right && rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 && z3) {
                            abstractC1076940e8C.LLILZIL = true;
                            abstractC1076940e8C.LIZ(true);
                        }
                    }
                }
            }
        }
    }

    public final void setupDefaultActions(List<CommerceAgentActionBarItem> list) {
        Integer numValueOf;
        LinearLayout linearLayout;
        Integer numValueOf2;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3 = this.LLILLJJLI;
        int i = 0;
        if (linearLayout3 != null && (numValueOf2 = Integer.valueOf(linearLayout3.getChildCount())) != null && numValueOf2.intValue() > 0 && (linearLayout2 = this.LLILLJJLI) != null) {
            C786410Ut5.LJJJJJL(linearLayout2);
        }
        ((ArrayList) this.LLILZLL).clear();
        C321630CjB.LIZ.clear();
        C321630CjB.LIZIZ.clear();
        if (list != null) {
            int i2 = 0;
            for (CommerceAgentActionBarItem commerceAgentActionBarItem : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    CommerceAgentActionBarItem commerceAgentActionBarItem2 = commerceAgentActionBarItem;
                    C1076890e87 c1076890e87 = new C1076890e87(getContext());
                    c1076890e87.setRenderData(new C1076930e8B(commerceAgentActionBarItem2.id, String.valueOf(commerceAgentActionBarItem2.name), String.valueOf(i2), commerceAgentActionBarItem2.enterHint, commerceAgentActionBarItem2.exitHint, commerceAgentActionBarItem2.name, commerceAgentActionBarItem2.hint));
                    c1076890e87.setOnClickListener(new AwS382S0200000_16(this, commerceAgentActionBarItem2, 98));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Bottom ");
                    sbLIZ.append(commerceAgentActionBarItem2.name);
                    c1076890e87.setViewTag(C2188811AlT.LIZIZ(sbLIZ));
                    ((ArrayList) this.LLILZLL).add(c1076890e87);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        LinearLayout linearLayout4 = this.LLILLJJLI;
        if (linearLayout4 != null && (numValueOf = Integer.valueOf(linearLayout4.getChildCount())) != null && numValueOf.intValue() > 0 && (linearLayout = this.LLILLJJLI) != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        if (!((ArrayList) this.LLILZLL).isEmpty()) {
            for (Object obj : (ArrayList) this.LLILZLL) {
                int i4 = i + 1;
                if (i >= 0) {
                    View view = (View) obj;
                    if (i == ((ArrayList) this.LLILZLL).size() - 1) {
                        LinearLayout linearLayout5 = this.LLILLJJLI;
                        if (linearLayout5 != null) {
                            linearLayout5.addView(view, getMarinEnd12LayoutParams());
                        }
                    } else {
                        LinearLayout linearLayout6 = this.LLILLJJLI;
                        if (linearLayout6 != null) {
                            linearLayout6.addView(view);
                        }
                    }
                    i = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return;
        }
        HorizontalScrollView horizontalScrollView = this.LL;
        if (horizontalScrollView != null) {
            C786410Ut5.LLIIJI(horizontalScrollView, 8);
        }
    }

    public C1076920e8A(Context context, Function1 function1, Function0 function0) {
        Drawable drawable;
        Drawable drawableMutate;
        int iIntValue;
        int i;
        super(context, null, 0);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LLILZLL = new ArrayList();
        setOrientation(1);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ajx, this, true);
        this.LL = (HorizontalScrollView) viewTd.findViewById(R.id.ce1);
        this.LLILLJJLI = (LinearLayout) viewTd.findViewById(R.id.ce0);
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.y2u);
        this.LLILLL = tuxIconView;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (C320920Ci2.LIZ().agentBarCloseEnable) {
                i = R.raw.icon_x_mark_small;
            } else {
                i = R.raw.icon_chevron_up;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LIZIZ = iLIZIZ;
            c419910GdJ.LIZJ = iLIZIZ;
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        TuxIconView tuxIconView2 = this.LLILLL;
        if (tuxIconView2 != null && getContext() != null && (drawable = tuxIconView2.getDrawable()) != null && (drawableMutate = drawable.mutate()) != null) {
            Integer numValueOf = Integer.valueOf(drawableMutate.getIntrinsicWidth());
            numValueOf = numValueOf.intValue() <= 0 ? null : numValueOf;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 100;
            }
            Integer numValueOf2 = Integer.valueOf(drawableMutate.getIntrinsicHeight());
            int iIntValue2 = numValueOf2.intValue() > 0 ? numValueOf2.intValue() : 100;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableMutate.setBounds(0, 0, iIntValue, iIntValue2);
            drawableMutate.draw(canvas);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            float f = iIntValue;
            float f2 = iIntValue2;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f, f2, ColorProtector.parseColor("#A180FF"), ColorProtector.parseColor("#D167FB"), Shader.TileMode.CLAMP);
            Paint paint = new Paint();
            paint.setShader(linearGradient);
            canvas2.drawRect(0.0f, 0.0f, f, f2, paint);
            Paint paint2 = new Paint();
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint2);
            tuxIconView2.setImageDrawable(new BitmapDrawable(tuxIconView2.getContext().getResources(), bitmapCreateBitmap));
        }
        TuxIconView tuxIconView3 = this.LLILLL;
        if (tuxIconView3 != null) {
            C786410Ut5.a9(tuxIconView3, new ACListenerS151S0100000_16(this, 135));
        }
        this.LLILZ = function1;
        this.LLILZIL = function0;
    }
}
