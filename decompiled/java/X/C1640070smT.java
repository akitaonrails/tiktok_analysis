package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.0smT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640070smT extends AbstractC1640400sn0<SocialAvatarStickerStruct> {
    public final InterfaceC1640330smt<SocialAvatarStickerStruct> LJJIJIL;

    @Override // X.AbstractC1640400sn0
    public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup, int i, final AwS674S0100000_25 awS674S0100000_25) {
        Pair<FrameLayout, C1662850tND> pairLJII = C1640600snK.LJII(viewGroup.getContext());
        final FrameLayout first = pairLJII.getFirst();
        final C1662850tND second = pairLJII.getSecond();
        return new AbstractC1637470siH<SocialAvatarStickerStruct>(first, second, awS674S0100000_25) { // from class: X.0siI
            @Override // X.AbstractC1637470siH
            public final void V2(SocialAvatarStickerStruct socialAvatarStickerStruct) {
                C1324630kZh c1324630kZh;
                C1324800kZy imageView = this.LL.getImageView();
                imageView.setEnableAnimation(false);
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(socialAvatarStickerStruct.getMidResolutionUrl());
                int width = imageView.getWidth();
                int height = imageView.getHeight();
                if (urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
                    if (width > 0 && height > 0) {
                        c1324630kZh = new C1324630kZh(width, height);
                    } else {
                        c1324630kZh = null;
                    }
                    if (imageView.getContext() != null) {
                        C786410Ut5.N3(imageView.getContext());
                    }
                    C1325710kbR[] c1325710kbRArrLJIILLIIL = C1324750kZt.LJIILLIIL(urlModel, c1324630kZh, EnumC1331380kka.MEDIUM, Bitmap.Config.ARGB_8888);
                    if (c1325710kbRArrLJIILLIIL != null && c1325710kbRArrLJIILLIIL.length != 0) {
                        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                        c1320810kTXLIZJ.LJIILJJIL = imageView.getController();
                        c1320810kTXLIZJ.LJFF(c1325710kbRArrLJIILLIIL, true);
                        c1320810kTXLIZJ.LJIIIIZZ = imageView.LLJILJILJ;
                        c1320810kTXLIZJ.LJIIJJI = false;
                        imageView.setController(c1320810kTXLIZJ.LIZ());
                    }
                }
            }
        };
    }

    @Override // X.AbstractC1640400sn0
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, int i, SocialAvatarStickerStruct socialAvatarStickerStruct, EnumC1641420soe enumC1641420soe, Integer num) {
        AbstractC1637470siH abstractC1637470siH;
        if ((viewHolder instanceof C1637480siI) && (abstractC1637470siH = (AbstractC1637470siH) viewHolder) != null) {
            abstractC1637470siH.I5(i, enumC1641420soe, num, socialAvatarStickerStruct);
        }
    }

    public C1640070smT(Context context, LifecycleOwner lifecycleOwner, InterfaceC1640330smt interfaceC1640330smt, InterfaceC1640420sn2 interfaceC1640420sn2, ViewGroup viewGroup, boolean z, Function1 function1) {
        super(context, lifecycleOwner, interfaceC1640330smt, interfaceC1640420sn2, viewGroup, 4, false, false, true, z, function1);
        this.LJJIJIL = interfaceC1640330smt;
    }
}
