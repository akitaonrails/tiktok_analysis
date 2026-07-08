package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.0jhH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290890jhH implements InterfaceC1290730jh1<String> {
    public final /* synthetic */ C1290850jhD LIZ;

    @Override // X.InterfaceC1290730jh1
    public final void onFailed() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch polyfill bitmap ");
        sbLIZ.append(this.LIZ.LLLZIIL);
        sbLIZ.append(" failed");
        this.LIZ.LJZ("error", C1290850jhD.LJLLILLLL(1, C2188811AlT.LIZIZ(sbLIZ)));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetch polyfill Bitmap mSrcUrl=");
        sbLIZ2.append((Object) this.LIZ.LLLLZIL);
        sbLIZ2.append(", filePath=");
        sbLIZ2.append(this.LIZ.LLLZIIL);
        sbLIZ2.append(" not exists.");
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C1290890jhH(C1290850jhD c1290850jhD) {
        this.LIZ = c1290850jhD;
    }

    @Override // X.InterfaceC1290730jh1
    public final void onSuccess(String str) throws JSONException {
        int frame;
        float f;
        C1291600jiQ composition;
        C1290850jhD c1290850jhD = this.LIZ;
        C1291330jhz c1291330jhz = (C1291330jhz) c1290850jhD.LLLLLILLIL;
        if (c1291330jhz == null) {
            frame = 0;
        } else {
            frame = c1291330jhz.getFrame();
        }
        C1291330jhz c1291330jhz2 = (C1291330jhz) this.LIZ.LLLLLILLIL;
        if (c1291330jhz2 != null && (composition = c1291330jhz2.getComposition()) != null) {
            f = composition.LJIIJ - composition.LJIIIZ;
        } else {
            f = 0.0f;
        }
        C1290850jhD c1290850jhD2 = this.LIZ;
        c1290850jhD.LJZ("ready", C1290850jhD.LJLLI(frame, (int) f, c1290850jhD2.LLLLZ, c1290850jhD2.LLLZI));
        C1290850jhD c1290850jhD3 = this.LIZ;
        c1290850jhD3.LLLZLL.LIZ(c1290850jhD3.LLLLZLL);
        C1290850jhD c1290850jhD4 = this.LIZ;
        if (c1290850jhD4.LLLLLLZ && c1290850jhD4.LLLZ) {
            ((C1291330jhz) c1290850jhD4.LLLLLILLIL).playAnimation();
        }
    }
}
