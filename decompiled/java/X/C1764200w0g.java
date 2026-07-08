package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.ISeaTrackHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.video.PlayControlConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.video.VideoData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.video.VideoItemVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS488S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764200w0g extends AbstractC1764160w0c<VideoItemVO> {
    public boolean LLJJIJI;

    @Override // X.AbstractC1764160w0c
    public final boolean I5() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1764160w0c
    public final void U5() {
        C1764360w0w c1764360w0w;
        String str;
        AbstractC1764180w0e abstractC1764180w0e = this.LL;
        if (!(abstractC1764180w0e instanceof C1764360w0w) || (c1764360w0w = (C1764360w0w) abstractC1764180w0e) == null) {
            return;
        }
        C04G1 c04g1 = this.LLILLL;
        if (!(c04g1 instanceof C04G1) || c04g1 == null) {
            return;
        }
        int bindingAdapterPosition = getBindingAdapterPosition();
        ISeaTrackHelper iSeaTrackHelperS5 = S5();
        if (iSeaTrackHelperS5 != null) {
            String strB6 = b6(bindingAdapterPosition);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            VideoItemVO videoItemVO = (VideoItemVO) this.LLILZ;
            if (videoItemVO == null || (str = videoItemVO.type) == null) {
                str = "";
            }
            linkedHashMap.put("photo_type", str);
            linkedHashMap.put("is_video", "1");
            String videoId = c1764360w0w.getVideoId();
            linkedHashMap.put("video_id", videoId != null ? videoId : "");
            linkedHashMap.put("photo_show_type", "main");
            linkedHashMap.put("photo_click_type", "enter_viewer");
            iSeaTrackHelperS5.yH2(c04g1, strB6, linkedHashMap);
        }
    }

    @Override // X.AbstractC1764160w0c
    public final void onCreate() {
        C1764360w0w c1764360w0w;
        AbstractC1764180w0e abstractC1764180w0e = this.LL;
        if (!(abstractC1764180w0e instanceof C1764360w0w) || (c1764360w0w = (C1764360w0w) abstractC1764180w0e) == null) {
            return;
        }
        c1764360w0w.setVideoStateListener(new AwS488S0200000_26(this, c1764360w0w, 4));
        c1764360w0w.setAudioListener(new AwS392S0200000_26(this, c1764360w0w, 112));
    }

    @Override // X.AbstractC1764160w0c
    public final String N5() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c54417.d93546_i");
        sbLIZ.append(getBindingAdapterPosition());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String b6(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c54417.d93546_i");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1764160w0c
    public final void T5(VideoItemVO videoItemVO) {
        C1764360w0w c1764360w0w;
        VideoData videoData;
        PlayControlConfig playControlConfig;
        boolean z;
        C04CV c04cv;
        VideoItemVO videoItemVO2 = videoItemVO;
        AbstractC1764180w0e abstractC1764180w0e = this.LL;
        Integer numValueOf = null;
        if ((abstractC1764180w0e instanceof C1764360w0w) && (c1764360w0w = (C1764360w0w) abstractC1764180w0e) != null && (videoData = videoItemVO2.video) != null) {
            c1764360w0w.setVideoType(videoItemVO2.type);
            final Image image = videoData.coverImage;
            if (image != null) {
                AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 526);
                AbstractC1335900krs abstractC1335900krs = new AbstractC1335900krs() { // from class: X.0w0r
                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view, Throwable th) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                        ISeaTrackHelper iSeaTrackHelperS5 = this.LL.S5();
                        if (iSeaTrackHelperS5 != null) {
                            iSeaTrackHelperS5.ka2(this.LL.getBindingAdapterPosition(), "cover", Boolean.valueOf(this.LL.LLJJIJI), image.getUri());
                        }
                    }
                };
                SmartImageView smartImageView = c1764360w0w.LLILZLL;
                if (smartImageView != null) {
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
                    c1331670kl3LIZLLL.LJJIJL(c1764360w0w.getContext());
                    c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_CENTER;
                    c1331670kl3LIZLLL.LJIL = Bitmap.Config.ARGB_8888;
                    c1331670kl3LIZLLL.LJJI(smartImageView);
                    awS605S0100000_26.invoke(c1331670kl3LIZLLL);
                    c1331670kl3LIZLLL.LJIIJ(new C1339140kx6(abstractC1335900krs, 1));
                }
            }
            String str = videoData.aweme;
            if (str != null) {
                c1764360w0w.setVideo(str);
            }
            Image image2 = videoData.playBgImage;
            if (image2 != null) {
                c1764360w0w.setVideoBackground(image2);
            }
            VideoItemVO videoItemVO3 = (VideoItemVO) this.LLILZ;
            if (videoItemVO3 != null) {
                playControlConfig = videoItemVO3.playControlConfig;
            } else {
                playControlConfig = null;
            }
            boolean zA6 = a6(playControlConfig);
            ISeaListHelper iSeaListHelperR5 = R5();
            if (iSeaListHelperR5 != null) {
                numValueOf = Integer.valueOf(iSeaListHelperR5.sz());
            }
            int bindingAdapterPosition = getBindingAdapterPosition();
            if (numValueOf != null && numValueOf.intValue() == bindingAdapterPosition) {
                z = true;
            } else {
                z = false;
            }
            if (zA6 && !this.LLJJIJI) {
                C04G1 c04g1 = this.LLILLL;
                if ((c04g1 != null && (c04cv = c04g1.LJIJI) != null && c04cv.LIZ) || !z) {
                    return;
                }
                c1764360w0w.LJ(Boolean.TRUE);
                this.LLJJIJI = true;
            }
        }
    }

    @Override // X.AbstractC1764160w0c
    public final void W5(EnumC1764120w0Y enumC1764120w0Y) {
        C1764360w0w c1764360w0w;
        AbstractC1764180w0e abstractC1764180w0e = this.LL;
        if ((abstractC1764180w0e instanceof C1764360w0w) && (c1764360w0w = (C1764360w0w) abstractC1764180w0e) != null) {
            c1764360w0w.LJFF(false, enumC1764120w0Y);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068 A[PHI: r6
      0x0068: PHI (r6v1 int) = (r6v0 int), (r6v5 int) binds: [B:31:0x0065, B:19:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[PHI: r5 r6
      0x006c: PHI (r5v1 int) = (r5v0 int), (r5v3 int) binds: [B:34:0x0069, B:22:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r6v2 int) = (r6v1 int), (r6v4 int) binds: [B:34:0x0069, B:22:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a6(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.video.PlayControlConfig r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper r0 = r8.P5()
            if (r0 == 0) goto L18
            boolean r0 = r0.DL0()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        Le:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r7 = 0
            if (r0 != 0) goto L1a
            return r7
        L18:
            r1 = 0
            goto Le
        L1a:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper r0 = r8.P5()
            r1 = 1
            if (r0 == 0) goto L28
            boolean r0 = r0.rz2()
            if (r0 != r1) goto L28
            return r7
        L28:
            if (r9 == 0) goto L64
            java.lang.Integer r0 = r9.deviceScore
            if (r0 == 0) goto L64
            int r6 = r0.intValue()
        L32:
            java.lang.Integer r0 = r9.networkType
            if (r0 == 0) goto L68
            int r5 = r0.intValue()
        L3a:
            java.lang.Integer r0 = r9.networkLevel
            if (r0 == 0) goto L6c
            int r4 = r0.intValue()
        L42:
            X.0kYG r0 = X.C1323740kYG.LIZ
            r0.getClass()
            float r3 = X.C1323740kYG.LIZ()
            int r2 = com.bytedance.ttnet.TTNetInit.getEffectiveConnectionType()
            X.0w0e r0 = r8.LL
            android.content.Context r0 = r0.getContext()
            boolean r1 = X.C804420Vh2.LJI(r0)
            float r0 = (float) r6
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L63
            if (r1 < r5) goto L63
            if (r2 < r4) goto L63
            r7 = 1
        L63:
            return r7
        L64:
            r6 = 0
            if (r9 == 0) goto L68
            goto L32
        L68:
            r5 = 0
            if (r9 == 0) goto L6c
            goto L3a
        L6c:
            r4 = -1
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1764200w0g.a6(com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.video.PlayControlConfig):boolean");
    }

    public final void c6(boolean z) {
        C1764360w0w c1764360w0w;
        AbstractC1764180w0e abstractC1764180w0e = this.LL;
        Object objLIZ = null;
        if ((abstractC1764180w0e instanceof C1764360w0w) && (c1764360w0w = (C1764360w0w) abstractC1764180w0e) != null) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            PageStateContext pageStateContext = (PageStateContext) this.LLILZIL.getValue();
            if (pageStateContext != null) {
                objLIZ = PageStateContext.LIZ(pageStateContext, "page_show_type");
            }
            C1748720vbi.LIZLLL(this.itemView, new C04BP(), new C1764290w0p(this, bindingAdapterPosition, Intrinsics.LJFF(objLIZ, 2), c1764360w0w, z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1764160w0c
    public final void X5(int i, EnumC1764120w0Y enumC1764120w0Y) {
        C1764360w0w c1764360w0w;
        C1764360w0w c1764360w0w2;
        String str;
        ISeaTrackHelper iSeaTrackHelperS5;
        String str2;
        PlayControlConfig playControlConfig;
        C04G1 c04g1;
        C04CV c04cv;
        AbstractC1764180w0e abstractC1764180w0e = this.LL;
        if (!(abstractC1764180w0e instanceof C1764360w0w) || (c1764360w0w = (C1764360w0w) abstractC1764180w0e) == null || this.LLILLL == null) {
            return;
        }
        EnumC1764120w0Y enumC1764120w0Y2 = EnumC1764120w0Y.BLACK_PAGE;
        if (enumC1764120w0Y != enumC1764120w0Y2) {
            VideoItemVO videoItemVO = (VideoItemVO) this.LLILZ;
            if (videoItemVO != null) {
                playControlConfig = videoItemVO.playControlConfig;
            } else {
                playControlConfig = null;
            }
            if (a6(playControlConfig) && !this.LLJJIJI && ((c04g1 = this.LLILLL) == null || (c04cv = c04g1.LJIJI) == null || !c04cv.LIZ)) {
                c1764360w0w.LJ(Boolean.TRUE);
                this.LLJJIJI = true;
            }
        }
        c1764360w0w.LJFF(true, enumC1764120w0Y);
        if (enumC1764120w0Y == enumC1764120w0Y2) {
            return;
        }
        C04G1 c04g12 = this.LLILLL;
        if (!(c04g12 instanceof C04G1)) {
            c04g12 = null;
        }
        int bindingAdapterPosition = getBindingAdapterPosition();
        String str3 = "";
        if (c04g12 != null && (iSeaTrackHelperS5 = S5()) != null) {
            b6(bindingAdapterPosition);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            VideoItemVO videoItemVO2 = (VideoItemVO) this.LLILZ;
            if (videoItemVO2 == null || (str2 = videoItemVO2.type) == null) {
                str2 = "";
            }
            linkedHashMap.put("photo_type", str2);
            String videoId = c1764360w0w.getVideoId();
            if (videoId == null) {
                videoId = "";
            }
            linkedHashMap.put("video_id", videoId);
            iSeaTrackHelperS5.O10(c04g12, i, enumC1764120w0Y, linkedHashMap);
        }
        AbstractC1764180w0e abstractC1764180w0e2 = this.LL;
        if ((abstractC1764180w0e2 instanceof C1764360w0w) && (c1764360w0w2 = (C1764360w0w) abstractC1764180w0e2) != null) {
            C04G1 c04g13 = this.LLILLL;
            if ((c04g13 instanceof C04G1) && c04g13 != null) {
                int bindingAdapterPosition2 = getBindingAdapterPosition();
                ISeaTrackHelper iSeaTrackHelperS52 = S5();
                if (iSeaTrackHelperS52 != null) {
                    String strB6 = b6(bindingAdapterPosition2);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    VideoItemVO videoItemVO3 = (VideoItemVO) this.LLILZ;
                    if (videoItemVO3 == null || (str = videoItemVO3.type) == null) {
                        str = "";
                    }
                    linkedHashMap2.put("photo_type", str);
                    linkedHashMap2.put("is_video", "1");
                    String videoId2 = c1764360w0w2.getVideoId();
                    if (videoId2 != null) {
                        str3 = videoId2;
                    }
                    linkedHashMap2.put("video_id", str3);
                    linkedHashMap2.put("photo_show_type", "main");
                    iSeaTrackHelperS52.XF0(c04g13, strB6, linkedHashMap2);
                }
            }
        }
    }

    public C1764200w0g(ViewGroup viewGroup, InterfaceC665370Q7z interfaceC665370Q7z, Fragment fragment) {
        super(new C1764360w0w(viewGroup.getContext(), interfaceC665370Q7z, fragment), interfaceC665370Q7z);
    }
}
