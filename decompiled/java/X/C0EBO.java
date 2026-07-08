package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EBO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EBO implements InterfaceC360550EBp {
    public boolean LIZ;
    public final /* synthetic */ C360690ECd LIZIZ;
    public final /* synthetic */ C0EBN LIZJ;

    @Override // X.InterfaceC360550EBp
    public final AbstractC360500EBk LIZ(C357590E0f c357590E0f) {
        C357590E0f next;
        boolean z;
        boolean z2;
        String str;
        Iterator<C357590E0f> it2 = this.LIZIZ.getCategoryList().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!(!Intrinsics.LJFF(next.LIZIZ, "Favorite")));
        C357590E0f c357590E0f2 = next;
        if (c357590E0f2 != null && (str = c357590E0f2.LIZIZ) != null && Intrinsics.LJFF(c357590E0f.LIZIZ, str)) {
            z = true;
        } else {
            z = false;
        }
        VideoPublishEditModel videoPublishEditModelLLLLLJIL = C0FC9.LLLLLJIL();
        String str2 = c357590E0f.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        if (this.LIZIZ.getCategoryList().size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0EBN c0ebn = this.LIZJ;
        C0EBP c0ebp = new C0EBP(videoPublishEditModelLLLLLJIL, str2, z2, c0ebn.LLJJJJJIL, c0ebn.LLJJJJLIIL, c0ebn.LLJJL, z);
        c0ebp.LLJJIJIIJIL = new AwS371S0200000_5(this, this.LIZJ, 80);
        return c0ebp;
    }

    public C0EBO(C0EBN c0ebn, C360690ECd c360690ECd) {
        this.LIZIZ = c360690ECd;
        this.LIZJ = c0ebn;
    }
}
