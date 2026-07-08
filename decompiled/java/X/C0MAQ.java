package X;

import android.widget.VideoView;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MAQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MAQ extends C09AY implements InterfaceC1631620sYq<InterfaceC1668850tWt, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ SocMediaResource LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C259800zU<VideoView> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MAQ(SocMediaResource socMediaResource, boolean z, C259800zU<VideoView> c259800zU) {
        super(3);
        this.LL = socMediaResource;
        this.LLILLJJLI = z;
        this.LLILLL = c259800zU;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    @Override // X.InterfaceC1631620sYq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.InterfaceC1668850tWt r13, X.InterfaceC1680500tpg r14, java.lang.Integer r15) {
        /*
            r12 = this;
            r8 = r14
            X.0tWt r13 = (X.InterfaceC1668850tWt) r13
            X.0tpg r8 = (X.InterfaceC1680500tpg) r8
            java.lang.Number r15 = (java.lang.Number) r15
            int r1 = r15.intValue()
            r0 = r1 & 6
            if (r0 != 0) goto L17
            boolean r0 = r8.LJJIIJ(r13)
            if (r0 == 0) goto Lc0
            r0 = 4
        L16:
            r1 = r1 | r0
        L17:
            r1 = r1 & 19
            r0 = 18
            if (r1 != r0) goto L29
            boolean r0 = r8.LIZ()
            if (r0 == 0) goto L29
            r8.LIZJ()
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r3 = r12.LL
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r1 = r3.tiktokMediaModel
            int r0 = r1.width
            float r2 = (float) r0
            int r0 = r1.height
            float r4 = (float) r0
            boolean r0 = r3.LIZLLL()
            r3 = 0
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r0 = r12.LL
            java.lang.Integer r0 = r0.rotation
            if (r0 == 0) goto L48
            int r1 = r0.intValue()
            r0 = 90
            if (r1 == r0) goto L56
        L48:
            com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r0 = r12.LL
            java.lang.Integer r0 = r0.rotation
            if (r0 == 0) goto Lb7
            int r1 = r0.intValue()
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto Lb7
        L56:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 == 0) goto Lbd
            float r2 = r4 / r2
        L5c:
            long r0 = r13.LIZLLL()
            int r4 = X.C1682380tsi.LJII(r0)
            long r0 = r13.LIZLLL()
            int r3 = X.C1682380tsi.LJIIIIZZ(r0)
            int r0 = r3 / r4
            float r0 = (float) r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lb0
            float r0 = (float) r4
            float r0 = r0 * r2
            int r3 = X.C814420VxA.LIZIZ(r0)
        L79:
            X.0tyA r9 = X.InterfaceC1685750ty9.LIZ
            X.0MAM r2 = new X.0MAM
            com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource r5 = r12.LL
            boolean r6 = r12.LLILLJJLI
            X.00zU<android.widget.VideoView> r7 = r12.LLILLL
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 1849434622(0x6e3c21fe, float:1.4556069E28)
            r8.LJJIIJZLJL(r0)
            java.lang.Object r11 = r8.LJJ()
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r11 != r0) goto La2
            r0 = 130(0x82, float:1.82E-43)
            kotlin.jvm.internal.AFwS239S0000000_8 r11 = kotlin.jvm.internal.AFwS239S0000000_8.get$arr$(r0)
            r8.LJJIJIIJI(r11)
        La2:
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r8.LJ()
            r6 = 432(0x1b0, float:6.05E-43)
            r7 = 0
            r10 = r2
            X.C20084413iE.LIZ(r6, r7, r8, r9, r10, r11)
            goto L26
        Lb0:
            float r0 = (float) r3
            float r0 = r0 / r2
            int r4 = X.C814420VxA.LIZIZ(r0)
            goto L79
        Lb7:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 == 0) goto Lbd
            float r2 = r2 / r4
            goto L5c
        Lbd:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L5c
        Lc0:
            r0 = 2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MAQ.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
