package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ImageAction;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857830yRh extends C1858660yT2 implements InterfaceC1891350zJl, InterfaceC1856750yPx, InterfaceC1859540yUS {
    public final C326880Cre LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final String LLJJJIL;
    public final List<BaseImage> LLJJJJ;
    public final boolean LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public final float LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final long LLJL;
    public final C01GW LLJLIL;

    @Override // X.InterfaceC1859540yUS
    public final Map<String, TakoPlaceholderSource> LJIIZILJ() {
        return null;
    }

    @Override // X.InterfaceC1856750yPx
    public final List<ImageAction> LJZ() {
        return null;
    }

    @Override // X.InterfaceC1859540yUS
    public final boolean LLIIJI() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1857830yRh) && Intrinsics.LJFF(this.LLJJIJI, ((C1857830yRh) obj).LLJJIJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LLJJIJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAnswerImageItem(message=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1858660yT2, X.InterfaceC1858700yT6
    public final boolean LJJJIL() {
        return this.LLJ && !this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1856750yPx
    public final List<String> LLJJL() {
        return (List) this.LLJLIL.getValue();
    }

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1856750yPx
    public final String LJJIJLIJ() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1856750yPx
    public final float LJJJJLI() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1856750yPx
    public final int LJJJLZIJ() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1856750yPx
    public final boolean LJLL() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1856750yPx
    public final boolean LL() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1856750yPx
    public final long LLIZ() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1856750yPx
    public final List<BaseImage> getImageData() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LLJJIJIIJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1857830yRh(X.C326880Cre r8) {
        /*
            r7 = this;
            r7.<init>(r8)
            r7.LLJJIJI = r8
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r3 = r7.LLILZLL
            r2 = 0
            if (r3 == 0) goto L9a
            java.lang.String r0 = r3.text
        Lc:
            r7.LLJJIJIIJIL = r0
            if (r3 == 0) goto L97
            java.lang.String r0 = r3.hint
        L12:
            r7.LLJJIJIL = r0
            if (r3 == 0) goto L95
            java.lang.String r0 = r3.hintInText
        L18:
            r7.LLJJJ = r0
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r1 = r8.LLILLL
            java.lang.String r0 = r7.LLILLJJLI
            r7.LLJJJIL = r0
            if (r3 == 0) goto L24
            java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage> r2 = r3.images
        L24:
            r7.LLJJJJ = r2
            boolean r0 = X.C1858670yT3.LJIIJJI(r1)
            r7.LLJJJJJIL = r0
            r5 = 1
            if (r2 == 0) goto L93
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L93
            r0 = 0
        L36:
            r0 = r0 ^ 1
            r7.LLJJJJLIIL = r0
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r4 = r7.LLILZLL
            r6 = 1091567616(0x41100000, float:9.0)
            if (r4 == 0) goto L90
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMultiModalInfo r0 = r4.multiModalInfo
            if (r0 == 0) goto L90
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoImageRatio r0 = r0.genImageRatio
            if (r0 == 0) goto L90
            int r0 = r0.width
            float r1 = (float) r0
        L4b:
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L51
            r6 = r1
        L51:
            r2 = 1098907648(0x41800000, float:16.0)
            if (r4 == 0) goto L8c
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMultiModalInfo r0 = r4.multiModalInfo
            if (r0 == 0) goto L8c
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoImageRatio r0 = r0.genImageRatio
            if (r0 == 0) goto L8c
            int r0 = r0.height
            float r1 = (float) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L8e
        L64:
            float r6 = r6 / r2
            r7.LLJJL = r6
            if (r4 == 0) goto L6f
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMultiModalInfo r0 = r4.multiModalInfo
            if (r0 == 0) goto L6f
            int r5 = r0.genImageNum
        L6f:
            r7.LLJJLIIIJLLLLLLLZ = r5
            if (r4 == 0) goto L89
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMultiModalInfo r0 = r4.multiModalInfo
            if (r0 == 0) goto L89
            long r0 = r0.genImageDuration
        L79:
            r7.LLJL = r0
            kotlin.jvm.internal.AwS571S0100000_27 r1 = new kotlin.jvm.internal.AwS571S0100000_27
            r0 = 1163(0x48b, float:1.63E-42)
            r1.<init>(r7, r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r1)
            r7.LLJLIL = r0
            return
        L89:
            r0 = 0
            goto L79
        L8c:
            r1 = 1098907648(0x41800000, float:16.0)
        L8e:
            r2 = r1
            goto L64
        L90:
            r1 = 1091567616(0x41100000, float:9.0)
            goto L4b
        L93:
            r0 = 1
            goto L36
        L95:
            r0 = r2
            goto L18
        L97:
            r0 = r2
            goto L12
        L9a:
            r0 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1857830yRh.<init>(X.0Cre):void");
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1857830yRh) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LLJJJJ, ((C1857830yRh) interfaceC1891350zJl).LLJJJJ)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858660yT2) {
            return Intrinsics.LJFF(this.LLILLJJLI, ((C1858660yT2) interfaceC1891350zJl).LLILLJJLI);
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
