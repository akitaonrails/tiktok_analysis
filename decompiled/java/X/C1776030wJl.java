package X;

import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776030wJl implements OnActivityResultCallback {
    public final int $t;
    public Object l0;

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (this.$t) {
            case 0:
                onActivityResult$0(this, i, i2, intent);
                break;
            case 1:
                onActivityResult$1(this, i, i2, intent);
                break;
            case 2:
                onActivityResult$2(this, i, i2, intent);
                break;
        }
    }

    public C1776030wJl(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onActivityResult$0(C1776030wJl c1776030wJl, int i, int i2, Intent intent) {
        C1775740wJI c1775740wJI = (C1775740wJI) c1776030wJl.l0;
        if (i2 == -1) {
            ((StickerPropDetailFragment) c1775740wJI.l0).nS(false);
        } else {
            c1775740wJI.getClass();
        }
    }

    public static final void onActivityResult$1(C1776030wJl c1776030wJl, int i, int i2, Intent intent) {
        if (i2 == -1) {
            ((Function0) c1776030wJl.l0).invoke();
        }
    }

    public static final void onActivityResult$2(C1776030wJl c1776030wJl, int i, int i2, Intent intent) {
        if (i2 == -1 && i == 1001) {
            ((Function0) c1776030wJl.l0).invoke();
        }
    }
}
