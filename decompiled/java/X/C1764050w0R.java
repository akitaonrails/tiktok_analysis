package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.image.ISeaHeadImageHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.ISeaTrackHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.image.SeaImageItemVO;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AwS104S0210000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764050w0R extends AbstractC1764160w0c<SeaImageItemVO> {
    public final String LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    @Override // X.AbstractC1764160w0c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U5() {
        /*
            r7 = this;
            X.04G1 r5 = r7.LLILLL
            if (r5 == 0) goto L7b
            int r1 = r7.getBindingAdapterPosition()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.ISeaTrackHelper r4 = r7.S5()
            if (r4 == 0) goto L7b
            VO r0 = r7.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.image.SeaImageItemVO r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.image.SeaImageItemVO) r0
            java.lang.String r6 = ""
            if (r0 == 0) goto L1a
            java.lang.String r0 = r0.type
            if (r0 != 0) goto L1b
        L1a:
            r0 = r6
        L1b:
            java.lang.String r3 = b6(r1, r0)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            VO r0 = r7.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.image.SeaImageItemVO r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.image.SeaImageItemVO) r0
            if (r0 == 0) goto L2e
            java.lang.String r1 = r0.type
            if (r1 != 0) goto L2f
        L2e:
            r1 = r6
        L2f:
            java.lang.String r0 = "photo_type"
            r2.put(r0, r1)
            VO r0 = r7.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.image.SeaImageItemVO r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.image.SeaImageItemVO) r0
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.image
            if (r0 == 0) goto L45
            java.lang.String r0 = r0.getUri()
            if (r0 == 0) goto L45
            r6 = r0
        L45:
            java.lang.String r0 = "photo_id"
            r2.put(r0, r6)
            java.lang.String r1 = "photo_show_type"
            java.lang.String r0 = "main"
            r2.put(r1, r0)
            java.lang.String r1 = "photo_click_type"
            java.lang.String r0 = "enter_viewer"
            r2.put(r1, r0)
            VO r0 = r7.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.image.SeaImageItemVO r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.image.SeaImageItemVO) r0
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.image
            if (r0 == 0) goto L7c
            java.lang.Integer r0 = r0.getSourceType()
            if (r0 == 0) goto L7c
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L7c
        L6f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "is_algo_cut"
            r2.put(r0, r1)
            r4.yH2(r5, r3, r2)
        L7b:
            return
        L7c:
            r1 = 0
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1764050w0R.U5():void");
    }

    @Override // X.AbstractC1764160w0c
    public final void V5() {
        Integer numLIZJ;
        View view = (View) this.LL.getContentView();
        if (view == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view.getContext())) == null) {
            return;
        }
        view.setBackgroundColor(numLIZJ.intValue());
    }

    public final ISeaHeadImageHelper a6() {
        return (ISeaHeadImageHelper) this.LLJJIJIIJIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1764160w0c
    public final String N5() {
        String str;
        int bindingAdapterPosition = getBindingAdapterPosition();
        SeaImageItemVO seaImageItemVO = (SeaImageItemVO) this.LLILZ;
        if (seaImageItemVO == null || (str = seaImageItemVO.type) == null) {
            str = "";
        }
        return b6(bindingAdapterPosition, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.ss.android.ugc.aweme.ecommerce.service.vo.Image] */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, com.ss.android.ugc.aweme.ecommerce.service.vo.Image] */
    /* JADX WARN: Type inference failed for: r20v1, types: [X.0w0S] */
    @Override // X.AbstractC1764160w0c
    public final void T5(SeaImageItemVO seaImageItemVO) {
        C1763050vyp c1763050vypRZ1;
        boolean z;
        Boolean boolValueOf;
        boolean z2;
        ISeaHeadContainerHelper iSeaHeadContainerHelperP5;
        PdpPreviewInfo pdpPreviewInfoBI1;
        Set<String> set;
        Set<String> set2;
        ISeaListHelper iSeaListHelperR5;
        final SeaImageItemVO seaImageItemVO2 = seaImageItemVO;
        final SmartImageView smartImageView = (SmartImageView) this.LL.getContentView();
        if (smartImageView != null) {
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = seaImageItemVO2.image;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, smartImageView.getContext());
            if (numLIZJ != null) {
                smartImageView.setBackgroundColor(numLIZJ.intValue());
            }
            if (c259800zU.element != 0) {
                final int bindingAdapterPosition = getBindingAdapterPosition();
                ISeaHeadImageHelper iSeaHeadImageHelperA6 = a6();
                String str = null;
                if (iSeaHeadImageHelperA6 != null) {
                    c1763050vypRZ1 = iSeaHeadImageHelperA6.rZ1();
                } else {
                    c1763050vypRZ1 = null;
                }
                Image image = (Image) c259800zU.element;
                c259800zU.element = image.copy(image.width, image.height, image.mimetype, image.uri, image.urls, image.thumbUri, image.thumbUrls, image.removeGap, image.localImageScene, image.localThumbImageScene, image.sourceType, image.viewHeight, image.viewWidth);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int iVh2 = 0;
                if (c1763050vypRZ1 != null && !c1763050vypRZ1.LIZIZ) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = "1";
                if (!z && (iSeaListHelperR5 = R5()) != null && bindingAdapterPosition == iSeaListHelperR5.sz()) {
                    if (c1763050vypRZ1 != null) {
                        c1763050vypRZ1.LIZIZ = false;
                    }
                    linkedHashMap.put("biz_is_first", "1");
                }
                if (c1763050vypRZ1 != null && (set2 = c1763050vypRZ1.LIZ) != null) {
                    boolValueOf = Boolean.valueOf(C13LP.LJJJJ(((Image) c259800zU.element).getUri(), set2));
                } else {
                    boolValueOf = null;
                }
                if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("biz_is_repeat_load", str2);
                C1334210kp9.LJ((Image) c259800zU.element, linkedHashMap);
                String uri = ((Image) c259800zU.element).getUri();
                if (uri != null && c1763050vypRZ1 != null && (set = c1763050vypRZ1.LIZ) != null) {
                    set.add(uri);
                }
                final C1066100dqi c1066100dqi = new C1066100dqi();
                c1066100dqi.LIZJ = this.LLJJIJI;
                c1066100dqi.LIZ(bindingAdapterPosition);
                c1066100dqi.LIZIZ((Image) c259800zU.element);
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                T t = c259800zU.element;
                c1326790kdB.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(t);
                c1331670kl3LIZLLL.LIZLLL("CommerceHeadVH");
                C1320310kSj c1320310kSj = InterfaceC1320380kSq.LIZJ;
                c1331670kl3LIZLLL.LJJ = C1326790kdB.LJI(c1320310kSj);
                c1331670kl3LIZLLL.LJJ(smartImageView);
                C1750100vdw.LIZIZ(c1331670kl3LIZLLL, (Image) c259800zU.element);
                ISeaListHelper iSeaListHelperR52 = R5();
                if (iSeaListHelperR52 != null && bindingAdapterPosition == iSeaListHelperR52.sz()) {
                    z2 = true;
                    ISeaHeadImageHelper iSeaHeadImageHelperA62 = a6();
                    if (iSeaHeadImageHelperA62 != null) {
                        iSeaHeadImageHelperA62.dW((Image) c259800zU.element);
                    }
                } else {
                    z2 = false;
                }
                ISeaHeadImageHelper iSeaHeadImageHelperA63 = a6();
                if (iSeaHeadImageHelperA63 != null) {
                    iSeaHeadImageHelperA63.Qe(((Image) c259800zU.element).getUri());
                }
                ISeaListHelper iSeaListHelperR53 = R5();
                if (iSeaListHelperR53 != null) {
                    iVh2 = iSeaListHelperR53.vh2();
                }
                if (bindingAdapterPosition == iVh2 && (iSeaHeadContainerHelperP5 = P5()) != null && (pdpPreviewInfoBI1 = iSeaHeadContainerHelperP5.BI1()) != null) {
                    str = pdpPreviewInfoBI1.cover;
                }
                C123100dR.LIZ(str);
                ISeaHeadImageHelper iSeaHeadImageHelperA64 = a6();
                if (iSeaHeadImageHelperA64 != 0) {
                    final boolean z3 = z2;
                    iSeaHeadImageHelperA64.P00(smartImageView, (Image) c259800zU.element, bindingAdapterPosition, str, c1320310kSj, new AwS104S0210000_26(this, (C1764050w0R) c259800zU, (C259800zU<Image>) z2, false), c1331670kl3LIZLLL, new InterfaceC427850Gq7() { // from class: X.0w0S
                        @Override // X.InterfaceC427850Gq7
                        public final void A3(Uri uri2, C428600GrK c428600GrK) {
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void Bh(Uri uri2, View view) {
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void e1(Uri uri2) {
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void lg(Uri uri2, Throwable th) {
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void cm(Uri uri2, View view, Throwable th) {
                            ISeaHeadImageHelper iSeaHeadImageHelperA65;
                            c1066100dqi.LJ(th);
                            if (z3 && (iSeaHeadImageHelperA65 = this.LL.a6()) != null) {
                                iSeaHeadImageHelperA65.mY0(c259800zU.element, false, false);
                            }
                            SmartImageView smartImageView2 = smartImageView;
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                            c419910GdJ.LIZ = R.raw.icon_image_slash_fill;
                            c419910GdJ.LJ = Integer.valueOf(R.attr.a02);
                            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(smartImageView.getContext());
                            SmartImageView smartImageView3 = smartImageView;
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LJII = smartImageView3.getWidth();
                            c384050F3z.LJI = smartImageView3.getHeight();
                            c384050F3z.LIZ = 0;
                            smartImageView2.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(smartImageView.getContext())));
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.InterfaceC427850Gq7
                        public final void Ad(Uri uri2, View view, C428600GrK c428600GrK, Animatable animatable) {
                            ISeaListHelper iSeaListHelperR54;
                            ISeaListHelper iSeaListHelperR55;
                            String str3;
                            String uri3;
                            Image image2;
                            C04CV c04cv;
                            C04CV c04cv2;
                            ISeaHeadImageHelper iSeaHeadImageHelperA65;
                            Integer numLIZ;
                            ISeaHeadImageHelper iSeaHeadImageHelperA66 = this.LL.a6();
                            if (iSeaHeadImageHelperA66 != null) {
                                iSeaHeadImageHelperA66.Np(c259800zU.element.getUri());
                            }
                            c1066100dqi.LIZLLL(c428600GrK);
                            C1764050w0R c1764050w0R = this.LL;
                            SmartImageView smartImageView2 = smartImageView;
                            CustomColor customColor = seaImageItemVO2.loadSuccessBgColor;
                            c1764050w0R.getClass();
                            if (smartImageView2 != null && customColor != null && (numLIZ = C038L.LIZ(customColor, smartImageView2.getContext(), null)) != null) {
                                smartImageView2.setBackgroundColor(numLIZ.intValue());
                            }
                            if (z3 && (iSeaHeadImageHelperA65 = this.LL.a6()) != null) {
                                iSeaHeadImageHelperA65.mY0(c259800zU.element, true, false);
                            }
                            C1764050w0R c1764050w0R2 = this.LL;
                            C04G1 c04g1 = c1764050w0R2.LLILLL;
                            if ((c04g1 == null || (c04cv2 = c04g1.LJIJI) == null || !c04cv2.LIZIZ) && (iSeaListHelperR54 = c1764050w0R2.R5()) != null && bindingAdapterPosition == iSeaListHelperR54.vh2() && (iSeaListHelperR55 = this.LL.R5()) != null) {
                                iSeaListHelperR55.hK2();
                            }
                            ISeaTrackHelper iSeaTrackHelperS5 = this.LL.S5();
                            if (iSeaTrackHelperS5 != null) {
                                C1764050w0R c1764050w0R3 = this.LL;
                                C04G1 c04g12 = c1764050w0R3.LLILLL;
                                if (c04g12 != null && (c04cv = c04g12.LJIJI) != null && c04cv.LIZIZ) {
                                    str3 = "preview";
                                } else {
                                    str3 = "image";
                                }
                                int bindingAdapterPosition2 = c1764050w0R3.getBindingAdapterPosition();
                                SeaImageItemVO seaImageItemVO3 = (SeaImageItemVO) this.LL.LLILZ;
                                if (seaImageItemVO3 != null && (image2 = seaImageItemVO3.image) != null) {
                                    uri3 = image2.getUri();
                                } else {
                                    uri3 = null;
                                }
                                iSeaTrackHelperS5.ka2(bindingAdapterPosition2, str3, null, uri3);
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1764050w0R(ViewGroup viewGroup, final InterfaceC665370Q7z interfaceC665370Q7z) {
        final Context context = viewGroup.getContext();
        super(new AbstractC1764180w0e(context, interfaceC665370Q7z) { // from class: X.0w0T
            @Override // X.AbstractC1764180w0e
            public final View LIZ(Context context2) {
                SmartImageView smartImageView = new SmartImageView(context2);
                smartImageView.setScaleType(ImageView.ScaleType.CENTER);
                C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(-1, -1));
                return smartImageView;
            }
        }, interfaceC665370Q7z);
        this.LLJJIJI = "pdp_head";
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(interfaceC665370Q7z, 1243));
    }

    public static String b6(int i, String str) {
        if (Intrinsics.LJFF(str, "spu_image")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("c54417.d11256_i");
            sbLIZ.append(i);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (Intrinsics.LJFF(str, "size_guide")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("c54417.d8413_i");
            sbLIZ2.append(i);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    @Override // X.AbstractC1764160w0c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X5(int r10, X.EnumC1764120w0Y r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1764050w0R.X5(int, X.0w0Y):void");
    }
}
