package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0dQS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1049820dQS<E extends ViewGroup> extends C19JH {
    public final List<C19JH<View>> LLLZI;

    public C19JI LJJIIJZLJL() {
        return new C19JI(this);
    }

    @Override // X.C19JH
    public void LJIIZILJ() {
        super.LJIIZILJ();
    }

    public C1049820dQS(Context context) {
        super(context);
        this.LLLZI = new ArrayList();
    }

    @Override // X.C19JH
    public final C19JH LJ(String str) {
        C19JH c19jhLJ;
        if (!TextUtils.isEmpty(str) && LIZLLL(str) != null) {
            return this;
        }
        for (C19JH c19jh : (ArrayList) this.LLLZI) {
            if (c19jh != null && (c19jhLJ = c19jh.LJ(str)) != null) {
                return c19jhLJ;
            }
        }
        return null;
    }

    @Override // X.C19JH
    public final C19JH LJFF(String str) {
        C19JH c19jhLJFF;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.LLJ)) {
            return this;
        }
        for (C19JH c19jh : (ArrayList) this.LLLZI) {
            if (c19jh != null && (c19jhLJFF = c19jh.LJFF(str)) != null) {
                return c19jhLJFF;
            }
        }
        return null;
    }

    public void LJJIII(C19JH c19jh) {
        ((ArrayList) this.LLLZI).add(c19jh);
        View view = c19jh.LLILZ;
        if (view != null) {
            ((ViewGroup) this.LLILZ).addView(view);
        }
    }

    public void LJJIIJ(C19JH c19jh, ViewGroup.LayoutParams layoutParams) {
        ((ArrayList) this.LLLZI).add(c19jh);
        View view = c19jh.LLILZ;
        if (view != null) {
            ((ViewGroup) this.LLILZ).addView(view, layoutParams);
        }
    }
}
