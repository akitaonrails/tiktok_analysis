package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cOT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010150cOT extends AbstractC1010710cPN<C21279718Pj> {
    public final C21279718Pj LLILZLL;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    @Override // X.AbstractC1010710cPN, X.C0PPF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bind() {
        /*
            r8 = this;
            X.0cPA r0 = r8.LL
            android.view.ViewGroup r1 = r0.LIZ
            r7 = 0
            if (r1 == 0) goto Lbb
            r0 = 2131362331(0x7f0a021b, float:1.834444E38)
            android.view.View r6 = r1.findViewById(r0)
            com.bytedance.tux.icon.TuxIconView r6 = (com.bytedance.tux.icon.TuxIconView) r6
        L10:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.LLILLJJLI
            r4 = 0
            if (r1 == 0) goto Lb8
            boolean r0 = X.C1010120cOQ.LJIJI(r1)
            r5 = 1
            if (r0 != r5) goto Lb8
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.getAwemeRawAd()
            if (r0 == 0) goto Lb8
            com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel r0 = r0.getSearchAdInfo()
            if (r0 == 0) goto Lb8
            java.lang.Integer r2 = r0.adLinkIconStyle
            X.07ru r0 = X.EnumC1996407ru.RIGHT_OF_TAG
            int r1 = r0.getValue()
            if (r2 == 0) goto Lb8
            int r0 = r2.intValue()
            if (r0 != r1) goto Lb8
        L38:
            r3 = 8
            if (r5 == 0) goto Lb2
            if (r6 == 0) goto L41
            X.C786410Ut5.LLLLLLZZ(r6, r4)
        L41:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "bind ad Tag componentView = "
            r1.append(r0)
            X.18Pj r0 = r8.LLILZLL
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            int r0 = X.C2510609se.LIZ
            X.18Pj r2 = r8.LLILZLL
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.LLILLJJLI
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r0.getAwemeRawAd()
        L5e:
            if (r2 == 0) goto Lb1
            X.C786410Ut5.LLLLILI(r2, r3)
            if (r7 == 0) goto Lb1
            X.18Ph r3 = X.C988900bqC.LIZ()
            com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel r0 = r7.getLabel()
            if (r0 == 0) goto Lb1
            java.lang.String r0 = r0.getLabelName()
            if (r0 == 0) goto Lb1
            X.C786410Ut5.LLLLILI(r2, r4)
            r3.LJIIL(r0)
            r0 = 92
            r3.LJIILJJIL(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131100542(0x7f06037e, float:1.7813468E38)
            int r0 = X.C475630Ikz.LIZIZ(r0, r1)
            r3.LIZ(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131099768(0x7f060078, float:1.7811899E38)
            int r0 = X.C475630Ikz.LIZIZ(r0, r1)
            r3.LJIILIIL(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = X.C0HCL.LIZ(r0, r1)
            float r0 = (float) r0
            r3.LIZIZ(r0)
            X.18Pi r0 = r3.LIZ
            if (r0 == 0) goto Lb1
            r2.LIZ(r0)
        Lb1:
            return
        Lb2:
            if (r6 == 0) goto L41
            X.C786410Ut5.LLLLLLZZ(r6, r3)
            goto L41
        Lb8:
            r5 = 0
            goto L38
        Lbb:
            r6 = r7
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1010150cOT.bind():void");
    }

    @Override // X.AbstractC1010710cPN
    public final /* bridge */ /* synthetic */ View LIZIZ() {
        return this.LLILZLL;
    }

    public C1010150cOT(C1010580cPA c1010580cPA) {
        C21279718Pj c21279718Pj;
        super(c1010580cPA);
        ViewGroup viewGroup = c1010580cPA.LIZ;
        if (viewGroup != null) {
            c21279718Pj = (C21279718Pj) viewGroup.findViewById(R.id.abg);
        } else {
            c21279718Pj = null;
        }
        this.LLILZLL = c21279718Pj;
    }
}
