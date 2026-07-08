package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742090T9b extends C09AY implements Function0<Integer> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ String LLILLJJLI = "broadcast_type";
    public final /* synthetic */ int LLILLL = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C742090T9b(Fragment fragment) {
        super(0);
        this.LL = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        C19EG activity;
        Intent intent;
        Fragment fragment = this.LL;
        if (fragment == null || (activity = fragment.getActivity()) == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        return Integer.valueOf(intent.getIntExtra(this.LLILLJJLI, this.LLILLL));
    }
}
