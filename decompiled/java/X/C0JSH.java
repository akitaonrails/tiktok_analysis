package X;

import Y.AfS176S0100000_7;
import com.bytedance.android.livesdk.microom.LiveMicRoomInfoDialog;
import com.bytedance.android.livesdk.microom.MicRoomApi;

/* JADX INFO: renamed from: X.0JSH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JSH extends C0JSV<C0JSJ> {
    public final C11NJ LL = new C11NJ();
    public LiveMicRoomInfoDialog LLILLJJLI;
    public boolean LLILLL;

    @Override // X.C0JSV
    public final void detachView() {
        super.detachView();
        this.LL.LJ();
    }

    public final void LJJJJLI(long j, long j2) {
        C11NJ c11nj = this.LL;
        C480460Ism.LIZ().getClass();
        c11nj.LIZ(((MicRoomApi) C480460Ism.LIZLLL(MicRoomApi.class)).getMicOfficeInfo(j, j2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 200), new AfS176S0100000_7(this, 201)));
    }
}
