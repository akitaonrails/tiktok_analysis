package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0cQW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011420cQW implements InterfaceC1010250cOd {
    public final Aweme LIZ;
    public final Context LIZIZ;

    @Override // X.InterfaceC1010250cOd
    public final Aweme getAweme() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1010250cOd
    public final Context getContext() {
        return this.LIZIZ;
    }

    public C1011420cQW(Context context, Aweme aweme) {
        this.LIZ = aweme;
        this.LIZIZ = context;
    }
}
