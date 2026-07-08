package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: renamed from: X.1BTa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205361BTa extends FrameLayout {
    public final C1BTP LL;

    public C2205361BTa(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.LL = new C1BTP(this, context, googleMapOptions);
        setClickable(true);
    }
}
