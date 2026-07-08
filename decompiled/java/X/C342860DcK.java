package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0DcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342860DcK extends ConstraintLayout {
    public final SmartImageView LL;
    public final SmartImageView LLILLJJLI;
    public final SmartImageView LLILLL;
    public final View LLILZ;
    public final TuxTextView LLILZIL;
    public final C01GW LLILZLL;

    private final TuxIconDrawable getPlusIcon() {
        return (TuxIconDrawable) this.LLILZLL.getValue();
    }

    public final void setImageStack(List<? extends C03IT> list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    if (size != 3) {
                        SmartImageView smartImageView = this.LL;
                        if (smartImageView != null) {
                            e0(smartImageView, (C03IT) ListProtector.get(list, 2));
                        }
                        SmartImageView smartImageView2 = this.LLILLJJLI;
                        if (smartImageView2 != null) {
                            e0(smartImageView2, (C03IT) ListProtector.get(list, 1));
                        }
                        SmartImageView smartImageView3 = this.LLILLL;
                        if (smartImageView3 != null) {
                            e0(smartImageView3, (C03IT) ListProtector.get(list, 0));
                        }
                        View view = this.LLILZ;
                        if (view != null) {
                            C0DSB.LIZJ(view);
                        }
                        TuxTextView tuxTextView = this.LLILZIL;
                        if (tuxTextView != null) {
                            tuxTextView.setText(String.valueOf(list.size() - 3));
                            TuxIconDrawable plusIcon = getPlusIcon();
                            if (!Boolean.valueOf(!C426750GoL.LIZLLL(tuxTextView.getContext())).booleanValue()) {
                                plusIcon = null;
                            }
                            TuxIconDrawable plusIcon2 = getPlusIcon();
                            if (!C426750GoL.LIZLLL(tuxTextView.getContext())) {
                                plusIcon2 = null;
                            }
                            tuxTextView.setCompoundDrawablesWithIntrinsicBounds(plusIcon, (Drawable) null, plusIcon2, (Drawable) null);
                            return;
                        }
                        return;
                    }
                    SmartImageView smartImageView4 = this.LL;
                    if (smartImageView4 != null) {
                        e0(smartImageView4, (C03IT) ListProtector.get(list, 2));
                    }
                    SmartImageView smartImageView5 = this.LLILLJJLI;
                    if (smartImageView5 != null) {
                        e0(smartImageView5, (C03IT) ListProtector.get(list, 1));
                    }
                    SmartImageView smartImageView6 = this.LLILLL;
                    if (smartImageView6 != null) {
                        e0(smartImageView6, (C03IT) ListProtector.get(list, 0));
                    }
                    View view2 = this.LLILZ;
                    if (view2 == null) {
                        return;
                    }
                    C0DSB.LIZIZ(view2);
                    return;
                }
                SmartImageView smartImageView7 = this.LL;
                if (smartImageView7 != null) {
                    e0(smartImageView7, (C03IT) ListProtector.get(list, 1));
                }
                SmartImageView smartImageView8 = this.LLILLJJLI;
                if (smartImageView8 != null) {
                    e0(smartImageView8, (C03IT) ListProtector.get(list, 0));
                }
                SmartImageView smartImageView9 = this.LLILLL;
                if (smartImageView9 != null) {
                    C0DSB.LIZIZ(smartImageView9);
                }
                View view3 = this.LLILZ;
                if (view3 == null) {
                    return;
                }
                C0DSB.LIZIZ(view3);
                return;
            }
            SmartImageView smartImageView10 = this.LL;
            if (smartImageView10 != null) {
                e0(smartImageView10, (C03IT) ListProtector.get(list, 0));
            }
            SmartImageView smartImageView11 = this.LLILLJJLI;
            if (smartImageView11 != null) {
                C0DSB.LIZIZ(smartImageView11);
            }
            SmartImageView smartImageView12 = this.LLILLL;
            if (smartImageView12 != null) {
                C0DSB.LIZIZ(smartImageView12);
            }
            View view4 = this.LLILZ;
            if (view4 == null) {
                return;
            }
            C0DSB.LIZIZ(view4);
            return;
        }
        SmartImageView smartImageView13 = this.LL;
        if (smartImageView13 != null) {
            C0DSB.LIZIZ(smartImageView13);
        }
        SmartImageView smartImageView14 = this.LLILLJJLI;
        if (smartImageView14 != null) {
            C0DSB.LIZIZ(smartImageView14);
        }
        SmartImageView smartImageView15 = this.LLILLL;
        if (smartImageView15 != null) {
            C0DSB.LIZIZ(smartImageView15);
        }
        View view5 = this.LLILZ;
        if (view5 == null) {
            return;
        }
        C0DSB.LIZIZ(view5);
    }

    public C342860DcK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void e0(SmartImageView smartImageView, C03IT c03it) {
        C0DSB.LIZJ(smartImageView);
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c03it);
        c1331670kl3LJIIJ.LJJ(smartImageView);
        c1331670kl3LJIIJ.LJIIJJI();
    }

    public C342860DcK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZLL = C452501pT.LIZIZ(new AwS548S0100000_4(context, 268));
        ViewGroup.inflate(context, R.layout.frq, this);
        this.LL = (SmartImageView) findViewById(R.id.x_6);
        this.LLILLJJLI = (SmartImageView) findViewById(R.id.x_7);
        this.LLILLL = (SmartImageView) findViewById(R.id.x_8);
        View viewFindViewById = findViewById(R.id.x_4);
        this.LLILZ = viewFindViewById;
        if (viewFindViewById != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zf);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            c384050F3z.LJFF = Integer.valueOf(R.attr.uk);
            viewFindViewById.setBackground(c384050F3z.LIZ(context));
        }
        this.LLILZIL = (TuxTextView) findViewById(R.id.x_3);
    }
}
