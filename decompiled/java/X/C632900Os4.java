package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.ss.android.ugc.aweme.profilerec.vm.ProfileRecViewModel;

/* JADX INFO: renamed from: X.0Os4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632900Os4 extends C632910Os5 {
    public final ProfileRecViewModel LL;

    public C632900Os4(ProfileRecViewModel profileRecViewModel) {
        this.LL = profileRecViewModel;
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ProfileRecViewModel profileRecViewModel = this.LL;
        if (profileRecViewModel.LLJI.incrementAndGet() == profileRecViewModel.LLJ && !profileRecViewModel.LLJILJILJ.getAndSet(true)) {
            C632880Os2 c632880Os2 = ((C632950Os9) profileRecViewModel.LLILLL.getValue()).LIZ;
            String str = c632880Os2.LIZ;
            String strLIZJ = c632880Os2.LIZJ();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("author_id", str);
            c2344009Gk.LJIIIIZZ("item_id", strLIZJ);
            C20684815ws.LJIILLIIL("friend_reco_card_load", c2344009Gk.LIZ);
        }
    }
}
