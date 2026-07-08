package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sjT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638210sjT extends AbstractC1637470siH<ProviderEffect> {
    @Override // X.AbstractC1637470siH
    public final void V2(ProviderEffect providerEffect) {
        String url;
        C1325710kbR[] c1325710kbRArrLIZIZ;
        C1325710kbR[] c1325710kbRArrLIZIZ2;
        String extra;
        List listLJJLIIIJILLIZJL;
        final ProviderEffect providerEffect2 = providerEffect;
        if (C1635160seY.LJ(providerEffect2) && (extra = providerEffect2.getExtra()) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(extra, new String[]{","}, 0, 6)) != null && listLJJLIIIJILLIZJL.contains("emoji")) {
            float f = C1640600snK.LIZIZ / C1640600snK.LIZ;
            C1662850tND c1662850tND = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662850tND);
            c1662850tND.setScaleX(f);
            C1662850tND c1662850tND2 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662850tND2);
            c1662850tND2.setScaleY(f);
        } else {
            C1662850tND c1662850tND3 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662850tND3);
            c1662850tND3.setScaleX(1.0f);
            C1662850tND c1662850tND4 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662850tND4);
            c1662850tND4.setScaleY(1.0f);
        }
        ProviderEffect.StickerBean sticker_info = providerEffect2.getSticker_info();
        if (sticker_info != null && (url = sticker_info.getUrl()) != null && url.length() > 0 && 1 != 0) {
            this.LL.getImageView().getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LIZJ);
            if (!((Boolean) C268550Afl.LIZ.getValue()).booleanValue()) {
                C1324800kZy imageView = this.LL.getImageView();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                AbstractC1636120sg6 abstractC1636120sg6 = new AbstractC1636120sg6(providerEffect2) { // from class: X.0sjU
                    public final ProviderEffect LIZIZ;

                    @Override // X.AbstractC1636120sg6
                    public final String LJIILIIL() {
                        return "giphy";
                    }

                    @Override // X.AbstractC1636120sg6
                    public final String LJIIJJI() {
                        String url2;
                        ProviderEffect.StickerBean sticker_info2 = this.LIZIZ.getSticker_info();
                        return (sticker_info2 == null || (url2 = sticker_info2.getUrl()) == null) ? "" : url2;
                    }

                    @Override // X.AbstractC1636120sg6
                    public final String LJIIL() {
                        return this.LIZIZ.getId();
                    }

                    {
                        this.LIZIZ = providerEffect2;
                    }
                };
                if (imageView != null) {
                    if (!TextUtils.isEmpty(url) && (c1325710kbRArrLIZIZ2 = C1324780kZw.LIZIZ(config, url)) != null) {
                        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                        c1320810kTXLIZJ.LJIILJJIL = imageView.getController();
                        c1320810kTXLIZJ.LJIIL = true;
                        c1320810kTXLIZJ.LJIILIIL = true;
                        c1320810kTXLIZJ.LJIIJJI = true;
                        c1320810kTXLIZJ.LIZJ = null;
                        c1320810kTXLIZJ.LJFF(c1325710kbRArrLIZIZ2, true);
                        c1320810kTXLIZJ.LJIIIIZZ = abstractC1636120sg6;
                        imageView.setController(c1320810kTXLIZJ.LIZ());
                    } else {
                        C1324750kZt.LIZIZ(imageView, R.drawable.dhr);
                    }
                }
            } else {
                C1324800kZy imageView2 = this.LL.getImageView();
                Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                AbstractC1636120sg6 abstractC1636120sg62 = new AbstractC1636120sg6(providerEffect2) { // from class: X.0sjU
                    public final ProviderEffect LIZIZ;

                    @Override // X.AbstractC1636120sg6
                    public final String LJIILIIL() {
                        return "giphy";
                    }

                    @Override // X.AbstractC1636120sg6
                    public final String LJIIJJI() {
                        String url2;
                        ProviderEffect.StickerBean sticker_info2 = this.LIZIZ.getSticker_info();
                        return (sticker_info2 == null || (url2 = sticker_info2.getUrl()) == null) ? "" : url2;
                    }

                    @Override // X.AbstractC1636120sg6
                    public final String LJIIL() {
                        return this.LIZIZ.getId();
                    }

                    {
                        this.LIZIZ = providerEffect2;
                    }
                };
                if (imageView2 != null) {
                    if (!TextUtils.isEmpty(url)) {
                        c1325710kbRArrLIZIZ = C1324780kZw.LIZIZ(config2, url);
                    } else {
                        c1325710kbRArrLIZIZ = null;
                    }
                    C1324780kZw.LIZ(imageView2, c1325710kbRArrLIZIZ, abstractC1636120sg62, true, null);
                }
            }
        }
        this.itemView.setContentDescription(providerEffect2.getTitle());
    }

    public C1638210sjT(View view, C1662850tND c1662850tND, AwS674S0100000_25 awS674S0100000_25) {
        super(view, c1662850tND, awS674S0100000_25);
    }
}
