package X;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import java.util.UUID;

/* JADX INFO: renamed from: X.128e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197062128e {
    public static NavBackStackEntry LIZ(Context context, C20131713pr c20131713pr, Bundle bundle, Lifecycle.State state, NavControllerViewModel navControllerViewModel) {
        return new NavBackStackEntry(context, c20131713pr, bundle, state, navControllerViewModel, UUID.randomUUID().toString(), null);
    }
}
