package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10Hd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19219910Hd extends C193N<C05YF, C19220110Hf, C19220010He> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final boolean LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final Function0<C19220110Hf> LLJ;
    public final C19220010He LLJI;
    public final InterfaceC1738600vLO LLJIJIL;
    public final C10J3 LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19219910Hd.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILLL = 8;
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
    }

    private final VideoPublishEditModel O4() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJILJILJ[0]);
    }

    @Override // X.C193N
    public AnonymousClass1931<?, C19220110Hf, C19220010He> F4() {
        final VideoPublishEditModel videoPublishEditModelO4 = O4();
        final boolean z = this.LLIZ;
        return new AnonymousClass1931<C10CI, C19220110Hf, C19220010He>(videoPublishEditModelO4, z) { // from class: X.10CF
            public final VideoPublishEditModel LIZJ;
            public final boolean LIZLLL;

            {
                this.LIZJ = videoPublishEditModelO4;
                this.LIZLLL = z;
            }

            @Override // X.AnonymousClass1931
            public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
                int iLIZIZ;
                int iLIZIZ2;
                float fLIZIZ;
                Context context2 = viewGroup.getContext();
                FrameLayout frameLayout = new FrameLayout(context2);
                C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
                if (C10BZ.LIZ()) {
                    if (this.LIZLLL) {
                        fLIZIZ = C418440Gaw.LIZIZ(24);
                    } else {
                        fLIZIZ = C418440Gaw.LIZIZ(32);
                    }
                    iLIZIZ = C814420VxA.LIZIZ(fLIZIZ);
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                }
                if (C10BZ.LIZ()) {
                    iLIZIZ2 = 0;
                } else {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                }
                frameLayout.setPadding(iLIZIZ, 0, iLIZIZ, iLIZIZ2);
                TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
                C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-1, -2));
                tuxTextView.setTuxFont(61);
                tuxTextView.setTextColorRes(R.attr.a1k);
                C786410Ut5.LLLLZLL(tuxTextView, 8);
                frameLayout.addView(tuxTextView);
                return new C10CI(frameLayout, tuxTextView);
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
            @Override // X.AnonymousClass1931
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(X.AbstractC1738640vLS r6, X.C193X r7, X.C1664690tQB r8, java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 203
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C10CF.LIZLLL(X.0vLS, X.193X, X.0tQB, java.lang.Object):void");
            }
        };
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJIJIL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJILJIL;
    }

    public C19220010He K4() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C19220110Hf> o2() {
        return this.LLJ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.10He] */
    public C19219910Hd(boolean z, C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = z;
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJ = AFwS217S0000000_28.get$arr$(374);
        this.LLJI = new Object() { // from class: X.10He
        };
        this.LLJIJIL = EnumC214771193h.VISIBILITY_HINT;
        this.LLJILJIL = C193D.LIZ;
    }
}
