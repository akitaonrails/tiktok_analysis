package X;

import Y.AsS0S0102000_1;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;

/* JADX INFO: renamed from: X.03wo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1007603wo extends ConstraintLayout {
    public TuxTextView LL;
    public RecyclerView LLILLJJLI;
    public Function1<? super EnumC949303nP, Unit> LLILLL;
    public Function0<Unit> LLILZ;

    private final RecyclerView getUserRightRecyclerView() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.user_right_rv);
            this.LLILLJJLI = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    private final TuxTextView getUserRightTitle() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.user_right_title);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void setUserRight(C1007803wq c1007803wq) {
        List<String> list;
        String str;
        TuxTextView userRightTitle = getUserRightTitle();
        C1007903wr c1007903wr = null;
        if (userRightTitle != null) {
            if (c1007803wq != null) {
                str = c1007803wq.LIZ;
            } else {
                str = null;
            }
            userRightTitle.setText(str);
        }
        RecyclerView userRightRecyclerView = getUserRightRecyclerView();
        if (userRightRecyclerView != null) {
            if (c1007803wq != null && (list = c1007803wq.LIZIZ) != null) {
                c1007903wr = new C1007903wr(list, new AwS615S0100000_1(this, 164));
            }
            userRightRecyclerView.setAdapter(c1007903wr);
        }
    }

    public final void setUserRightModuleClickListener$ecommerce_transaction_release(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    public final void setUserRightSlideListener$ecommerce_transaction_release(Function1<? super EnumC949303nP, Unit> function1) {
        this.LLILLL = function1;
    }

    public C1007603wo(final Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ap9, this, true);
        RecyclerView userRightRecyclerView = getUserRightRecyclerView();
        if (userRightRecyclerView != null) {
            userRightRecyclerView.setLayoutManager(new GridLayoutManager(2, 0, context, false));
        }
        RecyclerView userRightRecyclerView2 = getUserRightRecyclerView();
        if (userRightRecyclerView2 != null) {
            userRightRecyclerView2.addItemDecoration(new C0DXR() { // from class: X.03wk
                public final int LL = (int) C0H9H.LIZ(16);
                public final int LLILLJJLI = (int) C0H9H.LIZ(4);
                public final int LLILLL = (int) C0H9H.LIZ(24);

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    GridLayoutManager gridLayoutManager;
                    int itemCount;
                    super.LIZIZ(rect, view, recyclerView, c21673919s1);
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                        int i = gridLayoutManager.LLILLJJLI;
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                        AbstractC21673619ry adapter = recyclerView.getAdapter();
                        if (adapter != null) {
                            itemCount = adapter.getItemCount();
                        } else {
                            itemCount = 0;
                        }
                        if (childAdapterPosition % i == 0) {
                            rect.bottom = this.LLILLJJLI / 2;
                        } else {
                            rect.top = this.LLILLJJLI / 2;
                        }
                        if (childAdapterPosition < i) {
                            rect.right = this.LL / 2;
                            rect.left = this.LLILLL;
                            return;
                        }
                        int i2 = itemCount % i;
                        if (i2 != 0) {
                            i = i2;
                        }
                        if (childAdapterPosition >= itemCount - i) {
                            rect.left = this.LL / 2;
                            return;
                        }
                        int i3 = this.LL / 2;
                        rect.left = i3;
                        rect.right = i3;
                    }
                }
            });
        }
        RecyclerView userRightRecyclerView3 = getUserRightRecyclerView();
        if (userRightRecyclerView3 != null) {
            final AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(this, 1593);
            userRightRecyclerView3.addOnItemTouchListener(new InterfaceC21676019sM(context, awS545S0100000_1) { // from class: X.03wp
                public final Function0<Unit> LL;
                public float LLILLJJLI;
                public float LLILLL;
                public final int LLILZ;
                public Object LLILZIL;

                @Override // X.InterfaceC21676019sM
                public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
                }

                @Override // X.InterfaceC21676019sM
                public final void LJIIZILJ(boolean z) {
                }

                {
                    this.LL = awS545S0100000_1;
                    this.LLILZ = ViewConfiguration.get(context).getScaledTouchSlop();
                }

                @Override // X.InterfaceC21676019sM
                public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 3) {
                                this.LLILZIL = null;
                                return false;
                            }
                            return false;
                        }
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        float fAbs = Math.abs(x - this.LLILLJJLI);
                        float fAbs2 = Math.abs(y - this.LLILLL);
                        if (this.LLILZIL == null) {
                            float f = this.LLILZ;
                            if (fAbs < f && fAbs2 < f) {
                                this.LL.invoke();
                                return true;
                            }
                        }
                        this.LLILZIL = null;
                        return false;
                    }
                    this.LLILLJJLI = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    this.LLILLL = y2;
                    this.LLILZIL = recyclerView.findChildViewUnder(this.LLILLJJLI, y2);
                    return false;
                }
            });
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 83), this);
        RecyclerView userRightRecyclerView4 = getUserRightRecyclerView();
        if (userRightRecyclerView4 != null) {
            userRightRecyclerView4.addOnScrollListener(new AsS0S0102000_1(this, 1));
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.fu, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            int[] iArr = new int[2];
            if (C960203pA.LIZIZ(context)) {
                str = "#231405";
            } else {
                str = "#FFFCF7";
            }
            iArr[0] = ColorProtector.parseColor(str);
            iArr[1] = iIntValue;
            gradientDrawable.setColors(iArr);
        }
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        setBackground(gradientDrawable);
    }
}
