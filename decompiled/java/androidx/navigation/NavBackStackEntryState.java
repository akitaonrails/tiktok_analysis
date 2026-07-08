package androidx.navigation;

import X.C20131713pr;
import X.C20135013qO;
import X.C20307314d5;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes31.dex */
public final class NavBackStackEntryState implements Parcelable {
    public final Bundle args;
    public final int destinationId;
    public final String id;
    public final Bundle savedState;
    public static final C20135013qO Companion = new Object() { // from class: X.13qO
    };
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new C20307314d5(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public NavBackStackEntryState(Parcel parcel) {
        this.id = parcel.readString();
        this.destinationId = parcel.readInt();
        this.args = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        this.savedState = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
    }

    public NavBackStackEntryState(NavBackStackEntry navBackStackEntry) {
        this.id = navBackStackEntry.LLILZLL;
        this.destinationId = navBackStackEntry.LLILLJJLI.LLIZLLLIL;
        this.args = navBackStackEntry.LLILLL;
        Bundle bundle = new Bundle();
        this.savedState = bundle;
        navBackStackEntry.LLJ.LIZIZ(bundle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.destinationId);
        parcel.writeBundle(this.args);
        parcel.writeBundle(this.savedState);
    }

    public final NavBackStackEntry LIZ(Context context, C20131713pr c20131713pr, Lifecycle.State state, NavControllerViewModel navControllerViewModel) {
        Bundle bundle = this.args;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return new NavBackStackEntry(context, c20131713pr, bundle, state, navControllerViewModel, this.id, this.savedState);
    }
}
