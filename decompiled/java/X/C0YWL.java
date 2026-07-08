package X;

import android.content.Context;
import com.bytedance.tts.pigeon.GECPigeon;
import com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi;

/* JADX INFO: renamed from: X.0YWL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YWL implements InterfaceC870790YEb {
    public final /* synthetic */ C0YWJ LIZ;

    @Override // X.InterfaceC870790YEb
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC870790YEb
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC870790YEb
    public final boolean LIZ() {
        return this.LIZ.LIZIZ.LIZ();
    }

    @Override // X.InterfaceC870790YEb
    public final Context getApplicationContext() {
        GECPigeon.Companion.getClass();
        return C872060YIy.LIZ().getApplicationContext();
    }

    @Override // X.InterfaceC870790YEb
    public final String getSecUid() {
        return this.LIZ.LIZIZ.getSecUid();
    }

    @Override // X.InterfaceC870790YEb
    public final String getToken() {
        C2252321DDq c2252321DDqLJJJJI;
        C0YWT c0ywt;
        String str;
        PigeonIMLoginStateComponentApi pigeonIMLoginStateComponentApiLJFF = this.LIZ.LJFF();
        return (pigeonIMLoginStateComponentApiLJFF == null || (c2252321DDqLJJJJI = pigeonIMLoginStateComponentApiLJFF.LJJJJI()) == null || (c0ywt = (C0YWT) c2252321DDqLJJJJI.getValue()) == null || (str = c0ywt.LIZIZ) == null) ? "" : str;
    }

    @Override // X.InterfaceC870790YEb
    public final long getUid() {
        C2252321DDq c2252321DDqLJJJJI;
        C0YWT c0ywt;
        String str;
        Long lLJIILIIL;
        PigeonIMLoginStateComponentApi pigeonIMLoginStateComponentApiLJFF = this.LIZ.LJFF();
        if (pigeonIMLoginStateComponentApiLJFF == null || (c2252321DDqLJJJJI = pigeonIMLoginStateComponentApiLJFF.LJJJJI()) == null || (c0ywt = (C0YWT) c2252321DDqLJJJJI.getValue()) == null || (str = c0ywt.LIZJ) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null) {
            return 0L;
        }
        return lLJIILIIL.longValue();
    }

    @Override // X.InterfaceC870790YEb
    public final boolean isAppBackground() {
        return this.LIZ.LIZIZ.isAppBackground();
    }

    public C0YWL(C0YWJ c0ywj) {
        this.LIZ = c0ywj;
    }
}
