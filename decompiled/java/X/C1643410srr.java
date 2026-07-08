package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0srr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643410srr implements InterfaceC1622430sK1 {
    public final InterfaceC1650190t2n LIZ;
    public final C1643420srs LIZIZ = new C1643420srs();

    @Override // X.InterfaceC1622430sK1
    public final UploadableMobileEffect2 LIZIZ(List<UploadableMobileEffect2> list) {
        return null;
    }

    public C1643410srr(InterfaceC1650190t2n interfaceC1650190t2n) {
        this.LIZ = interfaceC1650190t2n;
    }

    @Override // X.InterfaceC1622430sK1
    public final C1622440sK2 LIZLLL(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2) {
        AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 1187);
        C1446130njf.LIZ.getClass();
        if (Intrinsics.LJFF(C1446130njf.LJIIJ(effect, "exportTiming"), "recordStop")) {
            return new C1622440sK2(awS569S0100000_25, 1, C1446810nkl.LIZ(effect, uploadableMobileEffect2));
        }
        return new C1622440sK2(awS569S0100000_25, 0, C1446810nkl.LIZ(effect, uploadableMobileEffect2));
    }

    @Override // X.InterfaceC1622430sK1
    public final Object LIZJ(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2, InterfaceC1364105Vn<? super UIAnnotationErrorCode> interfaceC1364105Vn) {
        this.LIZIZ.LL.setValue(Boolean.FALSE);
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C2440409hK(effect, uploadableMobileEffect2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    @Override // X.InterfaceC1622430sK1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r17, com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2 r18, android.graphics.Bitmap r19, X.InterfaceC1364105Vn r20) {
        /*
            r16 = this;
            r3 = r20
            r13 = r19
            r11 = r17
            r14 = r18
            boolean r0 = r3 instanceof X.C1643400srq
            r12 = r16
            if (r0 == 0) goto Lb4
            r4 = r3
            X.0srq r4 = (X.C1643400srq) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L1c:
            java.lang.Object r1 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            java.lang.String r5 = "DiyProp"
            r2 = 2
            r15 = 0
            r9 = 1
            if (r0 == 0) goto L35
            if (r0 == r9) goto L91
            if (r0 != r2) goto Lbb
            X.C155000ia.LIZIZ(r1)
        L32:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L35:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = "before shotFromCamera"
            X.C201955140j.LIZIZ(r5, r0)
            if (r13 != 0) goto L9b
            r4.LL = r11
            r4.LLILLJJLI = r14
            r4.LLILZIL = r9
            X.099m r8 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r8.<init>(r0)
            X.0sqG r0 = X.C1642420sqG.LIZ()
            com.ss.android.vesdk.VERecorder r7 = r0.LIZIZ()
            if (r7 == 0) goto L8a
            X.0sru r10 = new X.0sru
            r10.<init>()
            com.ss.android.vesdk.VESize r6 = new com.ss.android.vesdk.VESize
            r1 = 720(0x2d0, float:1.009E-42)
            r0 = 1280(0x500, float:1.794E-42)
            r6.<init>(r1, r0)
            X.1AO5 r1 = r10.LIZ
            r1.LIZ = r6
            r1.LIZIZ = r9
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            r1.LJ = r0
            X.09oJ r0 = new X.09oJ
            r0.<init>()
            r1.LJIIIIZZ = r0
            r7.LJJIJIIJIL(r1)
        L7a:
            java.lang.Object r1 = r8.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L87
            X.C099Q.LIZJ(r4)
        L87:
            if (r1 != r3) goto L98
            return r3
        L8a:
            X.C189200o6.m2constructorimpl(r15)
            r8.resumeWith(r15)
            goto L7a
        L91:
            com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2 r14 = r4.LLILLJJLI
            com.ss.android.ugc.effectmanager.effect.model.Effect r11 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L98:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r13 = r1
        L9b:
            java.lang.String r0 = "after shotFromCamera"
            X.C201955140j.LIZIZ(r5, r0)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.0srn r10 = new X.0srn
            r10.<init>(r11, r12, r13, r14, r15)
            r4.LL = r15
            r4.LLILLJJLI = r15
            r4.LLILZIL = r2
            java.lang.Object r0 = X.C23250099c.LJI(r4, r0, r10)
            if (r0 != r3) goto L32
            return r3
        Lb4:
            X.0srq r4 = new X.0srq
            r4.<init>(r12, r3)
            goto L1c
        Lbb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1643410srr.LIZ(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2, android.graphics.Bitmap, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1622430sK1
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        this.LIZIZ.onMessageReceived(i, i2, i3, str);
    }
}
