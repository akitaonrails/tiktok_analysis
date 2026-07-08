package X;

import android.view.View;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0zig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906800zig extends AbstractC431450Gvv {
    public final User LLILZ;
    public final int LLILZIL;
    public final InterfaceC1906810zih LLILZLL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.LLILZLL.LIZ(view, this.LLILZ, this.LLILZIL);
    }

    public C1906800zig(User user, int i, int i2, int i3, InterfaceC1906810zih interfaceC1906810zih) {
        super(i2, i3);
        this.LLILZ = user;
        this.LLILZIL = i;
        this.LLILZLL = interfaceC1906810zih;
    }
}
