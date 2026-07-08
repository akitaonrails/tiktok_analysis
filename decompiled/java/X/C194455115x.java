package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.115x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194455115x extends C194449115r {
    public final Function0<Unit> LLILZLL;
    public C19517811Xs LLIZ;
    public C19518211Xw LLIZLLLIL;
    public C1390410mHn LLJ;
    public final List<C11UK> LLJI;
    public final C11UQ LLJIJIL;
    public final LinearLayoutManager LLJILJIL;

    public final int getCurrentPos() {
        return this.LLJIJIL.LLILZIL;
    }

    public final C1390410mHn getDualLoadingFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gbf);
            this.LLJ = (C1390410mHn) callbackFindViewById;
        }
        return (C1390410mHn) callbackFindViewById;
    }

    public final C19517811Xs getRvEsPanelListFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tvd);
            this.LLIZ = (C19517811Xs) callbackFindViewById;
        }
        return (C19517811Xs) callbackFindViewById;
    }

    public final C19518211Xw getTvEsPanelTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zkw);
            this.LLIZLLLIL = (C19518211Xw) callbackFindViewById;
        }
        return (C19518211Xw) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLILZLL.invoke();
        super.onDetachedFromWindow();
    }

    @Override // X.C194449115r
    public final void LIZLLL(int i) {
        C0MVY c0mvy;
        int i2;
        int i3;
        View view = this.LL;
        boolean z = false;
        if (view != null) {
            if (i == 0) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            C786410Ut5.LJLLLLLL(i3, view);
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            if (i == 1) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view2);
        }
        if (i == 1) {
            z = true;
        }
        C194353111z c194353111z = C194353111z.LIZ;
        if (z) {
            c0mvy = C0MVY.SHOW;
        } else {
            c0mvy = C0MVY.DISMISS;
        }
        c194353111z.LIZIZ(1603, c0mvy, C0LD3.DUAL_BALL, C0LEP.CLOSE_GONE);
    }

    public final void LJFF(C11UK c11uk) {
        int iIndexOf = ((ArrayList) this.LLJI).indexOf(c11uk);
        if (iIndexOf >= 0) {
            this.LLJIJIL.notifyItemChanged(iIndexOf);
        }
    }

    public final void setDualLoadingFromXml(C1390410mHn c1390410mHn) {
        this.LLJ = c1390410mHn;
    }

    public final void setOnItemSelectedListener(InterfaceC194456115y interfaceC194456115y) {
        this.LLJIJIL.getClass();
    }

    public final void setRvEsPanelListFromXml(C19517811Xs c19517811Xs) {
        this.LLIZ = c19517811Xs;
    }

    public final void setTvEsPanelTitleFromXml(C19518211Xw c19518211Xw) {
        this.LLIZLLLIL = c19518211Xw;
    }

    @Override // X.C194449115r
    public final View LIZJ(Context context, AttributeSet attributeSet) {
        return new C0DRO(context, attributeSet, 0);
    }

    public final void LJ(String str, boolean z) {
        int iIndexOf = 0;
        if (str != null) {
            Iterator<C11UK> it2 = this.LLJI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C11UK next = it2.next();
                if (Intrinsics.LJFF(next.effect.getEffectId(), str)) {
                    if (next != null) {
                        iIndexOf = ((ArrayList) this.LLJI).indexOf(next);
                    }
                }
            }
        }
        if (Intrinsics.LJFF(str, "auto") && ((ArrayList) this.LLJI).size() > 2) {
            C11UQ c11uq = this.LLJIJIL;
            c11uq.LLILZIL = 1;
            c11uq.notifyDataSetChanged();
            return;
        }
        C11UQ c11uq2 = this.LLJIJIL;
        c11uq2.LLILZIL = iIndexOf;
        if (z) {
            c11uq2.notifyDataSetChanged();
        } else if (iIndexOf != 0) {
            c11uq2.notifyItemChanged(iIndexOf);
            this.LLJILJIL.scrollToPositionWithOffset(iIndexOf, (ScreenUtils.getScreenWidth(getContext()) / 2) - ((int) C11VU.LIZIZ(30.0f, getContext())));
        }
    }

    public C194455115x(Context context, C11UX c11ux, C11UX c11ux2, AwS608S0100000_29 awS608S0100000_29, AwS573S0100000_29 awS573S0100000_29) {
        super(context, null);
        this.LLILZLL = awS573S0100000_29;
        ArrayList arrayList = new ArrayList();
        this.LLJI = arrayList;
        C11UQ c11uq = new C11UQ(arrayList, c11ux, c11ux2, awS608S0100000_29);
        this.LLJIJIL = c11uq;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        this.LLJILJIL = linearLayoutManager;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.c50, this, true);
        getRvEsPanelListFromXml().setLayoutManager(linearLayoutManager);
        getRvEsPanelListFromXml().setAdapter(c11uq);
    }
}
