package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.live.LivePlayRootFragment;

/* JADX INFO: renamed from: X.0Ikh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475450Ikh implements InterfaceC479830Irl<Bundle> {
    public final Bundle LIZ;
    public final /* synthetic */ LivePlayRootFragment LIZIZ;

    @Override // X.InterfaceC479830Irl
    public final Parcelable LIZ() {
        Bundle bundle = this.LIZ;
        if (bundle != null) {
            return bundle.getParcelable("host_room_status_event");
        }
        return null;
    }

    @Override // X.InterfaceC479830Irl
    public final boolean LIZLLL() {
        return this.LIZ != null;
    }

    @Override // X.InterfaceC479830Irl
    public final void LIZIZ(String str) {
        Bundle bundle = this.LIZ;
        if (bundle != null) {
            C786410Ut5.LJJJI("back_router_schema", str, bundle);
        }
    }

    @Override // X.InterfaceC479830Irl
    public final void LIZJ(long j) {
        Bundle bundle = this.LIZ;
        if (bundle != null) {
            bundle.putLong("intent_first_enter_room_id", j);
        }
    }

    @Override // X.InterfaceC479830Irl
    public final void LJ(Bundle bundle) {
        this.LIZIZ.setArguments(bundle);
    }

    @Override // X.InterfaceC479830Irl
    public final boolean getBooleanValue(String str) {
        Bundle bundle = this.LIZ;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(str, false);
    }

    @Override // X.InterfaceC479830Irl
    public final int getIntValue(String str) {
        Bundle bundle = this.LIZ;
        if (bundle == null) {
            return -1;
        }
        return bundle.getInt(str, -1);
    }

    @Override // X.InterfaceC479830Irl
    public final long getLongValue(String str) {
        Bundle bundle = this.LIZ;
        if (bundle == null) {
            return 0L;
        }
        return bundle.getLong(str, 0L);
    }

    @Override // X.InterfaceC479830Irl
    public final String getStringValue(String str) {
        Bundle bundle = this.LIZ;
        if (bundle != null) {
            return bundle.getString(str);
        }
        return null;
    }

    public C475450Ikh(boolean z, LivePlayRootFragment livePlayRootFragment, Bundle bundle) {
        this.LIZIZ = livePlayRootFragment;
        this.LIZ = z ? livePlayRootFragment.getArguments() : bundle;
    }
}
