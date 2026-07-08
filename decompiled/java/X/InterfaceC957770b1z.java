package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: renamed from: X.0b1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC957770b1z {
    void dismiss();

    boolean isVisible();

    void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener);

    void show(FragmentManager fragmentManager, String str);
}
