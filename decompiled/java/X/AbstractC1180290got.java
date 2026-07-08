package X;

import android.view.View;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentModel;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0got, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1180290got<T> extends AbstractC1181640gr4 implements InterfaceC1181380gqe, InterfaceC1174010gel {
    public SlashComposeComponentModel LLILLJJLI;
    public T LLILLL;

    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJFF(InterfaceC1173990gej<?> interfaceC1173990gej) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJI(InterfaceC1173990gej<?> interfaceC1173990gej) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJII(InterfaceC1173990gej<?> interfaceC1173990gej) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJIIJJI(InterfaceC1173990gej<?> interfaceC1173990gej, BaseComponentData baseComponentData) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJJ(InterfaceC1173990gej<?> interfaceC1173990gej, View view) {
    }

    @Override // X.InterfaceC1174010gel
    public final void LJJI(InterfaceC1173990gej<?> interfaceC1173990gej, BaseComponentData baseComponentData) {
    }

    public abstract Class<?> LJJIFFI();

    public abstract String LJJIIJ();

    public abstract void LJJIIZI(Object obj, String str);

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void iM(C1180620gpQ c1180620gpQ, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void onSuccess(String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void up(SlashApiResponse slashApiResponse, String str) {
    }

    public final void LJJIJIIJIL(String str, final InterfaceC1180270gor interfaceC1180270gor) {
        C1186840gzS c1186840gzSLw1;
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null && (c1186840gzSLw1 = interfaceC1181010gq3.lw1()) != null) {
            c1186840gzSLw1.LIZIZ(str, new InterfaceC1180270gor(this) { // from class: X.0gop
                public final /* synthetic */ AbstractC1180290got<T> LL;

                @Override // X.InterfaceC1180270gor
                public void onEvent(AbstractC1186480gys abstractC1186480gys) {
                    AbstractC1157950gEr abstractC1157950gEr;
                    String str2 = null;
                    if ((abstractC1186480gys instanceof AbstractC1157950gEr) && (abstractC1157950gEr = (AbstractC1157950gEr) abstractC1186480gys) != null) {
                        str2 = abstractC1157950gEr.LL;
                    }
                    if (!Intrinsics.LJFF(str2, this.LL.LJJIIJ())) {
                        return;
                    }
                    interfaceC1180270gor.onEvent(abstractC1186480gys);
                }

                {
                    this.LL = this;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    @Override // X.InterfaceC1181380gqe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mC(X.C1180620gpQ r7, X.EnumC1181510gqr r8, boolean r9, java.lang.String r10) {
        /*
            r6 = this;
            r3 = 0
            if (r7 == 0) goto L5f
            java.util.List r0 = r7.LJ()
            if (r0 == 0) goto L5f
            java.util.Iterator r5 = r0.iterator()
        Ld:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r4 = r5.next()
            r2 = r4
            X.0gpu r2 = (X.C1180920gpu) r2
            com.ss.android.ugc.aweme.slash.component.BaseComponentData r1 = r2.LIZLLL
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentModel
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentModel r1 = (com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentModel) r1
            if (r1 == 0) goto L5b
            java.lang.String r1 = r1.bizName
        L26:
            java.lang.String r0 = r6.LJJIIJ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Ld
            X.0goZ r0 = r2.LIZIZ
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = "slash_compose"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Ld
        L3c:
            X.0gpu r4 = (X.C1180920gpu) r4
            if (r4 == 0) goto L5f
            com.ss.android.ugc.aweme.slash.component.BaseComponentData r2 = r4.LIZLLL
        L42:
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentModel
            if (r0 == 0) goto L97
            com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentModel r2 = (com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentModel) r2
            if (r2 == 0) goto L97
            com.google.gson.n r1 = r2.bizData
            com.ss.android.ugc.aweme.slash.component.compose.SlashComposeComponentModel r0 = r6.LLILLJJLI
            if (r0 == 0) goto L59
            com.google.gson.n r0 = r0.bizData
        L52:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L61
            return
        L59:
            r0 = r3
            goto L52
        L5b:
            r1 = r3
            goto L26
        L5d:
            r4 = r3
            goto L3c
        L5f:
            r2 = r3
            goto L42
        L61:
            r6.LLILLJJLI = r2
            r6.LLILLL = r3
            kotlin.jvm.internal.AwS562S0100000_18 r3 = new kotlin.jvm.internal.AwS562S0100000_18
            r0 = 2596(0xa24, float:3.638E-42)
            r3.<init>(r6, r0)
            X.0hZ0 r1 = new X.0hZ0
            r0 = 9
            r1.<init>(r6, r0)
            X.11LJ r1 = X.AbstractC19486711Lt.LJIIJJI(r1)
            X.11RO r0 = X.C11S5.LIZIZ
            X.11Lq r1 = r1.LJIJJLI(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11Ic r0 = r1.LJIILJJIL(r0)
            X.11Lf r2 = r0.LJIILL()
            X.0hZ0 r1 = new X.0hZ0
            r0 = 10
            r1.<init>(r3, r0)
            X.11Mr r0 = r2.LJII(r1)
            r0.LJIIZILJ()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1180290got.mC(X.0gpQ, X.0gqr, boolean, java.lang.String):void");
    }
}
