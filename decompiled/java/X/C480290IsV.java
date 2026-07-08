package X;

import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.LivePlayActivity;

/* JADX INFO: renamed from: X.0IsV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480290IsV implements InterfaceC479830Irl<Intent> {
    public final Intent LIZ;
    public final /* synthetic */ LivePlayActivity LIZIZ;

    @Override // X.InterfaceC479830Irl
    public final Parcelable LIZ() {
        Intent intent = this.LIZ;
        if (intent != null) {
            return intent.getParcelableExtra("host_room_status_event");
        }
        return null;
    }

    @Override // X.InterfaceC479830Irl
    public final boolean LIZLLL() {
        return this.LIZ != null;
    }

    @Override // X.InterfaceC479830Irl
    public final void LIZIZ(String str) {
        Intent intent = this.LIZ;
        if (intent != null) {
            intent.putExtra("back_router_schema", str);
        }
    }

    @Override // X.InterfaceC479830Irl
    public final void LIZJ(long j) {
        Intent intent = this.LIZ;
        if (intent != null) {
            intent.putExtra("intent_first_enter_room_id", j);
        }
    }

    @Override // X.InterfaceC479830Irl
    public final void LJ(Intent intent) {
        this.LIZIZ.setIntent(intent);
    }

    @Override // X.InterfaceC479830Irl
    public final boolean getBooleanValue(String str) {
        Intent intent = this.LIZ;
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra(str, false);
    }

    @Override // X.InterfaceC479830Irl
    public final int getIntValue(String str) {
        Intent intent = this.LIZ;
        if (intent == null) {
            return -1;
        }
        return intent.getIntExtra(str, -1);
    }

    @Override // X.InterfaceC479830Irl
    public final long getLongValue(String str) {
        Intent intent = this.LIZ;
        if (intent == null) {
            return 0L;
        }
        return intent.getLongExtra(str, 0L);
    }

    @Override // X.InterfaceC479830Irl
    public final String getStringValue(String str) {
        Intent intent = this.LIZ;
        if (intent != null) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public C480290IsV(LivePlayActivity livePlayActivity, boolean z, Intent intent) {
        this.LIZIZ = livePlayActivity;
        this.LIZ = z ? livePlayActivity.getIntent() : intent;
    }
}
