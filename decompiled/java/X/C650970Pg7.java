package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650970Pg7 implements C0QW5<C650970Pg7>, Serializable {
    public final C1345560l7S LL;
    public final String LLILLJJLI;
    public static final C650980Pg8 Companion = new C650980Pg8();
    public static final int $stable = 8;

    public C650970Pg7() {
        this(new C1345560l7S("", "", "", "", null, "", null, "", "", "", "", null, "", ""));
    }

    public static final C1345560l7S fetchOwnFragmentData(View view) {
        Companion.getClass();
        return C650980Pg8.LIZ(view);
    }

    public final C650970Pg7 copy(C1345560l7S c1345560l7S) {
        return new C650970Pg7(c1345560l7S);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C650970Pg7) && Intrinsics.LJFF(this.LL, ((C650970Pg7) obj).LL);
    }

    public int hashCode() {
        return this.LL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentLikeContextSource(fragmentData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1345560l7S getFragmentData() {
        return this.LL;
    }

    public String getSourceId() {
        return this.LLILLJJLI;
    }

    public C650970Pg7(C1345560l7S c1345560l7S) {
        this.LL = c1345560l7S;
        this.LLILLJJLI = UUID.randomUUID().toString();
    }

    public static final C1345560l7S fetchOwnFragmentData(Fragment fragment) {
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C650970Pg7 c650970Pg7;
        Companion.getClass();
        if (fragment == null || fragment.getContext() == null || (interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment, null)) == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLJFF, "source_default_key", C650970Pg7.class, null)) == null || (c650970Pg7 = (C650970Pg7) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return c650970Pg7.getFragmentData();
    }

    public static final void bindSource(LifecycleOwner lifecycleOwner, C650970Pg7 c650970Pg7) {
        Companion.getClass();
        if (lifecycleOwner instanceof Activity) {
            C646040PVq.LIZ(lifecycleOwner, c650970Pg7, C650970Pg7.class);
        } else {
            if (lifecycleOwner instanceof Fragment) {
                C1554960qZC.LIZ(C1558360qeg.LJFF((Fragment) lifecycleOwner, null), c650970Pg7, C650970Pg7.class, "source_default_key");
                return;
            }
            throw new RuntimeException("SearchContextSource not support this lifecycleOwner except Activity&Fragment");
        }
    }
}
