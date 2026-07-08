package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.0fqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1142660fqC implements InterfaceC1320650kTH<InterfaceC1330440kj4> {
    public final ImageModel LIZ;
    public final InterfaceC1142670fqD LIZIZ;

    @Override // X.InterfaceC1320650kTH
    public final void LIZ(String str, Throwable th) {
    }

    @Override // X.InterfaceC1320650kTH
    public final void LIZIZ(String str) {
    }

    public C1142660fqC(ImageModel imageModel, InterfaceC1142670fqD interfaceC1142670fqD) {
        this.LIZ = imageModel;
        this.LIZIZ = interfaceC1142670fqD;
    }

    @Override // X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        String str2;
        ImageModel imageModel = this.LIZ;
        if (imageModel != null && imageModel.getUrls().size() != 0) {
            str2 = (String) ListProtector.get(this.LIZ.getUrls(), 0);
        } else {
            str2 = null;
        }
        InterfaceC1142670fqD interfaceC1142670fqD = this.LIZIZ;
        if (interfaceC1142670fqD != null) {
            interfaceC1142670fqD.LIZLLL(str2, new RuntimeException(th));
        }
    }

    @Override // X.InterfaceC1320650kTH
    public final void LJFF(Object obj, String str) {
        InterfaceC1142670fqD interfaceC1142670fqD = this.LIZIZ;
        if (interfaceC1142670fqD != null) {
            interfaceC1142670fqD.LIZ();
        }
    }

    @Override // X.InterfaceC1320650kTH
    public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // X.InterfaceC1320650kTH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r5, X.InterfaceC1330440kj4 r6, android.graphics.drawable.Animatable r7) {
        /*
            r4 = this;
            X.0kj4 r6 = (X.InterfaceC1330440kj4) r6
            r3 = -1
            if (r6 == 0) goto L38
            int r2 = r6.getWidth()
            int r3 = r6.getHeight()
        Ld:
            com.bytedance.android.live.base.model.ImageModel r1 = r4.LIZ
            if (r1 == 0) goto L36
            r0 = 1
            r1.setLoaded(r0)
            com.bytedance.android.live.base.model.ImageModel r0 = r4.LIZ
            java.util.List r0 = r0.getUrls()
            int r0 = r0.size()
            if (r0 == 0) goto L36
            com.bytedance.android.live.base.model.ImageModel r0 = r4.LIZ
            java.util.List r1 = r0.getUrls()
            r0 = 0
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
        L2e:
            X.0fqD r0 = r4.LIZIZ
            if (r0 == 0) goto L35
            r0.LIZJ(r2, r3, r1)
        L35:
            return
        L36:
            r1 = 0
            goto L2e
        L38:
            r2 = -1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1142660fqC.LJ(java.lang.String, java.lang.Object, android.graphics.drawable.Animatable):void");
    }
}
