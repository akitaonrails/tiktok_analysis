package X;

import Y.ACListenerS11S1101000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import avg.f;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import mf.a;

/* JADX INFO: renamed from: X.0GkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424370GkV extends LinearLayout {
    public static final List<String> LLILLL = C1697810uHb.LJIIJJI("😍", "😂", "😳");
    public final List<TuxTextView> LL;
    public InterfaceC424410GkZ LLILLJJLI;

    public final InterfaceC424410GkZ getEmojiRecommendationSelectListener() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.util.AttributeSet, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public final void LIZ(List<String> list) {
        EnumC428970Grv enumC428970Grv;
        int i;
        List<String> list2 = list;
        if (list2 == null) {
            list2 = LLILLL;
        }
        int i2 = 0;
        ?? r9 = 0;
        if (getChildCount() == 0) {
            int i3 = 0;
            for (String str : list2) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    String str2 = str;
                    C424390GkX c424390GkX = EnumC428970Grv.LL;
                    int size = list2.size();
                    c424390GkX.getClass();
                    if (i3 == 0) {
                        if (size == 1) {
                            enumC428970Grv = EnumC428970Grv.LLILZIL;
                        } else {
                            enumC428970Grv = EnumC428970Grv.LLILLJJLI;
                        }
                    } else if (i3 == size - 1) {
                        enumC428970Grv = EnumC428970Grv.LLILLL;
                    } else {
                        enumC428970Grv = EnumC428970Grv.LLILZ;
                    }
                    ACListenerS11S1101000_6 aCListenerS11S1101000_6 = new ACListenerS11S1101000_6(this, str2, i3, 1);
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    TuxTextView tuxTextView = new TuxTextView(getContext(), r9, 6, 0);
                    tuxTextView.setText(str2);
                    tuxTextView.setTuxFont(13);
                    tuxTextView.setGravity(17);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    int iOrdinal = enumC428970Grv.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    i = -2;
                                    C426750GoL.LJIIL(tuxTextView, 0, 0, 0, 0, 16);
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                i = -2;
                                C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 0, 16);
                            }
                        } else {
                            i = -2;
                            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 0, 0, 0, 16);
                        }
                    } else {
                        i = -2;
                        C426750GoL.LJIIL(tuxTextView, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 0, 16);
                    }
                    frameLayout.addView(tuxTextView, layoutParams);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, -1);
                    layoutParams2.gravity = 17;
                    addView(frameLayout, layoutParams2);
                    ((ArrayList) this.LL).add(tuxTextView);
                    C786410Ut5.h9(tuxTextView, aCListenerS11S1101000_6);
                    i3 = i4;
                    r9 = 0;
                } else {
                    C1697810uHb.LJIJI();
                    throw r9;
                }
            }
            return;
        }
        for (Object obj : (ArrayList) this.LL) {
            int i5 = i2 + 1;
            if (i2 >= 0) {
                TextView textView = (TextView) obj;
                if (i2 < list2.size()) {
                    textView.setText((CharSequence) ListProtector.get(list2, i2));
                }
                i2 = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void setEmojiRecommendationSelectListener(InterfaceC424410GkZ interfaceC424410GkZ) {
        this.LLILLJJLI = interfaceC424410GkZ;
    }

    public C424370GkV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new ArrayList();
        LinearLayout.inflate(context, R.layout.coa, this);
        setOrientation(0);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.0GkY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
        a aVar = new a(C1848410yCV.LIZ ? new f(onClickListener) : onClickListener);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}
