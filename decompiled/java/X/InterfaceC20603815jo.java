package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.15jo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20603815jo {
    int LLIL(InterfaceC1906710ziX interfaceC1906710ziX);

    C20603715jn LLILZLL();

    int LLIZ(InterfaceC1906710ziX interfaceC1906710ziX);

    Context getContext();

    C19EG getCurrentActivity();

    Fragment getCurrentFragment();

    int getItemCount();

    LifecycleOwner getLifecycleOwner();

    void preload();
}
