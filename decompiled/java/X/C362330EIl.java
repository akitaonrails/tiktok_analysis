package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;

/* JADX INFO: renamed from: X.0EIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362330EIl implements C0EIS {
    public final C0E48 LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final LifecycleOwner LIZJ;

    @Override // X.C0EIS
    public final Function1<C0EIO, Boolean> LIZIZ() {
        return AFwS234S0000000_5.get$arr$(595);
    }

    @Override // X.C0EIS
    public final void LIZ(C0EFH c0efh, AwS406S0200000_5 awS406S0200000_5) {
        C01TT.LIZLLL(new AwS406S0200000_5(this, awS406S0200000_5, 168));
    }

    public C362330EIl(C0E48 c0e48, VideoPublishEditModel videoPublishEditModel, LifecycleOwner lifecycleOwner) {
        this.LIZ = c0e48;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = lifecycleOwner;
    }
}
