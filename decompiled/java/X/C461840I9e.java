package X;

import Y.ACListenerS45S0400000_6;
import Y.AObserverS210S0100000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.SocialAvatarStickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.socialavatar.SocialAvatarSettingsConfig;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0I9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461840I9e extends C1362650lZ1 {
    public final C2252331DDr LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;

    @Override // X.C1362650lZ1
    public final void LJ() {
    }

    @Override // X.C1362650lZ1
    public final void LJIIIZ() {
    }

    private final C197039127h getInviteBtn() {
        return (C197039127h) this.LLJLILLLLZIIL.getValue();
    }

    public final C1087110eOb getHeaderGroup() {
        return (C1087110eOb) this.LLJLL.getValue();
    }

    public final RecyclerView getRecyclerView() {
        return (RecyclerView) this.LLJLLIL.getValue();
    }

    @Override // X.C1362650lZ1
    public final void LIZIZ() {
        super.LIZIZ();
        Fragment hostFragment = getHostFragment();
        if (hostFragment != null) {
            getViewModel().LLJJIJI.observe(hostFragment, new AObserverS210S0100000_6(this, 29));
        }
    }

    public C461840I9e(C1361400lX0 c1361400lX0) {
        super(c1361400lX0);
        this.LLJLIL = C09IR.LIZIZ(1, 0, null, 6);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1309));
        this.LLJLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1308));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1307));
    }

    @Override // X.C1362650lZ1
    public final void LJI(Context context) {
        C786410Ut5.LJLLJ(context, R.layout.cry, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1362650lZ1
    public final void LJIIJ(SharePackage sharePackage, List list, Fragment fragment, EnumC1369720lkQ enumC1369720lkQ, InterfaceC1362900lZQ interfaceC1362900lZQ, InterfaceC1362720lZ8 interfaceC1362720lZ8, String str) {
        View viewFindViewById;
        List<StickerItem> list2;
        UrlModel urlModelLJIIIIZZ;
        StickerImage stickerImage;
        String str2;
        String str3;
        super.LJIIJ(sharePackage, list, fragment, enumC1369720lkQ, interfaceC1362900lZQ, interfaceC1362720lZ8, str);
        View viewFindViewById2 = findViewById(R.id.vo2);
        View viewFindViewById3 = findViewById(R.id.vo1);
        View viewFindViewById4 = findViewById(R.id.vo3);
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        SocialAvatarSettingsConfig socialAvatarSettingsConfigLJJJ = c454640HsE.LIZIZ().getImSocialAvatarService().LJJJ();
        String str4 = socialAvatarSettingsConfigLJJJ.shareCenterExpression;
        if (str4 == null) {
            str4 = "hi";
        }
        String str5 = socialAvatarSettingsConfigLJJJ.shareLeftExpression;
        if (str5 == null) {
            str5 = "lol";
        }
        String str6 = socialAvatarSettingsConfigLJJJ.shareRightExpression;
        if (str6 == null) {
            str6 = "shocked";
        }
        int i = 0;
        String[] strArr = {str4, str5, str6};
        SmartImageView[] smartImageViewArr = {viewFindViewById2, viewFindViewById3, viewFindViewById4};
        TuxTextView tuxTextView = null;
        C0HWY c0hwyLIZ = c454640HsE.LIZIZ().getImSocialAvatarService().LJIILJJIL(null, null).LIZ();
        if (c0hwyLIZ != null && (list2 = c0hwyLIZ.LIZIZ) != null) {
            ArrayList arrayList = new ArrayList();
            for (StickerItem stickerItem : list2) {
                SocialAvatarStickerItem socialAvatarStickerItem = stickerItem.socialAvatarInfo;
                if (socialAvatarStickerItem != null && (str3 = socialAvatarStickerItem.expression) != null && C703302op.LIZ(str3)) {
                    arrayList.add(stickerItem);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            do {
                String str7 = strArr[i2];
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    SocialAvatarStickerItem socialAvatarStickerItem2 = ((StickerItem) next).socialAvatarInfo;
                    if (socialAvatarStickerItem2 != null && (str2 = socialAvatarStickerItem2.expression) != null && a0.LJJIIZI(str2, str7, false)) {
                        if (next != null) {
                            arrayList2.add(next);
                        }
                    }
                }
                i2++;
            } while (i2 < 3);
            int size = 3 - arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (!arrayList2.contains(next2)) {
                            if (next2 != null) {
                                arrayList2.add(next2);
                            }
                        }
                    }
                }
            }
            for (Object obj : arrayList2) {
                int i4 = i + 1;
                if (i >= 0) {
                    StickerBase stickerBase = ((StickerItem) obj).stickerBase;
                    if (stickerBase != null && (stickerImage = stickerBase.image) != null) {
                        urlModelLJIIIIZZ = C453560HqU.LJIIIIZZ(stickerImage);
                    } else {
                        urlModelLJIIIIZZ = null;
                    }
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModelLJIIIIZZ));
                    c1331670kl3LJIIIIZZ.LJJJJLL = true;
                    c1331670kl3LJIIIIZZ.LJJJJZ = true;
                    c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                    c1331670kl3LJIIIIZZ.LJJ(smartImageViewArr[i]);
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    i = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        View view = fragment.getView();
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.ltz);
        } else {
            viewFindViewById = null;
        }
        View view2 = fragment.getView();
        if (view2 != null && (tuxTextView = (TuxTextView) view2.findViewById(R.id.tv_title)) != null) {
            tuxTextView.setText("");
        }
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        C786410Ut5.U8(getInviteBtn(), new ACListenerS45S0400000_6(viewFindViewById, tuxTextView, this, fragment, 1));
    }
}
