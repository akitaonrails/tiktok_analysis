package X;

import Y.ACListenerS131S0200000_29;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import java.util.ArrayList;
import java.util.List;
import mf.a;

/* JADX INFO: renamed from: X.125k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196990125k extends FrameLayout {
    public List<TextFontStyleData> LL;
    public InterfaceC196995125p LLILLJJLI;
    public final List<C196989125j> LLILLL;
    public String LLILZ;
    public C125O LLILZIL;
    public LinearLayout LLILZLL;
    public Drawable LLIZ;
    public Drawable LLIZLLLIL;
    public Integer LLJ;
    public int LLJI;

    public final void LIZJ() {
        for (C196989125j c196989125j : (ArrayList) this.LLILLL) {
            String strLIZLLL = C196986125g.LJFF().LIZLLL(this.LLJI);
            if (TextUtils.isEmpty(strLIZLLL) || !strLIZLLL.equals(c196989125j.getTag())) {
                c196989125j.setBackground(0);
            } else {
                TextFontStyleData textFontStyleData = c196989125j.LLILZIL;
                if (textFontStyleData != null && textFontStyleData.LIZIZ == 1) {
                    c196989125j.setBackground(1);
                    c196989125j.LIZIZ();
                    this.LLILZIL.LIZ(c196989125j);
                }
            }
        }
    }

    public ViewGroup getContentLayout() {
        return this.LLILZLL;
    }

    public final void LIZ(C196989125j c196989125j) {
        Drawable drawableMutate;
        if (c196989125j == null) {
            return;
        }
        Drawable drawable = this.LLIZ;
        Drawable drawableMutate2 = null;
        if (drawable == null) {
            drawableMutate = null;
        } else if (drawable.getConstantState() != null) {
            drawableMutate = drawable.getConstantState().newDrawable().mutate();
        } else {
            drawableMutate = drawable.mutate();
        }
        Drawable drawable2 = this.LLIZLLLIL;
        if (drawable2 != null) {
            if (drawable2.getConstantState() != null) {
                drawableMutate2 = drawable2.getConstantState().newDrawable().mutate();
            } else {
                drawableMutate2 = drawable2.mutate();
            }
        }
        Integer num = this.LLJ;
        if (drawableMutate == null) {
            drawableMutate = c196989125j.LLIZLLLIL;
        }
        c196989125j.LLJI = drawableMutate;
        if (drawableMutate2 == null) {
            drawableMutate2 = c196989125j.LLIZ;
        }
        c196989125j.LLJ = drawableMutate2;
        c196989125j.LLJILJIL = num;
        c196989125j.setBackground(c196989125j.LLJILJILJ);
    }

    public final void LIZIZ(List<TextFontStyleData> list) {
        TextFontStyleData textFontStyleData;
        TextFontStyleData textFontStyleData2;
        if (!C482790IwX.LIZ(this.LL)) {
            return;
        }
        if (C482790IwX.LIZ(list)) {
            C196986125g c196986125gLJFF = C196986125g.LJFF();
            if (getContext() == null) {
                c196986125gLJFF.getClass();
                return;
            } else {
                c196986125gLJFF.LJ.LJJJJI("textfont", false, false, new C196988125i(c196986125gLJFF, null));
                return;
            }
        }
        this.LL = list;
        for (int i = 0; i < this.LL.size(); i++) {
            if (ListProtector.get(this.LL, i) != null) {
                TextFontStyleData textFontStyleData3 = (TextFontStyleData) ListProtector.get(this.LL, i);
                C196989125j c196989125j = new C196989125j(getContext(), this.LLJI);
                LIZ(c196989125j);
                c196989125j.LIZLLL(textFontStyleData3);
                c196989125j.setBackground(0);
                if ("default".equals(C196986125g.LJFF().LIZLLL(this.LLJI))) {
                    if (i == 0 && textFontStyleData3 != null && (textFontStyleData2 = c196989125j.LLILZIL) != null && textFontStyleData2.LIZIZ == 1) {
                        C196986125g.LJFF().LJIIIIZZ(this.LLJI, textFontStyleData3.fileName);
                        c196989125j.setBackground(1);
                    }
                } else {
                    String strLIZLLL = C196986125g.LJFF().LIZLLL(this.LLJI);
                    if (!TextUtils.isEmpty(strLIZLLL) && strLIZLLL.equals(textFontStyleData3.fileName) && (textFontStyleData = c196989125j.LLILZIL) != null && textFontStyleData.LIZIZ == 1) {
                        c196989125j.setBackground(1);
                    }
                }
                c196989125j.setTag(textFontStyleData3.fileName);
                View.OnClickListener aCListenerS131S0200000_29 = new ACListenerS131S0200000_29(this, c196989125j, 5);
                if (C1848410yCV.LIZ) {
                    aCListenerS131S0200000_29 = new f(aCListenerS131S0200000_29);
                }
                a aVar = new a(aCListenerS131S0200000_29);
                if (C2213981Bky.LIZIZ.isOffline()) {
                    C2211941Bhg.LIZ.injectViewListener(c196989125j);
                }
                c196989125j.setOnClickListener(aVar);
                c196989125j.setDownloadCallback(new InterfaceC196996125q() { // from class: X.125o
                    @Override // X.InterfaceC196996125q
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC196996125q
                    public final void LIZ(TextFontStyleData textFontStyleData4, boolean z) {
                        if (z && textFontStyleData4 != null && !TextUtils.isEmpty(textFontStyleData4.fileName) && textFontStyleData4.fileName.equals(this.LL.LLILZ)) {
                            C196990125k c196990125k = this.LL;
                            InterfaceC196995125p interfaceC196995125p = c196990125k.LLILLJJLI;
                            if (interfaceC196995125p != null) {
                                interfaceC196995125p.LIZ(textFontStyleData4);
                            }
                            c196990125k.LIZJ();
                        }
                    }
                });
                ((ArrayList) this.LLILLL).add(c196989125j);
                this.LLILZLL.addView(c196989125j);
            }
        }
    }

    public void setClickFontStyleListener(InterfaceC196995125p interfaceC196995125p) {
        this.LLILLJJLI = interfaceC196995125p;
    }

    public C196990125k(Context context, int i) {
        super(context, null);
        this.LL = new ArrayList();
        this.LLILLL = new ArrayList();
        this.LLJI = i;
        this.LLILZLL = new LinearLayout(getContext());
        this.LLILZIL = new C125O(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.LLILZLL.setPadding((int) C11VU.LIZIZ(12.0f, getContext()), 0, 0, 0);
        this.LLILZIL.addView(this.LLILZLL, layoutParams);
        this.LLILZIL.setHorizontalScrollBarEnabled(false);
        addView(this.LLILZIL, new FrameLayout.LayoutParams(-1, -1));
    }
}
