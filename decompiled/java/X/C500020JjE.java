package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import webcast.data.BottomContainerComponent;

/* JADX INFO: renamed from: X.0JjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500020JjE extends ConstraintLayout {
    public final LinearLayout LL;
    public C500010JjD LLILLJJLI;

    public C500020JjE(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0JjD, android.view.View] */
    public C500020JjE(Context context, AttributeSet attributeSet, int i) {
        int iLIZ;
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.hh9, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.trb);
        this.LL = linearLayout;
        C500260Jjc.LJLJLLL((int) C497740JfY.LIZIZ(((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ())) - 28), linearLayout);
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        List listLIZIZ = C0UJW.LIZIZ();
        if (listLIZIZ != null) {
            int i2 = 0;
            for (Object obj : listLIZIZ) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    final BottomContainerComponent bottomContainerComponent = (BottomContainerComponent) obj;
                    if (i2 < 5) {
                        if (C0UJW.LJ.containsKey(Integer.valueOf(bottomContainerComponent.type))) {
                            final Context context2 = getContext();
                            ?? r4 = new ConstraintLayout(context2, bottomContainerComponent) { // from class: X.0JjD
                                /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
                                {
                                    /*
                                        Method dump skipped, instruction units count: 259
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C500010JjD.<init>(android.content.Context, webcast.data.BottomContainerComponent):void");
                                }
                            };
                            int i4 = bottomContainerComponent.type;
                            if (i4 == 6) {
                                this.LLILLJJLI = r4;
                            }
                            LinearLayout linearLayout2 = this.LL;
                            if (linearLayout2 != 0) {
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                                if (i4 != 8 && i4 != 15 && i4 != 21) {
                                    iLIZ = C439101nJ.LIZ(16);
                                } else {
                                    iLIZ = 0;
                                }
                                layoutParams.topMargin = iLIZ;
                                linearLayout2.addView((View) r4, layoutParams);
                            }
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
