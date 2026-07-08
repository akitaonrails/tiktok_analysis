package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderDisplayImageOpt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0I7R, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I7R extends AbstractC1762740vyK {
    public final Context LLILZ;
    public final PdpViewModel LLILZIL;
    public final Lifecycle LLILZLL;
    public List<Image> LLIZ;
    public final List<MediaItem> LLIZLLLIL;
    public final C603820NmG<String, Bitmap> LLJ;
    public HeaderDisplayImageOpt LLJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIL(int i) {
        return 1.0f;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLIZLLLIL).size();
    }

    public C0I7R(Context context, PdpViewModel pdpViewModel, LifecycleRegistry lifecycleRegistry) {
        super(C786410Ut5.ne(context));
        this.LLILZ = context;
        this.LLILZIL = pdpViewModel;
        this.LLILZLL = lifecycleRegistry;
        this.LLIZLLLIL = new ArrayList();
        this.LLJ = new C603820NmG<>(20);
    }

    @Override // X.AbstractC1762740vyK
    public final View LJJIJIL(int i, View view, ViewGroup viewGroup) {
        SmartImageView smartImageView;
        final Image image;
        int iIntValue;
        Aweme awemeLIZ;
        Video video;
        float radio;
        Image image2;
        View viewLIZ = view;
        if (viewLIZ == null) {
            C01GW c01gw = C954703oH.LIZ;
            viewLIZ = C954703oH.LIZ(viewGroup.getContext(), R.layout.ary, viewGroup, false);
        }
        View viewFindViewById = viewLIZ.findViewById(R.id.kb6);
        if ((viewFindViewById instanceof SmartImageView) && (smartImageView = (SmartImageView) viewFindViewById) != null) {
            if (this.LLJI == null && this.LLILZIL != null) {
                this.LLJI = new HeaderDisplayImageOpt(ViewModelKt.getViewModelScope(this.LLILZIL), this.LLILZIL.getProductId(), this.LLILZLL);
            }
            MediaItem mediaItem = (MediaItem) C7727030b.LIZ(i, this.LLIZLLLIL);
            if (mediaItem == null) {
                return viewLIZ;
            }
            final C013C c013c = new C013C();
            int i2 = mediaItem.type;
            if (i2 != 1) {
                if (i2 == 2) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, this.LLILZ);
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    smartImageView.setBackgroundColor(iIntValue);
                    com.ss.android.ugc.aweme.ecommerce.base.common.model.Video video2 = mediaItem.video;
                    if (video2 != null && (awemeLIZ = video2.LIZ()) != null && (video = awemeLIZ.getVideo()) != null) {
                        List<Image> list = this.LLIZ;
                        if (list != null && (image2 = (Image) C13LP.LJJJLL(list)) != null) {
                            radio = image2.getRadio();
                        } else {
                            radio = 1.0f;
                        }
                        double width = 1.0d;
                        if (video.getWidth() > 0 && video.getHeight() > 0) {
                            width = (((double) video.getWidth()) * 1.0d) / ((double) video.getHeight());
                        }
                        double d = radio;
                        if (width > d) {
                            smartImageView.setController(null);
                            return viewLIZ;
                        }
                        if (width < d) {
                            c013c.element = true;
                        }
                        UrlModel cover = video.getCover();
                        if (cover != null) {
                            image = new Image(Integer.valueOf(cover.getWidth()), Integer.valueOf(cover.getHeight()), "", cover.getUri(), cover.getUrlList(), cover.getUri(), cover.getUrlList(), null, null, null, null, null, null);
                        }
                    }
                }
                return viewLIZ;
            }
            image = mediaItem.image;
            if (image == null) {
                return viewLIZ;
            }
            smartImageView.getHierarchy().LJIJI(0);
            final int iLIZLLL = C418440Gaw.LIZLLL(smartImageView.getContext());
            InterfaceC1331800klG interfaceC1331800klG = new InterfaceC1331800klG() { // from class: X.0I7Q
                @Override // X.InterfaceC1331800klG
                public final String getKey() {
                    return "Head_Bottom_Mirror";
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Not initialized variable reg: 3, insn: 0x0074: INVOKE (r0 I:X.0klN) = (r12v1 ?? I:X.0klC), (r3 I:android.graphics.Bitmap) VIRTUAL call: X.0klC.LIZIZ(android.graphics.Bitmap):X.0klN A[MD:(android.graphics.Bitmap):X.0klN (m)] (LINE:33554548), block:B:16:0x006f */
                /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.Bitmap] */
                @Override // X.InterfaceC1331800klG
                public final InterfaceC1332090klj LIZIZ(Bitmap bitmap, C0I7N c0i7n) {
                    ?? LIZIZ;
                    int iLIZIZ;
                    try {
                        String uri = image.getUri();
                        if (uri == null) {
                            return ((C1331760klC) c0i7n).LIZIZ(bitmap);
                        }
                        Bitmap bitmapLIZJ = this.LLJ.LIZJ(uri);
                        if (bitmapLIZJ == null) {
                            Matrix matrix = new Matrix();
                            matrix.setScale(1.0f, -1.0f);
                            if (c013c.element) {
                                iLIZIZ = (int) ((C0H9H.LIZ(12) * bitmap.getHeight()) / bitmap.getWidth());
                            } else {
                                iLIZIZ = (C0H9H.LIZIZ(12) * bitmap.getWidth()) / iLIZLLL;
                            }
                            bitmapLIZJ = Bitmap.createBitmap(bitmap, 0, bitmap.getHeight() - iLIZIZ, bitmap.getWidth(), iLIZIZ, matrix, true);
                        }
                        this.LLJ.LIZLLL(uri, bitmapLIZJ);
                        return ((C1331760klC) c0i7n).LIZIZ(bitmapLIZJ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return ((C1331760klC) c0i7n).LIZIZ(LIZIZ);
                    }
                }

                @Override // X.InterfaceC1331800klG
                public final InterfaceC1332090klj LIZ(Bitmap bitmap, C0I7N c0i7n, Map map) {
                    return LIZIZ(bitmap, c0i7n);
                }
            };
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
            c1331670kl3LIZLLL.LIZLLL("CommerceHeadVH_Mirror");
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_START;
            c1331670kl3LIZLLL.LJJIJIL(interfaceC1331800klG);
            c1331670kl3LIZLLL.LJJ(smartImageView);
            C1750100vdw.LIZIZ(c1331670kl3LIZLLL, image);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            return viewLIZ;
        }
        return viewLIZ;
    }
}
