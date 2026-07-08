package X;

import Y.ARunnableS53S0300000_20;
import Y.ARunnableS75S0200000_6;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0kkw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331600kkw extends C0HWE<Void> {
    public final /* synthetic */ InterfaceC605070NoH LIZ;
    public final /* synthetic */ C1331580kku LIZIZ;

    @Override // X.C0HWE
    public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
        C1331710kl7.LIZ(this.LIZIZ.LIZ);
        if (this.LIZ == null) {
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailureImpl ex=");
        sbLIZ.append(interfaceC1320200kSY.LIZLLL());
        C1330590kjJ.LJFF("FrescoImageLoaderImpl", "download", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.onFailed(interfaceC1320200kSY.LIZLLL());
    }

    @Override // X.C0HWE
    public final void LJFF(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
        C1331710kl7.LIZ(this.LIZIZ.LIZ);
        if (this.LIZ == null || !interfaceC1320200kSY.LIZ()) {
            return;
        }
        C1331580kku c1331580kku = this.LIZIZ;
        c1331580kku.LIZJ.mCache.LJIIIIZZ(c1331580kku.LIZIZ, new InterfaceC442640HXi<File>() { // from class: X.0kkx
            @Override // X.InterfaceC442640HXi
            public final void onResult(File file) {
                File file2 = file;
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCompleted image path=");
                sbLIZ.append(file2);
                C1330590kjJ.LIZ(this.LIZ.LIZIZ.LIZ.hashCode(), "FrescoImageLoaderImpl", "download", C2188811AlT.LIZIZ(sbLIZ));
                if (file2 != null) {
                    C1331580kku c1331580kku2 = this.LIZ.LIZIZ;
                    c1331580kku2.LIZJ.getCallbackExecutor(c1331580kku2.LIZ).execute(new ARunnableS75S0200000_6(this.LIZ.LIZ, file2, 71));
                    return;
                }
                C1331580kku c1331580kku3 = this.LIZ.LIZIZ;
                C592490NLr c592490NLrLIZ = C1324810kZz.LJI().LIZ(FrescoImageLoaderImpl.buildImageRequest(c1331580kku3.LIZ, c1331580kku3.LIZIZ), null);
                C1331840klK c1331840klK = C1331980klY.LIZ;
                C1331600kkw c1331600kkw = this.LIZ;
                C1331580kku c1331580kku4 = c1331600kkw.LIZIZ;
                C1331690kl5 c1331690kl5 = new C1331690kl5(c1331580kku4.LIZJ, c1331580kku4.LIZ, c1331600kkw.LIZ);
                c1331840klK.getClass();
                if (((LinkedList) c1331840klK.LIZIZ).remove(c592490NLrLIZ)) {
                    C823050WQl.LIZLLL().execute(new ARunnableS53S0300000_20(c1331840klK, c592490NLrLIZ, c1331690kl5, 20));
                    return;
                }
                List<SoftReference<InterfaceC1331960klW>> linkedList = c1331840klK.LIZ.get(c592490NLrLIZ);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                    c1331840klK.LIZ.put(c592490NLrLIZ, linkedList);
                }
                linkedList.add(new SoftReference<>(c1331690kl5));
            }
        });
    }

    public C1331600kkw(C1331580kku c1331580kku, InterfaceC605070NoH interfaceC605070NoH) {
        this.LIZIZ = c1331580kku;
        this.LIZ = interfaceC605070NoH;
    }
}
