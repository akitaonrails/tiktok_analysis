package X;

import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.11Wn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19514711Wn {
    public static final C19514811Wo LIZIZ = new C19514811Wo();
    public static final LinkedList<AbstractC19515011Wq> LIZJ = new LinkedList<>();
    public static final LinkedList<AbstractC19515011Wq> LIZLLL = new LinkedList<>();
    public static final LinkedList<AbstractC19515011Wq> LJ = new LinkedList<>();
    public static boolean LJFF;
    public final C19514511Wl LIZ;

    public static final C19514711Wn LIZLLL(Activity activity, Cert cert) {
        return LIZIZ.LIZIZ(activity, cert);
    }

    public final C19514511Wl LIZ(AbstractC19515011Wq abstractC19515011Wq) {
        C19514511Wl c19514511Wl = this.LIZ;
        c19514511Wl.LIZJ.LIZ(abstractC19515011Wq);
        return c19514511Wl;
    }

    public final C19514511Wl LIZIZ(String... strArr) {
        C19514511Wl c19514511Wl = this.LIZ;
        c19514511Wl.LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length));
        return c19514511Wl;
    }

    public final void LIZJ(InterfaceC19515111Wr interfaceC19515111Wr) {
        this.LIZ.LIZJ(interfaceC19515111Wr);
    }

    public C19514711Wn(Activity activity, Cert cert) {
        C19514511Wl c19514511Wl = new C19514511Wl(cert);
        c19514511Wl.LIZIZ = new WeakReference<>(activity);
        c19514511Wl.LIZJ.LJ = new WeakReference<>(activity);
        this.LIZ = c19514511Wl;
    }
}
