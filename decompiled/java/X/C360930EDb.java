package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS103S0400000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360930EDb implements InterfaceC360550EBp {
    public boolean LIZ;
    public final /* synthetic */ C360920EDa LIZIZ;
    public final /* synthetic */ C360690ECd LIZJ;

    @Override // X.InterfaceC360550EBp
    public final AbstractC360500EBk LIZ(C357590E0f c357590E0f) {
        boolean z;
        if (C360510EBl.LIZ(c357590E0f.LIZIZ)) {
            VideoPublishEditModel videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL();
            C360920EDa c360920EDa = this.LIZIZ;
            C378420Esa c378420Esa = new C378420Esa(videoPublishEditModelLLLLLJIL, c360920EDa.LLJJJJJIL, c360920EDa.LLJJJJLIIL, new AwS584S0100000_5(c360920EDa, 399));
            c378420Esa.LLLIZZ = new C361050EDn(this.LIZIZ);
            return c378420Esa;
        }
        VideoPublishEditModel videoPublishEditModelLLLLLJIL2 = C0FC9.LLLLLJIL();
        String str = c357590E0f.LIZIZ;
        if (str == null) {
            str = "";
        }
        if (this.LIZJ.getCategoryList().size() > 1 && C301740BsC.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        C360920EDa c360920EDa2 = this.LIZIZ;
        C0EBX c0ebx = new C0EBX(videoPublishEditModelLLLLLJIL2, str, z, c360920EDa2.LLJJJJJIL, c360920EDa2.LLJJJJLIIL);
        c0ebx.LLJJIJIIJIL = new AwS103S0400000_5(this.LIZIZ, this.LIZJ, c357590E0f, this, 1);
        return c0ebx;
    }

    public C360930EDb(C360920EDa c360920EDa, C360690ECd c360690ECd) {
        this.LIZIZ = c360920EDa;
        this.LIZJ = c360690ECd;
    }
}
