package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.social.creation.record.SocialRecordScene;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0uIJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698250uIJ implements C092O {
    public final int $t;
    public Object l0;

    @Override // X.C092O
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public C1698250uIJ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(C1698250uIJ c1698250uIJ, Object obj) {
        ((MutableLiveData) c1698250uIJ.l0).setValue(C1641640sp0.LIZLLL(EnumC1641550sor.SUCCESS, obj));
    }

    public static final void accept$1(C1698250uIJ c1698250uIJ, Object obj) {
        ((C2254091DKl) obj).LJJIIJZLJL = new AwS569S0100000_25((SocialRecordScene) c1698250uIJ.l0, 1104);
    }
}
