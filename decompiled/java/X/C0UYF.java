package X;

import Y.ACListenerS84S1100000_12;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.IllegalReviewDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0UYF, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UYF implements C0UVU, C0UU7 {
    public final Context LL;
    public final DataChannel LLILLJJLI;
    public final C0UZ4 LLILLL;
    public IllegalReviewDialog LLILZ;
    public final C0UVT LLILZIL;
    public final C19EG LLILZLL;
    public boolean LLIZ;

    @Override // X.C0UVU
    public final void DE(boolean z) {
    }

    @Override // X.C0UVU
    public final void GK() {
        C766270U4b.LJFF(2131853517, this.LL);
    }

    @Override // X.C0UVU
    public final void UI() {
        C773220UUu c773220UUu = C773220UUu.LIZ;
        AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(20);
        c773220UUu.getClass();
        C773220UUu.LJIIL(aFwS245S0000000_12);
        this.LLILLL.uI(10004);
        this.LLILLL.Vf(8, CertProviderManagerKt.findCert("bpea-580", 1476788483));
    }

    @Override // X.C0UVU
    public final void cG() {
        FragmentManager fragmentManager;
        if (this.LLIZ || this.LLILZLL == null || (fragmentManager = (FragmentManager) this.LLILLJJLI.gg0(C748880TZe.class)) == null) {
            return;
        }
        IllegalReviewDialog illegalReviewDialog = this.LLILZ;
        if (illegalReviewDialog == null) {
            Context context = this.LL;
            C0UVT c0uvt = this.LLILZIL;
            illegalReviewDialog = new IllegalReviewDialog();
            illegalReviewDialog.LL = context;
            illegalReviewDialog.LLJILJIL = c0uvt;
            C0UVT c0uvt2 = this.LLILZIL;
            if (c0uvt2 != null) {
                c0uvt2.LLJI = illegalReviewDialog;
            }
            illegalReviewDialog.show(fragmentManager, "IllegalReviewDialog");
        }
        this.LLILZ = illegalReviewDialog;
    }

    @Override // X.C0UVU
    public final void f5() {
        if (this.LLIZ) {
            return;
        }
        new DialogC778400UgA(this.LLILZLL).LJL(new ACListenerS84S1100000_12(this, 0));
    }

    @Override // X.C0UVU
    public final void EB(CharSequence charSequence) {
        if (this.LLIZ) {
            return;
        }
        new DialogC778400UgA(this.LLILZLL).LLJIJIL.setText(charSequence);
    }

    @Override // X.C0UVU
    public final void hM(CharSequence charSequence) {
        if (this.LLIZ) {
            return;
        }
        new DialogC778400UgA(this.LLILZLL).LLJI.setText(charSequence);
    }

    @Override // X.C0UVU
    public final void Lj(String str, boolean z) {
        if (this.LLIZ) {
            return;
        }
        DialogC778400UgA dialogC778400UgA = new DialogC778400UgA(this.LLILZLL);
        dialogC778400UgA.LLJILJIL.setEnabled(z);
        dialogC778400UgA.LLJILJIL.setText(str);
    }

    public C0UYF(Room room, Context context, DataChannel dataChannel, C0UZ4 c0uz4) {
        this.LL = context;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = c0uz4;
        this.LLILZLL = C500260Jjc.LJ(context);
        C0UVT c0uvt = new C0UVT(room.getId());
        c0uvt.attachView(this);
        this.LLILZIL = c0uvt;
    }
}
