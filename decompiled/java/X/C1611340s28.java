package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: renamed from: X.0s28, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611340s28 implements InterfaceC630530OoF {
    public AvatarComponentView LLILLJJLI;
    public Integer LLILLL;
    public InterfaceC1398730mVD LLILZ;
    public String LL = "";
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1732));

    @Override // X.InterfaceC630530OoF
    public final void Tn(UrlModel urlModel) {
        AvatarComponentView avatarComponentView;
        C427660Gpo avatar;
        if (urlModel != null && (avatarComponentView = this.LLILLJJLI) != null && (avatar = avatarComponentView.getAvatar()) != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModel.getUrlList()));
            c1331670kl3LJIIJ.LJJIIZ(R.drawable.bh6);
            avatar.LIZ(c1331670kl3LJIIJ.LIZJ());
        }
    }

    @Override // X.InterfaceC630530OoF
    public final void dm(LifecycleOwner lifecycleOwner) {
        AvatarComponentView avatarComponentView = this.LLILLJJLI;
        if (avatarComponentView != null) {
            C1608750rxx config = avatarComponentView.getConfig();
            new AwS603S0100000_24(lifecycleOwner, 501).invoke(config.LIZ);
            config.LIZJ(new C737760Swo(new C1606750ruj(EnumC1606080rte.MUSIC_COVER_AVATAR, new C1606770rul(null, null, null, new AwS638S0100000_24(this, 164), new AwS568S0100000_24(this, 1731), null, new AwS603S0100000_24(this, 502), null, null, 423), 4)));
            config.LIZIZ(AFwS264S0000000_24.get$arr$(605));
            avatarComponentView.LJFF(avatarComponentView.getConfig());
        }
    }

    @Override // X.InterfaceC630530OoF
    public final void wj(AvatarComponentView avatarComponentView, Integer num) {
        this.LLILLJJLI = avatarComponentView;
        this.LLILLL = num;
    }

    @Override // X.InterfaceC630530OoF
    public final void bh(int i, String str, String str2) {
        this.LL = str2;
        InterfaceC1398760mVG interfaceC1398760mVG = (InterfaceC1398760mVG) this.LLILZIL.getValue();
        if (interfaceC1398760mVG != null) {
            interfaceC1398760mVG.LJIILLIIL(i, str, "music_detail_cover_ring");
        }
    }
}
